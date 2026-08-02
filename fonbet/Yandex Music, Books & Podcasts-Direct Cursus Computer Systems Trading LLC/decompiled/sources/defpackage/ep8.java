package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ep8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ View s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ xzb u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep8(x19 x19Var, View view, xzb xzbVar, dp8 dp8Var) {
        super(1);
        this.r = 4;
        this.s = view;
        this.u = xzbVar;
        this.t = dp8Var;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [dp8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [dp8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [dp8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [dp8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [dp8, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ?? r4 = this.t;
                szb u = r4.u();
                xzb xzbVar = this.u;
                om8 om8Var = u != null ? (om8) u.a(xzbVar) : null;
                szb o = r4.o();
                bg3.j(this.s, om8Var, o != null ? (pm8) o.a(xzbVar) : null);
                break;
            case 1:
                bg3.l(this.s, this.t.j(), this.u);
                break;
            case 2:
                bg3.m(this.s, this.t.s(), this.u);
                break;
            case 3:
                bg3.n(this.t, this.u, this.s);
                break;
            default:
                x19.G(this.t, this.u, this.s);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ep8(View view, dp8 dp8Var, xzb xzbVar, int i) {
        super(1);
        this.r = i;
        this.s = view;
        this.t = dp8Var;
        this.u = xzbVar;
    }
}
