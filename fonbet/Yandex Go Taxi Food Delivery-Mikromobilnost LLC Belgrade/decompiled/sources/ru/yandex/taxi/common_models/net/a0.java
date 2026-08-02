package ru.yandex.taxi.common_models.net;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.j8s;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
/* loaded from: classes9.dex */
public final class a0 extends FormattedText.b {
    public static final a0 INSTANCE = new a0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new j8s(9));

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
