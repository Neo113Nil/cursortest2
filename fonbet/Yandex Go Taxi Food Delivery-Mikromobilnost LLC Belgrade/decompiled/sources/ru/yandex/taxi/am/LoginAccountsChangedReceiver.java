package ru.yandex.taxi.am;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import defpackage.cne0;
import defpackage.ehz;
import defpackage.jst;
import defpackage.kj;
import defpackage.w4j0;
import defpackage.wwg;
import defpackage.zzf;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/yandex/taxi/am/LoginAccountsChangedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lehz;", "dependencies", "Lzy11;", "checkExistingAccount", "(Landroid/content/Intent;Lehz;)V", "Landroid/content/Context;", "context", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LoginAccountsChangedReceiver extends BroadcastReceiver {
    private final void checkExistingAccount(Intent intent, ehz dependencies) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        zzf zzfVar = (zzf) dependencies;
        g gVar = (g) zzfVar.W0.get();
        gVar.getClass();
        long value = new PassportUidImpl(PassportEnvironmentImpl.from(new com.yandex.passport.api.s0(extras.getInt(WebViewActivity.KEY_ENVIRONMENT))), extras.getLong("uid")).getValue();
        k kVar = gVar.a;
        boolean z = value == kVar.x.a().a;
        if (z) {
            jst.e.getClass();
            gVar.i.b(false);
            ((cne0) kVar.b).u("recently_reset", true);
        }
        if (z) {
            ((ru.yandex.taxi.jobs.b) zzfVar.N4.get()).e(new w4j0("update_launch_data", 0L, null, null, null, false, false, 0L, null, 2046));
            return;
        }
        ru.yandex.taxi.zalogin.j jVar = (ru.yandex.taxi.zalogin.j) zzfVar.E3.get();
        kj kjVar = jVar.f;
        if (kjVar != null) {
            if (new PassportUidImpl(PassportEnvironmentImpl.from(new com.yandex.passport.api.s0(extras.getInt(WebViewActivity.KEY_ENVIRONMENT))), extras.getLong("uid")).getValue() == kjVar.a) {
                jVar.f = null;
                jVar.g.g(Boolean.TRUE);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null || (str = intent.getAction()) == null) {
            str = "";
        }
        if ("com.yandex.passport.client.ACCOUNT_REMOVED".equals(str)) {
            jst.e.getClass();
            if (intent != null) {
                checkExistingAccount(intent, (ehz) wwg.e(context, ehz.class));
            }
        }
    }
}
