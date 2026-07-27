package L3;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class D implements A {

    /* renamed from: a, reason: collision with root package name */
    public final y f1677a;

    /* renamed from: b, reason: collision with root package name */
    public final Activity f1678b;

    public D(Intent intent, Activity activity) {
        this.f1678b = activity;
        if (d3.b.a(activity)) {
            this.f1677a = new y(activity.getApplicationContext(), "HpoaService", intent, new E3.e());
        } else {
            this.f1677a = null;
        }
    }
}
