package defpackage;

import kotlinx.coroutines.flow.e;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.domain.c;

/* loaded from: classes5.dex */
public final class rt0 implements pt0 {
    public final Integer a;
    public final g8l0 b;
    public final f4l0 c;
    public final m2v d;
    public final is0 e;
    public final p6s f;
    public final z4s g;
    public final c h;
    public final tt0 i;
    public final bt0 j;
    public final hwy0 k;
    public final vv0 l;
    public final s5s m;

    public rt0(Integer num, g8l0 g8l0Var, f4l0 f4l0Var, m2v m2vVar, is0 is0Var, p6s p6sVar, z4s z4sVar, c cVar, tt0 tt0Var, bt0 bt0Var, hwy0 hwy0Var, vv0 vv0Var, s5s s5sVar) {
        this.a = num;
        this.b = g8l0Var;
        this.c = f4l0Var;
        this.d = m2vVar;
        this.e = is0Var;
        this.f = p6sVar;
        this.g = z4sVar;
        this.h = cVar;
        this.i = tt0Var;
        this.j = bt0Var;
        this.k = hwy0Var;
        this.l = vv0Var;
        this.m = s5sVar;
    }

    @Override // defpackage.pt0
    public final tpr a() {
        tpr d = this.c.d();
        m2v m2vVar = this.d;
        pb pbVar = (pb) m2vVar.c;
        pb pbVar2 = (pb) m2vVar.w;
        is0 is0Var = this.e;
        return new cd0(2, new tpr[]{d, pbVar, pbVar2, new hs0(((p3s) is0Var.a).b("delivery_order_form_address_details"), is0Var, 0), this.f.e(), e.d(this.g.a), e.d(this.i.a), this.j.b, new hs0(((p3s) is0Var.a).b("delivery_order_form_address_details"), is0Var, 1), e.t(this.k.b), e.d(this.l.a), this.m.b}, this);
    }
}
