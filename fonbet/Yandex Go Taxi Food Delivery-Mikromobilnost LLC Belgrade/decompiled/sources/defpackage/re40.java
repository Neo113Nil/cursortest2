package defpackage;

import defpackage.qe40;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class re40 extends xqt {
    public static final re40 e = new re40();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, bf40.INSTANCE.serializer(), qoi0.a(bf40.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("show_calendar", qe40.d.Companion.serializer(), qoi0.a(qe40.d.class)), new f9("reload_schedule", qe40.c.Companion.serializer(), qoi0.a(qe40.c.class)));
    }
}
