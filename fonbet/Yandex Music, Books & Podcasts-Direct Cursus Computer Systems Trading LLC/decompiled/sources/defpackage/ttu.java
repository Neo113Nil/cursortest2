package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class ttu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2v b;

    public /* synthetic */ ttu(s2v s2vVar, int i) {
        this.a = i;
        this.b = s2vVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            case 1:
                this.b.d();
                break;
            case 2:
                this.b.e();
                break;
            default:
                this.b.d();
                break;
        }
        return Boolean.TRUE;
    }
}
