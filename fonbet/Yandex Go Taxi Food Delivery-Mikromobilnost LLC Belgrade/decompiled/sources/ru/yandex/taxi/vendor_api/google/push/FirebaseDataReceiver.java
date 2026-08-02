package ru.yandex.taxi.vendor_api.google.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.adjust.sdk.Constants;
import defpackage.acr;
import defpackage.hjt;
import defpackage.j73;
import defpackage.jst;
import defpackage.tje;
import defpackage.xby;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/vendor_api/google/push/FirebaseDataReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Intent;", "", "oldKey", "newKey", "Lzy11;", "remapExtra", "(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "acr", Constants.REFERRER_API_GOOGLE}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseDataReceiver extends BroadcastReceiver {
    public static final acr Companion = new acr();
    private static final Set<String> RESTRICTED_KEYS = j73.f0(new String[]{"gcm.notification.icon", "gcm.n.icon", "gcm.notification.e", "gcm.n.e", "gcm.notification.title", "gcm.notification.body"});

    private final void remapExtra(Intent intent, String str, String str2) {
        if (intent.hasExtra(str)) {
            String stringExtra = intent.getStringExtra(str);
            if (stringExtra != null) {
                intent.putExtra(str2, stringExtra);
            }
            intent.removeExtra(str);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Set<String> set = RESTRICTED_KEYS;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (intent.hasExtra((String) obj)) {
                arrayList.add(obj);
            }
        }
        intent.removeExtra("gcm.notification.icon");
        intent.removeExtra("gcm.n.icon");
        intent.removeExtra("gcm.notification.e");
        intent.removeExtra("gcm.n.e");
        remapExtra(intent, "gcm.notification.title", FcmNotificationService.KEY_TITLE);
        remapExtra(intent, "gcm.notification.body", FcmNotificationService.KEY_BODY);
        if (!arrayList.isEmpty()) {
            xby.l(jst.e, "FCM.push_contains_restricted_key", null, null, "Push notification contains restricted keys: ".concat(kotlin.collections.a.X(arrayList, Extension.SEMICOLON_SPACE, null, null, null, 62)), 6);
        }
        tje.N(hjt.a, null, null, new FirebaseDataReceiver$onReceive$1(intent, context, this, goAsync(), null), 3);
    }
}
