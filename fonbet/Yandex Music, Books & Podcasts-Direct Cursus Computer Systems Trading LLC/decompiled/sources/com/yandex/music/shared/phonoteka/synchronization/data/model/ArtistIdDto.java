package com.yandex.music.shared.phonoteka.synchronization.data.model;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.qc7;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/phonoteka/synchronization/data/model/ArtistIdDto;", "", "", "artistId", "Lqc7;", "timestamp", "<init>", "(Ljava/lang/String;Lqc7;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lqc7;", "b", "()Lqc7;", "shared-phonoteka-synchronization"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class ArtistIdDto {

    @SerializedName("artistId")
    private final String artistId;

    @SerializedName("timestamp")
    private final qc7 timestamp;

    public ArtistIdDto(String str, qc7 qc7Var) {
        this.artistId = str;
        this.timestamp = qc7Var;
    }

    /* renamed from: a, reason: from getter */
    public final String getArtistId() {
        return this.artistId;
    }

    /* renamed from: b, reason: from getter */
    public final qc7 getTimestamp() {
        return this.timestamp;
    }
}
