package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class uek0 implements vek0 {
    public final UiStateDrawableWrapper a;

    static {
        ut11 ut11Var = UiStateDrawableWrapper.Companion;
    }

    public uek0(UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uek0) && this.a.equals(((uek0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Image(image=" + this.a + Extension.C_BRAKE;
    }
}
