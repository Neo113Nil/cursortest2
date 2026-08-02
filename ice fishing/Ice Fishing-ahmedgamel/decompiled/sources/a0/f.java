package a0;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import h.C4548d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends W.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4220a;

    /* renamed from: b, reason: collision with root package name */
    public W.e f4221b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.c f4222c = new G0.c(14, this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f4223d;

    public f(DrawerLayout drawerLayout, int i) {
        this.f4223d = drawerLayout;
        this.f4220a = i;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i4) {
        DrawerLayout drawerLayout = this.f4223d;
        if (drawerLayout.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // W.d
    public final int clampViewPositionVertical(View view, int i, int i4) {
        return view.getTop();
    }

    @Override // W.d
    public final int getViewHorizontalDragRange(View view) {
        if (DrawerLayout.o(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // W.d
    public final void onEdgeDragStarted(int i, int i4) {
        int i6 = i & 1;
        DrawerLayout drawerLayout = this.f4223d;
        View e9 = i6 == 1 ? drawerLayout.e(3) : drawerLayout.e(5);
        if (e9 == null || drawerLayout.i(e9) != 0) {
            return;
        }
        this.f4221b.b(i4, e9);
    }

    @Override // W.d
    public final boolean onEdgeLock(int i) {
        return false;
    }

    @Override // W.d
    public final void onEdgeTouched(int i, int i4) {
        this.f4223d.postDelayed(this.f4222c, 160L);
    }

    @Override // W.d
    public final void onViewCaptured(View view, int i) {
        ((d) view.getLayoutParams()).f4213c = false;
        int i4 = this.f4220a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f4223d;
        View e9 = drawerLayout.e(i4);
        if (e9 != null) {
            drawerLayout.b(e9);
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        int i4;
        View rootView;
        View view = this.f4221b.f3527t;
        DrawerLayout drawerLayout = this.f4223d;
        int i6 = drawerLayout.f4727z.f3509a;
        int i9 = drawerLayout.f4700A.f3509a;
        if (i6 == 1 || i9 == 1) {
            i4 = 1;
        } else {
            i4 = 2;
            if (i6 != 2 && i9 != 2) {
                i4 = 0;
            }
        }
        if (view != null && i == 0) {
            float f2 = ((d) view.getLayoutParams()).f4212b;
            if (f2 == 0.0f) {
                d dVar = (d) view.getLayoutParams();
                if ((dVar.f4214d & 1) == 1) {
                    dVar.f4214d = 0;
                    ArrayList arrayList = drawerLayout.f4711M;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            C4548d c4548d = (C4548d) ((c) drawerLayout.f4711M.get(size));
                            c4548d.a(0.0f);
                            c4548d.f37891a.n(c4548d.f37894d);
                        }
                    }
                    drawerLayout.v(view, false);
                    drawerLayout.u(view);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f2 == 1.0f) {
                d dVar2 = (d) view.getLayoutParams();
                if ((dVar2.f4214d & 1) == 0) {
                    dVar2.f4214d = 1;
                    ArrayList arrayList2 = drawerLayout.f4711M;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C4548d c4548d2 = (C4548d) ((c) drawerLayout.f4711M.get(size2));
                            c4548d2.a(1.0f);
                            c4548d2.f37891a.n(c4548d2.f37895e);
                        }
                    }
                    drawerLayout.v(view, true);
                    drawerLayout.u(view);
                    if (drawerLayout.hasWindowFocus()) {
                        drawerLayout.sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i4 != drawerLayout.f4703D) {
            drawerLayout.f4703D = i4;
            ArrayList arrayList3 = drawerLayout.f4711M;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) drawerLayout.f4711M.get(size3)).getClass();
                }
            }
        }
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i4, int i6, int i9) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f4223d;
        float width2 = (drawerLayout.a(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.t(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // W.d
    public final void onViewReleased(View view, float f2, float f9) {
        int i;
        DrawerLayout drawerLayout = this.f4223d;
        int[] iArr = DrawerLayout.f4695W;
        float f10 = ((d) view.getLayoutParams()).f4212b;
        int width = view.getWidth();
        if (drawerLayout.a(3, view)) {
            i = (f2 > 0.0f || (f2 == 0.0f && f10 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f2 < 0.0f || (f2 == 0.0f && f10 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f4221b.q(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // W.d
    public final boolean tryCaptureView(View view, int i) {
        DrawerLayout drawerLayout = this.f4223d;
        return DrawerLayout.o(view) && drawerLayout.a(this.f4220a, view) && drawerLayout.i(view) == 0;
    }
}
