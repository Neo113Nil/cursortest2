package com.squareup.cash.appmessages.presenters;

import com.squareup.cash.appmessages.TooltipAppMessageViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;
import xyz.block.genie.state.StateBindingsKt;

/* loaded from: classes5.dex */
public final class Tooltip$ValidTooltip extends StateBindingsKt {
    public final TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition;
    public final String messageToken;
    public final TooltipAppMessageViewModel.Ready.Placement placement;
    public final String text;
    public final TooltipAppMessageViewModel.Ready.TooltipType tooltipType;
    public final String urlToOpen;

    public Tooltip$ValidTooltip(String str, TooltipAppMessageViewModel.Ready.ArrowPosition arrowPosition, TooltipAppMessageViewModel.Ready.Placement placement, String str2, TooltipAppMessageViewModel.Ready.TooltipType tooltipType, String str3) {
        str.getClass();
        str2.getClass();
        this.messageToken = str;
        this.arrowPosition = arrowPosition;
        this.placement = placement;
        this.text = str2;
        this.tooltipType = tooltipType;
        this.urlToOpen = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tooltip$ValidTooltip)) {
            return false;
        }
        Tooltip$ValidTooltip tooltip$ValidTooltip = (Tooltip$ValidTooltip) obj;
        return Intrinsics.areEqual(this.messageToken, tooltip$ValidTooltip.messageToken) && this.arrowPosition == tooltip$ValidTooltip.arrowPosition && this.placement == tooltip$ValidTooltip.placement && Intrinsics.areEqual(this.text, tooltip$ValidTooltip.text) && this.tooltipType == tooltip$ValidTooltip.tooltipType && Intrinsics.areEqual(this.urlToOpen, tooltip$ValidTooltip.urlToOpen);
    }

    public final TooltipAppMessageViewModel.Ready.ArrowPosition getArrowPosition() {
        return this.arrowPosition;
    }

    public final String getMessageToken() {
        return this.messageToken;
    }

    public final TooltipAppMessageViewModel.Ready.Placement getPlacement() {
        return this.placement;
    }

    public final String getText() {
        return this.text;
    }

    public final TooltipAppMessageViewModel.Ready.TooltipType getTooltipType() {
        return this.tooltipType;
    }

    public final String getUrlToOpen() {
        return this.urlToOpen;
    }

    public final int hashCode() {
        int hashCode = (this.tooltipType.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.placement.hashCode() + ((this.arrowPosition.hashCode() + (this.messageToken.hashCode() * 31)) * 31)) * 31, 31, this.text)) * 31;
        String str = this.urlToOpen;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ValidTooltip(messageToken=" + this.messageToken + ", arrowPosition=" + this.arrowPosition + ", placement=" + this.placement + ", text=" + this.text + ", tooltipType=" + this.tooltipType + ", urlToOpen=" + this.urlToOpen + ")";
    }
}
