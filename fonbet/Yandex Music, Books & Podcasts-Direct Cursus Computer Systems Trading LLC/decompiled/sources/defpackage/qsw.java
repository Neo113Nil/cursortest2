package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes4.dex */
public final class qsw {
    public final Context a;
    public final rlw b;
    public final rjq c;
    public final um6 d;
    public final jyr e;

    public qsw(Context context, rlw rlwVar, rgw rgwVar) {
        this.a = context;
        this.b = rlwVar;
        rjq b = hyf.b();
        this.c = b;
        this.d = hld.s(b, dm6.b());
        this.e = btf.b(new dxv(26, this));
    }

    public final njs a() {
        psw pswVar;
        njs njsVar = (njs) this.b.h.getValue();
        rxk rxkVar = psw.b;
        jyr jyrVar = this.e;
        String string = ((SharedPreferences) jyrVar.getValue()).getString("actor", "");
        String str = string != null ? string : "";
        rxkVar.getClass();
        psw[] values = psw.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                pswVar = null;
                break;
            }
            pswVar = values[i];
            if (pswVar.a.equals(str)) {
                break;
            }
            i++;
        }
        if (pswVar == null) {
            pswVar = psw.USER;
        }
        int ordinal = pswVar.ordinal();
        if (ordinal == 0) {
            return njsVar;
        }
        if (ordinal == 1) {
            long j = ((SharedPreferences) jyrVar.getValue()).getLong("timestamp", Long.MAX_VALUE);
            return njsVar.a <= j ? njsVar : new njs(j, njsVar.b);
        }
        b6e.s();
        return null;
    }
}
