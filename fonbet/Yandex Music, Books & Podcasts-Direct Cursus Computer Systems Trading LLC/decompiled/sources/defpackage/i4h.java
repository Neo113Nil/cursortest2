package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class i4h extends e5p {
    public final Context d;
    public volatile WifiManager.MulticastLock e;
    public volatile p2f f;
    public final g4h g;

    public i4h(Context context, pwe pweVar) {
        super(pweVar);
        this.g = new g4h(this);
        this.d = context;
    }

    @Override // defpackage.e5p
    public final void c() {
        if (this.a) {
            d();
        }
        synchronized (this) {
            this.b.clear();
        }
        boolean z = false;
        try {
            if (this.e == null) {
                this.e = rvf.v(this.d, "MDNSSearchProvider");
            } else if (!this.e.isHeld()) {
                this.e.acquire();
            }
            e();
            try {
                this.f = new p2f(null, rvf.A(this.d));
                this.f.Y("_samsungmsf._tcp.local.", this.g, false);
                z = true;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.a = z;
    }

    @Override // defpackage.e5p
    public final boolean d() {
        if (!this.a) {
            return false;
        }
        this.a = false;
        e();
        try {
            rvf.J(this.e);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public final synchronized void e() {
        if (this.f != null) {
            this.f.X("_samsungmsf._tcp.local.", this.g);
            try {
                this.f.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.f = null;
        }
    }
}
