package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes9.dex */
public final class wc3 extends xqt {
    public static final wc3 e = new wc3();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, tc3.INSTANCE.serializer(), qoi0.a(tc3.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("requirement", sc3.Companion.serializer(), qoi0.a(sc3.class)), new f9("postcard", pc3.INSTANCE.serializer(), qoi0.a(pc3.class)));
    }
}
