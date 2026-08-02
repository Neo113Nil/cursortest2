package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class agm extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ fpa s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agm(fpa fpaVar, int i) {
        super(1);
        this.r = i;
        this.s = fpaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return this.s.b(ngg.F(obj));
            case 1:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                return this.s.b(new y7o(null, r7wVar));
            default:
                ((Unit) obj).getClass();
                return this.s.c();
        }
    }
}
