package defpackage;

import com.yandex.go.slot.api.ui.SlotItemButtonUiState$Properties$Form;
import com.yandex.go.slot.api.ui.SlotItemButtonUiState$Properties$Style;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class wqs0 {
    public final SlotItemButtonUiState$Properties$Form a;
    public final SlotItemButtonUiState$Properties$Style b;

    public wqs0(SlotItemButtonUiState$Properties$Form slotItemButtonUiState$Properties$Form, SlotItemButtonUiState$Properties$Style slotItemButtonUiState$Properties$Style) {
        this.a = slotItemButtonUiState$Properties$Form;
        this.b = slotItemButtonUiState$Properties$Style;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqs0)) {
            return false;
        }
        wqs0 wqs0Var = (wqs0) obj;
        return this.a == wqs0Var.a && this.b == wqs0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Properties(form=" + this.a + ", style=" + this.b + Extension.C_BRAKE;
    }
}
