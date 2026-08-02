package ru.yandex.video.m3.ab.api;

import android.os.Build;
import android.util.Log;
import com.connectsdk.etc.helper.HttpMessage;
import defpackage.b0o;
import defpackage.cke;
import defpackage.d0o;
import defpackage.e1;
import defpackage.f1;
import defpackage.f1d;
import defpackage.g1;
import defpackage.l3o;
import defpackage.mkn;
import defpackage.o3o;
import defpackage.r7o;
import defpackage.s7e;
import defpackage.su4;
import defpackage.t7o;
import defpackage.vz1;
import defpackage.wnd;
import defpackage.x3f;
import defpackage.xqn;
import defpackage.yse;
import defpackage.z7o;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.ab.api.AbConfigApiException;

/* loaded from: classes6.dex */
public final class a {
    public final OkHttpClient a;
    public final wnd b;
    public final cke c;
    public final x3f d;
    public final String e;
    public final String f;
    public final Function0 g;

    public a(OkHttpClient okHttpClient, wnd wndVar, cke ckeVar, x3f x3fVar, String str) {
        e1 e1Var = e1.s;
        okHttpClient.getClass();
        str.getClass();
        this.a = okHttpClient;
        this.b = wndVar;
        this.c = ckeVar;
        this.d = x3fVar;
        this.e = str;
        this.f = "https://frontend.vh.yandex.ru/uaas/android_player";
        this.g = e1Var;
    }

    public final String a(String str, String str2) {
        s7e s7eVar = new s7e();
        s7eVar.h(null, this.f);
        s7e f = s7eVar.e().f();
        f.d("uuid", str);
        f.d("service", "vdpltfrm");
        f.d("package", this.e);
        f.d("version", "3.8.1");
        if (str2 != null) {
            f.d("vpuid", str2);
        }
        String str3 = Build.MODEL;
        str3.getClass();
        Locale locale = Locale.ROOT;
        String lowerCase = str3.toLowerCase(locale);
        lowerCase.getClass();
        f.d("cfs_android_model", lowerCase);
        String str4 = Build.DEVICE;
        str4.getClass();
        String lowerCase2 = str4.toLowerCase(locale);
        lowerCase2.getClass();
        f.d("cfs_android_device", lowerCase2);
        String str5 = Build.PRODUCT;
        str5.getClass();
        String lowerCase3 = str5.toLowerCase(locale);
        lowerCase3.getClass();
        f.d("cfs_android_product", lowerCase3);
        String str6 = Build.MANUFACTURER;
        str6.getClass();
        String lowerCase4 = str6.toLowerCase(locale);
        lowerCase4.getClass();
        f.d("cfs_android_manufacturer", lowerCase4);
        f.d("cfn_android_sdk_int", String.valueOf(Build.VERSION.SDK_INT));
        return f.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str) {
        cke ckeVar;
        OkHttpClient okHttpClient;
        Object t7oVar;
        Function0 function0;
        yse yseVar;
        String uuid = AppMetricaYandex.getUuid(this.b.b);
        if (uuid == null) {
            r7o r7oVar = z7o.b;
            return new t7o(new AbConfigApiException.UuidUnavailableApiException("No UUID available"));
        }
        cke ckeVar2 = this.c;
        String f = ckeVar2.b.f();
        try {
            String a = a(uuid, f);
            b0o b0oVar = new b0o();
            b0oVar.g(a);
            b0oVar.a(HttpMessage.USER_AGENT, ckeVar2.c());
            if (str != null) {
                b0oVar.a("If-None-Match", str);
            }
            d0o b = b0oVar.b();
            String c = ckeVar2.c();
            StringBuilder m = f1d.m("uuid=", uuid, " vpuid=", f, " userAgent=");
            su4.v(m, c, " etag=", str, " requestUrl=");
            m.append(a);
            Log.i("YP:ABExps", m.toString());
            xqn xqnVar = new xqn();
            try {
                okHttpClient = this.a;
                okHttpClient.getClass();
                ckeVar = ckeVar2;
            } catch (IOException e) {
                e = e;
                ckeVar = ckeVar2;
            }
            try {
                l3o execute = new mkn(okHttpClient, b, false).execute();
                try {
                    int i = execute.d;
                    boolean b2 = execute.b();
                    Function0 function02 = this.g;
                    if (b2) {
                        try {
                            o3o o3oVar = execute.g;
                            if (o3oVar != null) {
                                function0 = function02;
                                yseVar = (yse) this.d.b(yse.Companion.serializer(), o3oVar.D());
                            } else {
                                function0 = function02;
                                yseVar = null;
                            }
                            String a2 = execute.f.a("Etag");
                            if (a2 == null) {
                                a2 = "";
                            }
                            if (yseVar != null) {
                                c(yseVar, a2);
                                r7o r7oVar2 = z7o.b;
                                t7oVar = new g1(yseVar, a2, ((Number) function0.invoke()).longValue());
                            } else {
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(new AbConfigApiException.ResponseExtractionApiException(null, "Failed reading response body. Response body is null"));
                            }
                        } catch (Exception e2) {
                            r7o r7oVar4 = z7o.b;
                            t7oVar = new t7o(new AbConfigApiException.ResponseExtractionApiException(e2, "Failed to extract response body. responseCode=" + execute.d + " message=" + execute.c));
                        }
                    } else if (i == 304) {
                        Log.i("YP:ABExps", "responseCode=304 keeping config");
                        r7o r7oVar5 = z7o.b;
                        t7oVar = new f1(((Number) function02.invoke()).longValue());
                    } else {
                        r7o r7oVar6 = z7o.b;
                        t7oVar = new t7o(new AbConfigApiException.ResponseIsNotSuccessful("responseCode=" + i + " message=" + execute.c, i));
                    }
                    xqnVar.a = t7oVar;
                    execute.close();
                } finally {
                }
            } catch (IOException e3) {
                e = e3;
                r7o r7oVar7 = z7o.b;
                xqnVar.a = new t7o(new AbConfigApiException.AbConfigFetchException(e.getCause(), e.getMessage()));
                if (xqnVar.a instanceof t7o) {
                }
                return xqnVar.a;
            }
            if (xqnVar.a instanceof t7o) {
                Log.e("YP:ABExps", vz1.s(f1d.m("uuid=", uuid, " vpuid=", f, " userAgent="), ckeVar.c(), " etag=", str), z7o.a(xqnVar.a));
            }
            return xqnVar.a;
        } catch (IllegalArgumentException e4) {
            r7o r7oVar8 = z7o.b;
            StringBuilder sb = new StringBuilder();
            sb.append(e4.getMessage());
            sb.append(" endpoint=");
            su4.v(sb, this.f, ", uuid=", uuid, ", vpuid=");
            sb.append(f);
            sb.append(", service=");
            sb.append(this.e);
            return new t7o(new AbConfigApiException.IncorrectUrlParameters(e4, sb.toString()));
        }
    }

    public final void c(yse yseVar, String str) {
        Log.i("YP:ABExps", "abConfig=" + yseVar + " etag=" + str);
    }
}
