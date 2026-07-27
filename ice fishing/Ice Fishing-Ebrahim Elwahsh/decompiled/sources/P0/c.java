package P0;

import J0.s;
import S0.p;
import android.os.Build;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f2684f;

    static {
        String f6 = s.f("NetworkMeteredCtrlr");
        h.d(f6, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f2684f = f6;
    }

    @Override // P0.b
    public final boolean a(p workSpec) {
        h.e(workSpec, "workSpec");
        return workSpec.f2928j.f1299a == 5;
    }

    @Override // P0.b
    public final boolean b(Object obj) {
        O0.a value = (O0.a) obj;
        h.e(value, "value");
        int i = Build.VERSION.SDK_INT;
        boolean z8 = value.f2340a;
        if (i >= 26) {
            return (z8 && value.f2342c) ? false : true;
        }
        s.d().a(f2684f, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z8;
    }
}
