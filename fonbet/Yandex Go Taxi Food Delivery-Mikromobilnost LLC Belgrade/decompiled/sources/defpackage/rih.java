package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.c;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.a;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public class rih implements syi0 {
    public static final long DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS = 5000;
    public static final int EXTENSION_RENDERER_MODE_OFF = 0;
    public static final int EXTENSION_RENDERER_MODE_ON = 1;
    public static final int EXTENSION_RENDERER_MODE_PREFER = 2;
    public static final int MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY = 50;
    private static final String TAG = "DefaultRenderersFactory";
    private final oeh codecAdapterFactory;
    private final Context context;
    private boolean enableAudioTrackPlaybackParams;
    private boolean enableDecoderFallback;
    private boolean enableFloatOutput;
    private boolean enableMediaCodecVideoRendererPrewarming;
    private boolean parseAv1SampleDependencies;
    private int extensionRendererMode = 0;
    private long allowedVideoJoiningTimeMs = 5000;
    private xb10 mediaCodecSelector = xb10.L2;
    private long lateThresholdToDropDecoderInputUs = -9223372036854775807L;

    public rih(Context context) {
        this.context = context;
        this.codecAdapterFactory = new oeh(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:74|75|(5:12|13|14|15|16)|18|19|20|(2:21|22)|(5:24|25|26|27|28)|29|30|31|(2:32|33)|35|36|38) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildAudioRenderers(Context context, int i, xb10 xb10Var, boolean z, ch3 ch3Var, Handler handler, xg3 xg3Var, ArrayList arrayList) {
        int i2;
        int i3;
        int i4;
        int i5;
        arrayList.add(new qb10(context, getCodecAdapterFactory(), xb10Var, z, handler, xg3Var, ch3Var));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
            } catch (Exception e) {
                ny61.h("Error instantiating MIDI extension", e);
                return;
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            arrayList.add(size, (fyi0) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, xg3.class, ch3.class).newInstance(context, handler, xg3Var, ch3Var));
            lk91.h(TAG, "Loaded MidiRenderer.");
        } catch (ClassNotFoundException unused2) {
            size = i2;
            i2 = size;
            try {
                i3 = i2 + 1;
                try {
                    arrayList.add(i2, (fyi0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                    lk91.h(TAG, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused3) {
                    i2 = i3;
                    i3 = i2;
                    try {
                        i4 = i3 + 1;
                        arrayList.add(i3, (fyi0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                        lk91.h(TAG, "Loaded LibflacAudioRenderer.");
                        i5 = i4 + 1;
                        try {
                            arrayList.add(i4, (fyi0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                            lk91.h(TAG, "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused4) {
                            i4 = i5;
                            i5 = i4;
                            int i6 = i5 + 1;
                            arrayList.add(i5, (fyi0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, xg3.class, ch3.class).newInstance(context, handler, xg3Var, ch3Var));
                            lk91.h(TAG, "Loaded LibiamfAudioRenderer.");
                            arrayList.add(i6, (fyi0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                            lk91.h(TAG, "Loaded MpeghAudioRenderer.");
                        }
                        int i62 = i5 + 1;
                        arrayList.add(i5, (fyi0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, xg3.class, ch3.class).newInstance(context, handler, xg3Var, ch3Var));
                        lk91.h(TAG, "Loaded LibiamfAudioRenderer.");
                        arrayList.add(i62, (fyi0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                        lk91.h(TAG, "Loaded MpeghAudioRenderer.");
                    } catch (Exception e2) {
                        ny61.h("Error instantiating FLAC extension", e2);
                        return;
                    }
                }
            } catch (ClassNotFoundException unused5) {
            }
            try {
                i4 = i3 + 1;
            } catch (ClassNotFoundException unused6) {
            }
            try {
                try {
                    arrayList.add(i3, (fyi0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                    lk91.h(TAG, "Loaded LibflacAudioRenderer.");
                } catch (ClassNotFoundException unused7) {
                    i3 = i4;
                    i4 = i3;
                    i5 = i4 + 1;
                    arrayList.add(i4, (fyi0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                    lk91.h(TAG, "Loaded FfmpegAudioRenderer.");
                    int i622 = i5 + 1;
                    arrayList.add(i5, (fyi0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, xg3.class, ch3.class).newInstance(context, handler, xg3Var, ch3Var));
                    lk91.h(TAG, "Loaded LibiamfAudioRenderer.");
                    arrayList.add(i622, (fyi0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                    lk91.h(TAG, "Loaded MpeghAudioRenderer.");
                }
                int i6222 = i5 + 1;
                try {
                    arrayList.add(i5, (fyi0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, xg3.class, ch3.class).newInstance(context, handler, xg3Var, ch3Var));
                    lk91.h(TAG, "Loaded LibiamfAudioRenderer.");
                } catch (ClassNotFoundException unused8) {
                    i5 = i6222;
                    i6222 = i5;
                    arrayList.add(i6222, (fyi0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                    lk91.h(TAG, "Loaded MpeghAudioRenderer.");
                }
                arrayList.add(i6222, (fyi0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                lk91.h(TAG, "Loaded MpeghAudioRenderer.");
            } catch (Exception e3) {
                ny61.h("Error instantiating IAMF extension", e3);
                return;
            }
            try {
                i5 = i4 + 1;
                arrayList.add(i4, (fyi0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                lk91.h(TAG, "Loaded FfmpegAudioRenderer.");
            } catch (ClassNotFoundException unused9) {
            }
        }
        try {
            i3 = i2 + 1;
            arrayList.add(i2, (fyi0) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
            lk91.h(TAG, "Loaded LibopusAudioRenderer.");
            i4 = i3 + 1;
            arrayList.add(i3, (fyi0) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
            lk91.h(TAG, "Loaded LibflacAudioRenderer.");
            try {
                i5 = i4 + 1;
                arrayList.add(i4, (fyi0) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                lk91.h(TAG, "Loaded FfmpegAudioRenderer.");
                int i62222 = i5 + 1;
                arrayList.add(i5, (fyi0) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, Handler.class, xg3.class, ch3.class).newInstance(context, handler, xg3Var, ch3Var));
                lk91.h(TAG, "Loaded LibiamfAudioRenderer.");
                try {
                    arrayList.add(i62222, (fyi0) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(Handler.class, xg3.class, ch3.class).newInstance(handler, xg3Var, ch3Var));
                    lk91.h(TAG, "Loaded MpeghAudioRenderer.");
                } catch (ClassNotFoundException unused10) {
                } catch (Exception e4) {
                    ny61.h("Error instantiating MPEG-H extension", e4);
                }
            } catch (Exception e5) {
                ny61.h("Error instantiating FFmpeg extension", e5);
            }
        } catch (Exception e6) {
            ny61.h("Error instantiating Opus extension", e6);
        }
    }

    public ch3 buildAudioSink(Context context, boolean z, boolean z2) {
        d6h d6hVar = new d6h(context);
        d6hVar.d = z;
        d6hVar.e = z2;
        d6z.x(!d6hVar.f);
        d6hVar.f = true;
        if (d6hVar.c == null) {
            og3[] og3VarArr = new og3[0];
            gcs0 gcs0Var = new gcs0();
            b9t0 b9t0Var = new b9t0();
            wwf wwfVar = new wwf();
            og3[] og3VarArr2 = new og3[og3VarArr.length + 2];
            wwfVar.a = og3VarArr2;
            System.arraycopy(og3VarArr, 0, og3VarArr2, 0, og3VarArr.length);
            wwfVar.b = gcs0Var;
            wwfVar.c = b9t0Var;
            og3VarArr2[og3VarArr.length] = gcs0Var;
            og3VarArr2[og3VarArr.length + 1] = b9t0Var;
            d6hVar.c = wwfVar;
        }
        if (d6hVar.i == null) {
            d6hVar.i = new z5h(context);
        }
        return new c(d6hVar);
    }

    public void buildCameraMotionRenderers(Context context, int i, ArrayList<fyi0> arrayList) {
        arrayList.add(new rr7());
    }

    public void buildImageRenderers(ArrayList<fyi0> arrayList) {
        arrayList.add(new vdv(getImageDecoderFactory()));
    }

    public void buildMetadataRenderers(Context context, k920 k920Var, Looper looper, int i, ArrayList<fyi0> arrayList) {
        arrayList.add(new MetadataRenderer(k920Var, looper));
        arrayList.add(new MetadataRenderer(k920Var, looper));
    }

    public void buildMiscellaneousRenderers(Context context, Handler handler, int i, ArrayList<fyi0> arrayList) {
    }

    public fyi0 buildSecondaryVideoRenderer(fyi0 fyi0Var, Context context, int i, xb10 xb10Var, boolean z, Handler handler, co31 co31Var, long j) {
        if (!this.enableMediaCodecVideoRendererPrewarming || fyi0Var.getClass() != a.class) {
            return null;
        }
        gd10 gd10Var = new gd10(context);
        gd10Var.d = getCodecAdapterFactory();
        gd10Var.c = xb10Var;
        gd10Var.e = j;
        gd10Var.f = z;
        gd10Var.g = handler;
        gd10Var.h = co31Var;
        gd10Var.i = 50;
        gd10Var.k = this.parseAv1SampleDependencies;
        gd10Var.l = this.lateThresholdToDropDecoderInputUs;
        return gd10Var.a();
    }

    public void buildTextRenderers(Context context, ury0 ury0Var, Looper looper, int i, ArrayList arrayList) {
        arrayList.add(new TextRenderer(ury0Var, looper));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:3|(1:5)|6|7|8|(2:9|10)|11|12|13|(2:14|15)|(3:17|18|20)) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void buildVideoRenderers(Context context, int i, xb10 xb10Var, boolean z, Handler handler, co31 co31Var, long j, ArrayList arrayList) {
        int i2;
        int i3;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        gd10 gd10Var = new gd10(context);
        gd10Var.d = getCodecAdapterFactory();
        gd10Var.c = xb10Var;
        gd10Var.e = j;
        gd10Var.f = z;
        gd10Var.g = handler;
        gd10Var.h = co31Var;
        gd10Var.i = 50;
        gd10Var.k = this.parseAv1SampleDependencies;
        gd10Var.l = this.lateThresholdToDropDecoderInputUs;
        arrayList.add(gd10Var.a());
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i2 = size + 1;
            } catch (Exception e) {
                ny61.h("Error instantiating VP9 extension", e);
                return;
            }
        } catch (ClassNotFoundException unused) {
        }
        try {
            try {
                arrayList.add(size, (fyi0) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(cls2, Handler.class, co31.class, cls).newInstance(Long.valueOf(j), handler, co31Var, 50));
                lk91.h(TAG, "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused2) {
                size = i2;
                i2 = size;
                i3 = i2 + 1;
                arrayList.add(i2, (fyi0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, co31.class, cls).newInstance(Long.valueOf(j), handler, co31Var, 50));
                lk91.h(TAG, "Loaded Libgav1VideoRenderer.");
                arrayList.add(i3, (fyi0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, co31.class, cls).newInstance(Long.valueOf(j), handler, co31Var, 50));
                lk91.h(TAG, "Loaded FfmpegVideoRenderer.");
            }
            i3 = i2 + 1;
            try {
                arrayList.add(i2, (fyi0) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(cls2, Handler.class, co31.class, cls).newInstance(Long.valueOf(j), handler, co31Var, 50));
                lk91.h(TAG, "Loaded Libgav1VideoRenderer.");
            } catch (ClassNotFoundException unused3) {
                i2 = i3;
                i3 = i2;
                arrayList.add(i3, (fyi0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, co31.class, cls).newInstance(Long.valueOf(j), handler, co31Var, 50));
                lk91.h(TAG, "Loaded FfmpegVideoRenderer.");
            }
            try {
                arrayList.add(i3, (fyi0) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(cls2, Handler.class, co31.class, cls).newInstance(Long.valueOf(j), handler, co31Var, 50));
                lk91.h(TAG, "Loaded FfmpegVideoRenderer.");
            } catch (ClassNotFoundException unused4) {
            } catch (Exception e2) {
                ny61.h("Error instantiating FFmpeg extension", e2);
            }
        } catch (Exception e3) {
            ny61.h("Error instantiating AV1 extension", e3);
        }
    }

    @Override // defpackage.syi0
    public fyi0[] createRenderers(Handler handler, co31 co31Var, xg3 xg3Var, ury0 ury0Var, k920 k920Var) {
        Handler handler2;
        ArrayList arrayList = new ArrayList();
        buildVideoRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, co31Var, this.allowedVideoJoiningTimeMs, arrayList);
        ch3 buildAudioSink = buildAudioSink(this.context, this.enableFloatOutput, this.enableAudioTrackPlaybackParams);
        if (buildAudioSink != null) {
            handler2 = handler;
            buildAudioRenderers(this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, buildAudioSink, handler2, xg3Var, arrayList);
        } else {
            handler2 = handler;
        }
        buildTextRenderers(this.context, ury0Var, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildMetadataRenderers(this.context, k920Var, handler2.getLooper(), this.extensionRendererMode, arrayList);
        buildCameraMotionRenderers(this.context, this.extensionRendererMode, arrayList);
        buildImageRenderers(arrayList);
        buildMiscellaneousRenderers(this.context, handler2, this.extensionRendererMode, arrayList);
        return (fyi0[]) arrayList.toArray(new fyi0[0]);
    }

    @Override // defpackage.syi0
    public fyi0 createSecondaryRenderer(fyi0 fyi0Var, Handler handler, co31 co31Var, xg3 xg3Var, ury0 ury0Var, k920 k920Var) {
        if (fyi0Var.getTrackType() == 2) {
            return buildSecondaryVideoRenderer(fyi0Var, this.context, this.extensionRendererMode, this.mediaCodecSelector, this.enableDecoderFallback, handler, co31Var, this.allowedVideoJoiningTimeMs);
        }
        return null;
    }

    public final rih experimentalSetEnableMediaCodecVideoRendererPrewarming(boolean z) {
        this.enableMediaCodecVideoRendererPrewarming = z;
        return this;
    }

    public final rih experimentalSetLateThresholdToDropDecoderInputUs(long j) {
        this.lateThresholdToDropDecoderInputUs = j;
        return this;
    }

    public final rih experimentalSetMediaCodecAsyncCryptoFlagEnabled(boolean z) {
        this.codecAdapterFactory.c = z;
        return this;
    }

    public final rih experimentalSetParseAv1SampleDependencies(boolean z) {
        this.parseAv1SampleDependencies = z;
        return this;
    }

    public final rih forceDisableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.b = 2;
        return this;
    }

    public final rih forceEnableMediaCodecAsynchronousQueueing() {
        this.codecAdapterFactory.b = 1;
        return this;
    }

    public mb10 getCodecAdapterFactory() {
        return this.codecAdapterFactory;
    }

    public h9v getImageDecoderFactory() {
        return h9v.a;
    }

    public final rih setAllowedVideoJoiningTimeMs(long j) {
        this.allowedVideoJoiningTimeMs = j;
        return this;
    }

    public final rih setEnableAudioFloatOutput(boolean z) {
        this.enableFloatOutput = z;
        return this;
    }

    public final rih setEnableAudioTrackPlaybackParams(boolean z) {
        this.enableAudioTrackPlaybackParams = z;
        return this;
    }

    public final rih setEnableDecoderFallback(boolean z) {
        this.enableDecoderFallback = z;
        return this;
    }

    public final rih setExtensionRendererMode(int i) {
        this.extensionRendererMode = i;
        return this;
    }

    public final rih setMediaCodecSelector(xb10 xb10Var) {
        this.mediaCodecSelector = xb10Var;
        return this;
    }
}
