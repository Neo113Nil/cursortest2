package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.sessions.LaunchSession;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import defpackage.zt3;
import kotlin.Unit;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class V5 implements Launcher.AppLaunchListener {
    public final /* synthetic */ O5 a;
    public final /* synthetic */ zt3 b;

    public V5(O5 o5, zt3 zt3Var) {
        this.a = o5;
        this.b = zt3Var;
    }

    @Override // com.connectsdk.service.capability.listeners.ErrorListener
    public final void onError(ServiceCommandError serviceCommandError) {
        Timber.INSTANCE.tag(this.a.g).i("Install error: %s", serviceCommandError);
        if (this.b.w()) {
            zt3 zt3Var = this.b;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(new X4(null, serviceCommandError, 1, null)));
        }
    }

    @Override // com.connectsdk.service.capability.listeners.ResponseListener
    public final void onSuccess(LaunchSession launchSession) {
        Timber.INSTANCE.tag(this.a.g).d("Install was successful", new Object[0]);
        if (this.b.w()) {
            zt3 zt3Var = this.b;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(Unit.a);
        }
    }
}
