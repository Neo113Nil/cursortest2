package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.LocaleList;
import java.util.Locale;
import ru.kinopoisk.sdk.easylogin.internal.C1258v5;
import ru.kinopoisk.sdk.easylogin.internal.Y8;

/* loaded from: classes.dex */
public final class sq0 extends er0 {
    public final Y8 R0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq0(Activity activity, kq0 kq0Var, Y8 y8) {
        super(activity, null, kq0Var, activity);
        activity.getClass();
        kq0Var.getClass();
        this.R0 = y8;
    }

    @Override // defpackage.er0
    public final dqg t(Context context) {
        context.getClass();
        C1258v5 c1258v5 = this.R0.d;
        Locale locale = c1258v5 != null ? c1258v5.a : null;
        if (locale == null) {
            return null;
        }
        dqg dqgVar = dqg.b;
        return dqg.d(new LocaleList(locale));
    }
}
