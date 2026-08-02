package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.sessions.LaunchSession;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import defpackage.zt3;
import ru.kinopoisk.sdk.easylogin.internal.AbstractC1066h7;
import ru.kinopoisk.sdk.easylogin.internal.O5;

/* loaded from: classes5.dex */
public final class U5 implements Launcher.AppLaunchListener {
    public final /* synthetic */ zt3 a;

    public U5(zt3 zt3Var) {
        this.a = zt3Var;
    }

    @Override // com.connectsdk.service.capability.listeners.ErrorListener
    public final void onError(ServiceCommandError serviceCommandError) {
        O5.a aVar;
        Throwable bVar;
        serviceCommandError.getClass();
        if (this.a.w()) {
            aVar = O5.p;
            if (O5.a.a(aVar, serviceCommandError)) {
                bVar = new AbstractC1066h7.a();
            } else {
                bVar = new AbstractC1066h7.b("Unknown error occurred: code=[" + serviceCommandError.getCode() + "], message=[" + serviceCommandError.getMessage() + "]", serviceCommandError);
            }
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(bVar));
        }
    }

    @Override // com.connectsdk.service.capability.listeners.ResponseListener
    public final void onSuccess(LaunchSession launchSession) {
        LaunchSession launchSession2 = launchSession;
        launchSession2.getClass();
        if (this.a.w()) {
            zt3 zt3Var = this.a;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(launchSession2);
        }
    }
}
