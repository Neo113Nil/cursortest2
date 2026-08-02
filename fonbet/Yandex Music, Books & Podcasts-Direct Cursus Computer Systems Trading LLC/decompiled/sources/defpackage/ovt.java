package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class ovt {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static ovt c;
    public final ybl a;

    public ovt(ybl yblVar) {
        this.a = yblVar;
    }

    public final boolean a(sd2 sd2Var) {
        if (TextUtils.isEmpty(sd2Var.c)) {
            return true;
        }
        long j = sd2Var.f + sd2Var.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
