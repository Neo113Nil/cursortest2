package P0;

import J0.r;
import S0.p;
import android.os.Build;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f2349f;

    static {
        String f2 = r.f("NetworkMeteredCtrlr");
        h.d(f2, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f2349f = f2;
    }

    @Override // P0.b
    public final boolean a(p workSpec) {
        h.e(workSpec, "workSpec");
        return workSpec.f2945j.f1403a == 5;
    }

    @Override // P0.b
    public final boolean b(Object obj) {
        O0.a value = (O0.a) obj;
        h.e(value, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z6 = value.f2242a;
        if (i >= 26) {
            return (z6 && value.f2244c) ? false : true;
        }
        r.d().a(f2349f, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z6;
    }
}
