package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pbi extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Function0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbi(String str, Function0 function0, int i) {
        super(1);
        this.r = i;
        this.s = str;
        this.t = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                jfp jfpVar = (jfp) obj;
                wfp.k(jfpVar, this.s);
                wfp.h(jfpVar, new vr1(2, this.t));
                break;
            default:
                jfp jfpVar2 = (jfp) obj;
                wfp.x(jfpVar2, 1.0f);
                wfp.k(jfpVar2, this.s);
                wfp.h(jfpVar2, new vr1(3, this.t));
                break;
        }
        return Unit.a;
    }
}
