package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class tde0 extends xqt {
    public static final tde0 e = new tde0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, rde0.INSTANCE.serializer(), qoi0.a(rde0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("clarify_address_on_map", pde0.INSTANCE.serializer(), qoi0.a(pde0.class)), new f9("choose_address", ode0.Companion.serializer(), qoi0.a(ode0.class)));
    }
}
