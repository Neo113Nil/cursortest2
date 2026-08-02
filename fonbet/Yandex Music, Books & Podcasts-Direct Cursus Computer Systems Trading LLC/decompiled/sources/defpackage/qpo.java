package defpackage;

import android.widget.TextView;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.yandex.payment.sdk.ui.challenger.SbpChallengerActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class qpo extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ SbpChallengerActivity s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpo(SbpChallengerActivity sbpChallengerActivity, int i) {
        super(1);
        this.r = i;
        this.s = sbpChallengerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        SbpChallengerActivity sbpChallengerActivity = this.s;
        switch (i) {
            case 0:
                nxi nxiVar = (nxi) obj;
                if (Intrinsics.d(nxiVar, nxi.a)) {
                    int i2 = SbpChallengerActivity.f;
                    sbpChallengerActivity.setResult(1000);
                    sbpChallengerActivity.finish();
                } else if (Intrinsics.d(nxiVar, nxi.b)) {
                    SbpChallengerActivity.j(sbpChallengerActivity, false);
                } else if (Intrinsics.d(nxiVar, nxi.d)) {
                    SbpChallengerActivity.j(sbpChallengerActivity, true);
                }
                break;
            default:
                hqo hqoVar = (hqo) obj;
                if (hqoVar instanceof cqo) {
                    int i3 = ((cqo) hqoVar).a;
                    int i4 = SbpChallengerActivity.f;
                    ((TextView) sbpChallengerActivity.l().d).setText(i3);
                    sbpChallengerActivity.m(true);
                } else {
                    if (hqoVar instanceof fqo ? true : hqoVar instanceof eqo) {
                        int i5 = SbpChallengerActivity.f;
                        sbpChallengerActivity.m(false);
                        y supportFragmentManager = sbpChallengerActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        a aVar = new a(supportFragmentManager);
                        aVar.e(R.id.fragmentContainer, new spo(), null);
                        aVar.j();
                    } else if (hqoVar instanceof dqo) {
                        int i6 = SbpChallengerActivity.f;
                        sbpChallengerActivity.setResult(1000);
                        sbpChallengerActivity.finish();
                    } else if (hqoVar instanceof gqo) {
                        sbpChallengerActivity.finish();
                    }
                }
                break;
        }
        return Unit.a;
    }
}
