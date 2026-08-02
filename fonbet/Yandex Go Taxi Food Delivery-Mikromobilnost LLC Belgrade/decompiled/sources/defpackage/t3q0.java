package defpackage;

import com.yandex.go.design.divider.CardDivider;
import com.yandex.go.tariffcard.ui.model.SectionSeparatorMarginType;

/* loaded from: classes14.dex */
public final class t3q0 {
    public final viv0 a;
    public final int b;
    public final int c;
    public final int e;
    public final bdc d = new bdc(xng0.cardDivider);
    public final gdc f = new gdc(mqg0.black);

    public t3q0(zuj0 zuj0Var, viv0 viv0Var) {
        this.a = viv0Var;
        this.b = tje.u(8, ((avj0) zuj0Var).a);
        avj0 avj0Var = (avj0) zuj0Var;
        this.c = avj0Var.c(mrg0.go_design_card_divider_default_size);
        this.e = tje.u(1, avj0Var.a);
    }

    public final r3q0 a(SectionSeparatorMarginType sectionSeparatorMarginType) {
        return new r3q0(CardDivider.Type.BOTH, this.c, this.d, b(sectionSeparatorMarginType), null, 48);
    }

    public final p3q0 b(SectionSeparatorMarginType sectionSeparatorMarginType) {
        int i = s3q0.b[sectionSeparatorMarginType.ordinal()];
        if (i == 1) {
            return new p3q0(0, 0, 3);
        }
        int i2 = this.b;
        if (i == 2) {
            return new p3q0(i2, 0, 2);
        }
        if (i == 3) {
            return new p3q0(0, i2, 1);
        }
        if (i == 4) {
            return new p3q0(i2, i2);
        }
        w511.b();
        return null;
    }
}
