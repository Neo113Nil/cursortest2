package kotlinx.datetime.internal.format;

import defpackage.gn60;
import defpackage.hbs;
import defpackage.k7;
import defpackage.m9s;
import defpackage.ntf0;
import defpackage.rxg;
import defpackage.rxq;
import defpackage.wf90;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class a implements rxq {
    public final k7 a;

    public a(k7 k7Var, List list) {
        this.a = k7Var;
    }

    @Override // defpackage.rxq
    public final m9s a() {
        return new rxg(new DecimalFractionFieldFormatDirective$formatter$1(1, this.a.a(), ntf0.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0));
    }

    @Override // defpackage.rxq
    public final wf90 b() {
        k7 k7Var = this.a;
        return new wf90(Collections.singletonList(new gn60(Collections.singletonList(new hbs(k7Var.a(), k7Var.c())))), EmptyList.a);
    }

    @Override // defpackage.rxq
    public final k7 c() {
        return this.a;
    }
}
