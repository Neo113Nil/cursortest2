package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.x0u;
import defpackage.y0u;
import defpackage.z0u;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(x0u x0uVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        z0u z0uVar = remoteActionCompat.a;
        boolean z = true;
        if (x0uVar.e(1)) {
            z0uVar = x0uVar.h();
        }
        remoteActionCompat.a = (IconCompat) z0uVar;
        CharSequence charSequence = remoteActionCompat.b;
        if (x0uVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((y0u) x0uVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (x0uVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((y0u) x0uVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) x0uVar.g(4, remoteActionCompat.d);
        boolean z2 = remoteActionCompat.e;
        if (x0uVar.e(5)) {
            z2 = ((y0u) x0uVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!x0uVar.e(6)) {
            z = z3;
        } else if (((y0u) x0uVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, x0u x0uVar) {
        x0uVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        x0uVar.i(1);
        x0uVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        x0uVar.i(2);
        Parcel parcel = ((y0u) x0uVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        x0uVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        x0uVar.k(4, remoteActionCompat.d);
        boolean z = remoteActionCompat.e;
        x0uVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        x0uVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
