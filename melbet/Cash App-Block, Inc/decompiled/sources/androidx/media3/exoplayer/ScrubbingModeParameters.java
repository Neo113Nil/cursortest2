package androidx.media3.exoplayer;

import androidx.camera.view.PreviewView;
import com.google.common.collect.ImmutableSet;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ScrubbingModeParameters {
    public static final ScrubbingModeParameters DEFAULT;
    public final ImmutableSet disabledTrackTypes;

    static {
        PreviewView.AnonymousClass1 anonymousClass1 = new PreviewView.AnonymousClass1();
        anonymousClass1.this$0 = ImmutableSet.of((Object) 1, (Object) 5);
        DEFAULT = new ScrubbingModeParameters(anonymousClass1);
    }

    public ScrubbingModeParameters(PreviewView.AnonymousClass1 anonymousClass1) {
        this.disabledTrackTypes = (ImmutableSet) anonymousClass1.this$0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ScrubbingModeParameters) && this.disabledTrackTypes.equals(((ScrubbingModeParameters) obj).disabledTrackTypes);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.disabledTrackTypes, null, null, bool, bool, bool, bool, bool);
    }
}
