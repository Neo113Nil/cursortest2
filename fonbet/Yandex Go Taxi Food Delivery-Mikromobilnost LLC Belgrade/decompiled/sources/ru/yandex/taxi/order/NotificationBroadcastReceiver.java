package ru.yandex.taxi.order;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import defpackage.ew50;
import defpackage.h6r;
import defpackage.hst;
import defpackage.i3y;
import defpackage.jst;
import defpackage.ny61;
import defpackage.v480;
import defpackage.wwg;
import defpackage.y180;
import defpackage.yg60;
import defpackage.zzf;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lru/yandex/taxi/order/NotificationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "La3y0;", "logger$delegate", "Li3y;", "getLogger", "()La3y0;", "logger", "Companion", "yg60", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationBroadcastReceiver extends BroadcastReceiver {
    public static final int $stable = 8;
    public static final yg60 Companion = new yg60();
    private static final String PARAM_MESSAGE = "PARAM_MESSAGE";
    private static final String PARAM_NOTIFICATION_GROUP = "PARAM_NOTIFICATION_GROUP";
    private static final String PARAM_NOTIFICATION_TYPE = "PARAM_NOTIFICATION_TYPE";
    private static final String PARAM_ORDER_ID = "PARAM_ORDER_ID";
    private static final String PARAM_TITLE = "PARAM_TITLE";

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final i3y logger = kotlin.a.b(LazyThreadSafetyMode.NONE, new ew50(27));

    public static final Intent createCancelIntent(Context context, String str, String str2) {
        Companion.getClass();
        return yg60.a(context, str, str2);
    }

    public static final Intent createIntent(Context context, String str, String str2, String str3, String str4, String str5) {
        Companion.getClass();
        return yg60.b(context, str, str2, str3, str4, str5);
    }

    private final a3y0 getLogger() {
        return (a3y0) this.logger.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3y0 logger_delegate$lambda$0() {
        return new a3y0(TaxiOrderLogGroup.NOTIFICATION.getTag(), "NotificationBroadcastReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        h6r h6rVar = (h6r) wwg.e(context, h6r.class);
        String stringExtra = intent.getStringExtra(PARAM_ORDER_ID);
        if (stringExtra == null) {
            ny61.g("Required value was null.");
            return;
        }
        String stringExtra2 = intent.getStringExtra(PARAM_NOTIFICATION_TYPE);
        if (stringExtra2 == null) {
            ny61.g("Required value was null.");
            return;
        }
        String stringExtra3 = intent.getStringExtra(PARAM_TITLE);
        if (stringExtra3 == null) {
            ny61.g("Required value was null.");
            return;
        }
        String stringExtra4 = intent.getStringExtra(PARAM_MESSAGE);
        String stringExtra5 = intent.getStringExtra(PARAM_NOTIFICATION_GROUP);
        a3y0 logger = getLogger();
        List singletonList = Collections.singletonList("onReceive");
        logger.getClass();
        String[] strArr = (String[]) singletonList.toArray(new String[0]);
        a3y0.h((String[]) Arrays.copyOf(strArr, strArr.length));
        hst hstVar = jst.e;
        zzf zzfVar = (zzf) h6rVar;
        y180 y180Var = (y180) zzfVar.K4.get();
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        y180Var.m(stringExtra, stringExtra5, stringExtra2, stringExtra3, stringExtra4);
        ((v480) zzfVar.s8.get()).a.add(stringExtra.concat(stringExtra2));
    }
}
