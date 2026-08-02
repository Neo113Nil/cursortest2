package N3;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class A implements x {

    /* renamed from: a, reason: collision with root package name */
    public final v f1956a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f1957b;

    public A(Intent intent, Activity activity) {
        this.f1957b = activity;
        if (f3.b.a(activity)) {
            this.f1956a = new v(activity.getApplicationContext(), "HpoaService", intent, new O2.i(7));
        } else {
            this.f1956a = null;
        }
    }
}
