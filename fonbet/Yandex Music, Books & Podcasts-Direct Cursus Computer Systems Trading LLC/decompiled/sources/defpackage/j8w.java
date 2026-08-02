package defpackage;

import androidx.compose.ui.platform.a;
import com.yandex.music.design.components.button.YandexBooksGradientViewButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final /* synthetic */ class j8w implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ YandexBooksGradientViewButton b;

    public /* synthetic */ j8w(YandexBooksGradientViewButton yandexBooksGradientViewButton) {
        this.b = yandexBooksGradientViewButton;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        YandexBooksGradientViewButton yandexBooksGradientViewButton = this.b;
        hq5 hq5Var = (hq5) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                int i2 = YandexBooksGradientViewButton.j;
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    String M = rvf.M(R.string.bookmate_unavailable_bottom_sheet_button, oq5Var);
                    boolean h = oq5Var.h(yandexBooksGradientViewButton);
                    Object K = oq5Var.K();
                    if (h || K == gq5.a) {
                        K = new dxv(11, yandexBooksGradientViewButton);
                        oq5Var.k0(K);
                    }
                    y7g.c(M, (Function0) K, a.a(vci.a, "bookmate_unavailable_bottom_sheet_button"), null, null, 0.0f, oq5Var, 384, 56);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                num.getClass();
                int i3 = YandexBooksGradientViewButton.j;
                yandexBooksGradientViewButton.j(rvf.R(1), hq5Var);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ j8w(YandexBooksGradientViewButton yandexBooksGradientViewButton, int i) {
        this.b = yandexBooksGradientViewButton;
    }
}
