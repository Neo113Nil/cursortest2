package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import yads.pf1;

/* loaded from: classes11.dex */
public abstract class zia1 {
    public static final void a(pf1 pf1Var, String str, List list) {
        String str2 = null;
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                str2 = a.X(list2, ",", null, null, null, 62);
            }
        }
        pf1Var.a(str, str2);
    }

    public static ch b() {
        if (ch.e == null) {
            ch chVar = new ch();
            new Rect();
            ch.e = chVar;
        }
        return ch.e;
    }

    public static void c(Context context, String str, String str2) {
        if (str.length() == 0) {
            jgz.a.h("ExternalRouter");
            jgz.b("Trying to share empty sharing link", new Object[0]);
        } else {
            Intent createChooser = Intent.createChooser(new Intent().setAction("android.intent.action.SEND").putExtra("android.intent.extra.TEXT", str).setType("text/plain"), str2);
            if (!(context instanceof Activity)) {
                createChooser.addFlags(SelfTester_JCP.IMITA);
            }
            context.startActivity(createChooser);
        }
    }
}
