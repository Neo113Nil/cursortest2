package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class uc30 extends xqt {
    public static final uc30 e = new uc30();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, nj40.INSTANCE.serializer(), qoi0.a(nj40.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("local", tn30.Companion.serializer(), qoi0.a(tn30.class)), new f9("remote", qu30.Companion.serializer(), qoi0.a(qu30.class)));
    }
}
