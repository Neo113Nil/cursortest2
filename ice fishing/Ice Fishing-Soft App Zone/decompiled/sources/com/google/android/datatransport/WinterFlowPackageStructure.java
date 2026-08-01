package com.google.android.datatransport;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowPackageStructure {
    public final WinterFlowRendererNode WinterFlowArrayNetwork;
    public final String WinterFlowCacheManagerAgent;
    public final ArrayList WinterFlowHookDataSource;
    public final WinterFlowCloudCache WinterFlowResponseEngine;
    public final WinterFlowCloudCache WinterFlowRouterRouter;
    public final String WinterFlowRouterStructure;
    public final boolean WinterFlowServerProtocol;
    public final WinterFlowCloudCache WinterFlowSyntax;
    public final WinterFlowRendererNode WinterFlowTransactionAgent;
    public final WinterFlowCloudCache WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public final WinterFlowRendererNode WinterFlowVariableVersionControl;
    public static final WinterFlowListenerVersionControl WinterFlowThreadListener = new WinterFlowListenerVersionControl("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final WinterFlowListenerVersionControl WinterFlowServiceUtility = new WinterFlowListenerVersionControl("\\{(.+?)\\}");
    public static final WinterFlowListenerVersionControl WinterFlowBandwidthObject = new WinterFlowListenerVersionControl("http[s]?://");
    public static final WinterFlowListenerVersionControl WinterFlowOrchestrationSubsystem = new WinterFlowListenerVersionControl(".*");
    public static final WinterFlowListenerVersionControl WinterFlowConcurrencyThread = new WinterFlowListenerVersionControl("([^/]*?|)");
    public static final WinterFlowListenerVersionControl WinterFlowSingletonPlatform = new WinterFlowListenerVersionControl("^[^?#]+\\?([^#]*).*");

    public WinterFlowPackageStructure(String str) {
        this.WinterFlowRouterStructure = str;
        ArrayList arrayList = new ArrayList();
        this.WinterFlowHookDataSource = arrayList;
        boolean z = false;
        z = false;
        final int i = z ? 1 : 0;
        this.WinterFlowArrayNetwork = new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowBandwidthEngine
            public final /* synthetic */ WinterFlowPackageStructure WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                List list;
                int i2 = i;
                WinterFlowPackageStructure winterFlowPackageStructure = this.WinterFlowTransactionManagerStrategy;
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = winterFlowPackageStructure.WinterFlowCacheManagerAgent;
                        if (str2 != null) {
                            return new WinterFlowListenerVersionControl(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowPackageStructure.WinterFlowSingletonPlatform;
                        winterFlowListenerVersionControl.getClass();
                        return Boolean.valueOf(winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str3).matches());
                    case 2:
                        String str4 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(queryParameters);
                                if (str6 == null) {
                                    winterFlowPackageStructure.WinterFlowUnitTestResponse = true;
                                    str6 = str5;
                                }
                                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = WinterFlowPackageStructure.WinterFlowServiceUtility;
                                winterFlowListenerVersionControl2.getClass();
                                str6.getClass();
                                Matcher matcher = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(str6);
                                matcher.getClass();
                                WinterFlowInterfaceHelper winterFlowInterfaceHelper = new WinterFlowInterfaceHelper();
                                int i3 = 0;
                                for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str6); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
                                    WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
                                    WinterFlowCacheManagerAgent.getClass();
                                    winterFlowInterfaceHelper.WinterFlowHookDataSource.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                                    if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i3) {
                                        String quote = Pattern.quote(str6.substring(i3, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
                                }
                                if (i3 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                winterFlowInterfaceHelper.WinterFlowRouterStructure = WinterFlowPackageStructure.WinterFlowUnitTestResponse(sb.toString());
                                linkedHashMap.put(str5, winterFlowInterfaceHelper);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = winterFlowPackageStructure.WinterFlowRouterStructure;
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
                        WinterFlowPackageStructure.WinterFlowRouterStructure(fragment, arrayList2, sb2);
                        return new WinterFlowServerPlatform(arrayList2, sb2.toString());
                    case 4:
                        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        return (winterFlowServerPlatform == null || (list = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl) == null) ? new ArrayList() : list;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        if (winterFlowServerPlatform2 != null) {
                            return (String) winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy;
                        }
                        return null;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) winterFlowPackageStructure.WinterFlowResponseEngine.getValue();
                        if (str8 != null) {
                            return new WinterFlowListenerVersionControl(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i2 = 1;
        this.WinterFlowVariableVersionControl = new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowBandwidthEngine
            public final /* synthetic */ WinterFlowPackageStructure WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                List list;
                int i22 = i2;
                WinterFlowPackageStructure winterFlowPackageStructure = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = winterFlowPackageStructure.WinterFlowCacheManagerAgent;
                        if (str2 != null) {
                            return new WinterFlowListenerVersionControl(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowPackageStructure.WinterFlowSingletonPlatform;
                        winterFlowListenerVersionControl.getClass();
                        return Boolean.valueOf(winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str3).matches());
                    case 2:
                        String str4 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(queryParameters);
                                if (str6 == null) {
                                    winterFlowPackageStructure.WinterFlowUnitTestResponse = true;
                                    str6 = str5;
                                }
                                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = WinterFlowPackageStructure.WinterFlowServiceUtility;
                                winterFlowListenerVersionControl2.getClass();
                                str6.getClass();
                                Matcher matcher = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(str6);
                                matcher.getClass();
                                WinterFlowInterfaceHelper winterFlowInterfaceHelper = new WinterFlowInterfaceHelper();
                                int i3 = 0;
                                for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str6); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
                                    WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
                                    WinterFlowCacheManagerAgent.getClass();
                                    winterFlowInterfaceHelper.WinterFlowHookDataSource.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                                    if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i3) {
                                        String quote = Pattern.quote(str6.substring(i3, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i3 = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
                                }
                                if (i3 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i3));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                winterFlowInterfaceHelper.WinterFlowRouterStructure = WinterFlowPackageStructure.WinterFlowUnitTestResponse(sb.toString());
                                linkedHashMap.put(str5, winterFlowInterfaceHelper);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = winterFlowPackageStructure.WinterFlowRouterStructure;
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
                        WinterFlowPackageStructure.WinterFlowRouterStructure(fragment, arrayList2, sb2);
                        return new WinterFlowServerPlatform(arrayList2, sb2.toString());
                    case 4:
                        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        return (winterFlowServerPlatform == null || (list = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl) == null) ? new ArrayList() : list;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        if (winterFlowServerPlatform2 != null) {
                            return (String) winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy;
                        }
                        return null;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) winterFlowPackageStructure.WinterFlowResponseEngine.getValue();
                        if (str8 != null) {
                            return new WinterFlowListenerVersionControl(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i3 = 2;
        WinterFlowObjectUI winterFlowObjectUI = new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowBandwidthEngine
            public final /* synthetic */ WinterFlowPackageStructure WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                List list;
                int i22 = i3;
                WinterFlowPackageStructure winterFlowPackageStructure = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = winterFlowPackageStructure.WinterFlowCacheManagerAgent;
                        if (str2 != null) {
                            return new WinterFlowListenerVersionControl(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowPackageStructure.WinterFlowSingletonPlatform;
                        winterFlowListenerVersionControl.getClass();
                        return Boolean.valueOf(winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str3).matches());
                    case 2:
                        String str4 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(queryParameters);
                                if (str6 == null) {
                                    winterFlowPackageStructure.WinterFlowUnitTestResponse = true;
                                    str6 = str5;
                                }
                                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = WinterFlowPackageStructure.WinterFlowServiceUtility;
                                winterFlowListenerVersionControl2.getClass();
                                str6.getClass();
                                Matcher matcher = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(str6);
                                matcher.getClass();
                                WinterFlowInterfaceHelper winterFlowInterfaceHelper = new WinterFlowInterfaceHelper();
                                int i32 = 0;
                                for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str6); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
                                    WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
                                    WinterFlowCacheManagerAgent.getClass();
                                    winterFlowInterfaceHelper.WinterFlowHookDataSource.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                                    if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                winterFlowInterfaceHelper.WinterFlowRouterStructure = WinterFlowPackageStructure.WinterFlowUnitTestResponse(sb.toString());
                                linkedHashMap.put(str5, winterFlowInterfaceHelper);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = winterFlowPackageStructure.WinterFlowRouterStructure;
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
                        WinterFlowPackageStructure.WinterFlowRouterStructure(fragment, arrayList2, sb2);
                        return new WinterFlowServerPlatform(arrayList2, sb2.toString());
                    case 4:
                        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        return (winterFlowServerPlatform == null || (list = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl) == null) ? new ArrayList() : list;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        if (winterFlowServerPlatform2 != null) {
                            return (String) winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy;
                        }
                        return null;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) winterFlowPackageStructure.WinterFlowResponseEngine.getValue();
                        if (str8 != null) {
                            return new WinterFlowListenerVersionControl(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        };
        WinterFlowArrayInterface winterFlowArrayInterface = WinterFlowArrayInterface.WinterFlowTransactionManagerStrategy;
        this.WinterFlowTransactionManagerStrategy = WinterFlowHandlerWebsocket.WinterFlowCompilerVariable(winterFlowArrayInterface, winterFlowObjectUI);
        final int i4 = 3;
        this.WinterFlowRouterRouter = WinterFlowHandlerWebsocket.WinterFlowCompilerVariable(winterFlowArrayInterface, new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowBandwidthEngine
            public final /* synthetic */ WinterFlowPackageStructure WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                List list;
                int i22 = i4;
                WinterFlowPackageStructure winterFlowPackageStructure = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = winterFlowPackageStructure.WinterFlowCacheManagerAgent;
                        if (str2 != null) {
                            return new WinterFlowListenerVersionControl(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowPackageStructure.WinterFlowSingletonPlatform;
                        winterFlowListenerVersionControl.getClass();
                        return Boolean.valueOf(winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str3).matches());
                    case 2:
                        String str4 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(queryParameters);
                                if (str6 == null) {
                                    winterFlowPackageStructure.WinterFlowUnitTestResponse = true;
                                    str6 = str5;
                                }
                                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = WinterFlowPackageStructure.WinterFlowServiceUtility;
                                winterFlowListenerVersionControl2.getClass();
                                str6.getClass();
                                Matcher matcher = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(str6);
                                matcher.getClass();
                                WinterFlowInterfaceHelper winterFlowInterfaceHelper = new WinterFlowInterfaceHelper();
                                int i32 = 0;
                                for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str6); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
                                    WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
                                    WinterFlowCacheManagerAgent.getClass();
                                    winterFlowInterfaceHelper.WinterFlowHookDataSource.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                                    if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                winterFlowInterfaceHelper.WinterFlowRouterStructure = WinterFlowPackageStructure.WinterFlowUnitTestResponse(sb.toString());
                                linkedHashMap.put(str5, winterFlowInterfaceHelper);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = winterFlowPackageStructure.WinterFlowRouterStructure;
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
                        WinterFlowPackageStructure.WinterFlowRouterStructure(fragment, arrayList2, sb2);
                        return new WinterFlowServerPlatform(arrayList2, sb2.toString());
                    case 4:
                        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        return (winterFlowServerPlatform == null || (list = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl) == null) ? new ArrayList() : list;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        if (winterFlowServerPlatform2 != null) {
                            return (String) winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy;
                        }
                        return null;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) winterFlowPackageStructure.WinterFlowResponseEngine.getValue();
                        if (str8 != null) {
                            return new WinterFlowListenerVersionControl(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i5 = 4;
        this.WinterFlowSyntax = WinterFlowHandlerWebsocket.WinterFlowCompilerVariable(winterFlowArrayInterface, new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowBandwidthEngine
            public final /* synthetic */ WinterFlowPackageStructure WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                List list;
                int i22 = i5;
                WinterFlowPackageStructure winterFlowPackageStructure = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = winterFlowPackageStructure.WinterFlowCacheManagerAgent;
                        if (str2 != null) {
                            return new WinterFlowListenerVersionControl(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowPackageStructure.WinterFlowSingletonPlatform;
                        winterFlowListenerVersionControl.getClass();
                        return Boolean.valueOf(winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str3).matches());
                    case 2:
                        String str4 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(queryParameters);
                                if (str6 == null) {
                                    winterFlowPackageStructure.WinterFlowUnitTestResponse = true;
                                    str6 = str5;
                                }
                                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = WinterFlowPackageStructure.WinterFlowServiceUtility;
                                winterFlowListenerVersionControl2.getClass();
                                str6.getClass();
                                Matcher matcher = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(str6);
                                matcher.getClass();
                                WinterFlowInterfaceHelper winterFlowInterfaceHelper = new WinterFlowInterfaceHelper();
                                int i32 = 0;
                                for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str6); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
                                    WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
                                    WinterFlowCacheManagerAgent.getClass();
                                    winterFlowInterfaceHelper.WinterFlowHookDataSource.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                                    if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                winterFlowInterfaceHelper.WinterFlowRouterStructure = WinterFlowPackageStructure.WinterFlowUnitTestResponse(sb.toString());
                                linkedHashMap.put(str5, winterFlowInterfaceHelper);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = winterFlowPackageStructure.WinterFlowRouterStructure;
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
                        WinterFlowPackageStructure.WinterFlowRouterStructure(fragment, arrayList2, sb2);
                        return new WinterFlowServerPlatform(arrayList2, sb2.toString());
                    case 4:
                        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        return (winterFlowServerPlatform == null || (list = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl) == null) ? new ArrayList() : list;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        if (winterFlowServerPlatform2 != null) {
                            return (String) winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy;
                        }
                        return null;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) winterFlowPackageStructure.WinterFlowResponseEngine.getValue();
                        if (str8 != null) {
                            return new WinterFlowListenerVersionControl(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i6 = 5;
        this.WinterFlowResponseEngine = WinterFlowHandlerWebsocket.WinterFlowCompilerVariable(winterFlowArrayInterface, new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowBandwidthEngine
            public final /* synthetic */ WinterFlowPackageStructure WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                List list;
                int i22 = i6;
                WinterFlowPackageStructure winterFlowPackageStructure = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = winterFlowPackageStructure.WinterFlowCacheManagerAgent;
                        if (str2 != null) {
                            return new WinterFlowListenerVersionControl(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowPackageStructure.WinterFlowSingletonPlatform;
                        winterFlowListenerVersionControl.getClass();
                        return Boolean.valueOf(winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str3).matches());
                    case 2:
                        String str4 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(queryParameters);
                                if (str6 == null) {
                                    winterFlowPackageStructure.WinterFlowUnitTestResponse = true;
                                    str6 = str5;
                                }
                                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = WinterFlowPackageStructure.WinterFlowServiceUtility;
                                winterFlowListenerVersionControl2.getClass();
                                str6.getClass();
                                Matcher matcher = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(str6);
                                matcher.getClass();
                                WinterFlowInterfaceHelper winterFlowInterfaceHelper = new WinterFlowInterfaceHelper();
                                int i32 = 0;
                                for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str6); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
                                    WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
                                    WinterFlowCacheManagerAgent.getClass();
                                    winterFlowInterfaceHelper.WinterFlowHookDataSource.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                                    if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                winterFlowInterfaceHelper.WinterFlowRouterStructure = WinterFlowPackageStructure.WinterFlowUnitTestResponse(sb.toString());
                                linkedHashMap.put(str5, winterFlowInterfaceHelper);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = winterFlowPackageStructure.WinterFlowRouterStructure;
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
                        WinterFlowPackageStructure.WinterFlowRouterStructure(fragment, arrayList2, sb2);
                        return new WinterFlowServerPlatform(arrayList2, sb2.toString());
                    case 4:
                        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        return (winterFlowServerPlatform == null || (list = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl) == null) ? new ArrayList() : list;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        if (winterFlowServerPlatform2 != null) {
                            return (String) winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy;
                        }
                        return null;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) winterFlowPackageStructure.WinterFlowResponseEngine.getValue();
                        if (str8 != null) {
                            return new WinterFlowListenerVersionControl(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i7 = 6;
        this.WinterFlowTransactionAgent = new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowBandwidthEngine
            public final /* synthetic */ WinterFlowPackageStructure WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                List list;
                int i22 = i7;
                WinterFlowPackageStructure winterFlowPackageStructure = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = winterFlowPackageStructure.WinterFlowCacheManagerAgent;
                        if (str2 != null) {
                            return new WinterFlowListenerVersionControl(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowPackageStructure.WinterFlowSingletonPlatform;
                        winterFlowListenerVersionControl.getClass();
                        return Boolean.valueOf(winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str3).matches());
                    case 2:
                        String str4 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(queryParameters);
                                if (str6 == null) {
                                    winterFlowPackageStructure.WinterFlowUnitTestResponse = true;
                                    str6 = str5;
                                }
                                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = WinterFlowPackageStructure.WinterFlowServiceUtility;
                                winterFlowListenerVersionControl2.getClass();
                                str6.getClass();
                                Matcher matcher = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(str6);
                                matcher.getClass();
                                WinterFlowInterfaceHelper winterFlowInterfaceHelper = new WinterFlowInterfaceHelper();
                                int i32 = 0;
                                for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str6); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
                                    WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
                                    WinterFlowCacheManagerAgent.getClass();
                                    winterFlowInterfaceHelper.WinterFlowHookDataSource.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                                    if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                winterFlowInterfaceHelper.WinterFlowRouterStructure = WinterFlowPackageStructure.WinterFlowUnitTestResponse(sb.toString());
                                linkedHashMap.put(str5, winterFlowInterfaceHelper);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = winterFlowPackageStructure.WinterFlowRouterStructure;
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
                        WinterFlowPackageStructure.WinterFlowRouterStructure(fragment, arrayList2, sb2);
                        return new WinterFlowServerPlatform(arrayList2, sb2.toString());
                    case 4:
                        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        return (winterFlowServerPlatform == null || (list = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl) == null) ? new ArrayList() : list;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        if (winterFlowServerPlatform2 != null) {
                            return (String) winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy;
                        }
                        return null;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) winterFlowPackageStructure.WinterFlowResponseEngine.getValue();
                        if (str8 != null) {
                            return new WinterFlowListenerVersionControl(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        final int i8 = 7;
        new WinterFlowRendererNode(new WinterFlowObjectUI(this) { // from class: com.google.android.datatransport.WinterFlowBandwidthEngine
            public final /* synthetic */ WinterFlowPackageStructure WinterFlowTransactionManagerStrategy;

            {
                this.WinterFlowTransactionManagerStrategy = this;
            }

            @Override // com.google.android.datatransport.WinterFlowObjectUI
            public final Object WinterFlowRouterStructure() {
                List list;
                int i22 = i8;
                WinterFlowPackageStructure winterFlowPackageStructure = this.WinterFlowTransactionManagerStrategy;
                switch (i22) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        String str2 = winterFlowPackageStructure.WinterFlowCacheManagerAgent;
                        if (str2 != null) {
                            return new WinterFlowListenerVersionControl(str2, 0);
                        }
                        return null;
                    case 1:
                        String str3 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowPackageStructure.WinterFlowSingletonPlatform;
                        winterFlowListenerVersionControl.getClass();
                        return Boolean.valueOf(winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str3).matches());
                    case 2:
                        String str4 = winterFlowPackageStructure.WinterFlowRouterStructure;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (((Boolean) winterFlowPackageStructure.WinterFlowVariableVersionControl.getValue()).booleanValue()) {
                            Uri parse = Uri.parse(str4);
                            parse.getClass();
                            for (String str5 : parse.getQueryParameterNames()) {
                                StringBuilder sb = new StringBuilder();
                                List<String> queryParameters = parse.getQueryParameters(str5);
                                if (queryParameters.size() > 1) {
                                    WinterFlowEventEmitterOrchestration.WinterFlowSingletonPlatform("Query parameter ", str5, " must only be present once in ", str4, ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.");
                                    return null;
                                }
                                String str6 = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(queryParameters);
                                if (str6 == null) {
                                    winterFlowPackageStructure.WinterFlowUnitTestResponse = true;
                                    str6 = str5;
                                }
                                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = WinterFlowPackageStructure.WinterFlowServiceUtility;
                                winterFlowListenerVersionControl2.getClass();
                                str6.getClass();
                                Matcher matcher = winterFlowListenerVersionControl2.WinterFlowVariableVersionControl.matcher(str6);
                                matcher.getClass();
                                WinterFlowInterfaceHelper winterFlowInterfaceHelper = new WinterFlowInterfaceHelper();
                                int i32 = 0;
                                for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str6); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
                                    WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
                                    WinterFlowCacheManagerAgent.getClass();
                                    winterFlowInterfaceHelper.WinterFlowHookDataSource.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                                    if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i32) {
                                        String quote = Pattern.quote(str6.substring(i32, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                                        quote.getClass();
                                        sb.append(quote);
                                    }
                                    sb.append("([\\s\\S]+?)?");
                                    i32 = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
                                }
                                if (i32 < str6.length()) {
                                    String quote2 = Pattern.quote(str6.substring(i32));
                                    quote2.getClass();
                                    sb.append(quote2);
                                }
                                sb.append("$");
                                winterFlowInterfaceHelper.WinterFlowRouterStructure = WinterFlowPackageStructure.WinterFlowUnitTestResponse(sb.toString());
                                linkedHashMap.put(str5, winterFlowInterfaceHelper);
                            }
                        }
                        return linkedHashMap;
                    case 3:
                        String str7 = winterFlowPackageStructure.WinterFlowRouterStructure;
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
                        WinterFlowPackageStructure.WinterFlowRouterStructure(fragment, arrayList2, sb2);
                        return new WinterFlowServerPlatform(arrayList2, sb2.toString());
                    case 4:
                        WinterFlowServerPlatform winterFlowServerPlatform = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        return (winterFlowServerPlatform == null || (list = (List) winterFlowServerPlatform.WinterFlowVariableVersionControl) == null) ? new ArrayList() : list;
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowServerPlatform winterFlowServerPlatform2 = (WinterFlowServerPlatform) winterFlowPackageStructure.WinterFlowRouterRouter.getValue();
                        if (winterFlowServerPlatform2 != null) {
                            return (String) winterFlowServerPlatform2.WinterFlowTransactionManagerStrategy;
                        }
                        return null;
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        String str8 = (String) winterFlowPackageStructure.WinterFlowResponseEngine.getValue();
                        if (str8 != null) {
                            return new WinterFlowListenerVersionControl(str8, 0);
                        }
                        return null;
                    default:
                        return null;
                }
            }
        });
        StringBuilder sb = new StringBuilder("^");
        if (!WinterFlowThreadListener.WinterFlowVariableVersionControl.matcher(str).find()) {
            String pattern = WinterFlowBandwidthObject.WinterFlowVariableVersionControl.pattern();
            pattern.getClass();
            sb.append(pattern);
        }
        Pattern compile = Pattern.compile("(\\?|#|$)");
        compile.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str);
        if (WinterFlowTransactionAgent != null) {
            WinterFlowRouterStructure(str.substring(0, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl), arrayList, sb);
            if (!WinterFlowOrchestrationSubsystem.WinterFlowVariableVersionControl.matcher(sb).find() && !WinterFlowConcurrencyThread.WinterFlowVariableVersionControl.matcher(sb).find()) {
                z = true;
            }
            this.WinterFlowServerProtocol = z;
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.WinterFlowCacheManagerAgent = WinterFlowUnitTestResponse(sb.toString());
    }

    public static void WinterFlowRouterStructure(String str, ArrayList arrayList, StringBuilder sb) {
        WinterFlowListenerVersionControl winterFlowListenerVersionControl = WinterFlowServiceUtility;
        winterFlowListenerVersionControl.getClass();
        Matcher matcher = winterFlowListenerVersionControl.WinterFlowVariableVersionControl.matcher(str);
        matcher.getClass();
        int i = 0;
        for (WinterFlowStackProvider WinterFlowTransactionAgent = WinterFlowNodeVersion.WinterFlowTransactionAgent(matcher, 0, str); WinterFlowTransactionAgent != null; WinterFlowTransactionAgent = WinterFlowTransactionAgent.WinterFlowBatchUI()) {
            WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowTransactionAgent.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(1);
            WinterFlowCacheManagerAgent.getClass();
            arrayList.add(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
            if (WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl > i) {
                String quote = Pattern.quote(str.substring(i, WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowVariableVersionControl));
                quote.getClass();
                sb.append(quote);
            }
            String pattern = WinterFlowConcurrencyThread.WinterFlowVariableVersionControl.pattern();
            pattern.getClass();
            sb.append(pattern);
            i = WinterFlowTransactionAgent.WinterFlowServiceUtility().WinterFlowTransactionManagerStrategy + 1;
        }
        if (i < str.length()) {
            String quote2 = Pattern.quote(str.substring(i));
            quote2.getClass();
            sb.append(quote2);
        }
    }

    public static String WinterFlowUnitTestResponse(String str) {
        return (WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(str, "\\Q") && WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(str, "\\E")) ? WinterFlowHookModule.WinterFlowMapperProtocol(str, ".*", "\\E.*\\Q") : WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(str, "\\.\\*") ? WinterFlowHookModule.WinterFlowMapperProtocol(str, "\\.\\*", ".*") : str;
    }

    public final Bundle WinterFlowArrayNetwork(Uri uri, LinkedHashMap linkedHashMap) {
        WinterFlowStackProvider WinterFlowRouterStructure;
        WinterFlowStackProvider WinterFlowRouterStructure2;
        String str;
        uri.getClass();
        WinterFlowListenerVersionControl winterFlowListenerVersionControl = (WinterFlowListenerVersionControl) this.WinterFlowArrayNetwork.getValue();
        if (winterFlowListenerVersionControl != null && (WinterFlowRouterStructure = winterFlowListenerVersionControl.WinterFlowRouterStructure(uri.toString())) != null) {
            Bundle WinterFlowOrchestrationSubsystem2 = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
            if (WinterFlowVariableVersionControl(WinterFlowRouterStructure, WinterFlowOrchestrationSubsystem2, linkedHashMap) && (!((Boolean) this.WinterFlowVariableVersionControl.getValue()).booleanValue() || WinterFlowTransactionManagerStrategy(uri, WinterFlowOrchestrationSubsystem2, linkedHashMap))) {
                String fragment = uri.getFragment();
                WinterFlowListenerVersionControl winterFlowListenerVersionControl2 = (WinterFlowListenerVersionControl) this.WinterFlowTransactionAgent.getValue();
                if (winterFlowListenerVersionControl2 != null && (WinterFlowRouterStructure2 = winterFlowListenerVersionControl2.WinterFlowRouterStructure(String.valueOf(fragment))) != null) {
                    List list = (List) this.WinterFlowSyntax.getValue();
                    ArrayList arrayList = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(list, 10));
                    int i = 0;
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                            throw null;
                        }
                        String str2 = (String) obj;
                        WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) WinterFlowRouterStructure2.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(i2);
                        if (WinterFlowCacheManagerAgent != null) {
                            str = Uri.decode(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                            str.getClass();
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                        if (linkedHashMap.get(str2) != null) {
                            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                            return null;
                        }
                        try {
                            str2.getClass();
                            WinterFlowOrchestrationSubsystem2.putString(str2, str);
                            arrayList.add(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                            i = i2;
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                }
                if (WinterFlowUnitTestLibrary.WinterFlowSoftwareEngine(linkedHashMap, new WinterFlowSessionManagerInvoker(WinterFlowOrchestrationSubsystem2, 0)).isEmpty()) {
                    return WinterFlowOrchestrationSubsystem2;
                }
            }
        }
        return null;
    }

    public final ArrayList WinterFlowCacheManagerAgent() {
        Collection values = ((Map) this.WinterFlowTransactionManagerStrategy.getValue()).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            WinterFlowEventEmitterNode.WinterFlowVariableInterface(arrayList, ((WinterFlowInterfaceHelper) it.next()).WinterFlowHookDataSource);
        }
        return WinterFlowSerializerUtility.WinterFlowResolverListener(WinterFlowSerializerUtility.WinterFlowResolverListener(this.WinterFlowHookDataSource, arrayList), (List) this.WinterFlowSyntax.getValue());
    }

    public final int WinterFlowHookDataSource(Uri uri) {
        if (uri == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        Uri parse = Uri.parse(this.WinterFlowRouterStructure);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WinterFlowTransactionManagerStrategy(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        WinterFlowStackProvider winterFlowStackProvider;
        Object obj;
        String query;
        for (Map.Entry entry : ((Map) this.WinterFlowTransactionManagerStrategy.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            WinterFlowInterfaceHelper winterFlowInterfaceHelper = (WinterFlowInterfaceHelper) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.WinterFlowUnitTestResponse && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(query);
            }
            WinterFlowAlgorithmSession winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            boolean z = false;
            Bundle WinterFlowOrchestrationSubsystem2 = WinterFlowManagerRequest.WinterFlowOrchestrationSubsystem((WinterFlowServerPlatform[]) Arrays.copyOf(new WinterFlowServerPlatform[0], 0));
            ArrayList arrayList = winterFlowInterfaceHelper.WinterFlowHookDataSource;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (linkedHashMap.get((String) obj2) != null) {
                    WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                    return false;
                }
            }
            for (String str2 : queryParameters) {
                String str3 = winterFlowInterfaceHelper.WinterFlowRouterStructure;
                if (str3 != null) {
                    Pattern compile = Pattern.compile(str3);
                    compile.getClass();
                    str2.getClass();
                    Matcher matcher = compile.matcher(str2);
                    matcher.getClass();
                    if (matcher.matches()) {
                        winterFlowStackProvider = new WinterFlowStackProvider(matcher, str2);
                        if (winterFlowStackProvider != null) {
                            return z;
                        }
                        ArrayList arrayList2 = winterFlowInterfaceHelper.WinterFlowHookDataSource;
                        ArrayList arrayList3 = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(arrayList2, 10));
                        int size2 = arrayList2.size();
                        int i2 = z;
                        int i3 = i2;
                        while (i2 < size2) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            boolean z2 = z;
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                                throw null;
                            }
                            String str4 = (String) obj3;
                            WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) winterFlowStackProvider.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(i4);
                            String str5 = WinterFlowCacheManagerAgent != null ? WinterFlowCacheManagerAgent.WinterFlowRouterStructure : null;
                            if (str5 == null) {
                                str5 = "";
                            }
                            if (linkedHashMap.get(str4) != null) {
                                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                                return z2;
                            }
                            try {
                                str4.getClass();
                            } catch (IllegalArgumentException unused) {
                            }
                            if (WinterFlowOrchestrationSubsystem2.containsKey(str4)) {
                                obj = Boolean.valueOf(!WinterFlowOrchestrationSubsystem2.containsKey(str4));
                                arrayList3.add(obj);
                                i3 = i4;
                                z = z2;
                            } else {
                                WinterFlowOrchestrationSubsystem2.putString(str4, str5);
                                obj = winterFlowAlgorithmSession;
                                arrayList3.add(obj);
                                i3 = i4;
                                z = z2;
                            }
                        }
                    }
                }
                winterFlowStackProvider = null;
                if (winterFlowStackProvider != null) {
                }
            }
            bundle.putAll(WinterFlowOrchestrationSubsystem2);
        }
        return true;
    }

    public final boolean WinterFlowVariableVersionControl(WinterFlowStackProvider winterFlowStackProvider, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.WinterFlowHookDataSource;
        ArrayList arrayList2 = new ArrayList(WinterFlowModuleThread.WinterFlowModuleAgent(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            String str = null;
            if (i < 0) {
                WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                throw null;
            }
            String str2 = (String) obj;
            WinterFlowAPIStructure WinterFlowCacheManagerAgent = ((WinterFlowLoaderRequest) winterFlowStackProvider.WinterFlowUnitTestResponse).WinterFlowCacheManagerAgent(i3);
            if (WinterFlowCacheManagerAgent != null) {
                str = Uri.decode(WinterFlowCacheManagerAgent.WinterFlowRouterStructure);
                str.getClass();
            }
            if (str == null) {
                str = "";
            }
            if (linkedHashMap.get(str2) != null) {
                WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                return false;
            }
            try {
                str2.getClass();
                bundle.putString(str2, str);
                arrayList2.add(WinterFlowAlgorithmSession.WinterFlowRouterStructure);
                i = i3;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof WinterFlowPackageStructure)) {
            return false;
        }
        return this.WinterFlowRouterStructure.equals(((WinterFlowPackageStructure) obj).WinterFlowRouterStructure);
    }

    public final int hashCode() {
        return this.WinterFlowRouterStructure.hashCode() * 961;
    }
}
