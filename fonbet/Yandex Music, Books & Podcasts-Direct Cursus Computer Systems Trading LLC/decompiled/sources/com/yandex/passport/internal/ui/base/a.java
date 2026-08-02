package com.yandex.passport.internal.ui.base;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.yandex.passport.R;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.analytics.o0;
import defpackage.ouj;
import defpackage.su4;
import defpackage.wvs;
import defpackage.xq0;
import defpackage.xy0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public abstract class a extends com.yandex.passport.internal.ui.c {
    public final n d;

    public a() {
        n nVar = new n();
        nVar.b = new Stack();
        nVar.c = new ArrayList();
        this.d = nVar;
    }

    public final void m() {
        i iVar;
        j D;
        int[] iArr;
        y supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
        boolean z = supportFragmentManager.C(R.id.container) != null;
        y supportFragmentManager2 = getSupportFragmentManager();
        Stack stack = (Stack) this.d.b;
        if (stack.empty() || (iVar = (i) stack.peek()) == null) {
            D = null;
        } else {
            if (iVar.d == null) {
                o D2 = supportFragmentManager2.D(iVar.a);
                iVar.d = D2;
                if (D2 == null) {
                    iVar.d = o.instantiate(this, iVar.b, iVar.c);
                }
            }
            iVar.d.getLifecycle().a(iVar);
            D = n.D(iVar);
        }
        if (D == null) {
            o0 o0Var = this.c;
            o0Var.getClass();
            xy0 xy0Var = new xy0(0);
            xy0Var.put("error", Log.getStackTraceString(new Exception()));
            o0Var.a.b(com.yandex.passport.internal.analytics.l.e, xy0Var);
            return;
        }
        if (z) {
            boolean z2 = D.d;
            int D3 = ouj.D(D.c);
            if (D3 == 0) {
                iArr = z2 ? j.e : j.f;
            } else if (D3 == 1) {
                iArr = z2 ? j.g : j.h;
            } else {
                if (D3 != 2) {
                    xq0.x("Unknown animation type");
                    return;
                }
                iArr = new int[]{0, 0};
            }
            l.g(iArr[0], iArr[1], 0, 0);
            l.c(null);
        }
        l.e(R.id.container, D.b, D.a);
        l.k(true, true);
    }

    public final void n(m mVar) {
        n nVar = this.d;
        Stack stack = (Stack) nVar.b;
        mVar.getClass();
        Callable callable = mVar.a;
        if (callable != null) {
            if (!mVar.c) {
                nVar.M();
            }
            if (!stack.isEmpty()) {
                ((i) stack.peek()).f = mVar.d;
            }
            try {
                o oVar = (o) callable.call();
                stack.push(new i(mVar.b, oVar.getClass().getName(), oVar.getArguments(), oVar, mVar.d));
                nVar.I();
            } catch (Exception e) {
                wvs.m(e);
                return;
            }
        } else if (!stack.isEmpty()) {
            stack.pop();
        }
        if (((Stack) nVar.b).isEmpty()) {
            finish();
        } else {
            m();
        }
    }

    @Override // defpackage.hn5, android.app.Activity
    public void onBackPressed() {
        n nVar = this.d;
        Stack stack = (Stack) nVar.b;
        j D = stack.isEmpty() ? null : n.D((i) stack.peek());
        if (D != null) {
            o oVar = D.b;
            if ((oVar instanceof d) && ((d) oVar).y()) {
                return;
            }
        }
        nVar.M();
        if (((Stack) nVar.b).isEmpty()) {
            finish();
        } else {
            m();
        }
    }

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            n nVar = this.d;
            nVar.getClass();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("back-stack-entries");
            Stack stack = (Stack) nVar.b;
            stack.clear();
            stack.addAll(parcelableArrayList);
        }
        super.onCreate(bundle);
    }

    @Override // defpackage.hn5, androidx.core.app.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Stack stack = (Stack) this.d.b;
        Iterator it = stack.iterator();
        while (it.hasNext()) {
            i iVar = (i) it.next();
            o oVar = iVar.d;
            if (oVar != null) {
                iVar.c = oVar.getArguments();
            }
        }
        bundle.putParcelableArrayList("back-stack-entries", new ArrayList<>(stack));
    }
}
