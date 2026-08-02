package com.yandex.plus.pay.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.yandex.plus.metrica.utils.i;
import com.yandex.plus.pay.api.model.SimOperatorInfo;
import defpackage.b0o;
import defpackage.b6e;
import defpackage.bse;
import defpackage.btf;
import defpackage.d0o;
import defpackage.jyr;
import defpackage.l3o;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.ukn;
import defpackage.z7o;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class c implements bse {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final com.yandex.plus.core.locale.a e;
    public final i f;
    public final d g;
    public final com.yandex.plus.core.strings.a h;
    public final jyr i;
    public final jyr j;
    public final DecimalFormat k;

    public c(Context context, String str, String str2, String str3, com.yandex.plus.core.locale.a aVar, i iVar, d dVar, com.yandex.plus.core.strings.a aVar2) {
        context.getClass();
        aVar.getClass();
        iVar.getClass();
        aVar2.getClass();
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = aVar;
        this.f = iVar;
        this.g = dVar;
        this.h = aVar2;
        final int i = 0;
        this.i = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.network.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        c cVar = this.b;
                        Context context2 = cVar.a;
                        SimOperatorInfo a = cVar.g.a();
                        StringBuilder sb = new StringBuilder(250);
                        sb.append("os=Android; os_version=");
                        String str4 = Build.VERSION.RELEASE;
                        str4.getClass();
                        sb.append(c.a(str4));
                        sb.append("; manufacturer=");
                        String str5 = Build.MANUFACTURER;
                        str5.getClass();
                        sb.append(c.a(str5));
                        sb.append("; model=");
                        String str6 = Build.MODEL;
                        str6.getClass();
                        sb.append(c.a(str6));
                        sb.append("; clid=");
                        jyr jyrVar = cVar.j;
                        String str7 = ((b) jyrVar.getValue()).c;
                        if (str7 == null) {
                            str7 = "";
                        }
                        sb.append(str7);
                        sb.append("; device_id=");
                        sb.append(((b) jyrVar.getValue()).b);
                        sb.append("; uuid=");
                        sb.append(((b) jyrVar.getValue()).a);
                        sb.append("; display_size=");
                        sb.append(cVar.k.format(Float.valueOf(com.yandex.plus.home.common.utils.a.c(context2))));
                        sb.append("; dpi=");
                        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                        displayMetrics.getClass();
                        sb.append(displayMetrics.densityDpi);
                        String mcc = a.getMcc();
                        if (StringsKt.U(mcc)) {
                            mcc = null;
                        }
                        if (mcc != null) {
                            sb.append("; mcc=".concat(mcc));
                        }
                        String mnc = a.getMnc();
                        String str8 = StringsKt.U(mnc) ? null : mnc;
                        if (str8 != null) {
                            sb.append("; mnc=".concat(str8));
                        }
                        return sb.toString();
                    default:
                        c cVar2 = this.b;
                        i iVar2 = cVar2.f;
                        String b = iVar2.b();
                        if (b == null) {
                            b = "";
                        }
                        String a2 = iVar2.a();
                        return new b(b, a2 != null ? a2 : "", cVar2.c);
                }
            }
        });
        final int i2 = 1;
        this.j = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.internal.network.a
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        c cVar = this.b;
                        Context context2 = cVar.a;
                        SimOperatorInfo a = cVar.g.a();
                        StringBuilder sb = new StringBuilder(250);
                        sb.append("os=Android; os_version=");
                        String str4 = Build.VERSION.RELEASE;
                        str4.getClass();
                        sb.append(c.a(str4));
                        sb.append("; manufacturer=");
                        String str5 = Build.MANUFACTURER;
                        str5.getClass();
                        sb.append(c.a(str5));
                        sb.append("; model=");
                        String str6 = Build.MODEL;
                        str6.getClass();
                        sb.append(c.a(str6));
                        sb.append("; clid=");
                        jyr jyrVar = cVar.j;
                        String str7 = ((b) jyrVar.getValue()).c;
                        if (str7 == null) {
                            str7 = "";
                        }
                        sb.append(str7);
                        sb.append("; device_id=");
                        sb.append(((b) jyrVar.getValue()).b);
                        sb.append("; uuid=");
                        sb.append(((b) jyrVar.getValue()).a);
                        sb.append("; display_size=");
                        sb.append(cVar.k.format(Float.valueOf(com.yandex.plus.home.common.utils.a.c(context2))));
                        sb.append("; dpi=");
                        DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                        displayMetrics.getClass();
                        sb.append(displayMetrics.densityDpi);
                        String mcc = a.getMcc();
                        if (StringsKt.U(mcc)) {
                            mcc = null;
                        }
                        if (mcc != null) {
                            sb.append("; mcc=".concat(mcc));
                        }
                        String mnc = a.getMnc();
                        String str8 = StringsKt.U(mnc) ? null : mnc;
                        if (str8 != null) {
                            sb.append("; mnc=".concat(str8));
                        }
                        return sb.toString();
                    default:
                        c cVar2 = this.b;
                        i iVar2 = cVar2.f;
                        String b = iVar2.b();
                        if (b == null) {
                            b = "";
                        }
                        String a2 = iVar2.a();
                        return new b(b, a2 != null ? a2 : "", cVar2.c);
                }
            }
        });
        this.k = new DecimalFormat("0.0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                sb.append(charAt);
            } else {
                Locale locale = Locale.US;
                String format = String.format(locale, "\\U%04X", Arrays.copyOf(new Object[]{Integer.valueOf(charAt)}, 1));
                locale.getClass();
                String lowerCase = format.toLowerCase(locale);
                lowerCase.getClass();
                sb.append(lowerCase);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d5  */
    @Override // defpackage.bse
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l3o b(ukn uknVar) {
        String str;
        String t7oVar;
        Integer valueOf;
        d0o d0oVar = (d0o) uknVar.i;
        SimOperatorInfo a = this.g.a();
        b0o b = d0oVar.b();
        b.d("Accept", "application/json");
        b.d("Accept-Language", com.yandex.plus.core.locale.b.m(this.e));
        String str2 = this.d;
        if (str2 == null) {
            str2 = "";
        }
        b.d("X-Yandex-Plus-App-Distribution", str2);
        b.d("X-Yandex-Plus-Device", (String) this.i.getValue());
        b.d("X-Yandex-Plus-OperatorData", "mcc=" + a.getMcc() + ";mnc=" + a.getMnc());
        b.d("X-Yandex-Plus-Subservice", this.b);
        int ordinal = this.h.ordinal();
        if (ordinal == 0) {
            str = "yandex";
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            str = "yango";
        }
        b.d("X-Yandex-Plus-Brand", str);
        Context context = this.a;
        context.getClass();
        try {
            r7o r7oVar = z7o.b;
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService(UiModeManager.class);
            valueOf = uiModeManager != null ? Integer.valueOf(uiModeManager.getCurrentModeType()) : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            t7oVar = "MOBILE_ANDROID";
            b.d("X-Yandex-Plus-Checkout-Platform", (String) (z7o.a(t7oVar) == null ? t7oVar : "UNKNOWN"));
            return uknVar.f(b.b());
        }
        if (valueOf.intValue() == 4) {
            t7oVar = "ANDROID_TV";
            b.d("X-Yandex-Plus-Checkout-Platform", (String) (z7o.a(t7oVar) == null ? t7oVar : "UNKNOWN"));
            return uknVar.f(b.b());
        }
        if (valueOf != null) {
            if (valueOf.intValue() == 6) {
                t7oVar = "ANDROID_WEAR";
                b.d("X-Yandex-Plus-Checkout-Platform", (String) (z7o.a(t7oVar) == null ? t7oVar : "UNKNOWN"));
                return uknVar.f(b.b());
            }
        }
        t7oVar = valueOf == null ? "UNKNOWN" : "OTHER";
        b.d("X-Yandex-Plus-Checkout-Platform", (String) (z7o.a(t7oVar) == null ? t7oVar : "UNKNOWN"));
        return uknVar.f(b.b());
    }
}
