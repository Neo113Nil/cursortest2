package defpackage;

import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;

/* loaded from: classes14.dex */
public final class xi31 extends ad5 {
    public final c4r0 A;
    public final a201 B;
    public ob31 C;
    public final qnh x;
    public final b8r y;
    public final ag31 z;

    public xi31(qnh qnhVar, b8r b8rVar, ag31 ag31Var, c4r0 c4r0Var, a201 a201Var) {
        super(wi31.class);
        this.x = qnhVar;
        this.y = b8rVar;
        this.z = ag31Var;
        this.A = c4r0Var;
        this.B = a201Var;
    }

    public final void Kg(ob31 ob31Var, VerticalSelectorAnalytics$SelectionChangeReason verticalSelectorAnalytics$SelectionChangeReason) {
        String str = ob31Var.a;
        String str2 = ob31Var.b;
        ob31 ob31Var2 = this.C;
        String str3 = ob31Var2 != null ? ob31Var2.a : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = ob31Var2 != null ? ob31Var2.b : null;
        this.z.a(str, str2, str3, str4 != null ? str4 : "", verticalSelectorAnalytics$SelectionChangeReason);
    }
}
