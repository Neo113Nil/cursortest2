package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes4.dex */
public final class ook extends cg6 {
    public cr j;
    public f9b k;
    public LinkedHashSet l;
    public Iterator m;
    public List n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ m q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ook(m mVar, cg6 cg6Var) {
        super(cg6Var);
        this.q = mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.n(null, null, null, this);
    }
}
