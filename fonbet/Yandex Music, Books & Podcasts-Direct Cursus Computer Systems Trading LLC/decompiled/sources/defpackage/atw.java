package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.media.ynison.service.s0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class atw {
    public static final String g;
    public final hgp a;
    public final String b;
    public final ydw c;
    public final SharedPreferences d;
    public final AtomicBoolean e;
    public s0 f;

    static {
        String str = xhw.w;
        g = "YnisonCore:".concat("YnisonUsageSettings");
    }

    public atw(Context context, hgp hgpVar, String str, ydw ydwVar) {
        str.getClass();
        this.a = hgpVar;
        this.b = str;
        this.c = ydwVar;
        this.d = context.getSharedPreferences("ynison_usage_settings", 0);
        this.e = new AtomicBoolean(true);
    }
}
