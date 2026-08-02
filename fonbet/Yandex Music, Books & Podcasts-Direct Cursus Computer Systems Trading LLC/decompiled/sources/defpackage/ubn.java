package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class ubn implements xyk {
    public final SharedPreferences a;

    public ubn() {
        SharedPreferences sharedPreferences = ((Context) l18.b.c(hag.I(Context.class))).getSharedPreferences("Yandex_Music", 0);
        sharedPreferences.getClass();
        this.a = sharedPreferences;
    }

    public final hyn a() {
        z7l z7lVar = hyn.c;
        int i = this.a.getInt("repeat_mode", 2);
        hyn.c.getClass();
        Iterator it = hyn.h.iterator();
        while (it.hasNext()) {
            hyn hynVar = (hyn) it.next();
            if (hynVar.a == i) {
                return hynVar;
            }
        }
        wvs.h("Collection contains no element matching the predicate.");
        return null;
    }
}
