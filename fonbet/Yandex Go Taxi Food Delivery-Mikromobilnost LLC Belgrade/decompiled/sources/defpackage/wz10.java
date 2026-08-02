package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.yandex.messaging.action.MessagingAction;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes15.dex */
public final class wz10 {
    public final uz10 a;

    public wz10(uz10 uz10Var) {
        this.a = uz10Var;
    }

    public static void a(wz10 wz10Var, Context context, MessagingAction messagingAction, p520 p520Var) {
        Intent a = wz10Var.a.a(context, messagingAction, p520Var);
        if (context.getPackageManager().resolveActivity(a, 0) == null) {
            return;
        }
        if (!(context instanceof Activity)) {
            a.addFlags(SelfTester_JCP.IMITA);
        }
        try {
            context.startActivity(a);
        } catch (ActivityNotFoundException e) {
            if (ydz.a.a()) {
                ydz.c("IntentUtils", "Failed to start activity", e);
            }
        } catch (SecurityException e2) {
            if (ydz.a.a()) {
                ydz.c("IntentUtils", "Failed to start activity", e2);
            }
        }
    }
}
