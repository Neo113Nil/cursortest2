package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pos implements gyh {
    public hxh a;
    public rxh b;
    public final /* synthetic */ Toolbar c;

    public pos(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.gyh
    public final boolean b(tmr tmrVar) {
        return false;
    }

    @Override // defpackage.gyh
    public final boolean c(rxh rxhVar) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof au4) {
            ((au4) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        rxhVar.C = false;
        rxhVar.n.p(false);
        toolbar.w();
        return true;
    }

    @Override // defpackage.gyh
    public final void g() {
        if (this.b != null) {
            hxh hxhVar = this.a;
            if (hxhVar != null) {
                int size = hxhVar.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            c(this.b);
        }
    }

    @Override // defpackage.gyh
    public final boolean h() {
        return false;
    }

    @Override // defpackage.gyh
    public final boolean i(rxh rxhVar) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = rxhVar.getActionView();
        toolbar.i = actionView;
        this.b = rxhVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            qos h = Toolbar.h();
            h.a = (toolbar.n & 112) | 8388611;
            h.b = 2;
            toolbar.i.setLayoutParams(h);
            toolbar.addView(toolbar.i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((qos) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        rxhVar.C = true;
        rxhVar.n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof au4) {
            ((au4) callback).onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // defpackage.gyh
    public final void j(Context context, hxh hxhVar) {
        rxh rxhVar;
        hxh hxhVar2 = this.a;
        if (hxhVar2 != null && (rxhVar = this.b) != null) {
            hxhVar2.d(rxhVar);
        }
        this.a = hxhVar;
    }

    @Override // defpackage.gyh
    public final void e(hxh hxhVar, boolean z) {
    }
}
