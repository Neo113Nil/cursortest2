package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.messaging.action.MessagingAction;
import com.yandex.messaging.action.MessagingActionParserKt;

/* loaded from: classes15.dex */
public final class uz10 {
    public final rz10 a;

    public uz10(rz10 rz10Var) {
        this.a = rz10Var;
    }

    public final Intent a(Context context, MessagingAction messagingAction, g720 g720Var) {
        if (!eja1.D(new ComponentName(context, "com.yandex.messaging.activity.MessengerActivity"), context, true) && ydz.a.a()) {
            ydz.b("MessagingIntentSender", "Can't enable com.yandex.messaging.activity.MessengerActivity");
        }
        String a = MessagingActionParserKt.a(messagingAction);
        Bundle b = MessagingActionParserKt.b(messagingAction);
        Intent makeMainActivity = Intent.makeMainActivity(new ComponentName(context, "com.yandex.messaging.activity.MessengerActivity"));
        makeMainActivity.setAction(a);
        this.a.getClass();
        makeMainActivity.addFlags(0);
        makeMainActivity.replaceExtras(b);
        makeMainActivity.putExtra("Source", g720Var.c());
        makeMainActivity.putExtra("request_unlock", false);
        makeMainActivity.setData(null);
        return makeMainActivity;
    }
}
