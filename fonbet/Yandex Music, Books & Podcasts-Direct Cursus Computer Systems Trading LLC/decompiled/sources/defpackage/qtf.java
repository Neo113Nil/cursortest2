package defpackage;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qtf extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qtf(ges gesVar, wn5 wn5Var, int i) {
        super(2);
        this.r = 13;
        this.s = gesVar;
        this.t = wn5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Animation animation;
        int i = this.r;
        int i2 = 3;
        Object obj3 = this.s;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Number) obj2).intValue();
                stf stfVar = (stf) obj3;
                rtf rtfVar = (rtf) obj4;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    ttf ttfVar = (ttf) stfVar.b.invoke();
                    int i3 = rtfVar.c;
                    Object obj5 = rtfVar.a;
                    if ((i3 >= ttfVar.a() || !Intrinsics.d(ttfVar.e(i3), obj5)) && (i3 = ttfVar.d(obj5)) != -1) {
                        rtfVar.c = i3;
                    }
                    int i4 = i3;
                    if (i4 != -1) {
                        oq5Var.Z(-660404355);
                        leu.y(ttfVar, stfVar.a, i4, rtfVar.a, oq5Var, 0);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(-660169871);
                        oq5Var.p(false);
                    }
                    boolean h = oq5Var.h(rtfVar);
                    Object K = oq5Var.K();
                    if (h || K == gq5.a) {
                        K = new kma(24, rtfVar);
                        oq5Var.k0(K);
                    }
                    gld.k(obj5, (Function1) K, oq5Var);
                } else {
                    oq5Var.S();
                }
                break;
            case 1:
                break;
            case 2:
                hq5 hq5Var2 = (hq5) obj;
                int intValue2 = ((Number) obj2).intValue();
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((wn5) obj3).invoke((qvf) obj4, oq5Var2, 0);
                } else {
                    oq5Var2.S();
                }
                break;
            case 3:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        break;
                    }
                }
                hag.b((qe7) ((sdr) obj3).getValue(), (jag) ((aqi) obj4).getValue(), null, hq5Var3, 0);
            case 4:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var4 = (oq5) hq5Var4;
                    if (oq5Var4.z()) {
                        oq5Var4.S();
                        break;
                    }
                }
                wcs.a(((rdt) obj3).j, (wn5) obj4, hq5Var4, 0);
            case 5:
                hq5 hq5Var5 = (hq5) obj;
                int intValue3 = ((Number) obj2).intValue();
                oq5 oq5Var5 = (oq5) hq5Var5;
                if (oq5Var5.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xcs.a(((udt) obj3).i, ild.C(181426554, new pp0((wn5) obj4, i2), oq5Var5), oq5Var5, 48);
                } else {
                    oq5Var5.S();
                }
                break;
            case 6:
                mu3 mu3Var = (mu3) obj;
                xod xodVar = (xod) obj2;
                f8j f8jVar = (f8j) obj3;
                mpf mpfVar = f8jVar.l;
                if (mpfVar.H()) {
                    f8jVar.B = mu3Var;
                    f8jVar.A = xodVar;
                    wzj snapshotObserver = ppf.a(mpfVar).getSnapshotObserver();
                    zco zcoVar = f8j.H;
                    snapshotObserver.a(f8jVar, k9i.K, (c8j) obj4);
                    f8jVar.E = false;
                } else {
                    f8jVar.E = true;
                }
                break;
            case 7:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                uqn uqnVar = (uqn) obj3;
                uqnVar.a += ((dvf) obj4).b.a(floatValue - uqnVar.a);
                break;
            case 8:
                Uri uri = (Uri) obj;
                String str = (String) obj2;
                uri.getClass();
                rro rroVar = (rro) obj3;
                rroVar.y = new Pair(uri, str);
                rroVar.J((hl2) obj4, uri, str);
                break;
            case 9:
                hq5 hq5Var6 = (hq5) obj;
                int intValue4 = ((Number) obj2).intValue();
                oq5 oq5Var6 = (oq5) hq5Var6;
                if (oq5Var6.P(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ((pyc) obj3).invoke(((hso) obj4).a, oq5Var6, 0);
                } else {
                    oq5Var6.S();
                }
                break;
            case 10:
                hq5 hq5Var7 = (hq5) obj;
                int intValue5 = ((Number) obj2).intValue();
                oq5 oq5Var7 = (oq5) hq5Var7;
                if (oq5Var7.P(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ((wn5) obj3).invoke((dso) obj4, oq5Var7, 6);
                } else {
                    oq5Var7.S();
                }
                break;
            case 11:
                hq5 hq5Var8 = (hq5) obj;
                int intValue6 = ((Number) obj2).intValue();
                oq5 oq5Var8 = (oq5) hq5Var8;
                if (oq5Var8.P(intValue6 & 1, (intValue6 & 3) != 2)) {
                    etn.l(eso.a.a((c9n) obj3), (Function2) obj4, oq5Var8, 8);
                } else {
                    oq5Var8.S();
                }
                break;
            case 12:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                uqn uqnVar2 = (uqn) obj3;
                float f = uqnVar2.a;
                uqnVar2.a = ((rwo) obj4).a(floatValue2 - f) + f;
                break;
            case 13:
                ((Number) obj2).intValue();
                wcs.a((ges) obj3, (wn5) obj4, (hq5) obj, rvf.R(1));
                break;
            default:
                View view = (View) obj;
                MotionEvent motionEvent = (MotionEvent) obj2;
                if (view.isEnabled() && view.isClickable() && view.hasOnClickListeners()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        Animation animation2 = (Animation) obj3;
                        if (animation2 != null) {
                            view.startAnimation(animation2);
                        }
                    } else if ((action == 1 || action == 3) && (animation = (Animation) obj4) != null) {
                        view.startAnimation(animation);
                    }
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtf(int i, Object obj, Object obj2) {
        super(2);
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }
}
