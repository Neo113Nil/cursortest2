package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

/* loaded from: classes10.dex */
public final class ru41 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = WebViewThemeChangeMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
