package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import n4.a;
import n4.b;
import n4.c;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f611a;
        boolean z10 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f611a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f612b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f5050e);
        }
        remoteActionCompat.f612b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f613c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f5050e);
        }
        remoteActionCompat.f613c = charSequence2;
        remoteActionCompat.f614d = (PendingIntent) aVar.f(remoteActionCompat.f614d, 4);
        boolean z11 = remoteActionCompat.f615e;
        if (aVar.e(5)) {
            z11 = ((b) aVar).f5050e.readInt() != 0;
        }
        remoteActionCompat.f615e = z11;
        boolean z12 = remoteActionCompat.f616f;
        if (!aVar.e(6)) {
            z10 = z12;
        } else if (((b) aVar).f5050e.readInt() == 0) {
            z10 = false;
        }
        remoteActionCompat.f616f = z10;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f611a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f612b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f5050e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f613c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f614d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z10 = remoteActionCompat.f615e;
        aVar.h(5);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = remoteActionCompat.f616f;
        aVar.h(6);
        parcel.writeInt(z11 ? 1 : 0);
    }
}
