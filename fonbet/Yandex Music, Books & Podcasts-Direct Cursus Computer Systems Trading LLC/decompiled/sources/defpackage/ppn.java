package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ppn extends a {
    public final qpn d;
    public final WeakHashMap e = new WeakHashMap();

    public ppn(qpn qpnVar) {
        this.d = qpnVar;
    }

    @Override // androidx.core.view.a
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = (a) this.e.get(view);
        return aVar != null ? aVar.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public final jzi b(View view) {
        a aVar = (a) this.e.get(view);
        return aVar != null ? aVar.b(view) : super.b(view);
    }

    @Override // androidx.core.view.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = (a) this.e.get(view);
        if (aVar != null) {
            aVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public void d(View view, vb vbVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = vbVar.a;
        qpn qpnVar = this.d;
        RecyclerView recyclerView = qpnVar.d;
        RecyclerView recyclerView2 = qpnVar.d;
        boolean d0 = recyclerView.d0();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (d0 || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().y0(view, vbVar);
        a aVar = (a) this.e.get(view);
        if (aVar != null) {
            aVar.d(view, vbVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // androidx.core.view.a
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = (a) this.e.get(view);
        if (aVar != null) {
            aVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.a
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        a aVar = (a) this.e.get(viewGroup);
        return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.a
    public final boolean g(View view, int i, Bundle bundle) {
        qpn qpnVar = this.d;
        RecyclerView recyclerView = qpnVar.d;
        RecyclerView recyclerView2 = qpnVar.d;
        if (recyclerView.d0() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        a aVar = (a) this.e.get(view);
        if (aVar != null) {
            if (aVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        amh amhVar = recyclerView2.getLayoutManager().b.c;
        return false;
    }

    @Override // androidx.core.view.a
    public final void h(View view, int i) {
        a aVar = (a) this.e.get(view);
        if (aVar != null) {
            aVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // androidx.core.view.a
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = (a) this.e.get(view);
        if (aVar != null) {
            aVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
