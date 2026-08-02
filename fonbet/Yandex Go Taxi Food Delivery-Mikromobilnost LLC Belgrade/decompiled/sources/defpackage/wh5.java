package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.entities.theme.Theme;
import com.yandex.fintechsdk.flows.payment.kit.api.model.AdditionalSettings;

/* loaded from: classes12.dex */
public final class wh5 implements vh5 {
    public final AdditionalSettings a;
    public final Context b;

    public wh5(AdditionalSettings additionalSettings, Context context) {
        this.a = additionalSettings;
        this.b = context;
    }

    @Override // defpackage.vh5
    public final Integer a() {
        return Integer.valueOf(p0i0.Finsdk_DivKit_Theme);
    }

    @Override // defpackage.vh5
    public final Theme getTheme() {
        boolean c = brb1.c(this.b);
        AdditionalSettings additionalSettings = this.a;
        return additionalSettings.getTheme() != null ? additionalSettings.getTheme() : c ? Theme.NIGHT : Theme.DAY;
    }
}
