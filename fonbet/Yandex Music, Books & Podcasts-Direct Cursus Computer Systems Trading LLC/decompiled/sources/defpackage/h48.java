package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* loaded from: classes.dex */
public final class h48 implements ca7 {
    public final Resources.Theme a;
    public final Resources b;
    public final i48 c;
    public final int d;
    public Object e;

    public h48(Resources.Theme theme, Resources resources, i48 i48Var, int i) {
        this.a = theme;
        this.b = resources;
        this.c = i48Var;
        this.d = i;
    }

    @Override // defpackage.ca7
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.ca7
    public final void b() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.l(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.ca7
    public final void d(nsm nsmVar, ba7 ba7Var) {
        try {
            Object m = this.c.m(this.d, this.a, this.b);
            this.e = m;
            ba7Var.g(m);
        } catch (Resources.NotFoundException e) {
            ba7Var.c(e);
        }
    }

    @Override // defpackage.ca7
    public final int e() {
        return 1;
    }

    @Override // defpackage.ca7
    public final void cancel() {
    }
}
