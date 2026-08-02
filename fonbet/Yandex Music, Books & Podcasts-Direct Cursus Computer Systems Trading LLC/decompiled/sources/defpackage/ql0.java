package defpackage;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class ql0 implements Function2 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ yci b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ ql0(ek ekVar, ik ikVar, pyc pycVar, yci yciVar, Function2 function2, boolean z, wn5 wn5Var, int i) {
        this.e = ekVar;
        this.f = ikVar;
        this.g = pycVar;
        this.b = yciVar;
        this.h = function2;
        this.c = z;
        this.i = wn5Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                men.c(this.c, (Function0) this.e, this.b, (e9b) this.f, (vpb) this.g, (String) this.h, (wn5) this.i, (hq5) obj, rvf.R(this.d | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ivf.h((nmj) this.e, (tmb) this.f, this.b, this.c, (Activity) this.g, (dmj) this.h, (hmj) this.i, (hq5) obj, rvf.R(this.d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                lsq.h((ek) this.e, (ik) this.f, (pyc) this.g, this.b, (Function2) this.h, this.c, (wn5) this.i, (hq5) obj, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ ql0(nmj nmjVar, tmb tmbVar, yci yciVar, boolean z, Activity activity, dmj dmjVar, hmj hmjVar, int i) {
        this.e = nmjVar;
        this.f = tmbVar;
        this.b = yciVar;
        this.c = z;
        this.g = activity;
        this.h = dmjVar;
        this.i = hmjVar;
        this.d = i;
    }

    public /* synthetic */ ql0(boolean z, Function0 function0, yci yciVar, e9b e9bVar, vpb vpbVar, String str, wn5 wn5Var, int i) {
        this.c = z;
        this.e = function0;
        this.b = yciVar;
        this.f = e9bVar;
        this.g = vpbVar;
        this.h = str;
        this.i = wn5Var;
        this.d = i;
    }
}
