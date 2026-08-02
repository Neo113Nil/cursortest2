package defpackage;

import com.yandex.delivery.mapper.model.CardsRevealing;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class tu0 implements vu0 {
    public final String a;
    public final CardsRevealing b;

    public tu0(String str, CardsRevealing cardsRevealing) {
        this.a = str;
        this.b = cardsRevealing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tu0)) {
            return false;
        }
        tu0 tu0Var = (tu0) obj;
        return jl40.l(this.a, tu0Var.a) && this.b == tu0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlacesSuggest(mode=" + this.a + ", cardsRevealing=" + this.b + Extension.C_BRAKE;
    }
}
