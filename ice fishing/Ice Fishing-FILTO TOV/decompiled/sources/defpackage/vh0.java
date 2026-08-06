package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class vh0 {
    public boolean AvO7iQsrTN;
    public final boolean E7jCp8Ls;
    public final z60 EljAMC1QTz;
    public final String GWasM1elztuh;
    public final z60 JFJ3QoxA;
    public final m71 OOA6hdeuvCS;
    public final String X1lG3V04pd;
    public final ArrayList Yi7zF1RB1;
    public final z60 encWxUiV2;
    public final z60 mOu10nynGul;
    public final m71 rQPn8YBR;
    public final m71 xqGvceK5x;
    public static final ut0 XnEVoBF0td1l = new ut0("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final ut0 uFEq9NpZ = new ut0("\\{(.+?)\\}");
    public static final ut0 iwATDS1i01k = new ut0("http[s]?://");
    public static final ut0 WIEu4Ya2g8 = new ut0(".*");
    public static final ut0 YmKjaVtbfp5Z = new ut0("([^/]*?|)");
    public static final ut0 Mjvvu5DE = new ut0("^[^?#]+\\?([^#]*).*");

    public vh0(String str) {
        this.GWasM1elztuh = str;
        ArrayList arrayList = new ArrayList();
        this.Yi7zF1RB1 = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.xqGvceK5x = new m71(new wu(this) { // from class: sh0
            public final /* synthetic */ vh0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                List list;
                int i2 = i;
                vh0 vh0Var = this.EljAMC1QTz;
                switch (i2) {
                    case 0:
                        String str2 = vh0Var.X1lG3V04pd;
                        if (str2 != null) {
                            return new ut0(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = vh0Var.GWasM1elztuh;
                        ut0 ut0Var = vh0.Mjvvu5DE;
                        ut0Var.getClass();
                        return Boolean.valueOf(ut0Var.OOA6hdeuvCS.matcher(str3).matches());
                    case 2:
                        String str4 = vh0Var.GWasM1elztuh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    o4.JFJ3QoxA("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) rb.YTyqgZhdF(queryParameters);
                                if (str6 == null) {
                                    vh0Var.AvO7iQsrTN = true;
                                    str6 = str5;
                                }
                                ut0 ut0Var2 = vh0.uFEq9NpZ;
                                ut0Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ut0Var2.OOA6hdeuvCS.matcher(str6);
                                matcher.getClass();
                                uh0 uh0Var = new uh0();
                                int i3 = 0;
                                for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str6); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
                                    sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
                                    Yi7zF1RB1.getClass();
                                    uh0Var.Yi7zF1RB1.add(Yi7zF1RB1.GWasM1elztuh);
                                    if (f4Var.encWxUiV2().OOA6hdeuvCS > i3) {
                                        String quote = Pattern.quote(str6.substring(i3, f4Var.encWxUiV2().OOA6hdeuvCS));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = f4Var.encWxUiV2().EljAMC1QTz + 1;
                                }
                                if (i3 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                uh0Var.GWasM1elztuh = vh0.encWxUiV2(sb.toString());
                                linkedHashMap.put(str5, uh0Var);
                            }
                        }
                        return linkedHashMap;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = vh0Var.GWasM1elztuh;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        vh0.GWasM1elztuh(fragment, arrayList2, sb2);
                        return new rn0(arrayList2, sb2.toString());
                    case 4:
                        rn0 rn0Var = (rn0) vh0Var.encWxUiV2.getValue();
                        return (rn0Var == null || (list = (List) rn0Var.OOA6hdeuvCS) == null) ? new ArrayList() : list;
                    case 5:
                        rn0 rn0Var2 = (rn0) vh0Var.encWxUiV2.getValue();
                        if (rn0Var2 != null) {
                            return (String) rn0Var2.EljAMC1QTz;
                        }
                        return null;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) vh0Var.JFJ3QoxA.getValue();
                        if (str8 != null) {
                            return new ut0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.OOA6hdeuvCS = new m71(new wu(this) { // from class: sh0
            public final /* synthetic */ vh0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                List list;
                int i22 = i2;
                vh0 vh0Var = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        String str2 = vh0Var.X1lG3V04pd;
                        if (str2 != null) {
                            return new ut0(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = vh0Var.GWasM1elztuh;
                        ut0 ut0Var = vh0.Mjvvu5DE;
                        ut0Var.getClass();
                        return Boolean.valueOf(ut0Var.OOA6hdeuvCS.matcher(str3).matches());
                    case 2:
                        String str4 = vh0Var.GWasM1elztuh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    o4.JFJ3QoxA("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) rb.YTyqgZhdF(queryParameters);
                                if (str6 == null) {
                                    vh0Var.AvO7iQsrTN = true;
                                    str6 = str5;
                                }
                                ut0 ut0Var2 = vh0.uFEq9NpZ;
                                ut0Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ut0Var2.OOA6hdeuvCS.matcher(str6);
                                matcher.getClass();
                                uh0 uh0Var = new uh0();
                                int i3 = 0;
                                for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str6); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
                                    sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
                                    Yi7zF1RB1.getClass();
                                    uh0Var.Yi7zF1RB1.add(Yi7zF1RB1.GWasM1elztuh);
                                    if (f4Var.encWxUiV2().OOA6hdeuvCS > i3) {
                                        String quote = Pattern.quote(str6.substring(i3, f4Var.encWxUiV2().OOA6hdeuvCS));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = f4Var.encWxUiV2().EljAMC1QTz + 1;
                                }
                                if (i3 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                uh0Var.GWasM1elztuh = vh0.encWxUiV2(sb.toString());
                                linkedHashMap.put(str5, uh0Var);
                            }
                        }
                        return linkedHashMap;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = vh0Var.GWasM1elztuh;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        vh0.GWasM1elztuh(fragment, arrayList2, sb2);
                        return new rn0(arrayList2, sb2.toString());
                    case 4:
                        rn0 rn0Var = (rn0) vh0Var.encWxUiV2.getValue();
                        return (rn0Var == null || (list = (List) rn0Var.OOA6hdeuvCS) == null) ? new ArrayList() : list;
                    case 5:
                        rn0 rn0Var2 = (rn0) vh0Var.encWxUiV2.getValue();
                        if (rn0Var2 != null) {
                            return (String) rn0Var2.EljAMC1QTz;
                        }
                        return null;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) vh0Var.JFJ3QoxA.getValue();
                        if (str8 != null) {
                            return new ut0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        wu wuVar = new wu(this) { // from class: sh0
            public final /* synthetic */ vh0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                List list;
                int i22 = i3;
                vh0 vh0Var = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        String str2 = vh0Var.X1lG3V04pd;
                        if (str2 != null) {
                            return new ut0(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = vh0Var.GWasM1elztuh;
                        ut0 ut0Var = vh0.Mjvvu5DE;
                        ut0Var.getClass();
                        return Boolean.valueOf(ut0Var.OOA6hdeuvCS.matcher(str3).matches());
                    case 2:
                        String str4 = vh0Var.GWasM1elztuh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    o4.JFJ3QoxA("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) rb.YTyqgZhdF(queryParameters);
                                if (str6 == null) {
                                    vh0Var.AvO7iQsrTN = true;
                                    str6 = str5;
                                }
                                ut0 ut0Var2 = vh0.uFEq9NpZ;
                                ut0Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ut0Var2.OOA6hdeuvCS.matcher(str6);
                                matcher.getClass();
                                uh0 uh0Var = new uh0();
                                int i32 = 0;
                                for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str6); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
                                    sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
                                    Yi7zF1RB1.getClass();
                                    uh0Var.Yi7zF1RB1.add(Yi7zF1RB1.GWasM1elztuh);
                                    if (f4Var.encWxUiV2().OOA6hdeuvCS > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, f4Var.encWxUiV2().OOA6hdeuvCS));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f4Var.encWxUiV2().EljAMC1QTz + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                uh0Var.GWasM1elztuh = vh0.encWxUiV2(sb.toString());
                                linkedHashMap.put(str5, uh0Var);
                            }
                        }
                        return linkedHashMap;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = vh0Var.GWasM1elztuh;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        vh0.GWasM1elztuh(fragment, arrayList2, sb2);
                        return new rn0(arrayList2, sb2.toString());
                    case 4:
                        rn0 rn0Var = (rn0) vh0Var.encWxUiV2.getValue();
                        return (rn0Var == null || (list = (List) rn0Var.OOA6hdeuvCS) == null) ? new ArrayList() : list;
                    case 5:
                        rn0 rn0Var2 = (rn0) vh0Var.encWxUiV2.getValue();
                        if (rn0Var2 != null) {
                            return (String) rn0Var2.EljAMC1QTz;
                        }
                        return null;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) vh0Var.JFJ3QoxA.getValue();
                        if (str8 != null) {
                            return new ut0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        a90 a90Var = a90.OOA6hdeuvCS;
        this.EljAMC1QTz = d70.arNh8D4Z5gB(a90Var, wuVar);
        final int i4 = 3;
        this.encWxUiV2 = d70.arNh8D4Z5gB(a90Var, new wu(this) { // from class: sh0
            public final /* synthetic */ vh0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                List list;
                int i22 = i4;
                vh0 vh0Var = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        String str2 = vh0Var.X1lG3V04pd;
                        if (str2 != null) {
                            return new ut0(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = vh0Var.GWasM1elztuh;
                        ut0 ut0Var = vh0.Mjvvu5DE;
                        ut0Var.getClass();
                        return Boolean.valueOf(ut0Var.OOA6hdeuvCS.matcher(str3).matches());
                    case 2:
                        String str4 = vh0Var.GWasM1elztuh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    o4.JFJ3QoxA("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) rb.YTyqgZhdF(queryParameters);
                                if (str6 == null) {
                                    vh0Var.AvO7iQsrTN = true;
                                    str6 = str5;
                                }
                                ut0 ut0Var2 = vh0.uFEq9NpZ;
                                ut0Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ut0Var2.OOA6hdeuvCS.matcher(str6);
                                matcher.getClass();
                                uh0 uh0Var = new uh0();
                                int i32 = 0;
                                for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str6); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
                                    sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
                                    Yi7zF1RB1.getClass();
                                    uh0Var.Yi7zF1RB1.add(Yi7zF1RB1.GWasM1elztuh);
                                    if (f4Var.encWxUiV2().OOA6hdeuvCS > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, f4Var.encWxUiV2().OOA6hdeuvCS));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f4Var.encWxUiV2().EljAMC1QTz + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                uh0Var.GWasM1elztuh = vh0.encWxUiV2(sb.toString());
                                linkedHashMap.put(str5, uh0Var);
                            }
                        }
                        return linkedHashMap;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = vh0Var.GWasM1elztuh;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        vh0.GWasM1elztuh(fragment, arrayList2, sb2);
                        return new rn0(arrayList2, sb2.toString());
                    case 4:
                        rn0 rn0Var = (rn0) vh0Var.encWxUiV2.getValue();
                        return (rn0Var == null || (list = (List) rn0Var.OOA6hdeuvCS) == null) ? new ArrayList() : list;
                    case 5:
                        rn0 rn0Var2 = (rn0) vh0Var.encWxUiV2.getValue();
                        if (rn0Var2 != null) {
                            return (String) rn0Var2.EljAMC1QTz;
                        }
                        return null;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) vh0Var.JFJ3QoxA.getValue();
                        if (str8 != null) {
                            return new ut0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.mOu10nynGul = d70.arNh8D4Z5gB(a90Var, new wu(this) { // from class: sh0
            public final /* synthetic */ vh0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                List list;
                int i22 = i5;
                vh0 vh0Var = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        String str2 = vh0Var.X1lG3V04pd;
                        if (str2 != null) {
                            return new ut0(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = vh0Var.GWasM1elztuh;
                        ut0 ut0Var = vh0.Mjvvu5DE;
                        ut0Var.getClass();
                        return Boolean.valueOf(ut0Var.OOA6hdeuvCS.matcher(str3).matches());
                    case 2:
                        String str4 = vh0Var.GWasM1elztuh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    o4.JFJ3QoxA("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) rb.YTyqgZhdF(queryParameters);
                                if (str6 == null) {
                                    vh0Var.AvO7iQsrTN = true;
                                    str6 = str5;
                                }
                                ut0 ut0Var2 = vh0.uFEq9NpZ;
                                ut0Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ut0Var2.OOA6hdeuvCS.matcher(str6);
                                matcher.getClass();
                                uh0 uh0Var = new uh0();
                                int i32 = 0;
                                for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str6); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
                                    sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
                                    Yi7zF1RB1.getClass();
                                    uh0Var.Yi7zF1RB1.add(Yi7zF1RB1.GWasM1elztuh);
                                    if (f4Var.encWxUiV2().OOA6hdeuvCS > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, f4Var.encWxUiV2().OOA6hdeuvCS));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f4Var.encWxUiV2().EljAMC1QTz + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                uh0Var.GWasM1elztuh = vh0.encWxUiV2(sb.toString());
                                linkedHashMap.put(str5, uh0Var);
                            }
                        }
                        return linkedHashMap;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = vh0Var.GWasM1elztuh;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        vh0.GWasM1elztuh(fragment, arrayList2, sb2);
                        return new rn0(arrayList2, sb2.toString());
                    case 4:
                        rn0 rn0Var = (rn0) vh0Var.encWxUiV2.getValue();
                        return (rn0Var == null || (list = (List) rn0Var.OOA6hdeuvCS) == null) ? new ArrayList() : list;
                    case 5:
                        rn0 rn0Var2 = (rn0) vh0Var.encWxUiV2.getValue();
                        if (rn0Var2 != null) {
                            return (String) rn0Var2.EljAMC1QTz;
                        }
                        return null;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) vh0Var.JFJ3QoxA.getValue();
                        if (str8 != null) {
                            return new ut0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.JFJ3QoxA = d70.arNh8D4Z5gB(a90Var, new wu(this) { // from class: sh0
            public final /* synthetic */ vh0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                List list;
                int i22 = i6;
                vh0 vh0Var = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        String str2 = vh0Var.X1lG3V04pd;
                        if (str2 != null) {
                            return new ut0(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = vh0Var.GWasM1elztuh;
                        ut0 ut0Var = vh0.Mjvvu5DE;
                        ut0Var.getClass();
                        return Boolean.valueOf(ut0Var.OOA6hdeuvCS.matcher(str3).matches());
                    case 2:
                        String str4 = vh0Var.GWasM1elztuh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    o4.JFJ3QoxA("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) rb.YTyqgZhdF(queryParameters);
                                if (str6 == null) {
                                    vh0Var.AvO7iQsrTN = true;
                                    str6 = str5;
                                }
                                ut0 ut0Var2 = vh0.uFEq9NpZ;
                                ut0Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ut0Var2.OOA6hdeuvCS.matcher(str6);
                                matcher.getClass();
                                uh0 uh0Var = new uh0();
                                int i32 = 0;
                                for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str6); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
                                    sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
                                    Yi7zF1RB1.getClass();
                                    uh0Var.Yi7zF1RB1.add(Yi7zF1RB1.GWasM1elztuh);
                                    if (f4Var.encWxUiV2().OOA6hdeuvCS > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, f4Var.encWxUiV2().OOA6hdeuvCS));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f4Var.encWxUiV2().EljAMC1QTz + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                uh0Var.GWasM1elztuh = vh0.encWxUiV2(sb.toString());
                                linkedHashMap.put(str5, uh0Var);
                            }
                        }
                        return linkedHashMap;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = vh0Var.GWasM1elztuh;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        vh0.GWasM1elztuh(fragment, arrayList2, sb2);
                        return new rn0(arrayList2, sb2.toString());
                    case 4:
                        rn0 rn0Var = (rn0) vh0Var.encWxUiV2.getValue();
                        return (rn0Var == null || (list = (List) rn0Var.OOA6hdeuvCS) == null) ? new ArrayList() : list;
                    case 5:
                        rn0 rn0Var2 = (rn0) vh0Var.encWxUiV2.getValue();
                        if (rn0Var2 != null) {
                            return (String) rn0Var2.EljAMC1QTz;
                        }
                        return null;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) vh0Var.JFJ3QoxA.getValue();
                        if (str8 != null) {
                            return new ut0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.rQPn8YBR = new m71(new wu(this) { // from class: sh0
            public final /* synthetic */ vh0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                List list;
                int i22 = i7;
                vh0 vh0Var = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        String str2 = vh0Var.X1lG3V04pd;
                        if (str2 != null) {
                            return new ut0(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = vh0Var.GWasM1elztuh;
                        ut0 ut0Var = vh0.Mjvvu5DE;
                        ut0Var.getClass();
                        return Boolean.valueOf(ut0Var.OOA6hdeuvCS.matcher(str3).matches());
                    case 2:
                        String str4 = vh0Var.GWasM1elztuh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    o4.JFJ3QoxA("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) rb.YTyqgZhdF(queryParameters);
                                if (str6 == null) {
                                    vh0Var.AvO7iQsrTN = true;
                                    str6 = str5;
                                }
                                ut0 ut0Var2 = vh0.uFEq9NpZ;
                                ut0Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ut0Var2.OOA6hdeuvCS.matcher(str6);
                                matcher.getClass();
                                uh0 uh0Var = new uh0();
                                int i32 = 0;
                                for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str6); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
                                    sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
                                    Yi7zF1RB1.getClass();
                                    uh0Var.Yi7zF1RB1.add(Yi7zF1RB1.GWasM1elztuh);
                                    if (f4Var.encWxUiV2().OOA6hdeuvCS > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, f4Var.encWxUiV2().OOA6hdeuvCS));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f4Var.encWxUiV2().EljAMC1QTz + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                uh0Var.GWasM1elztuh = vh0.encWxUiV2(sb.toString());
                                linkedHashMap.put(str5, uh0Var);
                            }
                        }
                        return linkedHashMap;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = vh0Var.GWasM1elztuh;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        vh0.GWasM1elztuh(fragment, arrayList2, sb2);
                        return new rn0(arrayList2, sb2.toString());
                    case 4:
                        rn0 rn0Var = (rn0) vh0Var.encWxUiV2.getValue();
                        return (rn0Var == null || (list = (List) rn0Var.OOA6hdeuvCS) == null) ? new ArrayList() : list;
                    case 5:
                        rn0 rn0Var2 = (rn0) vh0Var.encWxUiV2.getValue();
                        if (rn0Var2 != null) {
                            return (String) rn0Var2.EljAMC1QTz;
                        }
                        return null;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) vh0Var.JFJ3QoxA.getValue();
                        if (str8 != null) {
                            return new ut0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new m71(new wu(this) { // from class: sh0
            public final /* synthetic */ vh0 EljAMC1QTz;

            {
                this.EljAMC1QTz = this;
            }

            @Override // defpackage.wu
            public final Object GWasM1elztuh() {
                List list;
                int i22 = i8;
                vh0 vh0Var = this.EljAMC1QTz;
                switch (i22) {
                    case 0:
                        String str2 = vh0Var.X1lG3V04pd;
                        if (str2 != null) {
                            return new ut0(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = vh0Var.GWasM1elztuh;
                        ut0 ut0Var = vh0.Mjvvu5DE;
                        ut0Var.getClass();
                        return Boolean.valueOf(ut0Var.OOA6hdeuvCS.matcher(str3).matches());
                    case 2:
                        String str4 = vh0Var.GWasM1elztuh;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vh0Var.OOA6hdeuvCS.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    o4.JFJ3QoxA("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) rb.YTyqgZhdF(queryParameters);
                                if (str6 == null) {
                                    vh0Var.AvO7iQsrTN = true;
                                    str6 = str5;
                                }
                                ut0 ut0Var2 = vh0.uFEq9NpZ;
                                ut0Var2.getClass();
                                str6.getClass();
                                Matcher matcher = ut0Var2.OOA6hdeuvCS.matcher(str6);
                                matcher.getClass();
                                uh0 uh0Var = new uh0();
                                int i32 = 0;
                                for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str6); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
                                    sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
                                    Yi7zF1RB1.getClass();
                                    uh0Var.Yi7zF1RB1.add(Yi7zF1RB1.GWasM1elztuh);
                                    if (f4Var.encWxUiV2().OOA6hdeuvCS > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, f4Var.encWxUiV2().OOA6hdeuvCS));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f4Var.encWxUiV2().EljAMC1QTz + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                uh0Var.GWasM1elztuh = vh0.encWxUiV2(sb.toString());
                                linkedHashMap.put(str5, uh0Var);
                            }
                        }
                        return linkedHashMap;
                    case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                        String str7 = vh0Var.GWasM1elztuh;
                        Uri parse2 = Uri.parse(str7);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str7);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        vh0.GWasM1elztuh(fragment, arrayList2, sb2);
                        return new rn0(arrayList2, sb2.toString());
                    case 4:
                        rn0 rn0Var = (rn0) vh0Var.encWxUiV2.getValue();
                        return (rn0Var == null || (list = (List) rn0Var.OOA6hdeuvCS) == null) ? new ArrayList() : list;
                    case 5:
                        rn0 rn0Var2 = (rn0) vh0Var.encWxUiV2.getValue();
                        if (rn0Var2 != null) {
                            return (String) rn0Var2.EljAMC1QTz;
                        }
                        return null;
                    case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) vh0Var.JFJ3QoxA.getValue();
                        if (str8 != null) {
                            return new ut0(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!XnEVoBF0td1l.OOA6hdeuvCS.matcher(str).find()) {
            String pattern = iwATDS1i01k.OOA6hdeuvCS.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str);
        if (f4Var != null) {
            GWasM1elztuh(str.substring(0, f4Var.encWxUiV2().OOA6hdeuvCS), arrayList, sb);
            if (!WIEu4Ya2g8.OOA6hdeuvCS.matcher(sb).find() && !YmKjaVtbfp5Z.OOA6hdeuvCS.matcher(sb).find()) {
                z = true;
            }
            this.E7jCp8Ls = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.X1lG3V04pd = encWxUiV2(sb.toString());
    }

    public static void AvO7iQsrTN(Bundle bundle, String str, String str2, eh0 eh0Var) {
        if (eh0Var == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            ui0 ui0Var = eh0Var.GWasM1elztuh;
            str.getClass();
            ui0Var.OOA6hdeuvCS(bundle, str, ui0Var.xqGvceK5x(str2));
        }
    }

    public static void GWasM1elztuh(String str, ArrayList arrayList, StringBuilder sb) {
        ut0 ut0Var = uFEq9NpZ;
        ut0Var.getClass();
        Matcher matcher = ut0Var.OOA6hdeuvCS.matcher(str);
        matcher.getClass();
        int i = 0;
        for (f4 f4Var = !matcher.find(0) ? null : new f4(matcher, str); f4Var != null; f4Var = f4Var.XnEVoBF0td1l()) {
            sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(1);
            Yi7zF1RB1.getClass();
            arrayList.add(Yi7zF1RB1.GWasM1elztuh);
            if (f4Var.encWxUiV2().OOA6hdeuvCS > i) {
                String quote = Pattern.quote(str.substring(i, f4Var.encWxUiV2().OOA6hdeuvCS));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = YmKjaVtbfp5Z.OOA6hdeuvCS.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = f4Var.encWxUiV2().EljAMC1QTz + 1;
        }
        if (i < str.length()) {
            String quote2 = Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static String encWxUiV2(String str) {
        return (b61.YXi2hvwn7WL(str, "\\Q") && b61.YXi2hvwn7WL(str, "\\E")) ? i61.dqB83aoLBB(str, ".*", "\\E.*\\Q") : b61.YXi2hvwn7WL(str, "\\.\\*") ? i61.dqB83aoLBB(str, "\\.\\*", ".*") : str;
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
    public final boolean EljAMC1QTz(Uri uri, Bundle bundle, Map map) {
        f4 f4Var;
        Object obj;
        boolean z;
        Object obj2;
        String query;
        vh0 vh0Var = this;
        Map map2 = map;
        for (Map.Entry entry : ((Map) vh0Var.EljAMC1QTz.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            uh0 uh0Var = (uh0) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (vh0Var.AvO7iQsrTN && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = fb1.HFYAaqMd6(query);
            }
            kc1 kc1Var = kc1.GWasM1elztuh;
            boolean z2 = false;
            Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
            ArrayList arrayList = uh0Var.Yi7zF1RB1;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                String str2 = (String) obj3;
                eh0 eh0Var = (eh0) map2.get(str2);
                ui0 ui0Var = eh0Var != null ? eh0Var.GWasM1elztuh : null;
                if ((ui0Var instanceof x6) && !eh0Var.Yi7zF1RB1) {
                    x6 x6Var = (x6) ui0Var;
                    switch (x6Var.xqGvceK5x) {
                        case 0:
                            obj2 = new boolean[0];
                            break;
                        case 1:
                            obj2 = new float[0];
                            break;
                        case 2:
                            obj2 = new int[0];
                            break;
                        case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                            obj2 = new long[0];
                            break;
                        default:
                            obj2 = new String[0];
                            break;
                    }
                    x6Var.OOA6hdeuvCS(jivtDDk9H, str2, obj2);
                }
            }
            Map map3 = map2;
            for (String str3 : queryParameters) {
                String str4 = uh0Var.GWasM1elztuh;
                if (str4 != null) {
                    Pattern compile = Pattern.compile(str4);
                    compile.getClass();
                    str3.getClass();
                    Matcher matcher = compile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        f4Var = new f4(matcher, str3);
                        if (f4Var != null) {
                            return z2;
                        }
                        ArrayList arrayList2 = uh0Var.Yi7zF1RB1;
                        ArrayList arrayList3 = new ArrayList(sb.dcDmLGVhzWm(arrayList2, 10));
                        int size2 = arrayList2.size();
                        boolean z3 = z2;
                        int i2 = z3 ? 1 : 0;
                        Map map4 = map3;
                        ?? r14 = z3;
                        while (i2 < size2) {
                            Object obj4 = arrayList2.get(i2);
                            i2++;
                            int i3 = r14 + 1;
                            if (r14 < 0) {
                                fb1.MjxSquD6Av();
                                throw null;
                            }
                            String str5 = (String) obj4;
                            sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(i3);
                            String str6 = Yi7zF1RB1 != null ? Yi7zF1RB1.GWasM1elztuh : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            eh0 eh0Var2 = (eh0) map4.get(str5);
                            try {
                                str5.getClass();
                            } catch (IllegalArgumentException unused) {
                            }
                            if (jivtDDk9H.containsKey(str5)) {
                                if (jivtDDk9H.containsKey(str5)) {
                                    if (eh0Var2 != null) {
                                        ui0 ui0Var2 = eh0Var2.GWasM1elztuh;
                                        Object GWasM1elztuh = ui0Var2.GWasM1elztuh(jivtDDk9H, str5);
                                        if (!jivtDDk9H.containsKey(str5)) {
                                            throw new IllegalArgumentException("There is no previous value in this savedState.");
                                        }
                                        ui0Var2.OOA6hdeuvCS(jivtDDk9H, str5, ui0Var2.X1lG3V04pd(GWasM1elztuh, str6));
                                    }
                                    z = false;
                                } else {
                                    z = true;
                                }
                                obj = Boolean.valueOf(z);
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            } else {
                                AvO7iQsrTN(jivtDDk9H, str5, str6, eh0Var2);
                                obj = kc1Var;
                                arrayList3.add(obj);
                                map4 = map;
                                r14 = i3;
                                z2 = false;
                            }
                        }
                        map3 = map;
                    }
                }
                f4Var = null;
                if (f4Var != null) {
                }
            }
            bundle.putAll(jivtDDk9H);
            vh0Var = this;
            map2 = map;
        }
        return true;
    }

    public final boolean OOA6hdeuvCS(f4 f4Var, Bundle bundle, Map map) {
        ArrayList arrayList = this.Yi7zF1RB1;
        ArrayList arrayList2 = new ArrayList(sb.dcDmLGVhzWm(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String str = null;
            if (i < 0) {
                fb1.MjxSquD6Av();
                throw null;
            }
            String str2 = (String) obj;
            sc0 Yi7zF1RB1 = ((tc0) f4Var.xqGvceK5x).Yi7zF1RB1(i3);
            if (Yi7zF1RB1 != null) {
                str = Uri.decode(Yi7zF1RB1.GWasM1elztuh);
                str.getClass();
            }
            if (str == null) {
                str = "";
            }
            try {
                AvO7iQsrTN(bundle, str2, str, (eh0) map.get(str2));
                arrayList2.add(kc1.GWasM1elztuh);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList X1lG3V04pd() {
        Collection values = ((Map) this.EljAMC1QTz.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            wb.nXl1EmE5(arrayList, ((uh0) it.next()).Yi7zF1RB1);
        }
        return rb.hOpoc9RpANL(rb.hOpoc9RpANL(this.Yi7zF1RB1, arrayList), (List) this.mOu10nynGul.getValue());
    }

    public final int Yi7zF1RB1(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(this.GWasM1elztuh);
        parse.getClass();
        List<String> pathSegments2 = parse.getPathSegments();
        pathSegments.getClass();
        pathSegments2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : pathSegments) {
            if (pathSegments2.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet.size();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof vh0)) {
            return false;
        }
        return this.GWasM1elztuh.equals(((vh0) obj).GWasM1elztuh);
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode() * 961;
    }

    public final Bundle xqGvceK5x(Uri uri, LinkedHashMap linkedHashMap) {
        f4 GWasM1elztuh;
        f4 GWasM1elztuh2;
        String str;
        uri.getClass();
        linkedHashMap.getClass();
        ut0 ut0Var = (ut0) this.xqGvceK5x.getValue();
        if (ut0Var != null && (GWasM1elztuh = ut0Var.GWasM1elztuh(uri.toString())) != null) {
            Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
            if (OOA6hdeuvCS(GWasM1elztuh, jivtDDk9H, linkedHashMap) && (!((Boolean) this.OOA6hdeuvCS.getValue()).booleanValue() || EljAMC1QTz(uri, jivtDDk9H, linkedHashMap))) {
                String fragment = uri.getFragment();
                ut0 ut0Var2 = (ut0) this.rQPn8YBR.getValue();
                if (ut0Var2 != null && (GWasM1elztuh2 = ut0Var2.GWasM1elztuh(String.valueOf(fragment))) != null) {
                    List list = (List) this.mOu10nynGul.getValue();
                    ArrayList arrayList = new ArrayList(sb.dcDmLGVhzWm(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            fb1.MjxSquD6Av();
                            throw null;
                        }
                        String str2 = (String) obj;
                        sc0 Yi7zF1RB1 = ((tc0) GWasM1elztuh2.xqGvceK5x).Yi7zF1RB1(i2);
                        if (Yi7zF1RB1 != null) {
                            str = Uri.decode(Yi7zF1RB1.GWasM1elztuh);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            AvO7iQsrTN(jivtDDk9H, str2, str, (eh0) linkedHashMap.get(str2));
                            arrayList.add(kc1.GWasM1elztuh);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (w60.mE4lRynR(linkedHashMap, new th0(jivtDDk9H, 0)).isEmpty()) {
                    return jivtDDk9H;
                }
            }
        }
        return null;
    }
}
