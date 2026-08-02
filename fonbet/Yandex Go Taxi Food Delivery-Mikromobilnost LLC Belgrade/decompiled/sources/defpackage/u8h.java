package defpackage;

import kotlin.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes11.dex */
public final class u8h implements qdc {
    public final oic a;
    public final ofg b;
    public final i3y c = a.a(new ybf(23, this));

    public u8h(oic oicVar, ofg ofgVar) {
        this.a = oicVar;
        this.b = ofgVar;
    }

    @Override // defpackage.qdc
    public final Integer a(String str, ThemeStyle themeStyle) {
        my4 my4Var;
        boolean b = this.b.b();
        sy4 sy4Var = (sy4) this.c.getValue();
        sy4Var.getClass();
        int i = ry4.a[themeStyle.ordinal()];
        if (i == 1) {
            my4Var = b ? (my4) sy4Var.d.getValue() : (my4) sy4Var.c.getValue();
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            my4Var = b ? (my4) sy4Var.f.getValue() : (my4) sy4Var.e.getValue();
        }
        idc a = my4Var.a(str);
        if (a != null) {
            return Integer.valueOf(e991.d(a, b));
        }
        return null;
    }
}
