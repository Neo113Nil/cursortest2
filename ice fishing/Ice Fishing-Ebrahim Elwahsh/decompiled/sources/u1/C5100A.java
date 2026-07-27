package u1;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import m.Q0;
import s1.InterfaceC4989b;
import s1.InterfaceC4992e;
import w1.InterfaceC5148a;
import y1.C5243r;

/* renamed from: u1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5100A implements InterfaceC5106f, InterfaceC5105e {

    /* renamed from: n, reason: collision with root package name */
    public final g f41052n;

    /* renamed from: u, reason: collision with root package name */
    public final h f41053u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f41054v;

    /* renamed from: w, reason: collision with root package name */
    public volatile C5103c f41055w;

    /* renamed from: x, reason: collision with root package name */
    public volatile Object f41056x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C5243r f41057y;

    /* renamed from: z, reason: collision with root package name */
    public volatile C5104d f41058z;

    public C5100A(g gVar, h hVar) {
        this.f41052n = gVar;
        this.f41053u = hVar;
    }

    @Override // u1.InterfaceC5105e
    public final void a(InterfaceC4992e interfaceC4992e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC4992e interfaceC4992e2) {
        this.f41053u.a(interfaceC4992e, obj, dVar, this.f41057y.f41859c.c(), interfaceC4992e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L16;
     */
    @Override // u1.InterfaceC5106f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        if (this.f41056x != null) {
            Object obj = this.f41056x;
            this.f41056x = null;
            try {
            } catch (IOException e6) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e6);
                }
            }
        }
        if (this.f41055w == null || !this.f41055w.b()) {
            this.f41055w = null;
            this.f41057y = null;
            boolean z8 = false;
            while (!z8 && this.f41054v < this.f41052n.b().size()) {
                ArrayList b9 = this.f41052n.b();
                int i = this.f41054v;
                this.f41054v = i + 1;
                this.f41057y = (C5243r) b9.get(i);
                if (this.f41057y != null && (this.f41052n.f41087p.a(this.f41057y.f41859c.c()) || this.f41052n.c(this.f41057y.f41859c.a()) != null)) {
                    this.f41057y.f41859c.e(this.f41052n.f41086o, new S0.l(this, this.f41057y, 18, false));
                    z8 = true;
                }
            }
            return z8;
        }
        return true;
    }

    @Override // u1.InterfaceC5105e
    public final void c(InterfaceC4992e interfaceC4992e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        this.f41053u.c(interfaceC4992e, exc, dVar, this.f41057y.f41859c.c());
    }

    @Override // u1.InterfaceC5106f
    public final void cancel() {
        C5243r c5243r = this.f41057y;
        if (c5243r != null) {
            c5243r.f41859c.cancel();
        }
    }

    public final boolean d(Object obj) {
        Throwable th;
        int i = N1.j.f1965b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z8 = false;
        try {
            com.bumptech.glide.load.data.f g9 = this.f41052n.f41075c.a().g(obj);
            Object n9 = g9.n();
            InterfaceC4989b d2 = this.f41052n.d(n9);
            Q0 q02 = new Q0(d2, n9, this.f41052n.i, 4);
            InterfaceC4992e interfaceC4992e = this.f41057y.f41857a;
            g gVar = this.f41052n;
            C5104d c5104d = new C5104d(interfaceC4992e, gVar.f41085n);
            InterfaceC5148a a9 = gVar.f41080h.a();
            a9.g(c5104d, q02);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c5104d + ", data: " + obj + ", encoder: " + d2 + ", duration: " + N1.j.a(elapsedRealtimeNanos));
            }
            if (a9.d(c5104d) != null) {
                this.f41058z = c5104d;
                this.f41055w = new C5103c(Collections.singletonList(this.f41057y.f41857a), this.f41052n, this);
                this.f41057y.f41859c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f41058z + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f41053u.a(this.f41057y.f41857a, g9.n(), this.f41057y.f41859c, this.f41057y.f41859c.c(), this.f41057y.f41857a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z8 = true;
                if (z8) {
                    throw th;
                }
                this.f41057y.f41859c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
