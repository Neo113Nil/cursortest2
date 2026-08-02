package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class iyg extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ jyg s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyg(jyg jygVar, int i) {
        super(0);
        this.r = i;
        this.s = jygVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                jyg jygVar = this.s;
                return Boolean.valueOf((jygVar.a() == null && ((Throwable) jygVar.c.getValue()) == null) ? false : true);
            case 1:
                return Boolean.valueOf(((Throwable) this.s.c.getValue()) != null);
            case 2:
                jyg jygVar2 = this.s;
                return Boolean.valueOf(jygVar2.a() == null && ((Throwable) jygVar2.c.getValue()) == null);
            default:
                return Boolean.valueOf(this.s.a() != null);
        }
    }
}
