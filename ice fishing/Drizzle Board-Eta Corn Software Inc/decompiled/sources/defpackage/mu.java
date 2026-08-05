package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class mu {
    public final String MdtA4re8;
    public final String NCTxEWno;
    public final cb0 OnDfzHZD;
    public final cb0 P7K7Inc8;
    public final fo Qr9iLBAD;
    public final String VgvYg0wo;
    public final cb0 b2ZJblxo;
    public final fo eVhOlqcC;
    public boolean jb9XjC4I;
    public final fo k3x7lurq;
    public final cb0 lDXGDhIF;
    public final fo ow5vqvCr;
    public final String qoPGr6Ce;
    public final boolean sjUBp5pO;
    public final ArrayList wxUZMvaN;
    public final String ygLcUYwZ;
    public static final o20 OxcuoDLp = new o20("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final o20 amk52bBQ = new o20("\\{(.+?)\\}");
    public static final o20 KlHjfFWx = new o20("http[s]?://");
    public static final o20 Ey6iv0m0 = new o20(".*");
    public static final o20 I5GHvsYW = new o20("([^/]*?|)");
    public static final o20 RXQxj5Oe = new o20("^[^?#]+\\?([^#]*).*");

    public mu(String str, String str2, String str3) {
        List list;
        List list2;
        this.qoPGr6Ce = str;
        this.NCTxEWno = str2;
        this.MdtA4re8 = str3;
        ArrayList arrayList = new ArrayList();
        this.wxUZMvaN = arrayList;
        final int i = 0;
        this.P7K7Inc8 = new cb0(new ok(this) { // from class: ju
            public final /* synthetic */ mu MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
            
                if (r0.NCTxEWno.matcher(r15).matches() != false) goto L63;
             */
            @Override // defpackage.ok
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object qoPGr6Ce() {
                List list3;
                int i2 = i;
                boolean z = true;
                mu muVar = this.MdtA4re8;
                switch (i2) {
                    case 0:
                        String str4 = muVar.VgvYg0wo;
                        if (str4 != null) {
                            return new o20(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = muVar.qoPGr6Ce;
                        if (str5 != null) {
                            o20 o20Var = mu.RXQxj5Oe;
                            o20Var.getClass();
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    case 2:
                        String str6 = muVar.qoPGr6Ce;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) muVar.b2ZJblxo.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    m1.amk52bBQ("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str8 = (String) x5.VGmz0ccI(queryParameters);
                                if (str8 == null) {
                                    muVar.jb9XjC4I = true;
                                    str8 = str7;
                                }
                                o20 o20Var2 = mu.amk52bBQ;
                                o20Var2.getClass();
                                str8.getClass();
                                Matcher matcher = o20Var2.NCTxEWno.matcher(str8);
                                matcher.getClass();
                                lu luVar = new lu();
                                int i3 = 0;
                                for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str8); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
                                    ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
                                    NCTxEWno.getClass();
                                    luVar.NCTxEWno.add(NCTxEWno.qoPGr6Ce);
                                    if (f0Var.RXQxj5Oe().NCTxEWno > i3) {
                                        String quote = Pattern.quote(str8.substring(i3, f0Var.RXQxj5Oe().NCTxEWno));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = f0Var.RXQxj5Oe().MdtA4re8 + 1;
                                }
                                if (i3 < str8.length()) {
                                    String quote2 = Pattern.quote(str8.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                luVar.qoPGr6Ce = mu.P7K7Inc8(sb.toString());
                                linkedHashMap.put(str7, luVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = muVar.qoPGr6Ce;
                        if (str9 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str9);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str9);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        mu.qoPGr6Ce(fragment, arrayList2, sb2);
                        return new hx(arrayList2, sb2.toString());
                    case 4:
                        hx hxVar = (hx) muVar.eVhOlqcC.getValue();
                        return (hxVar == null || (list3 = (List) hxVar.NCTxEWno) == null) ? new ArrayList() : list3;
                    case 5:
                        hx hxVar2 = (hx) muVar.eVhOlqcC.getValue();
                        if (hxVar2 != null) {
                            return (String) hxVar2.MdtA4re8;
                        }
                        return null;
                    case 6:
                        String str10 = (String) muVar.ow5vqvCr.getValue();
                        if (str10 != null) {
                            return new o20(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = muVar.ygLcUYwZ;
                        if (str11 != null) {
                            return new o20(str11);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.b2ZJblxo = new cb0(new ok(this) { // from class: ju
            public final /* synthetic */ mu MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
            
                if (r0.NCTxEWno.matcher(r15).matches() != false) goto L63;
             */
            @Override // defpackage.ok
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object qoPGr6Ce() {
                List list3;
                int i22 = i2;
                boolean z = true;
                mu muVar = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        String str4 = muVar.VgvYg0wo;
                        if (str4 != null) {
                            return new o20(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = muVar.qoPGr6Ce;
                        if (str5 != null) {
                            o20 o20Var = mu.RXQxj5Oe;
                            o20Var.getClass();
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    case 2:
                        String str6 = muVar.qoPGr6Ce;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) muVar.b2ZJblxo.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    m1.amk52bBQ("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str8 = (String) x5.VGmz0ccI(queryParameters);
                                if (str8 == null) {
                                    muVar.jb9XjC4I = true;
                                    str8 = str7;
                                }
                                o20 o20Var2 = mu.amk52bBQ;
                                o20Var2.getClass();
                                str8.getClass();
                                Matcher matcher = o20Var2.NCTxEWno.matcher(str8);
                                matcher.getClass();
                                lu luVar = new lu();
                                int i3 = 0;
                                for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str8); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
                                    ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
                                    NCTxEWno.getClass();
                                    luVar.NCTxEWno.add(NCTxEWno.qoPGr6Ce);
                                    if (f0Var.RXQxj5Oe().NCTxEWno > i3) {
                                        String quote = Pattern.quote(str8.substring(i3, f0Var.RXQxj5Oe().NCTxEWno));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = f0Var.RXQxj5Oe().MdtA4re8 + 1;
                                }
                                if (i3 < str8.length()) {
                                    String quote2 = Pattern.quote(str8.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                luVar.qoPGr6Ce = mu.P7K7Inc8(sb.toString());
                                linkedHashMap.put(str7, luVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = muVar.qoPGr6Ce;
                        if (str9 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str9);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str9);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        mu.qoPGr6Ce(fragment, arrayList2, sb2);
                        return new hx(arrayList2, sb2.toString());
                    case 4:
                        hx hxVar = (hx) muVar.eVhOlqcC.getValue();
                        return (hxVar == null || (list3 = (List) hxVar.NCTxEWno) == null) ? new ArrayList() : list3;
                    case 5:
                        hx hxVar2 = (hx) muVar.eVhOlqcC.getValue();
                        if (hxVar2 != null) {
                            return (String) hxVar2.MdtA4re8;
                        }
                        return null;
                    case 6:
                        String str10 = (String) muVar.ow5vqvCr.getValue();
                        if (str10 != null) {
                            return new o20(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = muVar.ygLcUYwZ;
                        if (str11 != null) {
                            return new o20(str11);
                        }
                        return null;
                }
            }
        });
        final int i3 = 2;
        ok okVar = new ok(this) { // from class: ju
            public final /* synthetic */ mu MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
            
                if (r0.NCTxEWno.matcher(r15).matches() != false) goto L63;
             */
            @Override // defpackage.ok
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object qoPGr6Ce() {
                List list3;
                int i22 = i3;
                boolean z = true;
                mu muVar = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        String str4 = muVar.VgvYg0wo;
                        if (str4 != null) {
                            return new o20(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = muVar.qoPGr6Ce;
                        if (str5 != null) {
                            o20 o20Var = mu.RXQxj5Oe;
                            o20Var.getClass();
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    case 2:
                        String str6 = muVar.qoPGr6Ce;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) muVar.b2ZJblxo.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    m1.amk52bBQ("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str8 = (String) x5.VGmz0ccI(queryParameters);
                                if (str8 == null) {
                                    muVar.jb9XjC4I = true;
                                    str8 = str7;
                                }
                                o20 o20Var2 = mu.amk52bBQ;
                                o20Var2.getClass();
                                str8.getClass();
                                Matcher matcher = o20Var2.NCTxEWno.matcher(str8);
                                matcher.getClass();
                                lu luVar = new lu();
                                int i32 = 0;
                                for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str8); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
                                    ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
                                    NCTxEWno.getClass();
                                    luVar.NCTxEWno.add(NCTxEWno.qoPGr6Ce);
                                    if (f0Var.RXQxj5Oe().NCTxEWno > i32) {
                                        String quote = Pattern.quote(str8.substring(i32, f0Var.RXQxj5Oe().NCTxEWno));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f0Var.RXQxj5Oe().MdtA4re8 + 1;
                                }
                                if (i32 < str8.length()) {
                                    String quote2 = Pattern.quote(str8.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                luVar.qoPGr6Ce = mu.P7K7Inc8(sb.toString());
                                linkedHashMap.put(str7, luVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = muVar.qoPGr6Ce;
                        if (str9 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str9);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str9);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        mu.qoPGr6Ce(fragment, arrayList2, sb2);
                        return new hx(arrayList2, sb2.toString());
                    case 4:
                        hx hxVar = (hx) muVar.eVhOlqcC.getValue();
                        return (hxVar == null || (list3 = (List) hxVar.NCTxEWno) == null) ? new ArrayList() : list3;
                    case 5:
                        hx hxVar2 = (hx) muVar.eVhOlqcC.getValue();
                        if (hxVar2 != null) {
                            return (String) hxVar2.MdtA4re8;
                        }
                        return null;
                    case 6:
                        String str10 = (String) muVar.ow5vqvCr.getValue();
                        if (str10 != null) {
                            return new o20(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = muVar.ygLcUYwZ;
                        if (str11 != null) {
                            return new o20(str11);
                        }
                        return null;
                }
            }
        };
        io ioVar = io.MdtA4re8;
        this.Qr9iLBAD = w30.eIA6dogk(ioVar, okVar);
        final int i4 = 3;
        this.eVhOlqcC = w30.eIA6dogk(ioVar, new ok(this) { // from class: ju
            public final /* synthetic */ mu MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
            
                if (r0.NCTxEWno.matcher(r15).matches() != false) goto L63;
             */
            @Override // defpackage.ok
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object qoPGr6Ce() {
                List list3;
                int i22 = i4;
                boolean z = true;
                mu muVar = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        String str4 = muVar.VgvYg0wo;
                        if (str4 != null) {
                            return new o20(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = muVar.qoPGr6Ce;
                        if (str5 != null) {
                            o20 o20Var = mu.RXQxj5Oe;
                            o20Var.getClass();
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    case 2:
                        String str6 = muVar.qoPGr6Ce;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) muVar.b2ZJblxo.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    m1.amk52bBQ("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str8 = (String) x5.VGmz0ccI(queryParameters);
                                if (str8 == null) {
                                    muVar.jb9XjC4I = true;
                                    str8 = str7;
                                }
                                o20 o20Var2 = mu.amk52bBQ;
                                o20Var2.getClass();
                                str8.getClass();
                                Matcher matcher = o20Var2.NCTxEWno.matcher(str8);
                                matcher.getClass();
                                lu luVar = new lu();
                                int i32 = 0;
                                for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str8); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
                                    ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
                                    NCTxEWno.getClass();
                                    luVar.NCTxEWno.add(NCTxEWno.qoPGr6Ce);
                                    if (f0Var.RXQxj5Oe().NCTxEWno > i32) {
                                        String quote = Pattern.quote(str8.substring(i32, f0Var.RXQxj5Oe().NCTxEWno));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f0Var.RXQxj5Oe().MdtA4re8 + 1;
                                }
                                if (i32 < str8.length()) {
                                    String quote2 = Pattern.quote(str8.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                luVar.qoPGr6Ce = mu.P7K7Inc8(sb.toString());
                                linkedHashMap.put(str7, luVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = muVar.qoPGr6Ce;
                        if (str9 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str9);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str9);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        mu.qoPGr6Ce(fragment, arrayList2, sb2);
                        return new hx(arrayList2, sb2.toString());
                    case 4:
                        hx hxVar = (hx) muVar.eVhOlqcC.getValue();
                        return (hxVar == null || (list3 = (List) hxVar.NCTxEWno) == null) ? new ArrayList() : list3;
                    case 5:
                        hx hxVar2 = (hx) muVar.eVhOlqcC.getValue();
                        if (hxVar2 != null) {
                            return (String) hxVar2.MdtA4re8;
                        }
                        return null;
                    case 6:
                        String str10 = (String) muVar.ow5vqvCr.getValue();
                        if (str10 != null) {
                            return new o20(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = muVar.ygLcUYwZ;
                        if (str11 != null) {
                            return new o20(str11);
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.k3x7lurq = w30.eIA6dogk(ioVar, new ok(this) { // from class: ju
            public final /* synthetic */ mu MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
            
                if (r0.NCTxEWno.matcher(r15).matches() != false) goto L63;
             */
            @Override // defpackage.ok
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object qoPGr6Ce() {
                List list3;
                int i22 = i5;
                boolean z = true;
                mu muVar = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        String str4 = muVar.VgvYg0wo;
                        if (str4 != null) {
                            return new o20(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = muVar.qoPGr6Ce;
                        if (str5 != null) {
                            o20 o20Var = mu.RXQxj5Oe;
                            o20Var.getClass();
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    case 2:
                        String str6 = muVar.qoPGr6Ce;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) muVar.b2ZJblxo.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    m1.amk52bBQ("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str8 = (String) x5.VGmz0ccI(queryParameters);
                                if (str8 == null) {
                                    muVar.jb9XjC4I = true;
                                    str8 = str7;
                                }
                                o20 o20Var2 = mu.amk52bBQ;
                                o20Var2.getClass();
                                str8.getClass();
                                Matcher matcher = o20Var2.NCTxEWno.matcher(str8);
                                matcher.getClass();
                                lu luVar = new lu();
                                int i32 = 0;
                                for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str8); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
                                    ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
                                    NCTxEWno.getClass();
                                    luVar.NCTxEWno.add(NCTxEWno.qoPGr6Ce);
                                    if (f0Var.RXQxj5Oe().NCTxEWno > i32) {
                                        String quote = Pattern.quote(str8.substring(i32, f0Var.RXQxj5Oe().NCTxEWno));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f0Var.RXQxj5Oe().MdtA4re8 + 1;
                                }
                                if (i32 < str8.length()) {
                                    String quote2 = Pattern.quote(str8.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                luVar.qoPGr6Ce = mu.P7K7Inc8(sb.toString());
                                linkedHashMap.put(str7, luVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = muVar.qoPGr6Ce;
                        if (str9 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str9);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str9);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        mu.qoPGr6Ce(fragment, arrayList2, sb2);
                        return new hx(arrayList2, sb2.toString());
                    case 4:
                        hx hxVar = (hx) muVar.eVhOlqcC.getValue();
                        return (hxVar == null || (list3 = (List) hxVar.NCTxEWno) == null) ? new ArrayList() : list3;
                    case 5:
                        hx hxVar2 = (hx) muVar.eVhOlqcC.getValue();
                        if (hxVar2 != null) {
                            return (String) hxVar2.MdtA4re8;
                        }
                        return null;
                    case 6:
                        String str10 = (String) muVar.ow5vqvCr.getValue();
                        if (str10 != null) {
                            return new o20(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = muVar.ygLcUYwZ;
                        if (str11 != null) {
                            return new o20(str11);
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.ow5vqvCr = w30.eIA6dogk(ioVar, new ok(this) { // from class: ju
            public final /* synthetic */ mu MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
            
                if (r0.NCTxEWno.matcher(r15).matches() != false) goto L63;
             */
            @Override // defpackage.ok
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object qoPGr6Ce() {
                List list3;
                int i22 = i6;
                boolean z = true;
                mu muVar = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        String str4 = muVar.VgvYg0wo;
                        if (str4 != null) {
                            return new o20(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = muVar.qoPGr6Ce;
                        if (str5 != null) {
                            o20 o20Var = mu.RXQxj5Oe;
                            o20Var.getClass();
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    case 2:
                        String str6 = muVar.qoPGr6Ce;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) muVar.b2ZJblxo.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    m1.amk52bBQ("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str8 = (String) x5.VGmz0ccI(queryParameters);
                                if (str8 == null) {
                                    muVar.jb9XjC4I = true;
                                    str8 = str7;
                                }
                                o20 o20Var2 = mu.amk52bBQ;
                                o20Var2.getClass();
                                str8.getClass();
                                Matcher matcher = o20Var2.NCTxEWno.matcher(str8);
                                matcher.getClass();
                                lu luVar = new lu();
                                int i32 = 0;
                                for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str8); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
                                    ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
                                    NCTxEWno.getClass();
                                    luVar.NCTxEWno.add(NCTxEWno.qoPGr6Ce);
                                    if (f0Var.RXQxj5Oe().NCTxEWno > i32) {
                                        String quote = Pattern.quote(str8.substring(i32, f0Var.RXQxj5Oe().NCTxEWno));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f0Var.RXQxj5Oe().MdtA4re8 + 1;
                                }
                                if (i32 < str8.length()) {
                                    String quote2 = Pattern.quote(str8.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                luVar.qoPGr6Ce = mu.P7K7Inc8(sb.toString());
                                linkedHashMap.put(str7, luVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = muVar.qoPGr6Ce;
                        if (str9 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str9);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str9);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        mu.qoPGr6Ce(fragment, arrayList2, sb2);
                        return new hx(arrayList2, sb2.toString());
                    case 4:
                        hx hxVar = (hx) muVar.eVhOlqcC.getValue();
                        return (hxVar == null || (list3 = (List) hxVar.NCTxEWno) == null) ? new ArrayList() : list3;
                    case 5:
                        hx hxVar2 = (hx) muVar.eVhOlqcC.getValue();
                        if (hxVar2 != null) {
                            return (String) hxVar2.MdtA4re8;
                        }
                        return null;
                    case 6:
                        String str10 = (String) muVar.ow5vqvCr.getValue();
                        if (str10 != null) {
                            return new o20(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = muVar.ygLcUYwZ;
                        if (str11 != null) {
                            return new o20(str11);
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.OnDfzHZD = new cb0(new ok(this) { // from class: ju
            public final /* synthetic */ mu MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
            
                if (r0.NCTxEWno.matcher(r15).matches() != false) goto L63;
             */
            @Override // defpackage.ok
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object qoPGr6Ce() {
                List list3;
                int i22 = i7;
                boolean z = true;
                mu muVar = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        String str4 = muVar.VgvYg0wo;
                        if (str4 != null) {
                            return new o20(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = muVar.qoPGr6Ce;
                        if (str5 != null) {
                            o20 o20Var = mu.RXQxj5Oe;
                            o20Var.getClass();
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    case 2:
                        String str6 = muVar.qoPGr6Ce;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) muVar.b2ZJblxo.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    m1.amk52bBQ("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str8 = (String) x5.VGmz0ccI(queryParameters);
                                if (str8 == null) {
                                    muVar.jb9XjC4I = true;
                                    str8 = str7;
                                }
                                o20 o20Var2 = mu.amk52bBQ;
                                o20Var2.getClass();
                                str8.getClass();
                                Matcher matcher = o20Var2.NCTxEWno.matcher(str8);
                                matcher.getClass();
                                lu luVar = new lu();
                                int i32 = 0;
                                for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str8); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
                                    ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
                                    NCTxEWno.getClass();
                                    luVar.NCTxEWno.add(NCTxEWno.qoPGr6Ce);
                                    if (f0Var.RXQxj5Oe().NCTxEWno > i32) {
                                        String quote = Pattern.quote(str8.substring(i32, f0Var.RXQxj5Oe().NCTxEWno));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f0Var.RXQxj5Oe().MdtA4re8 + 1;
                                }
                                if (i32 < str8.length()) {
                                    String quote2 = Pattern.quote(str8.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                luVar.qoPGr6Ce = mu.P7K7Inc8(sb.toString());
                                linkedHashMap.put(str7, luVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = muVar.qoPGr6Ce;
                        if (str9 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str9);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str9);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        mu.qoPGr6Ce(fragment, arrayList2, sb2);
                        return new hx(arrayList2, sb2.toString());
                    case 4:
                        hx hxVar = (hx) muVar.eVhOlqcC.getValue();
                        return (hxVar == null || (list3 = (List) hxVar.NCTxEWno) == null) ? new ArrayList() : list3;
                    case 5:
                        hx hxVar2 = (hx) muVar.eVhOlqcC.getValue();
                        if (hxVar2 != null) {
                            return (String) hxVar2.MdtA4re8;
                        }
                        return null;
                    case 6:
                        String str10 = (String) muVar.ow5vqvCr.getValue();
                        if (str10 != null) {
                            return new o20(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = muVar.ygLcUYwZ;
                        if (str11 != null) {
                            return new o20(str11);
                        }
                        return null;
                }
            }
        });
        final int i8 = 7;
        this.lDXGDhIF = new cb0(new ok(this) { // from class: ju
            public final /* synthetic */ mu MdtA4re8;

            {
                this.MdtA4re8 = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:72:0x017c, code lost:
            
                if (r0.NCTxEWno.matcher(r15).matches() != false) goto L63;
             */
            @Override // defpackage.ok
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object qoPGr6Ce() {
                List list3;
                int i22 = i8;
                boolean z = true;
                mu muVar = this.MdtA4re8;
                switch (i22) {
                    case 0:
                        String str4 = muVar.VgvYg0wo;
                        if (str4 != null) {
                            return new o20(str4, 0);
                        }
                        return null;
                    case 1:
                        String str5 = muVar.qoPGr6Ce;
                        if (str5 != null) {
                            o20 o20Var = mu.RXQxj5Oe;
                            o20Var.getClass();
                            break;
                        }
                        z = false;
                        return Boolean.valueOf(z);
                    case 2:
                        String str6 = muVar.qoPGr6Ce;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) muVar.b2ZJblxo.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    m1.amk52bBQ("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str8 = (String) x5.VGmz0ccI(queryParameters);
                                if (str8 == null) {
                                    muVar.jb9XjC4I = true;
                                    str8 = str7;
                                }
                                o20 o20Var2 = mu.amk52bBQ;
                                o20Var2.getClass();
                                str8.getClass();
                                Matcher matcher = o20Var2.NCTxEWno.matcher(str8);
                                matcher.getClass();
                                lu luVar = new lu();
                                int i32 = 0;
                                for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str8); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
                                    ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
                                    NCTxEWno.getClass();
                                    luVar.NCTxEWno.add(NCTxEWno.qoPGr6Ce);
                                    if (f0Var.RXQxj5Oe().NCTxEWno > i32) {
                                        String quote = Pattern.quote(str8.substring(i32, f0Var.RXQxj5Oe().NCTxEWno));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = f0Var.RXQxj5Oe().MdtA4re8 + 1;
                                }
                                if (i32 < str8.length()) {
                                    String quote2 = Pattern.quote(str8.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                luVar.qoPGr6Ce = mu.P7K7Inc8(sb.toString());
                                linkedHashMap.put(str7, luVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str9 = muVar.qoPGr6Ce;
                        if (str9 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str9);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str9);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        mu.qoPGr6Ce(fragment, arrayList2, sb2);
                        return new hx(arrayList2, sb2.toString());
                    case 4:
                        hx hxVar = (hx) muVar.eVhOlqcC.getValue();
                        return (hxVar == null || (list3 = (List) hxVar.NCTxEWno) == null) ? new ArrayList() : list3;
                    case 5:
                        hx hxVar2 = (hx) muVar.eVhOlqcC.getValue();
                        if (hxVar2 != null) {
                            return (String) hxVar2.MdtA4re8;
                        }
                        return null;
                    case 6:
                        String str10 = (String) muVar.ow5vqvCr.getValue();
                        if (str10 != null) {
                            return new o20(str10, 0);
                        }
                        return null;
                    default:
                        String str11 = muVar.ygLcUYwZ;
                        if (str11 != null) {
                            return new o20(str11);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!OxcuoDLp.NCTxEWno.matcher(str).find()) {
                String pattern = KlHjfFWx.NCTxEWno.pattern();
                pattern.getClass();
                sb.append(pattern);
            }
            Pattern compile = Pattern.compile("(\\?|#|$)");
            compile.getClass();
            Matcher matcher = compile.matcher(str);
            matcher.getClass();
            f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str);
            if (f0Var != null) {
                qoPGr6Ce(str.substring(0, f0Var.RXQxj5Oe().NCTxEWno), arrayList, sb);
                this.sjUBp5pO = (Ey6iv0m0.NCTxEWno.matcher(sb).find() || I5GHvsYW.NCTxEWno.matcher(sb).find()) ? false : true;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.VgvYg0wo = P7K7Inc8(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        Pattern compile2 = Pattern.compile("^[\\s\\S]+/[\\s\\S]+$");
        compile2.getClass();
        if (!compile2.matcher(str3).matches()) {
            m1.NCTxEWno(q70.P7K7Inc8("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        Pattern compile3 = Pattern.compile("/");
        compile3.getClass();
        Matcher matcher2 = compile3.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int i9 = 0;
            do {
                arrayList2.add(str3.subSequence(i9, matcher2.start()).toString());
                i9 = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(i9, str3.length()).toString());
            list = arrayList2;
        } else {
            list = ra.FySoLYna(str3.toString());
        }
        if (!list.isEmpty()) {
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list2 = x5.N2kLh4D5(list, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list2 = wf.NCTxEWno;
        this.ygLcUYwZ = ja0.KlHjfFWx("^(" + ((String) list2.get(0)) + "|[*]+)/(" + ((String) list2.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static String P7K7Inc8(String str) {
        return (ba0.I5GHvsYW(str, "\\Q") && ba0.I5GHvsYW(str, "\\E")) ? ja0.KlHjfFWx(str, ".*", "\\E.*\\Q") : ba0.I5GHvsYW(str, "\\.\\*") ? ja0.KlHjfFWx(str, "\\.\\*", ".*") : str;
    }

    public static void VgvYg0wo(Bundle bundle, String str, String str2, tt ttVar) {
        if (ttVar == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            ev evVar = ttVar.qoPGr6Ce;
            str.getClass();
            evVar.VgvYg0wo(bundle, str, evVar.wxUZMvaN(str2));
        }
    }

    public static void qoPGr6Ce(String str, ArrayList arrayList, StringBuilder sb) {
        o20 o20Var = amk52bBQ;
        o20Var.getClass();
        Matcher matcher = o20Var.NCTxEWno.matcher(str);
        matcher.getClass();
        int i = 0;
        for (f0 f0Var = !matcher.find(0) ? null : new f0(matcher, str); f0Var != null; f0Var = f0Var.i7xS8jrb()) {
            ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(1);
            NCTxEWno.getClass();
            arrayList.add(NCTxEWno.qoPGr6Ce);
            if (f0Var.RXQxj5Oe().NCTxEWno > i) {
                String quote = Pattern.quote(str.substring(i, f0Var.RXQxj5Oe().NCTxEWno));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = I5GHvsYW.NCTxEWno.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = f0Var.RXQxj5Oe().MdtA4re8 + 1;
        }
        if (i < str.length()) {
            String quote2 = Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public final boolean MdtA4re8(f0 f0Var, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.wxUZMvaN;
        ArrayList arrayList2 = new ArrayList(z5.bvfAo0eO(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String str = null;
            if (i < 0) {
                y5.ZyZthT5G();
                throw null;
            }
            String str2 = (String) obj;
            ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(i3);
            if (NCTxEWno != null) {
                str = Uri.decode(NCTxEWno.qoPGr6Ce);
                str.getClass();
            }
            if (str == null) {
                str = "";
            }
            try {
                VgvYg0wo(bundle, str2, str, (tt) linkedHashMap.get(str2));
                arrayList2.add(xe0.qoPGr6Ce);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList NCTxEWno() {
        Collection values = ((Map) this.Qr9iLBAD.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            d6.KRabZ4CU(((lu) it.next()).NCTxEWno, arrayList);
        }
        return x5.QT4Tf9Dt(x5.QT4Tf9Dt(this.wxUZMvaN, arrayList), (List) this.k3x7lurq.getValue());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof mu)) {
            mu muVar = (mu) obj;
            if (fn.qoPGr6Ce(this.qoPGr6Ce, muVar.qoPGr6Ce) && fn.qoPGr6Ce(this.NCTxEWno, muVar.NCTxEWno) && fn.qoPGr6Ce(this.MdtA4re8, muVar.MdtA4re8)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.qoPGr6Ce;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.NCTxEWno;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.MdtA4re8;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean wxUZMvaN(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        f0 f0Var;
        Object obj;
        boolean z;
        String query;
        mu muVar = this;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        for (Map.Entry entry : ((Map) muVar.Qr9iLBAD.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            lu luVar = (lu) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (muVar.jb9XjC4I && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = ra.FySoLYna(query);
            }
            xe0 xe0Var = xe0.qoPGr6Ce;
            boolean z2 = false;
            Bundle VgvYg0wo = w30.VgvYg0wo((hx[]) Arrays.copyOf(new hx[0], 0));
            ArrayList arrayList = luVar.NCTxEWno;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str2 = (String) obj2;
                tt ttVar = (tt) linkedHashMap2.get(str2);
                ev evVar = ttVar != null ? ttVar.qoPGr6Ce : null;
                if ((evVar instanceof o2) && !ttVar.MdtA4re8) {
                    o2 o2Var = (o2) evVar;
                    int i2 = o2Var.amk52bBQ;
                    Object obj3 = wf.NCTxEWno;
                    switch (i2) {
                        case 0:
                            obj3 = new boolean[0];
                            break;
                        case 2:
                            obj3 = new float[0];
                            break;
                        case 4:
                            obj3 = new int[0];
                            break;
                        case 6:
                            obj3 = new long[0];
                            break;
                        case 8:
                            obj3 = new String[0];
                            break;
                    }
                    o2Var.VgvYg0wo(VgvYg0wo, str2, obj3);
                }
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            for (String str3 : queryParameters) {
                String str4 = luVar.qoPGr6Ce;
                if (str4 != null) {
                    Pattern compile = Pattern.compile(str4);
                    compile.getClass();
                    str3.getClass();
                    Matcher matcher = compile.matcher(str3);
                    matcher.getClass();
                    if (matcher.matches()) {
                        f0Var = new f0(matcher, str3);
                        if (f0Var != null) {
                            return z2;
                        }
                        ArrayList arrayList2 = luVar.NCTxEWno;
                        ArrayList arrayList3 = new ArrayList(z5.bvfAo0eO(arrayList2, 10));
                        int size2 = arrayList2.size();
                        boolean z3 = z2;
                        int i3 = z3 ? 1 : 0;
                        LinkedHashMap linkedHashMap4 = linkedHashMap3;
                        ?? r14 = z3;
                        while (i3 < size2) {
                            Object obj4 = arrayList2.get(i3);
                            i3++;
                            int i4 = r14 + 1;
                            if (r14 < 0) {
                                y5.ZyZthT5G();
                                throw null;
                            }
                            String str5 = (String) obj4;
                            ar NCTxEWno = ((br) f0Var.VgvYg0wo).NCTxEWno(i4);
                            String str6 = NCTxEWno != null ? NCTxEWno.qoPGr6Ce : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            tt ttVar2 = (tt) linkedHashMap4.get(str5);
                            try {
                                str5.getClass();
                            } catch (IllegalArgumentException unused) {
                            }
                            if (VgvYg0wo.containsKey(str5)) {
                                if (VgvYg0wo.containsKey(str5)) {
                                    if (ttVar2 != null) {
                                        ev evVar2 = ttVar2.qoPGr6Ce;
                                        Object qoPGr6Ce = evVar2.qoPGr6Ce(str5, VgvYg0wo);
                                        if (!VgvYg0wo.containsKey(str5)) {
                                            throw new IllegalArgumentException("There is no previous value in this savedState.");
                                        }
                                        evVar2.VgvYg0wo(VgvYg0wo, str5, evVar2.MdtA4re8(qoPGr6Ce, str6));
                                    }
                                    z = false;
                                } else {
                                    z = true;
                                }
                                obj = Boolean.valueOf(z);
                                arrayList3.add(obj);
                                linkedHashMap4 = linkedHashMap;
                                r14 = i4;
                                z2 = false;
                            } else {
                                VgvYg0wo(VgvYg0wo, str5, str6, ttVar2);
                                obj = xe0Var;
                                arrayList3.add(obj);
                                linkedHashMap4 = linkedHashMap;
                                r14 = i4;
                                z2 = false;
                            }
                        }
                        linkedHashMap3 = linkedHashMap;
                    }
                }
                f0Var = null;
                if (f0Var != null) {
                }
            }
            bundle.putAll(VgvYg0wo);
            muVar = this;
            linkedHashMap2 = linkedHashMap;
        }
        return true;
    }
}
