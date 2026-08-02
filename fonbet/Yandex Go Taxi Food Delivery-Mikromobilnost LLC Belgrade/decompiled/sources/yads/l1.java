package yads;

import android.app.Activity;
import defpackage.tls;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class l1 extends Lambda implements tls {
    public static final l1 w = new l1();

    public l1() {
        super(1);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Activity activity = (Activity) ((WeakReference) obj).get();
        return Boolean.valueOf(activity == null || activity.isFinishing() || activity.isDestroyed());
    }
}
