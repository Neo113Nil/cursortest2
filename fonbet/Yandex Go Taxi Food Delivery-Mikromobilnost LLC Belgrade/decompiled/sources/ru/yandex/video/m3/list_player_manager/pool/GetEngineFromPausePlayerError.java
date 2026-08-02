package ru.yandex.video.m3.list_player_manager.pool;

import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/list_player_manager/pool/GetEngineFromPausePlayerError;", "", "playerIndex", "", "playerIndexWithDetachedEngine", "(II)V", "getPlayerIndex", "()I", "getPlayerIndexWithDetachedEngine", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class GetEngineFromPausePlayerError {
    public static final int $stable = 0;
    private final int playerIndex;
    private final int playerIndexWithDetachedEngine;

    public GetEngineFromPausePlayerError(int i, int i2) {
        this.playerIndex = i;
        this.playerIndexWithDetachedEngine = i2;
    }

    public static /* synthetic */ GetEngineFromPausePlayerError copy$default(GetEngineFromPausePlayerError getEngineFromPausePlayerError, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = getEngineFromPausePlayerError.playerIndex;
        }
        if ((i3 & 2) != 0) {
            i2 = getEngineFromPausePlayerError.playerIndexWithDetachedEngine;
        }
        return getEngineFromPausePlayerError.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPlayerIndex() {
        return this.playerIndex;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlayerIndexWithDetachedEngine() {
        return this.playerIndexWithDetachedEngine;
    }

    public final GetEngineFromPausePlayerError copy(int playerIndex, int playerIndexWithDetachedEngine) {
        return new GetEngineFromPausePlayerError(playerIndex, playerIndexWithDetachedEngine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetEngineFromPausePlayerError)) {
            return false;
        }
        GetEngineFromPausePlayerError getEngineFromPausePlayerError = (GetEngineFromPausePlayerError) other;
        return this.playerIndex == getEngineFromPausePlayerError.playerIndex && this.playerIndexWithDetachedEngine == getEngineFromPausePlayerError.playerIndexWithDetachedEngine;
    }

    public final int getPlayerIndex() {
        return this.playerIndex;
    }

    public final int getPlayerIndexWithDetachedEngine() {
        return this.playerIndexWithDetachedEngine;
    }

    public int hashCode() {
        return Integer.hashCode(this.playerIndexWithDetachedEngine) + (Integer.hashCode(this.playerIndex) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GetEngineFromPausePlayerError(playerIndex=");
        sb.append(this.playerIndex);
        sb.append(", playerIndexWithDetachedEngine=");
        return oyr.s(sb, this.playerIndexWithDetachedEngine, ')');
    }
}
