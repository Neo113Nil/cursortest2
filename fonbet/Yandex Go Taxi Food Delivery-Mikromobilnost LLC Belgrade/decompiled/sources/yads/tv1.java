package yads;

import android.content.Context;
import defpackage.c081;
import defpackage.d881;
import defpackage.dv81;
import defpackage.dvw;
import defpackage.j18;
import defpackage.jq71;
import defpackage.kv81;
import defpackage.lg71;
import defpackage.li61;
import defpackage.lq81;
import defpackage.mf60;
import defpackage.mh71;
import defpackage.ne71;
import defpackage.nn61;
import defpackage.ny61;
import defpackage.rp81;
import defpackage.sj61;
import defpackage.tj61;
import defpackage.tse;
import defpackage.u171;
import defpackage.ua71;
import defpackage.vi71;
import defpackage.wd71;
import defpackage.wls;
import defpackage.wvb1;
import defpackage.xj81;
import defpackage.y191;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* loaded from: classes7.dex */
public final class tv1 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ lg71 d;
    public final /* synthetic */ li61 e;
    public final /* synthetic */ xj81 f;
    public final /* synthetic */ d881 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv1(Context context, lg71 lg71Var, li61 li61Var, xj81 xj81Var, d881 d881Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.c = context;
        this.d = lg71Var;
        this.e = li61Var;
        this.f = xj81Var;
        this.g = d881Var;
        this.h = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new tv1(this.c, this.d, this.e, this.f, this.g, this.h, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((tv1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yl3 yl3Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        lv1 lv1Var = null;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        lq81 a = lq81.c.a(this.c);
        int i2 = a.a;
        WeakHashMap weakHashMap = a.b;
        if (weakHashMap.size() != i2 && !weakHashMap.containsKey(this.d) && this.e != null) {
            jq71 jq71Var = this.f.a;
            Context context = this.c;
            String str = this.g.B;
            if (str != null) {
                yl3.c.getClass();
                yl3Var = (yl3) yl3.d.get(str);
                if (yl3Var == null) {
                    yl3Var = yl3.e;
                }
            } else {
                yl3Var = yl3.e;
            }
            try {
                lv1Var = new lv1(context, new rp81(yl3Var), null);
            } catch (Throwable unused) {
            }
            if (lv1Var != null) {
                lg71 lg71Var = this.d;
                li61 li61Var = this.e;
                boolean z = this.h;
                this.b = 1;
                j18 j18Var = new j18(1, dvw.b(this));
                j18Var.u();
                vi71 vi71Var = new vi71(17, a, lg71Var, new wvb1(z, j18Var));
                if (weakHashMap.size() < i2) {
                    weakHashMap.put(lg71Var, lv1Var);
                }
                if (li61Var instanceof kv81) {
                    lv1Var.a(((kv81) li61Var).a, vi71Var);
                } else if (li61Var instanceof y191) {
                    String str2 = ((y191) li61Var).a;
                    if (lv1Var.l instanceof wd71) {
                        lv1Var.l = new ua71(vi71Var);
                        c081 c081Var = lv1Var.m;
                        lv1 lv1Var2 = c081Var.a;
                        dv81 dv81Var = c081Var.c;
                        nn61 nn61Var = c081Var.b;
                        tj61 tj61Var = new mh71(lv1Var2, c081Var, dv81Var, nn61Var, nn61Var, nn61Var).c;
                        lv1Var2.setHtmlWebViewListener(new u171(tj61Var));
                        ne71.a(tj61Var.a.getContext(), tj61Var.g, new sj61(tj61Var, str2, 0));
                    }
                }
                if (!z && (j18Var.t() instanceof mf60)) {
                    j18Var.resumeWith(zy11Var);
                }
                Object s = j18Var.s();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (s == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return zy11Var;
    }
}
