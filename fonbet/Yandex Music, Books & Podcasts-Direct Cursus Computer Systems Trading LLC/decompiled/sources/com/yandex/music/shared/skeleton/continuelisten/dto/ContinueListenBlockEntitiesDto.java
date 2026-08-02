package com.yandex.music.shared.skeleton.continuelisten.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/music/shared/skeleton/continuelisten/dto/ContinueListenBlockEntitiesDto;", "", "Lcom/yandex/music/shared/skeleton/continuelisten/dto/BookshelfEntityDto;", "bookshelf", "Lcom/yandex/music/shared/skeleton/continuelisten/dto/NewEpisodesEntityDto;", "newEpisodes", "Lcom/yandex/music/shared/skeleton/continuelisten/dto/PlayedItemDto;", "lastPlayed", "<init>", "(Lcom/yandex/music/shared/skeleton/continuelisten/dto/BookshelfEntityDto;Lcom/yandex/music/shared/skeleton/continuelisten/dto/NewEpisodesEntityDto;Lcom/yandex/music/shared/skeleton/continuelisten/dto/PlayedItemDto;)V", "Lcom/yandex/music/shared/skeleton/continuelisten/dto/BookshelfEntityDto;", "a", "()Lcom/yandex/music/shared/skeleton/continuelisten/dto/BookshelfEntityDto;", "Lcom/yandex/music/shared/skeleton/continuelisten/dto/NewEpisodesEntityDto;", "c", "()Lcom/yandex/music/shared/skeleton/continuelisten/dto/NewEpisodesEntityDto;", "Lcom/yandex/music/shared/skeleton/continuelisten/dto/PlayedItemDto;", "b", "()Lcom/yandex/music/shared/skeleton/continuelisten/dto/PlayedItemDto;", "shared-skeleton-continue-listen-block"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class ContinueListenBlockEntitiesDto {

    @SerializedName("bookshelf")
    private final BookshelfEntityDto bookshelf;

    @SerializedName("lastPlayed")
    private final PlayedItemDto lastPlayed;

    @SerializedName("newEpisodes")
    private final NewEpisodesEntityDto newEpisodes;

    public ContinueListenBlockEntitiesDto(BookshelfEntityDto bookshelfEntityDto, NewEpisodesEntityDto newEpisodesEntityDto, PlayedItemDto playedItemDto) {
        this.bookshelf = bookshelfEntityDto;
        this.newEpisodes = newEpisodesEntityDto;
        this.lastPlayed = playedItemDto;
    }

    /* renamed from: a, reason: from getter */
    public final BookshelfEntityDto getBookshelf() {
        return this.bookshelf;
    }

    /* renamed from: b, reason: from getter */
    public final PlayedItemDto getLastPlayed() {
        return this.lastPlayed;
    }

    /* renamed from: c, reason: from getter */
    public final NewEpisodesEntityDto getNewEpisodes() {
        return this.newEpisodes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContinueListenBlockEntitiesDto)) {
            return false;
        }
        ContinueListenBlockEntitiesDto continueListenBlockEntitiesDto = (ContinueListenBlockEntitiesDto) obj;
        return Intrinsics.d(this.bookshelf, continueListenBlockEntitiesDto.bookshelf) && Intrinsics.d(this.newEpisodes, continueListenBlockEntitiesDto.newEpisodes) && Intrinsics.d(this.lastPlayed, continueListenBlockEntitiesDto.lastPlayed);
    }

    public final int hashCode() {
        BookshelfEntityDto bookshelfEntityDto = this.bookshelf;
        int hashCode = (bookshelfEntityDto == null ? 0 : bookshelfEntityDto.hashCode()) * 31;
        NewEpisodesEntityDto newEpisodesEntityDto = this.newEpisodes;
        int hashCode2 = (hashCode + (newEpisodesEntityDto == null ? 0 : newEpisodesEntityDto.hashCode())) * 31;
        PlayedItemDto playedItemDto = this.lastPlayed;
        return hashCode2 + (playedItemDto != null ? playedItemDto.hashCode() : 0);
    }

    public final String toString() {
        return "ContinueListenBlockEntitiesDto(bookshelf=" + this.bookshelf + ", newEpisodes=" + this.newEpisodes + ", lastPlayed=" + this.lastPlayed + ")";
    }
}
