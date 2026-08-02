package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class lif extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ yx7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lif(yx7 yx7Var, int i) {
        super(1);
        this.r = i;
        this.s = yx7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                return this.s.invoke(new dwm(obj));
            default:
                r7w r7wVar = (r7w) obj;
                r7wVar.getClass();
                return this.s.invoke(new cwm(r7wVar));
        }
    }
}
