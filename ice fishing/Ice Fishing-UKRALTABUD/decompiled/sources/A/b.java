package A;

import L.C0053d;
import L.C0057h;
import L.v;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import h.AbstractC0150A;
import h.C0165i;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import l0.C0200c;
import w.x;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f10g;

    public /* synthetic */ b(int i2, Object obj) {
        this.f9f = i2;
        this.f10g = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0165i c0165i;
        Object obj = this.f10g;
        switch (this.f9f) {
            case 0:
                g gVar = (g) obj;
                if (gVar.f26o) {
                    boolean z2 = gVar.f24m;
                    a aVar = gVar.f12a;
                    if (z2) {
                        gVar.f24m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f4e = currentAnimationTimeMillis;
                        aVar.f6g = -1L;
                        aVar.f5f = currentAnimationTimeMillis;
                        aVar.f7h = 0.5f;
                    }
                    if ((aVar.f6g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f6g + aVar.f8i) || !gVar.e()) {
                        gVar.f26o = false;
                        return;
                    }
                    boolean z3 = gVar.f25n;
                    ListView listView = gVar.f14c;
                    if (z3) {
                        gVar.f25n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f5f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar.a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - aVar.f5f;
                    aVar.f5f = currentAnimationTimeMillis2;
                    gVar.f28q.scrollListBy((int) (j2 * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * aVar.f3d));
                    Field field = x.f3069a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                C0057h c0057h = (C0057h) obj;
                int i2 = c0057h.f643v;
                ValueAnimator valueAnimator = c0057h.f642u;
                if (i2 == 1) {
                    valueAnimator.cancel();
                } else if (i2 != 2) {
                    return;
                }
                c0057h.f643v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case F.k.FLOAT_FIELD_NUMBER /* 2 */:
                v vVar = ((RecyclerView) obj).f1566I;
                if (vVar != null) {
                    C0053d c0053d = (C0053d) vVar;
                    ArrayList arrayList = c0053d.f607e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0053d.f609g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0053d.f610h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0053d.f608f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (isEmpty && isEmpty2 && isEmpty4 && isEmpty3) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList.clear();
                    if (!isEmpty2) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.addAll(arrayList2);
                        ArrayList arrayList6 = c0053d.f612j;
                        arrayList6.add(arrayList5);
                        arrayList2.clear();
                        if (!isEmpty) {
                            E0.h.i(arrayList5.get(0));
                            throw null;
                        }
                        Iterator it2 = arrayList5.iterator();
                        if (it2.hasNext()) {
                            E0.h.i(it2.next());
                            throw null;
                        }
                        arrayList5.clear();
                        arrayList6.remove(arrayList5);
                    }
                    if (!isEmpty3) {
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.addAll(arrayList3);
                        ArrayList arrayList8 = c0053d.f613k;
                        arrayList8.add(arrayList7);
                        arrayList3.clear();
                        if (!isEmpty) {
                            E0.h.i(arrayList7.get(0));
                            throw null;
                        }
                        Iterator it3 = arrayList7.iterator();
                        if (it3.hasNext()) {
                            E0.h.i(it3.next());
                            throw null;
                        }
                        arrayList7.clear();
                        arrayList8.remove(arrayList7);
                    }
                    if (isEmpty4) {
                        return;
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList4);
                    ArrayList arrayList10 = c0053d.f611i;
                    arrayList10.add(arrayList9);
                    arrayList4.clear();
                    if (!isEmpty || !isEmpty2 || !isEmpty3) {
                        Math.max(!isEmpty2 ? c0053d.f674c : 0L, isEmpty3 ? 0L : c0053d.f675d);
                        arrayList9.get(0).getClass();
                        throw new ClassCastException();
                    }
                    Iterator it4 = arrayList9.iterator();
                    if (it4.hasNext()) {
                        it4.next().getClass();
                        throw new ClassCastException();
                    }
                    arrayList9.clear();
                    arrayList10.remove(arrayList9);
                    return;
                }
                return;
            case F.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((StaggeredGridLayoutManager) obj).J();
                return;
            case F.k.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0150A abstractC0150A = (AbstractC0150A) obj;
                abstractC0150A.r = null;
                abstractC0150A.drawableStateChanged();
                return;
            case F.k.STRING_FIELD_NUMBER /* 5 */:
                ActionMenuView actionMenuView = ((Toolbar) obj).f1266f;
                if (actionMenuView == null || (c0165i = actionMenuView.f1156x) == null) {
                    return;
                }
                c0165i.f();
                return;
            default:
                Object obj2 = ((C0200c) obj).f2689g;
                return;
        }
    }

    public b(C0200c c0200c, int i2) {
        this.f9f = 6;
        this.f10g = c0200c;
    }
}
