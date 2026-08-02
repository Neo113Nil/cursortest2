package defpackage;

import android.text.Layout;
import ru.yandex.taxi.plus.api.dto.menu.button.ButtonState;
import ru.yandex.taxi.plus.purchase.domain.PurchaseStatus;
import ru.yandex.taxi.plus.purchase.domain.UpgradeStatus;

/* loaded from: classes6.dex */
public abstract class wcb1 {
    public static ButtonState a(PurchaseStatus purchaseStatus, UpgradeStatus upgradeStatus) {
        if (upgradeStatus == UpgradeStatus.UPGRADE_UNAVAILABLE || purchaseStatus != PurchaseStatus.PURCHASED) {
            switch (i37.a[purchaseStatus.ordinal()]) {
                case 1:
                    return ButtonState.IDLE;
                case 2:
                    return ButtonState.PROCESSING;
                case 3:
                    return ButtonState.IDLE;
                case 4:
                    return ButtonState.IDLE;
                case 5:
                    return ButtonState.ERROR;
                case 6:
                    return ButtonState.SUCCESS;
                case 7:
                    return ButtonState.ALREADY_DONE;
                default:
                    w511.b();
                    return null;
            }
        }
        switch (i37.b[upgradeStatus.ordinal()]) {
            case 1:
                return ButtonState.IDLE;
            case 2:
                return ButtonState.ALREADY_DONE;
            case 3:
                return ButtonState.PROCESSING;
            case 4:
                return ButtonState.ERROR;
            case 5:
                return ButtonState.ERROR;
            case 6:
                return ButtonState.ALREADY_DONE;
            case 7:
                return ButtonState.SUCCESS;
            default:
                w511.b();
                return null;
        }
    }

    public static final int b(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
