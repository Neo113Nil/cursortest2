package com.yandex.music.shared.history.data.network.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.hze;
import defpackage.iji;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/history/data/network/dto/ArtistDataDto;", "Liji;", "Lcom/yandex/music/shared/history/data/network/dto/ArtistItemIdDto;", "itemId", "Lcom/yandex/music/shared/history/data/network/dto/ArtistFullModelDto;", "fullModel", "<init>", "(Lcom/yandex/music/shared/history/data/network/dto/ArtistItemIdDto;Lcom/yandex/music/shared/history/data/network/dto/ArtistFullModelDto;)V", "Lcom/yandex/music/shared/history/data/network/dto/ArtistItemIdDto;", "b", "()Lcom/yandex/music/shared/history/data/network/dto/ArtistItemIdDto;", "Lcom/yandex/music/shared/history/data/network/dto/ArtistFullModelDto;", "a", "()Lcom/yandex/music/shared/history/data/network/dto/ArtistFullModelDto;", "shared-music-history"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class ArtistDataDto implements iji {

    @SerializedName("fullModel")
    private final ArtistFullModelDto fullModel;

    @SerializedName("itemId")
    private final ArtistItemIdDto itemId;

    public /* synthetic */ ArtistDataDto(ArtistItemIdDto artistItemIdDto, ArtistFullModelDto artistFullModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(artistItemIdDto, (i & 2) != 0 ? null : artistFullModelDto);
    }

    /* renamed from: a, reason: from getter */
    public final ArtistFullModelDto getFullModel() {
        return this.fullModel;
    }

    /* renamed from: b, reason: from getter */
    public final ArtistItemIdDto getItemId() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistDataDto)) {
            return false;
        }
        ArtistDataDto artistDataDto = (ArtistDataDto) obj;
        return Intrinsics.d(this.itemId, artistDataDto.itemId) && Intrinsics.d(this.fullModel, artistDataDto.fullModel);
    }

    @Override // defpackage.iji
    public final hze getItemId() {
        return this.itemId;
    }

    public final int hashCode() {
        ArtistItemIdDto artistItemIdDto = this.itemId;
        int hashCode = (artistItemIdDto == null ? 0 : artistItemIdDto.hashCode()) * 31;
        ArtistFullModelDto artistFullModelDto = this.fullModel;
        return hashCode + (artistFullModelDto != null ? artistFullModelDto.hashCode() : 0);
    }

    public final String toString() {
        return "ArtistDataDto(itemId=" + this.itemId + ", fullModel=" + this.fullModel + ")";
    }

    public ArtistDataDto(ArtistItemIdDto artistItemIdDto, ArtistFullModelDto artistFullModelDto) {
        this.itemId = artistItemIdDto;
        this.fullModel = artistFullModelDto;
    }
}
