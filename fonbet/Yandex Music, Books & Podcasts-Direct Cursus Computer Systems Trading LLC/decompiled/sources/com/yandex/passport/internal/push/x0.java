package com.yandex.passport.internal.push;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import com.yandex.passport.internal.report.ye;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import defpackage.s9f;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class x0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ x0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        com.yandex.plus.core.utils.b bVar = com.yandex.plus.core.utils.b.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return ye.b(context);
            case 1:
                return Boolean.valueOf(bVar.a(context).j());
            case 2:
                s9f[] s9fVarArr = WebViewToolbar.A;
                return AnimatorInflater.loadStateListAnimator(context, R.animator.plus_sdk_click_scale_animator);
            case 3:
                s9f[] s9fVarArr2 = WebViewToolbar.A;
                Resources.Theme theme = context.getTheme();
                theme.getClass();
                return Integer.valueOf(com.yandex.plus.bdui.plus.analytics.b.v(R.attr.selectableItemBackgroundBorderless, theme).resourceId);
            case 4:
                context.getClass();
                return Boolean.valueOf(bVar.a(context).j());
            case 5:
                context.getClass();
                Object systemService = context.getSystemService("phone");
                systemService.getClass();
                String simOperator = ((TelephonyManager) systemService).getSimOperator();
                if (simOperator == null) {
                    return null;
                }
                int length = simOperator.length();
                String str = simOperator.length() >= 3 ? simOperator : null;
                String substring = str != null ? str.substring(0, 3) : null;
                if (simOperator.length() < 4) {
                    simOperator = null;
                }
                String substring2 = simOperator != null ? simOperator.substring(3, length) : null;
                if (substring == null || substring2 == null || substring2.length() > 3) {
                    return null;
                }
                return new com.yandex.plus.pay.internal.network.e(substring, substring2);
            default:
                return new com.yandex.plus.pay.ui.common.api.a(context);
        }
    }
}
