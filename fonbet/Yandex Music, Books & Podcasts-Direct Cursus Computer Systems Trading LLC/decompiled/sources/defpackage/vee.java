package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes.dex */
public final class vee {
    public static final vee b = new vee();
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a() {
        if (bp6.a.contains(vee.class)) {
            return;
        }
        try {
            if (a.get()) {
                if (b.b() && x6c.b(v6c.IapLoggingLib2)) {
                    qee.r(j3c.b());
                } else {
                    pee.b();
                }
            }
        } catch (Throwable th) {
            bp6.a(vee.class, th);
        }
    }

    public final boolean b() {
        String string;
        List split$default;
        if (!bp6.a.contains(this)) {
            try {
                Context b2 = j3c.b();
                ApplicationInfo applicationInfo = b2.getPackageManager().getApplicationInfo(b2.getPackageName(), 128);
                if (applicationInfo != null && (string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version")) != null) {
                    split$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 3, 2, null);
                    if (Integer.parseInt((String) split$default.get(0)) >= 2) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                bp6.a(this, th);
            }
        }
        return false;
    }
}
