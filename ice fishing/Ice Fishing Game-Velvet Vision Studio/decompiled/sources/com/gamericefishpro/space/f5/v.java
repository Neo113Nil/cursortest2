package com.gamericefishpro.space.f5;

import android.net.Uri;
import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static final Regex m = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Regex n = new Regex("\\{(.+?)\\}");
    public static final Regex o = new Regex("http[s]?://");
    public static final Regex p = new Regex(".*");
    public static final Regex q = new Regex("([^/]*?|)");
    public static final Regex r = new Regex("^[^?#]+\\?([^#]*).*");
    public final String a;
    public final ArrayList b;
    public final String c;
    public final com.gamericefishpro.space.oh.s d;
    public final com.gamericefishpro.space.oh.s e;
    public final Object f;
    public boolean g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final com.gamericefishpro.space.oh.s k;
    public final boolean l;

    public v(String input) {
        this.a = input;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        final int i = 0;
        this.d = com.gamericefishpro.space.oh.i.b(new Function0(this) { // from class: com.gamericefishpro.space.f5.s
            public final /* synthetic */ v e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str = this.e.c;
                        if (str != null) {
                            return new Regex(str, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str2 = this.e.a;
                        return Boolean.valueOf(str2 != null && v.r.c(str2));
                    case 2:
                        v vVar = this.e;
                        String uriString = vVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vVar.e.getValue()).booleanValue()) {
                            Intrinsics.b(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri uri = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            for (String str3 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str3);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str3 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str4 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str4 == null) {
                                    vVar.g = true;
                                    str4 = str3;
                                }
                                u uVar = new u();
                                int i2 = 0;
                                for (com.gamericefishpro.space.a8.c cVarA = Regex.a(v.n, str4); cVarA != null; cVarA = cVarA.s()) {
                                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
                                    Intrinsics.b(matchGroupC);
                                    String name = matchGroupC.a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    uVar.b.add(name);
                                    if (cVarA.n().d > i2) {
                                        String strSubstring = str4.substring(i2, cVarA.n().d);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        Regex.e.getClass();
                                        sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i2 = cVarA.n().e + 1;
                                }
                                if (i2 < str4.length()) {
                                    com.gamericefishpro.space.mi.e eVar = Regex.e;
                                    String strSubstring2 = str4.substring(i2);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    eVar.getClass();
                                    sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                uVar.a = v.i(string);
                                linkedHashMap.put(str3, uVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.e.a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri uri2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri uri3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                Intrinsics.b(fragment);
                                v.a(fragment, arrayList2, sb2);
                                return new Pair(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.e.h.getValue();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.e.h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str5 = (String) this.e.j.getValue();
                        if (str5 != null) {
                            return new Regex(str5, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.e = com.gamericefishpro.space.oh.i.b(new Function0(this) { // from class: com.gamericefishpro.space.f5.s
            public final /* synthetic */ v e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str = this.e.c;
                        if (str != null) {
                            return new Regex(str, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str2 = this.e.a;
                        return Boolean.valueOf(str2 != null && v.r.c(str2));
                    case 2:
                        v vVar = this.e;
                        String uriString = vVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vVar.e.getValue()).booleanValue()) {
                            Intrinsics.b(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri uri = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            for (String str3 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str3);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str3 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str4 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str4 == null) {
                                    vVar.g = true;
                                    str4 = str3;
                                }
                                u uVar = new u();
                                int i3 = 0;
                                for (com.gamericefishpro.space.a8.c cVarA = Regex.a(v.n, str4); cVarA != null; cVarA = cVarA.s()) {
                                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
                                    Intrinsics.b(matchGroupC);
                                    String name = matchGroupC.a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    uVar.b.add(name);
                                    if (cVarA.n().d > i3) {
                                        String strSubstring = str4.substring(i3, cVarA.n().d);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        Regex.e.getClass();
                                        sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = cVarA.n().e + 1;
                                }
                                if (i3 < str4.length()) {
                                    com.gamericefishpro.space.mi.e eVar = Regex.e;
                                    String strSubstring2 = str4.substring(i3);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    eVar.getClass();
                                    sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                uVar.a = v.i(string);
                                linkedHashMap.put(str3, uVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.e.a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri uri2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri uri3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                Intrinsics.b(fragment);
                                v.a(fragment, arrayList2, sb2);
                                return new Pair(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.e.h.getValue();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.e.h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str5 = (String) this.e.j.getValue();
                        if (str5 != null) {
                            return new Regex(str5, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        com.gamericefishpro.space.oh.j jVar = com.gamericefishpro.space.oh.j.e;
        final int i3 = 2;
        this.f = com.gamericefishpro.space.oh.i.a(jVar, new Function0(this) { // from class: com.gamericefishpro.space.f5.s
            public final /* synthetic */ v e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str = this.e.c;
                        if (str != null) {
                            return new Regex(str, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str2 = this.e.a;
                        return Boolean.valueOf(str2 != null && v.r.c(str2));
                    case 2:
                        v vVar = this.e;
                        String uriString = vVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vVar.e.getValue()).booleanValue()) {
                            Intrinsics.b(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri uri = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            for (String str3 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str3);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str3 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str4 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str4 == null) {
                                    vVar.g = true;
                                    str4 = str3;
                                }
                                u uVar = new u();
                                int i4 = 0;
                                for (com.gamericefishpro.space.a8.c cVarA = Regex.a(v.n, str4); cVarA != null; cVarA = cVarA.s()) {
                                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
                                    Intrinsics.b(matchGroupC);
                                    String name = matchGroupC.a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    uVar.b.add(name);
                                    if (cVarA.n().d > i4) {
                                        String strSubstring = str4.substring(i4, cVarA.n().d);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        Regex.e.getClass();
                                        sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i4 = cVarA.n().e + 1;
                                }
                                if (i4 < str4.length()) {
                                    com.gamericefishpro.space.mi.e eVar = Regex.e;
                                    String strSubstring2 = str4.substring(i4);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    eVar.getClass();
                                    sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                uVar.a = v.i(string);
                                linkedHashMap.put(str3, uVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.e.a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri uri2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri uri3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                Intrinsics.b(fragment);
                                v.a(fragment, arrayList2, sb2);
                                return new Pair(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.e.h.getValue();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.e.h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str5 = (String) this.e.j.getValue();
                        if (str5 != null) {
                            return new Regex(str5, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.h = com.gamericefishpro.space.oh.i.a(jVar, new Function0(this) { // from class: com.gamericefishpro.space.f5.s
            public final /* synthetic */ v e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str = this.e.c;
                        if (str != null) {
                            return new Regex(str, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str2 = this.e.a;
                        return Boolean.valueOf(str2 != null && v.r.c(str2));
                    case 2:
                        v vVar = this.e;
                        String uriString = vVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vVar.e.getValue()).booleanValue()) {
                            Intrinsics.b(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri uri = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            for (String str3 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str3);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str3 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str4 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str4 == null) {
                                    vVar.g = true;
                                    str4 = str3;
                                }
                                u uVar = new u();
                                int i5 = 0;
                                for (com.gamericefishpro.space.a8.c cVarA = Regex.a(v.n, str4); cVarA != null; cVarA = cVarA.s()) {
                                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
                                    Intrinsics.b(matchGroupC);
                                    String name = matchGroupC.a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    uVar.b.add(name);
                                    if (cVarA.n().d > i5) {
                                        String strSubstring = str4.substring(i5, cVarA.n().d);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        Regex.e.getClass();
                                        sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i5 = cVarA.n().e + 1;
                                }
                                if (i5 < str4.length()) {
                                    com.gamericefishpro.space.mi.e eVar = Regex.e;
                                    String strSubstring2 = str4.substring(i5);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    eVar.getClass();
                                    sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                uVar.a = v.i(string);
                                linkedHashMap.put(str3, uVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.e.a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri uri2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri uri3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                Intrinsics.b(fragment);
                                v.a(fragment, arrayList2, sb2);
                                return new Pair(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.e.h.getValue();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.e.h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str5 = (String) this.e.j.getValue();
                        if (str5 != null) {
                            return new Regex(str5, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.i = com.gamericefishpro.space.oh.i.a(jVar, new Function0(this) { // from class: com.gamericefishpro.space.f5.s
            public final /* synthetic */ v e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i5) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str = this.e.c;
                        if (str != null) {
                            return new Regex(str, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str2 = this.e.a;
                        return Boolean.valueOf(str2 != null && v.r.c(str2));
                    case 2:
                        v vVar = this.e;
                        String uriString = vVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vVar.e.getValue()).booleanValue()) {
                            Intrinsics.b(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri uri = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            for (String str3 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str3);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str3 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str4 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str4 == null) {
                                    vVar.g = true;
                                    str4 = str3;
                                }
                                u uVar = new u();
                                int i6 = 0;
                                for (com.gamericefishpro.space.a8.c cVarA = Regex.a(v.n, str4); cVarA != null; cVarA = cVarA.s()) {
                                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
                                    Intrinsics.b(matchGroupC);
                                    String name = matchGroupC.a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    uVar.b.add(name);
                                    if (cVarA.n().d > i6) {
                                        String strSubstring = str4.substring(i6, cVarA.n().d);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        Regex.e.getClass();
                                        sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i6 = cVarA.n().e + 1;
                                }
                                if (i6 < str4.length()) {
                                    com.gamericefishpro.space.mi.e eVar = Regex.e;
                                    String strSubstring2 = str4.substring(i6);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    eVar.getClass();
                                    sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                uVar.a = v.i(string);
                                linkedHashMap.put(str3, uVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.e.a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri uri2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri uri3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                Intrinsics.b(fragment);
                                v.a(fragment, arrayList2, sb2);
                                return new Pair(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.e.h.getValue();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.e.h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str5 = (String) this.e.j.getValue();
                        if (str5 != null) {
                            return new Regex(str5, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.j = com.gamericefishpro.space.oh.i.a(jVar, new Function0(this) { // from class: com.gamericefishpro.space.f5.s
            public final /* synthetic */ v e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i6) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str = this.e.c;
                        if (str != null) {
                            return new Regex(str, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str2 = this.e.a;
                        return Boolean.valueOf(str2 != null && v.r.c(str2));
                    case 2:
                        v vVar = this.e;
                        String uriString = vVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vVar.e.getValue()).booleanValue()) {
                            Intrinsics.b(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri uri = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            for (String str3 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str3);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str3 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str4 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str4 == null) {
                                    vVar.g = true;
                                    str4 = str3;
                                }
                                u uVar = new u();
                                int i7 = 0;
                                for (com.gamericefishpro.space.a8.c cVarA = Regex.a(v.n, str4); cVarA != null; cVarA = cVarA.s()) {
                                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
                                    Intrinsics.b(matchGroupC);
                                    String name = matchGroupC.a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    uVar.b.add(name);
                                    if (cVarA.n().d > i7) {
                                        String strSubstring = str4.substring(i7, cVarA.n().d);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        Regex.e.getClass();
                                        sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i7 = cVarA.n().e + 1;
                                }
                                if (i7 < str4.length()) {
                                    com.gamericefishpro.space.mi.e eVar = Regex.e;
                                    String strSubstring2 = str4.substring(i7);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    eVar.getClass();
                                    sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                uVar.a = v.i(string);
                                linkedHashMap.put(str3, uVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.e.a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri uri2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri uri3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                Intrinsics.b(fragment);
                                v.a(fragment, arrayList2, sb2);
                                return new Pair(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.e.h.getValue();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.e.h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str5 = (String) this.e.j.getValue();
                        if (str5 != null) {
                            return new Regex(str5, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.k = com.gamericefishpro.space.oh.i.b(new Function0(this) { // from class: com.gamericefishpro.space.f5.s
            public final /* synthetic */ v e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str = this.e.c;
                        if (str != null) {
                            return new Regex(str, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str2 = this.e.a;
                        return Boolean.valueOf(str2 != null && v.r.c(str2));
                    case 2:
                        v vVar = this.e;
                        String uriString = vVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vVar.e.getValue()).booleanValue()) {
                            Intrinsics.b(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri uri = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            for (String str3 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str3);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str3 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str4 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str4 == null) {
                                    vVar.g = true;
                                    str4 = str3;
                                }
                                u uVar = new u();
                                int i8 = 0;
                                for (com.gamericefishpro.space.a8.c cVarA = Regex.a(v.n, str4); cVarA != null; cVarA = cVarA.s()) {
                                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
                                    Intrinsics.b(matchGroupC);
                                    String name = matchGroupC.a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    uVar.b.add(name);
                                    if (cVarA.n().d > i8) {
                                        String strSubstring = str4.substring(i8, cVarA.n().d);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        Regex.e.getClass();
                                        sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i8 = cVarA.n().e + 1;
                                }
                                if (i8 < str4.length()) {
                                    com.gamericefishpro.space.mi.e eVar = Regex.e;
                                    String strSubstring2 = str4.substring(i8);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    eVar.getClass();
                                    sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                uVar.a = v.i(string);
                                linkedHashMap.put(str3, uVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.e.a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri uri2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri uri3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                Intrinsics.b(fragment);
                                v.a(fragment, arrayList2, sb2);
                                return new Pair(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.e.h.getValue();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.e.h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str5 = (String) this.e.j.getValue();
                        if (str5 != null) {
                            return new Regex(str5, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        com.gamericefishpro.space.oh.i.b(new Function0(this) { // from class: com.gamericefishpro.space.f5.s
            public final /* synthetic */ v e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v34, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list;
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str = this.e.c;
                        if (str != null) {
                            return new Regex(str, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str2 = this.e.a;
                        return Boolean.valueOf(str2 != null && v.r.c(str2));
                    case 2:
                        v vVar = this.e;
                        String uriString = vVar.a;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) vVar.e.getValue()).booleanValue()) {
                            Intrinsics.b(uriString);
                            Intrinsics.checkNotNullParameter(uriString, "uriString");
                            Uri uri = Uri.parse(uriString);
                            Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                            for (String str3 : uri.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = uri.getQueryParameters(str3);
                                if (queryParameters.size() > 1) {
                                    throw new IllegalArgumentException(("Query parameter " + str3 + " must only be present once in " + uriString + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                                }
                                String str4 = (String) CollectionsKt.firstOrNull(queryParameters);
                                if (str4 == null) {
                                    vVar.g = true;
                                    str4 = str3;
                                }
                                u uVar = new u();
                                int i9 = 0;
                                for (com.gamericefishpro.space.a8.c cVarA = Regex.a(v.n, str4); cVarA != null; cVarA = cVarA.s()) {
                                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
                                    Intrinsics.b(matchGroupC);
                                    String name = matchGroupC.a;
                                    Intrinsics.checkNotNullParameter(name, "name");
                                    uVar.b.add(name);
                                    if (cVarA.n().d > i9) {
                                        String strSubstring = str4.substring(i9, cVarA.n().d);
                                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                                        Regex.e.getClass();
                                        sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i9 = cVarA.n().e + 1;
                                }
                                if (i9 < str4.length()) {
                                    com.gamericefishpro.space.mi.e eVar = Regex.e;
                                    String strSubstring2 = str4.substring(i9);
                                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                                    eVar.getClass();
                                    sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
                                }
                                sb.append("$");
                                String string = sb.toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                uVar.a = v.i(string);
                                linkedHashMap.put(str3, uVar);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String uriString2 = this.e.a;
                        if (uriString2 != null) {
                            Intrinsics.checkNotNullParameter(uriString2, "uriString");
                            Uri uri2 = Uri.parse(uriString2);
                            Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
                            if (uri2.getFragment() != null) {
                                ArrayList arrayList2 = new ArrayList();
                                Intrinsics.checkNotNullParameter(uriString2, "uriString");
                                Uri uri3 = Uri.parse(uriString2);
                                Intrinsics.checkNotNullExpressionValue(uri3, "parse(...)");
                                String fragment = uri3.getFragment();
                                StringBuilder sb2 = new StringBuilder();
                                Intrinsics.b(fragment);
                                v.a(fragment, arrayList2, sb2);
                                return new Pair(arrayList2, sb2.toString());
                            }
                        }
                        return null;
                    case 4:
                        Pair pair = (Pair) this.e.h.getValue();
                        return (pair == null || (list = (List) pair.d) == null) ? new ArrayList() : list;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Pair pair2 = (Pair) this.e.h.getValue();
                        if (pair2 != null) {
                            return (String) pair2.e;
                        }
                        return null;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str5 = (String) this.e.j.getValue();
                        if (str5 != null) {
                            return new Regex(str5, com.gamericefishpro.space.mi.f.IGNORE_CASE);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        if (input == null) {
            return;
        }
        StringBuilder input2 = new StringBuilder("^");
        Regex regex = m;
        regex.getClass();
        Intrinsics.checkNotNullParameter(input, "input");
        if (!regex.d.matcher(input).find()) {
            String strPattern = o.d.pattern();
            Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
            input2.append(strPattern);
        }
        com.gamericefishpro.space.a8.c cVarA = Regex.a(new Regex("(\\?|#|$)"), input);
        if (cVarA != null) {
            boolean z = false;
            String strSubstring = input.substring(0, cVarA.n().d);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            a(strSubstring, arrayList, input2);
            Regex regex2 = p;
            regex2.getClass();
            Intrinsics.checkNotNullParameter(input2, "input");
            if (!regex2.d.matcher(input2).find()) {
                Regex regex3 = q;
                regex3.getClass();
                Intrinsics.checkNotNullParameter(input2, "input");
                if (!regex3.d.matcher(input2).find()) {
                    z = true;
                }
            }
            this.l = z;
            input2.append("($|(\\?(.)*)|(#(.)*))");
        }
        String string = input2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.c = i(string);
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        int i = 0;
        for (com.gamericefishpro.space.a8.c cVarA = Regex.a(n, str); cVarA != null; cVarA = cVarA.s()) {
            MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarA.v).c(1);
            Intrinsics.b(matchGroupC);
            arrayList.add(matchGroupC.a);
            if (cVarA.n().d > i) {
                com.gamericefishpro.space.mi.e eVar = Regex.e;
                String strSubstring = str.substring(i, cVarA.n().d);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                eVar.getClass();
                sb.append(com.gamericefishpro.space.mi.e.a(strSubstring));
            }
            String strPattern = q.d.pattern();
            Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
            sb.append(strPattern);
            i = cVarA.n().e + 1;
        }
        if (i < str.length()) {
            com.gamericefishpro.space.mi.e eVar2 = Regex.e;
            String strSubstring2 = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            eVar2.getClass();
            sb.append(com.gamericefishpro.space.mi.e.a(strSubstring2));
        }
    }

    public static void g(Bundle source, String key, String value, i iVar) {
        if (iVar == null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            source.putString(key, value);
            return;
        }
        n0 n0Var = iVar.a;
        Intrinsics.checkNotNullParameter(source, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        n0Var.e(source, key, n0Var.d(value));
    }

    public static boolean h(Bundle source, String key, String str, i iVar) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!source.containsKey(key)) {
            return true;
        }
        if (iVar == null) {
            return false;
        }
        n0 n0Var = iVar.a;
        Object objA = n0Var.a(key, source);
        Intrinsics.checkNotNullParameter(source, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(n0Var, "<this>");
        Intrinsics.checkNotNullParameter(source, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!source.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        n0Var.e(source, key, n0Var.c(objA, str));
        return false;
    }

    public static String i(String str) {
        if (StringsKt.r(str, "\\Q") && StringsKt.r(str, "\\E")) {
            return kotlin.text.d.i(str, ".*", "\\E.*\\Q");
        }
        return StringsKt.r(str, "\\.\\*") ? kotlin.text.d.i(str, "\\.\\*", ".*") : str;
    }

    public final int b(Uri uri) {
        String uriString;
        if (uri == null || (uriString = this.a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Uri uri2 = Uri.parse(uriString);
        Intrinsics.checkNotNullExpressionValue(uri2, "parse(...)");
        List<String> elements = uri2.getPathSegments();
        Intrinsics.checkNotNullParameter(pathSegments, "<this>");
        Intrinsics.checkNotNullParameter(elements, "other");
        LinkedHashSet linkedHashSetN = CollectionsKt.N(pathSegments);
        Intrinsics.checkNotNullParameter(linkedHashSetN, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "<this>");
        if (elements == null) {
            elements = CollectionsKt.L(elements);
        }
        linkedHashSetN.retainAll(elements);
        return linkedHashSetN.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    public final ArrayList c() {
        Collection collectionValues = ((Map) this.f.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            com.gamericefishpro.space.ph.c0.l(arrayList, ((u) it.next()).b);
        }
        return CollectionsKt.F(CollectionsKt.F(this.b, arrayList), (List) this.i.getValue());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    public final Bundle d(Uri deepLink, LinkedHashMap arguments) {
        com.gamericefishpro.space.a8.c cVarB;
        com.gamericefishpro.space.a8.c cVarB2;
        String strDecode;
        String s;
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Regex regex = (Regex) this.d.getValue();
        if (regex != null && (cVarB = regex.b(deepLink.toString())) != null) {
            com.gamericefishpro.space.ph.m0.c();
            int i = 0;
            Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Intrinsics.checkNotNullParameter(source, "source");
            if (e(cVarB, source, arguments) && (!((Boolean) this.e.getValue()).booleanValue() || f(deepLink, source, arguments))) {
                String fragment = deepLink.getFragment();
                Regex regex2 = (Regex) this.k.getValue();
                if (regex2 != null && (cVarB2 = regex2.b(String.valueOf(fragment))) != null) {
                    List list = (List) this.i.getValue();
                    ArrayList arrayList = new ArrayList(com.gamericefishpro.space.ph.y.j(list, 10));
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            com.gamericefishpro.space.ph.x.i();
                            throw null;
                        }
                        String str = (String) obj;
                        MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarB2.v).c(i2);
                        if (matchGroupC == null || (s = matchGroupC.a) == null) {
                            strDecode = null;
                        } else {
                            Intrinsics.checkNotNullParameter(s, "s");
                            strDecode = Uri.decode(s);
                            Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
                        }
                        if (strDecode == null) {
                            strDecode = "";
                        }
                        try {
                            g(source, str, strDecode, (i) arguments.get(str));
                            arrayList.add(Unit.a);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (h.e(arguments, new t(source, 0)).isEmpty()) {
                    return source;
                }
            }
        }
        return null;
    }

    public final boolean e(com.gamericefishpro.space.a8.c cVar, Bundle bundle, Map map) {
        String s;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(com.gamericefishpro.space.ph.y.j(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String strDecode = null;
            if (i < 0) {
                com.gamericefishpro.space.ph.x.i();
                throw null;
            }
            String str = (String) obj;
            MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVar.v).c(i3);
            if (matchGroupC != null && (s = matchGroupC.a) != null) {
                Intrinsics.checkNotNullParameter(s, "s");
                strDecode = Uri.decode(s);
                Intrinsics.checkNotNullExpressionValue(strDecode, "decode(...)");
            }
            if (strDecode == null) {
                strDecode = "";
            }
            try {
                g(bundle, str, strDecode, (i) map.get(str));
                arrayList2.add(Unit.a);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        return Intrinsics.a(this.a, ((v) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.gamericefishpro.space.oh.h, java.lang.Object] */
    public final boolean f(Uri uri, Bundle source, Map map) {
        ?? r14;
        Object objValueOf;
        Object obj;
        String query;
        v vVar = this;
        for (Map.Entry entry : ((Map) vVar.f.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            u uVar = (u) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (vVar.g && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = com.gamericefishpro.space.ph.w.c(query);
            }
            com.gamericefishpro.space.ph.m0.c();
            boolean z = false;
            Bundle from = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Intrinsics.checkNotNullParameter(from, "source");
            ArrayList arrayList = uVar.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                String str2 = (String) obj2;
                i iVar = (i) map.get(str2);
                n0 n0Var = iVar != null ? iVar.a : null;
                boolean z2 = z;
                if ((n0Var instanceof d) && !iVar.b) {
                    d dVar = (d) n0Var;
                    switch (dVar.k) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            obj = new boolean[0];
                            break;
                        case 1:
                            obj = new float[0];
                            break;
                        case 2:
                            obj = new int[0];
                            break;
                        case 3:
                            obj = new long[0];
                            break;
                        default:
                            obj = new String[0];
                            break;
                    }
                    dVar.e(from, str2, obj);
                }
                z = z2;
            }
            boolean z3 = z;
            for (String str3 : queryParameters) {
                String str4 = uVar.a;
                com.gamericefishpro.space.a8.c cVarB = str4 != null ? new Regex(str4).b(str3) : null;
                if (cVarB == null) {
                    return z3;
                }
                ArrayList arrayList2 = uVar.b;
                ArrayList arrayList3 = new ArrayList(com.gamericefishpro.space.ph.y.j(arrayList2, 10));
                int size2 = arrayList2.size();
                boolean z4 = z3;
                int i2 = z4 ? 1 : 0;
                while (i2 < size2) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    int i3 = r14 + 1;
                    if (r14 < 0) {
                        r14 = z4;
                        com.gamericefishpro.space.ph.x.i();
                        throw null;
                    }
                    String str5 = (String) obj3;
                    MatchGroup matchGroupC = ((com.gamericefishpro.space.mi.d) cVarB.v).c(i3);
                    String str6 = matchGroupC != null ? matchGroupC.a : null;
                    if (str6 == null) {
                        r14 = z4;
                        r14 = z4;
                        str6 = "";
                    }
                    r14 = z4;
                    r14 = z4;
                    i iVar2 = (i) map.get(str5);
                    try {
                        Intrinsics.checkNotNullParameter(from, "source");
                        if (com.gamericefishpro.space.u6.f.n(str5, from)) {
                            objValueOf = Boolean.valueOf(h(from, str5, str6, iVar2));
                        } else {
                            g(from, str5, str6, iVar2);
                            objValueOf = Unit.a;
                        }
                    } catch (IllegalArgumentException unused) {
                        objValueOf = Unit.a;
                    }
                    arrayList3.add(objValueOf);
                    map = map;
                    r14 = i3;
                }
                r14 = z4;
                map = map;
            }
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
            vVar = this;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        return (str != null ? str.hashCode() : 0) * 961;
    }
}
