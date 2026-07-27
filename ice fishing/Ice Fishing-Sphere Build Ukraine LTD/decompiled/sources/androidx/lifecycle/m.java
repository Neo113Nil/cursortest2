package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class m extends a {
    final /* synthetic */ o this$0;

    public m(o oVar) {
        this.this$0 = oVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        E0.i.e(activity, "activity");
        this.this$0.b();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        E0.i.e(activity, "activity");
        o oVar = this.this$0;
        int i2 = oVar.f1529e + 1;
        oVar.f1529e = i2;
        if (i2 == 1 && oVar.f1532h) {
            oVar.f1534j.a(d.ON_START);
            oVar.f1532h = false;
        }
    }
}
