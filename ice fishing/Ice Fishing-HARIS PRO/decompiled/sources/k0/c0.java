package k0;

import O.C0026b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import m0.C0303k;

/* loaded from: classes.dex */
public final class c0 extends C0026b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3467d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3468f;

    public c0(d0 d0Var) {
        this.f3467d = 0;
        this.f3468f = new WeakHashMap();
        this.e = d0Var;
    }

    @Override // O.C0026b
    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3467d) {
            case 0:
                C0026b c0026b = (C0026b) ((WeakHashMap) this.f3468f).get(view);
                return c0026b != null ? c0026b.a(view, accessibilityEvent) : this.f785a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            default:
                return super.a(view, accessibilityEvent);
        }
    }

    @Override // O.C0026b
    public B.b b(View view) {
        switch (this.f3467d) {
            case 0:
                C0026b c0026b = (C0026b) ((WeakHashMap) this.f3468f).get(view);
                if (c0026b == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.b(view);
    }

    @Override // O.C0026b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3467d) {
            case 0:
                C0026b c0026b = (C0026b) ((WeakHashMap) this.f3468f).get(view);
                if (c0026b == null) {
                    super.c(view, accessibilityEvent);
                    break;
                } else {
                    c0026b.c(view, accessibilityEvent);
                    break;
                }
            default:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                break;
        }
    }

    @Override // O.C0026b
    public final void d(View view, P.f fVar) {
        Object obj = this.f3468f;
        Object obj2 = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.f785a;
        switch (this.f3467d) {
            case 0:
                d0 d0Var = (d0) obj2;
                boolean N2 = d0Var.f3473d.N();
                AccessibilityNodeInfo accessibilityNodeInfo = fVar.f891a;
                if (!N2) {
                    RecyclerView recyclerView = d0Var.f3473d;
                    if (recyclerView.getLayoutManager() != null) {
                        recyclerView.getLayoutManager().X(view, fVar);
                        C0026b c0026b = (C0026b) ((WeakHashMap) obj).get(view);
                        if (c0026b != null) {
                            c0026b.d(view, fVar);
                            break;
                        } else {
                            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                            break;
                        }
                    }
                }
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = fVar.f891a;
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo2);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                Rect rect = (Rect) obj2;
                obtain.getBoundsInScreen(rect);
                accessibilityNodeInfo2.setBoundsInScreen(rect);
                accessibilityNodeInfo2.setVisibleToUser(obtain.isVisibleToUser());
                accessibilityNodeInfo2.setPackageName(obtain.getPackageName());
                fVar.h(obtain.getClassName());
                fVar.i(obtain.getContentDescription());
                accessibilityNodeInfo2.setEnabled(obtain.isEnabled());
                accessibilityNodeInfo2.setClickable(obtain.isClickable());
                accessibilityNodeInfo2.setFocusable(obtain.isFocusable());
                accessibilityNodeInfo2.setFocused(obtain.isFocused());
                accessibilityNodeInfo2.setAccessibilityFocused(obtain.isAccessibilityFocused());
                accessibilityNodeInfo2.setSelected(obtain.isSelected());
                accessibilityNodeInfo2.setLongClickable(obtain.isLongClickable());
                fVar.a(obtain.getActions());
                accessibilityNodeInfo2.setMovementGranularities(obtain.getMovementGranularities());
                fVar.h("androidx.slidingpanelayout.widget.SlidingPaneLayout");
                fVar.f892b = -1;
                accessibilityNodeInfo2.setSource(view);
                WeakHashMap weakHashMap = O.K.f747a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    accessibilityNodeInfo2.setParent((View) parentForAccessibility);
                }
                C0303k c0303k = (C0303k) obj;
                int childCount = c0303k.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = c0303k.getChildAt(i);
                    if (!c0303k.b(childAt) && childAt.getVisibility() == 0) {
                        childAt.setImportantForAccessibility(1);
                        accessibilityNodeInfo2.addChild(childAt);
                    }
                }
                break;
        }
    }

    @Override // O.C0026b
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3467d) {
            case 0:
                C0026b c0026b = (C0026b) ((WeakHashMap) this.f3468f).get(view);
                if (c0026b == null) {
                    super.e(view, accessibilityEvent);
                    break;
                } else {
                    c0026b.e(view, accessibilityEvent);
                    break;
                }
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // O.C0026b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3467d) {
            case 0:
                C0026b c0026b = (C0026b) ((WeakHashMap) this.f3468f).get(viewGroup);
                if (c0026b == null) {
                    break;
                } else {
                    break;
                }
            default:
                if (!((C0303k) this.f3468f).b(view)) {
                    break;
                }
                break;
        }
        return this.f785a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // O.C0026b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f3467d) {
            case 0:
                d0 d0Var = (d0) this.e;
                if (!d0Var.f3473d.N()) {
                    RecyclerView recyclerView = d0Var.f3473d;
                    if (recyclerView.getLayoutManager() != null) {
                        C0026b c0026b = (C0026b) ((WeakHashMap) this.f3468f).get(view);
                        if (c0026b != null) {
                            if (c0026b.g(view, i, bundle)) {
                            }
                        } else if (super.g(view, i, bundle)) {
                        }
                        Q q2 = recyclerView.getLayoutManager().f3385b.f2143c;
                        break;
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }

    @Override // O.C0026b
    public void h(View view, int i) {
        switch (this.f3467d) {
            case 0:
                C0026b c0026b = (C0026b) ((WeakHashMap) this.f3468f).get(view);
                if (c0026b == null) {
                    super.h(view, i);
                    break;
                } else {
                    c0026b.h(view, i);
                    break;
                }
            default:
                super.h(view, i);
                break;
        }
    }

    @Override // O.C0026b
    public void i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3467d) {
            case 0:
                C0026b c0026b = (C0026b) ((WeakHashMap) this.f3468f).get(view);
                if (c0026b == null) {
                    super.i(view, accessibilityEvent);
                    break;
                } else {
                    c0026b.i(view, accessibilityEvent);
                    break;
                }
            default:
                super.i(view, accessibilityEvent);
                break;
        }
    }

    public c0(C0303k c0303k) {
        this.f3467d = 1;
        this.f3468f = c0303k;
        this.e = new Rect();
    }
}
