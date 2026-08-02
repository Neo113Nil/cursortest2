package ru.yandex.taxi.notifications;

import android.app.IntentService;
import android.content.Intent;
import defpackage.h6r;
import defpackage.mg60;
import defpackage.ng60;
import defpackage.p2y0;
import defpackage.pho;
import defpackage.q5z;
import defpackage.ss21;
import defpackage.t041;
import defpackage.uio0;
import defpackage.wwg;
import defpackage.zzf;
import kotlin.Metadata;
import ru.yandex.taxi.order.k;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/notifications/WaitingNotificationService;", "Landroid/app/IntentService;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lzy11;", "onHandleIntent", "(Landroid/content/Intent;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class WaitingNotificationService extends IntentService {
    public static final int $stable = 8;

    public WaitingNotificationService() {
        super("WaitingNotificationService");
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        q5z.Y(intent);
        zzf zzfVar = (zzf) ((h6r) wwg.e(this, h6r.class));
        new uio0((ss21) zzfVar.qi.get(), (ng60) zzfVar.f7.get(), (p2y0) zzfVar.J2.get(), (k) zzfVar.O4.get(), (t041) zzfVar.n4.get(), new mg60((pho) zzfVar.d0.get())).e(intent, action);
    }
}
