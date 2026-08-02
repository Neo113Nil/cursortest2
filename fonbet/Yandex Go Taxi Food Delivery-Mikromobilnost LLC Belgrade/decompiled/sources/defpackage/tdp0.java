package defpackage;

/* loaded from: classes10.dex */
public final class tdp0 implements v8v {
    public final v8v a;
    public final Object b = new Object();
    public boolean c;
    public en7 d;

    public tdp0(v8v v8vVar) {
        this.a = v8vVar;
    }

    @Override // defpackage.v8v
    public final void a(long j, en7 en7Var) {
        synchronized (this.b) {
            this.c = true;
            this.d = en7Var;
        }
        v8v v8vVar = this.a;
        if (v8vVar != null) {
            v8vVar.a(j, new en7(1, this));
        } else {
            sgb1.d("ScreenFlashWrapper", "apply: screenFlash is null!");
            c();
        }
    }

    public final void b() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    v8v v8vVar = this.a;
                    if (v8vVar != null) {
                        v8vVar.clear();
                    } else {
                        sgb1.d("ScreenFlashWrapper", "completePendingScreenFlashClear: screenFlash is null!");
                    }
                } else {
                    sgb1.g(5, "ScreenFlashWrapper");
                }
                this.c = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.b) {
            try {
                en7 en7Var = this.d;
                if (en7Var != null) {
                    en7Var.a();
                }
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.v8v
    public final void clear() {
        b();
    }
}
