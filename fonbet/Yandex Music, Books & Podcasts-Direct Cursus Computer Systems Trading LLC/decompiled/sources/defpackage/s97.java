package defpackage;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class s97 implements ea7, ba7 {
    public final List a;
    public final wf7 b;
    public final da7 c;
    public int d = -1;
    public daf e;
    public List f;
    public int g;
    public volatile jci h;
    public File i;

    public s97(List list, wf7 wf7Var, da7 da7Var) {
        this.a = list;
        this.b = wf7Var;
        this.c = da7Var;
    }

    @Override // defpackage.ea7
    public final boolean b() {
        while (true) {
            List list = this.f;
            boolean z = false;
            if (list != null && this.g < list.size()) {
                this.h = null;
                while (!z && this.g < this.f.size()) {
                    List list2 = this.f;
                    int i = this.g;
                    this.g = i + 1;
                    kci kciVar = (kci) list2.get(i);
                    File file = this.i;
                    wf7 wf7Var = this.b;
                    this.h = kciVar.a(file, wf7Var.e, wf7Var.f, wf7Var.i);
                    if (this.h != null && this.b.c(this.h.c.a()) != null) {
                        this.h.c.d(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            daf dafVar = (daf) this.a.get(this.d);
            wf7 wf7Var2 = this.b;
            File l = wf7Var2.h.e().l(new t97(dafVar, wf7Var2.n));
            this.i = l;
            if (l != null) {
                this.e = dafVar;
                this.f = this.b.c.a().f(l);
                this.g = 0;
            }
        }
    }

    @Override // defpackage.ba7
    public final void c(Exception exc) {
        this.c.a(this.e, exc, this.h.c, 3);
    }

    @Override // defpackage.ea7
    public final void cancel() {
        jci jciVar = this.h;
        if (jciVar != null) {
            jciVar.c.cancel();
        }
    }

    @Override // defpackage.ba7
    public final void g(Object obj) {
        this.c.c(this.e, obj, this.h.c, 3, this.e);
    }
}
