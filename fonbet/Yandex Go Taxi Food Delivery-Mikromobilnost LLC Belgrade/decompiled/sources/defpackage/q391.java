package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.a;

/* loaded from: classes11.dex */
public abstract class q391 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ a c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ a f;

    public q391(a aVar, int i, Bundle bundle) {
        this.f = aVar;
        Boolean bool = Boolean.TRUE;
        this.c = aVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ConnectionResult connectionResult);

    public final void c() {
        Boolean bool;
        synchronized (this) {
            try {
                bool = this.a;
                if (this.b) {
                    new StringBuilder(toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a aVar = this.f;
            int i = this.d;
            if (i != 0) {
                aVar.r(1, null);
                Bundle bundle = this.e;
                b(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!a()) {
                aVar.r(1, null);
                b(new ConnectionResult(8, null));
            }
        }
        synchronized (this) {
            this.b = true;
        }
        d();
    }

    public final void d() {
        e();
        a aVar = this.c;
        synchronized (aVar.J) {
            aVar.J.remove(this);
        }
    }

    public final void e() {
        synchronized (this) {
            this.a = null;
        }
    }
}
