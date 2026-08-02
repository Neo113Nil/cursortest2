package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class qhm implements View.OnTouchListener {
    public final ku9 a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final e23 e;
    public final dxr f;
    public final boolean g;
    public final qs6 h;
    public final Rect i = new Rect();

    public qhm(ku9 ku9Var, boolean z, boolean z2, List list, e23 e23Var, dxr dxrVar, boolean z3, qs6 qs6Var) {
        this.a = ku9Var;
        this.b = z;
        this.c = z2;
        this.d = list;
        this.e = e23Var;
        this.f = dxrVar;
        this.g = z3;
        this.h = qs6Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        dxr dxrVar = this.f;
        fmq fmqVar = (fmq) dxrVar.a;
        boolean z = fmqVar.b;
        if (z) {
            fmqVar.x(motionEvent);
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
                fmqVar.b = false;
            }
        }
        if (z && !fmqVar.b) {
            ((or0) dxrVar.b).dismiss();
        }
        Rect rect = this.i;
        boolean z2 = this.g;
        ku9 ku9Var = this.a;
        if (z2) {
            View substrateView = ku9Var.getSubstrateView();
            if (substrateView != null) {
                substrateView.getHitRect(rect);
            }
        } else {
            View tooltipView = ku9Var.getTooltipView();
            if (tooltipView != null) {
                tooltipView.getHitRect(rect);
            }
        }
        if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            List list = this.d;
            if (list != null) {
                e23 e23Var = this.e;
                xzb xzbVar = e23Var.b;
                gc8 gc8Var = e23Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Boolean) ((bd8) obj).b.a(xzbVar)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bd8 bd8Var = (bd8) it.next();
                    eg8 z3 = gc8Var.getDiv2Component$div_release().z();
                    if (!z3.e(bd8Var.j, bd8Var.h, bd8Var.f, gc8Var, xzbVar, "click")) {
                        z3.a(bd8Var, gc8Var, xzbVar);
                    }
                }
            }
            if (this.c) {
                this.h.invoke();
            }
        }
        return this.b;
    }
}
