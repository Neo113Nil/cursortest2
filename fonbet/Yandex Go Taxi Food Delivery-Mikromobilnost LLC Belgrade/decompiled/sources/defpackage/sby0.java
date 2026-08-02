package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes14.dex */
public final class sby0 extends xqt {
    public static final sby0 e = new sby0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, tby0.INSTANCE.serializer(), qoi0.a(tby0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("append", pby0.INSTANCE.serializer(), qoi0.a(pby0.class)), new f9("new_batch_only", rby0.INSTANCE.serializer(), qoi0.a(rby0.class)));
    }
}
