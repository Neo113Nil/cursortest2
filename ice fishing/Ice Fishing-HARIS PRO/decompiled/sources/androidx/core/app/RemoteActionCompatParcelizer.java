package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import r0.AbstractC0345a;
import r0.b;
import r0.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0345a abstractC0345a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f1923a;
        if (abstractC0345a.e(1)) {
            cVar = abstractC0345a.g();
        }
        remoteActionCompat.f1923a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f1924b;
        if (abstractC0345a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0345a).e);
        }
        remoteActionCompat.f1924b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1925c;
        if (abstractC0345a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) abstractC0345a).e);
        }
        remoteActionCompat.f1925c = charSequence2;
        remoteActionCompat.f1926d = (PendingIntent) abstractC0345a.f(remoteActionCompat.f1926d, 4);
        boolean z2 = remoteActionCompat.e;
        if (abstractC0345a.e(5)) {
            z2 = ((b) abstractC0345a).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f1927f;
        if (abstractC0345a.e(6)) {
            z3 = ((b) abstractC0345a).e.readInt() != 0;
        }
        remoteActionCompat.f1927f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0345a abstractC0345a) {
        abstractC0345a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1923a;
        abstractC0345a.h(1);
        abstractC0345a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1924b;
        abstractC0345a.h(2);
        Parcel parcel = ((b) abstractC0345a).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1925c;
        abstractC0345a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1926d;
        abstractC0345a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.e;
        abstractC0345a.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1927f;
        abstractC0345a.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
