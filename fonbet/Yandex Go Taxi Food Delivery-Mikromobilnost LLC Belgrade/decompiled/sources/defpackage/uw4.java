package defpackage;

import com.yandex.go.address.models.Address;
import defpackage.qd0;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public abstract class uw4 implements ze0 {
    public final ud0 a;

    public uw4(ud0 ud0Var) {
        this.a = ud0Var;
    }

    public final cvv d(bvv bvvVar) {
        yu21 D0;
        yu21 D02;
        Address a = bvvVar.a();
        List list = null;
        String str = (a == null || (D02 = a.D0()) == null) ? null : D02.a;
        if (str == null) {
            str = "";
        }
        int length = str.length();
        ud0 ud0Var = this.a;
        if (length == 0) {
            String b = b();
            qd0 a2 = ud0Var.a();
            qd0.a c = a2.c(b);
            str = c != null ? d6z.Y(a2, c.getG()) : null;
            if (str == null) {
                str = "";
            }
        }
        String b2 = b();
        qd0 a3 = ud0Var.a();
        qd0.a c2 = a3.c(b2);
        String Y = c2 != null ? d6z.Y(a3, c2.getG()) : null;
        String str2 = Y != null ? Y : "";
        Address a4 = bvvVar.a();
        if (a4 != null && (D0 = a4.D0()) != null) {
            list = D0.b;
        }
        if (list == null) {
            list = EmptyList.a;
        }
        return new cvv(str, str2, list);
    }

    public final String e() {
        String b = b();
        ud0 ud0Var = this.a;
        qd0 a = ud0Var.a();
        qd0.a c = a.c(b);
        return ud0Var.b(c != null ? d6z.Y(a, c.getD()) : null, ((avj0) ud0Var.a).h(kyh0.add_favorites_screen_no_favorite_type_message));
    }
}
