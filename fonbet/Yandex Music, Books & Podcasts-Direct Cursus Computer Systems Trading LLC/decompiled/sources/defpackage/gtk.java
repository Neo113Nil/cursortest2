package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class gtk extends ptk {
    @Override // defpackage.ptk
    public final Executor a() {
        return new ks1(2);
    }

    @Override // defpackage.ptk
    public final Object b(Class cls, Object obj, Method method, Object... objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.b(cls, obj, method, objArr);
        }
        qq6.d("Calling default methods on API 24 and 25 is not supported");
        return null;
    }
}
