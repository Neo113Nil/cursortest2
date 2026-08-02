package com.yandex.music.shared.wizard3.network.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoverDto;", "", "", "type", "uri", "prefix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "a", "getPrefix", "shared-wizard3"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class WizardArtistCoverDto {

    @SerializedName("prefix")
    private final String prefix;

    @SerializedName("type")
    private final String type;

    @SerializedName("uri")
    private final String uri;

    public WizardArtistCoverDto(String str, String str2, String str3) {
        this.type = str;
        this.uri = str2;
        this.prefix = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WizardArtistCoverDto)) {
            return false;
        }
        WizardArtistCoverDto wizardArtistCoverDto = (WizardArtistCoverDto) obj;
        return Intrinsics.d(this.type, wizardArtistCoverDto.type) && Intrinsics.d(this.uri, wizardArtistCoverDto.uri) && Intrinsics.d(this.prefix, wizardArtistCoverDto.prefix);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.uri;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.prefix;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.type;
        String str2 = this.uri;
        return su4.o(f1d.m("WizardArtistCoverDto(type=", str, ", uri=", str2, ", prefix="), this.prefix, ")");
    }
}
