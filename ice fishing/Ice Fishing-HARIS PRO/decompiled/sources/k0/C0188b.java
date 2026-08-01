package k0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g.AbstractC0155a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.AbstractC0265l0;
import m.C0281u;
import m.S0;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188b {

    /* renamed from: a, reason: collision with root package name */
    public int f3443a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3444b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3445c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3446d;
    public Object e;

    /* renamed from: f, reason: collision with root package name */
    public Object f3447f;

    public C0188b(View view) {
        this.f3443a = -1;
        this.f3444b = view;
        this.f3445c = C0281u.a();
    }

    public void a() {
        View view = (View) this.f3444b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((S0) this.f3446d) != null) {
                if (((S0) this.f3447f) == null) {
                    this.f3447f = new S0();
                }
                S0 s0 = (S0) this.f3447f;
                s0.f3882a = null;
                s0.f3885d = false;
                s0.f3883b = null;
                s0.f3884c = false;
                WeakHashMap weakHashMap = O.K.f747a;
                ColorStateList c2 = O.B.c(view);
                if (c2 != null) {
                    s0.f3885d = true;
                    s0.f3882a = c2;
                }
                PorterDuff.Mode d2 = O.B.d(view);
                if (d2 != null) {
                    s0.f3884c = true;
                    s0.f3883b = d2;
                }
                if (s0.f3885d || s0.f3884c) {
                    C0281u.e(background, s0, view.getDrawableState());
                    return;
                }
            }
            S0 s02 = (S0) this.e;
            if (s02 != null) {
                C0281u.e(background, s02, view.getDrawableState());
                return;
            }
            S0 s03 = (S0) this.f3446d;
            if (s03 != null) {
                C0281u.e(background, s03, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.f3446d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0187a c0187a = (C0187a) arrayList.get(i2);
            int i3 = c0187a.f3433a;
            if (i3 == 8) {
                if (g(c0187a.f3436d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0187a.f3434b;
                int i5 = c0187a.f3436d + i4;
                while (i4 < i5) {
                    if (g(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f3446d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((B) this.e).a((C0187a) arrayList.get(i));
        }
        q(arrayList);
        this.f3443a = 0;
    }

    public void d() {
        c();
        ArrayList arrayList = (ArrayList) this.f3445c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0187a c0187a = (C0187a) arrayList.get(i);
            int i2 = c0187a.f3433a;
            B b2 = (B) this.e;
            if (i2 == 1) {
                b2.a(c0187a);
                b2.d(c0187a.f3434b, c0187a.f3436d);
            } else if (i2 == 2) {
                b2.a(c0187a);
                int i3 = c0187a.f3434b;
                int i4 = c0187a.f3436d;
                RecyclerView recyclerView = b2.f3369a;
                recyclerView.R(i3, i4, true);
                recyclerView.f2155j0 = true;
                recyclerView.f2151g0.f3424c += i4;
            } else if (i2 == 4) {
                b2.a(c0187a);
                b2.c(c0187a.f3434b, c0187a.f3436d, c0187a.f3435c);
            } else if (i2 == 8) {
                b2.a(c0187a);
                b2.e(c0187a.f3434b, c0187a.f3436d);
            }
        }
        q(arrayList);
        this.f3443a = 0;
    }

    public void e(C0187a c0187a) {
        int i;
        N.b bVar;
        int i2 = c0187a.f3433a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int u2 = u(c0187a.f3434b, i2);
        int i3 = c0187a.f3434b;
        int i4 = c0187a.f3433a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0187a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0187a.f3436d;
            bVar = (N.b) this.f3444b;
            if (i5 >= i7) {
                break;
            }
            int u3 = u((i * i5) + c0187a.f3434b, c0187a.f3433a);
            int i8 = c0187a.f3433a;
            if (i8 == 2 ? u3 != u2 : !(i8 == 4 && u3 == u2 + 1)) {
                C0187a l2 = l(c0187a.f3435c, i8, u2, i6);
                f(l2, i3);
                l2.f3435c = null;
                bVar.c(l2);
                if (c0187a.f3433a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                u2 = u3;
            } else {
                i6++;
            }
            i5++;
        }
        Object obj = c0187a.f3435c;
        c0187a.f3435c = null;
        bVar.c(c0187a);
        if (i6 > 0) {
            C0187a l3 = l(obj, c0187a.f3433a, u2, i6);
            f(l3, i3);
            l3.f3435c = null;
            bVar.c(l3);
        }
    }

    public void f(C0187a c0187a, int i) {
        B b2 = (B) this.e;
        b2.a(c0187a);
        int i2 = c0187a.f3433a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            b2.c(i, c0187a.f3436d, c0187a.f3435c);
        } else {
            int i3 = c0187a.f3436d;
            RecyclerView recyclerView = b2.f3369a;
            recyclerView.R(i, i3, true);
            recyclerView.f2155j0 = true;
            recyclerView.f2151g0.f3424c += i3;
        }
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f3446d;
        int size = arrayList.size();
        while (i2 < size) {
            C0187a c0187a = (C0187a) arrayList.get(i2);
            int i3 = c0187a.f3433a;
            if (i3 == 8) {
                int i4 = c0187a.f3434b;
                if (i4 == i) {
                    i = c0187a.f3436d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0187a.f3436d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0187a.f3434b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0187a.f3436d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0187a.f3436d;
                }
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        S0 s0 = (S0) this.e;
        if (s0 != null) {
            return s0.f3882a;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        S0 s0 = (S0) this.e;
        if (s0 != null) {
            return s0.f3883b;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.f3445c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList f2;
        View view = (View) this.f3444b;
        Context context = view.getContext();
        int[] iArr = AbstractC0155a.f3055y;
        M0.h i2 = M0.h.i(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) i2.f617c;
        View view2 = (View) this.f3444b;
        O.K.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) i2.f617c, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f3443a = typedArray.getResourceId(0, -1);
                C0281u c0281u = (C0281u) this.f3445c;
                Context context2 = view.getContext();
                int i3 = this.f3443a;
                synchronized (c0281u) {
                    f2 = c0281u.f4028a.f(context2, i3);
                }
                if (f2 != null) {
                    r(f2);
                }
            }
            if (typedArray.hasValue(1)) {
                O.B.i(view, i2.b(1));
            }
            if (typedArray.hasValue(2)) {
                O.B.j(view, AbstractC0265l0.b(typedArray.getInt(2, -1), null));
            }
        } finally {
            i2.l();
        }
    }

    public C0187a l(Object obj, int i, int i2, int i3) {
        C0187a c0187a = (C0187a) ((N.b) this.f3444b).a();
        if (c0187a != null) {
            c0187a.f3433a = i;
            c0187a.f3434b = i2;
            c0187a.f3436d = i3;
            c0187a.f3435c = obj;
            return c0187a;
        }
        C0187a c0187a2 = new C0187a();
        c0187a2.f3433a = i;
        c0187a2.f3434b = i2;
        c0187a2.f3436d = i3;
        c0187a2.f3435c = obj;
        return c0187a2;
    }

    public void m() {
        this.f3443a = -1;
        r(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateList;
        this.f3443a = i;
        C0281u c0281u = (C0281u) this.f3445c;
        if (c0281u != null) {
            Context context = ((View) this.f3444b).getContext();
            synchronized (c0281u) {
                colorStateList = c0281u.f4028a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        a();
    }

    public void o(C0187a c0187a) {
        ((ArrayList) this.f3446d).add(c0187a);
        int i = c0187a.f3433a;
        B b2 = (B) this.e;
        if (i == 1) {
            b2.d(c0187a.f3434b, c0187a.f3436d);
            return;
        }
        if (i == 2) {
            int i2 = c0187a.f3434b;
            int i3 = c0187a.f3436d;
            RecyclerView recyclerView = b2.f3369a;
            recyclerView.R(i2, i3, false);
            recyclerView.f2155j0 = true;
            return;
        }
        if (i == 4) {
            b2.c(c0187a.f3434b, c0187a.f3436d, c0187a.f3435c);
        } else if (i == 8) {
            b2.e(c0187a.f3434b, c0187a.f3436d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0187a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0121 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p() {
        char c2;
        int i;
        boolean z2;
        char c3;
        C0187a l2;
        int i2;
        int i3;
        C0187a l3;
        boolean z3;
        boolean z4;
        C0187a l4;
        ArrayList arrayList = (ArrayList) this.f3445c;
        B.b bVar = (B.b) this.f3447f;
        bVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                c2 = 65535;
                i = 8;
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C0187a) arrayList.get(size)).f3433a != 8) {
                    z5 = true;
                } else if (z5) {
                    break;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i4 = size + 1;
            C0187a c0187a = (C0187a) arrayList.get(size);
            C0187a c0187a2 = (C0187a) arrayList.get(i4);
            int i5 = c0187a2.f3433a;
            if (i5 != 1) {
                C0188b c0188b = (C0188b) bVar.f10b;
                if (i5 == 2) {
                    int i6 = c0187a.f3434b;
                    int i7 = c0187a.f3436d;
                    if (i6 < i7) {
                        z4 = c0187a2.f3434b == i6 && c0187a2.f3436d == i7 - i6;
                        z3 = false;
                    } else if (c0187a2.f3434b == i7 + 1 && c0187a2.f3436d == i6 - i7) {
                        z4 = true;
                        z3 = true;
                    } else {
                        z3 = true;
                        z4 = false;
                    }
                    int i8 = c0187a2.f3434b;
                    if (i7 < i8) {
                        c0187a2.f3434b = i8 - 1;
                    } else {
                        int i9 = c0187a2.f3436d;
                        if (i7 < i8 + i9) {
                            c0187a2.f3436d = i9 - 1;
                            c0187a.f3433a = 2;
                            c0187a.f3436d = 1;
                            if (c0187a2.f3436d == 0) {
                                arrayList.remove(i4);
                                c0188b.getClass();
                                c0187a2.f3435c = null;
                                ((N.b) c0188b.f3444b).c(c0187a2);
                            }
                        }
                    }
                    int i10 = c0187a.f3434b;
                    int i11 = c0187a2.f3434b;
                    if (i10 <= i11) {
                        c0187a2.f3434b = i11 + 1;
                    } else {
                        int i12 = i11 + c0187a2.f3436d;
                        if (i10 < i12) {
                            l4 = c0188b.l(null, 2, i10 + 1, i12 - i10);
                            c0187a2.f3436d = c0187a.f3434b - c0187a2.f3434b;
                            if (z4) {
                                if (z3) {
                                    if (l4 != null) {
                                        int i13 = c0187a.f3434b;
                                        if (i13 > l4.f3434b) {
                                            c0187a.f3434b = i13 - l4.f3436d;
                                        }
                                        int i14 = c0187a.f3436d;
                                        if (i14 > l4.f3434b) {
                                            c0187a.f3436d = i14 - l4.f3436d;
                                        }
                                    }
                                    int i15 = c0187a.f3434b;
                                    if (i15 > c0187a2.f3434b) {
                                        c0187a.f3434b = i15 - c0187a2.f3436d;
                                    }
                                    int i16 = c0187a.f3436d;
                                    if (i16 > c0187a2.f3434b) {
                                        c0187a.f3436d = i16 - c0187a2.f3436d;
                                    }
                                } else {
                                    if (l4 != null) {
                                        int i17 = c0187a.f3434b;
                                        if (i17 >= l4.f3434b) {
                                            c0187a.f3434b = i17 - l4.f3436d;
                                        }
                                        int i18 = c0187a.f3436d;
                                        if (i18 >= l4.f3434b) {
                                            c0187a.f3436d = i18 - l4.f3436d;
                                        }
                                    }
                                    int i19 = c0187a.f3434b;
                                    if (i19 >= c0187a2.f3434b) {
                                        c0187a.f3434b = i19 - c0187a2.f3436d;
                                    }
                                    int i20 = c0187a.f3436d;
                                    if (i20 >= c0187a2.f3434b) {
                                        c0187a.f3436d = i20 - c0187a2.f3436d;
                                    }
                                }
                                arrayList.set(size, c0187a2);
                                if (c0187a.f3434b != c0187a.f3436d) {
                                    arrayList.set(i4, c0187a);
                                } else {
                                    arrayList.remove(i4);
                                }
                                if (l4 != null) {
                                    arrayList.add(size, l4);
                                }
                            } else {
                                arrayList.set(size, c0187a2);
                                arrayList.remove(i4);
                                c0188b.getClass();
                                c0187a.f3435c = null;
                                ((N.b) c0188b.f3444b).c(c0187a);
                            }
                        }
                    }
                    l4 = null;
                    if (z4) {
                    }
                } else if (i5 == 4) {
                    int i21 = c0187a.f3436d;
                    int i22 = c0187a2.f3434b;
                    if (i21 < i22) {
                        c0187a2.f3434b = i22 - 1;
                    } else {
                        int i23 = c0187a2.f3436d;
                        if (i21 < i22 + i23) {
                            c0187a2.f3436d = i23 - 1;
                            l2 = c0188b.l(c0187a2.f3435c, 4, c0187a.f3434b, 1);
                            i2 = c0187a.f3434b;
                            i3 = c0187a2.f3434b;
                            if (i2 > i3) {
                                c0187a2.f3434b = i3 + 1;
                            } else {
                                int i24 = i3 + c0187a2.f3436d;
                                if (i2 < i24) {
                                    int i25 = i24 - i2;
                                    l3 = c0188b.l(c0187a2.f3435c, 4, i2 + 1, i25);
                                    c0187a2.f3436d -= i25;
                                    arrayList.set(i4, c0187a);
                                    if (c0187a2.f3436d > 0) {
                                        arrayList.set(size, c0187a2);
                                    } else {
                                        arrayList.remove(size);
                                        c0188b.getClass();
                                        c0187a2.f3435c = null;
                                        ((N.b) c0188b.f3444b).c(c0187a2);
                                    }
                                    if (l2 != null) {
                                        arrayList.add(size, l2);
                                    }
                                    if (l3 != null) {
                                        arrayList.add(size, l3);
                                    }
                                }
                            }
                            l3 = null;
                            arrayList.set(i4, c0187a);
                            if (c0187a2.f3436d > 0) {
                            }
                            if (l2 != null) {
                            }
                            if (l3 != null) {
                            }
                        }
                    }
                    l2 = null;
                    i2 = c0187a.f3434b;
                    i3 = c0187a2.f3434b;
                    if (i2 > i3) {
                    }
                    l3 = null;
                    arrayList.set(i4, c0187a);
                    if (c0187a2.f3436d > 0) {
                    }
                    if (l2 != null) {
                    }
                    if (l3 != null) {
                    }
                }
            } else {
                int i26 = c0187a.f3436d;
                int i27 = c0187a2.f3434b;
                int i28 = i26 < i27 ? -1 : 0;
                int i29 = c0187a.f3434b;
                if (i29 < i27) {
                    i28++;
                }
                if (i27 <= i29) {
                    c0187a.f3434b = i29 + c0187a2.f3436d;
                }
                int i30 = c0187a2.f3434b;
                if (i30 <= i26) {
                    c0187a.f3436d = i26 + c0187a2.f3436d;
                }
                c0187a2.f3434b = i30 + i28;
                arrayList.set(size, c0187a2);
                arrayList.set(i4, c0187a);
            }
        }
        int size2 = arrayList.size();
        int i31 = 0;
        while (i31 < size2) {
            C0187a c0187a3 = (C0187a) arrayList.get(i31);
            int i32 = c0187a3.f3433a;
            if (i32 != 1) {
                N.b bVar2 = (N.b) this.f3444b;
                B b2 = (B) this.e;
                if (i32 == 2) {
                    int i33 = c0187a3.f3434b;
                    int i34 = c0187a3.f3436d + i33;
                    int i35 = i33;
                    int i36 = 0;
                    char c4 = 65535;
                    while (i35 < i34) {
                        if (b2.b(i35) != null || b(i35)) {
                            if (c4 == 0) {
                                e(l(null, 2, i33, i36));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c3 = 1;
                        } else {
                            if (c4 == 1) {
                                o(l(null, 2, i33, i36));
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            c3 = 0;
                        }
                        if (z2) {
                            i35 -= i36;
                            i34 -= i36;
                            i36 = 1;
                        } else {
                            i36++;
                        }
                        i35++;
                        c4 = c3;
                    }
                    if (i36 != c0187a3.f3436d) {
                        c0187a3.f3435c = null;
                        bVar2.c(c0187a3);
                        c0187a3 = l(null, 2, i33, i36);
                    }
                    if (c4 == 0) {
                        e(c0187a3);
                    } else {
                        o(c0187a3);
                    }
                } else if (i32 == 4) {
                    int i37 = c0187a3.f3434b;
                    int i38 = c0187a3.f3436d + i37;
                    char c5 = c2;
                    int i39 = i37;
                    int i40 = 0;
                    while (i37 < i38) {
                        if (b2.b(i37) != null || b(i37)) {
                            if (c5 == 0) {
                                e(l(c0187a3.f3435c, 4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            c5 = 1;
                        } else {
                            if (c5 == 1) {
                                o(l(c0187a3.f3435c, 4, i39, i40));
                                i39 = i37;
                                i40 = 0;
                            }
                            c5 = 0;
                        }
                        i40++;
                        i37++;
                    }
                    if (i40 != c0187a3.f3436d) {
                        Object obj = c0187a3.f3435c;
                        c0187a3.f3435c = null;
                        bVar2.c(c0187a3);
                        c0187a3 = l(obj, 4, i39, i40);
                    }
                    if (c5 == 0) {
                        e(c0187a3);
                    } else {
                        o(c0187a3);
                    }
                } else if (i32 == i) {
                    o(c0187a3);
                }
            } else {
                o(c0187a3);
            }
            i31++;
            c2 = 65535;
            i = 8;
        }
        arrayList.clear();
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0187a c0187a = (C0187a) arrayList.get(i);
            c0187a.f3435c = null;
            ((N.b) this.f3444b).c(c0187a);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((S0) this.f3446d) == null) {
                this.f3446d = new S0();
            }
            S0 s0 = (S0) this.f3446d;
            s0.f3882a = colorStateList;
            s0.f3885d = true;
        } else {
            this.f3446d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((S0) this.e) == null) {
            this.e = new S0();
        }
        S0 s0 = (S0) this.e;
        s0.f3882a = colorStateList;
        s0.f3885d = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((S0) this.e) == null) {
            this.e = new S0();
        }
        S0 s0 = (S0) this.e;
        s0.f3883b = mode;
        s0.f3884c = true;
        a();
    }

    public int u(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f3446d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0187a c0187a = (C0187a) arrayList.get(size);
            int i5 = c0187a.f3433a;
            if (i5 == 8) {
                int i6 = c0187a.f3434b;
                int i7 = c0187a.f3436d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0187a.f3434b = i6 + 1;
                            c0187a.f3436d = i7 + 1;
                        } else if (i2 == 2) {
                            c0187a.f3434b = i6 - 1;
                            c0187a.f3436d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0187a.f3436d = i7 + 1;
                    } else if (i2 == 2) {
                        c0187a.f3436d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0187a.f3434b = i6 + 1;
                    } else if (i2 == 2) {
                        c0187a.f3434b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0187a.f3434b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0187a.f3436d;
                    } else if (i5 == 2) {
                        i += c0187a.f3436d;
                    }
                } else if (i2 == 1) {
                    c0187a.f3434b = i8 + 1;
                } else if (i2 == 2) {
                    c0187a.f3434b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0187a c0187a2 = (C0187a) arrayList.get(size2);
            int i9 = c0187a2.f3433a;
            N.b bVar = (N.b) this.f3444b;
            if (i9 == 8) {
                int i10 = c0187a2.f3436d;
                if (i10 == c0187a2.f3434b || i10 < 0) {
                    arrayList.remove(size2);
                    c0187a2.f3435c = null;
                    bVar.c(c0187a2);
                }
            } else if (c0187a2.f3436d <= 0) {
                arrayList.remove(size2);
                c0187a2.f3435c = null;
                bVar.c(c0187a2);
            }
        }
        return i;
    }

    public C0188b(B b2) {
        this.f3444b = new N.b(30);
        this.f3445c = new ArrayList();
        this.f3446d = new ArrayList();
        this.f3443a = 0;
        this.e = b2;
        this.f3447f = new B.b(24, this);
    }
}
