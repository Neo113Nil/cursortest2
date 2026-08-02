package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.appmetrica.analytics.accessibilitysystemwrapper.impl.e;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class jrb implements ycg, myc, fmh, ic, FunctionWithThrowable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jrb(int i, alp alpVar, Bundle bundle) {
        this.a = 5;
        this.b = i;
        this.c = alpVar;
    }

    @Override // defpackage.myc
    public Object apply(Object obj) {
        int i = this.a;
        int i2 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                xrb xrbVar = (xrb) obj2;
                if (i2 == 0) {
                    Context context = xrbVar.e;
                    int i3 = dvt.a;
                    i2 = fx1.f(context).generateAudioSessionId();
                }
                return Integer.valueOf(i2);
            default:
                return e.a((AccessibilityManager) obj2, i2, (AccessibilityManager) obj);
        }
    }

    @Override // defpackage.fmh
    public void f(ulh ulhVar) {
        switch (this.a) {
            case 3:
                kkh kkhVar = ulhVar.a;
                yde ydeVar = (yde) this.c;
                if (ulhVar.isConnected()) {
                    qsn qsnVar = ulhVar.s;
                    qsn qsnVar2 = ulhVar.t;
                    ulhVar.r = yde.v(ydeVar);
                    qsn m1 = ulh.m1(ydeVar, ulhVar.q, ulhVar.u, ulhVar.x, ulhVar.I);
                    ulhVar.s = m1;
                    ulhVar.t = ulh.l1(m1, ulhVar.q, ulhVar.I, ulhVar.u, ulhVar.x);
                    boolean equals = ulhVar.s.equals(qsnVar);
                    ulhVar.t.equals(qsnVar2);
                    kkhVar.getClass();
                    vq1.A(Looper.myLooper() == kkhVar.e.getLooper());
                    ikh ikhVar = kkhVar.d;
                    kde c = ikhVar.c(kkhVar, ulhVar.t);
                    if (!equals) {
                        ikhVar.d();
                    }
                    ulhVar.p1(this.b, c);
                    break;
                }
                break;
            case 4:
                kkh kkhVar2 = ulhVar.a;
                List list = (List) this.c;
                if (ulhVar.isConnected()) {
                    qsn qsnVar3 = ulhVar.s;
                    qsn qsnVar4 = ulhVar.t;
                    ulhVar.q = yde.v(list);
                    qsn m12 = ulh.m1(ulhVar.r, list, ulhVar.u, ulhVar.x, ulhVar.I);
                    ulhVar.s = m12;
                    ulhVar.t = ulh.l1(m12, list, ulhVar.I, ulhVar.u, ulhVar.x);
                    boolean equals2 = ulhVar.s.equals(qsnVar3);
                    ulhVar.t.equals(qsnVar4);
                    kkhVar2.getClass();
                    vq1.A(Looper.myLooper() == kkhVar2.e.getLooper());
                    ikh ikhVar2 = kkhVar2.d;
                    kde c2 = ikhVar2.c(kkhVar2, ulhVar.t);
                    if (!equals2) {
                        ikhVar2.d();
                    }
                    ulhVar.p1(this.b, c2);
                    break;
                }
                break;
            default:
                alp alpVar = (alp) this.c;
                kkh kkhVar3 = ulhVar.a;
                if (ulhVar.isConnected()) {
                    kkhVar3.getClass();
                    vq1.A(Looper.myLooper() == kkhVar3.e.getLooper());
                    kde i = kkhVar3.d.i(alpVar);
                    i.a(new e02(ulhVar, i, this.b, 7), e48.a);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ycg
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                f8l f8lVar = (f8l) obj;
                f8lVar.I(this.b, (onh) this.c);
                break;
            default:
                ((f8l) obj).R(((rzk) this.c).a, this.b);
                break;
        }
    }

    @Override // defpackage.ic
    public boolean r(View view) {
        boolean lambda$createAccessibilityViewCommandForState$2;
        lambda$createAccessibilityViewCommandForState$2 = ((SideSheetBehavior) this.c).lambda$createAccessibilityViewCommandForState$2(this.b, view, null);
        return lambda$createAccessibilityViewCommandForState$2;
    }

    public /* synthetic */ jrb(int i, qsn qsnVar, int i2) {
        this.a = i2;
        this.b = i;
        this.c = qsnVar;
    }

    public /* synthetic */ jrb(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
