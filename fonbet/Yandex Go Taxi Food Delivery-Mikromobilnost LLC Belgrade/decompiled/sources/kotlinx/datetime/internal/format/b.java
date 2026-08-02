package kotlinx.datetime.internal.format;

import defpackage.duu0;
import defpackage.e421;
import defpackage.k7;
import defpackage.m9s;
import defpackage.oyr;
import defpackage.rxq;
import defpackage.svb1;
import defpackage.vbs0;
import defpackage.w511;
import defpackage.wf90;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class b implements rxq {
    public final e421 a;
    public final List b;
    public final String c;

    public b(e421 e421Var, List list, String str) {
        this.a = e421Var;
        this.b = list;
        this.c = str;
        int size = list.size();
        int i = (e421Var.c - e421Var.b) + 1;
        if (size == i) {
            return;
        }
        StringBuilder sb = new StringBuilder("The number of values (");
        sb.append(list.size());
        sb.append(") in ");
        sb.append(list);
        sb.append(" does not match the range of the field (");
        w511.f(oyr.s(sb, i, ')'));
        throw null;
    }

    @Override // defpackage.rxq
    public final m9s a() {
        return new vbs0(new NamedUnsignedIntFieldFormatDirective$formatter$1(1, this, b.class, "getStringValue", "getStringValue(Ljava/lang/Object;)Ljava/lang/String;", 0));
    }

    @Override // defpackage.rxq
    public final wf90 b() {
        List list = this.b;
        return new wf90(Collections.singletonList(new duu0(list, new svb1(this), "one of " + list + " for " + this.c)), EmptyList.a);
    }

    @Override // defpackage.rxq
    public final /* bridge */ /* synthetic */ k7 c() {
        return this.a;
    }
}
