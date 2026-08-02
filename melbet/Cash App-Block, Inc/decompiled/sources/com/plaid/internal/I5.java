package com.plaid.internal;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.plaid.link.Plaid;
import com.plaid.link.R;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class I5 {
    public final Application a;

    public I5(Application application) {
        application.getClass();
        this.a = application;
    }

    public final String a() {
        Bundle bundle = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData;
        String string2 = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        Bundle bundle2 = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData;
        String string3 = bundle2 != null ? bundle2.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        if (string3 != null && !StringsKt.isBlank(string3)) {
            String string4 = this.a.getString(R.string.plaid_user_agent_string_format_flutter, string3, Plaid.getVERSION_NAME(), this.a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
            string4.getClass();
            return string4;
        }
        if (string2 == null || StringsKt.isBlank(string2)) {
            String string5 = this.a.getString(R.string.plaid_user_agent_string_format_android, Plaid.getVERSION_NAME(), this.a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
            string5.getClass();
            return string5;
        }
        String string6 = this.a.getString(R.string.plaid_user_agent_string_format_react_native, string2, Plaid.getVERSION_NAME(), this.a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT));
        string6.getClass();
        return string6;
    }
}
