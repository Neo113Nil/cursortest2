package defpackage;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.net.URL;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes3.dex */
public final class rvn {
    public final iw0 a;
    public final CoroutineContext b;

    public rvn(iw0 iw0Var, CoroutineContext coroutineContext) {
        iw0Var.getClass();
        coroutineContext.getClass();
        this.a = iw0Var;
        this.b = coroutineContext;
    }

    public static final URL a(rvn rvnVar) {
        rvnVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath(ConstantDeviceInfo.APP_PLATFORM).appendPath("gmp");
        iw0 iw0Var = rvnVar.a;
        Uri.Builder appendPath2 = appendPath.appendPath(iw0Var.a).appendPath("settings");
        mb0 mb0Var = iw0Var.b;
        return new URL(appendPath2.appendQueryParameter("build_version", mb0Var.c).appendQueryParameter("display_version", mb0Var.b).build().toString());
    }
}
