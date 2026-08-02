package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class ypn extends xqt {
    public static final ypn e = new ypn();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, wpn.INSTANCE.serializer(), qoi0.a(wpn.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("show_notification", upn.Companion.serializer(), qoi0.a(upn.class)), new f9("set_requirement", qpn.Companion.serializer(), qoi0.a(qpn.class)));
    }
}
