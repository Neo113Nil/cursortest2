package u1;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import s1.InterfaceC4967b;
import s1.InterfaceC4970e;
import t0.C5019n;
import w1.InterfaceC5143a;
import y1.C5222q;

/* renamed from: u1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5061A implements InterfaceC5067f, InterfaceC5066e {

    /* renamed from: n, reason: collision with root package name */
    public final g f41035n;

    /* renamed from: u, reason: collision with root package name */
    public final i f41036u;

    /* renamed from: v, reason: collision with root package name */
    public volatile int f41037v;

    /* renamed from: w, reason: collision with root package name */
    public volatile C5064c f41038w;

    /* renamed from: x, reason: collision with root package name */
    public volatile Object f41039x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C5222q f41040y;

    /* renamed from: z, reason: collision with root package name */
    public volatile C5065d f41041z;

    public C5061A(g gVar, i iVar) {
        this.f41035n = gVar;
        this.f41036u = iVar;
    }

    @Override // u1.InterfaceC5066e
    public final void a(InterfaceC4970e interfaceC4970e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC4970e interfaceC4970e2) {
        this.f41036u.a(interfaceC4970e, obj, dVar, this.f41040y.f41819c.d(), interfaceC4970e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L16;
     */
    @Override // u1.InterfaceC5067f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        if (this.f41039x != null) {
            Object obj = this.f41039x;
            this.f41039x = null;
            try {
            } catch (IOException e9) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e9);
                }
            }
        }
        if (this.f41038w == null || !this.f41038w.b()) {
            this.f41038w = null;
            this.f41040y = null;
            boolean z3 = false;
            while (!z3 && this.f41037v < this.f41035n.b().size()) {
                ArrayList b9 = this.f41035n.b();
                int i = this.f41037v;
                this.f41037v = i + 1;
                this.f41040y = (C5222q) b9.get(i);
                if (this.f41040y != null && (this.f41035n.f41070p.a(this.f41040y.f41819c.d()) || this.f41035n.c(this.f41040y.f41819c.a()) != null)) {
                    this.f41040y.f41819c.e(this.f41035n.f41069o, new C5019n(this, this.f41040y));
                    z3 = true;
                }
            }
            return z3;
        }
        return true;
    }

    @Override // u1.InterfaceC5066e
    public final void c(InterfaceC4970e interfaceC4970e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        this.f41036u.c(interfaceC4970e, exc, dVar, this.f41040y.f41819c.d());
    }

    @Override // u1.InterfaceC5067f
    public final void cancel() {
        C5222q c5222q = this.f41040y;
        if (c5222q != null) {
            c5222q.f41819c.cancel();
        }
    }

    public final boolean d(Object obj) {
        Throwable th;
        int i = N1.j.f1921b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z3 = false;
        try {
            com.bumptech.glide.load.data.f g4 = this.f41035n.f41058c.a().g(obj);
            Object a9 = g4.a();
            InterfaceC4967b d2 = this.f41035n.d(a9);
            j4.g gVar = new j4.g(d2, a9, this.f41035n.i);
            InterfaceC4970e interfaceC4970e = this.f41040y.f41817a;
            g gVar2 = this.f41035n;
            C5065d c5065d = new C5065d(interfaceC4970e, gVar2.f41068n);
            InterfaceC5143a a10 = gVar2.f41063h.a();
            a10.b(c5065d, gVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + c5065d + ", data: " + obj + ", encoder: " + d2 + ", duration: " + N1.j.a(elapsedRealtimeNanos));
            }
            if (a10.m(c5065d) != null) {
                this.f41041z = c5065d;
                this.f41038w = new C5064c(Collections.singletonList(this.f41040y.f41817a), this.f41035n, this);
                this.f41040y.f41819c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.f41041z + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.f41036u.a(this.f41040y.f41817a, g4.a(), this.f41040y.f41819c, this.f41040y.f41819c.d(), this.f41040y.f41817a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z3 = true;
                if (z3) {
                    throw th;
                }
                this.f41040y.f41819c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
