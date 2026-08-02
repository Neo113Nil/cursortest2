package D;

import android.app.Notification;
import android.os.Parcel;
import c.C0540a;
import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final String f338a;

    /* renamed from: b, reason: collision with root package name */
    public final int f339b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f340c;

    public I(String str, int i, Notification notification) {
        this.f338a = str;
        this.f339b = i;
        this.f340c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f338a;
        int i = this.f339b;
        C0540a c0540a = (C0540a) cVar;
        c0540a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.f5621f0);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            Notification notification = this.f340c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0540a.f5619n.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f338a);
        sb.append(", id:");
        return AbstractC5128c.e(this.f339b, ", tag:null]", sb);
    }
}
