package defpackage;

import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.change.common.data.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class va9 implements xa9 {
    public final ConfirmChangeResponse a;

    static {
        a aVar = ConfirmChangeResponse.Companion;
    }

    public va9(ConfirmChangeResponse confirmChangeResponse) {
        this.a = confirmChangeResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va9) && jl40.l(this.a, ((va9) obj).a);
    }

    public final int hashCode() {
        ConfirmChangeResponse confirmChangeResponse = this.a;
        if (confirmChangeResponse == null) {
            return 0;
        }
        return confirmChangeResponse.hashCode();
    }

    public final String toString() {
        return "Error(response=" + this.a + Extension.C_BRAKE;
    }
}
