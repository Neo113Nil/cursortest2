package com.squareup.cash.pools.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/pools/backend/api/Participant;", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Participant {
    public final Long addedAt;
    public final String customerToken;
    public final String fullName;
    public final String profilePhotoUrl;

    /* renamed from: type, reason: collision with root package name */
    public final ParticipantType f1187type;

    public Participant(ParticipantType participantType, Long l, String str, String str2, String str3) {
        this.f1187type = participantType;
        this.addedAt = l;
        this.customerToken = str;
        this.fullName = str2;
        this.profilePhotoUrl = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Participant)) {
            return false;
        }
        Participant participant = (Participant) obj;
        return this.f1187type == participant.f1187type && Intrinsics.areEqual(this.addedAt, participant.addedAt) && Intrinsics.areEqual(this.customerToken, participant.customerToken) && Intrinsics.areEqual(this.fullName, participant.fullName) && Intrinsics.areEqual(this.profilePhotoUrl, participant.profilePhotoUrl);
    }

    public final int hashCode() {
        int hashCode = this.f1187type.hashCode() * 31;
        Long l = this.addedAt;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.customerToken;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fullName;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.profilePhotoUrl;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Participant(type=");
        sb.append(this.f1187type);
        sb.append(", addedAt=");
        sb.append(this.addedAt);
        sb.append(", customerToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.customerToken, ", fullName=", this.fullName, ", profilePhotoUrl=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.profilePhotoUrl, ")");
    }
}
