package defpackage;

import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeViewState$InputStep;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wl8 extends yl8 {
    public final int a;
    public final CardPinCodeViewState$InputStep b;

    public wl8(int i, CardPinCodeViewState$InputStep cardPinCodeViewState$InputStep) {
        this.a = i;
        this.b = cardPinCodeViewState$InputStep;
    }

    public final int a() {
        return this.a;
    }

    public final CardPinCodeViewState$InputStep b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl8)) {
            return false;
        }
        wl8 wl8Var = (wl8) obj;
        return this.a == wl8Var.a && this.b == wl8Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Entering(filledCount=" + this.a + ", inputStep=" + this.b + Extension.C_BRAKE;
    }
}
