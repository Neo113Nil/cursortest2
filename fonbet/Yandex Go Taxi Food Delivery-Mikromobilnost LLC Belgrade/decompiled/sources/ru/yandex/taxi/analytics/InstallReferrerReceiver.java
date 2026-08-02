package ru.yandex.taxi.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.adjust.sdk.AdjustReferrerReceiver;
import defpackage.c3w;
import defpackage.evu0;
import defpackage.h6r;
import defpackage.hjt;
import defpackage.jst;
import defpackage.sls;
import defpackage.t7j;
import defpackage.tje;
import defpackage.wwg;
import defpackage.xby;
import defpackage.zy11;
import defpackage.zzf;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import ru.yandex.taxi.analytics.referrer.analytics.ReferrerSource;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/analytics/InstallReferrerReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "saveReferrer", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lkotlin/Function0;", "block", "handleAsync", "(Lsls;)V", "onReceive", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InstallReferrerReceiver extends BroadcastReceiver {
    private final void handleAsync(sls block) {
        tje.N(hjt.a, null, null, new InstallReferrerReceiver$handleAsync$1(block, goAsync(), null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onReceive$lambda$0(InstallReferrerReceiver installReferrerReceiver, Context context, Intent intent) {
        installReferrerReceiver.saveReferrer(context, intent);
        return zy11.a;
    }

    private final void saveReferrer(Context context, Intent intent) {
        Object failure;
        if (context == null || intent == null) {
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("referrer");
            h6r h6rVar = (h6r) wwg.e(context, h6r.class);
            ((zzf) h6rVar).m1().a(stringExtra, ReferrerSource.BROADCAST_RECEIVER);
            if (stringExtra != null && !evu0.J(stringExtra)) {
                SharedPreferences.Editor edit = ((SharedPreferences) ((c3w) ((zzf) h6rVar).Wd.get()).b.getValue()).edit();
                edit.putString("referrer", stringExtra);
                edit.apply();
            }
            failure = zy11.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            xby.l(jst.e, "REFERRER", null, a, "Can't save referrer", 2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        new AdjustReferrerReceiver().onReceive(context, intent);
        handleAsync(new t7j(20, this, context, intent));
    }
}
