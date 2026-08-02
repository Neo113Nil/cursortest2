package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class v1e extends xqt {
    public static final v1e e = new v1e();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s0e.INSTANCE.serializer(), qoi0.a(s0e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("dialogue", j0e.Companion.serializer(), qoi0.a(j0e.class)), new f9("list", m0e.Companion.serializer(), qoi0.a(m0e.class)), new f9("bubble", e0e.INSTANCE.serializer(), qoi0.a(e0e.class)), new f9("tooltip", r0e.Companion.serializer(), qoi0.a(r0e.class)), new f9("modal_window", n0e.INSTANCE.serializer(), qoi0.a(n0e.class)));
    }
}
