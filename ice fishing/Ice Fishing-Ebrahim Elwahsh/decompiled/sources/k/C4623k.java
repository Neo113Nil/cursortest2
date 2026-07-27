package k;

import O.C0343e0;
import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4623k {

    /* renamed from: c, reason: collision with root package name */
    public BaseInterpolator f38666c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.f f38667d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38668e;

    /* renamed from: b, reason: collision with root package name */
    public long f38665b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final C4622j f38669f = new C4622j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38664a = new ArrayList();

    public final void a() {
        if (this.f38668e) {
            Iterator it = this.f38664a.iterator();
            while (it.hasNext()) {
                ((C0343e0) it.next()).b();
            }
            this.f38668e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f38668e) {
            return;
        }
        Iterator it = this.f38664a.iterator();
        while (it.hasNext()) {
            C0343e0 c0343e0 = (C0343e0) it.next();
            long j9 = this.f38665b;
            if (j9 >= 0) {
                c0343e0.c(j9);
            }
            BaseInterpolator baseInterpolator = this.f38666c;
            if (baseInterpolator != null && (view = (View) c0343e0.f2259a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f38667d != null) {
                c0343e0.d(this.f38669f);
            }
            View view2 = (View) c0343e0.f2259a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f38668e = true;
    }
}
