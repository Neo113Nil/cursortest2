package com.yandex.appmetrica.push.firebase.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.push.common.utils.CoreUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes3.dex */
abstract class i {

    @NonNull
    private final Context a;

    @NonNull
    private final String b;

    public i(@NonNull Context context, @NonNull String str) {
        this.a = context;
        this.b = str;
    }

    public String a(@NonNull Context context, @NonNull String str) {
        String stringFromMetaData = CoreUtils.getStringFromMetaData(context, str);
        if (TextUtils.isEmpty(stringFromMetaData)) {
            return null;
        }
        String[] split = stringFromMetaData.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (split.length == 2 && "number".equals(split[0])) {
            return split[1];
        }
        return null;
    }

    public abstract String b();

    public abstract String c();

    @NonNull
    public Context d() {
        return this.a;
    }

    @NonNull
    public String e() {
        return this.b;
    }

    public abstract String f();

    public abstract String g();

    @NonNull
    public h a() {
        return new h(b(), c(), g(), f());
    }
}
