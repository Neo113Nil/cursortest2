package ru.yandex.video.m3.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.exoplayer.mediacodec.RecoverType;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.video.a;
import defpackage.aac;
import defpackage.ch3;
import defpackage.co31;
import defpackage.eno;
import defpackage.evu0;
import defpackage.fm51;
import defpackage.fno;
import defpackage.fyi0;
import defpackage.qb10;
import defpackage.rih;
import defpackage.tcc;
import defpackage.tls;
import defpackage.ub10;
import defpackage.ury0;
import defpackage.xb10;
import defpackage.xg3;
import defpackage.yd21;
import defpackage.z9c;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.ExoRenderersFactory;
import ru.yandex.video.m3.player.impl.managers.AllowInitCodecManager;
import ru.yandex.video.m3.player.tracking.StrmEventLogger;
import ru.yandex.video.m3.player.utils.DummyPlayerLogger;
import ru.yandex.video.m3.player.utils.PlayerLogger;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000 T2\u00020\u0001:\u0002UTB±\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010 \u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"JA\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b-\u0010.J?\u00102\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J%\u0010:\u001a\u00020\u00002\u0014\b\u0002\u00107\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020604H\u0000¢\u0006\u0004\b8\u00109J_\u0010?\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020%2\u0016\u0010>\u001a\u0012\u0012\u0004\u0012\u00020,0<j\b\u0012\u0004\u0012\u00020,`=H\u0014¢\u0006\u0004\b?\u0010@JU\u0010A\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u0002012\f\u0010>\u001a\b\u0012\u0004\u0012\u00020,0<H\u0014¢\u0006\u0004\bA\u0010BJ=\u0010G\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010;\u001a\u00020\n2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020,0<H\u0014¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010JR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010KR\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010JR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010JR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010LR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010MR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010NR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010OR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010JR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010JR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010JR\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010PR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010QR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010JR\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010JR\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010JR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010RR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010SR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010J¨\u0006V"}, d2 = {"Lru/yandex/video/m3/player/ExoRenderersFactory;", "Lrih;", "Landroid/content/Context;", "context", "", "enableOutputSurfaceWorkaround", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "preferHardwareDecodersOnSamsungTablets", "preferHardwareDecodersOnAnyModel", "", "maxRecoverAttempts", "Landroidx/media3/exoplayer/mediacodec/RecoverType;", "recoverType", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "strmEventLogger", "", "eosWorkaroundFlags", "shouldDisableMtkReconfiguration", "disableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "enableAsyncDecoderQueue", "Lub10;", "mediaCodecLifecycleObserverFactory", "Laac;", "codecInitializationConfiguration", "useCustomAudioRenderer", "useNewMediaCodecAdapterFactoryForAudioRenderer", "shouldResetCodecBeforeRelease", "Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;", "allowInitCodecManager", "Lfm51;", "yandexMediaCodecAdapterFactory", "disableCodecReuseInCaseOfCodecProfileOrLevelChange", "<init>", "(Landroid/content/Context;ZLru/yandex/video/m3/player/utils/PlayerLogger;ZZILandroidx/media3/exoplayer/mediacodec/RecoverType;Lru/yandex/video/m3/player/tracking/StrmEventLogger;Ljava/lang/String;ZZZLub10;Laac;ZZZLru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;Lfm51;Z)V", "Lxb10;", "mediaCodecSelector", "", "allowedVideoJoiningTimeMs", "enableDecoderFallback", "Landroid/os/Handler;", "eventHandler", "Lco31;", "eventListener", "Lfyi0;", "buildVideoRenderer", "(Landroid/content/Context;Lxb10;JZLandroid/os/Handler;Lco31;)Lfyi0;", "Lch3;", "audioSink", "Lxg3;", "buildAudioRenderer", "(Landroid/content/Context;Lxb10;ZLch3;Landroid/os/Handler;Lxg3;)Lfyi0;", "Lkotlin/Function1;", "Lru/yandex/video/m3/player/ExoRenderersFactory$Builder;", "Lzy11;", "builderAction", "copy$video_player_internalRelease", "(Ltls;)Lru/yandex/video/m3/player/ExoRenderersFactory;", "copy", "extensionRendererMode", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "out", "buildVideoRenderers", "(Landroid/content/Context;ILxb10;ZLandroid/os/Handler;Lco31;JLjava/util/ArrayList;)V", "buildAudioRenderers", "(Landroid/content/Context;ILxb10;ZLch3;Landroid/os/Handler;Lxg3;Ljava/util/ArrayList;)V", "Lury0;", "output", "Landroid/os/Looper;", "outputLooper", "buildTextRenderers", "(Landroid/content/Context;Lury0;Landroid/os/Looper;ILjava/util/ArrayList;)V", "Landroid/content/Context;", "Z", "Lru/yandex/video/m3/player/utils/PlayerLogger;", CA20Status.STATUS_USER_I, "Landroidx/media3/exoplayer/mediacodec/RecoverType;", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "Ljava/lang/String;", "Lub10;", "Laac;", "Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;", "Lfm51;", "Companion", "Builder", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ExoRenderersFactory extends rih {
    public static final String TAG = "ExoRenderersFactory";
    private final AllowInitCodecManager allowInitCodecManager;
    private final aac codecInitializationConfiguration;
    private final Context context;
    private final boolean disableCodecReuseInCaseOfCodecProfileOrLevelChange;
    private final boolean disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
    private final boolean enableAsyncDecoderQueue;
    private final boolean enableOutputSurfaceWorkaround;
    private final String eosWorkaroundFlags;
    private final int maxRecoverAttempts;
    private final ub10 mediaCodecLifecycleObserverFactory;
    private final PlayerLogger playerLogger;
    private final boolean preferHardwareDecodersOnAnyModel;
    private final boolean preferHardwareDecodersOnSamsungTablets;
    private final RecoverType recoverType;
    private final boolean shouldDisableMtkReconfiguration;
    private final boolean shouldResetCodecBeforeRelease;
    private final StrmEventLogger strmEventLogger;
    private final boolean useCustomAudioRenderer;
    private final boolean useNewMediaCodecAdapterFactoryForAudioRenderer;
    private final fm51 yandexMediaCodecAdapterFactory;
    public static final int $stable = 8;

    private ExoRenderersFactory(Context context, boolean z, PlayerLogger playerLogger, boolean z2, boolean z3, int i, RecoverType recoverType, StrmEventLogger strmEventLogger, String str, boolean z4, boolean z5, boolean z6, ub10 ub10Var, aac aacVar, boolean z7, boolean z8, boolean z9, AllowInitCodecManager allowInitCodecManager, fm51 fm51Var, boolean z10) {
        super(context);
        this.context = context;
        this.enableOutputSurfaceWorkaround = z;
        this.playerLogger = playerLogger;
        this.preferHardwareDecodersOnSamsungTablets = z2;
        this.preferHardwareDecodersOnAnyModel = z3;
        this.maxRecoverAttempts = i;
        this.recoverType = recoverType;
        this.strmEventLogger = strmEventLogger;
        this.eosWorkaroundFlags = str;
        this.shouldDisableMtkReconfiguration = z4;
        this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = z5;
        this.enableAsyncDecoderQueue = z6;
        this.mediaCodecLifecycleObserverFactory = ub10Var;
        this.codecInitializationConfiguration = aacVar;
        this.useCustomAudioRenderer = z7;
        this.useNewMediaCodecAdapterFactoryForAudioRenderer = z8;
        this.shouldResetCodecBeforeRelease = z9;
        this.allowInitCodecManager = allowInitCodecManager;
        this.yandexMediaCodecAdapterFactory = fm51Var;
        this.disableCodecReuseInCaseOfCodecProfileOrLevelChange = z10;
    }

    private final fyi0 buildAudioRenderer(Context context, xb10 mediaCodecSelector, boolean enableDecoderFallback, ch3 audioSink, Handler eventHandler, xg3 eventListener) {
        return new eno(context, this.useNewMediaCodecAdapterFactoryForAudioRenderer ? this.yandexMediaCodecAdapterFactory : getCodecAdapterFactory(), mediaCodecSelector, enableDecoderFallback, eventHandler, eventListener, audioSink, this.allowInitCodecManager);
    }

    private final fyi0 buildVideoRenderer(Context context, xb10 mediaCodecSelector, long allowedVideoJoiningTimeMs, boolean enableDecoderFallback, Handler eventHandler, co31 eventListener) {
        List W;
        fno fnoVar = new fno(context, this.yandexMediaCodecAdapterFactory, mediaCodecSelector, allowedVideoJoiningTimeMs, enableDecoderFallback, eventHandler, eventListener, this.enableOutputSurfaceWorkaround, new yd21(this.preferHardwareDecodersOnSamsungTablets, this.preferHardwareDecodersOnAnyModel), this.playerLogger, this.allowInitCodecManager);
        z9c z9cVar = new z9c(this.maxRecoverAttempts, this.recoverType);
        z9cVar.toString();
        fnoVar.M0 = z9cVar;
        W = evu0.W(this.eosWorkaroundFlags, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        List list = W;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(evu0.k0((String) it.next()).toString());
        }
        fnoVar.U = arrayList.contains("amlogic");
        fnoVar.Z = arrayList.contains("amlogic2");
        StrmEventLogger strmEventLogger = this.strmEventLogger;
        if (strmEventLogger != null) {
            fnoVar.O0 = strmEventLogger;
        }
        fnoVar.I5 = this.shouldDisableMtkReconfiguration;
        fnoVar.J0 = this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
        ub10 ub10Var = this.mediaCodecLifecycleObserverFactory;
        if (ub10Var != null) {
            fnoVar.m0 = ub10Var;
        }
        aac aacVar = this.codecInitializationConfiguration;
        if (aacVar != null) {
            fnoVar.K0 = aacVar;
        }
        fnoVar.K5 = this.disableCodecReuseInCaseOfCodecProfileOrLevelChange;
        return fnoVar;
    }

    public static /* synthetic */ ExoRenderersFactory copy$video_player_internalRelease$default(ExoRenderersFactory exoRenderersFactory, tls tlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tlsVar = new tls() { // from class: ru.yandex.video.m3.player.ExoRenderersFactory$copy$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ExoRenderersFactory.Builder) obj2);
                    return zy11.a;
                }

                public final void invoke(ExoRenderersFactory.Builder builder) {
                }
            };
        }
        return exoRenderersFactory.copy$video_player_internalRelease(tlsVar);
    }

    @Override // defpackage.rih
    public void buildAudioRenderers(Context context, int extensionRendererMode, xb10 mediaCodecSelector, boolean enableDecoderFallback, ch3 audioSink, Handler eventHandler, xg3 eventListener, ArrayList<fyi0> out) {
        super.buildAudioRenderers(context, extensionRendererMode, mediaCodecSelector, enableDecoderFallback, audioSink, eventHandler, eventListener, out);
        if (this.useCustomAudioRenderer) {
            Iterator<fyi0> it = out.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (it.next() instanceof qb10) {
                    break;
                } else {
                    i++;
                }
            }
            out.set(i, buildAudioRenderer(context, mediaCodecSelector, enableDecoderFallback, audioSink, eventHandler, eventListener));
        }
    }

    @Override // defpackage.rih
    public void buildTextRenderers(Context context, ury0 output, Looper outputLooper, int extensionRendererMode, ArrayList<fyi0> out) {
        ArrayList<fyi0> arrayList = new ArrayList();
        super.buildTextRenderers(context, output, outputLooper, extensionRendererMode, arrayList);
        for (fyi0 fyi0Var : arrayList) {
            TextRenderer textRenderer = fyi0Var instanceof TextRenderer ? (TextRenderer) fyi0Var : null;
            if (textRenderer != null) {
                textRenderer.experimentalSetLegacyDecodingEnabled(true);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.add((fyi0) it.next());
        }
    }

    @Override // defpackage.rih
    public void buildVideoRenderers(Context context, int extensionRendererMode, xb10 mediaCodecSelector, boolean enableDecoderFallback, Handler eventHandler, co31 eventListener, long allowedVideoJoiningTimeMs, ArrayList<fyi0> out) {
        super.buildVideoRenderers(context, extensionRendererMode, mediaCodecSelector, enableDecoderFallback, eventHandler, eventListener, allowedVideoJoiningTimeMs, out);
        Iterator<fyi0> it = out.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next() instanceof a) {
                break;
            } else {
                i++;
            }
        }
        out.set(i, buildVideoRenderer(context, mediaCodecSelector, allowedVideoJoiningTimeMs, enableDecoderFallback, eventHandler, eventListener));
    }

    public final ExoRenderersFactory copy$video_player_internalRelease(tls builderAction) {
        Builder builder = new Builder(this);
        builderAction.invoke(builder);
        return builder.build$video_player_internalRelease();
    }

    public /* synthetic */ ExoRenderersFactory(Context context, boolean z, PlayerLogger playerLogger, boolean z2, boolean z3, int i, RecoverType recoverType, StrmEventLogger strmEventLogger, String str, boolean z4, boolean z5, boolean z6, ub10 ub10Var, aac aacVar, boolean z7, boolean z8, boolean z9, AllowInitCodecManager allowInitCodecManager, fm51 fm51Var, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z, playerLogger, z2, z3, i, recoverType, strmEventLogger, str, z4, z5, z6, ub10Var, aacVar, z7, z8, z9, allowInitCodecManager, fm51Var, z10);
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0005R$\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!\"\u0004\b-\u0010#R$\u0010.\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!\"\u0004\b0\u0010#R$\u00102\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010=\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010<R$\u0010@\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u001f\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#R$\u0010C\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001f\u001a\u0004\bD\u0010!\"\u0004\bE\u0010#R$\u0010F\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001f\u001a\u0004\bG\u0010!\"\u0004\bH\u0010#R$\u0010I\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010\u001f\u001a\u0004\bJ\u0010!\"\u0004\bK\u0010#R$\u0010L\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010\u001f\u001a\u0004\bM\u0010!\"\u0004\bN\u0010#R$\u0010O\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010\u001f\u001a\u0004\bP\u0010!\"\u0004\bQ\u0010#R$\u0010S\u001a\u0004\u0018\u00010R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010Z\u001a\u0004\u0018\u00010Y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R$\u0010a\u001a\u0004\u0018\u00010`8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010h\u001a\u0004\u0018\u00010g8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010n\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010\u001f\u001a\u0004\bo\u0010!\"\u0004\bp\u0010#¨\u0006q"}, d2 = {"Lru/yandex/video/m3/player/ExoRenderersFactory$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/yandex/video/m3/player/ExoRenderersFactory;", "exoRenderersFactory", "(Lru/yandex/video/m3/player/ExoRenderersFactory;)V", "build$video_player_internalRelease", "()Lru/yandex/video/m3/player/ExoRenderersFactory;", "build", "", "recoverType", "Landroidx/media3/exoplayer/mediacodec/RecoverType;", "inferRecoverType", "(Ljava/lang/String;)Landroidx/media3/exoplayer/mediacodec/RecoverType;", "Lfm51;", "yandexMediaCodecAdapterFactory", "Lzy11;", "setupRecoverType", "(Landroidx/media3/exoplayer/mediacodec/RecoverType;Lfm51;)V", "", "enable", "setupAsyncDecoderQueue", "(ZLfm51;)V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "enableOutputSurfaceWorkaround", "Ljava/lang/Boolean;", "getEnableOutputSurfaceWorkaround", "()Ljava/lang/Boolean;", "setEnableOutputSurfaceWorkaround", "(Ljava/lang/Boolean;)V", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "playerLogger", "Lru/yandex/video/m3/player/utils/PlayerLogger;", "getPlayerLogger", "()Lru/yandex/video/m3/player/utils/PlayerLogger;", "setPlayerLogger", "(Lru/yandex/video/m3/player/utils/PlayerLogger;)V", "preferHardwareDecodersOnSamsungTablets", "getPreferHardwareDecodersOnSamsungTablets", "setPreferHardwareDecodersOnSamsungTablets", "preferHardwareDecodersOnAnyModel", "getPreferHardwareDecodersOnAnyModel", "setPreferHardwareDecodersOnAnyModel", "", "maxRecoverAttempts", "Ljava/lang/Integer;", "getMaxRecoverAttempts", "()Ljava/lang/Integer;", "setMaxRecoverAttempts", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "getRecoverType", "()Ljava/lang/String;", "setRecoverType", "(Ljava/lang/String;)V", "eosWorkaroundFlags", "getEosWorkaroundFlags", "setEosWorkaroundFlags", "shouldDisableMtkReconfiguration", "getShouldDisableMtkReconfiguration", "setShouldDisableMtkReconfiguration", "disableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "setDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround", "enableAsyncDecoderQueue", "getEnableAsyncDecoderQueue", "setEnableAsyncDecoderQueue", "useCustomAudioRenderer", "getUseCustomAudioRenderer", "setUseCustomAudioRenderer", "useNewMediaCodecAdapterFactoryForAudioRenderer", "getUseNewMediaCodecAdapterFactoryForAudioRenderer", "setUseNewMediaCodecAdapterFactoryForAudioRenderer", "shouldResetCodecBeforeRelease", "getShouldResetCodecBeforeRelease", "setShouldResetCodecBeforeRelease", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "strmEventLogger", "Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "getStrmEventLogger$video_player_internalRelease", "()Lru/yandex/video/m3/player/tracking/StrmEventLogger;", "setStrmEventLogger$video_player_internalRelease", "(Lru/yandex/video/m3/player/tracking/StrmEventLogger;)V", "Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;", "allowInitCodecManager", "Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;", "getAllowInitCodecManager$video_player_internalRelease", "()Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;", "setAllowInitCodecManager$video_player_internalRelease", "(Lru/yandex/video/m3/player/impl/managers/AllowInitCodecManager;)V", "Lub10;", "mediaCodecLifecycleObserverFactory", "Lub10;", "getMediaCodecLifecycleObserverFactory$video_player_internalRelease", "()Lub10;", "setMediaCodecLifecycleObserverFactory$video_player_internalRelease", "(Lub10;)V", "Laac;", "codecInitializationConfiguration", "Laac;", "getCodecInitializationConfiguration$video_player_internalRelease", "()Laac;", "setCodecInitializationConfiguration$video_player_internalRelease", "(Laac;)V", "disableCodecReuseInCaseOfCodecProfileOrLevelChange", "getDisableCodecReuseInCaseOfCodecProfileOrLevelChange$video_player_internalRelease", "setDisableCodecReuseInCaseOfCodecProfileOrLevelChange$video_player_internalRelease", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private AllowInitCodecManager allowInitCodecManager;
        private aac codecInitializationConfiguration;
        private Context context;
        private Boolean disableCodecReuseInCaseOfCodecProfileOrLevelChange;
        private Boolean disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
        private Boolean enableAsyncDecoderQueue;
        private Boolean enableOutputSurfaceWorkaround;
        private String eosWorkaroundFlags;
        private Integer maxRecoverAttempts;
        private ub10 mediaCodecLifecycleObserverFactory;
        private PlayerLogger playerLogger;
        private Boolean preferHardwareDecodersOnAnyModel;
        private Boolean preferHardwareDecodersOnSamsungTablets;
        private String recoverType;
        private Boolean shouldDisableMtkReconfiguration;
        private Boolean shouldResetCodecBeforeRelease;
        private StrmEventLogger strmEventLogger;
        private Boolean useCustomAudioRenderer;
        private Boolean useNewMediaCodecAdapterFactoryForAudioRenderer;

        public Builder(ExoRenderersFactory exoRenderersFactory) {
            this(exoRenderersFactory.context);
            this.enableOutputSurfaceWorkaround = Boolean.valueOf(exoRenderersFactory.enableOutputSurfaceWorkaround);
            this.playerLogger = exoRenderersFactory.playerLogger;
            this.preferHardwareDecodersOnSamsungTablets = Boolean.valueOf(exoRenderersFactory.preferHardwareDecodersOnSamsungTablets);
            this.preferHardwareDecodersOnAnyModel = Boolean.valueOf(exoRenderersFactory.preferHardwareDecodersOnAnyModel);
            this.maxRecoverAttempts = Integer.valueOf(exoRenderersFactory.maxRecoverAttempts);
            this.recoverType = exoRenderersFactory.recoverType.toString();
            this.eosWorkaroundFlags = exoRenderersFactory.eosWorkaroundFlags;
            this.shouldDisableMtkReconfiguration = Boolean.valueOf(exoRenderersFactory.shouldDisableMtkReconfiguration);
            this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = Boolean.valueOf(exoRenderersFactory.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround);
            this.enableAsyncDecoderQueue = Boolean.valueOf(exoRenderersFactory.enableAsyncDecoderQueue);
            this.useCustomAudioRenderer = Boolean.valueOf(exoRenderersFactory.useCustomAudioRenderer);
            this.useNewMediaCodecAdapterFactoryForAudioRenderer = Boolean.valueOf(exoRenderersFactory.useNewMediaCodecAdapterFactoryForAudioRenderer);
            this.shouldResetCodecBeforeRelease = Boolean.valueOf(exoRenderersFactory.shouldResetCodecBeforeRelease);
            this.strmEventLogger = exoRenderersFactory.strmEventLogger;
            this.allowInitCodecManager = exoRenderersFactory.allowInitCodecManager;
            this.mediaCodecLifecycleObserverFactory = exoRenderersFactory.mediaCodecLifecycleObserverFactory;
            this.codecInitializationConfiguration = exoRenderersFactory.codecInitializationConfiguration;
            this.disableCodecReuseInCaseOfCodecProfileOrLevelChange = Boolean.valueOf(exoRenderersFactory.disableCodecReuseInCaseOfCodecProfileOrLevelChange);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0006, code lost:
        
            if (r2 == null) goto L5;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final RecoverType inferRecoverType(String recoverType) {
            Object valueOf;
            if (recoverType != null) {
                try {
                    valueOf = RecoverType.valueOf(recoverType);
                } catch (Throwable th) {
                    valueOf = new Result.Failure(th);
                }
            }
            valueOf = RecoverType.DEFAULT;
            Throwable a = Result.a(valueOf);
            if (a != null) {
                Log.e(ExoRenderersFactory.TAG, "unknown recover type specified", a);
            }
            Object obj = RecoverType.DEFAULT;
            if (valueOf instanceof Result.Failure) {
                valueOf = obj;
            }
            return (RecoverType) valueOf;
        }

        private final void setupAsyncDecoderQueue(boolean enable, fm51 yandexMediaCodecAdapterFactory) {
            if (enable) {
                yandexMediaCodecAdapterFactory.a = 1;
            } else {
                yandexMediaCodecAdapterFactory.a = 2;
            }
        }

        private final void setupRecoverType(RecoverType recoverType, fm51 yandexMediaCodecAdapterFactory) {
            if (recoverType != RecoverType.DEFAULT) {
                yandexMediaCodecAdapterFactory.b = 1;
            } else {
                yandexMediaCodecAdapterFactory.b = 2;
            }
        }

        public final ExoRenderersFactory build$video_player_internalRelease() {
            fm51 fm51Var = new fm51();
            Boolean bool = this.shouldResetCodecBeforeRelease;
            if (bool != null) {
                fm51Var.c = bool.booleanValue();
            }
            Boolean bool2 = this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
            if (bool2 != null) {
                fm51Var.w = bool2.booleanValue();
            }
            Boolean bool3 = this.enableAsyncDecoderQueue;
            if (bool3 != null) {
                setupAsyncDecoderQueue(bool3.booleanValue(), fm51Var);
            }
            RecoverType inferRecoverType = inferRecoverType(this.recoverType);
            setupRecoverType(inferRecoverType, fm51Var);
            Context context = this.context;
            Boolean bool4 = this.enableOutputSurfaceWorkaround;
            boolean booleanValue = bool4 != null ? bool4.booleanValue() : false;
            PlayerLogger playerLogger = this.playerLogger;
            if (playerLogger == null) {
                playerLogger = new DummyPlayerLogger();
            }
            Boolean bool5 = this.preferHardwareDecodersOnSamsungTablets;
            boolean booleanValue2 = bool5 != null ? bool5.booleanValue() : false;
            Boolean bool6 = this.preferHardwareDecodersOnAnyModel;
            boolean booleanValue3 = bool6 != null ? bool6.booleanValue() : false;
            Integer num = this.maxRecoverAttempts;
            int intValue = num != null ? num.intValue() : 0;
            boolean z = booleanValue;
            PlayerLogger playerLogger2 = playerLogger;
            boolean z2 = booleanValue3;
            StrmEventLogger strmEventLogger = this.strmEventLogger;
            String str = this.eosWorkaroundFlags;
            if (str == null) {
                str = "";
            }
            Boolean bool7 = this.shouldDisableMtkReconfiguration;
            boolean booleanValue4 = bool7 != null ? bool7.booleanValue() : false;
            Boolean bool8 = this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
            boolean booleanValue5 = bool8 != null ? bool8.booleanValue() : false;
            Boolean bool9 = this.enableAsyncDecoderQueue;
            boolean booleanValue6 = bool9 != null ? bool9.booleanValue() : false;
            boolean z3 = booleanValue2;
            int i = intValue;
            String str2 = str;
            boolean z4 = booleanValue5;
            ub10 ub10Var = this.mediaCodecLifecycleObserverFactory;
            boolean z5 = booleanValue4;
            boolean z6 = booleanValue6;
            aac aacVar = this.codecInitializationConfiguration;
            Boolean bool10 = this.useCustomAudioRenderer;
            boolean booleanValue7 = bool10 != null ? bool10.booleanValue() : true;
            Boolean bool11 = this.useNewMediaCodecAdapterFactoryForAudioRenderer;
            boolean booleanValue8 = bool11 != null ? bool11.booleanValue() : false;
            Boolean bool12 = this.shouldResetCodecBeforeRelease;
            boolean booleanValue9 = bool12 != null ? bool12.booleanValue() : false;
            AllowInitCodecManager allowInitCodecManager = this.allowInitCodecManager;
            Boolean bool13 = this.disableCodecReuseInCaseOfCodecProfileOrLevelChange;
            return new ExoRenderersFactory(context, z, playerLogger2, z3, z2, i, inferRecoverType, strmEventLogger, str2, z5, z4, z6, ub10Var, aacVar, booleanValue7, booleanValue8, booleanValue9, allowInitCodecManager, fm51Var, bool13 != null ? bool13.booleanValue() : false, null);
        }

        /* renamed from: getAllowInitCodecManager$video_player_internalRelease, reason: from getter */
        public final AllowInitCodecManager getAllowInitCodecManager() {
            return this.allowInitCodecManager;
        }

        /* renamed from: getCodecInitializationConfiguration$video_player_internalRelease, reason: from getter */
        public final aac getCodecInitializationConfiguration() {
            return this.codecInitializationConfiguration;
        }

        public final Context getContext() {
            return this.context;
        }

        /* renamed from: getDisableCodecReuseInCaseOfCodecProfileOrLevelChange$video_player_internalRelease, reason: from getter */
        public final Boolean getDisableCodecReuseInCaseOfCodecProfileOrLevelChange() {
            return this.disableCodecReuseInCaseOfCodecProfileOrLevelChange;
        }

        public final Boolean getDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround() {
            return this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround;
        }

        public final Boolean getEnableAsyncDecoderQueue() {
            return this.enableAsyncDecoderQueue;
        }

        public final Boolean getEnableOutputSurfaceWorkaround() {
            return this.enableOutputSurfaceWorkaround;
        }

        public final String getEosWorkaroundFlags() {
            return this.eosWorkaroundFlags;
        }

        public final Integer getMaxRecoverAttempts() {
            return this.maxRecoverAttempts;
        }

        /* renamed from: getMediaCodecLifecycleObserverFactory$video_player_internalRelease, reason: from getter */
        public final ub10 getMediaCodecLifecycleObserverFactory() {
            return this.mediaCodecLifecycleObserverFactory;
        }

        public final PlayerLogger getPlayerLogger() {
            return this.playerLogger;
        }

        public final Boolean getPreferHardwareDecodersOnAnyModel() {
            return this.preferHardwareDecodersOnAnyModel;
        }

        public final Boolean getPreferHardwareDecodersOnSamsungTablets() {
            return this.preferHardwareDecodersOnSamsungTablets;
        }

        public final String getRecoverType() {
            return this.recoverType;
        }

        public final Boolean getShouldDisableMtkReconfiguration() {
            return this.shouldDisableMtkReconfiguration;
        }

        public final Boolean getShouldResetCodecBeforeRelease() {
            return this.shouldResetCodecBeforeRelease;
        }

        /* renamed from: getStrmEventLogger$video_player_internalRelease, reason: from getter */
        public final StrmEventLogger getStrmEventLogger() {
            return this.strmEventLogger;
        }

        public final Boolean getUseCustomAudioRenderer() {
            return this.useCustomAudioRenderer;
        }

        public final Boolean getUseNewMediaCodecAdapterFactoryForAudioRenderer() {
            return this.useNewMediaCodecAdapterFactoryForAudioRenderer;
        }

        public final void setAllowInitCodecManager$video_player_internalRelease(AllowInitCodecManager allowInitCodecManager) {
            this.allowInitCodecManager = allowInitCodecManager;
        }

        public final void setCodecInitializationConfiguration$video_player_internalRelease(aac aacVar) {
            this.codecInitializationConfiguration = aacVar;
        }

        public final void setContext(Context context) {
            this.context = context;
        }

        public final void setDisableCodecReuseInCaseOfCodecProfileOrLevelChange$video_player_internalRelease(Boolean bool) {
            this.disableCodecReuseInCaseOfCodecProfileOrLevelChange = bool;
        }

        public final void setDisableTooEarlyMediaCodecNativeReleaseReturnWorkaround(Boolean bool) {
            this.disableTooEarlyMediaCodecNativeReleaseReturnWorkaround = bool;
        }

        public final void setEnableAsyncDecoderQueue(Boolean bool) {
            this.enableAsyncDecoderQueue = bool;
        }

        public final void setEnableOutputSurfaceWorkaround(Boolean bool) {
            this.enableOutputSurfaceWorkaround = bool;
        }

        public final void setEosWorkaroundFlags(String str) {
            this.eosWorkaroundFlags = str;
        }

        public final void setMaxRecoverAttempts(Integer num) {
            this.maxRecoverAttempts = num;
        }

        public final void setMediaCodecLifecycleObserverFactory$video_player_internalRelease(ub10 ub10Var) {
            this.mediaCodecLifecycleObserverFactory = ub10Var;
        }

        public final void setPlayerLogger(PlayerLogger playerLogger) {
            this.playerLogger = playerLogger;
        }

        public final void setPreferHardwareDecodersOnAnyModel(Boolean bool) {
            this.preferHardwareDecodersOnAnyModel = bool;
        }

        public final void setPreferHardwareDecodersOnSamsungTablets(Boolean bool) {
            this.preferHardwareDecodersOnSamsungTablets = bool;
        }

        public final void setRecoverType(String str) {
            this.recoverType = str;
        }

        public final void setShouldDisableMtkReconfiguration(Boolean bool) {
            this.shouldDisableMtkReconfiguration = bool;
        }

        public final void setShouldResetCodecBeforeRelease(Boolean bool) {
            this.shouldResetCodecBeforeRelease = bool;
        }

        public final void setStrmEventLogger$video_player_internalRelease(StrmEventLogger strmEventLogger) {
            this.strmEventLogger = strmEventLogger;
        }

        public final void setUseCustomAudioRenderer(Boolean bool) {
            this.useCustomAudioRenderer = bool;
        }

        public final void setUseNewMediaCodecAdapterFactoryForAudioRenderer(Boolean bool) {
            this.useNewMediaCodecAdapterFactoryForAudioRenderer = bool;
        }

        public Builder(Context context) {
            this.context = context.getApplicationContext();
        }
    }
}
