package com.yandex.passport.internal.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.passport.R;
import com.yandex.passport.internal.entities.s;
import defpackage.k30;
import defpackage.o30;
import defpackage.xr6;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class i {
    public final d a;
    public com.yandex.passport.legacy.lx.j b;

    public i(d dVar) {
        this.a = dVar;
    }

    public final void a(Context context) {
        o30 o30Var = new o30(context);
        o30Var.b(R.string.passport_debug_information_title);
        k30 k30Var = o30Var.a;
        k30Var.m = false;
        d dVar = this.a;
        PackageManager packageManager = dVar.b;
        String str = dVar.a;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 2;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            String str2 = packageManager.getPackageInfo(str, 8).versionName;
            float f = applicationInfo.metaData.getFloat("com.yandex.auth.VERSION", -1.0f);
            int i2 = applicationInfo.metaData.getInt("com.yandex.auth.INTERNAL_VERSION", -1);
            int i3 = applicationInfo.metaData.getInt("com.yandex.auth.INTERNAL_BUILD_NUMBER", -1);
            String valueOf = i3 == Integer.MAX_VALUE ? "local build" : String.valueOf(i3);
            byte[] bArr = s.c;
            s B = com.yandex.plus.core.network.api.utils.a.B(packageManager, str);
            if (i2 != -1) {
                f = i2;
            }
            SpannableString spannableString = new SpannableString(packageManager.getApplicationLabel(applicationInfo));
            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 17);
            SpannableString spannableString2 = new SpannableString(str);
            spannableString2.setSpan(new StyleSpan(2), 0, str.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) StringUtil.LF).append((CharSequence) spannableString2).append((CharSequence) StringUtil.LF).append((CharSequence) String.format(Locale.US, "Version: %s (AM %.2f [%s])%nSignature: %s%n", str2, Float.valueOf(f / 100.0f), valueOf, B.d() ? "Yandex" : B.c() ? "Development" : "Unknown"));
        } catch (PackageManager.NameNotFoundException e) {
            com.yandex.passport.legacy.a.e(6, "Package not found", e);
            spannableStringBuilder = spannableStringBuilder.append((CharSequence) "Something went very wrong here.");
        }
        k30Var.f = spannableStringBuilder;
        k30Var.o = new e();
        o30 positiveButton = o30Var.setPositiveButton(R.string.passport_thank_you_button, new f());
        int i4 = R.string.passport_debug_more_information;
        xr6 xr6Var = new xr6(i, this, context);
        k30 k30Var2 = positiveButton.a;
        k30Var2.k = k30Var2.a.getText(i4);
        k30Var2.l = xr6Var;
        positiveButton.create().show();
    }
}
