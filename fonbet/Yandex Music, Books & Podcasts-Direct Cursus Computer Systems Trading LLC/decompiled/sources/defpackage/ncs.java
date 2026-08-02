package defpackage;

import android.view.inputmethod.BaseInputConnection;
import android.widget.FrameLayout;
import com.yandex.plus.di.e;
import com.yandex.plus.pay.ui.core.debug.internal.ui.info.g;
import com.yandex.plus.pay.ui.core.debug.internal.ui.log.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.m;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.closing.c;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.d;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.b;
import com.yandex.pulse.metrics.o;
import java.math.BigInteger;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ncs extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ncs(int i, Object obj) {
        super(0);
        this.r = i;
        this.s = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.r) {
            case 0:
                return new BaseInputConnection(((ocs) this.s).a, false);
            case 1:
                return new wpe(((aqe) this.s).a());
            case 2:
                ees eesVar = (ees) this.s;
                eesVar.z = null;
                neg.w(eesVar);
                h4a.z(eesVar);
                vq1.Z(eesVar);
                return Boolean.TRUE;
            case 3:
                ((mgs) this.s).c();
                return Unit.a;
            case 4:
                ((ywg) this.s).invoke();
                return Unit.a;
            case 5:
                ((rls) this.s).I.invoke(Boolean.valueOf(!r0.H));
                return Unit.a;
            case 6:
                FrameLayout frameLayout = (FrameLayout) this.s;
                frameLayout.getClass();
                frameLayout.setVisibility(8);
                return Unit.a;
            case 7:
                return Float.valueOf(((Number) ((qxg) this.s).getValue()).floatValue());
            case 8:
                bn6 bn6Var = new bn6();
                hkn hknVar = new hkn(bn6Var);
                yot yotVar = (yot) this.s;
                yotVar.a(hknVar);
                hknVar.flush();
                long j = bn6Var.a;
                Iterator it = yotVar.a.values().iterator();
                if (it.hasNext()) {
                    throw hrg.j(it);
                }
                return Long.valueOf(j);
            case 9:
                pzt pztVar = (pzt) this.s;
                int i = pztVar.k;
                u6k u6kVar = pztVar.h;
                if (i == u6kVar.h()) {
                    u6kVar.i(u6kVar.h() + 1);
                }
                return Unit.a;
            case 10:
                s0u s0uVar = (s0u) this.s;
                return BigInteger.valueOf(s0uVar.a).shiftLeft(32).or(BigInteger.valueOf(s0uVar.b)).shiftLeft(32).or(BigInteger.valueOf(s0uVar.c));
            case 11:
                ((Function0) ((xqn) this.s).a).invoke();
                return Unit.a;
            case 12:
                return "recoverStrategies = ".concat(CollectionsKt.X(((xq5) this.s).a, null, null, null, zyt.y0, 31));
            case 13:
                return (kfu) ((e) this.s).invoke();
            case 14:
                return (kfu) ((e) this.s).invoke();
            case 15:
                return (com.yandex.plus.pay.ui.core.debug.internal.ui.form.e) this.s;
            case 16:
                return (kfu) ((ncs) this.s).invoke();
            case 17:
                return (g) this.s;
            case 18:
                return (kfu) ((ncs) this.s).invoke();
            case 19:
                return (h) this.s;
            case 20:
                return (kfu) ((ncs) this.s).invoke();
            case 21:
                return (kfu) ((m) this.s).invoke();
            case 22:
                return (kfu) ((m) this.s).invoke();
            case 23:
                return (kfu) ((c) this.s).invoke();
            case 24:
                return (kfu) ((c) this.s).invoke();
            case 25:
                return (kfu) ((d) this.s).invoke();
            case 26:
                return (kfu) ((d) this.s).invoke();
            case 27:
                return (kfu) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.c) this.s).invoke();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return (kfu) ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.counter_offers.c) this.s).invoke();
            default:
                return (kfu) ((b) this.s).invoke();
        }
    }
}
