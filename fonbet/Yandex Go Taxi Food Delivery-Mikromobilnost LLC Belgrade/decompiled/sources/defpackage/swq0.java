package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.eatskit.dto.ServicePromo;
import ru.yandex.taxi.shortcuts.dto.response.AuthType;
import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ServiceManifest;
import ru.yandex.taxi.shortcuts.dto.response.superapp.a;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;

/* loaded from: classes10.dex */
public final /* synthetic */ class swq0 implements uxs {
    public static final swq0 a;
    private static final SerialDescriptor descriptor;

    static {
        swq0 swq0Var = new swq0();
        a = swq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.shortcuts.dto.response.superapp.ServiceParams", swq0Var, 36);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("service_name", true);
        pluginGeneratedSerialDescriptor.j("shortcuts_service_name", true);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j("splash_type_v2", true);
        pluginGeneratedSerialDescriptor.j("support_chat_url", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("user_agent_component", true);
        pluginGeneratedSerialDescriptor.j("courier_image_tag", true);
        pluginGeneratedSerialDescriptor.j("address_control_title", true);
        pluginGeneratedSerialDescriptor.j("address_control_loading", true);
        pluginGeneratedSerialDescriptor.j("address_input_placeholder", true);
        pluginGeneratedSerialDescriptor.j("address_search_on_map_header", true);
        pluginGeneratedSerialDescriptor.j("promo", true);
        pluginGeneratedSerialDescriptor.j("service_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("multiorder_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("pin_from_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("pin_to_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("auth_type", true);
        pluginGeneratedSerialDescriptor.j("injected_cookies", true);
        pluginGeneratedSerialDescriptor.j("allow_caching_cookie", true);
        pluginGeneratedSerialDescriptor.j("allowed_url_pattern", true);
        pluginGeneratedSerialDescriptor.j("captcha_url_pattern", true);
        pluginGeneratedSerialDescriptor.j("apply_allowed_url_pattern_for_iframe", true);
        pluginGeneratedSerialDescriptor.j("extensions_whitelist", true);
        pluginGeneratedSerialDescriptor.j("required_account", true);
        pluginGeneratedSerialDescriptor.j("open_relative_path_directly", true);
        pluginGeneratedSerialDescriptor.j("open_relative_path_only_with_signals", true);
        pluginGeneratedSerialDescriptor.j("should_show_close_button", true);
        pluginGeneratedSerialDescriptor.j("is_force_login_enabled", true);
        pluginGeneratedSerialDescriptor.j("theme_changing_mode", true);
        pluginGeneratedSerialDescriptor.j("adjust_configuration", true);
        pluginGeneratedSerialDescriptor.j("manifest", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = uwq0.K;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), auu0Var, rzv0.e, qke.n(auu0Var), qke.n(auu0Var), z96Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), auu0Var, auu0Var, auu0Var, auu0Var, qke.n((KSerializer) i3yVarArr[16].getValue()), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[21].getValue(), z96Var, z96Var, auu0Var, auu0Var, z96Var, auu0Var, i3yVarArr[28].getValue(), z96Var, z96Var, z96Var, z96Var, i3yVarArr[33].getValue(), ja1.a, qke.n(a.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ServicePromo servicePromo;
        String str;
        String str2;
        ServicePromo servicePromo2;
        String str3;
        int i;
        int i2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = uwq0.K;
        b.getClass();
        ServicePromo servicePromo3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ServiceManifest serviceManifest = null;
        int i3 = 0;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        RequiredAccount requiredAccount = null;
        WebViewThemeChangeMode webViewThemeChangeMode = null;
        AuthType authType = null;
        la1 la1Var = null;
        boolean z = false;
        String str11 = null;
        boolean z2 = true;
        int i4 = 0;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        drt0 drt0Var = null;
        boolean z3 = false;
        boolean z4 = false;
        String str21 = null;
        String str22 = null;
        boolean z5 = false;
        String str23 = null;
        String str24 = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    servicePromo = servicePromo3;
                    str = str5;
                    str2 = str6;
                    z2 = false;
                    servicePromo3 = servicePromo;
                    str6 = str2;
                    str5 = str;
                case 0:
                    servicePromo = servicePromo3;
                    str = str5;
                    str2 = str6;
                    i3 |= 1;
                    str16 = b.k(serialDescriptor, 0);
                    servicePromo3 = servicePromo;
                    str6 = str2;
                    str5 = str;
                case 1:
                    str = str5;
                    str2 = str6;
                    i3 |= 2;
                    str17 = b.k(serialDescriptor, 1);
                    servicePromo3 = servicePromo3;
                    str6 = str2;
                    str5 = str;
                case 2:
                    servicePromo2 = servicePromo3;
                    str = str5;
                    str2 = str6;
                    i3 |= 4;
                    str19 = (String) b.s(serialDescriptor, 2, auu0.a, str19);
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 3:
                    servicePromo2 = servicePromo3;
                    str = str5;
                    str2 = str6;
                    i3 |= 8;
                    str20 = (String) b.s(serialDescriptor, 3, auu0.a, str20);
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 4:
                    servicePromo2 = servicePromo3;
                    str = str5;
                    str2 = str6;
                    i3 |= 16;
                    str18 = b.k(serialDescriptor, 4);
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 5:
                    servicePromo2 = servicePromo3;
                    str = str5;
                    str2 = str6;
                    i3 |= 32;
                    drt0Var = (drt0) b.A(serialDescriptor, 5, rzv0.e, drt0Var);
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 6:
                    servicePromo2 = servicePromo3;
                    str = str5;
                    str2 = str6;
                    i3 |= 64;
                    str24 = (String) b.s(serialDescriptor, 6, auu0.a, str24);
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 7:
                    servicePromo2 = servicePromo3;
                    str = str5;
                    i3 |= 128;
                    str2 = (String) b.s(serialDescriptor, 7, auu0.a, str6);
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 8:
                    servicePromo2 = servicePromo3;
                    str3 = str5;
                    str2 = str6;
                    z = b.C(serialDescriptor, 8);
                    i3 |= 256;
                    str = str3;
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 9:
                    servicePromo2 = servicePromo3;
                    str3 = str5;
                    str2 = str6;
                    str11 = b.k(serialDescriptor, 9);
                    i3 |= 512;
                    str = str3;
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 10:
                    str2 = str6;
                    servicePromo2 = servicePromo3;
                    i3 |= 1024;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str5);
                    servicePromo3 = servicePromo2;
                    str6 = str2;
                    str5 = str;
                case 11:
                    str = str5;
                    str2 = str6;
                    str4 = (String) b.s(serialDescriptor, 11, auu0.a, str4);
                    i3 |= 2048;
                    str6 = str2;
                    str5 = str;
                case 12:
                    str = str5;
                    str2 = str6;
                    str12 = b.k(serialDescriptor, 12);
                    i3 |= 4096;
                    str6 = str2;
                    str5 = str;
                case 13:
                    str = str5;
                    str2 = str6;
                    str13 = b.k(serialDescriptor, 13);
                    i3 |= 8192;
                    str6 = str2;
                    str5 = str;
                case 14:
                    str = str5;
                    str2 = str6;
                    str14 = b.k(serialDescriptor, 14);
                    i3 |= 16384;
                    str6 = str2;
                    str5 = str;
                case 15:
                    str = str5;
                    str2 = str6;
                    str15 = b.k(serialDescriptor, 15);
                    i = 32768;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 16:
                    str = str5;
                    str2 = str6;
                    servicePromo3 = (ServicePromo) b.s(serialDescriptor, 16, (myi) i3yVarArr[16].getValue(), servicePromo3);
                    i = 65536;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 17:
                    str = str5;
                    str2 = str6;
                    str7 = (String) b.s(serialDescriptor, 17, auu0.a, str7);
                    i = 131072;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 18:
                    str = str5;
                    str2 = str6;
                    str8 = (String) b.s(serialDescriptor, 18, auu0.a, str8);
                    i = 262144;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 19:
                    str = str5;
                    str2 = str6;
                    str9 = (String) b.s(serialDescriptor, 19, auu0.a, str9);
                    i = 524288;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 20:
                    str = str5;
                    str2 = str6;
                    str10 = (String) b.s(serialDescriptor, 20, auu0.a, str10);
                    i = 1048576;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 21:
                    str = str5;
                    str2 = str6;
                    authType = (AuthType) b.A(serialDescriptor, 21, (myi) i3yVarArr[21].getValue(), authType);
                    i = 2097152;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 22:
                    str = str5;
                    str2 = str6;
                    z3 = b.C(serialDescriptor, 22);
                    i = SelfTester_JCP.ENCRYPT_CBC;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 23:
                    str = str5;
                    str2 = str6;
                    z4 = b.C(serialDescriptor, 23);
                    i = SelfTester_JCP.ENCRYPT_CNT;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 24:
                    str = str5;
                    str2 = str6;
                    str21 = b.k(serialDescriptor, 24);
                    i = 16777216;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 25:
                    str = str5;
                    str2 = str6;
                    str22 = b.k(serialDescriptor, 25);
                    i = SelfTester_JCP.DECRYPT_CFB;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 26:
                    str = str5;
                    str2 = str6;
                    z5 = b.C(serialDescriptor, 26);
                    i = SelfTester_JCP.DECRYPT_CBC;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 27:
                    str = str5;
                    str2 = str6;
                    str23 = b.k(serialDescriptor, 27);
                    i = SelfTester_JCP.DECRYPT_CNT;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 28:
                    str = str5;
                    str2 = str6;
                    requiredAccount = (RequiredAccount) b.A(serialDescriptor, 28, (myi) i3yVarArr[28].getValue(), requiredAccount);
                    i = SelfTester_JCP.IMITA;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 29:
                    str = str5;
                    str2 = str6;
                    z6 = b.C(serialDescriptor, 29);
                    i = 536870912;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 30:
                    str = str5;
                    str2 = str6;
                    z7 = b.C(serialDescriptor, 30);
                    i = 1073741824;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 31:
                    str = str5;
                    str2 = str6;
                    z8 = b.C(serialDescriptor, 31);
                    i = Integer.MIN_VALUE;
                    i3 |= i;
                    str6 = str2;
                    str5 = str;
                case 32:
                    str = str5;
                    str2 = str6;
                    z9 = b.C(serialDescriptor, 32);
                    i2 = i4 | 1;
                    i4 = i2;
                    str6 = str2;
                    str5 = str;
                case 33:
                    str = str5;
                    str2 = str6;
                    webViewThemeChangeMode = (WebViewThemeChangeMode) b.A(serialDescriptor, 33, (myi) i3yVarArr[33].getValue(), webViewThemeChangeMode);
                    i2 = i4 | 2;
                    i4 = i2;
                    str6 = str2;
                    str5 = str;
                case 34:
                    str = str5;
                    str2 = str6;
                    la1Var = (la1) b.A(serialDescriptor, 34, ja1.a, la1Var);
                    i2 = i4 | 4;
                    i4 = i2;
                    str6 = str2;
                    str5 = str;
                case 35:
                    str2 = str6;
                    str = str5;
                    serviceManifest = (ServiceManifest) b.s(serialDescriptor, 35, a.a, serviceManifest);
                    i2 = i4 | 8;
                    i4 = i2;
                    str6 = str2;
                    str5 = str;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        ServicePromo servicePromo4 = servicePromo3;
        String str25 = str6;
        String str26 = str19;
        b.c(serialDescriptor);
        WebViewThemeChangeMode webViewThemeChangeMode2 = webViewThemeChangeMode;
        la1 la1Var2 = la1Var;
        drt0 drt0Var2 = drt0Var;
        AuthType authType2 = authType;
        return new uwq0(i3, i4, str16, str17, str26, str20, str18, drt0Var2, str24, str25, z, str11, str5, str4, str12, str13, str14, str15, servicePromo4, str7, str8, str9, str10, authType2, z3, z4, str21, str22, z5, str23, requiredAccount, z6, z7, z8, z9, webViewThemeChangeMode2, la1Var2, serviceManifest);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uwq0 uwq0Var = (uwq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = uwq0.K;
        if (b.F() || !jl40.l(uwq0Var.a, "")) {
            b.o(serialDescriptor, 0, uwq0Var.a);
        }
        if (b.F() || !jl40.l(uwq0Var.b, "")) {
            b.o(serialDescriptor, 1, uwq0Var.b);
        }
        if (b.F() || uwq0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, uwq0Var.c);
        }
        if (b.F() || uwq0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, uwq0Var.d);
        }
        if (b.F() || !jl40.l(uwq0Var.e, "https://localhost")) {
            b.o(serialDescriptor, 4, uwq0Var.e);
        }
        if (b.F() || !jl40.l(uwq0Var.f, crt0.INSTANCE)) {
            b.e(serialDescriptor, 5, rzv0.e, uwq0Var.f);
        }
        if (b.F() || uwq0Var.g != null) {
            b.g(serialDescriptor, 6, auu0.a, uwq0Var.g);
        }
        if (b.F() || uwq0Var.h != null) {
            b.g(serialDescriptor, 7, auu0.a, uwq0Var.h);
        }
        if (b.F() || uwq0Var.i) {
            b.n(serialDescriptor, 8, uwq0Var.i);
        }
        if (b.F() || !jl40.l(uwq0Var.j, "")) {
            b.o(serialDescriptor, 9, uwq0Var.j);
        }
        if (b.F() || uwq0Var.k != null) {
            b.g(serialDescriptor, 10, auu0.a, uwq0Var.k);
        }
        if (b.F() || uwq0Var.l != null) {
            b.g(serialDescriptor, 11, auu0.a, uwq0Var.l);
        }
        if (b.F() || !jl40.l(uwq0Var.m, "")) {
            b.o(serialDescriptor, 12, uwq0Var.m);
        }
        if (b.F() || !jl40.l(uwq0Var.n, "")) {
            b.o(serialDescriptor, 13, uwq0Var.n);
        }
        if (b.F() || !jl40.l(uwq0Var.o, "")) {
            b.o(serialDescriptor, 14, uwq0Var.o);
        }
        if (b.F() || !jl40.l(uwq0Var.p, "")) {
            b.o(serialDescriptor, 15, uwq0Var.p);
        }
        if (b.F() || uwq0Var.q != null) {
            b.g(serialDescriptor, 16, (KSerializer) i3yVarArr[16].getValue(), uwq0Var.q);
        }
        if (b.F() || uwq0Var.r != null) {
            b.g(serialDescriptor, 17, auu0.a, uwq0Var.r);
        }
        if (b.F() || uwq0Var.s != null) {
            b.g(serialDescriptor, 18, auu0.a, uwq0Var.s);
        }
        if (b.F() || uwq0Var.t != null) {
            b.g(serialDescriptor, 19, auu0.a, uwq0Var.t);
        }
        if (b.F() || uwq0Var.u != null) {
            b.g(serialDescriptor, 20, auu0.a, uwq0Var.u);
        }
        if (b.F() || uwq0Var.v != AuthType.OAUTH) {
            b.e(serialDescriptor, 21, (KSerializer) i3yVarArr[21].getValue(), uwq0Var.v);
        }
        if (b.F() || uwq0Var.w) {
            b.n(serialDescriptor, 22, uwq0Var.w);
        }
        if (b.F() || uwq0Var.x) {
            b.n(serialDescriptor, 23, uwq0Var.x);
        }
        if (b.F() || !jl40.l(uwq0Var.y, "")) {
            b.o(serialDescriptor, 24, uwq0Var.y);
        }
        if (b.F() || !jl40.l(uwq0Var.z, "")) {
            b.o(serialDescriptor, 25, uwq0Var.z);
        }
        if (b.F() || uwq0Var.A) {
            b.n(serialDescriptor, 26, uwq0Var.A);
        }
        if (b.F() || !jl40.l(uwq0Var.B, "")) {
            b.o(serialDescriptor, 27, uwq0Var.B);
        }
        if (b.F() || uwq0Var.C != RequiredAccount.NOT_REQUIRED) {
            b.e(serialDescriptor, 28, (KSerializer) i3yVarArr[28].getValue(), uwq0Var.C);
        }
        if (b.F() || uwq0Var.D) {
            b.n(serialDescriptor, 29, uwq0Var.D);
        }
        if (b.F() || uwq0Var.E) {
            b.n(serialDescriptor, 30, uwq0Var.E);
        }
        if (b.F() || uwq0Var.F) {
            b.n(serialDescriptor, 31, uwq0Var.F);
        }
        if (b.F() || uwq0Var.G) {
            b.n(serialDescriptor, 32, uwq0Var.G);
        }
        if (b.F() || uwq0Var.H != WebViewThemeChangeMode.PREFERS_COLOR_SCHEME) {
            b.e(serialDescriptor, 33, (KSerializer) i3yVarArr[33].getValue(), uwq0Var.H);
        }
        if (b.F() || !jl40.l(uwq0Var.I, new la1(EmptyList.a))) {
            b.e(serialDescriptor, 34, ja1.a, uwq0Var.I);
        }
        if (b.F() || uwq0Var.J != null) {
            b.g(serialDescriptor, 35, a.a, uwq0Var.J);
        }
        b.c(serialDescriptor);
    }
}
