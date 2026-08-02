package defpackage;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class mt8 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ix8 s;
    public final /* synthetic */ rt8 t;
    public final /* synthetic */ c2a u;
    public final /* synthetic */ xzb v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mt8(ix8 ix8Var, xzb xzbVar, rt8 rt8Var, c2a c2aVar, xzb xzbVar2, int i) {
        super(1);
        this.r = i;
        this.s = ix8Var;
        this.t = rt8Var;
        this.u = c2aVar;
        this.v = xzbVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                c2a c2aVar = this.u;
                Rect G = rt8.G(this.t, this.s, c2aVar.getResources(), this.v);
                int i = G.left;
                int i2 = G.top;
                int i3 = G.right;
                int i4 = G.bottom;
                c2aVar.s = i;
                c2aVar.t = i3;
                c2aVar.q = i2;
                c2aVar.r = i4;
                c2aVar.requestLayout();
                break;
            default:
                c2a c2aVar2 = this.u;
                Rect G2 = rt8.G(this.t, this.s, c2aVar2.getResources(), this.v);
                int i5 = G2.left;
                int i6 = G2.top;
                int i7 = G2.right;
                int i8 = G2.bottom;
                c2aVar2.m = i5;
                c2aVar2.n = i7;
                c2aVar2.k = i6;
                c2aVar2.l = i8;
                c2aVar2.requestLayout();
                break;
        }
        return Unit.a;
    }
}
