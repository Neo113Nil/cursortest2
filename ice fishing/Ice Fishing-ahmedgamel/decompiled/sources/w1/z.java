package w1;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import u1.InterfaceC5063b;
import u1.InterfaceC5066e;
import y1.InterfaceC5200a;

/* loaded from: classes.dex */
public final class z implements InterfaceC5138f, InterfaceC5137e {

    /* renamed from: n, reason: collision with root package name */
    public final g f41585n;

    /* renamed from: u, reason: collision with root package name */
    public final h f41586u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f41587v;

    /* renamed from: w, reason: collision with root package name */
    public volatile C5135c f41588w;

    /* renamed from: x, reason: collision with root package name */
    public volatile Object f41589x;

    /* renamed from: y, reason: collision with root package name */
    public volatile A1.w f41590y;

    /* renamed from: z, reason: collision with root package name */
    public volatile C5136d f41591z;

    public z(g gVar, h hVar) {
        this.f41585n = gVar;
        this.f41586u = hVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L16;
     */
    @Override // w1.InterfaceC5138f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        if (this.f41589x != null) {
            Object obj = this.f41589x;
            this.f41589x = null;
            try {
            } catch (IOException e9) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e9);
                }
            }
        }
        if (this.f41588w == null || !this.f41588w.a()) {
            this.f41588w = null;
            this.f41590y = null;
            boolean z6 = false;
            while (!z6 && this.f41587v < this.f41585n.b().size()) {
                ArrayList b9 = this.f41585n.b();
                int i = this.f41587v;
                this.f41587v = i + 1;
                this.f41590y = (A1.w) b9.get(i);
                if (this.f41590y != null && (this.f41585n.f41456p.a(this.f41590y.f92c.d()) || this.f41585n.c(this.f41590y.f92c.a()) != null)) {
                    A1.w wVar = this.f41590y;
                    com.bumptech.glide.load.data.d dVar = this.f41590y.f92c;
                    com.bumptech.glide.j jVar = this.f41585n.f41455o;
                    k8.b bVar = new k8.b();
                    bVar.f38634u = this;
                    bVar.f38633n = wVar;
                    dVar.e(jVar, bVar);
                    z6 = true;
                }
            }
            return z6;
        }
        return true;
    }

    @Override // w1.InterfaceC5137e
    public final void b(InterfaceC5066e interfaceC5066e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        this.f41586u.b(interfaceC5066e, exc, dVar, this.f41590y.f92c.d());
    }

    @Override // w1.InterfaceC5137e
    public final void c(InterfaceC5066e interfaceC5066e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC5066e interfaceC5066e2) {
        this.f41586u.c(interfaceC5066e, obj, dVar, this.f41590y.f92c.d(), interfaceC5066e);
    }

    @Override // w1.InterfaceC5138f
    public final void cancel() {
        A1.w wVar = this.f41590y;
        if (wVar != null) {
            wVar.f92c.cancel();
        }
    }

    public final boolean d(Object obj) {
        Throwable th;
        int i = P1.j.f2365b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z6 = false;
        try {
            com.bumptech.glide.load.data.f g9 = this.f41585n.f41444c.a().g(obj);
            Object a9 = g9.a();
            InterfaceC5063b d9 = this.f41585n.d(a9);
            l4.g gVar = new l4.g(d9, a9, this.f41585n.i);
            InterfaceC5066e interfaceC5066e = this.f41590y.f90a;
            g gVar2 = this.f41585n;
            C5136d c5136d = new C5136d(interfaceC5066e, gVar2.f41454n);
            InterfaceC5200a a10 = gVar2.f41449h.a();
            a10.b(c5136d, gVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c5136d + ", data: " + obj + ", encoder: " + d9 + ", duration: " + P1.j.a(elapsedRealtimeNanos));
            }
            if (a10.a(c5136d) != null) {
                this.f41591z = c5136d;
                this.f41588w = new C5135c(Collections.singletonList(this.f41590y.f90a), this.f41585n, this);
                this.f41590y.f92c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f41591z + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f41586u.c(this.f41590y.f90a, g9.a(), this.f41590y.f92c, this.f41590y.f92c.d(), this.f41590y.f90a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z6 = true;
                if (z6) {
                    throw th;
                }
                this.f41590y.f92c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
