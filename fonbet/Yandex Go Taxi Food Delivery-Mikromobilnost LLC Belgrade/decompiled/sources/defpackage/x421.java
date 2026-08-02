package defpackage;

import ru.yandex.taxi.requirements.interactor.e0;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;
import ru.yandex.taxi.requirements.models.net.experiment.c;

/* loaded from: classes14.dex */
public final class x421 {
    public final e0 a;
    public final tt2 b;
    public final wiq0 c;
    public final hqj0 d;
    public final cjj0 e;
    public final dqe0 f;
    public final bqj0 g;
    public final vfx0 h;

    public x421(e0 e0Var, tt2 tt2Var, wiq0 wiq0Var, hqj0 hqj0Var, cjj0 cjj0Var, dqe0 dqe0Var, bqj0 bqj0Var, vfx0 vfx0Var) {
        this.a = e0Var;
        this.b = tt2Var;
        this.c = wiq0Var;
        this.d = hqj0Var;
        this.e = cjj0Var;
        this.f = dqe0Var;
        this.g = bqj0Var;
        this.h = vfx0Var;
    }

    public final r421 a(c cVar, String str, boolean z) {
        String str2;
        RequirementBubbleDto requirementBubbleDto = (RequirementBubbleDto) cVar.h.get(str);
        q421 q421Var = new q421(str, null);
        if (requirementBubbleDto == null || (str2 = requirementBubbleDto.d) == null) {
            return null;
        }
        String Y = d6z.Y(cVar, str2);
        bqj0 bqj0Var = this.g;
        String b = bqj0Var.b(cVar, requirementBubbleDto, str);
        if (b == null) {
            b = bqj0Var.c(Y);
        }
        if (b == null) {
            b = Y;
        }
        return new r421(Y, q421Var, z, b);
    }
}
