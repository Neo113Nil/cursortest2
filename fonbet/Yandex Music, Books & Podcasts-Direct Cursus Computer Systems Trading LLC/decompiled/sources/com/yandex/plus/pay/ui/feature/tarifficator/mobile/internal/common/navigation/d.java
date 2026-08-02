package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.navigation;

import android.view.View;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.auc;
import defpackage.avc;
import defpackage.bj2;
import defpackage.fmq;
import defpackage.hrg;
import defpackage.js6;
import defpackage.ndu;
import defpackage.ob5;
import defpackage.oi2;
import defpackage.otc;
import defpackage.pxi;
import defpackage.su4;
import defpackage.vuc;
import defpackage.wdu;
import defpackage.wyn;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class d implements pxi {
    public final TarifficatorScenarioActivity a;
    public final int b;
    public final y c;
    public final otc d;
    public final ArrayList e;

    public d(TarifficatorScenarioActivity tarifficatorScenarioActivity) {
        y supportFragmentManager = tarifficatorScenarioActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        otc J = supportFragmentManager.J();
        J.getClass();
        this.a = tarifficatorScenarioActivity;
        this.b = R.id.fragment_container;
        this.c = supportFragmentManager;
        this.d = J;
        this.e = new ArrayList();
    }

    @Override // defpackage.pxi
    public final void a(ob5[] ob5VarArr) {
        ob5VarArr.getClass();
        y yVar = this.c;
        yVar.z(true);
        yVar.E();
        ArrayList arrayList = this.e;
        arrayList.clear();
        int H = yVar.H();
        int i = 0;
        if (H > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                String str = yVar.G(i2).k;
                str.getClass();
                arrayList.add(str);
                if (i3 >= H) {
                    break;
                } else {
                    i2 = i3;
                }
            }
        }
        int length = ob5VarArr.length;
        while (i < length) {
            ob5 ob5Var = ob5VarArr[i];
            i++;
            try {
                b(ob5Var);
            } catch (RuntimeException e) {
                ob5Var.getClass();
                throw e;
            }
        }
    }

    public final void b(ob5 ob5Var) {
        ob5Var.getClass();
        boolean z = ob5Var instanceof wyn;
        y yVar = this.c;
        ArrayList arrayList = this.e;
        if (z) {
            fmq fmqVar = ((wyn) ob5Var).a;
            if (arrayList.isEmpty()) {
                c(fmqVar, false);
                return;
            }
            yVar.T();
            arrayList.remove(arrayList.size() - 1);
            c(fmqVar, true);
            return;
        }
        if (ob5Var instanceof bj2) {
            arrayList.clear();
            yVar.getClass();
            yVar.x(new auc(yVar, null, -1, 1), false);
        } else if (ob5Var instanceof oi2) {
            if (arrayList.isEmpty()) {
                this.a.finish();
            } else {
                yVar.T();
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public final void c(fmq fmqVar, boolean z) {
        View view;
        otc otcVar = this.d;
        otcVar.getClass();
        o oVar = (o) ((js6) fmqVar.d).h(otcVar);
        String str = (String) fmqVar.c;
        y yVar = this.c;
        androidx.fragment.app.a l = su4.l(yVar, yVar);
        l.r = true;
        int i = this.b;
        o C = yVar.C(i);
        oVar.getClass();
        ProgressView progressView = (C == null || (view = C.getView()) == null) ? null : (ProgressView) view.findViewWithTag("com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
        if (progressView == null || progressView.getTransitionName() == null) {
            l.g(R.anim.pay_sdk_fade_in, R.anim.pay_sdk_hold, 0, 0);
        } else {
            String transitionName = progressView.getTransitionName();
            avc avcVar = vuc.a;
            WeakHashMap weakHashMap = wdu.a;
            String g = ndu.g(progressView);
            if (g == null) {
                xq0.x("Unique transitionNames are required for all sharedElements");
                return;
            }
            if (l.p == null) {
                l.p = new ArrayList();
                l.q = new ArrayList();
            } else if (l.q.contains(transitionName)) {
                xq0.x(hrg.q("A shared element with the target name '", transitionName, "' has already been added to the transaction."));
                return;
            } else if (l.p.contains(g)) {
                xq0.x(hrg.q("A shared element with the source name '", g, "' has already been added to the transaction."));
                return;
            }
            l.p.add(g);
            l.q.add(transitionName);
            oVar.setSharedElementEnterTransition(new c());
        }
        if (fmqVar.b) {
            l.e(i, oVar, str);
        } else {
            l.d(i, oVar, str, 1);
        }
        if (z) {
            l.c(str);
            this.e.add(str);
        }
        l.j();
    }
}
