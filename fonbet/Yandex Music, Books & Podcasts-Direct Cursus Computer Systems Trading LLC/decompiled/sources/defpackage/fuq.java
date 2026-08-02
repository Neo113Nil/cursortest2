package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class fuq extends ezc implements Function1 {
    public final /* synthetic */ gq4 a;
    public final /* synthetic */ uqn b;
    public final /* synthetic */ uqn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuq(gq4 gq4Var, uqn uqnVar, uqn uqnVar2) {
        super(1, lxe.class, "scaleToOffset", "Slider$lambda$5$scaleToOffset(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;F)F", 0);
        this.a = gq4Var;
        this.b = uqnVar;
        this.c = uqnVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        gq4 gq4Var = this.a;
        float floatValue2 = ((Number) gq4Var.g()).floatValue();
        float floatValue3 = ((Number) gq4Var.m()).floatValue() - floatValue2;
        return Float.valueOf(fxf.I(this.b.a, this.c.a, yhn.c(floatValue3 == 0.0f ? 0.0f : (floatValue - floatValue2) / floatValue3, 0.0f, 1.0f)));
    }
}
