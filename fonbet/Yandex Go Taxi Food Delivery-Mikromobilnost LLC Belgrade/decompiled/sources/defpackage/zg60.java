package defpackage;

import android.content.Context;
import androidx.core.app.s0;
import com.yandex.messenger.websdk.api.NotificationClickIntentFactory;
import com.yandex.messenger.websdk.api.NotificationDecorator;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class zg60 {
    public final NotificationClickIntentFactory a;
    public final NotificationDecorator b;
    public final s0 c;
    public final HashMap d = new HashMap();

    public zg60(Context context, NotificationClickIntentFactory notificationClickIntentFactory, NotificationDecorator notificationDecorator) {
        this.a = notificationClickIntentFactory;
        this.b = notificationDecorator;
        this.c = new s0(context);
    }
}
