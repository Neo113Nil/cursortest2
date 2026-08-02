package com.google.android.gms.tasks;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import coil3.network.NetworkFetcher$fetch$2;
import com.android.volley.ExecutorDelivery$1;
import com.android.volley.Request;
import com.android.volley.Response;
import com.bugsnag.android.Client;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.UriLoader;
import com.caverock.androidsvg.SVG;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.DeviceType;
import com.datadog.android.core.internal.persistence.Deserializer;
import com.datadog.android.core.internal.system.AndroidInfoProvider;
import com.datadog.android.core.sampling.RateBasedSampler$1;
import com.datadog.android.core.sampling.Sampler;
import com.datadog.android.okhttp.trace.DeterministicTraceSampler$2;
import com.datadog.android.rum.internal.domain.event.RumEventMapper$mapRumEvent$1;
import com.datadog.android.trace.TraceConfiguration;
import com.datadog.trace.api.Config;
import com.datadog.trace.bootstrap.config.provider.ConfigProvider;
import com.fillr.browsersdk.Fillr;
import com.fillr.browsersdk.utilities.FillrCookieManager$CookieCompare;
import com.fillr.m1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.api.internal.zabu;
import com.google.android.gms.common.api.internal.zax;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.zzf;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.internal.location.zzdh;
import com.google.android.gms.internal.location.zzdz;
import com.google.android.gms.internal.mlkit_vision_common.zzhx;
import com.google.android.gms.internal.p000authapi.zban;
import com.google.android.gms.internal.p000authapi.zbaq;
import com.google.android.gms.internal.p000authapi.zbar;
import com.google.android.gms.internal.p000authapi.zbc;
import com.google.android.gms.internal.p000authapi.zbw;
import com.google.android.gms.internal.time.zzag;
import com.google.android.gms.internal.time.zzah;
import com.google.android.gms.internal.time.zzai;
import com.google.android.gms.internal.time.zzcw;
import com.google.android.gms.internal.time.zzk;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzll;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.internal.WalletClientImpl;
import com.google.android.gms.wallet.internal.zza;
import com.google.android.gms.wallet.internal.zze;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.gson.JsonParseException;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import kotlin.ULong;
import kotlin.UnsignedKt;
import kotlin.collections.EmptyList;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class zzb implements ModelLoaderFactory, AssetUriLoader.AssetFetcherFactory, UriLoader.LocalUriFetcherFactory, AndroidInfoProvider, Sampler, Deserializer, zabu, RemoteCall, ListenerHolder.Notifier, OnTokenCanceledListener, Continuation, zzll, OnApplyWindowInsetsListener, ExtendedFloatingActionButton.Size {
    public static zzb instance;
    public final /* synthetic */ int $r8$classId;
    public Object zza;

    public zzb(Config config) {
        String str;
        boolean z;
        this.$r8$classId = 10;
        int[] values = CameraSelector$$ExternalSyntheticOutline0.values(10);
        this.zza = new boolean[values.length];
        int length = values.length;
        int i = 0;
        while (i < length) {
            int i2 = values[i];
            switch (i2) {
                case 1:
                    str = "ResourceNameRule";
                    break;
                case 2:
                    str = "URLAsResourceNameRule";
                    break;
                case 3:
                    str = "Status404Rule";
                    break;
                case 4:
                    str = "Status404Decorator";
                    break;
                case 5:
                    str = "DBStatementRule";
                    break;
                case 6:
                    str = "ForceManualDropTagInterceptor";
                    break;
                case 7:
                    str = "ForceManualKeepTagInterceptor";
                    break;
                case 8:
                    str = "PeerServiceTagInterceptor";
                    break;
                case 9:
                    str = "ServiceNameTagInterceptor";
                    break;
                case 10:
                    str = "ServletContextTagInterceptor";
                    break;
                default:
                    throw null;
            }
            switch (i2) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 9:
                case 10:
                    z = true;
                    break;
                case 8:
                    z = false;
                    break;
                default:
                    throw null;
            }
            ConfigProvider configProvider = config.configProvider;
            boolean z2 = configProvider.getBoolean(new String[0], JsonLogicResult$Success$$ExternalSyntheticOutline0.m("trace.", str, ".enabled"), z);
            boolean z3 = configProvider.getBoolean(new String[0], "trace." + str.toLowerCase(Locale.ROOT) + ".enabled", z);
            if (z) {
                if (z2) {
                    if (!z3) {
                    }
                    ((boolean[]) this.zza)[CameraSelector$$ExternalSyntheticOutline0.ordinal(i2)] = true;
                }
            } else {
                i = (z2 || z3) ? i : i + 1;
                ((boolean[]) this.zza)[CameraSelector$$ExternalSyntheticOutline0.ordinal(i2)] = true;
            }
        }
    }

    public static zzb getInstance() {
        if (instance == null) {
            try {
                instance = new zzb(CookieManager.getInstance(), 12);
            } catch (Exception unused) {
                SVG svg = Fillr.getInstance().fillrConfig;
                instance = new zzb((Object) null, 12);
            }
        }
        return instance;
    }

    public static List getMultilineCookieHeaders(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.EMPTY_LIST;
        }
        List<String> asList = Arrays.asList(str.split("; "));
        Collections.sort(asList, new FillrCookieManager$CookieCompare());
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : asList) {
            if (stringBuffer.length() < 1) {
                stringBuffer.append(str2);
            } else if (Boxes$$ExternalSyntheticOutline1.m(stringBuffer.length(), 2, str2) <= 8168) {
                stringBuffer.append("; ");
                stringBuffer.append(str2);
            } else {
                arrayList.add(stringBuffer.toString());
                stringBuffer.setLength(0);
            }
        }
        if (stringBuffer.length() > 0) {
            arrayList.add(stringBuffer.toString());
        }
        asList.size();
        arrayList.size();
        SVG svg = Fillr.getInstance().fillrConfig;
        return arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public void accept(Object obj, Object obj2) {
        Parcel obtain;
        int i = 0;
        switch (this.$r8$classId) {
            case 16:
                zzf zzfVar = new zzf(0, (TaskCompletionSource) obj2);
                zzs zzsVar = (zzs) ((zzp) obj).getService();
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) this.zza;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(zzsVar.zzb);
                int i2 = com.google.android.gms.internal.fido.zzc.$r8$clinit;
                obtain2.writeStrongBinder(zzfVar);
                obtain2.writeInt(1);
                publicKeyCredentialCreationOptions.writeToParcel(obtain2, 0);
                obtain = Parcel.obtain();
                try {
                    zzsVar.zza.transact(1, obtain2, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                    obtain2.recycle();
                }
            case 17:
                zbaq zbaqVar = (zbaq) this.zza;
                zban zbanVar = new zban((TaskCompletionSource) obj2);
                zbw zbwVar = (zbw) ((zbar) obj).getService();
                String str = zbaqVar.zbd;
                Parcel zba = zbwVar.zba();
                int i3 = zbc.$r8$clinit;
                zba.writeStrongBinder(zbanVar);
                zba.writeString(str);
                zbwVar.zbb(zba, 2);
                return;
            default:
                WalletClientImpl walletClientImpl = (WalletClientImpl) obj;
                IsReadyToPayRequest isReadyToPayRequest = (IsReadyToPayRequest) this.zza;
                walletClientImpl.getClass();
                zze zzeVar = new zze(i, (TaskCompletionSource) obj2);
                try {
                    zza zzaVar = (zza) walletClientImpl.getService();
                    Bundle zzp = walletClientImpl.zzp();
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    com.google.android.gms.internal.wallet.zzc.zzc(obtain, isReadyToPayRequest);
                    com.google.android.gms.internal.wallet.zzc.zzc(obtain, zzp);
                    obtain.writeStrongBinder(zzeVar);
                    try {
                        zzaVar.zza.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } finally {
                        obtain.recycle();
                    }
                } catch (RemoteException e) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
                    Bundle bundle = Bundle.EMPTY;
                    TaskUtil.setResultOrApiException(Status.RESULT_INTERNAL_ERROR, Boolean.FALSE, zzeVar.zza);
                    return;
                }
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        switch (this.$r8$classId) {
            case 4:
                return new AssetUriLoader(0, (AssetManager) this.zza, this);
            default:
                return new UriLoader(this);
        }
    }

    @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
    public DataFetcher buildFetcher(AssetManager assetManager, String str) {
        return new StreamAssetPathFetcher(assetManager, str, 1);
    }

    @Override // com.datadog.android.core.internal.persistence.Deserializer
    public Object deserialize(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        if (bArr.length == 0) {
            return null;
        }
        try {
            return zzhx.fromJson(new String(bArr, Charsets.UTF_8), (InternalLogger) this.zza);
        } catch (JsonParseException e) {
            DBUtil.log$default((InternalLogger) this.zza, 5, InternalLogger.Target.USER, RumEventMapper$mapRumEvent$1.INSTANCE$1, e, false, 48);
            return null;
        }
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getArchitecture() {
        return "";
    }

    public String getCookieValue(String str, URL url) {
        CookieManager cookieManager = (CookieManager) this.zza;
        if (cookieManager == null) {
            return null;
        }
        url.toString();
        SVG svg = Fillr.getInstance().fillrConfig;
        String cookie = cookieManager.getCookie(url.toString());
        if (TextUtils.isEmpty(cookie) || str == null) {
            return null;
        }
        String concat = str.concat("=");
        for (String str2 : cookie.split("; ")) {
            if (str2.startsWith(concat)) {
                return str2.substring(str2.indexOf("=") + 1);
            }
        }
        return null;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getCurrentLocale() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceBrand() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceBuildId() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceModel() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getDeviceName() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public DeviceType getDeviceType() {
        return DeviceType.MOBILE;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.zza).getMeasuredHeight();
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public List getLocales() {
        return (EmptyList) this.zza;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public Integer getNumberOfDisplays() {
        return null;
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsMajorVersion() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsName() {
        return "";
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getOsVersion() {
        return "";
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.zza).extendedPaddingEnd;
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.zza).extendedPaddingStart;
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public Float getSampleRate() {
        float f = 100.0f;
        float floatValue = Float.valueOf(100.0f).floatValue();
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (floatValue < RecyclerView.DECELERATION_RATE) {
            InternalLogger.Companion.getClass();
            DBUtil.log$default(InternalLogger.Companion.UNBOUND, 4, target, new RateBasedSampler$1(floatValue, 1), null, false, 56);
            f = 0.0f;
        } else if (floatValue > 100.0f) {
            InternalLogger.Companion.getClass();
            DBUtil.log$default(InternalLogger.Companion.UNBOUND, 4, target, new RateBasedSampler$1(floatValue, 2), null, false, 56);
        } else {
            f = floatValue;
        }
        return Float.valueOf(f);
    }

    @Override // com.datadog.android.core.internal.system.AndroidInfoProvider
    public String getTimeZone() {
        return "";
    }

    @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size
    public int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.zza;
        return ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.extendedPaddingStart + extendedFloatingActionButton.extendedPaddingEnd;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public void notifyListener(Object obj) {
        zzdh zzdhVar = (zzdh) obj;
        LocationResult locationResult = (LocationResult) this.zza;
        TaskCompletionSource taskCompletionSource = zzdhVar.zza;
        List list = locationResult.zzb;
        int size = list.size();
        taskCompletionSource.trySetResult(size == 0 ? null : (Location) list.get(size - 1));
        try {
            zzdz zzdzVar = zzdhVar.zzb;
            com.google.android.gms.common.internal.zzae.checkNotEmpty("GetCurrentLocation", "Listener type must not be empty");
            zzdzVar.zzw(new ListenerHolder.ListenerKey(zzdhVar, "GetCurrentLocation"), false, new TaskCompletionSource());
        } catch (RemoteException unused) {
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.$r8$classId) {
            case 26:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.zza;
                WindowInsetsCompat windowInsetsCompat2 = collapsingToolbarLayout.getFitsSystemWindows() ? windowInsetsCompat : null;
                if (!Objects.equals(collapsingToolbarLayout.lastInsets, windowInsetsCompat2)) {
                    collapsingToolbarLayout.lastInsets = windowInsetsCompat2;
                    collapsingToolbarLayout.requestLayout();
                }
                return windowInsetsCompat.mImpl.consumeSystemWindowInsets();
            default:
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) this.zza;
                BottomSheetDialog.EdgeToEdgeCallback edgeToEdgeCallback = bottomSheetDialog.edgeToEdgeCallback;
                if (edgeToEdgeCallback != null) {
                    bottomSheetDialog.behavior.callbacks.remove(edgeToEdgeCallback);
                }
                BottomSheetDialog.EdgeToEdgeCallback edgeToEdgeCallback2 = new BottomSheetDialog.EdgeToEdgeCallback(bottomSheetDialog.bottomSheet, windowInsetsCompat);
                bottomSheetDialog.edgeToEdgeCallback = edgeToEdgeCallback2;
                edgeToEdgeCallback2.setWindow(bottomSheetDialog.getWindow());
                bottomSheetDialog.behavior.addBottomSheetCallback(bottomSheetDialog.edgeToEdgeCallback);
                return windowInsetsCompat;
        }
    }

    @Override // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        try {
            zzu zzuVar = (zzu) ((ICancelToken) this.zza);
            Parcel zza = zzuVar.zza();
            try {
                zzuVar.zaa.transact(2, zza, null, 1);
            } finally {
                zza.recycle();
            }
        } catch (RemoteException unused) {
        }
    }

    public void onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener) {
        ((zzw) this.zza).addOnSuccessListener(TaskExecutors.MAIN_THREAD, new m1(this, onTokenCanceledListener));
    }

    public void postResponse(Request request, Response response, Client.AnonymousClass4 anonymousClass4) {
        synchronized (request.mLock) {
            request.mResponseDelivered = true;
        }
        request.addMarker("post-response");
        ((ExecutorDelivery$1) this.zza).execute(new Fillr.AnonymousClass2(2, request, response, anonymousClass4));
    }

    @Override // com.datadog.android.core.sampling.Sampler
    public boolean sample(Object obj) {
        obj.getClass();
        float floatValue = getSampleRate().floatValue();
        if (floatValue >= 100.0f) {
            return true;
        }
        if (floatValue <= RecyclerView.DECELERATION_RATE) {
            return false;
        }
        long j = ((ULong) ((NetworkFetcher$fetch$2) this.zza).invoke(obj)).data * 1111111111111111111L;
        long j2 = -1;
        double ulongToDouble = (UnsignedKt.ulongToDouble(-1L) * floatValue) / 100.0d;
        if (Double.isNaN(ulongToDouble) || ulongToDouble <= 0.0d) {
            j2 = 0;
        } else if (ulongToDouble < 1.8446744073709552E19d) {
            if (ulongToDouble < 9.223372036854776E18d) {
                j2 = (long) ulongToDouble;
                ULong.Companion companion = ULong.Companion;
            } else {
                ULong.Companion companion2 = ULong.Companion;
                j2 = ((long) (ulongToDouble - 9.223372036854776E18d)) - Long.MIN_VALUE;
            }
        }
        return Long.compareUnsigned(j, j2) < 0;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        zzah zzahVar = (zzah) this.zza;
        if (!task.isSuccessful()) {
            return zzcw.zza(task);
        }
        zzag zzagVar = (zzag) task.getResult();
        synchronized (zzahVar.zze) {
            try {
                if (zzahVar.zzg) {
                    zzagVar.zza();
                    return Room.forException(new IllegalStateException("dispose() called"));
                }
                com.google.android.gms.internal.time.zzu zzuVar = zzagVar.zzb;
                if (zzuVar == null) {
                    zzagVar.zza();
                    return Room.forException(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                }
                zzuVar.zze();
                return Room.forResult(zzagVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 21:
                return "TickerFactory";
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void zaa(Bundle bundle) {
        zax zaxVar = (zax) this.zza;
        zaxVar.zam.lock();
        try {
            Bundle bundle2 = zaxVar.zai;
            if (bundle2 == null) {
                zaxVar.zai = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            zaxVar.zaj = ConnectionResult.RESULT_SUCCESS;
            zaxVar.zao();
        } finally {
            zaxVar.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void zab(ConnectionResult connectionResult) {
        zax zaxVar = (zax) this.zza;
        zaxVar.zam.lock();
        try {
            zaxVar.zaj = connectionResult;
            zaxVar.zao();
        } finally {
            zaxVar.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabu
    public void zac(int i) {
        ConnectionResult connectionResult;
        zax zaxVar = (zax) this.zza;
        Lock lock = zaxVar.zam;
        Lock lock2 = zaxVar.zam;
        lock.lock();
        try {
            if (!zaxVar.zal && (connectionResult = zaxVar.zak) != null && connectionResult.isSuccess()) {
                zaxVar.zal = true;
                zaxVar.zae.onConnectionSuspended(i);
                return;
            }
            zaxVar.zal = false;
            zaxVar.zab.zac(i);
            zaxVar.zak = null;
            zaxVar.zaj = null;
        } finally {
            lock2.unlock();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzll, com.google.android.gms.measurement.internal.zzgw
    public /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
        ((zzic) this.zza).zzJ(i, th, bArr);
    }

    @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
    public DataFetcher build(Uri uri) {
        return new FileDescriptorLocalUriFetcher((ContentResolver) this.zza, uri, 0);
    }

    public TraceConfiguration build() {
        return new TraceConfiguration((com.google.mlkit.vision.text.zzd) this.zza);
    }

    public /* synthetic */ zzb(Fido2ApiClient fido2ApiClient, PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions) {
        this.$r8$classId = 16;
        this.zza = publicKeyCredentialCreationOptions;
    }

    public zzb(zzk zzkVar) {
        this.$r8$classId = 21;
        this.zza = new zzai(zzkVar.zzc, zzkVar.zza);
    }

    public /* synthetic */ zzb(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    public zzb(InternalLogger internalLogger) {
        this.$r8$classId = 8;
        internalLogger.getClass();
        this.zza = internalLogger;
    }

    public zzb(NetworkFetcher$fetch$2 networkFetcher$fetch$2, DeterministicTraceSampler$2 deterministicTraceSampler$2) {
        this.$r8$classId = 7;
        this.zza = networkFetcher$fetch$2;
    }

    public zzb(Handler handler) {
        this.$r8$classId = 1;
        this.zza = new ExecutorDelivery$1(0, handler);
    }

    public zzb(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 3:
                this.zza = new ArrayDeque();
                break;
            case 6:
                this.zza = EmptyList.INSTANCE;
                break;
            case 9:
                this.zza = new com.google.mlkit.vision.text.zzd(3);
                break;
            case 14:
                this.zza = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 20:
                break;
            default:
                this.zza = new zzw();
                break;
        }
    }
}
