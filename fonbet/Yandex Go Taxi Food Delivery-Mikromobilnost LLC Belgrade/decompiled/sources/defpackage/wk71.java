package defpackage;

import java.util.List;
import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class wk71 implements fh81 {
    public final long a;
    public final wk2 b;

    public /* synthetic */ wk71(long j, wk2 wk2Var) {
        this.a = j;
        this.b = wk2Var;
    }

    @Override // defpackage.fh81
    public int a(long j) {
        return this.a > j ? 0 : -1;
    }

    @Override // defpackage.fh81
    public long b(int i) {
        if (i == 0) {
            return this.a;
        }
        w511.q();
        return 0L;
    }

    @Override // defpackage.fh81
    public List d(long j) {
        if (j >= this.a) {
            return this.b;
        }
        p481 p481Var = t31.b;
        return wk2.x;
    }

    @Override // defpackage.fh81
    public int a() {
        return 1;
    }
}
