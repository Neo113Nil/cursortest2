package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class w60 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w60(long j, int i) {
        super(0);
        this.r = i;
        this.s = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        long j = this.s;
        switch (i) {
            case 0:
                ci0 ci0Var = qjb.a;
                long n = qee.n() - j;
                vtm vtmVar = new vtm((Map) new LinkedHashMap());
                vtmVar.u(n, "timespan");
                return vtmVar;
            case 1:
                ci0 ci0Var2 = qjb.a;
                long n2 = qee.n() - j;
                vtm vtmVar2 = new vtm((Map) new LinkedHashMap());
                vtmVar2.u(n2, "timespan");
                return vtmVar2;
            default:
                return new fma(j);
        }
    }
}
