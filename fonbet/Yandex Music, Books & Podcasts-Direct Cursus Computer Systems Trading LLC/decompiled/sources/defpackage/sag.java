package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$TerminalReason;

/* loaded from: classes6.dex */
public final class sag extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ mbg s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sag(mbg mbgVar, int i) {
        super(0);
        this.r = i;
        this.s = mbgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                mbg mbgVar = this.s;
                tzn tznVar = mbgVar.x;
                tzn tznVar2 = mbgVar.w;
                if (!tznVar.a() && !mbgVar.y.a() && !tznVar2.a()) {
                    tznVar2.d = Long.valueOf(SystemClock.uptimeMillis());
                }
                break;
            case 1:
                mbg mbgVar2 = this.s;
                tzn tznVar3 = mbgVar2.x;
                if (!tznVar3.a() && !mbgVar2.y.a()) {
                    Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
                    tznVar3.getClass();
                    tznVar3.d = valueOf;
                }
                break;
            default:
                mbg mbgVar3 = this.s;
                tzn tznVar4 = mbgVar3.y;
                Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
                tznVar4.getClass();
                tznVar4.d = valueOf2;
                if (mbgVar3.m) {
                    mbgVar3.b(ListViewTelemetryLogger$TerminalReason.START_PLAYBACK, null);
                }
                break;
        }
        return Unit.a;
    }
}
