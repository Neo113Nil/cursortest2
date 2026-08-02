package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorCardType;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes12.dex */
public final class xn1 {
    public final b1 a;
    public final dei0 b;

    public xn1(b1 b1Var, dei0 dei0Var) {
        this.a = b1Var;
        this.b = dei0Var;
    }

    public final void a(qo1 qo1Var, zp1 zp1Var) {
        List list;
        up1 i = zp1Var.i();
        do1 do1Var = (i == null || (list = i.b) == null) ? null : (do1) a.S(zp1Var.a, list);
        if (do1Var == null) {
            return;
        }
        String str = qo1Var.c;
        if (str == null) {
            str = Constants.DEEPLINK;
        }
        int i2 = zp1Var.a + 1;
        String e = qqa1.e(do1Var);
        String g = qqa1.g(do1Var);
        String d = qqa1.d(do1Var);
        AIWidgetAnalytics$TextsEvaluatorCardType f = qqa1.f(do1Var);
        String str2 = qo1Var.a;
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        if (str2 != null) {
            hashMap.put("batch_id", str2);
        }
        hashMap.put("card_num", Integer.valueOf(i2));
        hashMap.put("card_text", e);
        hashMap.put("shortcut_text", g);
        hashMap.put("campaign_id", d);
        hashMap.put("card_type", f.getEventValue());
        b1Var.a.a("AIWidget.TextsEvaluatorCard.Shown", hashMap, 1, new HashMap());
    }

    public final void b(qo1 qo1Var, zp1 zp1Var, int i) {
        String str = qo1Var.c;
        if (str == null) {
            str = Constants.DEEPLINK;
        }
        int j = zp1Var.j();
        up1 i2 = zp1Var.i();
        int i3 = (i2 != null ? i2.g : 0) + j;
        int j2 = zp1Var.j();
        up1 i4 = zp1Var.i();
        int i5 = i4 != null ? i4.g : 0;
        String str2 = qo1Var.a;
        b1 b1Var = this.a;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        if (str2 != null) {
            hashMap.put("batch_id", str2);
        }
        b64.B(i3, hashMap, "cards_count", j2, "onboarding_cards_count");
        hashMap.put("evaluation_cards_count", Integer.valueOf(i5));
        hashMap.put("time_spent_ms", Integer.valueOf(i));
        b1Var.a.a("AIWidget.TextsEvaluator.Finished", hashMap, 1, new HashMap());
    }
}
