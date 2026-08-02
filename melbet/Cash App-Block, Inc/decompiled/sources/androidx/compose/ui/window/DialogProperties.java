package androidx.compose.ui.window;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class DialogProperties {
    public final boolean decorFitsSystemWindows;
    public final boolean dismissOnBackPress;
    public final boolean dismissOnClickOutside;
    public final SecureFlagPolicy securePolicy;
    public final boolean usePlatformDefaultWidth;
    public final String windowTitle;
    public final int windowType;

    public DialogProperties(int i) {
        boolean z = (i & 4) != 0;
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        this.dismissOnBackPress = true;
        this.dismissOnClickOutside = true;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z;
        this.decorFitsSystemWindows = true;
        this.windowTitle = "";
        this.windowType = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows && this.windowType == dialogProperties.windowType;
    }

    public final int hashCode() {
        return (JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.securePolicy.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.dismissOnBackPress) * 31, 31, this.dismissOnClickOutside)) * 31, 31, this.usePlatformDefaultWidth), 31, this.decorFitsSystemWindows) + this.windowType) * 31;
    }
}
