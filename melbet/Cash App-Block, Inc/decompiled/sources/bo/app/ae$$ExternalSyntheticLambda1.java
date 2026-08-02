package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ae$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ t9 f$0;

    public /* synthetic */ ae$$ExternalSyntheticLambda1(t9 t9Var, int i) {
        this.$r8$classId = i;
        this.f$0 = t9Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        t9 t9Var = this.f$0;
        switch (i) {
            case 0:
                return ae.a(t9Var);
            case 1:
                return ee.a(t9Var);
            default:
                return l2.b(t9Var);
        }
    }
}
