package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import defpackage.e9e;
import defpackage.esh;
import defpackage.w8e;
import defpackage.wvs;
import defpackage.y8e;
import defpackage.yth;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d extends Binder implements e9e {
    public static final /* synthetic */ int h = 0;
    public final AtomicReference a;

    public d(esh eshVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.a = new AtomicReference(eshVar);
    }

    @Override // defpackage.e9e
    public final PlaybackStateCompat c() {
        esh eshVar = (esh) this.a.get();
        if (eshVar == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = eshVar.f;
        MediaMetadataCompat mediaMetadataCompat = eshVar.g;
        if (playbackStateCompat != null) {
            float f = playbackStateCompat.d;
            long j = playbackStateCompat.h;
            int i = playbackStateCompat.a;
            long j2 = playbackStateCompat.b;
            long j3 = -1;
            if (j2 != -1 && ((i == 3 || i == 4 || i == 5) && j > 0)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = ((long) (f * (elapsedRealtime - j))) + j2;
                if (mediaMetadataCompat != null) {
                    Bundle bundle = mediaMetadataCompat.a;
                    if (bundle.containsKey("android.media.metadata.DURATION")) {
                        j3 = bundle.getLong("android.media.metadata.DURATION", 0L);
                    }
                }
                long j5 = (j3 < 0 || j4 <= j3) ? j4 < 0 ? 0L : j4 : j3;
                ArrayList arrayList = new ArrayList();
                long j6 = playbackStateCompat.c;
                long j7 = playbackStateCompat.e;
                int i2 = playbackStateCompat.f;
                CharSequence charSequence = playbackStateCompat.g;
                ArrayList arrayList2 = playbackStateCompat.i;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                return new PlaybackStateCompat(playbackStateCompat.a, j5, j6, playbackStateCompat.d, j7, i2, charSequence, elapsedRealtime, arrayList, playbackStateCompat.j, playbackStateCompat.k);
            }
        }
        return playbackStateCompat;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        y8e y8eVar = null;
        y8e y8eVar2 = null;
        AtomicReference atomicReference = this.a;
        switch (i) {
            case 1:
                parcel.readString();
                wvs.b();
                return false;
            case 2:
                wvs.b();
                return false;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof y8e)) {
                        w8e w8eVar = new w8e();
                        w8eVar.a = readStrongBinder;
                        y8eVar = w8eVar;
                    } else {
                        y8eVar = (y8e) queryLocalInterface;
                    }
                }
                x0(y8eVar);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof y8e)) {
                        w8e w8eVar2 = new w8e();
                        w8eVar2.a = readStrongBinder2;
                        y8eVar2 = w8eVar2;
                    } else {
                        y8eVar2 = (y8e) queryLocalInterface2;
                    }
                }
                t0(y8eVar2);
                parcel2.writeNoException();
                return true;
            case 5:
                wvs.b();
                return false;
            case 6:
                wvs.b();
                return false;
            case 7:
                wvs.b();
                return false;
            case 8:
                wvs.b();
                return false;
            case 9:
                wvs.b();
                return false;
            case 10:
                wvs.b();
                return false;
            case 11:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                wvs.b();
                return false;
            case 12:
                parcel.readInt();
                parcel.readInt();
                parcel.readString();
                wvs.b();
                return false;
            case 13:
                wvs.b();
                return false;
            case 14:
                parcel.readString();
                wvs.b();
                return false;
            case 15:
                parcel.readString();
                wvs.b();
                return false;
            case 16:
                wvs.b();
                return false;
            case 17:
                parcel.readLong();
                wvs.b();
                return false;
            case 18:
                wvs.b();
                return false;
            case 19:
                wvs.b();
                return false;
            case 20:
                wvs.b();
                return false;
            case 21:
                wvs.b();
                return false;
            case 22:
                wvs.b();
                return false;
            case 23:
                wvs.b();
                return false;
            case 24:
                parcel.readLong();
                wvs.b();
                return false;
            case 25:
                wvs.b();
                return false;
            case 26:
                parcel.readString();
                wvs.b();
                return false;
            case 27:
                wvs.b();
                return false;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                PlaybackStateCompat c = c();
                parcel2.writeNoException();
                if (c == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                c.writeToParcel(parcel2, 1);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                wvs.b();
                return false;
            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                wvs.b();
                return false;
            case 32:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                wvs.b();
                return false;
            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                parcel.readString();
                wvs.b();
                return false;
            case 35:
                parcel.readString();
                wvs.b();
                return false;
            case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                wvs.b();
                return false;
            case 37:
                i3 = ((esh) atomicReference.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                parcel.readInt();
                wvs.b();
                return false;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                wvs.b();
                return false;
            case 42:
                parcel.readInt();
                wvs.b();
                return false;
            case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                wvs.b();
                return false;
            case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                parcel.readInt();
                wvs.b();
                return false;
            case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                parcel.readInt();
                wvs.b();
                return false;
            case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                i3 = ((esh) atomicReference.get()) != null ? 0 : -1;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                parcel.readInt();
                wvs.b();
                return false;
            case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                parcel.readFloat();
                wvs.b();
                return false;
            case 50:
                ((esh) atomicReference.get()).getClass();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                wvs.b();
                return false;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // defpackage.e9e
    public final void t0(y8e y8eVar) {
        esh eshVar = (esh) this.a.get();
        if (eshVar == null) {
            return;
        }
        eshVar.e.unregister(y8eVar);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (eshVar.d) {
        }
    }

    @Override // defpackage.e9e
    public final void x0(y8e y8eVar) {
        esh eshVar = (esh) this.a.get();
        if (eshVar == null) {
            return;
        }
        eshVar.e.register(y8eVar, new yth("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (eshVar.d) {
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
