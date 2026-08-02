package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.ViewState;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.h;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class sij implements ev31 {
    public final p1b a = new p1b(new vbb[]{new vbb(new ColorModel.Attr(ung0.ybColor_other_shadow), new ViewState[0])});

    public final BottomSheetDialogView.State a(boolean z) {
        Text.Resource h = z ? unr0.h(Text.Companion, dzh0.ybsdk_savings_diff_rate_calendar_notice_close_button_text) : null;
        return new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP), h != null ? new YbButtonView.a(h, null, null, null, null, null, null, false, false, null, 4094) : null, null, BottomSheetDialogView.State.Background.DEFAULT, this.a, null, null, null, new h(new ColorModel.Attr(ung0.ybColor_textIcon_primary), new Text.Resource(dzh0.ybsdk_savings_diff_rate_calendar_notice_title)), 32556);
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        u8j0 u8j0Var = ((eij) obj).a;
        if (u8j0Var instanceof t8j0) {
            return new pij(a(true));
        }
        if (u8j0Var instanceof r8j0) {
            return new qij((bij) ((r8j0) u8j0Var).a, a(true));
        }
        if (u8j0Var instanceof s8j0) {
            return new oij(r501.a(((s8j0) u8j0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534), a(false));
        }
        w511.b();
        return null;
    }
}
