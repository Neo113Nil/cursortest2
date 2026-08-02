package com.yandex.music.shared.dto.wave.recommendation;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.su4;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/music/shared/dto/wave/recommendation/RadioRestrictionValueDto;", "", "", "name", Constants.KEY_VALUE, "imageUrl", "serializedSeed", "", "isUnspecified", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "a", "c", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "shared-model-parsers"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class RadioRestrictionValueDto {

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("unspecified")
    private final Boolean isUnspecified;

    @SerializedName("name")
    private final String name;

    @SerializedName("serializedSeed")
    private final String serializedSeed;

    @SerializedName(Constants.KEY_VALUE)
    private final String value;

    public RadioRestrictionValueDto(String str, String str2, String str3, String str4, Boolean bool) {
        this.name = str;
        this.value = str2;
        this.imageUrl = str3;
        this.serializedSeed = str4;
        this.isUnspecified = bool;
    }

    /* renamed from: a, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final String getSerializedSeed() {
        return this.serializedSeed;
    }

    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: e, reason: from getter */
    public final Boolean getIsUnspecified() {
        return this.isUnspecified;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadioRestrictionValueDto)) {
            return false;
        }
        RadioRestrictionValueDto radioRestrictionValueDto = (RadioRestrictionValueDto) obj;
        return Intrinsics.d(this.name, radioRestrictionValueDto.name) && Intrinsics.d(this.value, radioRestrictionValueDto.value) && Intrinsics.d(this.imageUrl, radioRestrictionValueDto.imageUrl) && Intrinsics.d(this.serializedSeed, radioRestrictionValueDto.serializedSeed) && Intrinsics.d(this.isUnspecified, radioRestrictionValueDto.isUnspecified);
    }

    public final int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.serializedSeed;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isUnspecified;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        String str2 = this.value;
        String str3 = this.imageUrl;
        String str4 = this.serializedSeed;
        Boolean bool = this.isUnspecified;
        StringBuilder m = f1d.m("RadioRestrictionValueDto(name=", str, ", value=", str2, ", imageUrl=");
        su4.v(m, str3, ", serializedSeed=", str4, ", isUnspecified=");
        m.append(bool);
        m.append(")");
        return m.toString();
    }
}
