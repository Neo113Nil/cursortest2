package defpackage;

import android.graphics.LightingColorFilter;
import android.os.Handler;
import android.os.Looper;
import com.yandex.music.shared.radio.domain.commands.b;
import com.yandex.music.shared.radio.domain.commands.c;
import com.yandex.pulse.metrics.o;
import defpackage.k5r;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class hft implements Function0 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        l18 l18Var = l18.b;
        int i2 = 3;
        final int i3 = 1;
        Continuation continuation = null;
        final int i4 = 0;
        switch (i) {
            case 0:
                throw new IllegalStateException("RecognitionUiConfig is not initialized");
            case 1:
                throw new IllegalStateException("RecognitionUiConfig is not initialized");
            case 2:
                throw new IllegalStateException("RecognitionUiConfig is not initialized");
            case 3:
                return new LightingColorFilter(-3355444, 0);
            case 4:
                return new LightingColorFilter(-12303292, 0);
            case 5:
                return new zf6(ern.a(kb6.class), (t9f) null, new t9f[0]);
            case 6:
                return new zf6(ern.a(q2a.class), (t9f) null, new t9f[0]);
            case 7:
                return new zf6(ern.a(q2a.class), (t9f) null, new t9f[0]);
            case 8:
                return new zf6(ern.a(r2a.class), (t9f) null, new t9f[0]);
            case 9:
                return Unit.a;
            case 10:
                return qld.m();
            case 11:
                return "No read permission";
            case 12:
                return "Can't read file data";
            case 13:
                return new Handler(Looper.getMainLooper());
            case 14:
                return new p2m();
            case 15:
                return new r7u(new b(i2, i4, continuation), new Function1() { // from class: com.yandex.music.shared.radio.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i4) {
                            case 0:
                                ((VideoClipRadioQueueCommandsFactory$Skip) obj).getClass();
                                return "skip";
                            case 1:
                                VideoClipRadioQueueCommandsFactory$SetPosition videoClipRadioQueueCommandsFactory$SetPosition = (VideoClipRadioQueueCommandsFactory$SetPosition) obj;
                                videoClipRadioQueueCommandsFactory$SetPosition.getClass();
                                return k5r.i(videoClipRadioQueueCommandsFactory$SetPosition.getPosition(), "set position ");
                            default:
                                ((VideoClipRadioQueueCommandsFactory$Prev) obj).getClass();
                                return "prev";
                        }
                    }
                });
            case 16:
                final int i5 = 2;
                return new r7u(new c(3, null), new Function1() { // from class: com.yandex.music.shared.radio.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i5) {
                            case 0:
                                ((VideoClipRadioQueueCommandsFactory$Skip) obj).getClass();
                                return "skip";
                            case 1:
                                VideoClipRadioQueueCommandsFactory$SetPosition videoClipRadioQueueCommandsFactory$SetPosition = (VideoClipRadioQueueCommandsFactory$SetPosition) obj;
                                videoClipRadioQueueCommandsFactory$SetPosition.getClass();
                                return k5r.i(videoClipRadioQueueCommandsFactory$SetPosition.getPosition(), "set position ");
                            default:
                                ((VideoClipRadioQueueCommandsFactory$Prev) obj).getClass();
                                return "prev";
                        }
                    }
                });
            case 17:
                return new r7u(new b(i2, i3, continuation), new Function1() { // from class: com.yandex.music.shared.radio.domain.commands.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i3) {
                            case 0:
                                ((VideoClipRadioQueueCommandsFactory$Skip) obj).getClass();
                                return "skip";
                            case 1:
                                VideoClipRadioQueueCommandsFactory$SetPosition videoClipRadioQueueCommandsFactory$SetPosition = (VideoClipRadioQueueCommandsFactory$SetPosition) obj;
                                videoClipRadioQueueCommandsFactory$SetPosition.getClass();
                                return k5r.i(videoClipRadioQueueCommandsFactory$SetPosition.getPosition(), "set position ");
                            default:
                                ((VideoClipRadioQueueCommandsFactory$Prev) obj).getClass();
                                return "prev";
                        }
                    }
                });
            case 18:
                return "VideoClipRotorApi";
            case 19:
                return Unit.a;
            case 20:
                Float valueOf = Float.valueOf(0.0f);
                long j = d85.b;
                return y9w.U(new Pair[]{new Pair(valueOf, new d85(d85.b(j, 0.1f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(j, 0.6f, 0.0f, 0.0f, 0.0f, 14)))}, 14);
            case 21:
                return gs6.b;
            case 22:
                jyr jyrVar = xju.e;
                return Boolean.valueOf(((xju) ((byb) l18Var.c(hag.I(byb.class))).b(xju.class)).h());
            case 23:
                return dm6.b.I0(1);
            case 24:
                return Boolean.valueOf(((dku) ((byb) l18Var.c(hag.I(byb.class))).b(dku.class)).h());
            case 25:
                return new lnq();
            case 26:
                return new hft(27);
            case 27:
                return zlu.b;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new wjg(i4, new xjf(23));
            default:
                return gtu.p;
        }
    }

    public /* synthetic */ hft(int i) {
        this.a = i;
    }
}
