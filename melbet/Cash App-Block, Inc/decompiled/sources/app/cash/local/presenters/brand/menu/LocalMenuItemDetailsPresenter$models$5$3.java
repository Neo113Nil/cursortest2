package app.cash.local.presenters.brand.menu;

import app.cash.local.primitives.DiscountToken;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class LocalMenuItemDetailsPresenter$models$5$3 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public static final LocalMenuItemDetailsPresenter$models$5$3 INSTANCE$1 = new LocalMenuItemDetailsPresenter$models$5$3(1);
    public static final LocalMenuItemDetailsPresenter$models$5$3 INSTANCE$2 = new LocalMenuItemDetailsPresenter$models$5$3(2);
    public static final LocalMenuItemDetailsPresenter$models$5$3 INSTANCE = new LocalMenuItemDetailsPresenter$models$5$3(0);
    public static final LocalMenuItemDetailsPresenter$models$5$3 INSTANCE$3 = new LocalMenuItemDetailsPresenter$models$5$3(3);

    public /* synthetic */ LocalMenuItemDetailsPresenter$models$5$3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                Integer num = (Integer) obj;
                return Integer.valueOf(num != null ? 1 + num.intValue() : 1);
            case 1:
                String str = ((DiscountToken) obj).value;
                str.getClass();
                return str;
            case 2:
                String str2 = ((DiscountToken) obj).value;
                str2.getClass();
                return str2;
            default:
                Integer num2 = (Integer) obj;
                return Integer.valueOf(num2 != null ? num2.intValue() - 1 : 0);
        }
    }
}
