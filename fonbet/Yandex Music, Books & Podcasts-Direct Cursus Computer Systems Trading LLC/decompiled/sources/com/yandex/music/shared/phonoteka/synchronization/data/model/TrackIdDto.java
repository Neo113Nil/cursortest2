package com.yandex.music.shared.phonoteka.synchronization.data.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.qc7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/music/shared/phonoteka/synchronization/data/model/TrackIdDto;", "", "", "trackId", "albumId", "Lqc7;", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqc7;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "Lqc7;", "b", "()Lqc7;", "shared-phonoteka-synchronization"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class TrackIdDto {

    @SerializedName("albumId")
    private final String albumId;

    @SerializedName("timestamp")
    private final qc7 timestamp;

    @SerializedName("trackId")
    private final String trackId;

    public TrackIdDto(String str, String str2, qc7 qc7Var) {
        this.trackId = str;
        this.albumId = str2;
        this.timestamp = qc7Var;
    }

    /* renamed from: a, reason: from getter */
    public final String getAlbumId() {
        return this.albumId;
    }

    /* renamed from: b, reason: from getter */
    public final qc7 getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: c, reason: from getter */
    public final String getTrackId() {
        return this.trackId;
    }
}
