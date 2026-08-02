package defpackage;

import com.yandex.fintechsdk.core.nfc.impl.api.fragment.NfcDialogFragment;
import com.yandex.fintechsdk.entities.ui.BottomSheetMode;
import com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivity;
import defpackage.sls;
import defpackage.y8f;
import kotlin.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class r2a0 {
    public final PaymentKitActivity a;
    public final es31 b;
    public dna c;
    public final es31 e;
    public h2t g;
    public md6 h;
    public NfcDialogFragment i;
    public upr j;
    public final i3y d = a.a(new m2a0(this, 2));
    public final i3y f = a.a(new m2a0(this, 4));

    public r2a0(final PaymentKitActivity paymentKitActivity) {
        this.a = paymentKitActivity;
        this.b = new es31(qoi0.a(x2a0.class), new sls() { // from class: com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivityDelegate$special$$inlined$injectViewModel$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return paymentKitActivity.getViewModelStore();
            }
        }, new p2a0(new m2a0(this, 1), 1), new sls() { // from class: com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivityDelegate$special$$inlined$injectViewModel$3
            final /* synthetic */ sls $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? paymentKitActivity.getDefaultViewModelCreationExtras() : y8fVar;
            }
        });
        this.e = new es31(qoi0.a(t3a0.class), new sls() { // from class: com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivityDelegate$special$$inlined$injectViewModel$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return paymentKitActivity.getViewModelStore();
            }
        }, new q2a0(new m2a0(this, 3), 1), new sls() { // from class: com.yandex.fintechsdk.flows.payment.kit.internal.activity.PaymentKitActivityDelegate$special$$inlined$injectViewModel$6
            final /* synthetic */ sls $extrasProducer = null;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? paymentKitActivity.getDefaultViewModelCreationExtras() : y8fVar;
            }
        });
    }

    public final w2a0 a() {
        return (w2a0) this.d.getValue();
    }

    public final x2a0 b() {
        return (x2a0) this.b.getValue();
    }

    public final t7w c() {
        return (t7w) this.f.getValue();
    }

    public final t3a0 d() {
        return (t3a0) this.e.getValue();
    }

    public final void e() {
        og6 og6Var;
        BottomSheetMode bottomSheetMode = ((a2w) b().b.b.a.getValue()).a;
        BottomSheetMode bottomSheetMode2 = BottomSheetMode.FULLSCREEN;
        if (bottomSheetMode == bottomSheetMode2) {
            return;
        }
        a2w a2wVar = new a2w(bottomSheetMode2, 2);
        r0 r0Var = b().b.a;
        r0Var.getClass();
        r0Var.m(null, a2wVar);
        md6 md6Var = this.h;
        if (md6Var != null && (og6Var = (og6) md6Var.c) != null && !og6Var.l && og6Var.h != null) {
            og6Var.l = true;
            og6Var.b.post(new js4(20, og6Var));
        }
        h2t h2tVar = this.g;
        if (h2tVar != null) {
            ((l2w) h2tVar.a).c();
        }
    }
}
