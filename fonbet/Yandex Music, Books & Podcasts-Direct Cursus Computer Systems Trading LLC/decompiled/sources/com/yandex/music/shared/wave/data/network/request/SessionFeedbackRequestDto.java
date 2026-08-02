package com.yandex.music.shared.wave.data.network.request;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.ouj;
import defpackage.vz1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/yandex/music/shared/wave/data/network/request/SessionFeedbackRequestDto;", "", "", "sessionId", "", "seeds", "Lcom/yandex/music/shared/wave/data/network/request/FeedbackRequestDto;", "feedbacks", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getSessionId", "()Ljava/lang/String;", "Ljava/util/List;", "getSeeds", "()Ljava/util/List;", "getFeedbacks", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class SessionFeedbackRequestDto {

    @SerializedName("feedbacks")
    @NotNull
    private final List<FeedbackRequestDto> feedbacks;

    @SerializedName("seeds")
    private final List<String> seeds;

    @SerializedName("sessionId")
    @NotNull
    private final String sessionId;

    public SessionFeedbackRequestDto(@NotNull String str, List<String> list, @NotNull List<FeedbackRequestDto> list2) {
        str.getClass();
        list2.getClass();
        this.sessionId = str;
        this.seeds = list;
        this.feedbacks = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionFeedbackRequestDto)) {
            return false;
        }
        SessionFeedbackRequestDto sessionFeedbackRequestDto = (SessionFeedbackRequestDto) obj;
        return Intrinsics.d(this.sessionId, sessionFeedbackRequestDto.sessionId) && Intrinsics.d(this.seeds, sessionFeedbackRequestDto.seeds) && Intrinsics.d(this.feedbacks, sessionFeedbackRequestDto.feedbacks);
    }

    public final int hashCode() {
        int hashCode = this.sessionId.hashCode() * 31;
        List<String> list = this.seeds;
        return this.feedbacks.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.sessionId;
        List<String> list = this.seeds;
        return vz1.u(ouj.v("SessionFeedbackRequestDto(sessionId=", str, ", seeds=", ", feedbacks=", list), this.feedbacks, ")");
    }
}
