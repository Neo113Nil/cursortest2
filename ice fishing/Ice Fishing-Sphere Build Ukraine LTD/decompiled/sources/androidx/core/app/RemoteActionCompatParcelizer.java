package androidx.core.app;

import P.a;
import P.b;
import P.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1301a;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f1301a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1302b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f822e);
        }
        remoteActionCompat.f1302b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1303c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f822e);
        }
        remoteActionCompat.f1303c = charSequence2;
        remoteActionCompat.f1304d = (PendingIntent) aVar.f(remoteActionCompat.f1304d, 4);
        boolean z2 = remoteActionCompat.f1305e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).f822e.readInt() != 0;
        }
        remoteActionCompat.f1305e = z2;
        boolean z3 = remoteActionCompat.f1306f;
        if (aVar.e(6)) {
            z3 = ((b) aVar).f822e.readInt() != 0;
        }
        remoteActionCompat.f1306f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1301a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1302b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f822e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1303c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1304d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1305e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1306f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
