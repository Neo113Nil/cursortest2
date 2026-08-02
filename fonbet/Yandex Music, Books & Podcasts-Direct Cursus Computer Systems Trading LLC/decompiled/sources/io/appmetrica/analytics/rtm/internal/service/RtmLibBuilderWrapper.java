package io.appmetrica.analytics.rtm.internal.service;

import androidx.annotation.NonNull;
import defpackage.aaw;
import defpackage.ghh;
import defpackage.op;
import defpackage.ten;
import defpackage.uen;
import defpackage.xen;
import defpackage.yen;
import java.io.IOException;
import javax.net.ssl.SSLException;

/* loaded from: classes5.dex */
public class RtmLibBuilderWrapper {
    public void initAppHostStatics(@NonNull ten tenVar) {
        tenVar.getClass();
        String str = tenVar.a;
        if (str == null) {
            str = "https://yandex.ru/clck/click";
        }
        ghh.h = str;
        ghh.i = new aaw(25);
    }

    @NonNull
    public ten newAppHostStaticsBuilder() {
        return new ten();
    }

    @NonNull
    public uen newBuilder(@NonNull String str, @NonNull String str2, @NonNull yen yenVar) {
        str.getClass();
        str2.getClass();
        yenVar.getClass();
        return new uen(str, str2, yenVar);
    }

    public xen uploadEventAndWaitResult(@NonNull String str) {
        str.getClass();
        try {
            return new op(ghh.h, str, ghh.i).a();
        } catch (Throwable th) {
            return new xen(th instanceof SSLException ? 3 : th instanceof IOException ? 2 : 1, null);
        }
    }
}
