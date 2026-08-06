package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kp0 {
    public final defpackage.be0 GE9mJIPrb8gP;
    public final defpackage.ti1 JhCgjQRTAOCT;
    public final defpackage.ti1 Ns0WNyEWdPsk;
    public final defpackage.be0 P05cfTpS5W5L;
    public boolean QiMR8OkAhezm;
    public final defpackage.ti1 WDYagTQQm9ns;
    public final java.lang.String ZpBGe2uQfcn8;
    public final defpackage.be0 e6mdH7fiFuta;
    public final boolean fNwYGHIYeJcR;
    public final java.lang.String fWTAfUmVKrZq;
    public final java.util.ArrayList giKS3J6vZuNy;
    public final defpackage.be0 oh71FJcDz6S2;
    public static final defpackage.d41 h3m55N1URyyK = new defpackage.d41("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final defpackage.d41 gUjdnLbkVAaA = new defpackage.d41("\\{(.+?)\\}");
    public static final defpackage.d41 T1fB7bDYiVJQ = new defpackage.d41("http[s]?://");
    public static final defpackage.d41 XntWc4eZSQ8j = new defpackage.d41(".*");
    public static final defpackage.d41 WmetiUbpKU9I = new defpackage.d41("([^/]*?|)");
    public static final defpackage.d41 s0TASMVLSWD5 = new defpackage.d41("^[^?#]+\\?([^#]*).*");

    public kp0(java.lang.String str) {
        this.ZpBGe2uQfcn8 = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.giKS3J6vZuNy = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.JhCgjQRTAOCT = new defpackage.ti1(new defpackage.n10(this) { // from class: hp0
            public final /* synthetic */ defpackage.kp0 oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                java.util.List list;
                int i2 = i;
                defpackage.kp0 kp0Var = this.oh71FJcDz6S2;
                switch (i2) {
                    case 0:
                        java.lang.String str2 = kp0Var.fWTAfUmVKrZq;
                        if (str2 != null) {
                            return new defpackage.d41(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = kp0Var.ZpBGe2uQfcn8;
                        defpackage.d41 d41Var = defpackage.kp0.s0TASMVLSWD5;
                        d41Var.getClass();
                        return java.lang.Boolean.valueOf(d41Var.WDYagTQQm9ns.matcher(str3).matches());
                    case 2:
                        java.lang.String str4 = kp0Var.ZpBGe2uQfcn8;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.h7.Ns0WNyEWdPsk("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.hf.FhgBoOud6zyW(queryParameters);
                                if (str6 == null) {
                                    kp0Var.QiMR8OkAhezm = true;
                                    str6 = str5;
                                }
                                defpackage.d41 d41Var2 = defpackage.kp0.gUjdnLbkVAaA;
                                d41Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = d41Var2.WDYagTQQm9ns.matcher(str6);
                                matcher.getClass();
                                defpackage.jp0 jp0Var = new defpackage.jp0();
                                int i3 = 0;
                                for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str6); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
                                    defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
                                    giKS3J6vZuNy.getClass();
                                    jp0Var.giKS3J6vZuNy.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
                                    if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i3) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i3, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                }
                                if (i3 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                jp0Var.ZpBGe2uQfcn8 = defpackage.kp0.P05cfTpS5W5L(sb.toString());
                                linkedHashMap.put(str5, jp0Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        java.lang.String str7 = kp0Var.ZpBGe2uQfcn8;
                        android.net.Uri parse2 = android.net.Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        android.net.Uri parse3 = android.net.Uri.parse(str7);
                        parse3.getClass();
                        java.lang.String fragment = parse3.getFragment();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        fragment.getClass();
                        defpackage.kp0.ZpBGe2uQfcn8(fragment, arrayList2, sb2);
                        return new defpackage.bw0(arrayList2, sb2.toString());
                    case 4:
                        defpackage.bw0 bw0Var = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        return (bw0Var == null || (list = (java.util.List) bw0Var.WDYagTQQm9ns) == null) ? new java.util.ArrayList() : list;
                    case 5:
                        defpackage.bw0 bw0Var2 = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        if (bw0Var2 != null) {
                            return (java.lang.String) bw0Var2.oh71FJcDz6S2;
                        }
                        return null;
                    case 6:
                        java.lang.String str8 = (java.lang.String) kp0Var.GE9mJIPrb8gP.getValue();
                        if (str8 != null) {
                            return new defpackage.d41(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.WDYagTQQm9ns = new defpackage.ti1(new defpackage.n10(this) { // from class: hp0
            public final /* synthetic */ defpackage.kp0 oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                java.util.List list;
                int i22 = i2;
                defpackage.kp0 kp0Var = this.oh71FJcDz6S2;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = kp0Var.fWTAfUmVKrZq;
                        if (str2 != null) {
                            return new defpackage.d41(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = kp0Var.ZpBGe2uQfcn8;
                        defpackage.d41 d41Var = defpackage.kp0.s0TASMVLSWD5;
                        d41Var.getClass();
                        return java.lang.Boolean.valueOf(d41Var.WDYagTQQm9ns.matcher(str3).matches());
                    case 2:
                        java.lang.String str4 = kp0Var.ZpBGe2uQfcn8;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.h7.Ns0WNyEWdPsk("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.hf.FhgBoOud6zyW(queryParameters);
                                if (str6 == null) {
                                    kp0Var.QiMR8OkAhezm = true;
                                    str6 = str5;
                                }
                                defpackage.d41 d41Var2 = defpackage.kp0.gUjdnLbkVAaA;
                                d41Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = d41Var2.WDYagTQQm9ns.matcher(str6);
                                matcher.getClass();
                                defpackage.jp0 jp0Var = new defpackage.jp0();
                                int i3 = 0;
                                for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str6); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
                                    defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
                                    giKS3J6vZuNy.getClass();
                                    jp0Var.giKS3J6vZuNy.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
                                    if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i3) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i3, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                }
                                if (i3 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                jp0Var.ZpBGe2uQfcn8 = defpackage.kp0.P05cfTpS5W5L(sb.toString());
                                linkedHashMap.put(str5, jp0Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        java.lang.String str7 = kp0Var.ZpBGe2uQfcn8;
                        android.net.Uri parse2 = android.net.Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        android.net.Uri parse3 = android.net.Uri.parse(str7);
                        parse3.getClass();
                        java.lang.String fragment = parse3.getFragment();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        fragment.getClass();
                        defpackage.kp0.ZpBGe2uQfcn8(fragment, arrayList2, sb2);
                        return new defpackage.bw0(arrayList2, sb2.toString());
                    case 4:
                        defpackage.bw0 bw0Var = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        return (bw0Var == null || (list = (java.util.List) bw0Var.WDYagTQQm9ns) == null) ? new java.util.ArrayList() : list;
                    case 5:
                        defpackage.bw0 bw0Var2 = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        if (bw0Var2 != null) {
                            return (java.lang.String) bw0Var2.oh71FJcDz6S2;
                        }
                        return null;
                    case 6:
                        java.lang.String str8 = (java.lang.String) kp0Var.GE9mJIPrb8gP.getValue();
                        if (str8 != null) {
                            return new defpackage.d41(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        defpackage.n10 n10Var = new defpackage.n10(this) { // from class: hp0
            public final /* synthetic */ defpackage.kp0 oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                java.util.List list;
                int i22 = i3;
                defpackage.kp0 kp0Var = this.oh71FJcDz6S2;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = kp0Var.fWTAfUmVKrZq;
                        if (str2 != null) {
                            return new defpackage.d41(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = kp0Var.ZpBGe2uQfcn8;
                        defpackage.d41 d41Var = defpackage.kp0.s0TASMVLSWD5;
                        d41Var.getClass();
                        return java.lang.Boolean.valueOf(d41Var.WDYagTQQm9ns.matcher(str3).matches());
                    case 2:
                        java.lang.String str4 = kp0Var.ZpBGe2uQfcn8;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.h7.Ns0WNyEWdPsk("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.hf.FhgBoOud6zyW(queryParameters);
                                if (str6 == null) {
                                    kp0Var.QiMR8OkAhezm = true;
                                    str6 = str5;
                                }
                                defpackage.d41 d41Var2 = defpackage.kp0.gUjdnLbkVAaA;
                                d41Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = d41Var2.WDYagTQQm9ns.matcher(str6);
                                matcher.getClass();
                                defpackage.jp0 jp0Var = new defpackage.jp0();
                                int i32 = 0;
                                for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str6); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
                                    defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
                                    giKS3J6vZuNy.getClass();
                                    jp0Var.giKS3J6vZuNy.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
                                    if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                jp0Var.ZpBGe2uQfcn8 = defpackage.kp0.P05cfTpS5W5L(sb.toString());
                                linkedHashMap.put(str5, jp0Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        java.lang.String str7 = kp0Var.ZpBGe2uQfcn8;
                        android.net.Uri parse2 = android.net.Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        android.net.Uri parse3 = android.net.Uri.parse(str7);
                        parse3.getClass();
                        java.lang.String fragment = parse3.getFragment();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        fragment.getClass();
                        defpackage.kp0.ZpBGe2uQfcn8(fragment, arrayList2, sb2);
                        return new defpackage.bw0(arrayList2, sb2.toString());
                    case 4:
                        defpackage.bw0 bw0Var = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        return (bw0Var == null || (list = (java.util.List) bw0Var.WDYagTQQm9ns) == null) ? new java.util.ArrayList() : list;
                    case 5:
                        defpackage.bw0 bw0Var2 = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        if (bw0Var2 != null) {
                            return (java.lang.String) bw0Var2.oh71FJcDz6S2;
                        }
                        return null;
                    case 6:
                        java.lang.String str8 = (java.lang.String) kp0Var.GE9mJIPrb8gP.getValue();
                        if (str8 != null) {
                            return new defpackage.d41(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        defpackage.yf0 yf0Var = defpackage.yf0.oh71FJcDz6S2;
        this.oh71FJcDz6S2 = defpackage.t80.oCu53ZX2v4Ju(yf0Var, n10Var);
        final int i4 = 3;
        this.P05cfTpS5W5L = defpackage.t80.oCu53ZX2v4Ju(yf0Var, new defpackage.n10(this) { // from class: hp0
            public final /* synthetic */ defpackage.kp0 oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                java.util.List list;
                int i22 = i4;
                defpackage.kp0 kp0Var = this.oh71FJcDz6S2;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = kp0Var.fWTAfUmVKrZq;
                        if (str2 != null) {
                            return new defpackage.d41(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = kp0Var.ZpBGe2uQfcn8;
                        defpackage.d41 d41Var = defpackage.kp0.s0TASMVLSWD5;
                        d41Var.getClass();
                        return java.lang.Boolean.valueOf(d41Var.WDYagTQQm9ns.matcher(str3).matches());
                    case 2:
                        java.lang.String str4 = kp0Var.ZpBGe2uQfcn8;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.h7.Ns0WNyEWdPsk("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.hf.FhgBoOud6zyW(queryParameters);
                                if (str6 == null) {
                                    kp0Var.QiMR8OkAhezm = true;
                                    str6 = str5;
                                }
                                defpackage.d41 d41Var2 = defpackage.kp0.gUjdnLbkVAaA;
                                d41Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = d41Var2.WDYagTQQm9ns.matcher(str6);
                                matcher.getClass();
                                defpackage.jp0 jp0Var = new defpackage.jp0();
                                int i32 = 0;
                                for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str6); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
                                    defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
                                    giKS3J6vZuNy.getClass();
                                    jp0Var.giKS3J6vZuNy.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
                                    if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                jp0Var.ZpBGe2uQfcn8 = defpackage.kp0.P05cfTpS5W5L(sb.toString());
                                linkedHashMap.put(str5, jp0Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        java.lang.String str7 = kp0Var.ZpBGe2uQfcn8;
                        android.net.Uri parse2 = android.net.Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        android.net.Uri parse3 = android.net.Uri.parse(str7);
                        parse3.getClass();
                        java.lang.String fragment = parse3.getFragment();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        fragment.getClass();
                        defpackage.kp0.ZpBGe2uQfcn8(fragment, arrayList2, sb2);
                        return new defpackage.bw0(arrayList2, sb2.toString());
                    case 4:
                        defpackage.bw0 bw0Var = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        return (bw0Var == null || (list = (java.util.List) bw0Var.WDYagTQQm9ns) == null) ? new java.util.ArrayList() : list;
                    case 5:
                        defpackage.bw0 bw0Var2 = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        if (bw0Var2 != null) {
                            return (java.lang.String) bw0Var2.oh71FJcDz6S2;
                        }
                        return null;
                    case 6:
                        java.lang.String str8 = (java.lang.String) kp0Var.GE9mJIPrb8gP.getValue();
                        if (str8 != null) {
                            return new defpackage.d41(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.e6mdH7fiFuta = defpackage.t80.oCu53ZX2v4Ju(yf0Var, new defpackage.n10(this) { // from class: hp0
            public final /* synthetic */ defpackage.kp0 oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                java.util.List list;
                int i22 = i5;
                defpackage.kp0 kp0Var = this.oh71FJcDz6S2;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = kp0Var.fWTAfUmVKrZq;
                        if (str2 != null) {
                            return new defpackage.d41(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = kp0Var.ZpBGe2uQfcn8;
                        defpackage.d41 d41Var = defpackage.kp0.s0TASMVLSWD5;
                        d41Var.getClass();
                        return java.lang.Boolean.valueOf(d41Var.WDYagTQQm9ns.matcher(str3).matches());
                    case 2:
                        java.lang.String str4 = kp0Var.ZpBGe2uQfcn8;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.h7.Ns0WNyEWdPsk("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.hf.FhgBoOud6zyW(queryParameters);
                                if (str6 == null) {
                                    kp0Var.QiMR8OkAhezm = true;
                                    str6 = str5;
                                }
                                defpackage.d41 d41Var2 = defpackage.kp0.gUjdnLbkVAaA;
                                d41Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = d41Var2.WDYagTQQm9ns.matcher(str6);
                                matcher.getClass();
                                defpackage.jp0 jp0Var = new defpackage.jp0();
                                int i32 = 0;
                                for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str6); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
                                    defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
                                    giKS3J6vZuNy.getClass();
                                    jp0Var.giKS3J6vZuNy.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
                                    if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                jp0Var.ZpBGe2uQfcn8 = defpackage.kp0.P05cfTpS5W5L(sb.toString());
                                linkedHashMap.put(str5, jp0Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        java.lang.String str7 = kp0Var.ZpBGe2uQfcn8;
                        android.net.Uri parse2 = android.net.Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        android.net.Uri parse3 = android.net.Uri.parse(str7);
                        parse3.getClass();
                        java.lang.String fragment = parse3.getFragment();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        fragment.getClass();
                        defpackage.kp0.ZpBGe2uQfcn8(fragment, arrayList2, sb2);
                        return new defpackage.bw0(arrayList2, sb2.toString());
                    case 4:
                        defpackage.bw0 bw0Var = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        return (bw0Var == null || (list = (java.util.List) bw0Var.WDYagTQQm9ns) == null) ? new java.util.ArrayList() : list;
                    case 5:
                        defpackage.bw0 bw0Var2 = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        if (bw0Var2 != null) {
                            return (java.lang.String) bw0Var2.oh71FJcDz6S2;
                        }
                        return null;
                    case 6:
                        java.lang.String str8 = (java.lang.String) kp0Var.GE9mJIPrb8gP.getValue();
                        if (str8 != null) {
                            return new defpackage.d41(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.GE9mJIPrb8gP = defpackage.t80.oCu53ZX2v4Ju(yf0Var, new defpackage.n10(this) { // from class: hp0
            public final /* synthetic */ defpackage.kp0 oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                java.util.List list;
                int i22 = i6;
                defpackage.kp0 kp0Var = this.oh71FJcDz6S2;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = kp0Var.fWTAfUmVKrZq;
                        if (str2 != null) {
                            return new defpackage.d41(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = kp0Var.ZpBGe2uQfcn8;
                        defpackage.d41 d41Var = defpackage.kp0.s0TASMVLSWD5;
                        d41Var.getClass();
                        return java.lang.Boolean.valueOf(d41Var.WDYagTQQm9ns.matcher(str3).matches());
                    case 2:
                        java.lang.String str4 = kp0Var.ZpBGe2uQfcn8;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.h7.Ns0WNyEWdPsk("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.hf.FhgBoOud6zyW(queryParameters);
                                if (str6 == null) {
                                    kp0Var.QiMR8OkAhezm = true;
                                    str6 = str5;
                                }
                                defpackage.d41 d41Var2 = defpackage.kp0.gUjdnLbkVAaA;
                                d41Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = d41Var2.WDYagTQQm9ns.matcher(str6);
                                matcher.getClass();
                                defpackage.jp0 jp0Var = new defpackage.jp0();
                                int i32 = 0;
                                for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str6); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
                                    defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
                                    giKS3J6vZuNy.getClass();
                                    jp0Var.giKS3J6vZuNy.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
                                    if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                jp0Var.ZpBGe2uQfcn8 = defpackage.kp0.P05cfTpS5W5L(sb.toString());
                                linkedHashMap.put(str5, jp0Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        java.lang.String str7 = kp0Var.ZpBGe2uQfcn8;
                        android.net.Uri parse2 = android.net.Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        android.net.Uri parse3 = android.net.Uri.parse(str7);
                        parse3.getClass();
                        java.lang.String fragment = parse3.getFragment();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        fragment.getClass();
                        defpackage.kp0.ZpBGe2uQfcn8(fragment, arrayList2, sb2);
                        return new defpackage.bw0(arrayList2, sb2.toString());
                    case 4:
                        defpackage.bw0 bw0Var = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        return (bw0Var == null || (list = (java.util.List) bw0Var.WDYagTQQm9ns) == null) ? new java.util.ArrayList() : list;
                    case 5:
                        defpackage.bw0 bw0Var2 = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        if (bw0Var2 != null) {
                            return (java.lang.String) bw0Var2.oh71FJcDz6S2;
                        }
                        return null;
                    case 6:
                        java.lang.String str8 = (java.lang.String) kp0Var.GE9mJIPrb8gP.getValue();
                        if (str8 != null) {
                            return new defpackage.d41(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.Ns0WNyEWdPsk = new defpackage.ti1(new defpackage.n10(this) { // from class: hp0
            public final /* synthetic */ defpackage.kp0 oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                java.util.List list;
                int i22 = i7;
                defpackage.kp0 kp0Var = this.oh71FJcDz6S2;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = kp0Var.fWTAfUmVKrZq;
                        if (str2 != null) {
                            return new defpackage.d41(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = kp0Var.ZpBGe2uQfcn8;
                        defpackage.d41 d41Var = defpackage.kp0.s0TASMVLSWD5;
                        d41Var.getClass();
                        return java.lang.Boolean.valueOf(d41Var.WDYagTQQm9ns.matcher(str3).matches());
                    case 2:
                        java.lang.String str4 = kp0Var.ZpBGe2uQfcn8;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.h7.Ns0WNyEWdPsk("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.hf.FhgBoOud6zyW(queryParameters);
                                if (str6 == null) {
                                    kp0Var.QiMR8OkAhezm = true;
                                    str6 = str5;
                                }
                                defpackage.d41 d41Var2 = defpackage.kp0.gUjdnLbkVAaA;
                                d41Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = d41Var2.WDYagTQQm9ns.matcher(str6);
                                matcher.getClass();
                                defpackage.jp0 jp0Var = new defpackage.jp0();
                                int i32 = 0;
                                for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str6); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
                                    defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
                                    giKS3J6vZuNy.getClass();
                                    jp0Var.giKS3J6vZuNy.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
                                    if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                jp0Var.ZpBGe2uQfcn8 = defpackage.kp0.P05cfTpS5W5L(sb.toString());
                                linkedHashMap.put(str5, jp0Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        java.lang.String str7 = kp0Var.ZpBGe2uQfcn8;
                        android.net.Uri parse2 = android.net.Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        android.net.Uri parse3 = android.net.Uri.parse(str7);
                        parse3.getClass();
                        java.lang.String fragment = parse3.getFragment();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        fragment.getClass();
                        defpackage.kp0.ZpBGe2uQfcn8(fragment, arrayList2, sb2);
                        return new defpackage.bw0(arrayList2, sb2.toString());
                    case 4:
                        defpackage.bw0 bw0Var = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        return (bw0Var == null || (list = (java.util.List) bw0Var.WDYagTQQm9ns) == null) ? new java.util.ArrayList() : list;
                    case 5:
                        defpackage.bw0 bw0Var2 = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        if (bw0Var2 != null) {
                            return (java.lang.String) bw0Var2.oh71FJcDz6S2;
                        }
                        return null;
                    case 6:
                        java.lang.String str8 = (java.lang.String) kp0Var.GE9mJIPrb8gP.getValue();
                        if (str8 != null) {
                            return new defpackage.d41(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new defpackage.ti1(new defpackage.n10(this) { // from class: hp0
            public final /* synthetic */ defpackage.kp0 oh71FJcDz6S2;

            {
                this.oh71FJcDz6S2 = this;
            }

            @Override // defpackage.n10
            public final java.lang.Object ZpBGe2uQfcn8() {
                java.util.List list;
                int i22 = i8;
                defpackage.kp0 kp0Var = this.oh71FJcDz6S2;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = kp0Var.fWTAfUmVKrZq;
                        if (str2 != null) {
                            return new defpackage.d41(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = kp0Var.ZpBGe2uQfcn8;
                        defpackage.d41 d41Var = defpackage.kp0.s0TASMVLSWD5;
                        d41Var.getClass();
                        return java.lang.Boolean.valueOf(d41Var.WDYagTQQm9ns.matcher(str3).matches());
                    case 2:
                        java.lang.String str4 = kp0Var.ZpBGe2uQfcn8;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) kp0Var.WDYagTQQm9ns.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.h7.Ns0WNyEWdPsk("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.hf.FhgBoOud6zyW(queryParameters);
                                if (str6 == null) {
                                    kp0Var.QiMR8OkAhezm = true;
                                    str6 = str5;
                                }
                                defpackage.d41 d41Var2 = defpackage.kp0.gUjdnLbkVAaA;
                                d41Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = d41Var2.WDYagTQQm9ns.matcher(str6);
                                matcher.getClass();
                                defpackage.jp0 jp0Var = new defpackage.jp0();
                                int i32 = 0;
                                for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str6); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
                                    defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
                                    giKS3J6vZuNy.getClass();
                                    jp0Var.giKS3J6vZuNy.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
                                    if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                jp0Var.ZpBGe2uQfcn8 = defpackage.kp0.P05cfTpS5W5L(sb.toString());
                                linkedHashMap.put(str5, jp0Var);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        java.lang.String str7 = kp0Var.ZpBGe2uQfcn8;
                        android.net.Uri parse2 = android.net.Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        android.net.Uri parse3 = android.net.Uri.parse(str7);
                        parse3.getClass();
                        java.lang.String fragment = parse3.getFragment();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        fragment.getClass();
                        defpackage.kp0.ZpBGe2uQfcn8(fragment, arrayList2, sb2);
                        return new defpackage.bw0(arrayList2, sb2.toString());
                    case 4:
                        defpackage.bw0 bw0Var = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        return (bw0Var == null || (list = (java.util.List) bw0Var.WDYagTQQm9ns) == null) ? new java.util.ArrayList() : list;
                    case 5:
                        defpackage.bw0 bw0Var2 = (defpackage.bw0) kp0Var.P05cfTpS5W5L.getValue();
                        if (bw0Var2 != null) {
                            return (java.lang.String) bw0Var2.oh71FJcDz6S2;
                        }
                        return null;
                    case 6:
                        java.lang.String str8 = (java.lang.String) kp0Var.GE9mJIPrb8gP.getValue();
                        if (str8 != null) {
                            return new defpackage.d41(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        java.lang.StringBuilder sb = new java.lang.StringBuilder("^");
        if (!h3m55N1URyyK.WDYagTQQm9ns.matcher(str).find()) {
            java.lang.String pattern = T1fB7bDYiVJQ.WDYagTQQm9ns.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\\?|#|$)");
        compile.getClass();
        java.util.regex.Matcher matcher = compile.matcher(str);
        matcher.getClass();
        defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str);
        if (e6mdH7fiFuta != null) {
            ZpBGe2uQfcn8(str.substring(0, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns), arrayList, sb);
            if (!XntWc4eZSQ8j.WDYagTQQm9ns.matcher(sb).find() && !WmetiUbpKU9I.WDYagTQQm9ns.matcher(sb).find()) {
                z = true;
            }
            this.fNwYGHIYeJcR = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.fWTAfUmVKrZq = P05cfTpS5W5L(sb.toString());
    }

    public static java.lang.String P05cfTpS5W5L(java.lang.String str) {
        return (defpackage.tg1.Jkfc0NcwyPL8(str, "\\Q", false) && defpackage.tg1.Jkfc0NcwyPL8(str, "\\E", false)) ? defpackage.ah1.Wc0TdmRSwbbi(str, ".*", "\\E.*\\Q") : defpackage.tg1.Jkfc0NcwyPL8(str, "\\.\\*", false) ? defpackage.ah1.Wc0TdmRSwbbi(str, "\\.\\*", ".*") : str;
    }

    public static void QiMR8OkAhezm(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, defpackage.wo0 wo0Var) {
        if (wo0Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            defpackage.oq0 oq0Var = wo0Var.ZpBGe2uQfcn8;
            str.getClass();
            oq0Var.WDYagTQQm9ns(bundle, str, oq0Var.JhCgjQRTAOCT(str2));
        }
    }

    public static void ZpBGe2uQfcn8(java.lang.String str, java.util.ArrayList arrayList, java.lang.StringBuilder sb) {
        defpackage.d41 d41Var = gUjdnLbkVAaA;
        d41Var.getClass();
        java.util.regex.Matcher matcher = d41Var.WDYagTQQm9ns.matcher(str);
        matcher.getClass();
        int i = 0;
        for (defpackage.a7 e6mdH7fiFuta = defpackage.q70.e6mdH7fiFuta(matcher, 0, str); e6mdH7fiFuta != null; e6mdH7fiFuta = e6mdH7fiFuta.T1fB7bDYiVJQ()) {
            defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) e6mdH7fiFuta.JhCgjQRTAOCT).giKS3J6vZuNy(1);
            giKS3J6vZuNy.getClass();
            arrayList.add(giKS3J6vZuNy.ZpBGe2uQfcn8);
            if (e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns > i) {
                java.lang.String quote = java.util.regex.Pattern.quote(str.substring(i, e6mdH7fiFuta.GE9mJIPrb8gP().WDYagTQQm9ns));
                quote.getClass();
                sb.append(quote);
            }
            java.lang.String pattern = WmetiUbpKU9I.WDYagTQQm9ns.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = e6mdH7fiFuta.GE9mJIPrb8gP().oh71FJcDz6S2 + 1;
        }
        if (i < str.length()) {
            java.lang.String quote2 = java.util.regex.Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public final android.os.Bundle JhCgjQRTAOCT(android.net.Uri uri, java.util.LinkedHashMap linkedHashMap) {
        defpackage.a7 ZpBGe2uQfcn8;
        defpackage.a7 ZpBGe2uQfcn82;
        java.lang.String str;
        uri.getClass();
        linkedHashMap.getClass();
        defpackage.d41 d41Var = (defpackage.d41) this.JhCgjQRTAOCT.getValue();
        if (d41Var != null && (ZpBGe2uQfcn8 = d41Var.ZpBGe2uQfcn8(uri.toString())) != null) {
            android.os.Bundle GE9mJIPrb8gP = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
            if (WDYagTQQm9ns(ZpBGe2uQfcn8, GE9mJIPrb8gP, linkedHashMap) && (!((java.lang.Boolean) this.WDYagTQQm9ns.getValue()).booleanValue() || oh71FJcDz6S2(uri, GE9mJIPrb8gP, linkedHashMap))) {
                java.lang.String fragment = uri.getFragment();
                defpackage.d41 d41Var2 = (defpackage.d41) this.Ns0WNyEWdPsk.getValue();
                if (d41Var2 != null && (ZpBGe2uQfcn82 = d41Var2.ZpBGe2uQfcn8(java.lang.String.valueOf(fragment))) != null) {
                    java.util.List list = (java.util.List) this.e6mdH7fiFuta.getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(list, 10));
                    int i = 0;
                    for (java.lang.Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            defpackage.ma0.BXaznwstz2U0();
                            throw null;
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) ZpBGe2uQfcn82.JhCgjQRTAOCT).giKS3J6vZuNy(i2);
                        if (giKS3J6vZuNy != null) {
                            str = android.net.Uri.decode(giKS3J6vZuNy.ZpBGe2uQfcn8);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            QiMR8OkAhezm(GE9mJIPrb8gP, str2, str, (defpackage.wo0) linkedHashMap.get(str2));
                            arrayList.add(defpackage.gs1.ZpBGe2uQfcn8);
                            i = i2;
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                    }
                }
                if (defpackage.w60.BXaznwstz2U0(linkedHashMap, new defpackage.ip0(GE9mJIPrb8gP, 0)).isEmpty()) {
                    return GE9mJIPrb8gP;
                }
            }
        }
        return null;
    }

    public final boolean WDYagTQQm9ns(defpackage.a7 a7Var, android.os.Bundle bundle, java.util.Map map) {
        java.util.ArrayList arrayList = this.giKS3J6vZuNy;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            java.lang.String str = null;
            if (i < 0) {
                defpackage.ma0.BXaznwstz2U0();
                throw null;
            }
            java.lang.String str2 = (java.lang.String) obj;
            defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) a7Var.JhCgjQRTAOCT).giKS3J6vZuNy(i3);
            if (giKS3J6vZuNy != null) {
                str = android.net.Uri.decode(giKS3J6vZuNy.ZpBGe2uQfcn8);
                str.getClass();
            }
            if (str == null) {
                str = "";
            }
            try {
                QiMR8OkAhezm(bundle, str2, str, (defpackage.wo0) map.get(str2));
                arrayList2.add(defpackage.gs1.ZpBGe2uQfcn8);
                i = i3;
            } catch (java.lang.IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.kp0)) {
            return false;
        }
        return this.ZpBGe2uQfcn8.equals(((defpackage.kp0) obj).ZpBGe2uQfcn8);
    }

    public final java.util.ArrayList fWTAfUmVKrZq() {
        java.util.Collection values = ((java.util.Map) this.oh71FJcDz6S2.getValue()).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            defpackage.nf.Jkfc0NcwyPL8(arrayList, ((defpackage.jp0) it.next()).giKS3J6vZuNy);
        }
        return defpackage.hf.ULjnV488Y6RO(defpackage.hf.ULjnV488Y6RO(this.giKS3J6vZuNy, arrayList), (java.util.List) this.e6mdH7fiFuta.getValue());
    }

    public final int giKS3J6vZuNy(android.net.Uri uri) {
        if (uri == null) {
            return 0;
        }
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        android.net.Uri parse = android.net.Uri.parse(this.ZpBGe2uQfcn8);
        parse.getClass();
        java.util.List<java.lang.String> pathSegments2 = parse.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }

    public final int hashCode() {
        return this.ZpBGe2uQfcn8.hashCode() * 961;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean oh71FJcDz6S2(android.net.Uri uri, android.os.Bundle bundle, java.util.Map map) {
        defpackage.a7 a7Var;
        java.lang.Object obj;
        boolean z;
        java.lang.String query;
        defpackage.kp0 kp0Var = this;
        java.util.Map map2 = map;
        for (java.util.Map.Entry entry : ((java.util.Map) kp0Var.oh71FJcDz6S2.getValue()).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.jp0 jp0Var = (defpackage.jp0) entry.getValue();
            java.util.List<java.lang.String> queryParameters = uri.getQueryParameters(str);
            if (kp0Var.QiMR8OkAhezm && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = defpackage.ma0.VFeft99leXEK(query);
            }
            defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
            boolean z2 = false;
            android.os.Bundle GE9mJIPrb8gP = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
            java.util.ArrayList arrayList = jp0Var.giKS3J6vZuNy;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj2 = arrayList.get(i);
                i++;
                java.lang.String str2 = (java.lang.String) obj2;
                defpackage.wo0 wo0Var = (defpackage.wo0) map2.get(str2);
                defpackage.oq0 oq0Var = wo0Var != null ? wo0Var.ZpBGe2uQfcn8 : null;
                if ((oq0Var instanceof defpackage.gf) && !wo0Var.fWTAfUmVKrZq) {
                    defpackage.gf gfVar = (defpackage.gf) oq0Var;
                    gfVar.WDYagTQQm9ns(GE9mJIPrb8gP, str2, gfVar.QiMR8OkAhezm());
                }
            }
            java.util.Map map3 = map2;
            for (java.lang.String str3 : queryParameters) {
                java.lang.String str4 = jp0Var.ZpBGe2uQfcn8;
                if (str4 != null) {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str4);
                    compile.getClass();
                    str3.getClass();
                    java.util.regex.Matcher matcher = compile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        a7Var = new defpackage.a7(matcher, str3);
                        if (a7Var != null) {
                            return z2;
                        }
                        java.util.ArrayList arrayList2 = jp0Var.giKS3J6vZuNy;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(arrayList2, 10));
                        int size2 = arrayList2.size();
                        boolean z3 = z2;
                        int i2 = z3 ? 1 : 0;
                        java.util.Map map4 = map3;
                        ?? r14 = z3;
                        while (i2 < size2) {
                            java.lang.Object obj3 = arrayList2.get(i2);
                            i2++;
                            int i3 = r14 + 1;
                            if (r14 < 0) {
                                defpackage.ma0.BXaznwstz2U0();
                                throw null;
                            }
                            java.lang.String str5 = (java.lang.String) obj3;
                            defpackage.kk0 giKS3J6vZuNy = ((defpackage.lk0) a7Var.JhCgjQRTAOCT).giKS3J6vZuNy(i3);
                            java.lang.String str6 = giKS3J6vZuNy != null ? giKS3J6vZuNy.ZpBGe2uQfcn8 : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            defpackage.wo0 wo0Var2 = (defpackage.wo0) map4.get(str5);
                            try {
                                str5.getClass();
                            } catch (java.lang.IllegalArgumentException unused) {
                            }
                            if (GE9mJIPrb8gP.containsKey(str5)) {
                                if (GE9mJIPrb8gP.containsKey(str5)) {
                                    if (wo0Var2 != null) {
                                        defpackage.oq0 oq0Var2 = wo0Var2.ZpBGe2uQfcn8;
                                        java.lang.Object ZpBGe2uQfcn8 = oq0Var2.ZpBGe2uQfcn8(str5, GE9mJIPrb8gP);
                                        if (!GE9mJIPrb8gP.containsKey(str5)) {
                                            throw new java.lang.IllegalArgumentException("There is no previous value in this savedState.");
                                        }
                                        oq0Var2.WDYagTQQm9ns(GE9mJIPrb8gP, str5, oq0Var2.fWTAfUmVKrZq(ZpBGe2uQfcn8, str6));
                                    }
                                    z = false;
                                } else {
                                    z = true;
                                }
                                obj = java.lang.Boolean.valueOf(z);
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            } else {
                                QiMR8OkAhezm(GE9mJIPrb8gP, str5, str6, wo0Var2);
                                obj = gs1Var;
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            }
                        }
                        map3 = map;
                    }
                }
                a7Var = null;
                if (a7Var != null) {
                }
            }
            bundle.putAll(GE9mJIPrb8gP);
            kp0Var = this;
            map2 = map;
        }
        return true;
    }
}
