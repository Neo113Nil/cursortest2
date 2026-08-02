package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.RemoteViews;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class pw0 extends uif implements Function2 {
    public final /* synthetic */ xqn r;
    public final /* synthetic */ xqn s;
    public final /* synthetic */ xqn t;
    public final /* synthetic */ RemoteViews u;
    public final /* synthetic */ xne v;
    public final /* synthetic */ xqn w;
    public final /* synthetic */ xqn x;
    public final /* synthetic */ xqn y;
    public final /* synthetic */ xqn z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pw0(xqn xqnVar, xqn xqnVar2, xqn xqnVar3, Context context, RemoteViews remoteViews, xne xneVar, xqn xqnVar4, xqn xqnVar5, xqn xqnVar6, e9t e9tVar, xqn xqnVar7, xqn xqnVar8, xqn xqnVar9) {
        super(2);
        this.r = xqnVar;
        this.s = xqnVar2;
        this.t = xqnVar3;
        this.u = remoteViews;
        this.v = xneVar;
        this.w = xqnVar4;
        this.x = xqnVar6;
        this.y = xqnVar8;
        this.z = xqnVar9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m0k m0kVar;
        tkd tkdVar = (tkd) obj2;
        if (tkdVar instanceof jg) {
            xqn xqnVar = this.r;
            if (xqnVar.a != null) {
                Log.w("GlanceAppWidget", "More than one clickable defined on the same GlanceModifier, only the last one will be used.");
            }
            xqnVar.a = tkdVar;
        } else if (tkdVar instanceof yov) {
            this.s.a = tkdVar;
        } else if (tkdVar instanceof bxd) {
            this.t.a = tkdVar;
        } else if (tkdVar instanceof uj2) {
            uj2 uj2Var = (uj2) tkdVar;
            int i = this.v.a;
            if (uj2Var instanceof uj2) {
                b95 b95Var = uj2Var.a;
                boolean z = b95Var instanceof sfc;
                RemoteViews remoteViews = this.u;
                if (z) {
                    remoteViews.setInt(i, "setBackgroundColor", c3x.U(((sfc) b95Var).a));
                } else if (b95Var instanceof n2o) {
                    int i2 = ((n2o) b95Var).a;
                    if (Build.VERSION.SDK_INT >= 31) {
                        vvn.d(remoteViews, i, "setBackgroundColor", i2);
                    } else {
                        remoteViews.setInt(i, "setBackgroundResource", i2);
                    }
                } else {
                    Log.w("GlanceAppWidget", "Unexpected background color modifier: " + b95Var);
                }
            }
        } else if (tkdVar instanceof m0k) {
            xqn xqnVar2 = this.w;
            m0k m0kVar2 = (m0k) xqnVar2.a;
            if (m0kVar2 != null) {
                m0k m0kVar3 = (m0k) tkdVar;
                m0kVar = new m0k(m0kVar2.a.a(m0kVar3.a), m0kVar2.b.a(m0kVar3.b), m0kVar2.c.a(m0kVar3.c), m0kVar2.d.a(m0kVar3.d), m0kVar2.e.a(m0kVar3.e), m0kVar2.f.a(m0kVar3.f));
            } else {
                m0kVar = (m0k) tkdVar;
            }
            xqnVar2.a = m0kVar;
        } else if (tkdVar instanceof yl6) {
            this.x.a = ((yl6) tkdVar).a;
        } else if (!(tkdVar instanceof o40)) {
            if (tkdVar instanceof c6b) {
                this.y.a = tkdVar;
            } else if (tkdVar instanceof lfp) {
                this.z.a = tkdVar;
            } else {
                Log.w("GlanceAppWidget", "Unknown modifier '" + tkdVar + "', nothing done.");
            }
        }
        return Unit.a;
    }
}
