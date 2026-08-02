package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public final class gwo extends dpn {
    public ir5 a;
    public final ViewPager2 b;
    public final ggu c;
    public final LinearLayoutManager d;
    public int e;
    public int f;
    public final fwo g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    public gwo(ViewPager2 viewPager2) {
        this.b = viewPager2;
        ggu gguVar = viewPager2.j;
        this.c = gguVar;
        this.d = (LinearLayoutManager) gguVar.getLayoutManager();
        this.g = new fwo();
        e();
    }

    @Override // defpackage.dpn
    public final void a(RecyclerView recyclerView, int i) {
        ir5 ir5Var;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            f(false);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                d(2);
                this.j = true;
                return;
            }
            return;
        }
        fwo fwoVar = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            g();
            if (!this.k) {
                int i3 = fwoVar.b;
                if (i3 != -1 && (ir5Var = this.a) != null) {
                    ir5Var.b(i3, 0.0f, 0);
                }
            } else if (fwoVar.c == 0) {
                int i4 = this.h;
                int i5 = fwoVar.b;
                if (i4 != i5) {
                    c(i5);
                }
            }
            d(0);
            e();
        }
        if (this.e == 2 && i == 0 && this.l) {
            g();
            if (fwoVar.c == 0) {
                int i6 = this.i;
                int i7 = fwoVar.b;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    c(i7);
                }
                d(0);
                e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if ((r7 < 0) == (r5.b.g.b.getLayoutDirection() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    @Override // defpackage.dpn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.k = true;
        g();
        boolean z = this.j;
        fwo fwoVar = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                i3 = fwoVar.b;
                this.i = i3;
                if (this.h != i3) {
                    c(i3);
                }
            }
            if (fwoVar.c != 0) {
                i3 = fwoVar.b + 1;
                this.i = i3;
                if (this.h != i3) {
                }
            }
            i3 = fwoVar.b;
            this.i = i3;
            if (this.h != i3) {
            }
        } else if (this.e == 0) {
            int i4 = fwoVar.b;
            if (i4 == -1) {
                i4 = 0;
            }
            c(i4);
        }
        int i5 = fwoVar.b;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = fwoVar.a;
        int i6 = fwoVar.c;
        ir5 ir5Var = this.a;
        if (ir5Var != null) {
            ir5Var.b(i5, f, i6);
        }
        int i7 = fwoVar.b;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && fwoVar.c == 0 && this.f != 1) {
            d(0);
            e();
        }
    }

    public final void c(int i) {
        ir5 ir5Var = this.a;
        if (ir5Var != null) {
            ir5Var.c(i);
        }
    }

    public final void d(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        ir5 ir5Var = this.a;
        if (ir5Var != null) {
            ir5Var.a(i);
        }
    }

    public final void e() {
        this.e = 0;
        this.f = 0;
        fwo fwoVar = this.g;
        fwoVar.b = -1;
        fwoVar.a = 0.0f;
        fwoVar.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }

    public final void f(boolean z) {
        this.m = z;
        this.e = z ? 4 : 1;
        int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        } else if (this.h == -1) {
            this.h = this.d.r1();
        }
        d(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0137, code lost:
    
        if (r0.Q() <= 1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        int top;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int r1 = linearLayoutManager.r1();
        fwo fwoVar = this.g;
        fwoVar.b = r1;
        if (r1 == -1) {
            fwoVar.b = -1;
            fwoVar.a = 0.0f;
            fwoVar.c = 0;
            return;
        }
        View L = linearLayoutManager.L(r1);
        if (L == null) {
            fwoVar.b = -1;
            fwoVar.a = 0.0f;
            fwoVar.c = 0;
            return;
        }
        int i3 = ((zon) L.getLayoutParams()).b.left;
        int i4 = ((zon) L.getLayoutParams()).b.right;
        int i5 = ((zon) L.getLayoutParams()).b.top;
        int i6 = ((zon) L.getLayoutParams()).b.bottom;
        ViewGroup.LayoutParams layoutParams = L.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = L.getHeight() + i5 + i6;
        int width = L.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.p;
        ggu gguVar = this.c;
        if (i7 == 0) {
            top = (L.getLeft() - i3) - gguVar.getPaddingLeft();
            if (this.b.g.b.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (L.getTop() - i5) - gguVar.getPaddingTop();
        }
        int i8 = -top;
        fwoVar.c = i8;
        if (i8 >= 0) {
            fwoVar.a = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int Q = linearLayoutManager.Q();
        if (Q != 0) {
            boolean z = linearLayoutManager.p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Q, 2);
            for (int i9 = 0; i9 < Q; i9++) {
                View P = linearLayoutManager.P(i9);
                if (P == null) {
                    xq0.q("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = P.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : qk0.a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = P.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = P.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = P.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = P.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new C1318t(19));
            int i10 = 1;
            while (true) {
                if (i10 >= Q) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0) {
                    }
                } else if (iArr[i10 - 1][1] != iArr[i10][0]) {
                    break;
                } else {
                    i10++;
                }
            }
            int Q2 = linearLayoutManager.Q();
            for (int i14 = 0; i14 < Q2; i14++) {
                if (qk0.a(linearLayoutManager.P(i14))) {
                    xq0.q("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
            Locale locale = Locale.US;
            xq0.q(k5r.i(fwoVar.c, "Page can only be offset by a positive amount, not by "));
        }
    }
}
