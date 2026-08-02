package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class tum extends uif implements Function1 {
    public final /* synthetic */ long r;
    public final /* synthetic */ amr s;
    public final /* synthetic */ float t;
    public final /* synthetic */ long u;
    public final /* synthetic */ sdr v;
    public final /* synthetic */ sdr w;
    public final /* synthetic */ sdr x;
    public final /* synthetic */ sdr y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tum(long j, amr amrVar, float f, long j2, wje wjeVar, wje wjeVar2, wje wjeVar3, wje wjeVar4) {
        super(1);
        this.r = j;
        this.s = amrVar;
        this.t = f;
        this.u = j2;
        this.v = wjeVar;
        this.w = wjeVar2;
        this.x = wjeVar3;
        this.y = wjeVar4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        jpa jpaVar = (jpa) obj;
        long j = this.r;
        amr amrVar = this.s;
        vum.c(jpaVar, 0.0f, 360.0f, j, amrVar);
        float floatValue = ((Number) this.w.getValue()).floatValue();
        sdr sdrVar = this.x;
        float abs = Math.abs(floatValue - ((Number) sdrVar.getValue()).floatValue());
        float floatValue2 = ((Number) sdrVar.getValue()).floatValue() + ((Number) this.y.getValue()).floatValue() + (((((Number) this.v.getValue()).intValue() * 216.0f) % 360.0f) - 90.0f);
        if (amrVar.c == 0) {
            f = 0.0f;
        } else {
            f = ((this.t / (vum.a / 2)) * 57.29578f) / 2.0f;
        }
        vum.c(jpaVar, floatValue2 + f, Math.max(abs, 0.1f), this.u, amrVar);
        return Unit.a;
    }
}
