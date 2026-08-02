package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.tracing.Trace;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class TrackSelectorResult {
    public final Object info;
    public final int length;
    public final RendererConfiguration[] rendererConfigurations;
    public final ExoTrackSelection[] selections;
    public final Tracks tracks;

    public TrackSelectorResult(RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr, Tracks tracks, Object obj) {
        Trace.checkArgument(rendererConfigurationArr.length == exoTrackSelectionArr.length);
        this.rendererConfigurations = rendererConfigurationArr;
        this.selections = (ExoTrackSelection[]) exoTrackSelectionArr.clone();
        this.tracks = tracks;
        this.info = obj;
        this.length = rendererConfigurationArr.length;
    }

    public final boolean isEquivalent(TrackSelectorResult trackSelectorResult, int i) {
        return trackSelectorResult != null && Objects.equals(this.rendererConfigurations[i], trackSelectorResult.rendererConfigurations[i]) && Objects.equals(this.selections[i], trackSelectorResult.selections[i]);
    }

    public final boolean isRendererEnabled(int i) {
        return this.rendererConfigurations[i] != null;
    }
}
