package defpackage;

/* loaded from: classes.dex */
public final class z extends defpackage.p90 implements defpackage.m00 {
    public final /* synthetic */ int AARZUJiTa;
    public final /* synthetic */ defpackage.a0 xiZrDbcSW0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(defpackage.a0 a0Var, int i) {
        super(4);
        this.xiZrDbcSW0 = a0Var;
        this.AARZUJiTa = i;
    }

    @Override // defpackage.m00
    public final java.lang.Object riuEU0zW4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        int intValue3 = ((java.lang.Number) obj3).intValue();
        int intValue4 = ((java.lang.Number) obj4).intValue();
        defpackage.a0 a0Var = this.xiZrDbcSW0;
        defpackage.c1NqjJifC7 c1nqjjifc7 = a0Var.adDC3e2L;
        ((android.view.autofill.AutofillManager) c1nqjjifc7.xiZrDbcSW0).notifyViewEntered(a0Var.AARZUJiTa, this.AARZUJiTa, new android.graphics.Rect(intValue, intValue2, intValue3, intValue4));
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
