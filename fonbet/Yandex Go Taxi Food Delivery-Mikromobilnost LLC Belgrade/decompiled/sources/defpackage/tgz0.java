package defpackage;

import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.response.TipsVariant;
import com.yandex.go.tips.ui.TipItemUiState$ItemType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class tgz0 {
    public final zuj0 a;
    public final ine0 b;
    public final vze0 c;
    public final xdf d;

    public tgz0(zuj0 zuj0Var, ine0 ine0Var, vze0 vze0Var, xdf xdfVar) {
        this.a = zuj0Var;
        this.b = ine0Var;
        this.c = vze0Var;
        this.d = xdfVar;
    }

    public final ArrayList a(int i) {
        String valueOf = String.valueOf(i);
        List<TipsVariant.TipsChoice> a = TipsVariant.f.a();
        ArrayList arrayList = new ArrayList();
        for (TipsVariant.TipsChoice tipsChoice : a) {
            jfz0 b = b(tipsChoice, null, jl40.l(tipsChoice.a(), valueOf) && tipsChoice.a == TipsType.PERCENT);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public final jfz0 b(TipsVariant.TipsChoice tipsChoice, pze0 pze0Var, boolean z) {
        String a;
        ief iefVar;
        TipsType tipsType = tipsChoice.a;
        String str = null;
        if (tipsType == null || (a = tipsChoice.a()) == null) {
            return null;
        }
        String c = c(tipsType, a, pze0Var);
        int i = kyh0.tips_zero_tip_value;
        zuj0 zuj0Var = this.a;
        if ((jl40.l(c, ((avj0) zuj0Var).h(i)) || tipsType != TipsType.FLAT) && pze0Var != null && (iefVar = pze0Var.d) != null) {
            str = gwk0.h(iefVar).a;
        }
        return new jfz0(tipsType, c, a, z, TipItemUiState$ItemType.VALUE, str, tipsType == TipsType.FLAT ? new okz0(((avj0) zuj0Var).b(usg0.text_tips_text_size)) : nkz0.a);
    }

    public final String c(TipsType tipsType, String str, pze0 pze0Var) {
        ief iefVar;
        zuj0 zuj0Var = this.a;
        if (str == null) {
            return ((avj0) zuj0Var).h(kyh0.tips_zero_tip_value);
        }
        int i = tipsType == null ? -1 : sgz0.a[tipsType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return ((avj0) zuj0Var).h(kyh0.tips_zero_tip_value);
            }
            int parseInt = Integer.parseInt(str);
            return parseInt == 0 ? ((avj0) zuj0Var).h(kyh0.tips_zero_tip_value) : ((avj0) zuj0Var).i(kyh0.tip_percent_format, Integer.valueOf(parseInt));
        }
        if (str.length() == 0 || jl40.j(Float.valueOf(Float.parseFloat(str)), 0.0f)) {
            return ((avj0) zuj0Var).h(kyh0.tips_zero_tip_value);
        }
        return this.d.c((pze0Var == null || (iefVar = pze0Var.d) == null) ? null : gwk0.h(iefVar), str, false);
    }
}
