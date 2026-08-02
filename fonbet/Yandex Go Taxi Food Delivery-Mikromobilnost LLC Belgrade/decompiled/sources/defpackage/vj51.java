package defpackage;

import com.adjust.sdk.Constants;
import com.squareup.moshi.Moshi;

/* loaded from: classes15.dex */
public final class vj51 {
    public final Moshi a;

    public vj51(Moshi moshi) {
        this.a = moshi;
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h("cloud-api.yandex.net");
        jwuVar.c("v1/disk/", false);
    }
}
