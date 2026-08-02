package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class csh extends Binder implements d9e {
    public static final /* synthetic */ int h = 0;
    public final AtomicReference a;

    public csh(dsh dshVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(dshVar);
    }

    @Override // defpackage.d9e
    public final boolean A() {
        return false;
    }

    @Override // defpackage.d9e
    public final void G(x8e x8eVar) {
        dsh dshVar = (dsh) this.a.get();
        if (dshVar == null || x8eVar == null) {
            return;
        }
        dshVar.f.register(x8eVar, new xth("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (dshVar.d) {
        }
    }

    @Override // defpackage.d9e
    public final i6l c() {
        dsh dshVar = (dsh) this.a.get();
        if (dshVar == null) {
            return null;
        }
        i6l i6lVar = dshVar.g;
        ioh iohVar = dshVar.i;
        if (i6lVar != null) {
            float f = i6lVar.d;
            long j = i6lVar.h;
            int i = i6lVar.a;
            long j2 = i6lVar.b;
            long j3 = -1;
            if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f * (elapsedRealtime - j))) + j2;
                if (iohVar != null && iohVar.a.containsKey("android.media.metadata.DURATION")) {
                    j3 = iohVar.a("android.media.metadata.DURATION");
                }
                long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                ArrayList arrayList = new ArrayList();
                long j6 = i6lVar.c;
                long j7 = i6lVar.e;
                int i2 = i6lVar.f;
                CharSequence charSequence = i6lVar.g;
                AbstractCollection abstractCollection = i6lVar.i;
                if (abstractCollection != null) {
                    arrayList.addAll(abstractCollection);
                }
                return new i6l(i6lVar.a, j5, j6, i6lVar.d, j7, i2, charSequence, elapsedRealtime, arrayList, i6lVar.j, i6lVar.k);
            }
        }
        return i6lVar;
    }

    @Override // defpackage.d9e
    public final int g() {
        dsh dshVar = (dsh) this.a.get();
        if (dshVar != null) {
            return dshVar.j;
        }
        return -1;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Bundle bundle;
        if (i == 1598968902) {
            parcel2.getClass();
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        x8e x8eVar = null;
        r3 = null;
        Bundle bundle2 = null;
        x8e x8eVar2 = null;
        AtomicReference atomicReference = this.a;
        switch (i) {
            case 1:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                    lsh.CREATOR.createFromParcel(parcel);
                }
                wvs.b();
                return false;
            case 2:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 3:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof x8e)) {
                        v8e v8eVar = new v8e();
                        v8eVar.a = readStrongBinder;
                        x8eVar = v8eVar;
                    } else {
                        x8eVar = (x8e) queryLocalInterface;
                    }
                }
                G(x8eVar);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof x8e)) {
                        v8e v8eVar2 = new v8e();
                        v8eVar2.a = readStrongBinder2;
                        x8eVar2 = v8eVar2;
                    } else {
                        x8eVar2 = (x8e) queryLocalInterface2;
                    }
                }
                x(x8eVar2);
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 6:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 7:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 8:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 9:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 10:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 11:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                wvs.b();
                return false;
            case 12:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                wvs.b();
                return false;
            case 13:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 14:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 15:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 16:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 17:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                wvs.b();
                return false;
            case 18:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 19:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 20:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 21:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 22:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 23:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 24:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readLong();
                wvs.b();
                return false;
            case 25:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    iin.CREATOR.createFromParcel(parcel);
                }
                wvs.b();
                return false;
            case 26:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 27:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                i6l c = c();
                parcel2.getClass();
                parcel2.writeNoException();
                if (c == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeTypedList(null);
                return true;
            case 30:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case 32:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                wvs.b();
                return false;
            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 35:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readString();
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                }
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            case 37:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int g = g();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(g);
                return true;
            case 38:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                wvs.b();
                return false;
            case 40:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                parcel2.getClass();
                parcel2.writeNoException();
                return true;
            case 41:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    pmh.CREATOR.createFromParcel(parcel);
                }
                wvs.b();
                return false;
            case 42:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    pmh.CREATOR.createFromParcel(parcel);
                }
                parcel.readInt();
                wvs.b();
                return false;
            case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    pmh.CREATOR.createFromParcel(parcel);
                }
                wvs.b();
                return false;
            case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                wvs.b();
                return false;
            case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                A();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                wvs.b();
                return false;
            case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                int z = z();
                parcel2.getClass();
                parcel2.writeNoException();
                parcel2.writeInt(z);
                return true;
            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readInt();
                wvs.b();
                return false;
            case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                parcel.readFloat();
                wvs.b();
                return false;
            case 50:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                dsh dshVar = (dsh) atomicReference.get();
                if (dshVar != null && (bundle = dshVar.e) != null) {
                    bundle2 = new Bundle(bundle);
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (bundle2 == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                bundle2.writeToParcel(parcel2, 1);
                return true;
            case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    iin.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                }
                wvs.b();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.d9e
    public final void x(x8e x8eVar) {
        dsh dshVar = (dsh) this.a.get();
        if (dshVar == null || x8eVar == null) {
            return;
        }
        dshVar.f.unregister(x8eVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (dshVar.d) {
        }
    }

    @Override // defpackage.d9e
    public final int z() {
        dsh dshVar = (dsh) this.a.get();
        if (dshVar != null) {
            return dshVar.k;
        }
        return -1;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
