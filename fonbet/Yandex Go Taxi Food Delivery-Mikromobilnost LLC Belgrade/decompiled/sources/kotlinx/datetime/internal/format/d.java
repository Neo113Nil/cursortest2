package kotlinx.datetime.internal.format;

import defpackage.f421;
import defpackage.gn60;
import defpackage.hhc0;
import defpackage.k7;
import defpackage.m9s;
import defpackage.ntf0;
import defpackage.qmi0;
import defpackage.rxg;
import defpackage.rxq;
import defpackage.scc;
import defpackage.wf90;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class d implements rxq {
    public final k7 a;

    public d(k7 k7Var) {
        this.a = k7Var;
    }

    @Override // defpackage.rxq
    public final m9s a() {
        return new rxg(new ReducedIntFieldDirective$formatter$1(this.a.a()));
    }

    @Override // defpackage.rxq
    public final wf90 b() {
        k7 k7Var = this.a;
        ntf0 a = k7Var.a();
        String c = k7Var.c();
        List singletonList = Collections.singletonList(new gn60(Collections.singletonList(new qmi0(a, c))));
        EmptyList emptyList = EmptyList.a;
        return new wf90(emptyList, scc.g(new wf90(singletonList, emptyList), new wf90(scc.g(new hhc0("+"), new gn60(Collections.singletonList(new f421(null, null, a, c, false)))), emptyList), new wf90(scc.g(new hhc0("-"), new gn60(Collections.singletonList(new f421(null, null, a, c, true)))), emptyList)));
    }

    @Override // defpackage.rxq
    public final k7 c() {
        return this.a;
    }
}
