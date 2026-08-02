package defpackage;

import com.yandex.go.tariffcard.ui.model.SectionSeparatorMarginType;

/* loaded from: classes14.dex */
public final class rix0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ mix0 b;

    public /* synthetic */ rix0(mix0 mix0Var, int i) {
        this.a = i;
        this.b = mix0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        mix0 mix0Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (jl40.l(str, "GLUED_SECTION_NAME") || jl40.l(str, "CAROUSEL_SECTION_NAME")) {
                    return null;
                }
                return mix0Var.b(SectionSeparatorMarginType.BOTTOM);
            default:
                if (jl40.l((String) obj, "CAROUSEL_SECTION_NAME")) {
                    return null;
                }
                return mix0Var.b(SectionSeparatorMarginType.NONE);
        }
    }
}
