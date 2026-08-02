package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.BubblePosition;

/* loaded from: classes5.dex */
public final class uv0 {
    public final String a;
    public final BubblePosition b;

    public uv0(String str, BubblePosition bubblePosition) {
        this.a = str;
        this.b = bubblePosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv0)) {
            return false;
        }
        uv0 uv0Var = (uv0) obj;
        return jl40.l(this.a, uv0Var.a) && this.b == uv0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressInputBubbleModel(text=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
