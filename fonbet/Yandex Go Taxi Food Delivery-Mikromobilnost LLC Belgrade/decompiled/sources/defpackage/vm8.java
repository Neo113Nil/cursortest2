package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import com.ybsdk.widgets.common.k;
import com.ybsdk.widgets.common.l;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class vm8 implements ev31 {
    public final Text a;
    public final Text b;

    public vm8(Text text, Text text2) {
        this.a = text;
        this.b = text2;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        km8 km8Var = (km8) obj;
        if (km8Var instanceof fm8) {
            CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = CommunicationFullScreenView$State$Type.DESCRIPTION;
            fm8 fm8Var = (fm8) km8Var;
            rbv f = job1.f(fm8Var.c, new sd8(17));
            Text text = fm8Var.a;
            Text text2 = fm8Var.b;
            Text text3 = this.a;
            if (text3 == null) {
                text3 = unr0.h(Text.Companion, dzh0.ybsdk_card_reissue_digital_confirm_button);
            }
            YbButtonView.a aVar = new YbButtonView.a(text3, null, null, null, null, null, null, false, false, null, 4094);
            Text text4 = this.b;
            if (text4 == null) {
                text4 = unr0.h(Text.Companion, dzh0.ybsdk_card_reissue_digital_cancel_button);
            }
            return new sm8(new vrc(communicationFullScreenView$State$Type, text, null, null, text2, null, null, null, null, f, null, new YbButtonViewGroup.b(null, aVar, new YbButtonView.a(text4, null, null, null, null, null, null, false, false, null, 4094), null, 9), null, 0, 0, null, null, null, 0, false, null, null, null, null, null, null, -4628, 3));
        }
        if (km8Var instanceof hm8) {
            hm8 hm8Var = (hm8) km8Var;
            return new sm8(new vrc(CommunicationFullScreenView$State$Type.DESCRIPTION, hm8Var.a, null, null, hm8Var.b, null, null, null, null, job1.f(hm8Var.c, new sd8(18)), null, new YbButtonViewGroup.b(null, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_card_reissue_digital_confirm_button), null, null, null, null, null, null, false, true, null, 3070), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_reissue_digital_cancel_button), null, null, null, null, null, null, false, false, null, 4094), null, 9), null, 0, 0, null, null, null, 0, false, null, null, null, null, null, null, -4628, 3));
        }
        if ((km8Var instanceof dm8) || (km8Var instanceof gm8)) {
            return new tm8(new k(pc70.a, km8Var.getTitle(), null, km8Var.getMessage(), null, null, null, 196));
        }
        if (km8Var instanceof im8) {
            im8 im8Var = (im8) km8Var;
            return new tm8(new k(new l(OperationProgressView.StatusIcon.SUCCESS), im8Var.a, null, im8Var.b, unr0.h(Text.Companion, dzh0.ybsdk_card_reissue_digital_great_button), null, null, 196));
        }
        if (km8Var instanceof em8) {
            l lVar = new l(OperationProgressView.StatusIcon.ERROR);
            em8 em8Var = (em8) km8Var;
            Throwable th = em8Var.d;
            return new tm8(new k(lVar, gao.f(th, em8Var.a), null, gao.b(th, em8Var.b), null, em8Var.c != null ? unr0.h(Text.Companion, dzh0.ybsdk_common_send_message_to_support) : null, new nbv(txg0.ybsdk_ic_support, null), HProv.PP_CONTAINER_EXTENSION));
        }
        if (km8Var instanceof jm8) {
            jm8 jm8Var = (jm8) km8Var;
            return new tm8(new k(new l(OperationProgressView.StatusIcon.TIMEOUT), jm8Var.a, null, jm8Var.b, unr0.h(Text.Companion, dzh0.ybsdk_card_reissue_good_button), jm8Var.c != null ? new Text.Resource(dzh0.ybsdk_common_send_message_to_support) : null, new nbv(txg0.ybsdk_ic_support, null), HProv.PP_CONTAINER_EXTENSION));
        }
        w511.b();
        return null;
    }
}
