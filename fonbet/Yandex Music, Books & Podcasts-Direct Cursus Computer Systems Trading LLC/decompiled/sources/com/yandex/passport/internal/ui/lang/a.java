package com.yandex.passport.internal.ui.lang;

import android.content.Context;
import com.yandex.passport.R;
import com.yandex.passport.common.ui.lang.b;
import com.yandex.passport.internal.helper.h;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class a implements b {
    public final Context a;
    public final h b;

    public a(Context context, h hVar) {
        context.getClass();
        hVar.getClass();
        this.a = context;
        this.b = hVar;
    }

    public final Locale a() {
        Object t7oVar;
        String str;
        Locale locale = this.b.a.r;
        if (locale != null) {
            int i = com.yandex.passport.common.ui.lang.a.a;
            return locale;
        }
        Context context = this.a;
        if (locale == null || (str = locale.getLanguage()) == null) {
            try {
                r7o r7oVar = z7o.b;
                t7oVar = context.getResources().getConfiguration().getLocales().get(0);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            Locale locale2 = (Locale) t7oVar;
            String languageTag = locale2 != null ? locale2.toLanguageTag() : null;
            if (languageTag == null) {
                str = context.getString(R.string.passport_ui_language);
                str.getClass();
            } else {
                str = languageTag;
            }
        }
        return com.yandex.passport.common.ui.lang.a.a(6, str);
    }

    public final Locale b() {
        String string;
        Locale locale = this.b.a.r;
        if (locale != null) {
            int i = com.yandex.passport.common.ui.lang.a.a;
            return locale;
        }
        if (locale == null || (string = locale.getLanguage()) == null) {
            string = this.a.getString(R.string.passport_ui_language);
            string.getClass();
        }
        return com.yandex.passport.common.ui.lang.a.a(6, string);
    }
}
