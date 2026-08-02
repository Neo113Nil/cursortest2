package com.squareup.cash.offers.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import kotlin.jvm.functions.Function1;

/* loaded from: classes8.dex */
public final class DetailCaptionFormatStringResources {
    public final Function1 daysFormat;
    public final Function1 hoursFormat;
    public final Function1 minutesFormat;
    public final Function1 secondsFormat;

    public DetailCaptionFormatStringResources(Function1 function1, Function1 function12, Function1 function13, Function1 function14) {
        this.daysFormat = function1;
        this.hoursFormat = function12;
        this.minutesFormat = function13;
        this.secondsFormat = function14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailCaptionFormatStringResources)) {
            return false;
        }
        DetailCaptionFormatStringResources detailCaptionFormatStringResources = (DetailCaptionFormatStringResources) obj;
        return this.daysFormat.equals(detailCaptionFormatStringResources.daysFormat) && this.hoursFormat.equals(detailCaptionFormatStringResources.hoursFormat) && this.minutesFormat.equals(detailCaptionFormatStringResources.minutesFormat) && this.secondsFormat.equals(detailCaptionFormatStringResources.secondsFormat);
    }

    public final int hashCode() {
        return this.secondsFormat.hashCode() + Recorder$$ExternalSyntheticOutline1.m(Recorder$$ExternalSyntheticOutline1.m(this.daysFormat.hashCode() * 31, 31, this.hoursFormat), 31, this.minutesFormat);
    }

    public final String toString() {
        return "DetailCaptionFormatStringResources(daysFormat=" + this.daysFormat + ", hoursFormat=" + this.hoursFormat + ", minutesFormat=" + this.minutesFormat + ", secondsFormat=" + this.secondsFormat + ")";
    }
}
