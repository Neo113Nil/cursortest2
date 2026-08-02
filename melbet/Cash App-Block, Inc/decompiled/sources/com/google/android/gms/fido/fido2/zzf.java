package com.google.android.gms.fido.fido2;

import android.app.PendingIntent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.fido.zzc;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes4.dex */
public final class zzf extends Binder implements IInterface {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TaskCompletionSource zza;

    public zzf(int i, TaskCompletionSource taskCompletionSource) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
                break;
            case 2:
                this.zza = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
                break;
            default:
                this.zza = taskCompletionSource;
                attachInterface(this, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppCallbacks");
                break;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.$r8$classId;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (super.onTransact(r7, r8, r9, r10) != false) goto L7;
     */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.$r8$classId) {
            case 0:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i3 = zzc.$r8$clinit;
                Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                PendingIntent pendingIntent = (PendingIntent) (parcel.readInt() != 0 ? (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel) : null);
                int dataAvail = parcel.dataAvail();
                if (dataAvail > 0) {
                    throw new BadParcelableException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dataAvail, "Parcel data not fully consumed, unread size: "));
                }
                TaskUtil.setResultOrApiException(createFromParcel, pendingIntent, this.zza);
                return true;
            case 1:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator2 = Status.CREATOR;
                int i4 = com.google.android.gms.internal.appset.zzc.$r8$clinit;
                Status createFromParcel2 = parcel.readInt() == 0 ? null : creator2.createFromParcel(parcel);
                com.google.android.gms.appset.zzc createFromParcel3 = parcel.readInt() == 0 ? null : com.google.android.gms.appset.zzc.CREATOR.createFromParcel(parcel);
                TaskUtil.setResultOrApiException(createFromParcel2, createFromParcel3 != null ? new AppSetIdInfo(createFromParcel3.zza, createFromParcel3.zzb) : null, this.zza);
                return true;
            default:
                if (i > 16777215) {
                    break;
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator3 = Status.CREATOR;
                int i5 = com.google.android.gms.internal.p001authapiphone.zzc.$r8$clinit;
                Status createFromParcel4 = parcel.readInt() == 0 ? null : creator3.createFromParcel(parcel);
                int dataAvail2 = parcel.dataAvail();
                if (dataAvail2 > 0) {
                    throw new BadParcelableException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(dataAvail2, "Parcel data not fully consumed, unread size: "));
                }
                TaskUtil.setResultOrApiException(createFromParcel4, null, this.zza);
                return true;
        }
    }
}
