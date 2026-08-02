package com.yandex.plus.bdui.plus.content;

import android.net.Uri;
import com.yandex.plus.bdui.plus.action.y;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.bdui.plus.checkout.content.serializer.u7;
import com.yandex.plus.bdui.plus.checkout.content.serializer.y5;
import com.yandex.plus.core.reflect.NotTraversableProperty;
import defpackage.btf;
import defpackage.ern;
import defpackage.f1d;
import defpackage.jyr;
import defpackage.lm4;
import defpackage.s9f;
import defpackage.wct;
import defpackage.yxm;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class n extends com.yandex.plus.bdui.plus.webview.navigation.b {
    public final com.yandex.plus.core.templating.template.j a;
    public final com.yandex.plus.core.templating.template.j b;
    public final jyr c;
    public static final /* synthetic */ s9f[] e = {new yxm(n.class, "baseUrl", "getBaseUrl()Ljava/lang/String;", 0), f1d.c(ern.a, n.class, "entryPath", "getEntryPath()Ljava/lang/String;", 0)};
    public static final com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a d = new com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.product.a();
    public static final jyr f = btf.b(new y5(26));

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(com.yandex.plus.bdui.plus.content.controller.f fVar, String str, String str2, com.yandex.plus.log.api.b bVar) {
        super((y) f.getValue());
        Function1 function1;
        Function1 u7Var;
        lm4 a;
        Function1 function12;
        Function1 mVar;
        Function1 function13;
        String w;
        fVar.getClass();
        str.getClass();
        str2.getClass();
        bVar.getClass();
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "NavigationNormalizer", "normalize()");
        }
        Uri parse = Uri.parse(str);
        parse.getClass();
        String encodedPath = parse.getEncodedPath();
        if (encodedPath != null) {
            u.w(encodedPath);
        }
        String encodedQuery = parse.getEncodedQuery();
        String x = encodedQuery != null ? u.x(encodedQuery) : null;
        String encodedFragment = parse.getEncodedFragment();
        String v = encodedFragment != null ? u.v(encodedFragment) : null;
        Uri.Builder authority = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority());
        String encodedPath2 = parse.getEncodedPath();
        Uri build = authority.encodedPath(encodedPath2 != null ? u.w(encodedPath2) : null).build();
        String uri = build.toString();
        uri.getClass();
        String w2 = u.w(uri);
        w2 = w2 == null ? "" : w2;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "NavigationNormalizer", "normalize(); normalized base url = ".concat(w2));
        }
        Uri build2 = Uri.parse(str2).buildUpon().scheme(null).authority(null).build();
        build2.getClass();
        String encodedPath3 = build2.getEncodedPath();
        String w3 = encodedPath3 != null ? u.w(encodedPath3) : null;
        String encodedQuery2 = build2.getEncodedQuery();
        String x2 = encodedQuery2 != null ? u.x(encodedQuery2) : null;
        String encodedFragment2 = build2.getEncodedFragment();
        String v2 = encodedFragment2 != null ? u.v(encodedFragment2) : null;
        Uri build3 = (w3 == null && x2 == null && v2 == null) ? null : new Uri.Builder().encodedPath(w3).encodedQuery(x2).encodedFragment(v2).build();
        if (build3 == null) {
            build3 = (x == null && v == null) ? new Uri.Builder().build() : new Uri.Builder().encodedQuery(x).encodedFragment(v).build();
        }
        String uri2 = build3.toString();
        uri2.getClass();
        String w4 = u.w(uri2);
        String str3 = w4 != null ? w4 : "";
        if (bVar.b(aVar)) {
            bVar.c(aVar, "NavigationNormalizer", "normalize(); normalized entry path = ".concat(str3));
        }
        Uri.Builder buildUpon = build.buildUpon();
        String encodedPath4 = build3.getEncodedPath();
        if (encodedPath4 != null && (w = u.w(encodedPath4)) != null) {
            buildUpon.appendEncodedPath(w);
        }
        String encodedQuery3 = build3.getEncodedQuery();
        Uri.Builder encodedQuery4 = buildUpon.encodedQuery(encodedQuery3 != null ? u.x(encodedQuery3) : null);
        String encodedFragment3 = build3.getEncodedFragment();
        Uri build4 = encodedQuery4.encodedFragment(encodedFragment3 != null ? u.v(encodedFragment3) : null).build();
        build4.getClass();
        if (bVar.b(aVar)) {
            bVar.c(aVar, "NavigationNormalizer", "normalize(); normalized uri = " + build4);
        }
        com.yandex.plus.bdui.plus.webview.navigation.d dVar = new com.yandex.plus.bdui.plus.webview.navigation.d(build4, w2, str3);
        d.getClass();
        lm4 a2 = ern.a(String.class);
        Class cls = Boolean.TYPE;
        boolean equals = a2.equals(ern.a(cls));
        Class cls2 = Character.TYPE;
        Class cls3 = Double.TYPE;
        Class cls4 = Float.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Short.TYPE;
        Class cls8 = Byte.TYPE;
        com.yandex.plus.core.templating.template.a aVar2 = com.yandex.plus.core.templating.template.a.a;
        if (equals) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 0);
        } else if (a2.equals(ern.a(cls8))) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 4);
        } else if (a2.equals(ern.a(cls7))) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 5);
        } else if (a2.equals(ern.a(cls6))) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 6);
        } else if (a2.equals(ern.a(cls5))) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 7);
        } else if (a2.equals(ern.a(BigInteger.class))) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 8);
        } else if (a2.equals(ern.a(cls4))) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 9);
        } else if (a2.equals(ern.a(cls3))) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 10);
        } else if (a2.equals(ern.a(BigDecimal.class))) {
            u7Var = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 11);
        } else if (a2.equals(ern.a(cls2))) {
            u7Var = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 20);
        } else {
            if (!a2.equals(ern.a(String.class))) {
                function1 = null;
                if (function1 == null) {
                    wct.o(1, function1);
                } else {
                    function1 = null;
                }
                lm4 a3 = ern.a(String.class);
                Class b = a3.b();
                b.getClass();
                this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a3, b, ern.c(String.class)), fVar, dVar.a, bVar, function1);
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                    mVar = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 22);
                } else if (a.equals(ern.a(cls8))) {
                    mVar = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 23);
                } else if (a.equals(ern.a(cls7))) {
                    mVar = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 24);
                } else if (a.equals(ern.a(cls6))) {
                    mVar = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 25);
                } else if (a.equals(ern.a(cls5))) {
                    mVar = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 26);
                } else if (a.equals(ern.a(BigInteger.class))) {
                    mVar = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 27);
                } else if (a.equals(ern.a(cls4))) {
                    mVar = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 28);
                } else if (a.equals(ern.a(cls3))) {
                    mVar = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 29);
                } else if (a.equals(ern.a(BigDecimal.class))) {
                    mVar = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 1);
                } else if (a.equals(ern.a(cls2))) {
                    mVar = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 2);
                } else {
                    if (!a.equals(ern.a(String.class))) {
                        function12 = null;
                        if (function12 != null) {
                            wct.o(1, function12);
                            function13 = function12;
                        } else {
                            function13 = null;
                        }
                        lm4 a4 = ern.a(String.class);
                        Class b2 = a4.b();
                        b2.getClass();
                        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a4, b2, ern.c(String.class)), fVar, dVar.b, bVar, function13);
                        this.c = btf.b(new com.yandex.plus.bdui.plus.checkout.d(bVar, 1));
                    }
                    mVar = new m(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 3);
                }
                function12 = mVar;
                if (function12 != null) {
                }
                lm4 a42 = ern.a(String.class);
                Class b22 = a42.b();
                b22.getClass();
                this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a42, b22, ern.c(String.class)), fVar, dVar.b, bVar, function13);
                this.c = btf.b(new com.yandex.plus.bdui.plus.checkout.d(bVar, 1));
            }
            u7Var = new u7(1, aVar2, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 21);
        }
        function1 = u7Var;
        if (function1 == null) {
        }
        lm4 a32 = ern.a(String.class);
        Class b3 = a32.b();
        b3.getClass();
        this.a = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a32, b3, ern.c(String.class)), fVar, dVar.a, bVar, function1);
        a = ern.a(String.class);
        if (!a.equals(ern.a(cls))) {
        }
        function12 = mVar;
        if (function12 != null) {
        }
        lm4 a422 = ern.a(String.class);
        Class b222 = a422.b();
        b222.getClass();
        this.b = com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a422, b222, ern.c(String.class)), fVar, dVar.b, bVar, function13);
        this.c = btf.b(new com.yandex.plus.bdui.plus.checkout.d(bVar, 1));
    }

    @NotTraversableProperty
    private static /* synthetic */ void getNavigationNormalizer$annotations() {
    }

    @Override // com.yandex.plus.bdui.plus.webview.navigation.b
    public final String a() {
        return (String) this.a.d(e[0]);
    }

    @Override // com.yandex.plus.bdui.plus.webview.navigation.b
    public final String b() {
        return (String) this.b.d(e[1]);
    }

    @Override // com.yandex.plus.bdui.plus.webview.navigation.b
    public final Uri c() {
        String w;
        com.yandex.plus.bdui.plus.webview.navigation.c cVar = (com.yandex.plus.bdui.plus.webview.navigation.c) this.c.getValue();
        Uri parse = Uri.parse(a());
        parse.getClass();
        Uri parse2 = Uri.parse(b());
        parse2.getClass();
        cVar.getClass();
        Uri.Builder buildUpon = parse.buildUpon();
        String encodedPath = parse2.getEncodedPath();
        if (encodedPath != null && (w = u.w(encodedPath)) != null) {
            buildUpon.appendEncodedPath(w);
        }
        String encodedQuery = parse2.getEncodedQuery();
        Uri.Builder encodedQuery2 = buildUpon.encodedQuery(encodedQuery != null ? u.x(encodedQuery) : null);
        String encodedFragment = parse2.getEncodedFragment();
        Uri build = encodedQuery2.encodedFragment(encodedFragment != null ? u.v(encodedFragment) : null).build();
        build.getClass();
        return build;
    }
}
