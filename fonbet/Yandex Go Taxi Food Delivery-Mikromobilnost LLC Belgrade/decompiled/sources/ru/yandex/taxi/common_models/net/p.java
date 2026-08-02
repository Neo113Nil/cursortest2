package ru.yandex.taxi.common_models.net;

import defpackage.f9;
import defpackage.lb7;
import defpackage.qoi0;
import defpackage.xqt;
import java.util.Arrays;
import java.util.List;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final class p extends xqt {
    public static final p e = new p();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, z.INSTANCE.serializer(), qoi0.a(z.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("text", FormattedText.h.Companion.serializer(), qoi0.a(FormattedText.h.class)), new f9("image", FormattedText.d.Companion.serializer(), qoi0.a(FormattedText.d.class)), new f9("image_url", FormattedText.e.Companion.serializer(), qoi0.a(FormattedText.e.class)), new f9("link", FormattedText.g.Companion.serializer(), qoi0.a(FormattedText.g.class)), new f9("container", FormattedText.a.Companion.serializer(), qoi0.a(FormattedText.a.class)));
    }
}
