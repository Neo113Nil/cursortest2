package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.d0;
import androidx.core.app.f0;
import androidx.core.app.u0;
import com.yandex.messenger.websdk.api.NotificationClickIntentFactory;
import java.util.HashMap;
import ru.yandex.music.chat.SupportChatActivity;

/* loaded from: classes3.dex */
public final class afj {
    public final NotificationClickIntentFactory a;
    public final u0 b;
    public final HashMap c;

    public afj(Context context, NotificationClickIntentFactory notificationClickIntentFactory) {
        notificationClickIntentFactory.getClass();
        this.a = notificationClickIntentFactory;
        this.b = new u0(context);
        this.c = new HashMap();
    }

    public final void a(Context context, efj efjVar) {
        String str = efjVar.a;
        String str2 = efjVar.c;
        String str3 = efjVar.b;
        long j = efjVar.d;
        HashMap hashMap = this.c;
        sfj sfjVar = (sfj) hashMap.get(str);
        if (sfjVar == null || j > sfjVar.b) {
            int i = Build.VERSION.SDK_INT;
            u0 u0Var = this.b;
            if (i >= 26 && u0Var.b("WebMessengerChannel") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("WebMessengerChannel", "Messenger", 4);
                notificationChannel.setLightColor(-16711936);
                notificationChannel.enableVibration(true);
                notificationChannel.enableLights(true);
                notificationChannel.setShowBadge(false);
                notificationChannel.setLockscreenVisibility(1);
                u0Var.a(notificationChannel);
            }
            f0 f0Var = new f0(context, "WebMessengerChannel");
            f0Var.g(16, true);
            f0Var.y = "msg";
            f0Var.g(8, false);
            f0Var.H = 2;
            f0Var.i(-16776961, 1000, 1000);
            f0Var.B = 0;
            CharSequence c = f0.c(str3);
            Notification notification = f0Var.K;
            notification.tickerText = c;
            f0Var.e(str3);
            f0Var.d(str2);
            f0Var.k = 1;
            ((cuk) this.a).getClass();
            int i2 = SupportChatActivity.w;
            Intent intent = new Intent(context, (Class<?>) SupportChatActivity.class);
            intent.putExtra("extra.chatid", str);
            intent.putExtra("extra.initialtext", (String) null);
            f0Var.g = pcg.Q(intent, context, 20001, 134217728);
            d0 d0Var = new d0();
            d0Var.b = f0.c(str2);
            f0Var.k(d0Var);
            notification.icon = 2131232062;
            u0Var.d(null, str.hashCode(), f0Var.b());
            hashMap.put(str, new sfj(str, j));
        }
    }
}
