package com.squareup.cash.family.familyhub.backend.api;

import com.squareup.cash.wallet.data.TagFormFactor;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SponseeCashAppTag {
    public final String deviceId;
    public final TagFormFactor formFactor;
    public final boolean isSponsorLocked;
    public final String name;

    public SponseeCashAppTag(String str, String str2, TagFormFactor tagFormFactor, boolean z) {
        str.getClass();
        this.deviceId = str;
        this.name = str2;
        this.formFactor = tagFormFactor;
        this.isSponsorLocked = z;
    }

    public static SponseeCashAppTag copy$default(SponseeCashAppTag sponseeCashAppTag, boolean z) {
        String str = sponseeCashAppTag.deviceId;
        String str2 = sponseeCashAppTag.name;
        TagFormFactor tagFormFactor = sponseeCashAppTag.formFactor;
        str.getClass();
        return new SponseeCashAppTag(str, str2, tagFormFactor, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SponseeCashAppTag)) {
            return false;
        }
        SponseeCashAppTag sponseeCashAppTag = (SponseeCashAppTag) obj;
        return Intrinsics.areEqual(this.deviceId, sponseeCashAppTag.deviceId) && Intrinsics.areEqual(this.name, sponseeCashAppTag.name) && this.formFactor == sponseeCashAppTag.formFactor && this.isSponsorLocked == sponseeCashAppTag.isSponsorLocked;
    }

    public final int hashCode() {
        int hashCode = this.deviceId.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        TagFormFactor tagFormFactor = this.formFactor;
        return Boolean.hashCode(this.isSponsorLocked) + ((hashCode2 + (tagFormFactor != null ? tagFormFactor.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SponseeCashAppTag(deviceId=", this.deviceId, ", name=", this.name, ", formFactor=");
        m.append(this.formFactor);
        m.append(", isSponsorLocked=");
        m.append(this.isSponsorLocked);
        m.append(")");
        return m.toString();
    }
}
