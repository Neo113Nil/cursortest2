package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.tp3;
import ru.yandex.yx_platform_api.AutoConnectionDetector$CarConnectionBroadcastReceiver;
import ru.yandex.yx_platform_api.AutoConnectionDetector$CarConnectionQueryHandler;

/* loaded from: classes7.dex */
public final class tp3 {
    public static final Uri d = new Uri.Builder().scheme("content").authority("androidx.car.app.connection").build();
    public final Context a;
    public final AutoConnectionDetector$CarConnectionBroadcastReceiver b = new BroadcastReceiver() { // from class: ru.yandex.yx_platform_api.AutoConnectionDetector$CarConnectionBroadcastReceiver
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            tp3 tp3Var = tp3.this;
            Uri uri = tp3.d;
            tp3Var.c.startQuery(42, null, tp3.d, new String[]{"CarConnectionState"}, null, null, null);
        }
    };
    public final AutoConnectionDetector$CarConnectionQueryHandler c;

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.yandex.yx_platform_api.AutoConnectionDetector$CarConnectionBroadcastReceiver] */
    public tp3(Context context) {
        this.a = context;
        this.c = new AutoConnectionDetector$CarConnectionQueryHandler(context.getContentResolver());
    }
}
