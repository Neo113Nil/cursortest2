package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class wr9 extends xqt {
    public static final wr9 e = new wr9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, xr9.INSTANCE.serializer(), qoi0.a(xr9.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("select_discount", vr9.INSTANCE.serializer(), qoi0.a(vr9.class)), new f9("close", tr9.INSTANCE.serializer(), qoi0.a(tr9.class)));
    }
}
