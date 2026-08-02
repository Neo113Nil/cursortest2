package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class o3r implements ea7, da7 {
    public final wf7 a;
    public final xf7 b;
    public volatile int c;
    public volatile s97 d;
    public volatile Object e;
    public volatile jci f;
    public volatile t97 g;

    public o3r(wf7 wf7Var, xf7 xf7Var) {
        this.a = wf7Var;
        this.b = xf7Var;
    }

    @Override // defpackage.da7
    public final void a(daf dafVar, Exception exc, ca7 ca7Var, int i) {
        this.b.a(dafVar, exc, ca7Var, this.f.c.e());
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (d(r0) == false) goto L16;
     */
    @Override // defpackage.ea7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        if (this.e != null) {
            Object obj = this.e;
            this.e = null;
            try {
            } catch (IOException e) {
                if (Log.isLoggable("SourceGenerator", 3)) {
                    Log.d("SourceGenerator", "Failed to properly rewind or write data to cache", e);
                }
            }
        }
        if (this.d == null || !this.d.b()) {
            this.d = null;
            this.f = null;
            boolean z = false;
            while (!z && this.c < this.a.b().size()) {
                ArrayList b = this.a.b();
                int i = this.c;
                this.c = i + 1;
                this.f = (jci) b.get(i);
                if (this.f != null && (this.a.p.a(this.f.c.e()) || this.a.c(this.f.c.a()) != null)) {
                    this.f.c.d(this.a.o, new apo(this, this.f, false, 6));
                    z = true;
                }
            }
            return z;
        }
        return true;
    }

    @Override // defpackage.da7
    public final void c(daf dafVar, Object obj, ca7 ca7Var, int i, daf dafVar2) {
        this.b.c(dafVar, obj, ca7Var, this.f.c.e(), dafVar);
    }

    @Override // defpackage.ea7
    public final void cancel() {
        jci jciVar = this.f;
        if (jciVar != null) {
            jciVar.c.cancel();
        }
    }

    public final boolean d(Object obj) {
        Throwable th;
        int i = esg.b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            oa7 g = this.a.c.a().g(obj);
            Object a = g.a();
            m6b d = this.a.d(a);
            es6 es6Var = new es6(d, a, this.a.i);
            daf dafVar = this.f.a;
            wf7 wf7Var = this.a;
            t97 t97Var = new t97(dafVar, wf7Var.n);
            w68 e = wf7Var.h.e();
            e.b(t97Var, es6Var);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + t97Var + ", data: " + obj + ", encoder: " + d + ", duration: " + esg.a(elapsedRealtimeNanos));
            }
            if (e.l(t97Var) != null) {
                this.g = t97Var;
                this.d = new s97(Collections.singletonList(this.f.a), this.a, this);
                this.f.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Log.d("SourceGenerator", "Attempt to write: " + this.g + ", data: " + obj + " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly...");
            }
            try {
                this.b.c(this.f.a, g.a(), this.f.c, this.f.c.e(), this.f.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f.c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
