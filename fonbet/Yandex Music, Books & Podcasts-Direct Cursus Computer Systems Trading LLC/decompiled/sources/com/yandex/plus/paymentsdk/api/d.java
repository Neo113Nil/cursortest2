package com.yandex.plus.paymentsdk.api;

import com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic.f;
import defpackage.gik;
import defpackage.lmk;
import defpackage.mmk;
import defpackage.tah;
import defpackage.ydr;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new c(R.style.PlusSDK_Theme_PaymentSdk_Dark);
            case 1:
                return new com.yandex.plus.paymentsdk.internal.b();
            case 2:
                return new lmk(mmk.b, false, false, true);
            case 3:
                return new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
            case 4:
                tah.b(new Pair("platform", ConstantDeviceInfo.APP_PLATFORM));
                return new gik();
            case 5:
                return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.b();
            case 6:
                return new f();
            case 7:
                return ydr.a(Boolean.FALSE);
            case 8:
                return com.yandex.plus.bdui.flex.ui.a.a();
            default:
                return com.yandex.plus.webview.internal.contract.impl.loading.a.i;
        }
    }

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
    }
}
