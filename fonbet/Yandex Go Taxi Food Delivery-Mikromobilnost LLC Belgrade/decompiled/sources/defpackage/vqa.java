package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class vqa extends xqt {
    public static final vqa e = new vqa();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, xqa.INSTANCE.serializer(), qoi0.a(xqa.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("take_charger", wqa.INSTANCE.serializer(), qoi0.a(wqa.class)), new f9("return_charger", rqa.INSTANCE.serializer(), qoi0.a(rqa.class)), new f9("select_to_return", sqa.INSTANCE.serializer(), qoi0.a(sqa.class)));
    }
}
