package androidx.media3.exoplayer;

/* loaded from: classes3.dex */
public final class DefaultLivePlaybackSpeedControl {
    public final long maxLiveOffsetErrorUsForUnitSpeed;
    public final long targetLiveOffsetRebufferDeltaUs;
    public long mediaConfigurationTargetLiveOffsetUs = -9223372036854775807L;
    public long targetLiveOffsetOverrideUs = -9223372036854775807L;
    public long minTargetLiveOffsetUs = -9223372036854775807L;
    public long maxTargetLiveOffsetUs = -9223372036854775807L;
    public float minPlaybackSpeed = 0.97f;
    public float maxPlaybackSpeed = 1.03f;
    public float adjustedPlaybackSpeed = 1.0f;
    public long lastPlaybackSpeedUpdateMs = -9223372036854775807L;
    public long idealTargetLiveOffsetUs = -9223372036854775807L;
    public long currentTargetLiveOffsetUs = -9223372036854775807L;
    public long smoothedMinPossibleLiveOffsetUs = -9223372036854775807L;
    public long smoothedMinPossibleLiveOffsetDeviationUs = -9223372036854775807L;

    public DefaultLivePlaybackSpeedControl(long j, long j2) {
        this.maxLiveOffsetErrorUsForUnitSpeed = j;
        this.targetLiveOffsetRebufferDeltaUs = j2;
    }

    public final void maybeResetTargetLiveOffsetUs() {
        long j;
        long j2 = this.mediaConfigurationTargetLiveOffsetUs;
        if (j2 != -9223372036854775807L) {
            j = this.targetLiveOffsetOverrideUs;
            if (j == -9223372036854775807L) {
                long j3 = this.minTargetLiveOffsetUs;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.maxTargetLiveOffsetUs;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.idealTargetLiveOffsetUs == j) {
            return;
        }
        this.idealTargetLiveOffsetUs = j;
        this.currentTargetLiveOffsetUs = j;
        this.smoothedMinPossibleLiveOffsetUs = -9223372036854775807L;
        this.smoothedMinPossibleLiveOffsetDeviationUs = -9223372036854775807L;
        this.lastPlaybackSpeedUpdateMs = -9223372036854775807L;
    }
}
