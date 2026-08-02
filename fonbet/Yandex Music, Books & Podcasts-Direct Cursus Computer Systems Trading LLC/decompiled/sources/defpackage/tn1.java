package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class tn1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pjc[] b;

    public /* synthetic */ tn1(pjc[] pjcVarArr, int i) {
        this.a = i;
        this.b = pjcVarArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new dn1[this.b.length];
            case 1:
                return new pn2[this.b.length];
            case 2:
                return new Boolean[this.b.length];
            case 3:
                return new brp[this.b.length];
            case 4:
                return new Boolean[this.b.length];
            case 5:
                return new p4u[this.b.length];
            default:
                return new na6[this.b.length];
        }
    }
}
