package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorErrorType;
import com.yandex.go.ai_widget.analytics.AIWidgetAnalytics$TextsEvaluatorTappedAction;

/* loaded from: classes12.dex */
public final class tp1 {
    public final xn1 a;
    public final po1 b;

    public tp1(xn1 xn1Var, po1 po1Var) {
        this.a = xn1Var;
        this.b = po1Var;
    }

    public final void a(qo1 qo1Var, zp1 zp1Var, AIWidgetAnalytics$TextsEvaluatorTappedAction aIWidgetAnalytics$TextsEvaluatorTappedAction) {
        xp1 xp1Var = (xp1) ((gci0) zp1Var.w).a.getValue();
        if (!(xp1Var instanceof vp1)) {
            if ((xp1Var instanceof up1) || jl40.l(xp1Var, wp1.a)) {
                return;
            }
            w511.b();
            return;
        }
        vp1 vp1Var = (vp1) xp1Var;
        b1 b1Var = this.a.a;
        String str = qo1Var.c;
        if (str == null) {
            str = Constants.DEEPLINK;
        }
        b1.a(b1Var, str, aIWidgetAnalytics$TextsEvaluatorTappedAction, qo1Var.a, null, null, null, null, null, null, null, null, null, vp1Var.a ? AIWidgetAnalytics$TextsEvaluatorErrorType.NotFound : AIWidgetAnalytics$TextsEvaluatorErrorType.Other, 4088);
    }
}
