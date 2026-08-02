package kotlinx.datetime.internal.format;

import defpackage.ekt0;
import defpackage.f421;
import defpackage.gn60;
import defpackage.gwk0;
import defpackage.hhc0;
import defpackage.k7;
import defpackage.m9s;
import defpackage.ntf0;
import defpackage.rxq;
import defpackage.scc;
import defpackage.vbs0;
import defpackage.wf90;
import defpackage.yci0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class f implements rxq {
    public final k7 a;
    public final Integer b;
    public final Integer c;

    public f(k7 k7Var, Integer num, Integer num2) {
        this.a = k7Var;
        this.b = num;
        this.c = num2;
        if (num.intValue() >= 0) {
            return;
        }
        yci0.x("The minimum number of digits (", num, ") is negative");
        throw null;
    }

    @Override // defpackage.rxq
    public final m9s a() {
        return this.c != null ? new ekt0() : new vbs0(this.b.intValue(), 1, new SignedIntFieldFormatDirective$formatter$formatter$1(1, this.a.a(), ntf0.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0));
    }

    @Override // defpackage.rxq
    public final wf90 b() {
        k7 k7Var = this.a;
        ntf0 a = k7Var.a();
        String c = k7Var.c();
        Integer num = this.b;
        Integer num2 = this.c;
        ArrayList i = scc.i(gwk0.z(num, null, num2, a, c, true));
        i.add(gwk0.z(num, 4, num2, a, c, false));
        List g = scc.g(new hhc0("+"), new gn60(Collections.singletonList(new f421(5, null, a, c, false))));
        EmptyList emptyList = EmptyList.a;
        i.add(new wf90(g, emptyList));
        return new wf90(emptyList, i);
    }

    @Override // defpackage.rxq
    public final k7 c() {
        return this.a;
    }
}
