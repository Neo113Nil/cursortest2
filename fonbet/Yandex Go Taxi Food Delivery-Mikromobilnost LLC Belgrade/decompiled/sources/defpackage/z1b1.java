package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;
import com.ybsdk.widgets.common.autotopup.state.AutoTopupType;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;

/* loaded from: classes3.dex */
public abstract class z1b1 {
    public static final qdz a(zuo0 zuo0Var) {
        List f = zuo0Var.f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : f) {
            if (obj instanceof qdz) {
                arrayList.add(obj);
            }
        }
        return (qdz) a.R(arrayList);
    }

    public static final boolean b(int i) {
        return i / 100 == 2 || i == 304 || i == 301 || i == 302;
    }

    public static final AutoTopupType c(ArrayList arrayList) {
        pln plnVar = (pln) a.R(arrayList);
        if (plnVar != null) {
            int i = kv3.a[plnVar.a.ordinal()];
            if (i == 1) {
                return AutoTopupType.THRESHOLD;
            }
            if (i == 2) {
                return AutoTopupType.AMOUNT;
            }
            if (i != 3) {
                w511.b();
                return null;
            }
        }
        return null;
    }

    public static final r24 d(nr3 nr3Var, String str) {
        SettingStatus settingStatus = SettingStatus.ENABLED;
        Locale locale = tm60.a;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal g = tm60.g(str);
        if (g != null) {
            bigDecimal = g;
        }
        return new r24(settingStatus, new MoneyEntity(bigDecimal, tm60.e(nr3Var.b.getCurrency()).getIso(), str));
    }

    public static final s24 e(b24 b24Var, String str, String str2) {
        SettingStatus settingStatus = SettingStatus.ENABLED;
        Locale locale = tm60.a;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        BigDecimal g = tm60.g(str);
        if (g == null) {
            g = bigDecimal;
        }
        MoneyEntity moneyEntity = new MoneyEntity(g, tm60.e(b24Var.b.getCurrency()).getIso(), str);
        AutoTopupType c = c(b24Var.d.g);
        BigDecimal g2 = tm60.g(str2);
        if (g2 != null) {
            bigDecimal = g2;
        }
        return new s24(settingStatus, c, moneyEntity, new MoneyEntity(bigDecimal, tm60.e(b24Var.c.getCurrency()).getIso(), str2));
    }

    public static final r24 f(nr3 nr3Var) {
        SettingStatus settingStatus = nr3Var.a ? SettingStatus.ENABLED : SettingStatus.DISABLED;
        MoneyEntity moneyEntity = nr3Var.b;
        Locale locale = tm60.a;
        return new r24(settingStatus, MoneyEntity.copy$default(moneyEntity, null, null, tm60.b(moneyEntity.getAmount()), 3, null));
    }

    public static final s24 g(b24 b24Var) {
        SettingStatus settingStatus = b24Var.a ? SettingStatus.ENABLED : SettingStatus.DISABLED;
        MoneyEntity moneyEntity = b24Var.b;
        Locale locale = tm60.a;
        MoneyEntity copy$default = MoneyEntity.copy$default(moneyEntity, null, null, tm60.b(moneyEntity.getAmount()), 3, null);
        MoneyEntity moneyEntity2 = b24Var.c;
        return new s24(settingStatus, c(b24Var.d.g), copy$default, MoneyEntity.copy$default(moneyEntity2, null, null, tm60.b(moneyEntity2.getAmount()), 3, null));
    }
}
