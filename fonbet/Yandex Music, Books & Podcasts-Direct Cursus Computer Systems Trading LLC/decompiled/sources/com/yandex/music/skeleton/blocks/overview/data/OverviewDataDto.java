package com.yandex.music.skeleton.blocks.overview.data;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.f1d;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/music/skeleton/blocks/overview/data/OverviewDataDto;", "", "", "title", Constants.KEY_MESSAGE, "", "expandable", "", "visibleLines", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Ljava/lang/Boolean;", "a", "()Ljava/lang/Boolean;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "skeleton-blocks"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class OverviewDataDto {

    @SerializedName("expandable")
    private final Boolean expandable;

    @SerializedName(Constants.KEY_MESSAGE)
    private final String message;

    @SerializedName("title")
    private final String title;

    @SerializedName("visibleLines")
    private final Integer visibleLines;

    public OverviewDataDto(String str, String str2, Boolean bool, Integer num) {
        this.title = str;
        this.message = str2;
        this.expandable = bool;
        this.visibleLines = num;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getExpandable() {
        return this.expandable;
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final Integer getVisibleLines() {
        return this.visibleLines;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverviewDataDto)) {
            return false;
        }
        OverviewDataDto overviewDataDto = (OverviewDataDto) obj;
        return Intrinsics.d(this.title, overviewDataDto.title) && Intrinsics.d(this.message, overviewDataDto.message) && Intrinsics.d(this.expandable, overviewDataDto.expandable) && Intrinsics.d(this.visibleLines, overviewDataDto.visibleLines);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.message;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.expandable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.visibleLines;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.message;
        Boolean bool = this.expandable;
        Integer num = this.visibleLines;
        StringBuilder m = f1d.m("OverviewDataDto(title=", str, ", message=", str2, ", expandable=");
        m.append(bool);
        m.append(", visibleLines=");
        m.append(num);
        m.append(")");
        return m.toString();
    }
}
