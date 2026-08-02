package ru.yandex.taxi.common_models.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j8s;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
/* loaded from: classes9.dex */
public final class y extends FormattedText.b {
    public static final y INSTANCE = new y();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j8s(7));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
