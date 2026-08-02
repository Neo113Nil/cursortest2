package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavDeepLink;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class NavDeepLink {
    public final String action;
    public final Lazy fragArgs$delegate;
    public final Lazy fragArgsAndRegex$delegate;
    public final Lazy fragPattern$delegate;
    public final Lazy fragRegex$delegate;
    public final boolean isExactDeepLink;
    public final Lazy isParameterizedQuery$delegate;
    public boolean isSingleQueryParamValueOnly;
    public final String mimeType;
    public final Lazy mimeTypePattern$delegate;
    public final String mimeTypeRegex;
    public final ArrayList pathArgs;
    public final Lazy pathPattern$delegate;
    public final String pathRegex;
    public final Lazy queryArgsMap$delegate;
    public final String uriPattern;
    public static final Regex SCHEME_PATTERN = new Regex("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Regex FILL_IN_PATTERN = new Regex("\\{(.+?)\\}");
    public static final Regex SCHEME_REGEX = new Regex("http[s]?://");
    public static final Regex WILDCARD_REGEX = new Regex(".*");
    public static final Regex PATH_REGEX = new Regex("([^/]*?|)");
    public static final Regex QUERY_PATTERN = new Regex("^[^?#]+\\?([^#]*).*");

    public final class ParamQuery {
        public final ArrayList arguments = new ArrayList();
        public String paramRegex;
    }

    public NavDeepLink(String str, String str2, String str3) {
        List list;
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        ArrayList arrayList = new ArrayList();
        this.pathArgs = arrayList;
        final int i = 0;
        this.pathPattern$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            public final /* synthetic */ NavDeepLink f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i2 = i;
                NavDeepLink navDeepLink = this.f$0;
                switch (i2) {
                    case 0:
                        String str4 = navDeepLink.pathRegex;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = navDeepLink.uriPattern;
                        return Boolean.valueOf(str5 != null && NavDeepLink.QUERY_PATTERN.matches(str5));
                    case 2:
                        String str6 = navDeepLink.uriPattern;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                                if (str8 == null) {
                                    navDeepLink.isSingleQueryParamValueOnly = true;
                                    str8 = str7;
                                }
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i3 = 0;
                                for (MatcherMatchResult find = NavDeepLink.FILL_IN_PATTERN.find(str8); find != null; find = find.next()) {
                                    MatchGroup matchGroup = find.groups.get(1);
                                    matchGroup.getClass();
                                    String str9 = matchGroup.value;
                                    str9.getClass();
                                    paramQuery.arguments.add(str9);
                                    if (find.getRange().first > i3) {
                                        String substring = str8.substring(i3, find.getRange().first);
                                        Regex.INSTANCE.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = find.getRange().last + 1;
                                }
                                if (i3 < str8.length()) {
                                    Regex.Companion companion = Regex.INSTANCE;
                                    String substring2 = str8.substring(i3);
                                    companion.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                paramQuery.paramRegex = NavDeepLink.saveWildcardInRegex(sb.toString());
                                linkedHashMap.put(str7, paramQuery);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = navDeepLink.uriPattern;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        NavDeepLink.buildRegex(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        return (pair == null || (list2 = (List) pair.first) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        if (pair2 != null) {
                            return (String) pair2.second;
                        }
                        return null;
                    case 6:
                        String str11 = (String) navDeepLink.fragRegex$delegate.getValue();
                        if (str11 != null) {
                            return new Regex(str11, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = navDeepLink.mimeTypeRegex;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.isParameterizedQuery$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            public final /* synthetic */ NavDeepLink f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i2;
                NavDeepLink navDeepLink = this.f$0;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.pathRegex;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = navDeepLink.uriPattern;
                        return Boolean.valueOf(str5 != null && NavDeepLink.QUERY_PATTERN.matches(str5));
                    case 2:
                        String str6 = navDeepLink.uriPattern;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                                if (str8 == null) {
                                    navDeepLink.isSingleQueryParamValueOnly = true;
                                    str8 = str7;
                                }
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i3 = 0;
                                for (MatcherMatchResult find = NavDeepLink.FILL_IN_PATTERN.find(str8); find != null; find = find.next()) {
                                    MatchGroup matchGroup = find.groups.get(1);
                                    matchGroup.getClass();
                                    String str9 = matchGroup.value;
                                    str9.getClass();
                                    paramQuery.arguments.add(str9);
                                    if (find.getRange().first > i3) {
                                        String substring = str8.substring(i3, find.getRange().first);
                                        Regex.INSTANCE.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = find.getRange().last + 1;
                                }
                                if (i3 < str8.length()) {
                                    Regex.Companion companion = Regex.INSTANCE;
                                    String substring2 = str8.substring(i3);
                                    companion.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                paramQuery.paramRegex = NavDeepLink.saveWildcardInRegex(sb.toString());
                                linkedHashMap.put(str7, paramQuery);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = navDeepLink.uriPattern;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        NavDeepLink.buildRegex(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        return (pair == null || (list2 = (List) pair.first) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        if (pair2 != null) {
                            return (String) pair2.second;
                        }
                        return null;
                    case 6:
                        String str11 = (String) navDeepLink.fragRegex$delegate.getValue();
                        if (str11 != null) {
                            return new Regex(str11, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = navDeepLink.mimeTypeRegex;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i3 = 2;
        this.queryArgsMap$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            public final /* synthetic */ NavDeepLink f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i3;
                NavDeepLink navDeepLink = this.f$0;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.pathRegex;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = navDeepLink.uriPattern;
                        return Boolean.valueOf(str5 != null && NavDeepLink.QUERY_PATTERN.matches(str5));
                    case 2:
                        String str6 = navDeepLink.uriPattern;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                                if (str8 == null) {
                                    navDeepLink.isSingleQueryParamValueOnly = true;
                                    str8 = str7;
                                }
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i32 = 0;
                                for (MatcherMatchResult find = NavDeepLink.FILL_IN_PATTERN.find(str8); find != null; find = find.next()) {
                                    MatchGroup matchGroup = find.groups.get(1);
                                    matchGroup.getClass();
                                    String str9 = matchGroup.value;
                                    str9.getClass();
                                    paramQuery.arguments.add(str9);
                                    if (find.getRange().first > i32) {
                                        String substring = str8.substring(i32, find.getRange().first);
                                        Regex.INSTANCE.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = find.getRange().last + 1;
                                }
                                if (i32 < str8.length()) {
                                    Regex.Companion companion = Regex.INSTANCE;
                                    String substring2 = str8.substring(i32);
                                    companion.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                paramQuery.paramRegex = NavDeepLink.saveWildcardInRegex(sb.toString());
                                linkedHashMap.put(str7, paramQuery);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = navDeepLink.uriPattern;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        NavDeepLink.buildRegex(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        return (pair == null || (list2 = (List) pair.first) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        if (pair2 != null) {
                            return (String) pair2.second;
                        }
                        return null;
                    case 6:
                        String str11 = (String) navDeepLink.fragRegex$delegate.getValue();
                        if (str11 != null) {
                            return new Regex(str11, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = navDeepLink.mimeTypeRegex;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i4 = 3;
        this.fragArgsAndRegex$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            public final /* synthetic */ NavDeepLink f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i4;
                NavDeepLink navDeepLink = this.f$0;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.pathRegex;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = navDeepLink.uriPattern;
                        return Boolean.valueOf(str5 != null && NavDeepLink.QUERY_PATTERN.matches(str5));
                    case 2:
                        String str6 = navDeepLink.uriPattern;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                                if (str8 == null) {
                                    navDeepLink.isSingleQueryParamValueOnly = true;
                                    str8 = str7;
                                }
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i32 = 0;
                                for (MatcherMatchResult find = NavDeepLink.FILL_IN_PATTERN.find(str8); find != null; find = find.next()) {
                                    MatchGroup matchGroup = find.groups.get(1);
                                    matchGroup.getClass();
                                    String str9 = matchGroup.value;
                                    str9.getClass();
                                    paramQuery.arguments.add(str9);
                                    if (find.getRange().first > i32) {
                                        String substring = str8.substring(i32, find.getRange().first);
                                        Regex.INSTANCE.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = find.getRange().last + 1;
                                }
                                if (i32 < str8.length()) {
                                    Regex.Companion companion = Regex.INSTANCE;
                                    String substring2 = str8.substring(i32);
                                    companion.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                paramQuery.paramRegex = NavDeepLink.saveWildcardInRegex(sb.toString());
                                linkedHashMap.put(str7, paramQuery);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = navDeepLink.uriPattern;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        NavDeepLink.buildRegex(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        return (pair == null || (list2 = (List) pair.first) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        if (pair2 != null) {
                            return (String) pair2.second;
                        }
                        return null;
                    case 6:
                        String str11 = (String) navDeepLink.fragRegex$delegate.getValue();
                        if (str11 != null) {
                            return new Regex(str11, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = navDeepLink.mimeTypeRegex;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.fragArgs$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            public final /* synthetic */ NavDeepLink f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i5;
                NavDeepLink navDeepLink = this.f$0;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.pathRegex;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = navDeepLink.uriPattern;
                        return Boolean.valueOf(str5 != null && NavDeepLink.QUERY_PATTERN.matches(str5));
                    case 2:
                        String str6 = navDeepLink.uriPattern;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                                if (str8 == null) {
                                    navDeepLink.isSingleQueryParamValueOnly = true;
                                    str8 = str7;
                                }
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i32 = 0;
                                for (MatcherMatchResult find = NavDeepLink.FILL_IN_PATTERN.find(str8); find != null; find = find.next()) {
                                    MatchGroup matchGroup = find.groups.get(1);
                                    matchGroup.getClass();
                                    String str9 = matchGroup.value;
                                    str9.getClass();
                                    paramQuery.arguments.add(str9);
                                    if (find.getRange().first > i32) {
                                        String substring = str8.substring(i32, find.getRange().first);
                                        Regex.INSTANCE.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = find.getRange().last + 1;
                                }
                                if (i32 < str8.length()) {
                                    Regex.Companion companion = Regex.INSTANCE;
                                    String substring2 = str8.substring(i32);
                                    companion.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                paramQuery.paramRegex = NavDeepLink.saveWildcardInRegex(sb.toString());
                                linkedHashMap.put(str7, paramQuery);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = navDeepLink.uriPattern;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        NavDeepLink.buildRegex(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        return (pair == null || (list2 = (List) pair.first) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        if (pair2 != null) {
                            return (String) pair2.second;
                        }
                        return null;
                    case 6:
                        String str11 = (String) navDeepLink.fragRegex$delegate.getValue();
                        if (str11 != null) {
                            return new Regex(str11, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = navDeepLink.mimeTypeRegex;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.fragRegex$delegate = LazyKt.lazy(lazyThreadSafetyMode, new Function0(this) { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            public final /* synthetic */ NavDeepLink f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i6;
                NavDeepLink navDeepLink = this.f$0;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.pathRegex;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = navDeepLink.uriPattern;
                        return Boolean.valueOf(str5 != null && NavDeepLink.QUERY_PATTERN.matches(str5));
                    case 2:
                        String str6 = navDeepLink.uriPattern;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                                if (str8 == null) {
                                    navDeepLink.isSingleQueryParamValueOnly = true;
                                    str8 = str7;
                                }
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i32 = 0;
                                for (MatcherMatchResult find = NavDeepLink.FILL_IN_PATTERN.find(str8); find != null; find = find.next()) {
                                    MatchGroup matchGroup = find.groups.get(1);
                                    matchGroup.getClass();
                                    String str9 = matchGroup.value;
                                    str9.getClass();
                                    paramQuery.arguments.add(str9);
                                    if (find.getRange().first > i32) {
                                        String substring = str8.substring(i32, find.getRange().first);
                                        Regex.INSTANCE.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = find.getRange().last + 1;
                                }
                                if (i32 < str8.length()) {
                                    Regex.Companion companion = Regex.INSTANCE;
                                    String substring2 = str8.substring(i32);
                                    companion.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                paramQuery.paramRegex = NavDeepLink.saveWildcardInRegex(sb.toString());
                                linkedHashMap.put(str7, paramQuery);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = navDeepLink.uriPattern;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        NavDeepLink.buildRegex(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        return (pair == null || (list2 = (List) pair.first) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        if (pair2 != null) {
                            return (String) pair2.second;
                        }
                        return null;
                    case 6:
                        String str11 = (String) navDeepLink.fragRegex$delegate.getValue();
                        if (str11 != null) {
                            return new Regex(str11, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = navDeepLink.mimeTypeRegex;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.fragPattern$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            public final /* synthetic */ NavDeepLink f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i7;
                NavDeepLink navDeepLink = this.f$0;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.pathRegex;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = navDeepLink.uriPattern;
                        return Boolean.valueOf(str5 != null && NavDeepLink.QUERY_PATTERN.matches(str5));
                    case 2:
                        String str6 = navDeepLink.uriPattern;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                                if (str8 == null) {
                                    navDeepLink.isSingleQueryParamValueOnly = true;
                                    str8 = str7;
                                }
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i32 = 0;
                                for (MatcherMatchResult find = NavDeepLink.FILL_IN_PATTERN.find(str8); find != null; find = find.next()) {
                                    MatchGroup matchGroup = find.groups.get(1);
                                    matchGroup.getClass();
                                    String str9 = matchGroup.value;
                                    str9.getClass();
                                    paramQuery.arguments.add(str9);
                                    if (find.getRange().first > i32) {
                                        String substring = str8.substring(i32, find.getRange().first);
                                        Regex.INSTANCE.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = find.getRange().last + 1;
                                }
                                if (i32 < str8.length()) {
                                    Regex.Companion companion = Regex.INSTANCE;
                                    String substring2 = str8.substring(i32);
                                    companion.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                paramQuery.paramRegex = NavDeepLink.saveWildcardInRegex(sb.toString());
                                linkedHashMap.put(str7, paramQuery);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = navDeepLink.uriPattern;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        NavDeepLink.buildRegex(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        return (pair == null || (list2 = (List) pair.first) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        if (pair2 != null) {
                            return (String) pair2.second;
                        }
                        return null;
                    case 6:
                        String str11 = (String) navDeepLink.fragRegex$delegate.getValue();
                        if (str11 != null) {
                            return new Regex(str11, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = navDeepLink.mimeTypeRegex;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        final int i8 = 7;
        this.mimeTypePattern$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.navigation.NavDeepLink$$ExternalSyntheticLambda0
            public final /* synthetic */ NavDeepLink f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                List list2;
                int i22 = i8;
                NavDeepLink navDeepLink = this.f$0;
                switch (i22) {
                    case 0:
                        String str4 = navDeepLink.pathRegex;
                        if (str4 != null) {
                            return new Regex(str4, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    case 1:
                        String str5 = navDeepLink.uriPattern;
                        return Boolean.valueOf(str5 != null && NavDeepLink.QUERY_PATTERN.matches(str5));
                    case 2:
                        String str6 = navDeepLink.uriPattern;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) navDeepLink.isParameterizedQuery$delegate.getValue()).booleanValue()) {
                            str6.getClass();
                            Uri parse = Uri.parse(str6);
                            parse.getClass();
                            for (String str7 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str7);
                                if (queryParameters.size() > 1) {
                                    Path$$ExternalSyntheticBUOutline0.m$1((Object) Boxes$$ExternalSyntheticOutline1.m("Query parameter ", str7, " must only be present once in ", str6, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                                    return null;
                                }
                                String str8 = (String) CollectionsKt.firstOrNull((List) queryParameters);
                                if (str8 == null) {
                                    navDeepLink.isSingleQueryParamValueOnly = true;
                                    str8 = str7;
                                }
                                NavDeepLink.ParamQuery paramQuery = new NavDeepLink.ParamQuery();
                                int i32 = 0;
                                for (MatcherMatchResult find = NavDeepLink.FILL_IN_PATTERN.find(str8); find != null; find = find.next()) {
                                    MatchGroup matchGroup = find.groups.get(1);
                                    matchGroup.getClass();
                                    String str9 = matchGroup.value;
                                    str9.getClass();
                                    paramQuery.arguments.add(str9);
                                    if (find.getRange().first > i32) {
                                        String substring = str8.substring(i32, find.getRange().first);
                                        Regex.INSTANCE.getClass();
                                        String quote = Pattern.quote(substring);
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = find.getRange().last + 1;
                                }
                                if (i32 < str8.length()) {
                                    Regex.Companion companion = Regex.INSTANCE;
                                    String substring2 = str8.substring(i32);
                                    companion.getClass();
                                    String quote2 = Pattern.quote(substring2);
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                paramQuery.paramRegex = NavDeepLink.saveWildcardInRegex(sb.toString());
                                linkedHashMap.put(str7, paramQuery);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str10 = navDeepLink.uriPattern;
                        if (str10 == null) {
                            return null;
                        }
                        Uri parse2 = Uri.parse(str10);
                        parse2.getClass();
                        if (parse2.getFragment() == null) {
                            return null;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Uri parse3 = Uri.parse(str10);
                        parse3.getClass();
                        String fragment = parse3.getFragment();
                        StringBuilder sb2 = new StringBuilder();
                        fragment.getClass();
                        NavDeepLink.buildRegex(fragment, sb2, arrayList2);
                        return new Pair(arrayList2, sb2.toString());
                    case 4:
                        Pair pair = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        return (pair == null || (list2 = (List) pair.first) == null) ? new ArrayList() : list2;
                    case 5:
                        Pair pair2 = (Pair) navDeepLink.fragArgsAndRegex$delegate.getValue();
                        if (pair2 != null) {
                            return (String) pair2.second;
                        }
                        return null;
                    case 6:
                        String str11 = (String) navDeepLink.fragRegex$delegate.getValue();
                        if (str11 != null) {
                            return new Regex(str11, RegexOption.IGNORE_CASE);
                        }
                        return null;
                    default:
                        String str12 = navDeepLink.mimeTypeRegex;
                        if (str12 != null) {
                            return new Regex(str12);
                        }
                        return null;
                }
            }
        });
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!SCHEME_PATTERN.containsMatchIn(str)) {
                String pattern = SCHEME_REGEX.nativePattern.pattern();
                pattern.getClass();
                sb.append(pattern);
            }
            MatcherMatchResult find = new Regex("(\\?|#|$)").find(str);
            if (find != null) {
                buildRegex(str.substring(0, find.getRange().first), sb, arrayList);
                this.isExactDeepLink = (WILDCARD_REGEX.containsMatchIn(sb) || PATH_REGEX.containsMatchIn(sb)) ? false : true;
                sb.append("($|(\\?(.)*)|(#(.)*))");
            }
            this.pathRegex = saveWildcardInRegex(sb.toString());
        }
        if (str3 == null) {
            return;
        }
        if (!new Regex("^[\\s\\S]+/[\\s\\S]+$").matches(str3)) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
            throw null;
        }
        List split = new Regex("/").split(0, str3);
        if (!split.isEmpty()) {
            ListIterator listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = EmptyList.INSTANCE;
        this.mimeTypeRegex = StringsKt__StringsJVMKt.replace$default(Boxes$$ExternalSyntheticOutline1.m("^(", (String) list.get(0), "|[*]+)/(", (String) list.get(1), "|[*]+)$"), "*|[*]", "[\\s\\S]");
    }

    public static void buildRegex(String str, StringBuilder sb, ArrayList arrayList) {
        int i = 0;
        for (MatcherMatchResult find = FILL_IN_PATTERN.find(str); find != null; find = find.next()) {
            MatchGroup matchGroup = find.groups.get(1);
            matchGroup.getClass();
            arrayList.add(matchGroup.value);
            if (find.getRange().first > i) {
                Regex.Companion companion = Regex.INSTANCE;
                String substring = str.substring(i, find.getRange().first);
                companion.getClass();
                String quote = Pattern.quote(substring);
                quote.getClass();
                sb.append(quote);
            }
            String pattern = PATH_REGEX.nativePattern.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = find.getRange().last + 1;
        }
        if (i < str.length()) {
            Regex.Companion companion2 = Regex.INSTANCE;
            String substring2 = str.substring(i);
            companion2.getClass();
            String quote2 = Pattern.quote(substring2);
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static void parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument == null) {
            str.getClass();
            bundle.putString(str, str2);
        } else {
            NavType navType = navArgument.f901type;
            str.getClass();
            navType.put(bundle, str, navType.mo1158parseValue(str2));
        }
    }

    public static String saveWildcardInRegex(String str) {
        return (StringsKt.contains((CharSequence) str, (CharSequence) "\\Q", false) && StringsKt.contains((CharSequence) str, (CharSequence) "\\E", false)) ? StringsKt__StringsJVMKt.replace$default(str, ".*", "\\E.*\\Q") : StringsKt.contains((CharSequence) str, (CharSequence) "\\.\\*", false) ? StringsKt__StringsJVMKt.replace$default(str, "\\.\\*", ".*") : str;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(Uri uri) {
        String str;
        if (uri == null || (str = this.uriPattern) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(str);
        parse.getClass();
        return CollectionsKt.intersect(pathSegments, parse.getPathSegments()).size();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (Intrinsics.areEqual(this.uriPattern, navDeepLink.uriPattern) && Intrinsics.areEqual(this.action, navDeepLink.action) && Intrinsics.areEqual(this.mimeType, navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList getArgumentsNames$navigation_common_release() {
        Collection values = ((Map) this.queryArgsMap$delegate.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            CollectionsKt__MutableCollectionsKt.addAll(((ParamQuery) it.next()).arguments, arrayList);
        }
        return CollectionsKt.plus((Iterable) this.fragArgs$delegate.getValue(), (Collection) CollectionsKt.plus((Iterable) arrayList, (Collection) this.pathArgs));
    }

    public final Bundle getMatchingArguments(Uri uri, LinkedHashMap linkedHashMap) {
        MatcherMatchResult matchEntire;
        MatcherMatchResult matchEntire2;
        String str;
        String str2;
        uri.getClass();
        linkedHashMap.getClass();
        Regex regex = (Regex) this.pathPattern$delegate.getValue();
        if (regex != null && (matchEntire = regex.matchEntire(uri.toString())) != null) {
            EmptyMap.INSTANCE.getClass();
            Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            if (getMatchingPathArguments(matchEntire, bundleOf, linkedHashMap) && (!((Boolean) this.isParameterizedQuery$delegate.getValue()).booleanValue() || getMatchingQueryArguments(uri, bundleOf, linkedHashMap))) {
                String fragment = uri.getFragment();
                Regex regex2 = (Regex) this.fragPattern$delegate.getValue();
                if (regex2 != null && (matchEntire2 = regex2.matchEntire(String.valueOf(fragment))) != null) {
                    List list = (List) this.fragArgs$delegate.getValue();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                            throw null;
                        }
                        String str3 = (String) obj;
                        MatchGroup matchGroup = matchEntire2.groups.get(i2);
                        if (matchGroup == null || (str2 = matchGroup.value) == null) {
                            str = null;
                        } else {
                            str = Uri.decode(str2);
                            str.getClass();
                        }
                        if (str == null) {
                            str = "";
                        }
                        try {
                            parseArgument(bundleOf, str3, str, (NavArgument) linkedHashMap.get(str3));
                            arrayList.add(Unit.INSTANCE);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (NavArgumentKt.missingRequiredArguments(linkedHashMap, new NavDeepLink$$ExternalSyntheticLambda8(bundleOf, 0)).isEmpty()) {
                    return bundleOf;
                }
            }
        }
        return null;
    }

    public final boolean getMatchingPathArguments(MatcherMatchResult matcherMatchResult, Bundle bundle, Map map) {
        String str;
        ArrayList arrayList = this.pathArgs;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            String str2 = null;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
                throw null;
            }
            String str3 = (String) next;
            MatchGroup matchGroup = matcherMatchResult.groups.get(i2);
            if (matchGroup != null && (str = matchGroup.value) != null) {
                str2 = Uri.decode(str);
                str2.getClass();
            }
            if (str2 == null) {
                str2 = "";
            }
            try {
                parseArgument(bundle, str3, str2, (NavArgument) map.get(str3));
                arrayList2.add(Unit.INSTANCE);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.Map] */
    public final boolean getMatchingQueryArguments(Uri uri, Bundle bundle, Map map) {
        Object obj;
        boolean z;
        Object obj2;
        String query;
        for (Map.Entry entry : ((Map) this.queryArgsMap$delegate.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            ParamQuery paramQuery = (ParamQuery) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.isSingleQueryParamValueOnly && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = CollectionsKt__CollectionsJVMKt.listOf(query);
            }
            EmptyMap.INSTANCE.getClass();
            boolean z2 = false;
            Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            Iterator it = paramQuery.arguments.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str2 = (String) it.next();
                    NavArgument navArgument = (NavArgument) map.get(str2);
                    NavType navType = navArgument != null ? navArgument.f901type : null;
                    if ((navType instanceof IntListNavType) && !navArgument.isDefaultValuePresent) {
                        IntListNavType intListNavType = (IntListNavType) navType;
                        switch (intListNavType.$r8$classId) {
                            case 0:
                                obj2 = EmptyList.INSTANCE;
                                break;
                            case 1:
                                obj2 = new boolean[0];
                                break;
                            case 2:
                                obj2 = EmptyList.INSTANCE;
                                break;
                            case 3:
                                obj2 = new float[0];
                                break;
                            case 4:
                                obj2 = EmptyList.INSTANCE;
                                break;
                            case 5:
                                obj2 = new int[0];
                                break;
                            case 6:
                                obj2 = new long[0];
                                break;
                            case 7:
                                obj2 = EmptyList.INSTANCE;
                                break;
                            case 8:
                                obj2 = new String[0];
                                break;
                            default:
                                obj2 = EmptyList.INSTANCE;
                                break;
                        }
                        intListNavType.put(bundleOf, str2, obj2);
                    }
                } else {
                    for (String str3 : queryParameters) {
                        String str4 = paramQuery.paramRegex;
                        MatcherMatchResult matchEntire = str4 != null ? new Regex(str4).matchEntire(str3) : null;
                        if (matchEntire == null) {
                            return z2;
                        }
                        ArrayList arrayList = paramQuery.arguments;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        ?? r13 = z2;
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int i = r13 + 1;
                            if (r13 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                                throw null;
                            }
                            String str5 = (String) next;
                            MatchGroup matchGroup = matchEntire.groups.get(i);
                            String str6 = matchGroup != null ? matchGroup.value : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            NavArgument navArgument2 = (NavArgument) map.get(str5);
                            try {
                                if (BundleKt.m1093containsimpl(bundleOf, str5)) {
                                    if (bundleOf.containsKey(str5)) {
                                        if (navArgument2 != null) {
                                            NavType navType2 = navArgument2.f901type;
                                            Object obj3 = navType2.get(bundleOf, str5);
                                            if (!bundleOf.containsKey(str5)) {
                                                throw new IllegalArgumentException("There is no previous value in this savedState.");
                                            }
                                            navType2.put(bundleOf, str5, navType2.parseValue(obj3, str6));
                                        }
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    obj = Boolean.valueOf(z);
                                } else {
                                    parseArgument(bundleOf, str5, str6, navArgument2);
                                    obj = Unit.INSTANCE;
                                }
                            } catch (IllegalArgumentException unused) {
                                obj = Unit.INSTANCE;
                            }
                            arrayList2.add(obj);
                            r13 = i;
                            z2 = false;
                        }
                    }
                    bundle.putAll(bundleOf);
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.uriPattern;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
