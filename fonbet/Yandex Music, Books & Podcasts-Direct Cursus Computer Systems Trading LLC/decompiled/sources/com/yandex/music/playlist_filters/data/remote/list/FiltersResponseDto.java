package com.yandex.music.playlist_filters.data.remote.list;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.v3w;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/music/playlist_filters/data/remote/list/FiltersResponseDto;", "", "", "Lcom/yandex/music/playlist_filters/data/remote/list/FilterDto;", "filters", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "shared-playlist-filters"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class FiltersResponseDto {

    @SerializedName("filters")
    private final List<FilterDto> filters;

    public FiltersResponseDto(List<FilterDto> list) {
        this.filters = list;
    }

    /* renamed from: a, reason: from getter */
    public final List getFilters() {
        return this.filters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FiltersResponseDto) && Intrinsics.d(this.filters, ((FiltersResponseDto) obj).filters);
    }

    public final int hashCode() {
        List<FilterDto> list = this.filters;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return v3w.f("FiltersResponseDto(filters=", ")", this.filters);
    }
}
