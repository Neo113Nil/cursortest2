package yads;

import android.content.Context;
import android.os.Build;
import android.util.Base64;
import defpackage.a081;
import defpackage.a981;
import defpackage.c171;
import defpackage.cl71;
import defpackage.dp61;
import defpackage.ef81;
import defpackage.fe81;
import defpackage.fw81;
import defpackage.g191;
import defpackage.hg71;
import defpackage.iq81;
import defpackage.kla1;
import defpackage.mj31;
import defpackage.ny61;
import defpackage.ola1;
import defpackage.p671;
import defpackage.pl81;
import defpackage.sj71;
import defpackage.tg71;
import defpackage.tls;
import defpackage.uza;
import defpackage.v971;
import defpackage.vc71;
import defpackage.vfa1;
import defpackage.w9a1;
import defpackage.we81;
import defpackage.wo71;
import defpackage.zq71;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class bb3 extends Lambda implements tls {
    public final /* synthetic */ dp61 b;
    public final /* synthetic */ we81 c;
    public final /* synthetic */ fe81 d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb3(dp61 dp61Var, wo71 wo71Var, fe81 fe81Var, Context context) {
        super(1);
        this.b = dp61Var;
        this.c = wo71Var;
        this.d = fe81Var;
        this.e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        String str5;
        a981 a981Var = (a981) obj;
        dp61 dp61Var = this.b;
        we81 we81Var = this.c;
        fe81 fe81Var = this.d;
        Context context = this.e;
        a981Var.a("charset", "UTF-8");
        dp61Var.a.getClass();
        a981Var.a("rnd", String.valueOf(new Random().nextInt(89999999) + 10000000));
        ((wo71) we81Var).getClass();
        c171 c171Var = (c171) fe81Var.b.b;
        dp61Var.c.getClass();
        if (!fw81.a(context)) {
            c171Var.getClass();
            synchronized (c171.g) {
                str5 = c171Var.f;
            }
            a981Var.a("uuid", str5);
            a981Var.a("mauid", c171Var.c);
        }
        dp61Var.b.getClass();
        hw hwVar = new hw(a981Var);
        if (cl71.a == null) {
            synchronized (cl71.b) {
                if (cl71.a == null) {
                    cl71.a = vfa1.a(context);
                }
            }
        }
        zq71 zq71Var = cl71.a;
        if (zq71Var == null) {
            ny61.g("Required value was null.");
            return null;
        }
        Object obj2 = zq71.g;
        synchronized (obj2) {
            str = zq71Var.b;
        }
        hwVar.invoke("gdpr", str);
        synchronized (obj2) {
            str2 = zq71Var.a;
        }
        hwVar.invoke("gdpr_consent", str2);
        synchronized (obj2) {
            str3 = zq71Var.d;
        }
        hwVar.invoke("parsed_purpose_consents", str3);
        synchronized (obj2) {
            str4 = zq71Var.e;
        }
        hwVar.invoke("parsed_vendor_consents", str4);
        synchronized (obj2) {
            z = zq71Var.c;
        }
        hwVar.invoke("cmp_present", Integer.valueOf(z ? 1 : 0).toString());
        new iq81();
        new fw81();
        hg71 hg71Var = new hg71();
        g191 a = ola1.a(context);
        new v971();
        new tg71();
        mj31 mj31Var = fe81Var.b;
        p671 p671Var = (p671) mj31Var.c;
        c171 c171Var2 = (c171) mj31Var.b;
        gm0 gm0Var = new gm0(a981Var);
        gm0Var.invoke(CommonUrlParts.APP_ID, context.getPackageName());
        gm0Var.invoke("app_version_code", kla1.b(context));
        gm0Var.invoke(CommonUrlParts.APP_VERSION, kla1.c(context));
        gm0Var.invoke("vast-integration-type", "inapp_sdk");
        gm0Var.invoke("sdk_version", iq81.a("%d.%d%d"));
        gm0Var.invoke("sdk_version_name", iq81.a("%d.%d.%d"));
        gm0Var.invoke("sdk_vendor", "yandex");
        boolean z2 = false;
        byte[] decode = Base64.decode("ZGV2aWNlX3R5cGU=", 0);
        Charset charset = uza.a;
        gm0Var.invoke(new String(decode, charset), hg71Var.a.a(context).name().toLowerCase(Locale.ROOT));
        hg71Var.b.getClass();
        gm0Var.invoke("locale", ef81.a(context.getResources().getConfiguration().locale));
        hg71Var.b.getClass();
        gm0Var.invoke("content_language", pl81.a(context));
        hg71Var.b.getClass();
        ListBuilder b = pl81.b(context);
        gm0Var.invoke("device_languages", b != null ? a.X(b, ",", null, null, null, 62) : null);
        gm0Var.invoke(new String(Base64.decode("bWFudWZhY3R1cmVy", 0), charset), Build.MANUFACTURER);
        gm0Var.invoke(new String(Base64.decode("bW9kZWw=", 0), charset), Build.MODEL);
        gm0Var.invoke(new String(Base64.decode("b3NfbmFtZQ==", 0), charset), ConstantDeviceInfo.APP_PLATFORM);
        gm0Var.invoke(new String(Base64.decode("b3NfdmVyc2lvbg==", 0), charset), Build.VERSION.RELEASE);
        Boolean c = w9a1.c(context);
        if (c != null) {
            gm0Var.invoke("vpn_enabled", c.booleanValue() ? "1" : "0");
        }
        if (!fw81.b(context)) {
            synchronized (g191.y) {
                ((a081) a.a).getClass();
                synchronized (a081.f) {
                }
            }
        }
        if (!fw81.b(context)) {
            gm0Var.invoke(new String(Base64.decode("ZGV2aWNlLWlk", 0), charset), c171Var2.a);
            gm0Var.invoke(CommonUrlParts.APP_SET_ID, p671Var.d);
            vc71 vc71Var = p671Var.a;
            if (vc71Var != null) {
                boolean z3 = vc71Var.b;
                String str6 = vc71Var.a;
                Object[] objArr = (str6.length() == 0 || "00000000-0000-0000-0000-000000000000".equals(str6)) ? false : true;
                if (!z3 && objArr != false) {
                    gm0Var.invoke("google_aid", str6);
                }
            }
            vc71 vc71Var2 = p671Var.b;
            if (vc71Var2 != null) {
                boolean z4 = vc71Var2.b;
                String str7 = vc71Var2.a;
                if (str7.length() != 0 && !"00000000-0000-0000-0000-000000000000".equals(str7)) {
                    z2 = true;
                }
                if (!z4 && z2) {
                    gm0Var.invoke("huawei_oaid", str7);
                }
            }
        }
        gm0Var.invoke(CommonUrlParts.SCREEN_WIDTH, String.valueOf(sj71.g(context)));
        gm0Var.invoke(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(sj71.d(context)));
        gm0Var.invoke(CommonUrlParts.SCALE_FACTOR, String.valueOf(context.getResources().getDisplayMetrics().density));
        gm0Var.invoke(CommonUrlParts.SCREEN_DPI, String.valueOf(context.getResources().getDisplayMetrics().densityDpi));
        return a981Var;
    }
}
