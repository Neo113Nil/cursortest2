package com.yandex.music.shared.wizard3.network.dto;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/music/shared/wizard3/network/dto/WizardFullArtistDto;", "", "", ConnectableDevice.KEY_ID, "name", "Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoverDto;", "cover", "Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoordinatesDto;", "coordinates", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoverDto;Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoordinatesDto;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoverDto;", "b", "()Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoverDto;", "Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoordinatesDto;", "a", "()Lcom/yandex/music/shared/wizard3/network/dto/WizardArtistCoordinatesDto;", "shared-wizard3"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class WizardFullArtistDto {

    @SerializedName("coordinate")
    private final WizardArtistCoordinatesDto coordinates;

    @SerializedName("cover")
    private final WizardArtistCoverDto cover;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("name")
    private final String name;

    public WizardFullArtistDto(String str, String str2, WizardArtistCoverDto wizardArtistCoverDto, WizardArtistCoordinatesDto wizardArtistCoordinatesDto) {
        this.id = str;
        this.name = str2;
        this.cover = wizardArtistCoverDto;
        this.coordinates = wizardArtistCoordinatesDto;
    }

    /* renamed from: a, reason: from getter */
    public final WizardArtistCoordinatesDto getCoordinates() {
        return this.coordinates;
    }

    /* renamed from: b, reason: from getter */
    public final WizardArtistCoverDto getCover() {
        return this.cover;
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WizardFullArtistDto)) {
            return false;
        }
        WizardFullArtistDto wizardFullArtistDto = (WizardFullArtistDto) obj;
        return Intrinsics.d(this.id, wizardFullArtistDto.id) && Intrinsics.d(this.name, wizardFullArtistDto.name) && Intrinsics.d(this.cover, wizardFullArtistDto.cover) && Intrinsics.d(this.coordinates, wizardFullArtistDto.coordinates);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        WizardArtistCoverDto wizardArtistCoverDto = this.cover;
        int hashCode3 = (hashCode2 + (wizardArtistCoverDto == null ? 0 : wizardArtistCoverDto.hashCode())) * 31;
        WizardArtistCoordinatesDto wizardArtistCoordinatesDto = this.coordinates;
        return hashCode3 + (wizardArtistCoordinatesDto != null ? wizardArtistCoordinatesDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.name;
        WizardArtistCoverDto wizardArtistCoverDto = this.cover;
        WizardArtistCoordinatesDto wizardArtistCoordinatesDto = this.coordinates;
        StringBuilder m = f1d.m("WizardFullArtistDto(id=", str, ", name=", str2, ", cover=");
        m.append(wizardArtistCoverDto);
        m.append(", coordinates=");
        m.append(wizardArtistCoordinatesDto);
        m.append(")");
        return m.toString();
    }
}
