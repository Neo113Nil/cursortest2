package androidx.core.app;

import F0.a;
import F0.b;
import F0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f4650a;
        boolean z6 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f4650a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f4651b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f959e);
        }
        remoteActionCompat.f4651b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4652c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f959e);
        }
        remoteActionCompat.f4652c = charSequence2;
        remoteActionCompat.f4653d = (PendingIntent) aVar.f(remoteActionCompat.f4653d, 4);
        boolean z9 = remoteActionCompat.f4654e;
        if (aVar.e(5)) {
            z9 = ((b) aVar).f959e.readInt() != 0;
        }
        remoteActionCompat.f4654e = z9;
        boolean z10 = remoteActionCompat.f4655f;
        if (!aVar.e(6)) {
            z6 = z10;
        } else if (((b) aVar).f959e.readInt() == 0) {
            z6 = false;
        }
        remoteActionCompat.f4655f = z6;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4650a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4651b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f959e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4652c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f4653d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z6 = remoteActionCompat.f4654e;
        aVar.h(5);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z9 = remoteActionCompat.f4655f;
        aVar.h(6);
        parcel.writeInt(z9 ? 1 : 0);
    }
}
