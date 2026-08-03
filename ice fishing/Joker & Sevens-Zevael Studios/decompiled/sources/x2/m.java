package x2;

import android.app.Notification;
import android.os.Parcel;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f8263a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8264b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f8265c;

    public m(String str, int i10, Notification notification) {
        this.f8263a = str;
        this.f8264b = i10;
        this.f8265c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f8263a;
        int i10 = this.f8264b;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.f1173c);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f8265c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f1171d.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        return "NotifyTask[packageName:" + this.f8263a + ", id:" + this.f8264b + ", tag:null]";
    }
}
