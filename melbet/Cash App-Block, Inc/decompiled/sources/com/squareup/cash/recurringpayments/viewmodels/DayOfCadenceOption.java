package com.squareup.cash.recurringpayments.viewmodels;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.RecurringPaymentBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DayOfCadenceOption {
    public final Integer dayOfCadence;
    public final RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayPicker;
    public final Image icon;
    public final boolean shouldDisplayDayPicker;
    public final String title;
    public final RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment titleHorizontalAlignment;

    public DayOfCadenceOption(Image image, String str, RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment textAlignment, Integer num, boolean z, RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu) {
        this.icon = image;
        this.title = str;
        this.titleHorizontalAlignment = textAlignment;
        this.dayOfCadence = num;
        this.shouldDisplayDayPicker = z;
        this.dayPicker = dayOfCadenceMenu;
        if ((num != null) ^ z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DayOfCadenceOption)) {
            return false;
        }
        DayOfCadenceOption dayOfCadenceOption = (DayOfCadenceOption) obj;
        return Intrinsics.areEqual(this.icon, dayOfCadenceOption.icon) && this.title.equals(dayOfCadenceOption.title) && this.titleHorizontalAlignment == dayOfCadenceOption.titleHorizontalAlignment && Intrinsics.areEqual(this.dayOfCadence, dayOfCadenceOption.dayOfCadence) && this.shouldDisplayDayPicker == dayOfCadenceOption.shouldDisplayDayPicker && Intrinsics.areEqual(this.dayPicker, dayOfCadenceOption.dayPicker);
    }

    public final int hashCode() {
        Image image = this.icon;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((image == null ? 0 : image.hashCode()) * 31, 31, this.title);
        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceOption.TextAlignment textAlignment = this.titleHorizontalAlignment;
        int hashCode = (m + (textAlignment == null ? 0 : textAlignment.hashCode())) * 31;
        Integer num = this.dayOfCadence;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.shouldDisplayDayPicker);
        RecurringPaymentBlocker.CadenceMenu.DayOfCadenceMenu dayOfCadenceMenu = this.dayPicker;
        return m2 + (dayOfCadenceMenu != null ? dayOfCadenceMenu.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = Matcher$$ExternalSyntheticOutline0.m(this.icon, "DayOfCadenceOption(icon=", ", title=", this.title, ", titleHorizontalAlignment=");
        m.append(this.titleHorizontalAlignment);
        m.append(", dayOfCadence=");
        m.append(this.dayOfCadence);
        m.append(", shouldDisplayDayPicker=");
        m.append(this.shouldDisplayDayPicker);
        m.append(", dayPicker=");
        m.append(this.dayPicker);
        m.append(")");
        return m.toString();
    }
}
