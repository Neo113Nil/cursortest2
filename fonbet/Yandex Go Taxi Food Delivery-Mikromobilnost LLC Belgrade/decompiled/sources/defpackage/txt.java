package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public final class txt extends xqt {
    public static final txt e = new txt();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, rxt.Companion.serializer(), qoi0.a(rxt.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("text", rxt.Companion.serializer(), qoi0.a(rxt.class)), new f9("image", oxt.Companion.serializer(), qoi0.a(oxt.class)));
    }
}
