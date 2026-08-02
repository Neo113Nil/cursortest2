package defpackage;

import android.os.CountDownTimer;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b27 extends CountDownTimer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b27(SbpChallengerActivity sbpChallengerActivity) {
        super(5000L, 1000L);
        this.a = 1;
        this.b = sbpChallengerActivity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Unit unit;
        switch (this.a) {
            case 0:
                c27 c27Var = (c27) this.b;
                CountDownTimer countDownTimer = c27Var.y;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                c27Var.y = null;
                c27Var.v.m(v17.b);
                break;
            case 1:
                SbpChallengerActivity sbpChallengerActivity = (SbpChallengerActivity) this.b;
                sbpChallengerActivity.m(false);
                CountDownTimer countDownTimer2 = sbpChallengerActivity.e;
                if (countDownTimer2 != null) {
                    countDownTimer2.cancel();
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    sbpChallengerActivity.e = null;
                    break;
                }
                break;
            default:
                jqo jqoVar = (jqo) this.b;
                CountDownTimer countDownTimer3 = jqoVar.u;
                if (countDownTimer3 != null) {
                    countDownTimer3.cancel();
                }
                jqoVar.u = null;
                jqoVar.t.m(ypo.a);
                break;
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        switch (this.a) {
            case 0:
                ((c27) this.b).v.m(v17.d);
                break;
            case 1:
                break;
            default:
                ((jqo) this.b).t.m(aqo.a);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b27(long j, bfu bfuVar, int i) {
        super(j, 1000L);
        this.a = i;
        this.b = bfuVar;
    }

    private final void a(long j) {
    }
}
