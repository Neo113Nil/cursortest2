package com.squareup.cash.afterpayapplet.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AfterpayAppletScreen$AfterpayAppletInfoSheet implements Screen, BottomSheetScreen {
    public static final Parcelable.Creator<AfterpayAppletScreen$AfterpayAppletInfoSheet> CREATOR = new ActivityScreen.Creator(11);
    public final AnalyticsEvent analyticDismissEvent;
    public final AnalyticsEvent analyticViewEvent;
    public final UiAvatar avatar;
    public final Button ctaButton;
    public final String referrerFlowToken;
    public final String subtitle;
    public final List textContent;
    public final String title;

    public AfterpayAppletScreen$AfterpayAppletInfoSheet(String str, String str2, String str3, List list, Button button, AnalyticsEvent analyticsEvent, AnalyticsEvent analyticsEvent2, UiAvatar uiAvatar) {
        str.getClass();
        str2.getClass();
        this.referrerFlowToken = str;
        this.title = str2;
        this.subtitle = str3;
        this.textContent = list;
        this.ctaButton = button;
        this.analyticViewEvent = analyticsEvent;
        this.analyticDismissEvent = analyticsEvent2;
        this.avatar = uiAvatar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AfterpayAppletScreen$AfterpayAppletInfoSheet)) {
            return false;
        }
        AfterpayAppletScreen$AfterpayAppletInfoSheet afterpayAppletScreen$AfterpayAppletInfoSheet = (AfterpayAppletScreen$AfterpayAppletInfoSheet) obj;
        return Intrinsics.areEqual(this.referrerFlowToken, afterpayAppletScreen$AfterpayAppletInfoSheet.referrerFlowToken) && Intrinsics.areEqual(this.title, afterpayAppletScreen$AfterpayAppletInfoSheet.title) && Intrinsics.areEqual(this.subtitle, afterpayAppletScreen$AfterpayAppletInfoSheet.subtitle) && Intrinsics.areEqual(this.textContent, afterpayAppletScreen$AfterpayAppletInfoSheet.textContent) && Intrinsics.areEqual(this.ctaButton, afterpayAppletScreen$AfterpayAppletInfoSheet.ctaButton) && Intrinsics.areEqual(this.analyticViewEvent, afterpayAppletScreen$AfterpayAppletInfoSheet.analyticViewEvent) && Intrinsics.areEqual(this.analyticDismissEvent, afterpayAppletScreen$AfterpayAppletInfoSheet.analyticDismissEvent) && Intrinsics.areEqual(this.avatar, afterpayAppletScreen$AfterpayAppletInfoSheet.avatar);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.referrerFlowToken.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.textContent;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Button button = this.ctaButton;
        int hashCode3 = (hashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        AnalyticsEvent analyticsEvent = this.analyticViewEvent;
        int hashCode4 = (hashCode3 + (analyticsEvent == null ? 0 : analyticsEvent.hashCode())) * 31;
        AnalyticsEvent analyticsEvent2 = this.analyticDismissEvent;
        int hashCode5 = (hashCode4 + (analyticsEvent2 == null ? 0 : analyticsEvent2.hashCode())) * 31;
        UiAvatar uiAvatar = this.avatar;
        return hashCode5 + (uiAvatar != null ? uiAvatar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AfterpayAppletInfoSheet(referrerFlowToken=", this.referrerFlowToken, ", title=", this.title, ", subtitle=");
        NavAction$$ExternalSyntheticOutline0.m(this.subtitle, ", textContent=", ", ctaButton=", m, this.textContent);
        m.append(this.ctaButton);
        m.append(", analyticViewEvent=");
        m.append(this.analyticViewEvent);
        m.append(", analyticDismissEvent=");
        m.append(this.analyticDismissEvent);
        m.append(", avatar=");
        m.append(this.avatar);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.referrerFlowToken);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        List list = this.textContent;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
        parcel.writeParcelable(this.ctaButton, i);
        parcel.writeParcelable(this.analyticViewEvent, i);
        parcel.writeParcelable(this.analyticDismissEvent, i);
        parcel.writeParcelable(this.avatar, i);
    }
}
