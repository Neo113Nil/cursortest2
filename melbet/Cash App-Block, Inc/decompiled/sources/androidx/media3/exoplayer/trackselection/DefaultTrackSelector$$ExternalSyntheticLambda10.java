package androidx.media3.exoplayer.trackselection;

import android.os.Build;
import androidx.media3.common.Format;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.util.SpatializerWrapper;
import com.google.common.base.Predicate;

/* loaded from: classes3.dex */
public final /* synthetic */ class DefaultTrackSelector$$ExternalSyntheticLambda10 implements Predicate {
    public final /* synthetic */ DefaultTrackSelector f$0;
    public final /* synthetic */ DefaultTrackSelector.Parameters f$1;

    public /* synthetic */ DefaultTrackSelector$$ExternalSyntheticLambda10(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters) {
        this.f$0 = defaultTrackSelector;
        this.f$1 = parameters;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
    
        if (r7.spatializationSupported != false) goto L42;
     */
    @Override // com.google.common.base.Predicate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        Boolean bool;
        SpatializerWrapper spatializerWrapper;
        Format format2 = (Format) obj;
        DefaultTrackSelector defaultTrackSelector = this.f$0;
        defaultTrackSelector.getClass();
        if (this.f$1.constrainAudioChannelCountToDeviceCapabilities && ((bool = defaultTrackSelector.deviceIsTV) == null || !bool.booleanValue())) {
            int i = format2.channelCount;
            if (i != -1 && i > 2) {
                String str = format2.sampleMimeType;
                if (str != null) {
                    switch (str) {
                        case "audio/eac3-joc":
                        case "audio/ac3":
                        case "audio/ac4":
                        case "audio/eac3":
                            if (Build.VERSION.SDK_INT >= 32) {
                                SpatializerWrapper spatializerWrapper2 = defaultTrackSelector.spatializer;
                                if (spatializerWrapper2 != null) {
                                    break;
                                }
                            }
                            break;
                        default:
                            if (Build.VERSION.SDK_INT >= 32 || (spatializerWrapper = defaultTrackSelector.spatializer) == null || !spatializerWrapper.spatializationSupported || !spatializerWrapper.isAvailable() || !defaultTrackSelector.spatializer.isEnabled() || !defaultTrackSelector.spatializer.canBeSpatialized(defaultTrackSelector.audioAttributes, format2)) {
                                return false;
                            }
                            break;
                    }
                }
                if (Build.VERSION.SDK_INT >= 32) {
                }
                return false;
            }
        }
        return true;
    }
}
