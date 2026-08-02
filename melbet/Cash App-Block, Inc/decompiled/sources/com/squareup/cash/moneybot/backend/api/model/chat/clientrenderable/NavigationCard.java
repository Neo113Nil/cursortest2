package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NavigationCard {
    public final String cta;
    public final NavigationCard$Icon$Avatar icon;
    public final String requestId;
    public final NavigationCard$TapAction$ClientRouteAction tapAction;
    public final int version;

    public NavigationCard(String str, int i, NavigationCard$Icon$Avatar navigationCard$Icon$Avatar, String str2, NavigationCard$TapAction$ClientRouteAction navigationCard$TapAction$ClientRouteAction) {
        this.requestId = str;
        this.version = i;
        this.icon = navigationCard$Icon$Avatar;
        this.cta = str2;
        this.tapAction = navigationCard$TapAction$ClientRouteAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationCard)) {
            return false;
        }
        NavigationCard navigationCard = (NavigationCard) obj;
        return Intrinsics.areEqual(this.requestId, navigationCard.requestId) && this.version == navigationCard.version && this.icon.equals(navigationCard.icon) && this.cta.equals(navigationCard.cta) && this.tapAction.equals(navigationCard.tapAction);
    }

    public final int hashCode() {
        String str = this.requestId;
        return this.tapAction.clientRoute.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.icon.avatar.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.version, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31, 31, this.cta);
    }

    public final String toString() {
        StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("NavigationCard(requestId=", this.version, this.requestId, ", version=", ", icon=");
        m.append(this.icon);
        m.append(", cta=");
        m.append(this.cta);
        m.append(", tapAction=");
        m.append(this.tapAction);
        m.append(")");
        return m.toString();
    }
}
