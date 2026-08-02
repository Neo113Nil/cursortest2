package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped implements AfterpayAppletHomeViewEvent, AfterpayAnalyticsAppletTappedEvent {
    public final String actionUrl;
    public final List analyticsAppletTappedEvent;

    public AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped(String str, List list) {
        str.getClass();
        this.actionUrl = str;
        this.analyticsAppletTappedEvent = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped)) {
            return false;
        }
        AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped afterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped = (AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped) obj;
        return Intrinsics.areEqual(this.actionUrl, afterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped.actionUrl) && Intrinsics.areEqual(this.analyticsAppletTappedEvent, afterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroAccessoryTapped.analyticsAppletTappedEvent);
    }

    @Override // com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent
    public final List getAnalyticsAppletTappedEvent() {
        return this.analyticsAppletTappedEvent;
    }

    public final int hashCode() {
        int hashCode = this.actionUrl.hashCode() * 31;
        List list = this.analyticsAppletTappedEvent;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("RetroAccessoryTapped(actionUrl=", this.actionUrl, ", analyticsAppletTappedEvent=", ")", this.analyticsAppletTappedEvent);
    }
}
