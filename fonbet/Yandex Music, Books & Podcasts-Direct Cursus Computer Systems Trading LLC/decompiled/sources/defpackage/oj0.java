package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.input.nestedscroll.a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class oj0 extends ViewGroup implements nyi, op5, vzj, jpj {
    public static final /* synthetic */ int z = 0;
    public final cyi a;
    public final View b;
    public final uzj c;
    public Function0 d;
    public boolean e;
    public Function0 f;
    public Function0 g;
    public yci h;
    public Function1 i;
    public jx7 j;
    public Function1 k;
    public dzf l;
    public woo m;
    public final int[] n;
    public long o;
    public kqv p;
    public final nj0 q;
    public final nj0 r;
    public Function1 s;
    public final int[] t;
    public int u;
    public int v;
    public final c9n w;
    public boolean x;
    public final mpf y;

    public oj0(@NotNull Context context, tr5 tr5Var, int i, @NotNull cyi cyiVar, @NotNull View view, @NotNull uzj uzjVar) {
        super(context);
        this.a = cyiVar;
        this.b = view;
        this.c = uzjVar;
        if (tr5Var != null) {
            LinkedHashMap linkedHashMap = erv.a;
            setTag(R.id.androidx_compose_ui_view_composition_context, tr5Var);
        }
        int i2 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        wdu.t(this, new hj0(this, i2));
        ndu.n(this, this);
        this.d = e1.J;
        this.f = e1.I;
        this.g = e1.H;
        vci vciVar = vci.a;
        this.h = vciVar;
        this.j = zsd.l();
        int i3 = 2;
        this.n = new int[2];
        this.o = 0L;
        this.q = new nj0(this, 1);
        this.r = new nj0(this, i2);
        this.t = new int[2];
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = new c9n(9, (byte) 0);
        int i4 = 3;
        mpf mpfVar = new mpf(3);
        mpfVar.g = true;
        mpfVar.o = this;
        yci b = nfp.b(a.a(vciVar, sj2.b, cyiVar), true, d5.K);
        tfm tfmVar = new tfm();
        tfmVar.a = new jj0(this, 1);
        dgh dghVar = new dgh();
        dgh dghVar2 = tfmVar.b;
        if (dghVar2 != null) {
            dghVar2.b = null;
        }
        tfmVar.b = dghVar;
        dghVar.b = tfmVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(dghVar);
        yci d = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(androidx.compose.ui.graphics.a.b(b.f(tfmVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, false, 131071), new lj0(this, mpfVar, this)), new ij0(this, mpfVar, i3));
        mpfVar.c0(this.h.f(d));
        this.i = new al(10, mpfVar, d);
        mpfVar.Z(this.j);
        this.k = new m40(i4, mpfVar);
        mpfVar.X = new ij0(this, mpfVar, i2);
        mpfVar.Y = new jj0(this, 0);
        mpfVar.b0(new kj0(this, mpfVar));
        this.y = mpfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wzj getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            sme.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.c.getSnapshotObserver();
    }

    public static final int i(oj0 oj0Var, int i, int i2, int i3) {
        return (i3 >= 0 || i == i2) ? View.MeasureSpec.makeMeasureSpec(yhn.d(i3, i, i2), 1073741824) : (i3 != -2 || i2 == Integer.MAX_VALUE) ? (i3 != -1 || i2 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }

    public static zne j(zne zneVar, int i, int i2, int i3, int i4) {
        int i5 = zneVar.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = zneVar.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = zneVar.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = zneVar.d - i4;
        return zne.c(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    @Override // defpackage.jpj
    public final kqv G(View view, kqv kqvVar) {
        this.p = new kqv(kqvVar);
        return l(kqvVar);
    }

    @Override // defpackage.vzj
    public final boolean U() {
        return isAttachedToWindow();
    }

    @Override // defpackage.op5
    public final void a() {
        this.f.invoke();
        removeAllViewsInLayout();
    }

    @Override // defpackage.op5
    public final void b() {
        View view = this.b;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f.invoke();
        }
    }

    @Override // defpackage.myi
    public final void c(int i, View view) {
        c9n c9nVar = this.w;
        if (i == 1) {
            c9nVar.c = 0;
        } else {
            c9nVar.b = 0;
        }
    }

    @Override // defpackage.myi
    public final void d(View view, View view2, int i, int i2) {
        c9n c9nVar = this.w;
        if (i2 == 1) {
            c9nVar.c = i;
        } else {
            c9nVar.b = i;
        }
    }

    @Override // defpackage.op5
    public final void e() {
        this.g.invoke();
    }

    @Override // defpackage.myi
    public final void g(View view, int i, int i2, int[] iArr, int i3) {
        if (this.b.isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(f * f2) << 32) | (Float.floatToRawIntBits(i2 * f2) & 4294967295L);
            int i4 = i3 == 0 ? 1 : 2;
            gyi gyiVar = this.a.a;
            gyi gyiVar2 = null;
            if (gyiVar != null && gyiVar.n) {
                gyiVar2 = (gyi) q7g.F(gyiVar);
            }
            long x = gyiVar2 != null ? gyiVar2.x(i4, floatToRawIntBits) : 0L;
            iArr[0] = ivf.z(Float.intBitsToFloat((int) (x >> 32)));
            iArr[1] = ivf.z(Float.intBitsToFloat((int) (x & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.t;
        getLocationInWindow(iArr);
        int i = iArr[0];
        region.op(i, iArr[1], getWidth() + i, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @NotNull
    public final jx7 getDensity() {
        return this.j;
    }

    public final View getInteropView() {
        return this.b;
    }

    @NotNull
    public final mpf getLayoutNode() {
        return this.y;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final dzf getLifecycleOwner() {
        return this.l;
    }

    @NotNull
    public final yci getModifier() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        c9n c9nVar = this.w;
        return c9nVar.c | c9nVar.b;
    }

    public final Function1<jx7, Unit> getOnDensityChanged$ui_release() {
        return this.k;
    }

    public final Function1<yci, Unit> getOnModifierChanged$ui_release() {
        return this.i;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.s;
    }

    @NotNull
    public final Function0<Unit> getRelease() {
        return this.g;
    }

    @NotNull
    public final Function0<Unit> getReset() {
        return this.f;
    }

    public final woo getSavedStateRegistryOwner() {
        return this.m;
    }

    @NotNull
    public final Function0<Unit> getUpdate() {
        return this.d;
    }

    @NotNull
    public final View getView() {
        return this.b;
    }

    @Override // defpackage.nyi
    public final void h(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.b.isNestedScrollingEnabled()) {
            float f = i;
            float f2 = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(f * f2) << 32) | (Float.floatToRawIntBits(i2 * f2) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * f2) << 32) | (Float.floatToRawIntBits(i4 * f2) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            gyi gyiVar = this.a.a;
            gyi gyiVar2 = null;
            if (gyiVar != null && gyiVar.n) {
                gyiVar2 = (gyi) q7g.F(gyiVar);
            }
            gyi gyiVar3 = gyiVar2;
            long K = gyiVar3 != null ? gyiVar3.K(i6, floatToRawIntBits, floatToRawIntBits2) : 0L;
            iArr[0] = ivf.z(Float.intBitsToFloat((int) (K >> 32)));
            iArr[1] = ivf.z(Float.intBitsToFloat((int) (K & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.x) {
            this.y.B();
            return null;
        }
        this.b.postOnAnimation(new ti(2, this.r));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.b.isNestedScrollingEnabled();
    }

    @Override // defpackage.myi
    public final void k(View view, int i, int i2, int i3, int i4, int i5) {
        if (this.b.isNestedScrollingEnabled()) {
            float f = -1;
            long floatToRawIntBits = (Float.floatToRawIntBits(i * f) << 32) | (Float.floatToRawIntBits(i2 * f) & 4294967295L);
            long floatToRawIntBits2 = (Float.floatToRawIntBits(i3 * f) << 32) | (Float.floatToRawIntBits(i4 * f) & 4294967295L);
            int i6 = i5 == 0 ? 1 : 2;
            gyi gyiVar = this.a.a;
            gyi gyiVar2 = null;
            if (gyiVar != null && gyiVar.n) {
                gyiVar2 = (gyi) q7g.F(gyiVar);
            }
            if (gyiVar2 != null) {
                gyiVar2.K(i6, floatToRawIntBits, floatToRawIntBits2);
            }
        }
    }

    public final kqv l(kqv kqvVar) {
        hqv hqvVar = kqvVar.a;
        zne g = hqvVar.g(-1);
        zne zneVar = zne.e;
        if (!g.equals(zneVar) || !hqvVar.h(-9).equals(zneVar) || hqvVar.f() != null) {
            ane aneVar = (ane) this.y.F.c;
            if (aneVar.X.n) {
                long Q = xv.Q(aneVar.S(0L));
                int i = (int) (Q >> 32);
                if (i < 0) {
                    i = 0;
                }
                int i2 = (int) (Q & 4294967295L);
                if (i2 < 0) {
                    i2 = 0;
                }
                long j = ltg.D(aneVar).j();
                int i3 = (int) (j >> 32);
                int i4 = (int) (j & 4294967295L);
                long j2 = aneVar.c;
                long Q2 = xv.Q(aneVar.S((Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L)));
                int i5 = i3 - ((int) (Q2 >> 32));
                if (i5 < 0) {
                    i5 = 0;
                }
                int i6 = i4 - ((int) (4294967295L & Q2));
                int i7 = i6 >= 0 ? i6 : 0;
                if (i != 0 || i2 != 0 || i5 != 0 || i7 != 0) {
                    return kqvVar.a.n(i, i2, i5, i7);
                }
            }
        }
        return kqvVar;
    }

    @Override // defpackage.myi
    public final boolean o(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.x) {
            this.y.B();
        } else {
            this.b.postOnAnimation(new ti(2, this.r));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: all -> 0x009b, TryCatch #0 {all -> 0x009b, blocks: (B:4:0x000e, B:8:0x001a, B:11:0x0082, B:15:0x008d, B:17:0x009d, B:19:0x0092, B:23:0x002b, B:26:0x0037, B:28:0x004c, B:30:0x0058, B:32:0x0062, B:34:0x0072, B:41:0x007d, B:44:0x00a1), top: B:3:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        int i;
        int i2;
        super.onDetachedFromWindow();
        a42 a42Var = getSnapshotObserver().a;
        synchronized (a42Var.b) {
            try {
                eqi eqiVar = (eqi) a42Var.h;
                int i3 = eqiVar.c;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = eqiVar.a;
                    if (i4 < i3) {
                        v2r v2rVar = (v2r) objArr[i4];
                        cpi cpiVar = (cpi) v2rVar.f.k(this);
                        if (cpiVar != null) {
                            Object[] objArr2 = cpiVar.b;
                            int[] iArr = cpiVar.c;
                            long[] jArr = cpiVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8;
                                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                                        int i9 = 0;
                                        while (i9 < i8) {
                                            if ((j & 255) < 128) {
                                                int i10 = (i6 << 3) + i9;
                                                i2 = i7;
                                                Object obj = objArr2[i10];
                                                int i11 = iArr[i10];
                                                v2rVar.d(this, obj);
                                            } else {
                                                i2 = i7;
                                            }
                                            j >>= i2;
                                            i9++;
                                            i7 = i2;
                                        }
                                        if (i8 != i7) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (v2rVar.f.e == 0) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = eqiVar.a;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (v2rVar.f.e == 0) {
                        }
                        i4 = i + 1;
                    } else {
                        int i12 = i3 - i5;
                        Arrays.fill(objArr, i12, i3, (Object) null);
                        eqiVar.c = i12;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        this.b.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View view = this.b;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i, i2);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.u = i;
        this.v = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        x97.y(this.a.c(), null, null, new col(z2, this, bzf.s(f * (-1.0f), f2 * (-1.0f)), null, 2), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!this.b.isNestedScrollingEnabled()) {
            return false;
        }
        x97.y(this.a.c(), null, null, new mj0(this, bzf.s(f * (-1.0f), f2 * (-1.0f)), (Continuation) null, 0), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        Function1 function1 = this.s;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z2));
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public final void setDensity(@NotNull jx7 jx7Var) {
        if (jx7Var != this.j) {
            this.j = jx7Var;
            Function1 function1 = this.k;
            if (function1 != null) {
                function1.invoke(jx7Var);
            }
        }
    }

    public final void setLifecycleOwner(dzf dzfVar) {
        if (dzfVar != this.l) {
            this.l = dzfVar;
            setTag(R.id.view_tree_lifecycle_owner, dzfVar);
        }
    }

    public final void setModifier(@NotNull yci yciVar) {
        if (yciVar != this.h) {
            this.h = yciVar;
            Function1 function1 = this.i;
            if (function1 != null) {
                function1.invoke(yciVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super jx7, Unit> function1) {
        this.k = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super yci, Unit> function1) {
        this.i = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.s = function1;
    }

    public final void setRelease(@NotNull Function0<Unit> function0) {
        this.g = function0;
    }

    public final void setReset(@NotNull Function0<Unit> function0) {
        this.f = function0;
    }

    public final void setSavedStateRegistryOwner(woo wooVar) {
        if (wooVar != this.m) {
            this.m = wooVar;
            setTag(R.id.view_tree_saved_state_registry_owner, wooVar);
        }
    }

    public final void setUpdate(@NotNull Function0<Unit> function0) {
        this.d = function0;
        this.e = true;
        this.q.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
