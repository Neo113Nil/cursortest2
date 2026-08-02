package com.yandex.plus.bdui.plus.checkout.div;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.view.ContextThemeWrapper;
import com.yandex.plus.divkit.api.g;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.TarifficatorBduiScenarioActivity;
import defpackage.btf;
import defpackage.e3o;
import defpackage.jyr;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class e implements g {
    public final ContextThemeWrapper a;
    public final jyr b;
    public final jyr c;
    public final jyr d;

    public e(TarifficatorBduiScenarioActivity tarifficatorBduiScenarioActivity) {
        tarifficatorBduiScenarioActivity.getClass();
        this.a = tarifficatorBduiScenarioActivity;
        final int i = 0;
        this.b = btf.b(new Function0(this) { // from class: com.yandex.plus.bdui.plus.checkout.div.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                e eVar = this.b;
                switch (i2) {
                    case 0:
                        return e.e(eVar.a, R.attr.pay_sdk_fontRegular);
                    case 1:
                        return e.e(eVar.a, R.attr.pay_sdk_fontMedium);
                    default:
                        return e.e(eVar.a, R.attr.pay_sdk_fontBold);
                }
            }
        });
        final int i2 = 1;
        this.c = btf.b(new Function0(this) { // from class: com.yandex.plus.bdui.plus.checkout.div.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        return e.e(eVar.a, R.attr.pay_sdk_fontRegular);
                    case 1:
                        return e.e(eVar.a, R.attr.pay_sdk_fontMedium);
                    default:
                        return e.e(eVar.a, R.attr.pay_sdk_fontBold);
                }
            }
        });
        final int i3 = 2;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.bdui.plus.checkout.div.d
            public final /* synthetic */ e b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                e eVar = this.b;
                switch (i22) {
                    case 0:
                        return e.e(eVar.a, R.attr.pay_sdk_fontRegular);
                    case 1:
                        return e.e(eVar.a, R.attr.pay_sdk_fontMedium);
                    default:
                        return e.e(eVar.a, R.attr.pay_sdk_fontBold);
                }
            }
        });
    }

    public static Typeface e(ContextThemeWrapper contextThemeWrapper, int i) {
        TypedArray obtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{i});
        obtainStyledAttributes.getClass();
        try {
            return e3o.a(contextThemeWrapper, obtainStyledAttributes.getResourceId(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.yandex.plus.divkit.api.g
    public final Typeface a() {
        return (Typeface) this.d.getValue();
    }

    @Override // com.yandex.plus.divkit.api.g
    public final Typeface b() {
        return (Typeface) this.b.getValue();
    }

    @Override // com.yandex.plus.divkit.api.g
    public final Typeface c() {
        return (Typeface) this.b.getValue();
    }

    @Override // com.yandex.plus.divkit.api.g
    public final Typeface d() {
        return (Typeface) this.c.getValue();
    }
}
