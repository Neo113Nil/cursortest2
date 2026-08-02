package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class rum extends uif implements Function1 {
    public final /* synthetic */ float r;
    public final /* synthetic */ long s;
    public final /* synthetic */ amr t;
    public final /* synthetic */ long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rum(float f, long j, amr amrVar, long j2) {
        super(1);
        this.r = f;
        this.s = j;
        this.t = amrVar;
        this.u = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jpa jpaVar = (jpa) obj;
        float f = this.r * 360.0f;
        long j = this.s;
        amr amrVar = this.t;
        vum.c(jpaVar, 0.0f, 360.0f, j, amrVar);
        vum.c(jpaVar, 270.0f, f, this.u, amrVar);
        return Unit.a;
    }
}
