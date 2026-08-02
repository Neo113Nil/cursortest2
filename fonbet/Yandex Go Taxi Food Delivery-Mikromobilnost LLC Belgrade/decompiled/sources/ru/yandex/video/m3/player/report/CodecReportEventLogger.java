package ru.yandex.video.m3.player.report;

import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import defpackage.ah3;
import defpackage.bc10;
import defpackage.cc10;
import defpackage.ci9;
import defpackage.cvu0;
import defpackage.do31;
import defpackage.fc10;
import defpackage.fe10;
import defpackage.gc10;
import defpackage.h42;
import defpackage.he10;
import defpackage.i3y;
import defpackage.i42;
import defpackage.j42;
import defpackage.jou;
import defpackage.jq6;
import defpackage.kyg;
import defpackage.lk91;
import defpackage.lxc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.q801;
import defpackage.qyg;
import defpackage.r001;
import defpackage.r801;
import defpackage.rdf;
import defpackage.re10;
import defpackage.s820;
import defpackage.sb2;
import defpackage.sls;
import defpackage.tb10;
import defpackage.tje;
import defpackage.tse;
import defpackage.ub10;
import defpackage.ue3;
import defpackage.uwy;
import defpackage.vxc0;
import defpackage.w820;
import defpackage.wls;
import defpackage.xaj;
import defpackage.yxc0;
import defpackage.zxc0;
import defpackage.zy11;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.a;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.report.logger.RecordLogger;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001YB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00112\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00112\u0006\u0010!\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010!\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010!\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002¢\u0006\u0004\b0\u00101J\u001e\u00102\u001a\u00020\u00112\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0082@¢\u0006\u0004\b2\u00103J/\u00104\u001a\u00020.2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u00105J)\u00106\u001a\u00020.2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b6\u00107J\u001f\u00108\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b8\u0010\u001bJ\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020.2\u0006\u0010>\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020.2\u0006\u0010A\u001a\u00020\u000fH\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\bD\u0010CJ\u0017\u0010E\u001a\u00020.2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\bE\u0010CJ7\u0010J\u001a\u00020.2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010F\u001a\u00020.2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010HH\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020.2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020.2\u0006\u0010O\u001a\u00020NH\u0002¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010SR\u0014\u0010T\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110-0V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lru/yandex/video/m3/player/report/CodecReportEventLogger;", "Lj42;", "Lub10;", "Ltb10;", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "recordLogger", "Ltse;", "backgroundScope", "<init>", "(Lru/yandex/video/m3/player/report/logger/RecordLogger;Ltse;)V", "Lh42;", "eventTime", "Lyxc0;", "oldPosition", "newPosition", "", CRLReasonCodeExtension.REASON, "Lzy11;", "onPositionDiscontinuity", "(Lh42;Lyxc0;Lyxc0;I)V", "Lfe10;", "mediaItem", "onMediaItemTransition", "(Lh42;Lfe10;I)V", "Lr801;", "tracks", "onTracksChanged", "(Lh42;Lr801;)V", "onPlayerReleased", "(Lh42;)V", "create", "()Ltb10;", "Lfc10;", ClidProvider.STATE, "onCreated", "(Lfc10;)V", "Lgc10;", "onStopped", "(Lgc10;)V", "Lbc10;", "onExecuting", "(Lbc10;)V", "Lcc10;", "onReleased", "(Lcc10;)V", "Lkotlin/Function0;", "", "lazyMessage", "performLog", "(Lsls;)V", "enqueueLog", "(Lsls;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildOnPositionDiscontinuityLogString", "(Lh42;Lyxc0;Lyxc0;I)Ljava/lang/String;", "buildOnMediaItemTransitionString", "(Lh42;Lfe10;I)Ljava/lang/String;", "logOnTracksChanged", "Lq801;", "trackGroup", "", "hasHlsMetadataEntry", "(Lq801;)Z", "isTrackSelected", "buildTrackStatusString", "(Z)Ljava/lang/String;", "formatSupport", "buildFormatSupportString", "(I)Ljava/lang/String;", "buildMediaItemTransitionReasonString", "getDiscontinuityReasonString", "eventName", "eventDescription", "", "throwable", "buildEventString", "(Lh42;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;", "buildEventTimeString", "(Lh42;)Ljava/lang/String;", "", "timeMs", "buildTimeString", "(J)Ljava/lang/String;", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "Ltse;", "startTimeMs", "J", "Lci9;", "taskQueue", "Lci9;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CodecReportEventLogger implements j42, ub10, tb10 {
    private final tse backgroundScope;
    private final RecordLogger recordLogger;
    private final long startTimeMs = SystemClock.elapsedRealtime();
    private final ci9 taskQueue = sb2.a(Integer.MAX_VALUE, null, null, 6);
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final i3y TIME_FORMAT$delegate = a.a(new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$Companion$TIME_FORMAT$2
        @Override // defpackage.sls
        public final NumberFormat invoke() {
            NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
            numberFormat.setMinimumFractionDigits(2);
            numberFormat.setMaximumFractionDigits(2);
            numberFormat.setGroupingUsed(false);
            return numberFormat;
        }
    });

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
    @mvg(c = "ru.yandex.video.m3.player.report.CodecReportEventLogger$1", f = "CodecReportEventLogger.kt", l = {38}, m = "invokeSuspend")
    /* renamed from: ru.yandex.video.m3.player.report.CodecReportEventLogger$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
            return CodecReportEventLogger.this.new AnonymousClass1(continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
            return ((AnonymousClass1) create(tseVar, continuation)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x002e -> B:5:0x0031). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            jq6 it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                it = CodecReportEventLogger.this.taskQueue.iterator();
                this.L$0 = it;
                this.label = 1;
                obj = it.a(this);
                if (obj == coroutineSingletons) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (jq6) this.L$0;
                b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    ((sls) it.b()).invoke();
                    this.L$0 = it;
                    this.label = 1;
                    obj = it.a(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return zy11.a;
                    }
                }
            }
        }
    }

    public CodecReportEventLogger(RecordLogger recordLogger, tse tseVar) {
        this.recordLogger = recordLogger;
        this.backgroundScope = tseVar;
        tje.N(tseVar, null, null, new AnonymousClass1(null), 3);
    }

    private final String buildEventString(h42 eventTime, String eventName, String eventDescription, Throwable throwable) {
        String g;
        StringBuilder v = oyr.v(eventName, " [");
        v.append(buildEventTimeString(eventTime));
        if (throwable instanceof PlaybackException) {
            v.append(", errorCode=");
            v.append(((PlaybackException) throwable).a());
        }
        if (eventDescription != null) {
            v.append(Extension.FIX_SPACE);
            v.append(eventDescription);
        }
        if (throwable != null && (g = lk91.g(throwable)) != null && g.length() != 0) {
            v.append("\n  ");
            v.append(cvu0.v(g, "\n", "\n  ", false));
            v.append("\n");
        }
        v.append("]");
        return v.toString();
    }

    public static /* synthetic */ String buildEventString$default(CodecReportEventLogger codecReportEventLogger, h42 h42Var, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            th = null;
        }
        return codecReportEventLogger.buildEventString(h42Var, str, str2, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildEventTimeString(h42 eventTime) {
        return "eventTime=" + buildTimeString(eventTime.a - this.startTimeMs) + ", mediaPos=" + buildTimeString(eventTime.e) + ", window=" + eventTime.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildFormatSupportString(int formatSupport) {
        return formatSupport != 0 ? formatSupport != 1 ? formatSupport != 2 ? formatSupport != 3 ? formatSupport != 4 ? "UNKNOWN" : "YES" : "NO_EXCEEDS_CAPABILITIES" : "NO_UNSUPPORTED_DRM" : "NO_UNSUPPORTED_TYPE" : "NO";
    }

    private final String buildMediaItemTransitionReasonString(int reason) {
        return reason != 0 ? reason != 1 ? reason != 2 ? reason != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildOnMediaItemTransitionString(h42 eventTime, fe10 mediaItem, int reason) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(buildEventTimeString(eventTime));
        sb.append(", item=");
        sb.append(mediaItem != null ? UtilKt.toLogString(mediaItem) : null);
        sb.append(", reason=");
        return oyr.t(sb, buildMediaItemTransitionReasonString(reason), "]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildOnPositionDiscontinuityLogString(h42 eventTime, yxc0 oldPosition, yxc0 newPosition, int reason) {
        StringBuilder sb = new StringBuilder("reason=");
        sb.append(getDiscontinuityReasonString(reason));
        sb.append(", PositionInfo:old [mediaItem=");
        sb.append(oldPosition.b);
        sb.append(", period=");
        sb.append(oldPosition.e);
        sb.append(", pos=");
        sb.append(oldPosition.f);
        sb.append("], PositionInfo:new [mediaItem=");
        sb.append(newPosition.b);
        sb.append(", period=");
        sb.append(newPosition.e);
        sb.append(", pos=");
        return buildEventString$default(this, eventTime, "positionDiscontinuity", oyr.n(newPosition.f, "]", sb), null, 8, null);
    }

    private final String buildTimeString(long timeMs) {
        return timeMs == -9223372036854775807L ? "?" : Companion.getTIME_FORMAT().format(Float.valueOf(timeMs / 1000.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildTrackStatusString(boolean isTrackSelected) {
        return isTrackSelected ? "[X]" : "[ ]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object enqueueLog(final sls slsVar, Continuation<? super zy11> continuation) {
        Object o = this.taskQueue.o(new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$enqueueLog$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m811invoke() {
                final String str = (String) sls.this.invoke();
                this.performLog(new sls() { // from class: ru.yandex.video.m3.player.report.CodecReportEventLogger$enqueueLog$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final String invoke() {
                        return str;
                    }
                });
            }

            @Override // defpackage.sls
            public /* bridge */ /* synthetic */ Object invoke() {
                m811invoke();
                return zy11.a;
            }
        }, continuation);
        return o == CoroutineSingletons.COROUTINE_SUSPENDED ? o : zy11.a;
    }

    private final String getDiscontinuityReasonString(int reason) {
        return reason != 0 ? reason != 1 ? reason != 2 ? reason != 3 ? reason != 4 ? reason != 5 ? "?" : "INTERNAL" : "REMOVE" : "SKIP" : "SEEK_ADJUSTMENT" : "SEEK" : "AUTO_TRANSITION";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasHlsMetadataEntry(q801 trackGroup) {
        w820 w820Var;
        if (trackGroup.a == 0 || (w820Var = trackGroup.a(0).l) == null) {
            return false;
        }
        for (s820 s820Var : w820Var.a) {
            if (s820Var instanceof jou) {
                return true;
            }
        }
        return false;
    }

    private final void logOnTracksChanged(h42 eventTime, r801 tracks) {
        tje.N(this.backgroundScope, null, null, new CodecReportEventLogger$logOnTracksChanged$1(this, tracks, eventTime, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performLog(sls lazyMessage) {
        RecordLogger.log$default(this.recordLogger, 0L, lazyMessage, 1, null);
    }

    @Override // defpackage.ub10
    public tb10 create() {
        return this;
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(h42 h42Var, ue3 ue3Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioCodecError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDecoderReleased(h42 h42Var, String str) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioInputFormatChanged(h42 h42Var, androidx.media3.common.a aVar, qyg qygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioPositionAdvancing(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioSinkError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackInitialized(h42 h42Var, ah3 ah3Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioTrackReleased(h42 h42Var, ah3 ah3Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAudioUnderrun(h42 h42Var, int i, long j, long j2) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(h42 h42Var, vxc0 vxc0Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onBandwidthEstimate(h42 h42Var, int i, long j, long j2) {
    }

    @Override // defpackage.tb10
    public void onCreated(fc10 state) {
        tje.N(this.backgroundScope, null, null, new CodecReportEventLogger$onCreated$1(state, this, null), 3);
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, List list) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onCues(h42 h42Var, rdf rdfVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(h42 h42Var, xaj xajVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(h42 h42Var, int i, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDownstreamFormatChanged(h42 h42Var, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysLoaded(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysRemoved(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmKeysRestored(h42 h42Var) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionAcquired(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionManagerError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDrmSessionReleased(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onDroppedVideoFrames(h42 h42Var, int i, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onEvents(zxc0 zxc0Var, i42 i42Var) {
    }

    @Override // defpackage.tb10
    public void onExecuting(bc10 state) {
        tje.N(this.backgroundScope, null, null, new CodecReportEventLogger$onExecuting$1(this, state, null), 3);
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadCanceled(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadCompleted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadError(h42 h42Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var, int i) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(h42 h42Var, boolean z) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    public void onMediaItemTransition(h42 eventTime, fe10 mediaItem, int reason) {
        tje.N(this.backgroundScope, null, null, new CodecReportEventLogger$onMediaItemTransition$1(this, eventTime, mediaItem, reason, null), 3);
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onMetadata(h42 h42Var, w820 w820Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(h42 h42Var, lxc0 lxc0Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackStateChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerError(h42 h42Var, PlaybackException playbackException) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(h42 h42Var, PlaybackException playbackException) {
    }

    @Override // defpackage.j42
    public void onPlayerReleased(h42 eventTime) {
        this.taskQueue.l(null);
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(h42 h42Var, boolean z, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    @Override // defpackage.j42
    public void onPositionDiscontinuity(h42 eventTime, yxc0 oldPosition, yxc0 newPosition, int reason) {
        tje.N(this.backgroundScope, null, null, new CodecReportEventLogger$onPositionDiscontinuity$1(this, eventTime, oldPosition, newPosition, reason, null), 3);
    }

    @Override // defpackage.tb10
    public void onReleased(cc10 state) {
        tje.N(this.backgroundScope, null, null, new CodecReportEventLogger$onReleased$1(state, this, null), 3);
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame(h42 h42Var, Object obj, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onRendererReadyChanged(h42 h42Var, int i, int i2, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(h42 h42Var, int i) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(h42 h42Var, long j) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(h42 h42Var, long j) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekStarted(h42 h42Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onShuffleModeChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(h42 h42Var, boolean z) {
    }

    @Override // defpackage.tb10
    public void onStopped(gc10 state) {
        tje.N(this.backgroundScope, null, null, new CodecReportEventLogger$onStopped$1(this, state, null), 3);
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(h42 h42Var, int i, int i2) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onTimelineChanged(h42 h42Var, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(h42 h42Var, r001 r001Var) {
    }

    @Override // defpackage.j42
    public void onTracksChanged(h42 eventTime, r801 tracks) {
        logOnTracksChanged(eventTime, tracks);
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onUpstreamDiscarded(h42 h42Var, he10 he10Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoCodecError(h42 h42Var, Exception exc) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDecoderReleased(h42 h42Var, String str) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoDisabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoEnabled(h42 h42Var, kyg kygVar) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoFrameProcessingOffset(h42 h42Var, long j, int i) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoInputFormatChanged(h42 h42Var, androidx.media3.common.a aVar, qyg qygVar) {
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, int i, int i2, int i3, float f) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
    }

    @Override // defpackage.j42
    public /* bridge */ /* synthetic */ void onVolumeChanged(h42 h42Var, float f) {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/report/CodecReportEventLogger$Companion;", "", "<init>", "()V", "Ljava/text/NumberFormat;", "TIME_FORMAT$delegate", "Li3y;", "getTIME_FORMAT", "()Ljava/text/NumberFormat;", "TIME_FORMAT", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final NumberFormat getTIME_FORMAT() {
            return (NumberFormat) CodecReportEventLogger.TIME_FORMAT$delegate.getValue();
        }

        private Companion() {
        }
    }

    @Override // defpackage.j42
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(h42 h42Var, int i) {
    }
}
