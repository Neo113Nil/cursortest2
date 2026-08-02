package com.squareup.cash.limits.viewmodels;

import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

/* loaded from: classes6.dex */
public final class UnifiedInlineMessageButton$Network {
    public final GetInlineMessageResponse.LimitsHubInlineMessageButton button;
    public final UnifiedButtonAction buttonAction;
    public final String urlToOpen;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.values().length];
            try {
                Path.Companion companion = GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.Companion;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Path.Companion companion2 = GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction.Companion;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UnifiedInlineMessageButton$Network(GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton) {
        limitsHubInlineMessageButton.getClass();
        this.button = limitsHubInlineMessageButton;
        GetInlineMessageResponse.LimitsHubInlineMessageButton.ButtonAction buttonAction = limitsHubInlineMessageButton.button_action;
        int i = buttonAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[buttonAction.ordinal()];
        this.buttonAction = i != 1 ? i != 2 ? null : UnifiedButtonAction.OPEN_URL : UnifiedButtonAction.DISMISS;
        this.urlToOpen = limitsHubInlineMessageButton.url_to_open;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UnifiedInlineMessageButton$Network) && Intrinsics.areEqual(this.button, ((UnifiedInlineMessageButton$Network) obj).button);
    }

    public final int hashCode() {
        return this.button.hashCode();
    }

    public final String toString() {
        return "Network(button=" + this.button + ")";
    }
}
