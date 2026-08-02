package N0;

import J0.r;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1901b = r.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f1902a;

    public a(Context context) {
        this.f1902a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
