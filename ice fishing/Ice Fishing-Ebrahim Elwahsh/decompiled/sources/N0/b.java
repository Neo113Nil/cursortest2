package N0;

import J0.s;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final String f1943b = s.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f1944a;

    public b(Context context) {
        this.f1944a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
