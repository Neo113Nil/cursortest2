package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import com.squareup.cash.cdf.prepurchasecard.ToggleState;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class IntRectKt {
    /* renamed from: IntRect-VbeCjmY, reason: not valid java name */
    public static final IntRect m1053IntRectVbeCjmY(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        return new IntRect(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & BodyPartID.bodyIdMax)) + i2);
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewAutoSelectBoost.deepLinkSpecs;
    }

    public static final IntRect roundToIntRect(Rect rect) {
        return new IntRect(Math.round(rect.left), Math.round(rect.top), Math.round(rect.right), Math.round(rect.bottom));
    }

    public static final ToggleState toCdfToggleState(ToggleEntryPointData.ToggleState toggleState) {
        toggleState.getClass();
        int ordinal = toggleState.ordinal();
        if (ordinal == 1) {
            return ToggleState.TURNED_OFF;
        }
        if (ordinal == 2) {
            return ToggleState.TURNED_ON;
        }
        if (ordinal != 3) {
            return null;
        }
        return ToggleState.DIMMED;
    }

    public static final Rect toRect(IntRect intRect) {
        return new Rect(intRect.left, intRect.top, intRect.right, intRect.bottom);
    }
}
