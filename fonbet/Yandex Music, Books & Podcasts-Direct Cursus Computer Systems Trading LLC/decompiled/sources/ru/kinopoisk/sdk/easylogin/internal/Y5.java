package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.ServiceCommandError;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import defpackage.zt3;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class Y5 implements ResponseListener<Object> {
    public final /* synthetic */ O5 a;
    public final /* synthetic */ zt3 b;

    public Y5(O5 o5, zt3 zt3Var) {
        this.a = o5;
        this.b = zt3Var;
    }

    @Override // com.connectsdk.service.capability.listeners.ErrorListener
    public final void onError(ServiceCommandError serviceCommandError) {
        serviceCommandError.getClass();
        Timber.INSTANCE.tag(this.a.g).w(serviceCommandError, "Send message failure", new Object[0]);
        if (this.b.w()) {
            zt3 zt3Var = this.b;
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(new t7o(serviceCommandError));
        }
    }

    @Override // com.connectsdk.service.capability.listeners.ResponseListener
    public final void onSuccess(Object obj) {
        Timber.INSTANCE.tag(this.a.g).v("Message has successfully been sent", new Object[0]);
    }
}
