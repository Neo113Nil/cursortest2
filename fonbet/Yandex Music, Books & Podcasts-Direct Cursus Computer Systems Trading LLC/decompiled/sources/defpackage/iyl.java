package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class iyl implements pyc {
    public final /* synthetic */ u0s a;
    public final /* synthetic */ s3e b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ ozl d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ ryc g;
    public final /* synthetic */ long h;

    public iyl(u0s u0sVar, s3e s3eVar, Function0 function0, ozl ozlVar, int i, Function2 function2, ryc rycVar, long j) {
        this.a = u0sVar;
        this.b = s3eVar;
        this.c = function0;
        this.d = ozlVar;
        this.e = i;
        this.f = function2;
        this.g = rycVar;
        this.h = j;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        hq5 hq5Var = (hq5) obj2;
        ((Number) obj3).intValue();
        ((u0s) obj).getClass();
        s3e s3eVar = this.b;
        u1g.g(this.c, this.d, this.e, this.a, this.f, new rzl(s3eVar, 1), new rzl(s3eVar, 0), this.g, this.h, hq5Var, 0);
        return Unit.a;
    }
}
