package com.yandex.music.skeleton.blocks.likes_and_history.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.dto.domainitem.EntityCoverDto;
import defpackage.bzd;
import defpackage.c3x;
import defpackage.c5b;
import defpackage.u9b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/music/skeleton/blocks/likes_and_history/data/LikesAndHistoryEntityDto;", "", "Lcom/yandex/music/skeleton/blocks/likes_and_history/data/HistoryEntityDto;", "history", "<init>", "(Lcom/yandex/music/skeleton/blocks/likes_and_history/data/HistoryEntityDto;)V", "Lcom/yandex/music/skeleton/blocks/likes_and_history/data/HistoryEntityDto;", "getHistory", "()Lcom/yandex/music/skeleton/blocks/likes_and_history/data/HistoryEntityDto;", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class LikesAndHistoryEntityDto {

    @SerializedName("history")
    private final HistoryEntityDto history;

    public LikesAndHistoryEntityDto(HistoryEntityDto historyEntityDto) {
        this.history = historyEntityDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public final bzd a() {
        String title;
        ?? r3;
        ?? r2;
        HistoryEntityDto historyEntityDto = this.history;
        if (historyEntityDto == null || (title = historyEntityDto.getTitle()) == null) {
            return null;
        }
        List<EntityCoverDto> trackCovers = this.history.getTrackCovers();
        if (trackCovers != null) {
            r3 = new ArrayList();
            for (EntityCoverDto entityCoverDto : trackCovers) {
                u9b V = entityCoverDto != null ? c3x.V(entityCoverDto) : null;
                if (V != null) {
                    r3.add(V);
                }
            }
        } else {
            r3 = c5b.a;
        }
        List<String> subtitleElements = this.history.getSubtitleElements();
        if (subtitleElements != null) {
            r2 = new ArrayList();
            for (String str : subtitleElements) {
                if (str != null) {
                    r2.add(str);
                }
            }
        } else {
            r2 = c5b.a;
        }
        return new bzd(title, r3, r2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LikesAndHistoryEntityDto) && Intrinsics.d(this.history, ((LikesAndHistoryEntityDto) obj).history);
    }

    public final int hashCode() {
        HistoryEntityDto historyEntityDto = this.history;
        if (historyEntityDto == null) {
            return 0;
        }
        return historyEntityDto.hashCode();
    }

    public final String toString() {
        return "LikesAndHistoryEntityDto(history=" + this.history + ")";
    }
}
