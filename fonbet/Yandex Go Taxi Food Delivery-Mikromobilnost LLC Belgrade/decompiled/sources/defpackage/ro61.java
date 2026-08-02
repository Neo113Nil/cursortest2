package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class ro61 implements fh81 {
    public static final ro61 b = new ro61();
    public final List a;

    public ro61(r871 r871Var) {
        this.a = Collections.singletonList(r871Var);
    }

    @Override // defpackage.fh81
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.fh81
    public final long b(int i) {
        if (i == 0) {
            return 0L;
        }
        w511.q();
        return 0L;
    }

    @Override // defpackage.fh81
    public final List d(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    public ro61() {
        this.a = Collections.EMPTY_LIST;
    }

    @Override // defpackage.fh81
    public final int a() {
        return 1;
    }
}
