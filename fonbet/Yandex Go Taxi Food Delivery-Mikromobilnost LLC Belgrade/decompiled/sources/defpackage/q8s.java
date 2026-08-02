package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public interface q8s {
    default Object a(FormattedText formattedText, ContinuationImpl continuationImpl) {
        return b(formattedText, ThemeStyle.DEFAULT, continuationImpl);
    }

    Object b(FormattedText formattedText, ThemeStyle themeStyle, ContinuationImpl continuationImpl);
}
