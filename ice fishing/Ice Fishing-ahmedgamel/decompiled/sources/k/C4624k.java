package k;

import O.C0330e0;
import a.AbstractC0422a;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4624k {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f38546c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0422a f38547d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38548e;

    /* renamed from: b, reason: collision with root package name */
    public long f38545b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C4623j f38549f = new C4623j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38544a = new ArrayList();

    public final void a() {
        if (this.f38548e) {
            Iterator it = this.f38544a.iterator();
            while (it.hasNext()) {
                ((C0330e0) it.next()).b();
            }
            this.f38548e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f38548e) {
            return;
        }
        Iterator it = this.f38544a.iterator();
        while (it.hasNext()) {
            C0330e0 c0330e0 = (C0330e0) it.next();
            long j6 = this.f38545b;
            if (j6 >= 0) {
                c0330e0.c(j6);
            }
            BaseInterpolator baseInterpolator = this.f38546c;
            if (baseInterpolator != null && (view = (View) c0330e0.f2073a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f38547d != null) {
                c0330e0.d(this.f38549f);
            }
            View view2 = (View) c0330e0.f2073a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f38548e = true;
    }
}
