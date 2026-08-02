package ru.yandex.taxi.common_models.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j8s;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
/* loaded from: classes9.dex */
public final class z extends o {
    public static final z INSTANCE = new z();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j8s(8));

    @Override // ru.yandex.taxi.common_models.net.o
    public final FormattedText.Type d() {
        return FormattedText.Type.UNKNOWN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
