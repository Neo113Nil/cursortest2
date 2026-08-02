package ru.yandex.video.m3.player.impl.tracking.event;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveData;", "Lru/yandex/video/m3/player/impl/tracking/event/DefaultEventData;", "states", "", "Lru/yandex/video/m3/player/impl/tracking/event/PlayerAliveState;", "(Ljava/util/List;)V", "getStates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlayerAliveData extends DefaultEventData {
    public static final int $stable = 8;
    private final List<PlayerAliveState> states;

    public PlayerAliveData(List<PlayerAliveState> list) {
        super(null, 1, null);
        this.states = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlayerAliveData copy$default(PlayerAliveData playerAliveData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = playerAliveData.states;
        }
        return playerAliveData.copy(list);
    }

    public final List<PlayerAliveState> component1() {
        return this.states;
    }

    public final PlayerAliveData copy(List<PlayerAliveState> states) {
        return new PlayerAliveData(states);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PlayerAliveData) && jl40.l(this.states, ((PlayerAliveData) other).states);
    }

    public final List<PlayerAliveState> getStates() {
        return this.states;
    }

    public int hashCode() {
        return this.states.hashCode();
    }

    public String toString() {
        return unr0.t(new StringBuilder("PlayerAliveData(states="), this.states, ')');
    }
}
