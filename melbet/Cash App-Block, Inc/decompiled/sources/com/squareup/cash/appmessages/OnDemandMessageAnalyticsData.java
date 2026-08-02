package com.squareup.cash.appmessages;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class OnDemandMessageAnalyticsData {
    public final String campaignToken;

    /* renamed from: format, reason: collision with root package name */
    public final Format f1046format;
    public final List productTypes;
    public final String templateToken;
    public final Long templateVersion;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class Format {
        public static final /* synthetic */ Format[] $VALUES;
        public static final Format CARD;
        public static final Format INLINE_V2;

        static {
            Format format2 = new Format("CARD", 0);
            CARD = format2;
            Format format3 = new Format("INLINE_V2", 1);
            INLINE_V2 = format3;
            $VALUES = new Format[]{format2, format3};
        }

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) $VALUES.clone();
        }
    }

    public OnDemandMessageAnalyticsData(String str, String str2, Long l, List list, Format format2) {
        list.getClass();
        this.campaignToken = str;
        this.templateToken = str2;
        this.templateVersion = l;
        this.productTypes = list;
        this.f1046format = format2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnDemandMessageAnalyticsData)) {
            return false;
        }
        OnDemandMessageAnalyticsData onDemandMessageAnalyticsData = (OnDemandMessageAnalyticsData) obj;
        return Intrinsics.areEqual(this.campaignToken, onDemandMessageAnalyticsData.campaignToken) && Intrinsics.areEqual(this.templateToken, onDemandMessageAnalyticsData.templateToken) && Intrinsics.areEqual(this.templateVersion, onDemandMessageAnalyticsData.templateVersion) && Intrinsics.areEqual(this.productTypes, onDemandMessageAnalyticsData.productTypes) && this.f1046format == onDemandMessageAnalyticsData.f1046format;
    }

    public final int hashCode() {
        String str = this.campaignToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.templateToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.templateVersion;
        return this.f1046format.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (l != null ? l.hashCode() : 0)) * 31, 31, this.productTypes);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OnDemandMessageAnalyticsData(campaignToken=", this.campaignToken, ", templateToken=", this.templateToken, ", templateVersion=");
        m.append(this.templateVersion);
        m.append(", productTypes=");
        m.append(this.productTypes);
        m.append(", format=");
        m.append(this.f1046format);
        m.append(")");
        return m.toString();
    }
}
