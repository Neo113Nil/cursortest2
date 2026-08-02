package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import coil3.Extras;
import com.google.android.gms.auth.blockstore.restorecredential.internal.RestoreCredentialClientImpl;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.wallet.internal.WalletClientImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes.dex */
public abstract class BaseGmsClient {
    public static final Feature[] zze = new Feature[0];
    public volatile String zzA;
    public volatile Extras.Key zzB;
    public MarkdownElementType zza;
    public final zzb zzb;
    public ConnectionProgressReportCallbacks zzc;
    public int zzf;
    public long zzg;
    public long zzh;
    public int zzi;
    public long zzj;
    public final Context zzl;
    public final zzq zzn;
    public final GoogleApiAvailabilityLight zzo;
    public zzaa zzr;
    public IInterface zzs;
    public zze zzu;
    public final BaseConnectionCallbacks zzw;
    public final BaseOnConnectionFailedListener zzx;
    public final int zzy;
    public final String zzz;
    public volatile String zzk = null;
    public final Object zzp = new Object();
    public final Object zzq = new Object();
    public final ArrayList zzt = new ArrayList();
    public int zzv = 1;
    public ConnectionResult zzC = null;
    public boolean zzD = false;
    public volatile zzj zzE = null;
    public final AtomicInteger zzd = new AtomicInteger(0);

    public interface BaseConnectionCallbacks {
        void onConnected();

        void onConnectionSuspended(int i);
    }

    public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* loaded from: classes4.dex */
    public interface ConnectionProgressReportCallbacks {
        void onReportServiceBinding(ConnectionResult connectionResult);
    }

    /* loaded from: classes4.dex */
    public final class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        public final /* synthetic */ BaseGmsClient zza;

        public LegacyClientCallbackAdapter(BaseGmsClient baseGmsClient) {
            Objects.requireNonNull(baseGmsClient);
            this.zza = baseGmsClient;
        }

        @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
        public final void onReportServiceBinding(ConnectionResult connectionResult) {
            boolean isSuccess = connectionResult.isSuccess();
            BaseGmsClient baseGmsClient = this.zza;
            if (isSuccess) {
                baseGmsClient.getRemoteService(null, baseGmsClient.getScopes());
                return;
            }
            BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.zzx;
            if (baseOnConnectionFailedListener != null) {
                baseOnConnectionFailedListener.onConnectionFailed(connectionResult);
            }
        }
    }

    public BaseGmsClient(Context context, Looper looper, zzq zzqVar, GoogleApiAvailabilityLight googleApiAvailabilityLight, int i, BaseConnectionCallbacks baseConnectionCallbacks, BaseOnConnectionFailedListener baseOnConnectionFailedListener, String str) {
        zzae.checkNotNull(context, "Context must not be null");
        this.zzl = context;
        zzae.checkNotNull(looper, "Looper must not be null");
        zzae.checkNotNull(zzqVar, "Supervisor must not be null");
        this.zzn = zzqVar;
        zzae.checkNotNull(googleApiAvailabilityLight, "API availability must not be null");
        this.zzo = googleApiAvailabilityLight;
        this.zzb = new zzb(this, looper);
        this.zzy = i;
        this.zzw = baseConnectionCallbacks;
        this.zzx = baseOnConnectionFailedListener;
        this.zzz = str;
    }

    public final void checkAvailabilityAndConnect() {
        int isGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (isGooglePlayServicesAvailable == 0) {
            connect(new LegacyClientCallbackAdapter(this));
            return;
        }
        zzp(1, null);
        this.zzc = new LegacyClientCallbackAdapter(this);
        int i = this.zzd.get();
        zzb zzbVar = this.zzb;
        zzbVar.sendMessage(zzbVar.obtainMessage(3, i, isGooglePlayServicesAvailable, null));
    }

    public final void connect(ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        zzae.checkNotNull(connectionProgressReportCallbacks, "Connection progress callbacks cannot be null.");
        this.zzc = connectionProgressReportCallbacks;
        zzp(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public final void disconnect() {
        this.zzd.incrementAndGet();
        ArrayList arrayList = this.zzt;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((zza) arrayList.get(i)).zzf();
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        zzp(1, null);
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzE;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.zzb;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public abstract int getMinApkVersion();

    public final void getRemoteService(IAccountAccessor iAccountAccessor, Set set) {
        String attributionTag;
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        if (Build.VERSION.SDK_INT < 31) {
            attributionTag = this.zzA;
        } else if (this.zzB == null) {
            attributionTag = this.zzA;
        } else {
            AttributionSource attributionSource = (AttributionSource) this.zzB.f61default;
            attributionTag = attributionSource == null ? this.zzA : attributionSource.getAttributionTag() == null ? this.zzA : attributionSource.getAttributionTag();
        }
        String str = attributionTag;
        int i = this.zzy;
        int i2 = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.zzf = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.zzh = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.zzj = account;
            if (iAccountAccessor != null) {
                getServiceRequest.zzg = iAccountAccessor.asBinder();
            }
        } else if (this instanceof WalletClientImpl) {
            getServiceRequest.zzj = null;
        }
        getServiceRequest.zzk = zze;
        getServiceRequest.zzl = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.zzo = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    try {
                        zzaa zzaaVar = this.zzr;
                        if (zzaaVar != null) {
                            zzaaVar.getService(new zzd(this, this.zzd.get()), getServiceRequest);
                        } else {
                            Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException e) {
                Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
                int i3 = this.zzd.get();
                zzf zzfVar = new zzf(this, 8, null, null);
                zzb zzbVar = this.zzb;
                zzbVar.sendMessage(zzbVar.obtainMessage(1, i3, -1, zzfVar));
            }
        } catch (DeadObjectException e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            int i4 = this.zzd.get();
            zzb zzbVar2 = this.zzb;
            zzbVar2.sendMessage(zzbVar2.obtainMessage(6, i4, 3));
        } catch (SecurityException e3) {
            throw e3;
        }
    }

    public Set getScopes() {
        return Collections.EMPTY_SET;
    }

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.zzs;
                zzae.checkNotNull(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            z = this.zzv == 4;
        }
        return z;
    }

    public final boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            int i = this.zzv;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public boolean requiresSignIn() {
        return false;
    }

    public boolean usesClientTelemetry() {
        return this instanceof RestoreCredentialClientImpl;
    }

    public final /* synthetic */ boolean zze(int i, int i2, IInterface iInterface) {
        synchronized (this.zzp) {
            try {
                if (this.zzv != i) {
                    return false;
                }
                zzp(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzp(int i, IInterface iInterface) {
        MarkdownElementType markdownElementType;
        zzae.checkArgument((i == 4) == (iInterface != null));
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    zze zzeVar = this.zzu;
                    if (zzeVar != null) {
                        zzq zzqVar = this.zzn;
                        String zza = this.zza.zza();
                        zzae.checkNotNull(zza);
                        this.zza.getClass();
                        if (this.zzz == null) {
                            this.zzl.getClass();
                        }
                        zzqVar.zzc(new zzn(zza, "com.google.android.gms", this.zza.zzc()), zzeVar);
                        this.zzu = null;
                    }
                } else if (i == 2 || i == 3) {
                    zze zzeVar2 = this.zzu;
                    if (zzeVar2 != null && (markdownElementType = this.zza) != null) {
                        String zza2 = markdownElementType.zza();
                        StringBuilder sb = new StringBuilder(String.valueOf(zza2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(zza2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        zzq zzqVar2 = this.zzn;
                        String zza3 = this.zza.zza();
                        zzae.checkNotNull(zza3);
                        this.zza.getClass();
                        if (this.zzz == null) {
                            this.zzl.getClass();
                        }
                        boolean zzc = this.zza.zzc();
                        zzqVar2.getClass();
                        zzqVar2.zzc(new zzn(zza3, "com.google.android.gms", zzc), zzeVar2);
                        this.zzd.incrementAndGet();
                    }
                    zze zzeVar3 = new zze(this, this.zzd.get());
                    this.zzu = zzeVar3;
                    MarkdownElementType markdownElementType2 = new MarkdownElementType(getStartServiceAction(), getUseDynamicLookup(), 3);
                    this.zza = markdownElementType2;
                    if (markdownElementType2.zzc() && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.zza())));
                    }
                    zzq zzqVar3 = this.zzn;
                    String zza4 = this.zza.zza();
                    zzae.checkNotNull(zza4);
                    this.zza.getClass();
                    String str = this.zzz;
                    if (str == null) {
                        str = this.zzl.getClass().getName();
                    }
                    ConnectionResult zza5 = zzqVar3.zza(new zzn(zza4, "com.google.android.gms", this.zza.zzc()), zzeVar3, str, getBindServiceExecutor());
                    if (!zza5.isSuccess()) {
                        String zza6 = this.zza.zza();
                        this.zza.getClass();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(zza6).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(zza6);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = zza5.zzb;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (zza5.zzc != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", zza5.zzc);
                        }
                        int i3 = this.zzd.get();
                        zzg zzgVar = new zzg(this, i2, bundle);
                        zzb zzbVar = this.zzb;
                        zzbVar.sendMessage(zzbVar.obtainMessage(7, i3, -1, zzgVar));
                    }
                } else if (i == 4) {
                    zzae.checkNotNull(iInterface);
                    IInterface iInterface2 = iInterface;
                    this.zzh = System.currentTimeMillis();
                }
            } finally {
            }
        }
    }

    public final void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
