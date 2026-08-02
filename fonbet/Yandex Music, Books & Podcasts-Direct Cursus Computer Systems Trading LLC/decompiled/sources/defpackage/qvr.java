package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qvr extends uif implements Function1 {
    public final /* synthetic */ float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvr(float f) {
        super(1);
        this.r = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qoa qoaVar = (qoa) obj;
        qoaVar.a(Boolean.FALSE, 0.0f);
        qoaVar.a(Boolean.TRUE, this.r);
        return Unit.a;
    }
}
