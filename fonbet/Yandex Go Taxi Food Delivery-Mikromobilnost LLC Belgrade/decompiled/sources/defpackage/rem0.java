package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class rem0 implements ev31 {
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        fem0 fem0Var = (fem0) obj;
        if (fem0Var instanceof cem0) {
            return new lem0(((cem0) fem0Var).a);
        }
        if (fem0Var instanceof bem0) {
            return nem0.a;
        }
        if (fem0Var instanceof aem0) {
            aem0 aem0Var = (aem0) fem0Var;
            Throwable th = aem0Var.c;
            String str = aem0Var.a;
            Text f = gao.f(th, str != null ? g8e.i(Text.Companion, str) : null);
            String str2 = aem0Var.b;
            return new mem0(new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(f, gao.b(th, str2 != null ? g8e.i(Text.Companion, str2) : null), new g(new nbv(nyg0.ybsdk_ic_error_icon, null), BottomSheetDialogView.State.ImageScale.FIT_START, Integer.valueOf(kp50.r(20)), Integer.valueOf(kp50.r(24)), 8), null, null, null, 120), null, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_common_button_reload), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, 131058));
        }
        if (fem0Var instanceof eem0) {
            b bVar = Text.Companion;
            cx11 cx11Var = ((eem0) fem0Var).a;
            return new oem0(new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(g8e.i(bVar, cx11Var.a), new Text.Constant(cx11Var.b), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(new Text.Constant(cx11Var.c.a), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Constant(cx11Var.d.a), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, 131056));
        }
        if (!(fem0Var instanceof dem0)) {
            w511.b();
            return null;
        }
        b bVar2 = Text.Companion;
        cx11 cx11Var2 = ((dem0) fem0Var).a;
        return new pem0(new BottomSheetDialogView.State(null, null, new YbButtonView.a(g8e.i(bVar2, cx11Var2.d.a), null, null, null, null, null, null, false, true, null, 3070), null, null, null, null, null, null, 131067), cx11Var2);
    }
}
