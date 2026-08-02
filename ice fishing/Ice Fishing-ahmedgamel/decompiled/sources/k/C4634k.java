package k;

import O.C0335e0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4634k {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f38558c;

    /* renamed from: d, reason: collision with root package name */
    public Z2.d f38559d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38560e;

    /* renamed from: b, reason: collision with root package name */
    public long f38557b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C4633j f38561f = new C4633j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38556a = new ArrayList();

    public final void a() {
        if (this.f38560e) {
            Iterator it = this.f38556a.iterator();
            while (it.hasNext()) {
                ((C0335e0) it.next()).b();
            }
            this.f38560e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f38560e) {
            return;
        }
        Iterator it = this.f38556a.iterator();
        while (it.hasNext()) {
            C0335e0 c0335e0 = (C0335e0) it.next();
            long j6 = this.f38557b;
            if (j6 >= 0) {
                c0335e0.c(j6);
            }
            BaseInterpolator baseInterpolator = this.f38558c;
            if (baseInterpolator != null && (view = (View) c0335e0.f2161a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f38559d != null) {
                c0335e0.d(this.f38561f);
            }
            View view2 = (View) c0335e0.f2161a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f38560e = true;
    }
}
