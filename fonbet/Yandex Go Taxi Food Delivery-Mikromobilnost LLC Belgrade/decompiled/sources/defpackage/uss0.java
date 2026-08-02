package defpackage;

import com.yandex.go.slot.api.ui.SlotItemUiState$Trail$AccordionChevron$ChevronState;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class uss0 implements wss0 {
    public final SlotItemUiState$Trail$AccordionChevron$ChevronState a;

    public uss0(SlotItemUiState$Trail$AccordionChevron$ChevronState slotItemUiState$Trail$AccordionChevron$ChevronState) {
        this.a = slotItemUiState$Trail$AccordionChevron$ChevronState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uss0) && this.a == ((uss0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccordionChevronState(chevronState=" + this.a + Extension.C_BRAKE;
    }
}
