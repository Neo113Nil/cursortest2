package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class vmu {
    public final x22 a;
    public final h3y b;
    public umu c;

    public vmu(x22 x22Var, h3y h3yVar) {
        this.a = x22Var;
        this.b = h3yVar;
    }

    public final void a(String str) {
        umu umuVar = this.c;
        if (umuVar != null) {
            LinkedHashMap linkedHashMap = umuVar.i;
            linkedHashMap.put(str, Long.valueOf(((Number) linkedHashMap.getOrDefault(str, 0L)).longValue() + (SystemClock.elapsedRealtime() - umuVar.h)));
            umuVar.h = SystemClock.elapsedRealtime();
        }
    }
}
