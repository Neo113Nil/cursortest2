package P;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.KotlinVersion;

/* renamed from: P.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058g {

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1316x = {R.attr.state_pressed};

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f1317y = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public final int f1318a;

    /* renamed from: b, reason: collision with root package name */
    public final StateListDrawable f1319b;

    /* renamed from: c, reason: collision with root package name */
    public final Drawable f1320c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1321d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1322e;

    /* renamed from: f, reason: collision with root package name */
    public final StateListDrawable f1323f;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable f1324g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1325h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1326i;

    /* renamed from: j, reason: collision with root package name */
    public float f1327j;

    /* renamed from: k, reason: collision with root package name */
    public float f1328k;

    /* renamed from: n, reason: collision with root package name */
    public final RecyclerView f1331n;

    /* renamed from: u, reason: collision with root package name */
    public final ValueAnimator f1337u;

    /* renamed from: v, reason: collision with root package name */
    public int f1338v;

    /* renamed from: w, reason: collision with root package name */
    public final C.b f1339w;

    /* renamed from: l, reason: collision with root package name */
    public int f1329l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f1330m = 0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1332o = false;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f1333p = false;

    /* renamed from: q, reason: collision with root package name */
    public int f1334q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f1335r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1336s = new int[2];
    public final int[] t = new int[2];

    public C0058g(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f1337u = ofFloat;
        this.f1338v = 0;
        C.b bVar = new C.b(4, this);
        this.f1339w = bVar;
        C0055d c0055d = new C0055d();
        this.f1319b = stateListDrawable;
        this.f1320c = drawable;
        this.f1323f = stateListDrawable2;
        this.f1324g = drawable2;
        this.f1321d = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f1322e = Math.max(i2, drawable.getIntrinsicWidth());
        this.f1325h = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f1326i = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1318a = i4;
        stateListDrawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        drawable.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        ofFloat.addListener(new C0056e(this));
        ofFloat.addUpdateListener(new C0057f(this));
        RecyclerView recyclerView2 = this.f1331n;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            w wVar = recyclerView2.f2563i;
            if (wVar != null) {
                wVar.a("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2565j;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f1331n;
            recyclerView3.f2567k.remove(this);
            if (recyclerView3.f2568l == this) {
                recyclerView3.f2568l = null;
            }
            ArrayList arrayList2 = this.f1331n.f2556d0;
            if (arrayList2 != null) {
                arrayList2.remove(c0055d);
            }
            this.f1331n.removeCallbacks(bVar);
        }
        this.f1331n = recyclerView;
        if (recyclerView != null) {
            w wVar2 = recyclerView.f2563i;
            if (wVar2 != null) {
                wVar2.a("Cannot add item decoration during a scroll  or layout");
            }
            ArrayList arrayList3 = recyclerView.f2565j;
            if (arrayList3.isEmpty()) {
                recyclerView.setWillNotDraw(false);
            }
            arrayList3.add(this);
            recyclerView.m();
            recyclerView.requestLayout();
            this.f1331n.f2567k.add(this);
            RecyclerView recyclerView4 = this.f1331n;
            if (recyclerView4.f2556d0 == null) {
                recyclerView4.f2556d0 = new ArrayList();
            }
            recyclerView4.f2556d0.add(c0055d);
        }
    }

    public static int d(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / i5) * i6);
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public final boolean a(float f2, float f3) {
        return f3 >= ((float) (this.f1330m - this.f1325h)) && f2 >= ((float) (0 - (0 / 2))) && f2 <= ((float) ((0 / 2) + 0));
    }

    public final boolean b(float f2, float f3) {
        RecyclerView recyclerView = this.f1331n;
        Field field = y.x.f8596a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i2 = this.f1321d;
        if (z2) {
            if (f2 > i2 / 2) {
                return false;
            }
        } else if (f2 < this.f1329l - i2) {
            return false;
        }
        int i3 = 0 / 2;
        return f3 >= ((float) (0 - i3)) && f3 <= ((float) (i3 + 0));
    }

    public final boolean c(MotionEvent motionEvent) {
        int i2 = this.f1334q;
        if (i2 == 1) {
            boolean b2 = b(motionEvent.getX(), motionEvent.getY());
            boolean a2 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b2 && !a2) {
                return false;
            }
            if (a2) {
                this.f1335r = 1;
                this.f1328k = (int) motionEvent.getX();
            } else if (b2) {
                this.f1335r = 2;
                this.f1327j = (int) motionEvent.getY();
            }
            e(2);
        } else if (i2 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int i2) {
        C.b bVar = this.f1339w;
        StateListDrawable stateListDrawable = this.f1319b;
        if (i2 == 2 && this.f1334q != 2) {
            stateListDrawable.setState(f1316x);
            this.f1331n.removeCallbacks(bVar);
        }
        if (i2 == 0) {
            this.f1331n.invalidate();
        } else {
            f();
        }
        if (this.f1334q == 2 && i2 != 2) {
            stateListDrawable.setState(f1317y);
            this.f1331n.removeCallbacks(bVar);
            this.f1331n.postDelayed(bVar, 1200);
        } else if (i2 == 1) {
            this.f1331n.removeCallbacks(bVar);
            this.f1331n.postDelayed(bVar, 1500);
        }
        this.f1334q = i2;
    }

    public final void f() {
        int i2 = this.f1338v;
        ValueAnimator valueAnimator = this.f1337u;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f1338v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
