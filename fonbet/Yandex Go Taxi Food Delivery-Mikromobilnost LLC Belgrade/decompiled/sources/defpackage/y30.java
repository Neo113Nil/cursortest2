package defpackage;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes9.dex */
public final class y30 {
    public final Context a;
    public Activity b;

    public y30(Context context) {
        this.a = context;
    }

    public final Context a() {
        Activity activity = this.b;
        if (activity != null) {
            return activity;
        }
        jgz jgzVar = jgz.a;
        jgz.c(new IllegalStateException("Activity context should be provided. Returning application context instead.\nThis will lead to UI elements that rely on it (such as dialogs) to not work properly.\nThis can also lead to crashes if not handled."));
        return this.a;
    }
}
