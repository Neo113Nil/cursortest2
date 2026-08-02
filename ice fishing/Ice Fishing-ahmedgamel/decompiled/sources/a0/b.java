package a0;

import O.C0328b;
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
import com.google.android.gms.internal.ads.C3698oP;
import i1.C4585b;
import java.util.WeakHashMap;
import t0.C5001Q;

/* loaded from: classes.dex */
public final class b extends C0328b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4208d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4209e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f4210f;

    public b(C5001Q c5001q) {
        this.f4208d = 1;
        this.f4210f = new WeakHashMap();
        this.f4209e = c5001q;
    }

    @Override // O.C0328b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2150a;
        Object obj = this.f4210f;
        switch (this.f4208d) {
            case 0:
                if (accessibilityEvent.getEventType() != 32) {
                    break;
                } else {
                    accessibilityEvent.getText();
                    DrawerLayout drawerLayout = (DrawerLayout) obj;
                    View g9 = drawerLayout.g();
                    if (g9 != null) {
                        int j6 = drawerLayout.j(g9);
                        drawerLayout.getClass();
                        WeakHashMap weakHashMap = X.f2142a;
                        Gravity.getAbsoluteGravity(j6, drawerLayout.getLayoutDirection());
                        break;
                    }
                }
                break;
            default:
                C0328b c0328b = (C0328b) ((WeakHashMap) obj).get(view);
                if (c0328b == null) {
                    break;
                } else {
                    break;
                }
        }
        return accessibilityDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // O.C0328b
    public C4585b b(View view) {
        switch (this.f4208d) {
            case 1:
                C0328b c0328b = (C0328b) ((WeakHashMap) this.f4210f).get(view);
                if (c0328b == null) {
                    break;
                } else {
                    break;
                }
        }
        return super.b(view);
    }

    @Override // O.C0328b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4208d) {
            case 0:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
                break;
            default:
                C0328b c0328b = (C0328b) ((WeakHashMap) this.f4210f).get(view);
                if (c0328b == null) {
                    super.c(view, accessibilityEvent);
                    break;
                } else {
                    c0328b.c(view, accessibilityEvent);
                    break;
                }
        }
    }

    @Override // O.C0328b
    public final void d(View view, k kVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f2150a;
        Object obj = this.f4209e;
        switch (this.f4208d) {
            case 0:
                boolean z6 = DrawerLayout.f4697j0;
                AccessibilityNodeInfo accessibilityNodeInfo = kVar.f2340a;
                if (z6) {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                } else {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, obtain);
                    kVar.f2341b = -1;
                    accessibilityNodeInfo.setSource(view);
                    WeakHashMap weakHashMap = X.f2142a;
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
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.f.f2325e.f2334a);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) P.f.f2326f.f2334a);
                break;
            default:
                C5001Q c5001q = (C5001Q) obj;
                boolean K7 = c5001q.f40660d.K();
                AccessibilityNodeInfo accessibilityNodeInfo2 = kVar.f2340a;
                if (!K7) {
                    RecyclerView recyclerView = c5001q.f40660d;
                    if (recyclerView.getLayoutManager() != null) {
                        recyclerView.getLayoutManager().U(view, kVar);
                        C0328b c0328b = (C0328b) ((WeakHashMap) this.f4210f).get(view);
                        if (c0328b != null) {
                            c0328b.d(view, kVar);
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

    @Override // O.C0328b
    public void e(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4208d) {
            case 1:
                C0328b c0328b = (C0328b) ((WeakHashMap) this.f4210f).get(view);
                if (c0328b == null) {
                    super.e(view, accessibilityEvent);
                    break;
                } else {
                    c0328b.e(view, accessibilityEvent);
                    break;
                }
            default:
                super.e(view, accessibilityEvent);
                break;
        }
    }

    @Override // O.C0328b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4208d) {
            case 0:
                if (DrawerLayout.f4697j0 || DrawerLayout.l(view)) {
                    break;
                }
                break;
            default:
                C0328b c0328b = (C0328b) ((WeakHashMap) this.f4210f).get(viewGroup);
                if (c0328b == null) {
                    break;
                } else {
                    break;
                }
        }
        return this.f2150a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // O.C0328b
    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f4208d) {
            case 1:
                C5001Q c5001q = (C5001Q) this.f4209e;
                if (!c5001q.f40660d.K()) {
                    RecyclerView recyclerView = c5001q.f40660d;
                    if (recyclerView.getLayoutManager() != null) {
                        C0328b c0328b = (C0328b) ((WeakHashMap) this.f4210f).get(view);
                        if (c0328b == null ? !super.g(view, i, bundle) : !c0328b.g(view, i, bundle)) {
                            C3698oP c3698oP = recyclerView.getLayoutManager().f40591b.f5230u;
                            break;
                        }
                    }
                }
                break;
        }
        return super.g(view, i, bundle);
    }

    @Override // O.C0328b
    public void h(View view, int i) {
        switch (this.f4208d) {
            case 1:
                C0328b c0328b = (C0328b) ((WeakHashMap) this.f4210f).get(view);
                if (c0328b == null) {
                    super.h(view, i);
                    break;
                } else {
                    c0328b.h(view, i);
                    break;
                }
            default:
                super.h(view, i);
                break;
        }
    }

    @Override // O.C0328b
    public void i(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f4208d) {
            case 1:
                C0328b c0328b = (C0328b) ((WeakHashMap) this.f4210f).get(view);
                if (c0328b == null) {
                    super.i(view, accessibilityEvent);
                    break;
                } else {
                    c0328b.i(view, accessibilityEvent);
                    break;
                }
            default:
                super.i(view, accessibilityEvent);
                break;
        }
    }

    public b(DrawerLayout drawerLayout) {
        this.f4208d = 0;
        this.f4210f = drawerLayout;
        this.f4209e = new Rect();
    }
}
