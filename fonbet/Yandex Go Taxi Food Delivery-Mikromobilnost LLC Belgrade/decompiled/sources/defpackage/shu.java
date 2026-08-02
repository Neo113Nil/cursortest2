package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public final class shu implements fh81, ku81 {
    public final /* synthetic */ int a;
    public final List b;

    public shu(rqo rqoVar) {
        this.a = 0;
        rhu.Companion.getClass();
        List list = ((rhu) ((jbh) rqoVar).c(rhu.e).b()).c;
        this.b = list == null ? EmptyList.a : list;
    }

    @Override // defpackage.fh81
    public int a(long j) {
        switch (this.a) {
            case 1:
                if (j < 0) {
                }
                break;
        }
        return -1;
    }

    @Override // defpackage.fh81
    public long b(int i) {
        switch (this.a) {
            case 1:
                if (i != 0) {
                    w511.q();
                    break;
                }
                break;
        }
        return 0L;
    }

    @Override // defpackage.ku81
    public void c(o081 o081Var, vi71 vi71Var) {
        a441 a441Var = new a441(26, o081Var, vi71Var);
        for (uy71 uy71Var : this.b) {
            i281 a = o081Var.a(uy71Var);
            if (a == null) {
                a = null;
            }
            if (a != null) {
                a.c(uy71Var.c);
                a.a(uy71Var, a441Var);
            }
        }
    }

    @Override // defpackage.fh81
    public List d(long j) {
        switch (this.a) {
            case 1:
                return j >= 0 ? this.b : Collections.EMPTY_LIST;
            default:
                return this.b;
        }
    }

    @Override // defpackage.ku81
    public void e(o081 o081Var) {
    }

    @Override // defpackage.fh81
    public int a() {
        switch (this.a) {
        }
        return 1;
    }

    public /* synthetic */ shu(List list, int i) {
        this.a = i;
        this.b = list;
    }
}
