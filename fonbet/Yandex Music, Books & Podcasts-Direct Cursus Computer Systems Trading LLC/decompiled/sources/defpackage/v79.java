package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class v79 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ View s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ xzb u;
    public final /* synthetic */ dfb v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v79(ozw ozwVar, View view, dp8 dp8Var, xzb xzbVar, dfb dfbVar, int i) {
        super(1);
        this.r = i;
        this.s = view;
        this.t = dp8Var;
        this.u = xzbVar;
        this.v = dfbVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [dp8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dp8, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ozw.c(this.s, this.t, this.u, this.v);
                break;
            default:
                ozw.h(this.s, this.t, this.u, this.v);
                break;
        }
        return Unit.a;
    }
}
