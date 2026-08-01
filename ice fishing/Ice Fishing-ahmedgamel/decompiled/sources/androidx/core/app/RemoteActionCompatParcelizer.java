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
        c cVar = remoteActionCompat.f4682a;
        boolean z3 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f4682a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f4683b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f896e);
        }
        remoteActionCompat.f4683b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f4684c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f896e);
        }
        remoteActionCompat.f4684c = charSequence2;
        remoteActionCompat.f4685d = (PendingIntent) aVar.f(remoteActionCompat.f4685d, 4);
        boolean z6 = remoteActionCompat.f4686e;
        if (aVar.e(5)) {
            z6 = ((b) aVar).f896e.readInt() != 0;
        }
        remoteActionCompat.f4686e = z6;
        boolean z9 = remoteActionCompat.f4687f;
        if (!aVar.e(6)) {
            z3 = z9;
        } else if (((b) aVar).f896e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f4687f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f4682a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f4683b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f896e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f4684c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f4685d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f4686e;
        aVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z6 = remoteActionCompat.f4687f;
        aVar.h(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}
