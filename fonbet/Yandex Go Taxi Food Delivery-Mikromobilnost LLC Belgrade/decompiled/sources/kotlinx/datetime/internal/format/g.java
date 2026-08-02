package kotlinx.datetime.internal.format;

import defpackage.e421;
import defpackage.ekt0;
import defpackage.gwk0;
import defpackage.k7;
import defpackage.m9s;
import defpackage.ntf0;
import defpackage.oyr;
import defpackage.rxq;
import defpackage.vbs0;
import defpackage.w511;
import defpackage.wf90;

/* loaded from: classes9.dex */
public abstract class g implements rxq {
    public final e421 a;
    public final int b;
    public final Integer c;
    public final int d;

    public g(e421 e421Var, int i, Integer num) {
        this.a = e421Var;
        this.b = i;
        this.c = num;
        int i2 = e421Var.g;
        this.d = i2;
        if (i < 0) {
            w511.f(oyr.j(i, "The minimum number of digits (", ") is negative"));
            throw null;
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is less than the minimum number of digits (" + i + ')').toString());
        }
        if (num == null || num.intValue() > i) {
            return;
        }
        throw new IllegalArgumentException(("The space padding (" + num + ") should be more than the minimum number of digits (" + i + ')').toString());
    }

    @Override // defpackage.rxq
    public final m9s a() {
        return this.c != null ? new ekt0() : new vbs0(this.b, 3, new UnsignedIntFieldFormatDirective$formatter$formatter$1(1, this.a.a, ntf0.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0));
    }

    @Override // defpackage.rxq
    public final wf90 b() {
        Integer valueOf = Integer.valueOf(this.b);
        Integer valueOf2 = Integer.valueOf(this.d);
        e421 e421Var = this.a;
        return gwk0.z(valueOf, valueOf2, this.c, e421Var.a, e421Var.d, false);
    }

    @Override // defpackage.rxq
    public final /* bridge */ /* synthetic */ k7 c() {
        return this.a;
    }
}
