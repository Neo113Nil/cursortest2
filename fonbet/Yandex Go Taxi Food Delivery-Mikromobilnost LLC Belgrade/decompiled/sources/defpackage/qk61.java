package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* loaded from: classes7.dex */
public final class qk61 implements bi71 {
    public final hlx0 a;
    public WeakReference b;
    public String c;

    public qk61(hlx0 hlx0Var) {
        this.a = hlx0Var;
    }

    @Override // defpackage.bi71
    public final void a(Activity activity) {
        Objects.toString(activity);
        if (this.b == null) {
            this.b = new WeakReference(activity);
        }
    }

    @Override // defpackage.bi71
    public final void b(Activity activity) {
        Objects.toString(activity);
        gg81 a = dha1.f().a(activity);
        boolean z = false;
        boolean z2 = a != null && a.J;
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra("monetization_ads_activity_click", false)) {
            z = true;
        }
        WeakReference weakReference = this.b;
        if ((weakReference == null || !activity.equals((Activity) weakReference.get()) || z2) && (!z2 || z)) {
            return;
        }
        this.a.m();
    }
}
