package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes5.dex */
public final class z641 {
    public final OrderStatusInfo.AlternativeDestination.InfoBlock a;
    public final Drawable b;

    public z641(OrderStatusInfo.AlternativeDestination.InfoBlock infoBlock, UiStateDrawableWrapper uiStateDrawableWrapper) {
        this.a = infoBlock;
        this.b = uiStateDrawableWrapper;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z641)) {
            return false;
        }
        z641 z641Var = (z641) obj;
        return jl40.l(this.a, z641Var.a) && jl40.l(this.b, z641Var.b);
    }

    public final int hashCode() {
        OrderStatusInfo.AlternativeDestination.InfoBlock infoBlock = this.a;
        int hashCode = (infoBlock == null ? 0 : infoBlock.hashCode()) * 31;
        Drawable drawable = this.b;
        return hashCode + (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        return "InfoBlockRecord(infoBlock=" + this.a + ", shadow=" + this.b + Extension.C_BRAKE;
    }
}
