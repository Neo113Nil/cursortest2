package defpackage;

import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class twi extends ytg {
    @Override // defpackage.ytg
    public final boolean l(int i, int i2, Intent intent) {
        String string;
        atg atgVar = i().g;
        if (intent == null) {
            o(btg.a(atgVar, "Operation canceled"));
            return true;
        }
        if (i2 == 0) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                string = null;
            } else {
                string = extras.getString("error");
                if (string == null) {
                    string = extras.getString("error_type");
                }
            }
            String obj = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
            if (qjp.c.equals(obj)) {
                String string2 = extras.getString("error_message");
                if (string2 == null) {
                    string2 = extras.getString("error_description");
                }
                o(btg.b(atgVar, string, string2, obj));
            }
            o(btg.a(atgVar, string));
            return true;
        }
        if (i2 != -1) {
            o(btg.b(atgVar, "Unexpected resultCode from authorization.", null, null));
            return true;
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 == null) {
            o(btg.b(atgVar, "Unexpected null from returned authorization data.", null, null));
            return true;
        }
        String string3 = extras2.getString("error");
        if (string3 == null) {
            string3 = extras2.getString("error_type");
        }
        String obj2 = extras2.get("error_code") != null ? extras2.get("error_code").toString() : null;
        String string4 = extras2.getString("error_message");
        if (string4 == null) {
            string4 = extras2.getString("error_description");
        }
        String string5 = extras2.getString("e2e");
        if (!gvt.D(string5)) {
            k(string5);
        }
        if (string3 == null && obj2 == null && string4 == null) {
            try {
                o(new btg(atgVar, 1, ytg.f(atgVar.b, extras2, p(), atgVar.d), ytg.g(extras2, atgVar.o), null, null));
            } catch (c3c e) {
                o(btg.b(atgVar, null, e.getMessage(), null));
            }
            return true;
        }
        if (string3 != null && string3.equals("logged_out")) {
            jx6.g = true;
            o(null);
            return true;
        }
        if (qjp.a.contains(string3)) {
            o(null);
            return true;
        }
        if (qjp.b.contains(string3)) {
            o(btg.a(atgVar, null));
            return true;
        }
        o(btg.b(atgVar, string3, string4, obj2));
        return true;
    }

    public final void o(btg btgVar) {
        if (btgVar != null) {
            i().f(btgVar);
        } else {
            i().k();
        }
    }

    public ra p() {
        return ra.FACEBOOK_APPLICATION_WEB;
    }
}
