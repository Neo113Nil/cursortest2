package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.main.DiscountsToolbarEditModeViewState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class srj {
    public final DiscountsToolbarEditModeViewState a;

    public srj(DiscountsToolbarEditModeViewState discountsToolbarEditModeViewState) {
        this.a = discountsToolbarEditModeViewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof srj) && this.a == ((srj) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DiscountsToolbarViewState(editMode=" + this.a + Extension.C_BRAKE;
    }
}
