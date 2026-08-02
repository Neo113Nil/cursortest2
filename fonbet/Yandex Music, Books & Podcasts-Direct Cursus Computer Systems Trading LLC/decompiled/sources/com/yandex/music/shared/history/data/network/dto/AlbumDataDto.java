package com.yandex.music.shared.history.data.network.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.hze;
import defpackage.iji;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/history/data/network/dto/AlbumDataDto;", "Liji;", "Lcom/yandex/music/shared/history/data/network/dto/AlbumItemIdDto;", "itemId", "Lcom/yandex/music/shared/history/data/network/dto/AlbumFullModelDto;", "fullModel", "<init>", "(Lcom/yandex/music/shared/history/data/network/dto/AlbumItemIdDto;Lcom/yandex/music/shared/history/data/network/dto/AlbumFullModelDto;)V", "Lcom/yandex/music/shared/history/data/network/dto/AlbumItemIdDto;", "b", "()Lcom/yandex/music/shared/history/data/network/dto/AlbumItemIdDto;", "Lcom/yandex/music/shared/history/data/network/dto/AlbumFullModelDto;", "a", "()Lcom/yandex/music/shared/history/data/network/dto/AlbumFullModelDto;", "shared-music-history"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class AlbumDataDto implements iji {

    @SerializedName("fullModel")
    private final AlbumFullModelDto fullModel;

    @SerializedName("itemId")
    private final AlbumItemIdDto itemId;

    public /* synthetic */ AlbumDataDto(AlbumItemIdDto albumItemIdDto, AlbumFullModelDto albumFullModelDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(albumItemIdDto, (i & 2) != 0 ? null : albumFullModelDto);
    }

    /* renamed from: a, reason: from getter */
    public final AlbumFullModelDto getFullModel() {
        return this.fullModel;
    }

    /* renamed from: b, reason: from getter */
    public final AlbumItemIdDto getItemId() {
        return this.itemId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumDataDto)) {
            return false;
        }
        AlbumDataDto albumDataDto = (AlbumDataDto) obj;
        return Intrinsics.d(this.itemId, albumDataDto.itemId) && Intrinsics.d(this.fullModel, albumDataDto.fullModel);
    }

    @Override // defpackage.iji
    public final hze getItemId() {
        return this.itemId;
    }

    public final int hashCode() {
        AlbumItemIdDto albumItemIdDto = this.itemId;
        int hashCode = (albumItemIdDto == null ? 0 : albumItemIdDto.hashCode()) * 31;
        AlbumFullModelDto albumFullModelDto = this.fullModel;
        return hashCode + (albumFullModelDto != null ? albumFullModelDto.hashCode() : 0);
    }

    public final String toString() {
        return "AlbumDataDto(itemId=" + this.itemId + ", fullModel=" + this.fullModel + ")";
    }

    public AlbumDataDto(AlbumItemIdDto albumItemIdDto, AlbumFullModelDto albumFullModelDto) {
        this.itemId = albumItemIdDto;
        this.fullModel = albumFullModelDto;
    }
}
