package androidx.core.app;

import android.app.Notification;
import android.os.Parcel;
import defpackage.su4;

/* loaded from: classes.dex */
public final class q0 {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public q0(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(android.support.v4.app.c cVar) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        android.support.v4.app.a aVar = (android.support.v4.app.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(android.support.v4.app.c.g);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return su4.o(sb, this.c, "]");
    }
}
