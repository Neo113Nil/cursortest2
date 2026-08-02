package defpackage;

import androidx.compose.animation.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class al0 extends uif implements Function2 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ wn5 v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(wn5 wn5Var, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(2);
        this.v = wn5Var;
        this.s = obj;
        this.u = obj2;
        this.t = obj3;
        this.x = obj4;
        this.y = obj5;
        this.w = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                ((Number) obj2).intValue();
                d8t d8tVar = (d8t) this.s;
                yci yciVar = (yci) this.u;
                Function1 function1 = (Function1) this.t;
                g40 g40Var = (g40) this.y;
                Function1 function12 = (Function1) this.x;
                a.a(d8tVar, yciVar, function1, g40Var, function12, this.v, (hq5) obj, rvf.R(this.w | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                d8t d8tVar2 = (d8t) this.s;
                Function1 function13 = (Function1) this.t;
                yci yciVar2 = (yci) this.u;
                e9b e9bVar = (e9b) this.x;
                vpb vpbVar = (vpb) this.y;
                etn.i(d8tVar2, function13, yciVar2, e9bVar, vpbVar, this.v, (hq5) obj, rvf.R(this.w | 1));
                break;
            default:
                ((Number) obj2).intValue();
                this.v.k(this.s, this.u, this.t, this.x, this.y, (hq5) obj, rvf.R(this.w) | 1);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(d8t d8tVar, yci yciVar, Function1 function1, g40 g40Var, Function1 function12, wn5 wn5Var, int i) {
        super(2);
        this.s = d8tVar;
        this.u = yciVar;
        this.t = function1;
        this.y = g40Var;
        this.x = function12;
        this.v = wn5Var;
        this.w = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al0(d8t d8tVar, Function1 function1, yci yciVar, e9b e9bVar, vpb vpbVar, wn5 wn5Var, int i) {
        super(2);
        this.s = d8tVar;
        this.t = function1;
        this.u = yciVar;
        this.x = e9bVar;
        this.y = vpbVar;
        this.v = wn5Var;
        this.w = i;
    }
}
