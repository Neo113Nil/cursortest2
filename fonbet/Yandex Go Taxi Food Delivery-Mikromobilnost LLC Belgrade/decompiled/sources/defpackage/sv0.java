package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.BubblePosition;

/* loaded from: classes5.dex */
public final class sv0 {
    public final String a;
    public final BubblePosition b;

    public sv0(String str, BubblePosition bubblePosition) {
        this.a = str;
        this.b = bubblePosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv0)) {
            return false;
        }
        sv0 sv0Var = (sv0) obj;
        return jl40.l(this.a, sv0Var.a) && this.b == sv0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressInputBubble(text=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
