package ru.yandex.taxi.common_models.net;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final class f extends xqt {
    public static final f e = new f();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, a0.INSTANCE.serializer(), qoi0.a(a0.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("underline", y.INSTANCE.serializer(), qoi0.a(y.class)), new f9("line_through", FormattedText.f.Companion.serializer(), qoi0.a(FormattedText.f.class)));
    }
}
