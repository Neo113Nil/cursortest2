package com.yandex.passport.internal;

import android.content.Context;
import com.yandex.passport.R;
import defpackage.btf;
import defpackage.dxv;
import defpackage.jyr;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class f {
    public final Context a;
    public final com.yandex.passport.internal.helper.h b;
    public final jyr c;

    public f(Context context, com.yandex.passport.internal.helper.h hVar) {
        context.getClass();
        hVar.getClass();
        this.a = context;
        this.b = hVar;
        this.c = btf.b(new dxv(29, this));
    }

    public final String a() {
        String language;
        Locale locale = this.b.a.r;
        if (locale != null && (language = locale.getLanguage()) != null) {
            return language;
        }
        String string = this.a.getString(R.string.passport_ui_language);
        string.getClass();
        return string;
    }
}
