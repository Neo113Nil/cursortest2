package androidx.compose.ui.window;

import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class PopupProperties {
    public final boolean dismissOnBackPress;
    public final boolean dismissOnClickOutside;
    public final boolean excludeFromSystemGesture;
    public final int flags;
    public final boolean inheritSecurePolicy;
    public final int windowType;

    public PopupProperties(boolean z, boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4) {
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.LocalPopupTestTag;
        int i = !z ? 262152 : PKIFailureInfo.transactionIdInUse;
        i = secureFlagPolicy == SecureFlagPolicy.SecureOn ? i | PKIFailureInfo.certRevoked : i;
        i = z4 ? i : i | 512;
        boolean z5 = secureFlagPolicy == SecureFlagPolicy.Inherit;
        this.flags = i;
        this.inheritSecurePolicy = z5;
        this.dismissOnBackPress = z2;
        this.dismissOnClickOutside = z3;
        this.excludeFromSystemGesture = true;
        this.windowType = IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        return this.flags == popupProperties.flags && this.inheritSecurePolicy == popupProperties.inheritSecurePolicy && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.windowType == popupProperties.windowType;
    }

    public final int hashCode() {
        return (JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.flags * 31, 31, this.inheritSecurePolicy), 31, this.dismissOnBackPress), 31, this.dismissOnClickOutside), 31, this.excludeFromSystemGesture), 31, false) + this.windowType) * 31;
    }

    public /* synthetic */ PopupProperties(boolean z) {
        this(z, SecureFlagPolicy.Inherit, true);
    }

    public PopupProperties(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        this(z, true, true, secureFlagPolicy, z2);
    }

    public PopupProperties(boolean z, int i) {
        this((i & 1) != 0 ? false : z, true, true, SecureFlagPolicy.Inherit, (i & 8) != 0);
    }
}
