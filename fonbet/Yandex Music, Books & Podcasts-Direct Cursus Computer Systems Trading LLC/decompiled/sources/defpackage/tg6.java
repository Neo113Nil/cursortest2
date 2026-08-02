package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class tg6 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ tg6(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj;
                if (function1 != null) {
                    function1.invoke(context);
                }
                break;
            case 1:
                Object V = x97.V(dm6.b(), new qba(context, null, ((Boolean) obj).booleanValue()), continuation);
                if (V != nm6.a) {
                    break;
                }
                break;
            case 2:
                gge ggeVar = (gge) obj;
                if (!Intrinsics.d(ggeVar, fge.a)) {
                    if (!Intrinsics.d(ggeVar, dge.a)) {
                        if (!Intrinsics.d(ggeVar, ege.a)) {
                            b6e.s();
                            break;
                        } else {
                            o30 o30Var = new o30(context);
                            o30Var.a(R.string.payment_error_msg);
                            o30Var.b(R.string.payment_error_title);
                            o30Var.setPositiveButton(R.string.btn_continue, new ufe()).create().show();
                        }
                    } else {
                        y5g.n0(context, R.string.restore_purchases_empty, 0);
                    }
                } else {
                    y5g.n0(context, R.string.restore_purchases_request_sent, 0);
                }
                break;
            default:
                if (!Intrinsics.d((nck) obj, nck.a)) {
                    b6e.s();
                    break;
                } else {
                    y5g.n0(context, R.string.pay_offers_block_success_selected, 0);
                    break;
                }
        }
        return null;
    }
}
