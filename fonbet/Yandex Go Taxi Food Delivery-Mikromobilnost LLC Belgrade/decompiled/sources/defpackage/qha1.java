package defpackage;

import com.yandex.delivery.mapper.model.PointType;
import com.yandex.go.address.models.Address;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes11.dex */
public abstract class qha1 {
    public static PropertyReference1Impl a(Class cls, String str, String str2) {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(str, 0, str2, cls);
        qoi0.a.getClass();
        return propertyReference1Impl;
    }

    public static final n2k0 g(pfi0 pfi0Var) {
        if (h(pfi0Var) && pfi0Var != null) {
            return pfi0Var.c();
        }
        return null;
    }

    public static final boolean h(pfi0 pfi0Var) {
        return pfi0Var != null && pfi0Var.f();
    }

    public static final oo0 k(Address address, boolean z) {
        return new oo0(address.D1(), z ? PointType.SOURCE : PointType.DESTINATION, address.getUri(), q5z.D(address), address.d(), new a0t(address.B().a, address.B().b, 0.0d), address.q0(), 128);
    }

    public abstract boolean b(x7 x7Var, o7 o7Var, o7 o7Var2);

    public abstract boolean c(w4r0 w4r0Var, Object obj, Object obj2);

    public abstract boolean d(x7 x7Var, w7 w7Var, w7 w7Var2);

    public abstract o7 e(w4r0 w4r0Var);

    public abstract w7 f(w4r0 w4r0Var);

    public abstract void i(w7 w7Var, w7 w7Var2);

    public abstract void j(w7 w7Var, Thread thread);
}
