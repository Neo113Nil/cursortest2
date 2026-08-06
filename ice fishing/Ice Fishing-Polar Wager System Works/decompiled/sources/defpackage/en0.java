package defpackage;

/* loaded from: classes.dex */
public final class en0 {
    public boolean AARZUJiTa;
    public final defpackage.eb0 EXtogiMhuM;
    public final defpackage.le1 F7NU4MC0GW;
    public final java.lang.String IHQe1A4L2xu;
    public final boolean JlrlGoKF;
    public final defpackage.eb0 SH1y5HwkJhh;
    public final defpackage.le1 adDC3e2L;
    public final defpackage.le1 ez2rX8ReCYw;
    public final java.util.ArrayList oh6vYeIP;
    public final java.lang.String r1MBDhnF;
    public final defpackage.eb0 riuEU0zW4;
    public final defpackage.eb0 xiZrDbcSW0;
    public static final defpackage.uz0 DFo87pBq1E5 = new defpackage.uz0("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final defpackage.uz0 SyNS6RMn = new defpackage.uz0("\\{(.+?)\\}");
    public static final defpackage.uz0 cnag84Bm = new defpackage.uz0("http[s]?://");
    public static final defpackage.uz0 QoRHpC4k = new defpackage.uz0(".*");
    public static final defpackage.uz0 G3OKOH3wZRC = new defpackage.uz0("([^/]*?|)");
    public static final defpackage.uz0 kd6TUFXn = new defpackage.uz0("^[^?#]+\\?([^#]*).*");

    public en0(java.lang.String str) {
        this.IHQe1A4L2xu = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.oh6vYeIP = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.F7NU4MC0GW = new defpackage.le1(new defpackage.vz(this) { // from class: bn0
            public final /* synthetic */ defpackage.en0 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                java.util.List list;
                int i2 = i;
                defpackage.en0 en0Var = this.xiZrDbcSW0;
                switch (i2) {
                    case 0:
                        java.lang.String str2 = en0Var.r1MBDhnF;
                        if (str2 != null) {
                            return new defpackage.uz0(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = en0Var.IHQe1A4L2xu;
                        defpackage.uz0 uz0Var = defpackage.en0.kd6TUFXn;
                        uz0Var.getClass();
                        return java.lang.Boolean.valueOf(uz0Var.adDC3e2L.matcher(str3).matches());
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        java.lang.String str4 = en0Var.IHQe1A4L2xu;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.db.ez2rX8ReCYw("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.td.gG5uWf3dqScO(queryParameters);
                                if (str6 == null) {
                                    en0Var.AARZUJiTa = true;
                                    str6 = str5;
                                }
                                defpackage.uz0 uz0Var2 = defpackage.en0.SyNS6RMn;
                                uz0Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = uz0Var2.adDC3e2L.matcher(str6);
                                matcher.getClass();
                                defpackage.dn0 dn0Var = new defpackage.dn0();
                                int i3 = 0;
                                for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str6); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
                                    defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
                                    oh6vYeIP.getClass();
                                    dn0Var.oh6vYeIP.add(oh6vYeIP.IHQe1A4L2xu);
                                    if (v5Var.EXtogiMhuM().adDC3e2L > i3) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i3, v5Var.EXtogiMhuM().adDC3e2L));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
                                }
                                if (i3 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                dn0Var.IHQe1A4L2xu = defpackage.en0.EXtogiMhuM(sb.toString());
                                linkedHashMap.put(str5, dn0Var);
                            }
                        }
                        return linkedHashMap;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        java.lang.String str7 = en0Var.IHQe1A4L2xu;
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
                        defpackage.en0.IHQe1A4L2xu(fragment, arrayList2, sb2);
                        return new defpackage.et0(arrayList2, sb2.toString());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.et0 et0Var = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        return (et0Var == null || (list = (java.util.List) et0Var.adDC3e2L) == null) ? new java.util.ArrayList() : list;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.et0 et0Var2 = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        if (et0Var2 != null) {
                            return (java.lang.String) et0Var2.xiZrDbcSW0;
                        }
                        return null;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        java.lang.String str8 = (java.lang.String) en0Var.SH1y5HwkJhh.getValue();
                        if (str8 != null) {
                            return new defpackage.uz0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.adDC3e2L = new defpackage.le1(new defpackage.vz(this) { // from class: bn0
            public final /* synthetic */ defpackage.en0 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                java.util.List list;
                int i22 = i2;
                defpackage.en0 en0Var = this.xiZrDbcSW0;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = en0Var.r1MBDhnF;
                        if (str2 != null) {
                            return new defpackage.uz0(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = en0Var.IHQe1A4L2xu;
                        defpackage.uz0 uz0Var = defpackage.en0.kd6TUFXn;
                        uz0Var.getClass();
                        return java.lang.Boolean.valueOf(uz0Var.adDC3e2L.matcher(str3).matches());
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        java.lang.String str4 = en0Var.IHQe1A4L2xu;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.db.ez2rX8ReCYw("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.td.gG5uWf3dqScO(queryParameters);
                                if (str6 == null) {
                                    en0Var.AARZUJiTa = true;
                                    str6 = str5;
                                }
                                defpackage.uz0 uz0Var2 = defpackage.en0.SyNS6RMn;
                                uz0Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = uz0Var2.adDC3e2L.matcher(str6);
                                matcher.getClass();
                                defpackage.dn0 dn0Var = new defpackage.dn0();
                                int i3 = 0;
                                for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str6); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
                                    defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
                                    oh6vYeIP.getClass();
                                    dn0Var.oh6vYeIP.add(oh6vYeIP.IHQe1A4L2xu);
                                    if (v5Var.EXtogiMhuM().adDC3e2L > i3) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i3, v5Var.EXtogiMhuM().adDC3e2L));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
                                }
                                if (i3 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                dn0Var.IHQe1A4L2xu = defpackage.en0.EXtogiMhuM(sb.toString());
                                linkedHashMap.put(str5, dn0Var);
                            }
                        }
                        return linkedHashMap;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        java.lang.String str7 = en0Var.IHQe1A4L2xu;
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
                        defpackage.en0.IHQe1A4L2xu(fragment, arrayList2, sb2);
                        return new defpackage.et0(arrayList2, sb2.toString());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.et0 et0Var = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        return (et0Var == null || (list = (java.util.List) et0Var.adDC3e2L) == null) ? new java.util.ArrayList() : list;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.et0 et0Var2 = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        if (et0Var2 != null) {
                            return (java.lang.String) et0Var2.xiZrDbcSW0;
                        }
                        return null;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        java.lang.String str8 = (java.lang.String) en0Var.SH1y5HwkJhh.getValue();
                        if (str8 != null) {
                            return new defpackage.uz0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        defpackage.vz vzVar = new defpackage.vz(this) { // from class: bn0
            public final /* synthetic */ defpackage.en0 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                java.util.List list;
                int i22 = i3;
                defpackage.en0 en0Var = this.xiZrDbcSW0;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = en0Var.r1MBDhnF;
                        if (str2 != null) {
                            return new defpackage.uz0(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = en0Var.IHQe1A4L2xu;
                        defpackage.uz0 uz0Var = defpackage.en0.kd6TUFXn;
                        uz0Var.getClass();
                        return java.lang.Boolean.valueOf(uz0Var.adDC3e2L.matcher(str3).matches());
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        java.lang.String str4 = en0Var.IHQe1A4L2xu;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.db.ez2rX8ReCYw("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.td.gG5uWf3dqScO(queryParameters);
                                if (str6 == null) {
                                    en0Var.AARZUJiTa = true;
                                    str6 = str5;
                                }
                                defpackage.uz0 uz0Var2 = defpackage.en0.SyNS6RMn;
                                uz0Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = uz0Var2.adDC3e2L.matcher(str6);
                                matcher.getClass();
                                defpackage.dn0 dn0Var = new defpackage.dn0();
                                int i32 = 0;
                                for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str6); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
                                    defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
                                    oh6vYeIP.getClass();
                                    dn0Var.oh6vYeIP.add(oh6vYeIP.IHQe1A4L2xu);
                                    if (v5Var.EXtogiMhuM().adDC3e2L > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, v5Var.EXtogiMhuM().adDC3e2L));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                dn0Var.IHQe1A4L2xu = defpackage.en0.EXtogiMhuM(sb.toString());
                                linkedHashMap.put(str5, dn0Var);
                            }
                        }
                        return linkedHashMap;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        java.lang.String str7 = en0Var.IHQe1A4L2xu;
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
                        defpackage.en0.IHQe1A4L2xu(fragment, arrayList2, sb2);
                        return new defpackage.et0(arrayList2, sb2.toString());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.et0 et0Var = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        return (et0Var == null || (list = (java.util.List) et0Var.adDC3e2L) == null) ? new java.util.ArrayList() : list;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.et0 et0Var2 = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        if (et0Var2 != null) {
                            return (java.lang.String) et0Var2.xiZrDbcSW0;
                        }
                        return null;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        java.lang.String str8 = (java.lang.String) en0Var.SH1y5HwkJhh.getValue();
                        if (str8 != null) {
                            return new defpackage.uz0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        defpackage.ed0 ed0Var = defpackage.ed0.xiZrDbcSW0;
        this.xiZrDbcSW0 = defpackage.c80.NHJTzaLwkd(ed0Var, vzVar);
        final int i4 = 3;
        this.EXtogiMhuM = defpackage.c80.NHJTzaLwkd(ed0Var, new defpackage.vz(this) { // from class: bn0
            public final /* synthetic */ defpackage.en0 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                java.util.List list;
                int i22 = i4;
                defpackage.en0 en0Var = this.xiZrDbcSW0;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = en0Var.r1MBDhnF;
                        if (str2 != null) {
                            return new defpackage.uz0(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = en0Var.IHQe1A4L2xu;
                        defpackage.uz0 uz0Var = defpackage.en0.kd6TUFXn;
                        uz0Var.getClass();
                        return java.lang.Boolean.valueOf(uz0Var.adDC3e2L.matcher(str3).matches());
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        java.lang.String str4 = en0Var.IHQe1A4L2xu;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.db.ez2rX8ReCYw("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.td.gG5uWf3dqScO(queryParameters);
                                if (str6 == null) {
                                    en0Var.AARZUJiTa = true;
                                    str6 = str5;
                                }
                                defpackage.uz0 uz0Var2 = defpackage.en0.SyNS6RMn;
                                uz0Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = uz0Var2.adDC3e2L.matcher(str6);
                                matcher.getClass();
                                defpackage.dn0 dn0Var = new defpackage.dn0();
                                int i32 = 0;
                                for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str6); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
                                    defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
                                    oh6vYeIP.getClass();
                                    dn0Var.oh6vYeIP.add(oh6vYeIP.IHQe1A4L2xu);
                                    if (v5Var.EXtogiMhuM().adDC3e2L > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, v5Var.EXtogiMhuM().adDC3e2L));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                dn0Var.IHQe1A4L2xu = defpackage.en0.EXtogiMhuM(sb.toString());
                                linkedHashMap.put(str5, dn0Var);
                            }
                        }
                        return linkedHashMap;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        java.lang.String str7 = en0Var.IHQe1A4L2xu;
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
                        defpackage.en0.IHQe1A4L2xu(fragment, arrayList2, sb2);
                        return new defpackage.et0(arrayList2, sb2.toString());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.et0 et0Var = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        return (et0Var == null || (list = (java.util.List) et0Var.adDC3e2L) == null) ? new java.util.ArrayList() : list;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.et0 et0Var2 = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        if (et0Var2 != null) {
                            return (java.lang.String) et0Var2.xiZrDbcSW0;
                        }
                        return null;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        java.lang.String str8 = (java.lang.String) en0Var.SH1y5HwkJhh.getValue();
                        if (str8 != null) {
                            return new defpackage.uz0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.riuEU0zW4 = defpackage.c80.NHJTzaLwkd(ed0Var, new defpackage.vz(this) { // from class: bn0
            public final /* synthetic */ defpackage.en0 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                java.util.List list;
                int i22 = i5;
                defpackage.en0 en0Var = this.xiZrDbcSW0;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = en0Var.r1MBDhnF;
                        if (str2 != null) {
                            return new defpackage.uz0(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = en0Var.IHQe1A4L2xu;
                        defpackage.uz0 uz0Var = defpackage.en0.kd6TUFXn;
                        uz0Var.getClass();
                        return java.lang.Boolean.valueOf(uz0Var.adDC3e2L.matcher(str3).matches());
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        java.lang.String str4 = en0Var.IHQe1A4L2xu;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.db.ez2rX8ReCYw("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.td.gG5uWf3dqScO(queryParameters);
                                if (str6 == null) {
                                    en0Var.AARZUJiTa = true;
                                    str6 = str5;
                                }
                                defpackage.uz0 uz0Var2 = defpackage.en0.SyNS6RMn;
                                uz0Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = uz0Var2.adDC3e2L.matcher(str6);
                                matcher.getClass();
                                defpackage.dn0 dn0Var = new defpackage.dn0();
                                int i32 = 0;
                                for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str6); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
                                    defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
                                    oh6vYeIP.getClass();
                                    dn0Var.oh6vYeIP.add(oh6vYeIP.IHQe1A4L2xu);
                                    if (v5Var.EXtogiMhuM().adDC3e2L > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, v5Var.EXtogiMhuM().adDC3e2L));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                dn0Var.IHQe1A4L2xu = defpackage.en0.EXtogiMhuM(sb.toString());
                                linkedHashMap.put(str5, dn0Var);
                            }
                        }
                        return linkedHashMap;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        java.lang.String str7 = en0Var.IHQe1A4L2xu;
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
                        defpackage.en0.IHQe1A4L2xu(fragment, arrayList2, sb2);
                        return new defpackage.et0(arrayList2, sb2.toString());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.et0 et0Var = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        return (et0Var == null || (list = (java.util.List) et0Var.adDC3e2L) == null) ? new java.util.ArrayList() : list;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.et0 et0Var2 = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        if (et0Var2 != null) {
                            return (java.lang.String) et0Var2.xiZrDbcSW0;
                        }
                        return null;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        java.lang.String str8 = (java.lang.String) en0Var.SH1y5HwkJhh.getValue();
                        if (str8 != null) {
                            return new defpackage.uz0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.SH1y5HwkJhh = defpackage.c80.NHJTzaLwkd(ed0Var, new defpackage.vz(this) { // from class: bn0
            public final /* synthetic */ defpackage.en0 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                java.util.List list;
                int i22 = i6;
                defpackage.en0 en0Var = this.xiZrDbcSW0;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = en0Var.r1MBDhnF;
                        if (str2 != null) {
                            return new defpackage.uz0(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = en0Var.IHQe1A4L2xu;
                        defpackage.uz0 uz0Var = defpackage.en0.kd6TUFXn;
                        uz0Var.getClass();
                        return java.lang.Boolean.valueOf(uz0Var.adDC3e2L.matcher(str3).matches());
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        java.lang.String str4 = en0Var.IHQe1A4L2xu;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.db.ez2rX8ReCYw("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.td.gG5uWf3dqScO(queryParameters);
                                if (str6 == null) {
                                    en0Var.AARZUJiTa = true;
                                    str6 = str5;
                                }
                                defpackage.uz0 uz0Var2 = defpackage.en0.SyNS6RMn;
                                uz0Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = uz0Var2.adDC3e2L.matcher(str6);
                                matcher.getClass();
                                defpackage.dn0 dn0Var = new defpackage.dn0();
                                int i32 = 0;
                                for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str6); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
                                    defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
                                    oh6vYeIP.getClass();
                                    dn0Var.oh6vYeIP.add(oh6vYeIP.IHQe1A4L2xu);
                                    if (v5Var.EXtogiMhuM().adDC3e2L > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, v5Var.EXtogiMhuM().adDC3e2L));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                dn0Var.IHQe1A4L2xu = defpackage.en0.EXtogiMhuM(sb.toString());
                                linkedHashMap.put(str5, dn0Var);
                            }
                        }
                        return linkedHashMap;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        java.lang.String str7 = en0Var.IHQe1A4L2xu;
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
                        defpackage.en0.IHQe1A4L2xu(fragment, arrayList2, sb2);
                        return new defpackage.et0(arrayList2, sb2.toString());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.et0 et0Var = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        return (et0Var == null || (list = (java.util.List) et0Var.adDC3e2L) == null) ? new java.util.ArrayList() : list;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.et0 et0Var2 = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        if (et0Var2 != null) {
                            return (java.lang.String) et0Var2.xiZrDbcSW0;
                        }
                        return null;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        java.lang.String str8 = (java.lang.String) en0Var.SH1y5HwkJhh.getValue();
                        if (str8 != null) {
                            return new defpackage.uz0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.ez2rX8ReCYw = new defpackage.le1(new defpackage.vz(this) { // from class: bn0
            public final /* synthetic */ defpackage.en0 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                java.util.List list;
                int i22 = i7;
                defpackage.en0 en0Var = this.xiZrDbcSW0;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = en0Var.r1MBDhnF;
                        if (str2 != null) {
                            return new defpackage.uz0(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = en0Var.IHQe1A4L2xu;
                        defpackage.uz0 uz0Var = defpackage.en0.kd6TUFXn;
                        uz0Var.getClass();
                        return java.lang.Boolean.valueOf(uz0Var.adDC3e2L.matcher(str3).matches());
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        java.lang.String str4 = en0Var.IHQe1A4L2xu;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.db.ez2rX8ReCYw("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.td.gG5uWf3dqScO(queryParameters);
                                if (str6 == null) {
                                    en0Var.AARZUJiTa = true;
                                    str6 = str5;
                                }
                                defpackage.uz0 uz0Var2 = defpackage.en0.SyNS6RMn;
                                uz0Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = uz0Var2.adDC3e2L.matcher(str6);
                                matcher.getClass();
                                defpackage.dn0 dn0Var = new defpackage.dn0();
                                int i32 = 0;
                                for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str6); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
                                    defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
                                    oh6vYeIP.getClass();
                                    dn0Var.oh6vYeIP.add(oh6vYeIP.IHQe1A4L2xu);
                                    if (v5Var.EXtogiMhuM().adDC3e2L > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, v5Var.EXtogiMhuM().adDC3e2L));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                dn0Var.IHQe1A4L2xu = defpackage.en0.EXtogiMhuM(sb.toString());
                                linkedHashMap.put(str5, dn0Var);
                            }
                        }
                        return linkedHashMap;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        java.lang.String str7 = en0Var.IHQe1A4L2xu;
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
                        defpackage.en0.IHQe1A4L2xu(fragment, arrayList2, sb2);
                        return new defpackage.et0(arrayList2, sb2.toString());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.et0 et0Var = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        return (et0Var == null || (list = (java.util.List) et0Var.adDC3e2L) == null) ? new java.util.ArrayList() : list;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.et0 et0Var2 = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        if (et0Var2 != null) {
                            return (java.lang.String) et0Var2.xiZrDbcSW0;
                        }
                        return null;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        java.lang.String str8 = (java.lang.String) en0Var.SH1y5HwkJhh.getValue();
                        if (str8 != null) {
                            return new defpackage.uz0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new defpackage.le1(new defpackage.vz(this) { // from class: bn0
            public final /* synthetic */ defpackage.en0 xiZrDbcSW0;

            {
                this.xiZrDbcSW0 = this;
            }

            @Override // defpackage.vz
            public final java.lang.Object IHQe1A4L2xu() {
                java.util.List list;
                int i22 = i8;
                defpackage.en0 en0Var = this.xiZrDbcSW0;
                switch (i22) {
                    case 0:
                        java.lang.String str2 = en0Var.r1MBDhnF;
                        if (str2 != null) {
                            return new defpackage.uz0(str2, 0);
                        }
                        return null;
                    case 1:
                        java.lang.String str3 = en0Var.IHQe1A4L2xu;
                        defpackage.uz0 uz0Var = defpackage.en0.kd6TUFXn;
                        uz0Var.getClass();
                        return java.lang.Boolean.valueOf(uz0Var.adDC3e2L.matcher(str3).matches());
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        java.lang.String str4 = en0Var.IHQe1A4L2xu;
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        if (((java.lang.Boolean) en0Var.adDC3e2L.getValue()).booleanValue()) {
                            android.net.Uri parse = android.net.Uri.parse(str4);
                            parse.getClass();
                            for (java.lang.String str5 : parse.getQueryParameterNames()) {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.util.List<java.lang.String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    defpackage.db.ez2rX8ReCYw("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                java.lang.String str6 = (java.lang.String) defpackage.td.gG5uWf3dqScO(queryParameters);
                                if (str6 == null) {
                                    en0Var.AARZUJiTa = true;
                                    str6 = str5;
                                }
                                defpackage.uz0 uz0Var2 = defpackage.en0.SyNS6RMn;
                                uz0Var2.getClass();
                                str6.getClass();
                                java.util.regex.Matcher matcher = uz0Var2.adDC3e2L.matcher(str6);
                                matcher.getClass();
                                defpackage.dn0 dn0Var = new defpackage.dn0();
                                int i32 = 0;
                                for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str6); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
                                    defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
                                    oh6vYeIP.getClass();
                                    dn0Var.oh6vYeIP.add(oh6vYeIP.IHQe1A4L2xu);
                                    if (v5Var.EXtogiMhuM().adDC3e2L > i32) {
                                        java.lang.String quote = java.util.regex.Pattern.quote(str6.substring(i32, v5Var.EXtogiMhuM().adDC3e2L));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
                                }
                                if (i32 < str6.length()) {
                                    java.lang.String quote2 = java.util.regex.Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                dn0Var.IHQe1A4L2xu = defpackage.en0.EXtogiMhuM(sb.toString());
                                linkedHashMap.put(str5, dn0Var);
                            }
                        }
                        return linkedHashMap;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        java.lang.String str7 = en0Var.IHQe1A4L2xu;
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
                        defpackage.en0.IHQe1A4L2xu(fragment, arrayList2, sb2);
                        return new defpackage.et0(arrayList2, sb2.toString());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        defpackage.et0 et0Var = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        return (et0Var == null || (list = (java.util.List) et0Var.adDC3e2L) == null) ? new java.util.ArrayList() : list;
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.et0 et0Var2 = (defpackage.et0) en0Var.EXtogiMhuM.getValue();
                        if (et0Var2 != null) {
                            return (java.lang.String) et0Var2.xiZrDbcSW0;
                        }
                        return null;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        java.lang.String str8 = (java.lang.String) en0Var.SH1y5HwkJhh.getValue();
                        if (str8 != null) {
                            return new defpackage.uz0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        java.lang.StringBuilder sb = new java.lang.StringBuilder("^");
        if (!DFo87pBq1E5.adDC3e2L.matcher(str).find()) {
            java.lang.String pattern = cnag84Bm.adDC3e2L.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\\?|#|$)");
        compile.getClass();
        java.util.regex.Matcher matcher = compile.matcher(str);
        matcher.getClass();
        defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str);
        if (v5Var != null) {
            IHQe1A4L2xu(str.substring(0, v5Var.EXtogiMhuM().adDC3e2L), arrayList, sb);
            if (!QoRHpC4k.adDC3e2L.matcher(sb).find() && !G3OKOH3wZRC.adDC3e2L.matcher(sb).find()) {
                z = true;
            }
            this.JlrlGoKF = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.r1MBDhnF = EXtogiMhuM(sb.toString());
    }

    public static void AARZUJiTa(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, defpackage.mm0 mm0Var) {
        if (mm0Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            defpackage.eo0 eo0Var = mm0Var.IHQe1A4L2xu;
            str.getClass();
            eo0Var.adDC3e2L(bundle, str, eo0Var.F7NU4MC0GW(str2));
        }
    }

    public static java.lang.String EXtogiMhuM(java.lang.String str) {
        return (defpackage.rc1.AsxAYCCkb3Hi(str, "\\Q", false) && defpackage.rc1.AsxAYCCkb3Hi(str, "\\E", false)) ? defpackage.yc1.EoOhNTTfIN7K(str, ".*", "\\E.*\\Q") : defpackage.rc1.AsxAYCCkb3Hi(str, "\\.\\*", false) ? defpackage.yc1.EoOhNTTfIN7K(str, "\\.\\*", ".*") : str;
    }

    public static void IHQe1A4L2xu(java.lang.String str, java.util.ArrayList arrayList, java.lang.StringBuilder sb) {
        defpackage.uz0 uz0Var = SyNS6RMn;
        uz0Var.getClass();
        java.util.regex.Matcher matcher = uz0Var.adDC3e2L.matcher(str);
        matcher.getClass();
        int i = 0;
        for (defpackage.v5 v5Var = !matcher.find(0) ? null : new defpackage.v5(matcher, str); v5Var != null; v5Var = v5Var.DFo87pBq1E5()) {
            defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(1);
            oh6vYeIP.getClass();
            arrayList.add(oh6vYeIP.IHQe1A4L2xu);
            if (v5Var.EXtogiMhuM().adDC3e2L > i) {
                java.lang.String quote = java.util.regex.Pattern.quote(str.substring(i, v5Var.EXtogiMhuM().adDC3e2L));
                quote.getClass();
                sb.append(quote);
            }
            java.lang.String pattern = G3OKOH3wZRC.adDC3e2L.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = v5Var.EXtogiMhuM().xiZrDbcSW0 + 1;
        }
        if (i < str.length()) {
            java.lang.String quote2 = java.util.regex.Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public final android.os.Bundle F7NU4MC0GW(android.net.Uri uri, java.util.LinkedHashMap linkedHashMap) {
        defpackage.v5 IHQe1A4L2xu;
        defpackage.v5 IHQe1A4L2xu2;
        java.lang.String str;
        uri.getClass();
        linkedHashMap.getClass();
        defpackage.uz0 uz0Var = (defpackage.uz0) this.F7NU4MC0GW.getValue();
        if (uz0Var != null && (IHQe1A4L2xu = uz0Var.IHQe1A4L2xu(uri.toString())) != null) {
            android.os.Bundle SyNS6RMn2 = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
            if (adDC3e2L(IHQe1A4L2xu, SyNS6RMn2, linkedHashMap) && (!((java.lang.Boolean) this.adDC3e2L.getValue()).booleanValue() || xiZrDbcSW0(uri, SyNS6RMn2, linkedHashMap))) {
                java.lang.String fragment = uri.getFragment();
                defpackage.uz0 uz0Var2 = (defpackage.uz0) this.ez2rX8ReCYw.getValue();
                if (uz0Var2 != null && (IHQe1A4L2xu2 = uz0Var2.IHQe1A4L2xu(java.lang.String.valueOf(fragment))) != null) {
                    java.util.List list = (java.util.List) this.riuEU0zW4.getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(list, 10));
                    int i = 0;
                    for (java.lang.Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            defpackage.fm.hkbnNdmy();
                            throw null;
                        }
                        java.lang.String str2 = (java.lang.String) obj;
                        defpackage.zh0 oh6vYeIP = ((defpackage.ai0) IHQe1A4L2xu2.F7NU4MC0GW).oh6vYeIP(i2);
                        if (oh6vYeIP != null) {
                            str = android.net.Uri.decode(oh6vYeIP.IHQe1A4L2xu);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            AARZUJiTa(SyNS6RMn2, str2, str, (defpackage.mm0) linkedHashMap.get(str2));
                            arrayList.add(defpackage.ok1.IHQe1A4L2xu);
                            i = i2;
                        } catch (java.lang.IllegalArgumentException unused) {
                        }
                    }
                }
                if (defpackage.j70.abhbClRa(linkedHashMap, new defpackage.cn0(SyNS6RMn2, 0)).isEmpty()) {
                    return SyNS6RMn2;
                }
            }
        }
        return null;
    }

    public final boolean adDC3e2L(defpackage.v5 v5Var, android.os.Bundle bundle, java.util.Map map) {
        java.util.ArrayList arrayList = this.oh6vYeIP;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            java.lang.Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            java.lang.String str = null;
            if (i < 0) {
                defpackage.fm.hkbnNdmy();
                throw null;
            }
            java.lang.String str2 = (java.lang.String) obj;
            defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(i3);
            if (oh6vYeIP != null) {
                str = android.net.Uri.decode(oh6vYeIP.IHQe1A4L2xu);
                str.getClass();
            }
            if (str == null) {
                str = "";
            }
            try {
                AARZUJiTa(bundle, str2, str, (defpackage.mm0) map.get(str2));
                arrayList2.add(defpackage.ok1.IHQe1A4L2xu);
                i = i3;
            } catch (java.lang.IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof defpackage.en0)) {
            return false;
        }
        return this.IHQe1A4L2xu.equals(((defpackage.en0) obj).IHQe1A4L2xu);
    }

    public final int hashCode() {
        return this.IHQe1A4L2xu.hashCode() * 961;
    }

    public final int oh6vYeIP(android.net.Uri uri) {
        if (uri == null) {
            return 0;
        }
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        android.net.Uri parse = android.net.Uri.parse(this.IHQe1A4L2xu);
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

    public final java.util.ArrayList r1MBDhnF() {
        java.util.Collection values = ((java.util.Map) this.xiZrDbcSW0.getValue()).values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            defpackage.yd.AsxAYCCkb3Hi(arrayList, ((defpackage.dn0) it.next()).oh6vYeIP);
        }
        return defpackage.td.flIYPhR0(defpackage.td.flIYPhR0(this.oh6vYeIP, arrayList), (java.util.List) this.riuEU0zW4.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean xiZrDbcSW0(android.net.Uri uri, android.os.Bundle bundle, java.util.Map map) {
        defpackage.v5 v5Var;
        java.lang.Object obj;
        boolean z;
        java.lang.Object obj2;
        java.lang.String query;
        defpackage.en0 en0Var = this;
        java.util.Map map2 = map;
        for (java.util.Map.Entry entry : ((java.util.Map) en0Var.xiZrDbcSW0.getValue()).entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.dn0 dn0Var = (defpackage.dn0) entry.getValue();
            java.util.List<java.lang.String> queryParameters = uri.getQueryParameters(str);
            if (en0Var.AARZUJiTa && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = defpackage.fm.p4kuH6PDtgom(query);
            }
            defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
            boolean z2 = false;
            android.os.Bundle SyNS6RMn2 = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
            java.util.ArrayList arrayList = dn0Var.oh6vYeIP;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj3 = arrayList.get(i);
                i++;
                java.lang.String str2 = (java.lang.String) obj3;
                defpackage.mm0 mm0Var = (defpackage.mm0) map2.get(str2);
                defpackage.eo0 eo0Var = mm0Var != null ? mm0Var.IHQe1A4L2xu : null;
                if ((eo0Var instanceof defpackage.k8) && !mm0Var.oh6vYeIP) {
                    defpackage.k8 k8Var = (defpackage.k8) eo0Var;
                    switch (k8Var.adDC3e2L) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 1:
                            obj2 = new float[0];
                            break;
                        case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                            obj2 = new int[0];
                            break;
                        case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                            obj2 = new long[0];
                            break;
                        default:
                            obj2 = new java.lang.String[0];
                            break;
                    }
                    k8Var.adDC3e2L(SyNS6RMn2, str2, obj2);
                }
            }
            java.util.Map map3 = map2;
            for (java.lang.String str3 : queryParameters) {
                java.lang.String str4 = dn0Var.IHQe1A4L2xu;
                if (str4 != null) {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str4);
                    compile.getClass();
                    str3.getClass();
                    java.util.regex.Matcher matcher = compile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        v5Var = new defpackage.v5(matcher, str3);
                        if (v5Var != null) {
                            return z2;
                        }
                        java.util.ArrayList arrayList2 = dn0Var.oh6vYeIP;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(arrayList2, 10));
                        int size2 = arrayList2.size();
                        boolean z3 = z2;
                        int i2 = z3 ? 1 : 0;
                        java.util.Map map4 = map3;
                        ?? r14 = z3;
                        while (i2 < size2) {
                            java.lang.Object obj4 = arrayList2.get(i2);
                            i2++;
                            int i3 = r14 + 1;
                            if (r14 < 0) {
                                defpackage.fm.hkbnNdmy();
                                throw null;
                            }
                            java.lang.String str5 = (java.lang.String) obj4;
                            defpackage.zh0 oh6vYeIP = ((defpackage.ai0) v5Var.F7NU4MC0GW).oh6vYeIP(i3);
                            java.lang.String str6 = oh6vYeIP != null ? oh6vYeIP.IHQe1A4L2xu : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            defpackage.mm0 mm0Var2 = (defpackage.mm0) map4.get(str5);
                            try {
                                str5.getClass();
                            } catch (java.lang.IllegalArgumentException unused) {
                            }
                            if (SyNS6RMn2.containsKey(str5)) {
                                if (SyNS6RMn2.containsKey(str5)) {
                                    if (mm0Var2 != null) {
                                        defpackage.eo0 eo0Var2 = mm0Var2.IHQe1A4L2xu;
                                        java.lang.Object IHQe1A4L2xu = eo0Var2.IHQe1A4L2xu(SyNS6RMn2, str5);
                                        if (!SyNS6RMn2.containsKey(str5)) {
                                            throw new java.lang.IllegalArgumentException("There is no previous value in this savedState.");
                                        }
                                        eo0Var2.adDC3e2L(SyNS6RMn2, str5, eo0Var2.r1MBDhnF(IHQe1A4L2xu, str6));
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
                                AARZUJiTa(SyNS6RMn2, str5, str6, mm0Var2);
                                obj = ok1Var;
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            }
                        }
                        map3 = map;
                    }
                }
                v5Var = null;
                if (v5Var != null) {
                }
            }
            bundle.putAll(SyNS6RMn2);
            en0Var = this;
            map2 = map;
        }
        return true;
    }
}
