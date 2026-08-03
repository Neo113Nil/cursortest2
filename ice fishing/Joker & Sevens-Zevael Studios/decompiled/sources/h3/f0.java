package h3;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final z f2774a;

    /* renamed from: b, reason: collision with root package name */
    public List f2775b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2776c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f2777d;

    public f0(z zVar) {
        super(zVar.f2837h);
        this.f2777d = new HashMap();
        this.f2774a = zVar;
    }

    public final i0 a(WindowInsetsAnimation windowInsetsAnimation) {
        i0 i0Var = (i0) this.f2777d.get(windowInsetsAnimation);
        if (i0Var == null) {
            i0Var = new i0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                i0Var.f2788a = new g0(windowInsetsAnimation);
            }
            this.f2777d.put(windowInsetsAnimation, i0Var);
        }
        return i0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2774a.b(a(windowInsetsAnimation));
        this.f2777d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        this.f2774a.c();
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f2776c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2776c = arrayList2;
            this.f2775b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j3 = com.onesignal.common.c.j(list.get(size));
            i0 a6 = a(j3);
            fraction = j3.getFraction();
            a6.f2788a.e(fraction);
            this.f2776c.add(a6);
        }
        return this.f2774a.d(a1.c(null, windowInsets), this.f2775b).b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        x4.l e10 = this.f2774a.e(a(windowInsetsAnimation), new x4.l(bounds));
        e10.getClass();
        com.onesignal.common.c.l();
        return com.onesignal.common.c.h(((a3.b) e10.f8312h).d(), ((a3.b) e10.f8313i).d());
    }
}
