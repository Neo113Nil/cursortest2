package D;

import android.app.Notification;
import android.os.Parcel;
import c.C0532a;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final String f441a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f443c;

    public J(String str, int i, Notification notification) {
        this.f441a = str;
        this.f442b = i;
        this.f443c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f441a;
        int i = this.f442b;
        C0532a c0532a = (C0532a) cVar;
        c0532a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.f5473k0);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            Notification notification = this.f443c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0532a.f5471n.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f441a);
        sb.append(", id:");
        return u1.h.e(this.f442b, ", tag:null]", sb);
    }
}
