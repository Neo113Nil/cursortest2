package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class p9n implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ p9n(wxk wxkVar, boolean z, sdr sdrVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, yci yciVar, int i, int i2) {
        this.f = wxkVar;
        this.b = z;
        this.g = sdrVar;
        this.h = function0;
        this.i = function02;
        this.j = function03;
        this.k = function04;
        this.l = function05;
        this.m = function06;
        this.n = function07;
        this.c = yciVar;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int R = rvf.R(this.e | 1);
                u7g.l((oxn) this.f, (po6) this.g, this.d, this.b, (bzj) this.h, (bg5) this.i, (qfi) this.j, (qfi) this.k, (qfi) this.l, (qfi) this.m, (qfi) this.n, this.c, (hq5) obj, R);
                break;
            default:
                ((Integer) obj2).getClass();
                int R2 = rvf.R(this.d | 1);
                int R3 = rvf.R(this.e);
                ows.b((wxk) this.f, this.b, (sdr) this.g, (Function0) this.h, (Function0) this.i, (Function0) this.j, (Function0) this.k, (Function0) this.l, (Function0) this.m, (Function0) this.n, this.c, (hq5) obj, R2, R3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ p9n(oxn oxnVar, po6 po6Var, int i, boolean z, bzj bzjVar, bg5 bg5Var, qfi qfiVar, qfi qfiVar2, qfi qfiVar3, qfi qfiVar4, qfi qfiVar5, yci yciVar, int i2) {
        this.f = oxnVar;
        this.g = po6Var;
        this.d = i;
        this.b = z;
        this.h = bzjVar;
        this.i = bg5Var;
        this.j = qfiVar;
        this.k = qfiVar2;
        this.l = qfiVar3;
        this.m = qfiVar4;
        this.n = qfiVar5;
        this.c = yciVar;
        this.e = i2;
    }
}
