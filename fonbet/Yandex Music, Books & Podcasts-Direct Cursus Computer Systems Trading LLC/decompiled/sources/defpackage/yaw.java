package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.data.DecoderData;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.VideoType;

/* loaded from: classes6.dex */
public final class yaw extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yaw(int i, Object obj, Object obj2, Object obj3) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                m7l m7lVar = (m7l) obj;
                DecoderData decoderData = (DecoderData) this.u;
                m7lVar.getClass();
                cbw cbwVar = (cbw) this.s;
                PlaybackStats playbackStats = (PlaybackStats) this.t;
                m7lVar.e = Boolean.valueOf(cbw.N(playbackStats));
                Long valueOf = Long.valueOf(playbackStats.getLiveOffset());
                if (!cbw.N(playbackStats)) {
                    valueOf = null;
                }
                m7lVar.b = valueOf != null ? valueOf.longValue() : -9223372036854775807L;
                Long valueOf2 = Long.valueOf(playbackStats.getTargetLiveOffset());
                if (!cbw.N(playbackStats)) {
                    valueOf2 = null;
                }
                m7lVar.c = valueOf2 != null ? valueOf2.longValue() : -9223372036854775807L;
                long windowDuration = playbackStats.getWindowDuration();
                Long valueOf3 = Long.valueOf(windowDuration);
                if (windowDuration == -9223372036854775807L) {
                    valueOf3 = null;
                }
                m7lVar.j = valueOf3 != null ? valueOf3.longValue() : -1L;
                str strVar = cbwVar.e;
                m7lVar.m = v3g.o(strVar.a, strVar.b);
                m7lVar.n = decoderData != null ? decoderData.getVideoDecoder() : null;
                m7lVar.o = decoderData != null ? decoderData.getAudioDecoder() : null;
                m7lVar.p = (playbackStats.getVideoType() == VideoType.EVENT || playbackStats.getVideoType() == VideoType.LIVE) ? Long.valueOf(playbackStats.getLiveOffset()) : null;
                break;
            default:
                ((ii) this.s).invoke(lg3.N((pz9) this.t, (xzb) this.u));
                break;
        }
        return Unit.a;
    }
}
