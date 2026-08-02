package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class um70 implements xm70 {
    public final UiStateDrawableWrapper a;

    public /* synthetic */ um70(UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = uiStateDrawableWrapper;
    }

    public static final /* synthetic */ um70 a(UiStateDrawableWrapper uiStateDrawableWrapper) {
        return new um70(uiStateDrawableWrapper);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof um70) {
            return this.a.equals(((um70) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Drawable(value=" + this.a + Extension.C_BRAKE;
    }
}
