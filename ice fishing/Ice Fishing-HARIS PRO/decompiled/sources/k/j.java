package k;

import O.N;
import a.AbstractC0078a;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f3364c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0078a f3365d;
    public boolean e;

    /* renamed from: b, reason: collision with root package name */
    public long f3363b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C0185i f3366f = new C0185i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3362a = new ArrayList();

    public final void a() {
        if (this.e) {
            Iterator it = this.f3362a.iterator();
            while (it.hasNext()) {
                ((N) it.next()).b();
            }
            this.e = false;
        }
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.f3362a.iterator();
        while (it.hasNext()) {
            N n2 = (N) it.next();
            long j = this.f3363b;
            if (j >= 0) {
                n2.c(j);
            }
            BaseInterpolator baseInterpolator = this.f3364c;
            if (baseInterpolator != null && (view = (View) n2.f756a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f3365d != null) {
                n2.d(this.f3366f);
            }
            View view2 = (View) n2.f756a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
