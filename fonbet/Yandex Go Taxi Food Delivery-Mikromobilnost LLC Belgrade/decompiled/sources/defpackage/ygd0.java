package defpackage;

import com.yandex.plus.pay.api.model.FamilyRole;
import com.yandex.plus.pay.api.model.Feature;
import com.yandex.plus.pay.api.model.PlusPayUserStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public final class ygd0 {
    public static PlusPayUserStatus a(rt21 rt21Var) {
        FamilyRole familyRole;
        long j = rt21Var.a;
        String str = rt21Var.b;
        int i = xgd0.a[rt21Var.c.ordinal()];
        if (i == 1) {
            familyRole = FamilyRole.PARENT;
        } else if (i == 2) {
            familyRole = FamilyRole.CHILD;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            familyRole = FamilyRole.NONE;
        }
        FamilyRole familyRole2 = familyRole;
        List<rkp> list = rt21Var.d;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (rkp rkpVar : list) {
            arrayList.add(new Feature(new Date(rkpVar.a), rkpVar.b));
        }
        return new PlusPayUserStatus(j, str, familyRole2, arrayList);
    }
}
