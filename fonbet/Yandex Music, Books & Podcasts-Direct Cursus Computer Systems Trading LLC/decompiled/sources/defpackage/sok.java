package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class sok extends cg6 {
    public cr j;
    public f9b k;
    public Iterator l;
    public List m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ m p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sok(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.r(null, null, null, this);
    }
}
