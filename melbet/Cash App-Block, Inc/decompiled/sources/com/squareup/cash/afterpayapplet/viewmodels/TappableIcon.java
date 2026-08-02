package com.squareup.cash.afterpayapplet.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class TappableIcon {
    public final String accessibilityText;
    public final String arcadeIconId;
    public final Tap tapAction;

    public TappableIcon(String str, Tap tap, String str2) {
        this.arcadeIconId = str;
        this.tapAction = tap;
        this.accessibilityText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TappableIcon)) {
            return false;
        }
        TappableIcon tappableIcon = (TappableIcon) obj;
        return this.arcadeIconId.equals(tappableIcon.arcadeIconId) && Intrinsics.areEqual(this.tapAction, tappableIcon.tapAction) && Intrinsics.areEqual(this.accessibilityText, tappableIcon.accessibilityText);
    }

    public final int hashCode() {
        int hashCode = this.arcadeIconId.hashCode() * 31;
        Tap tap = this.tapAction;
        int hashCode2 = (hashCode + (tap == null ? 0 : tap.hashCode())) * 31;
        String str = this.accessibilityText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TappableIcon(arcadeIconId=");
        sb.append(this.arcadeIconId);
        sb.append(", tapAction=");
        sb.append(this.tapAction);
        sb.append(", accessibilityText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.accessibilityText, ")");
    }
}
