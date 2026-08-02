package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes6.dex */
public final class zaw extends uif implements Function0 {
    public final /* synthetic */ cbw r;
    public final /* synthetic */ String s;
    public final /* synthetic */ Long t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ PreparingParams v;
    public final /* synthetic */ PlaybackParameters w;
    public final /* synthetic */ f46 x;
    public final /* synthetic */ long y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaw(cbw cbwVar, String str, Long l, boolean z, PreparingParams preparingParams, PlaybackParameters playbackParameters, f46 f46Var, long j, boolean z2) {
        super(0);
        this.r = cbwVar;
        this.s = str;
        this.t = l;
        this.u = z;
        this.v = preparingParams;
        this.w = playbackParameters;
        this.x = f46Var;
        this.y = j;
        this.z = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        znf znfVar = new znf(this.s);
        f46 f46Var = this.x;
        int i = f46Var.a;
        int i2 = f46Var.b;
        PlaybackParameters playbackParameters = this.w;
        this.r.U(znfVar, this.t, this.u, this.v, playbackParameters, i, i2, this.y, null, this.z, playbackParameters.getPrepareWithoutInitCodecs(), playbackParameters.getPreferredH264(), playbackParameters.getDrmParameters());
        return Unit.a;
    }
}
