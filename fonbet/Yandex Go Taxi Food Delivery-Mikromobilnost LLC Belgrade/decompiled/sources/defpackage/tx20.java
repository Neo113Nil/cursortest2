package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class tx20 extends xqt {
    public static final tx20 e = new tx20();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, m121.INSTANCE.serializer(), qoi0.a(m121.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_payment_methods_action", i770.Companion.serializer(), qoi0.a(i770.class)), new f9("close_action", i4c.Companion.serializer(), qoi0.a(i4c.class)));
    }
}
