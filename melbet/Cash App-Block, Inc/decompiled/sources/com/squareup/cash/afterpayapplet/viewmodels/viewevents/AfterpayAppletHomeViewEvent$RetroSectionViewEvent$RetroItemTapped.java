package com.squareup.cash.afterpayapplet.viewmodels.viewevents;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped implements AfterpayAppletHomeViewEvent, AfterpayAnalyticsAppletTappedEvent {
    public final String actionUrl;
    public final List analyticsAppletTappedEvent;

    public AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped(String str, List list) {
        str.getClass();
        this.actionUrl = str;
        this.analyticsAppletTappedEvent = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped)) {
            return false;
        }
        AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped afterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped = (AfterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped) obj;
        return Intrinsics.areEqual(this.actionUrl, afterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped.actionUrl) && Intrinsics.areEqual(this.analyticsAppletTappedEvent, afterpayAppletHomeViewEvent$RetroSectionViewEvent$RetroItemTapped.analyticsAppletTappedEvent);
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
        return CameraState$Type$EnumUnboxingLocalUtility.m("RetroItemTapped(actionUrl=", this.actionUrl, ", analyticsAppletTappedEvent=", ")", this.analyticsAppletTappedEvent);
    }
}
