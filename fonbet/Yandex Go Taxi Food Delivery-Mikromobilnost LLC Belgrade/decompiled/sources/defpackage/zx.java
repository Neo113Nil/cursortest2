package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class zx extends xqt {
    public static final zx e = new zx();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, bq.INSTANCE.serializer(), qoi0.a(bq.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("charity", wo.Companion.serializer(), qoi0.a(wo.class)), new f9("buy_insurance", ro.Companion.serializer(), qoi0.a(ro.class)), new f9("insurance_full", xp.Companion.serializer(), qoi0.a(xp.class)), new f9("deposit", lp.INSTANCE.serializer(), qoi0.a(lp.class)), new f9("dialog", qp.Companion.serializer(), qoi0.a(qp.class)));
    }
}
