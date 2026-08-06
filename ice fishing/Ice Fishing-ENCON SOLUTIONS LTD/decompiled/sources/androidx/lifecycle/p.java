package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class p extends a {
    final /* synthetic */ r this$0;

    public p(r rVar) {
        this.this$0 = rVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        this.this$0.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        kotlin.jvm.internal.i.e(activity, "activity");
        r rVar = this.this$0;
        int i2 = rVar.f2489a + 1;
        rVar.f2489a = i2;
        if (i2 == 1 && rVar.f2492d) {
            rVar.f2494f.d(d.ON_START);
            rVar.f2492d = false;
        }
    }
}
