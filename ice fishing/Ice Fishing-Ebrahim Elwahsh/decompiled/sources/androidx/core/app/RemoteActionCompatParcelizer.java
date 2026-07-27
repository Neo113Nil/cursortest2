package androidx.core.app;

import F0.b;
import F0.c;
import F0.d;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(b bVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        d dVar = remoteActionCompat.f4797a;
        boolean z8 = true;
        if (bVar.e(1)) {
            dVar = bVar.g();
        }
        remoteActionCompat.f4797a = (IconCompat) dVar;
        CharSequence charSequence = remoteActionCompat.f4798b;
        if (bVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f945e);
        }
        remoteActionCompat.f4798b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4799c;
        if (bVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((c) bVar).f945e);
        }
        remoteActionCompat.f4799c = charSequence2;
        remoteActionCompat.f4800d = (PendingIntent) bVar.f(remoteActionCompat.f4800d, 4);
        boolean z9 = remoteActionCompat.f4801e;
        if (bVar.e(5)) {
            z9 = ((c) bVar).f945e.readInt() != 0;
        }
        remoteActionCompat.f4801e = z9;
        boolean z10 = remoteActionCompat.f4802f;
        if (!bVar.e(6)) {
            z8 = z10;
        } else if (((c) bVar).f945e.readInt() == 0) {
            z8 = false;
        }
        remoteActionCompat.f4802f = z8;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, b bVar) {
        bVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4797a;
        bVar.h(1);
        bVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4798b;
        bVar.h(2);
        Parcel parcel = ((c) bVar).f945e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4799c;
        bVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f4800d;
        bVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z8 = remoteActionCompat.f4801e;
        bVar.h(5);
        parcel.writeInt(z8 ? 1 : 0);
        boolean z9 = remoteActionCompat.f4802f;
        bVar.h(6);
        parcel.writeInt(z9 ? 1 : 0);
    }
}
