package a0;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import h.C4544d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f extends W.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f4243a;

    /* renamed from: b, reason: collision with root package name */
    public W.e f4244b;

    /* renamed from: c, reason: collision with root package name */
    public final G0.c f4245c = new G0.c(15, this);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f4246d;

    public f(DrawerLayout drawerLayout, int i) {
        this.f4246d = drawerLayout;
        this.f4243a = i;
    }

    @Override // W.d
    public final int clampViewPositionHorizontal(View view, int i, int i6) {
        DrawerLayout drawerLayout = this.f4246d;
        if (drawerLayout.a(3, view)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = drawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // W.d
    public final int clampViewPositionVertical(View view, int i, int i6) {
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
    public final void onEdgeDragStarted(int i, int i6) {
        int i9 = i & 1;
        DrawerLayout drawerLayout = this.f4246d;
        View e9 = i9 == 1 ? drawerLayout.e(3) : drawerLayout.e(5);
        if (e9 == null || drawerLayout.i(e9) != 0) {
            return;
        }
        this.f4244b.b(i6, e9);
    }

    @Override // W.d
    public final boolean onEdgeLock(int i) {
        return false;
    }

    @Override // W.d
    public final void onEdgeTouched(int i, int i6) {
        this.f4246d.postDelayed(this.f4245c, 160L);
    }

    @Override // W.d
    public final void onViewCaptured(View view, int i) {
        ((d) view.getLayoutParams()).f4236c = false;
        int i6 = this.f4243a == 3 ? 5 : 3;
        DrawerLayout drawerLayout = this.f4246d;
        View e9 = drawerLayout.e(i6);
        if (e9 != null) {
            drawerLayout.b(e9);
        }
    }

    @Override // W.d
    public final void onViewDragStateChanged(int i) {
        int i6;
        View rootView;
        View view = this.f4244b.f3397t;
        DrawerLayout drawerLayout = this.f4246d;
        int i9 = drawerLayout.f4759z.f3379a;
        int i10 = drawerLayout.f4732A.f3379a;
        if (i9 == 1 || i10 == 1) {
            i6 = 1;
        } else {
            i6 = 2;
            if (i9 != 2 && i10 != 2) {
                i6 = 0;
            }
        }
        if (view != null && i == 0) {
            float f3 = ((d) view.getLayoutParams()).f4235b;
            if (f3 == 0.0f) {
                d dVar = (d) view.getLayoutParams();
                if ((dVar.f4237d & 1) == 1) {
                    dVar.f4237d = 0;
                    ArrayList arrayList = drawerLayout.f4743M;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            C4544d c4544d = (C4544d) ((c) drawerLayout.f4743M.get(size));
                            c4544d.a(0.0f);
                            c4544d.f37865a.u(c4544d.f37868d);
                        }
                    }
                    drawerLayout.v(view, false);
                    drawerLayout.u(view);
                    if (drawerLayout.hasWindowFocus() && (rootView = drawerLayout.getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f3 == 1.0f) {
                d dVar2 = (d) view.getLayoutParams();
                if ((dVar2.f4237d & 1) == 0) {
                    dVar2.f4237d = 1;
                    ArrayList arrayList2 = drawerLayout.f4743M;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            C4544d c4544d2 = (C4544d) ((c) drawerLayout.f4743M.get(size2));
                            c4544d2.a(1.0f);
                            c4544d2.f37865a.u(c4544d2.f37869e);
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
        if (i6 != drawerLayout.f4735D) {
            drawerLayout.f4735D = i6;
            ArrayList arrayList3 = drawerLayout.f4743M;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((c) drawerLayout.f4743M.get(size3)).getClass();
                }
            }
        }
    }

    @Override // W.d
    public final void onViewPositionChanged(View view, int i, int i6, int i9, int i10) {
        int width = view.getWidth();
        DrawerLayout drawerLayout = this.f4246d;
        float width2 = (drawerLayout.a(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
        drawerLayout.t(view, width2);
        view.setVisibility(width2 == 0.0f ? 4 : 0);
        drawerLayout.invalidate();
    }

    @Override // W.d
    public final void onViewReleased(View view, float f3, float f9) {
        int i;
        DrawerLayout drawerLayout = this.f4246d;
        int[] iArr = DrawerLayout.f4727W;
        float f10 = ((d) view.getLayoutParams()).f4235b;
        int width = view.getWidth();
        if (drawerLayout.a(3, view)) {
            i = (f3 > 0.0f || (f3 == 0.0f && f10 > 0.5f)) ? 0 : -width;
        } else {
            int width2 = drawerLayout.getWidth();
            if (f3 < 0.0f || (f3 == 0.0f && f10 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.f4244b.q(i, view.getTop());
        drawerLayout.invalidate();
    }

    @Override // W.d
    public final boolean tryCaptureView(View view, int i) {
        DrawerLayout drawerLayout = this.f4246d;
        return DrawerLayout.o(view) && drawerLayout.a(this.f4243a, view) && drawerLayout.i(view) == 0;
    }
}
