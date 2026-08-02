package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class twm0 extends xqt {
    public static final twm0 e = new twm0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, rwm0.INSTANCE.serializer(), qoi0.a(rwm0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("payment_settings", gwm0.Companion.serializer(), qoi0.a(gwm0.class)), new f9("freeze_settings", bwm0.Companion.serializer(), qoi0.a(bwm0.class)));
    }
}
