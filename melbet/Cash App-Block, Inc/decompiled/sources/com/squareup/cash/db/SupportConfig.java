package com.squareup.cash.db;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SupportConfig {
    public final String privacy_notice_url;
    public final String terms_of_service_url;

    public SupportConfig(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.privacy_notice_url = str;
        this.terms_of_service_url = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SupportConfig)) {
            return false;
        }
        SupportConfig supportConfig = (SupportConfig) obj;
        return Intrinsics.areEqual(this.privacy_notice_url, supportConfig.privacy_notice_url) && Intrinsics.areEqual(this.terms_of_service_url, supportConfig.terms_of_service_url);
    }

    public final int hashCode() {
        return this.terms_of_service_url.hashCode() + (this.privacy_notice_url.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("SupportConfig(privacy_notice_url=", this.privacy_notice_url, ", terms_of_service_url=", this.terms_of_service_url, ")");
    }
}
