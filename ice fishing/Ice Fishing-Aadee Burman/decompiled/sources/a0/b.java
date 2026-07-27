package a0;

import O.C0323b;
import O.X;
import P.k;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3675oP;
import g1.C4522b;
import java.util.WeakHashMap;
import t0.C5004T;

/* loaded from: classes.dex */
public final class b extends C0323b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4231d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4232e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4233f;

    public b(C5004T c5004t) {
        this.f4231d = 1;
        this.f4233f = new WeakHashMap();
        this.f4232e = c5004t;
    }

    @Override // O.C0323b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2062a;
        Object obj = this.f4233f;
        switch (this.f4231d) {
            case 0:
                if (accessibilityEvent.getEventType() != 32) {
                    break;
                } else {
                    accessibilityEvent.getText();
                    DrawerLayout drawerLayout = (DrawerLayout) obj;
                    View g4 = drawerLayout.g();
                    if (g4 != null) {
                        int j6 = drawerLayout.j(g4);
                        drawerLayout.getClass();
                        WeakHashMap weakHashMap = X.f2054a;
                        Gravity.getAbsoluteGravity(j6, drawerLayout.getLayoutDirection());
                        break;
                    }
                }
                break;
            default:
                C0323b c0323b = (C0323b) ((WeakHashMap) obj).get(view);
                if (c0323b == null) {
                    break;
                } else {
                    break;
                }
        }
        return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // O.C0323b
    public C4522b b(View view) {
        switch (this.f4231d) {
            case 1:
                C0323b c0323b = (C0323b) ((WeakHashMap) this.f4233f).get(view);
                if (c0323b == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.b(view);
    }

    @Override // O.C0323b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4231d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                C0323b c0323b = (C0323b) ((WeakHashMap) this.f4233f).get(view);
                if (c0323b == null) {
                    super.c(view, accessibilityEvent);
                    break;
                } else {
                    c0323b.c(view, accessibilityEvent);
                    break;
                }
        }
    }

    @Override // O.C0323b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2062a;
        Object obj = this.f4232e;
        switch (this.f4231d) {
            case 0:
                boolean z3 = DrawerLayout.f4729o0;
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2409a;
                if (z3) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                } else {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                    kVar.f2410b = -1;
                    accessibilityNodeInfo.setSource(view);
                    WeakHashMap weakHashMap = X.f2054a;
                    Object parentForAccessibility = view.getParentForAccessibility();
                    if (parentForAccessibility instanceof View) {
                        accessibilityNodeInfo.setParent((View) parentForAccessibility);
                    }
                    Rect rect = (Rect) obj;
                    obtain.getBoundsInScreen(rect);
                    accessibilityNodeInfo.setBoundsInScreen(rect);
                    accessibilityNodeInfo.setVisibleToUser(obtain.isVisibleToUser());
                    accessibilityNodeInfo.setPackageName(obtain.getPackageName());
                    kVar.i(obtain.getClassName());
                    accessibilityNodeInfo.setContentDescription(obtain.getContentDescription());
                    accessibilityNodeInfo.setEnabled(obtain.isEnabled());
                    accessibilityNodeInfo.setFocused(obtain.isFocused());
                    accessibilityNodeInfo.setAccessibilityFocused(obtain.isAccessibilityFocused());
                    accessibilityNodeInfo.setSelected(obtain.isSelected());
                    kVar.a(obtain.getActions());
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (DrawerLayout.l(childAt)) {
                            accessibilityNodeInfo.addChild(childAt);
                        }
                    }
                }
                kVar.i("androidx.drawerlayout.widget.DrawerLayout");
                accessibilityNodeInfo.setFocusable(false);
                accessibilityNodeInfo.setFocused(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.f.f2394e.f2403a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.f.f2395f.f2403a);
                break;
            default:
                C5004T c5004t = (C5004T) obj;
                boolean K7 = c5004t.f40607d.K();
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f2409a;
                if (!K7) {
                    RecyclerView recyclerView = c5004t.f40607d;
                    if (recyclerView.getLayoutManager() != null) {
                        recyclerView.getLayoutManager().U(view, kVar);
                        C0323b c0323b = (C0323b) ((WeakHashMap) this.f4233f).get(view);
                        if (c0323b != null) {
                            c0323b.d(view, kVar);
                            break;
                        } else {
                            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                            break;
                        }
                    }
                }
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                break;
        }
    }

    @Override // O.C0323b
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4231d) {
            case 1:
                C0323b c0323b = (C0323b) ((WeakHashMap) this.f4233f).get(view);
                if (c0323b == null) {
                    super.e(view, accessibilityEvent);
                    break;
                } else {
                    c0323b.e(view, accessibilityEvent);
                    break;
                }
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // O.C0323b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4231d) {
            case 0:
                if (DrawerLayout.f4729o0 || DrawerLayout.l(view)) {
                    break;
                }
                break;
            default:
                C0323b c0323b = (C0323b) ((WeakHashMap) this.f4233f).get(viewGroup);
                if (c0323b == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.f2062a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // O.C0323b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f4231d) {
            case 1:
                C5004T c5004t = (C5004T) this.f4232e;
                if (!c5004t.f40607d.K()) {
                    RecyclerView recyclerView = c5004t.f40607d;
                    if (recyclerView.getLayoutManager() != null) {
                        C0323b c0323b = (C0323b) ((WeakHashMap) this.f4233f).get(view);
                        if (c0323b == null ? !super.g(view, i, bundle) : !c0323b.g(view, i, bundle)) {
                            C3675oP c3675oP = recyclerView.getLayoutManager().f40538b.f5264u;
                            break;
                        }
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }

    @Override // O.C0323b
    public void h(View view, int i) {
        switch (this.f4231d) {
            case 1:
                C0323b c0323b = (C0323b) ((WeakHashMap) this.f4233f).get(view);
                if (c0323b == null) {
                    super.h(view, i);
                    break;
                } else {
                    c0323b.h(view, i);
                    break;
                }
            default:
                super.h(view, i);
                break;
        }
    }

    @Override // O.C0323b
    public void i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4231d) {
            case 1:
                C0323b c0323b = (C0323b) ((WeakHashMap) this.f4233f).get(view);
                if (c0323b == null) {
                    super.i(view, accessibilityEvent);
                    break;
                } else {
                    c0323b.i(view, accessibilityEvent);
                    break;
                }
            default:
                super.i(view, accessibilityEvent);
                break;
        }
    }

    public b(DrawerLayout drawerLayout) {
        this.f4231d = 0;
        this.f4233f = drawerLayout;
        this.f4232e = new Rect();
    }
}
