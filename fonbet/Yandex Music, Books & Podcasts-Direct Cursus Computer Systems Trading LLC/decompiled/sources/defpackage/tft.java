package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Locale;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public interface tft {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default Intent g(Intent intent, Context context, Intent intent2, kqt kqtVar) {
        boolean z;
        String Q = kqtVar.a.Q("turnKidsTabOn");
        if (Q != null) {
            String lowerCase = Q.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Boolean p0 = StringsKt.p0(lowerCase);
            if (p0 == null) {
                Integer intOrNull = StringsKt.toIntOrNull(Q);
                if (intOrNull != null) {
                    p0 = Boolean.valueOf(intOrNull.intValue() != 0);
                } else {
                    p0 = null;
                }
            }
            if (p0 != null) {
                z = p0.booleanValue();
                if (z) {
                    wst wstVar = (wst) sk3.I(wst.class);
                    wstVar.a(wstVar.b.c()).h(pff.e, false, Boolean.TRUE);
                }
                return intent;
            }
        }
        z = false;
        if (z) {
        }
        return intent;
    }

    Intent p(Context context, Intent intent, kqt kqtVar);
}
