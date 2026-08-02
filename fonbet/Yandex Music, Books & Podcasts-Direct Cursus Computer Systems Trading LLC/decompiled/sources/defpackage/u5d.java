package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class u5d implements Function1 {
    public final /* synthetic */ long a;

    public u5d(long j) {
        this.a = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        opf opfVar = (opf) obj;
        opfVar.getClass();
        jpa.D0(opfVar, this.a, 0.0f, 0L, 0.0f, null, 3, 62);
        opfVar.a();
        return Unit.a;
    }
}
