package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class dfn extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ float u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfn(float f, float f2, float f3, float f4, int i) {
        super(0);
        this.r = i;
        this.s = f;
        this.t = f2;
        this.u = f3;
        this.v = f4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                float f = this.u;
                float f2 = this.v;
                Float valueOf = Float.valueOf(ocg.m(f, f2, 0.0f, 0.0f));
                float f3 = this.s;
                Float valueOf2 = Float.valueOf(ocg.m(f, f2, f3, 0.0f));
                float f4 = this.t;
                return new Float[]{valueOf, valueOf2, Float.valueOf(ocg.m(f, f2, f3, f4)), Float.valueOf(ocg.m(f, f2, 0.0f, f4))};
            default:
                float f5 = this.u;
                Float valueOf3 = Float.valueOf(Math.abs(f5 - 0.0f));
                Float valueOf4 = Float.valueOf(Math.abs(f5 - this.s));
                float f6 = this.t;
                float f7 = this.v;
                return new Float[]{valueOf3, valueOf4, Float.valueOf(Math.abs(f7 - f6)), Float.valueOf(Math.abs(f7 - 0.0f))};
        }
    }
}
