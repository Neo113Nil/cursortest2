package androidx.media3.exoplayer;

import android.content.Context;
import androidx.camera.video.Recorder;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource$Factory;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.extractor.DefaultExtractorsFactory;
import com.google.common.base.Supplier;
import com.google.common.collect.RegularImmutableList;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.NavigationModule$Companion;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final /* synthetic */ class ExoPlayer$Builder$$ExternalSyntheticLambda0 implements Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ ExoPlayer$Builder$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.google.common.base.Supplier
    public final Object get() {
        DefaultBandwidthMeter defaultBandwidthMeter;
        int i = this.$r8$classId;
        Context context = null;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                return new Recorder.AnonymousClass4((Context) obj);
            case 1:
                return NavigationModule$Companion.getAudioManager((Context) obj);
            case 2:
                return new DefaultMediaSourceFactory((Context) obj, new DefaultExtractorsFactory());
            case 3:
                return new DefaultTrackSelector((Context) obj);
            case 4:
                Context context2 = (Context) obj;
                RegularImmutableList regularImmutableList = DefaultBandwidthMeter.DEFAULT_INITIAL_BITRATE_ESTIMATES_WIFI;
                synchronized (DefaultBandwidthMeter.class) {
                    try {
                        if (DefaultBandwidthMeter.singletonInstance == null) {
                            if (context2 != null) {
                                context = context2.getApplicationContext();
                            }
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            DefaultBandwidthMeter.singletonInstance = new DefaultBandwidthMeter(context, hashMap);
                        }
                        defaultBandwidthMeter = DefaultBandwidthMeter.singletonInstance;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultBandwidthMeter;
            default:
                try {
                    return (MediaSource$Factory) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    OptionalProvider$$ExternalSyntheticLambda0.m(e);
                    return null;
                }
        }
    }
}
