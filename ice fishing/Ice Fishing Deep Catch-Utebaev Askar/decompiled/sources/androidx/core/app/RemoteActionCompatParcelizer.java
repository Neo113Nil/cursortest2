package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import c.b;
import c.c;
import c.d;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVarH = remoteActionCompat.f28a;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        remoteActionCompat.f28a = (IconCompat) dVarH;
        CharSequence charSequence = remoteActionCompat.f29b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f50e);
        }
        remoteActionCompat.f29b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f30c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f50e);
        }
        remoteActionCompat.f30c = charSequence2;
        remoteActionCompat.f31d = (PendingIntent) bVar.g(remoteActionCompat.f31d, 4);
        boolean z = remoteActionCompat.f32e;
        if (bVar.e(5)) {
            z = ((c) bVar).f50e.readInt() != 0;
        }
        remoteActionCompat.f32e = z;
        boolean z2 = remoteActionCompat.f33f;
        if (bVar.e(6)) {
            z2 = ((c) bVar).f50e.readInt() != 0;
        }
        remoteActionCompat.f33f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f28a;
        bVar.i(1);
        bVar.j(iconCompat);
        CharSequence charSequence = remoteActionCompat.f29b;
        bVar.i(2);
        Parcel parcel = ((c) bVar).f50e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f30c;
        bVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f31d;
        bVar.i(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f32e;
        bVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f33f;
        bVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
