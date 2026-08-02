package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
public final class r4s implements q8s {
    public final q8s a;
    public final t6s b;

    public r4s(q8s q8sVar, t6s t6sVar) {
        this.a = q8sVar;
        this.b = t6sVar;
    }

    @Override // defpackage.q8s
    public final Object a(FormattedText formattedText, ContinuationImpl continuationImpl) {
        return this.a.b(formattedText, (ThemeStyle) this.b.a.a.getValue(), continuationImpl);
    }

    @Override // defpackage.q8s
    public final Object b(FormattedText formattedText, ThemeStyle themeStyle, ContinuationImpl continuationImpl) {
        return this.a.b(formattedText, themeStyle, continuationImpl);
    }
}
