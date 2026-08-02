package com.google.android.gms.internal.maps;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.internal.InternalIdentityCredentialClient$getCredential$1$callback$1;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zzq;
import com.google.android.play.core.appupdate.zzr;
import com.google.android.play.core.appupdate.zzt;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.review.internal.zzn;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzh;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public abstract class zzb extends Binder implements IInterface {
    public final /* synthetic */ int $r8$classId;

    public zzb(String str, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                break;
            case 3:
                attachInterface(this, str);
                break;
            case 4:
                attachInterface(this, str);
                break;
            case 9:
                attachInterface(this, str);
                break;
            case 13:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    public static void enforceNoDataAvail(Parcel parcel) {
        int i = com.google.android.gms.internal.identity_credentials.zzc.$r8$clinit;
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(Boxes$$ExternalSyntheticOutline1.m(dataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(dataAvail).length() + 45)));
        }
    }

    public abstract boolean a(Parcel parcel, int i);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.$r8$classId;
        return this;
    }

    public abstract boolean dispatchTransaction(Parcel parcel, int i);

    public void onIsReadyToPayDetermined(Status status, boolean z) {
    }

    public void onPaymentDataLoaded(Status status, PaymentData paymentData) {
    }

    public void onPreAuthorizationDetermined(int i, boolean z) {
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        switch (this.$r8$classId) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return zza(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return zba(i, parcel, parcel2);
            case 2:
                if (i > 16777215) {
                    z = super.onTransact(i, parcel, parcel2, i2);
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                    z = false;
                }
                if (z) {
                    return true;
                }
                InternalIdentityCredentialClient$getCredential$1$callback$1 internalIdentityCredentialClient$getCredential$1$callback$1 = (InternalIdentityCredentialClient$getCredential$1$callback$1) this;
                switch (i) {
                    case 1:
                        Status status = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, PendingGetCredentialHandle.CREATOR);
                        enforceNoDataAvail(parcel);
                        int i3 = internalIdentityCredentialClient$getCredential$1$callback$1.$r8$classId;
                        status.getClass();
                        switch (i3) {
                            case 0:
                                TaskUtil.setResultOrApiException(status, pendingGetCredentialHandle, internalIdentityCredentialClient$getCredential$1$callback$1.$completionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 2:
                        Status status2 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status2.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 3:
                        Status status3 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status3.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 4:
                        Status status4 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status4.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 5:
                        Status status5 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status5.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 6:
                        Status status6 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status6.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 7:
                        Status status7 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        CreateCredentialHandle createCredentialHandle = (CreateCredentialHandle) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, CreateCredentialHandle.CREATOR);
                        enforceNoDataAvail(parcel);
                        int i4 = internalIdentityCredentialClient$getCredential$1$callback$1.$r8$classId;
                        status7.getClass();
                        switch (i4) {
                            case 1:
                                TaskUtil.setResultOrApiException(status7, createCredentialHandle, internalIdentityCredentialClient$getCredential$1$callback$1.$completionSource);
                                return true;
                            default:
                                throw new UnsupportedOperationException();
                        }
                    case 8:
                        Status status8 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status8.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 9:
                        Status status9 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status9.getClass();
                        throw new UnsupportedOperationException();
                    case 10:
                        Status status10 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status10.getClass();
                        throw new UnsupportedOperationException();
                    case 11:
                        Status status11 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status11.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 12:
                        Status status12 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status12.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 13:
                        Status status13 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status13.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 14:
                        Status status14 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status14.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                    case 15:
                        Status status15 = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
                        enforceNoDataAvail(parcel);
                        status15.getClass();
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        break;
                }
                return false;
            case 3:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return zza(parcel, i);
            case 4:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return zza(parcel, i);
            case 5:
            case 6:
            case 7:
            default:
                return super.onTransact(i, parcel, parcel2, i2);
            case 8:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return dispatchTransaction(parcel, i);
            case 9:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return zza(parcel, i);
            case 10:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                switch (i) {
                    case 1:
                        parcel.readInt();
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 2:
                        parcel.readInt();
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 3:
                        int readInt = parcel.readInt();
                        int i5 = com.google.android.gms.internal.wallet.zzc.$r8$clinit;
                        r5 = parcel.readInt() != 0;
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        onPreAuthorizationDetermined(readInt, r5);
                        return true;
                    case 4:
                        parcel.readInt();
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        parcel.readInt();
                        int i6 = com.google.android.gms.internal.wallet.zzc.$r8$clinit;
                        parcel.readInt();
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 7:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 8:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 9:
                        Status status16 = (Status) com.google.android.gms.internal.wallet.zzc.zzb(parcel, Status.CREATOR);
                        boolean z2 = parcel.readInt() != 0;
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        onIsReadyToPayDetermined(status16, z2);
                        return true;
                    case 10:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 11:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 12:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 13:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 14:
                        Status status17 = (Status) com.google.android.gms.internal.wallet.zzc.zzb(parcel, Status.CREATOR);
                        PaymentData paymentData = (PaymentData) com.google.android.gms.internal.wallet.zzc.zzb(parcel, PaymentData.CREATOR);
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        onPaymentDataLoaded(status17, paymentData);
                        return true;
                    case 15:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 16:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 17:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 18:
                        parcel.readInt();
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 19:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 20:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                    case 21:
                        com.google.android.gms.internal.wallet.zzc.zze(parcel);
                        return true;
                }
            case 11:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                zzq zzqVar = (zzq) this;
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    int i7 = com.google.android.play.core.appupdate.internal.zzc.$r8$clinit;
                    int dataAvail = parcel.dataAvail();
                    if (dataAvail > 0) {
                        throw new BadParcelableException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dataAvail, "Parcel data not fully consumed, unread size: "));
                    }
                    zzqVar.zzc.zza.zzu(zzqVar.zzb);
                    zzqVar.zza.zzd("onCompleteUpdate", new Object[0]);
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                int i8 = com.google.android.play.core.appupdate.internal.zzc.$r8$clinit;
                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw new BadParcelableException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                zzx zzxVar = zzqVar.zzc.zza;
                TaskCompletionSource taskCompletionSource = zzqVar.zzb;
                zzxVar.zzu(taskCompletionSource);
                zzqVar.zza.zzd("onRequestInfo", new Object[0]);
                if (bundle.getInt("error.code", -2) != 0) {
                    taskCompletionSource.trySetException(new InstallException(bundle.getInt("error.code", -2)));
                    return true;
                }
                zzr zzrVar = zzqVar.zzd;
                bundle.getInt("version.code", -1);
                int i9 = bundle.getInt("update.availability");
                bundle.getInt("install.status", 0);
                if (bundle.getInt("client.version.staleness", -1) != -1) {
                    bundle.getInt("client.version.staleness");
                }
                bundle.getInt("in.app.update.priority", 0);
                bundle.getLong("bytes.downloaded");
                bundle.getLong("total.bytes.to.download");
                bundle.getLong("additional.size.required");
                zzt zztVar = zzrVar.zzf;
                zztVar.getClass();
                zzt.zzb(new File(zztVar.zza.getFilesDir(), "assetpacks"));
                HashMap hashMap = new HashMap();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
                HashSet hashSet = new HashSet();
                if (integerArrayList != null) {
                    hashSet.addAll(integerArrayList);
                }
                hashMap.put("blocking.destructive.intent", hashSet);
                ArrayList<Integer> integerArrayList2 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
                HashSet hashSet2 = new HashSet();
                if (integerArrayList2 != null) {
                    hashSet2.addAll(integerArrayList2);
                }
                hashMap.put("nonblocking.destructive.intent", hashSet2);
                ArrayList<Integer> integerArrayList3 = bundle.getIntegerArrayList("update.precondition.failures:blocking.intent");
                HashSet hashSet3 = new HashSet();
                if (integerArrayList3 != null) {
                    hashSet3.addAll(integerArrayList3);
                }
                hashMap.put("blocking.intent", hashSet3);
                ArrayList<Integer> integerArrayList4 = bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
                HashSet hashSet4 = new HashSet();
                if (integerArrayList4 != null) {
                    hashSet4.addAll(integerArrayList4);
                }
                hashMap.put("nonblocking.intent", hashSet4);
                taskCompletionSource.trySetResult(new AppUpdateInfo(i9));
                return true;
            case 12:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                zzh zzhVar = (zzh) this;
                if (i != 2) {
                    return false;
                }
                Parcelable.Creator creator3 = Bundle.CREATOR;
                int i10 = com.google.android.play.core.review.internal.zzc.$r8$clinit;
                Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator3.createFromParcel(parcel) : null);
                int dataAvail3 = parcel.dataAvail();
                if (dataAvail3 > 0) {
                    throw new BadParcelableException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dataAvail3, "Parcel data not fully consumed, unread size: "));
                }
                com.google.android.play.core.review.internal.zzt zztVar2 = zzhVar.zzc.zza;
                if (zztVar2 != null) {
                    TaskCompletionSource taskCompletionSource2 = zzhVar.zzb;
                    synchronized (zztVar2.zzg) {
                        zztVar2.zzf.remove(taskCompletionSource2);
                    }
                    zztVar2.zzc().post(new zzn(zztVar2, r5 ? 1 : 0));
                }
                zzhVar.zza.zzc("onGetLaunchReviewFlowInfo", new Object[0]);
                zzhVar.zzb.trySetResult(new zza((PendingIntent) bundle2.get("confirmation_intent"), bundle2.getBoolean("is_review_no_op")));
                return true;
            case 13:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return a(parcel, i);
        }
    }

    public abstract boolean zba(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean zza(int i, Parcel parcel, Parcel parcel2);

    public abstract boolean zza(Parcel parcel, int i);

    public zzb() {
        this.$r8$classId = 10;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
    }

    public /* synthetic */ zzb(int i) {
        this.$r8$classId = i;
    }
}
