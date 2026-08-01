package com.google.android.datatransport;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.xmlpull.v1.XmlPullParserException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowEncryptionSubsystem {
    public static final WinterFlowCacheManagerVersionControl WinterFlowArrayHelper;
    public static final WinterFlowCacheManagerVersionControl WinterFlowBackendCacheManager;
    public static final WinterFlowCacheManagerVersionControl WinterFlowCompilerVariable;
    public static final WinterFlowCacheManagerVersionControl WinterFlowConsumerUserManager;
    public static final WinterFlowCacheManagerVersionControl WinterFlowEventEmitterController;
    public static final WinterFlowCacheManagerVersionControl WinterFlowMapperProtocol;
    public static final WinterFlowCacheManagerVersionControl WinterFlowResolverController;
    public static final WinterFlowCacheManagerVersionControl WinterFlowRouterAdapter;
    public static final WinterFlowCacheManagerVersionControl WinterFlowSerializerStructure;
    public static final WinterFlowTransactionManagerLayer[] WinterFlowRouterStructure = new WinterFlowTransactionManagerLayer[0];
    public static final byte[] WinterFlowHookDataSource = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public static final byte[] WinterFlowCacheManagerAgent = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    public static final byte[] WinterFlowArrayNetwork = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    public static final WinterFlowJSONDecorator WinterFlowVariableVersionControl = new WinterFlowJSONDecorator(25, "CLOSED");
    public static final WinterFlowEncryptionArray WinterFlowTransactionManagerStrategy = new WinterFlowEncryptionArray(false);
    public static final WinterFlowGatewayPlatform WinterFlowUnitTestResponse = new WinterFlowGatewayPlatform(0.31006f, 0.31616f);
    public static final WinterFlowGatewayPlatform WinterFlowRouterRouter = new WinterFlowGatewayPlatform(0.34567f, 0.3585f);
    public static final WinterFlowGatewayPlatform WinterFlowSyntax = new WinterFlowGatewayPlatform(0.32168f, 0.33767f);
    public static final WinterFlowGatewayPlatform WinterFlowResponseEngine = new WinterFlowGatewayPlatform(0.31271f, 0.32902f);
    public static final float[] WinterFlowTransactionAgent = {0.964212f, 1.0f, 0.825188f};
    public static final WinterFlowJSONDecorator WinterFlowServerProtocol = new WinterFlowJSONDecorator(25, "NULL");
    public static final byte[] WinterFlowThreadListener = {48, 49, 53, 0};
    public static final byte[] WinterFlowServiceUtility = {48, 49, 48, 0};
    public static final byte[] WinterFlowBandwidthObject = {48, 48, 57, 0};
    public static final byte[] WinterFlowOrchestrationSubsystem = {48, 48, 53, 0};
    public static final byte[] WinterFlowConcurrencyThread = {48, 48, 49, 0};
    public static final byte[] WinterFlowSingletonPlatform = {48, 48, 49, 0};
    public static final byte[] WinterFlowVariableBandwidth = {48, 48, 50, 0};
    public static final WinterFlowVersionParser WinterFlowBatchUI = new WinterFlowVersionParser(0.0f, 0.0f, 10.0f, 10.0f);

    static {
        final int i = 0;
        final int i2 = 4;
        final int i3 = 15;
        WinterFlowRouterAdapter = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowSessionManagerAgent(28), new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i3) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
        WinterFlowSerializerStructure = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowSessionManagerAgent(29), new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
        final int i4 = 1;
        final int i5 = 2;
        WinterFlowMapperProtocol = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i4) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        }, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i5) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
        final int i6 = 3;
        WinterFlowResolverController = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i6) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        }, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i2) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
        final int i7 = 5;
        final int i8 = 6;
        WinterFlowConsumerUserManager = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i7) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        }, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i8) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
        final int i9 = 7;
        final int i10 = 8;
        WinterFlowBackendCacheManager = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i9) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        }, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i10) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
        final int i11 = 9;
        final int i12 = 10;
        WinterFlowEventEmitterController = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i11) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        }, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
        final int i13 = 11;
        final int i14 = 12;
        WinterFlowArrayHelper = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        }, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i14) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
        final int i15 = 13;
        final int i16 = 14;
        WinterFlowCompilerVariable = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i15) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        }, new WinterFlowObjectSession() { // from class: com.google.android.datatransport.WinterFlowJSONLayer
            @Override // com.google.android.datatransport.WinterFlowObjectSession
            public final Object WinterFlowUnitTestResponse(Object obj) {
                switch (i16) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        return Integer.valueOf((int) ((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 1:
                        return new WinterFlowVariableSubsystem(((WinterFlowRequestScheduler) obj).WinterFlowVariableVersionControl);
                    case 2:
                        return new WinterFlowRequestScheduler(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    case 3:
                        WinterFlowUserManagerCache winterFlowUserManagerCache = (WinterFlowUserManagerCache) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowUserManagerCache.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowUserManagerCache.WinterFlowRouterStructure)));
                    case 4:
                        float f = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowUserManagerCache((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
                    case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                        WinterFlowModuleBandwidth winterFlowModuleBandwidth = (WinterFlowModuleBandwidth) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowModuleBandwidth.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowModuleBandwidth.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                        float f2 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowModuleBandwidth((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
                    case WinterFlowJSONLibrary.DOUBLE_FIELD_NUMBER /* 7 */:
                        WinterFlowHandlerResolver winterFlowHandlerResolver = (WinterFlowHandlerResolver) obj;
                        return new WinterFlowTestingSyntax(Float.intBitsToFloat((int) (winterFlowHandlerResolver.WinterFlowRouterStructure >> 32)), Float.intBitsToFloat((int) (4294967295L & winterFlowHandlerResolver.WinterFlowRouterStructure)));
                    case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                        float f3 = ((WinterFlowTestingSyntax) obj).WinterFlowRouterStructure;
                        return new WinterFlowHandlerResolver((Float.floatToRawIntBits(r8.WinterFlowHookDataSource) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32));
                    case 9:
                        long j = ((WinterFlowValidatorTesting) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j >> 32), (int) (4294967295L & j));
                    case 10:
                        WinterFlowTestingSyntax winterFlowTestingSyntax = (WinterFlowTestingSyntax) obj;
                        return new WinterFlowValidatorTesting((Math.round(winterFlowTestingSyntax.WinterFlowHookDataSource) & 4294967295L) | (Math.round(winterFlowTestingSyntax.WinterFlowRouterStructure) << 32));
                    case 11:
                        long j2 = ((WinterFlowJavaEntity) obj).WinterFlowRouterStructure;
                        return new WinterFlowTestingSyntax((int) (j2 >> 32), (int) (4294967295L & j2));
                    case 12:
                        WinterFlowTestingSyntax winterFlowTestingSyntax2 = (WinterFlowTestingSyntax) obj;
                        int round = Math.round(winterFlowTestingSyntax2.WinterFlowRouterStructure);
                        if (round < 0) {
                            round = 0;
                        }
                        return new WinterFlowJavaEntity((round << 32) | (4294967295L & (Math.round(winterFlowTestingSyntax2.WinterFlowHookDataSource) >= 0 ? r8 : 0)));
                    case 13:
                        WinterFlowVersionParser winterFlowVersionParser = (WinterFlowVersionParser) obj;
                        return new WinterFlowWebsocketHelper(winterFlowVersionParser.WinterFlowRouterStructure, winterFlowVersionParser.WinterFlowHookDataSource, winterFlowVersionParser.WinterFlowCacheManagerAgent, winterFlowVersionParser.WinterFlowArrayNetwork);
                    case 14:
                        WinterFlowWebsocketHelper winterFlowWebsocketHelper = (WinterFlowWebsocketHelper) obj;
                        return new WinterFlowVersionParser(winterFlowWebsocketHelper.WinterFlowRouterStructure, winterFlowWebsocketHelper.WinterFlowHookDataSource, winterFlowWebsocketHelper.WinterFlowCacheManagerAgent, winterFlowWebsocketHelper.WinterFlowArrayNetwork);
                    case 15:
                        return Float.valueOf(((WinterFlowVariableSubsystem) obj).WinterFlowRouterStructure);
                    default:
                        WinterFlowFunctionSyntax winterFlowFunctionSyntax = (WinterFlowFunctionSyntax) obj;
                        winterFlowFunctionSyntax.getClass();
                        return winterFlowFunctionSyntax;
                }
            }
        });
    }

    public static long WinterFlowArrayHelper(Context context, int i) {
        return WinterFlowInvokerComponent.WinterFlowArrayNetwork(context.getResources().getColor(i, context.getTheme()));
    }

    public static WinterFlowMiddlewareValidator WinterFlowArrayNetwork(String str, WinterFlowEncryptionServer winterFlowEncryptionServer, long j, WinterFlowResolverNetwork winterFlowResolverNetwork, WinterFlowDatabaseGateway winterFlowDatabaseGateway, int i) {
        WinterFlowDataSourceEngine winterFlowDataSourceEngine = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        return new WinterFlowMiddlewareValidator(new WinterFlowRendererEngine(str, winterFlowEncryptionServer, winterFlowDataSourceEngine, winterFlowDataSourceEngine, winterFlowDatabaseGateway, winterFlowResolverNetwork), i, 1, j);
    }

    public static final void WinterFlowBackendCacheManager(WinterFlowViewSoftware winterFlowViewSoftware, WinterFlowProcessorSystem winterFlowProcessorSystem, WinterFlowProcessorSystem winterFlowProcessorSystem2) {
        WinterFlowSchedulerStructure winterFlowSchedulerStructure;
        WinterFlowProcessorSystem WinterFlowServerProtocol2 = winterFlowProcessorSystem2.WinterFlowServerProtocol();
        WinterFlowVersionParser WinterFlowUnitTestResponse2 = (WinterFlowServerProtocol2 == null || (winterFlowSchedulerStructure = WinterFlowServerProtocol2.WinterFlowCacheManagerAgent) == null || !winterFlowSchedulerStructure.WinterFlowPackageIDE()) ? WinterFlowBatchUI : WinterFlowServerProtocol2.WinterFlowUnitTestResponse();
        int i = winterFlowProcessorSystem2.WinterFlowTransactionManagerStrategy;
        if (i == winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy) {
            i = -1;
        }
        winterFlowViewSoftware.WinterFlowRouterRouter(i, new WinterFlowArrayModule(winterFlowProcessorSystem2, WinterFlowCacheRuntime.WinterFlowQueueService(WinterFlowUnitTestResponse2)));
    }

    public static final boolean WinterFlowBandwidthObject(View view, View view2) {
        if (view2.equals(view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    public static final WinterFlowResolverRuntime WinterFlowBatchUI(Context context) {
        WinterFlowArrayHelper(context, R.color.system_neutral1_0);
        WinterFlowArrayHelper(context, R.color.system_neutral1_10);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 98.0f);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 96.0f);
        WinterFlowArrayHelper(context, R.color.system_neutral1_50);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 94.0f);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 92.0f);
        WinterFlowArrayHelper(context, R.color.system_neutral1_100);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 87.0f);
        WinterFlowArrayHelper(context, R.color.system_neutral1_200);
        WinterFlowArrayHelper(context, R.color.system_neutral1_300);
        WinterFlowArrayHelper(context, R.color.system_neutral1_400);
        WinterFlowArrayHelper(context, R.color.system_neutral1_500);
        WinterFlowArrayHelper(context, R.color.system_neutral1_600);
        WinterFlowArrayHelper(context, R.color.system_neutral1_700);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 24.0f);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 22.0f);
        WinterFlowArrayHelper(context, R.color.system_neutral1_800);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 17.0f);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 12.0f);
        WinterFlowArrayHelper(context, R.color.system_neutral1_900);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 6.0f);
        WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral1_600), 4.0f);
        WinterFlowArrayHelper(context, R.color.system_neutral1_1000);
        long WinterFlowArrayHelper2 = WinterFlowArrayHelper(context, R.color.system_neutral2_0);
        WinterFlowArrayHelper(context, R.color.system_neutral2_10);
        long WinterFlowQueueService = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 98.0f);
        long WinterFlowQueueService2 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 96.0f);
        long WinterFlowArrayHelper3 = WinterFlowArrayHelper(context, R.color.system_neutral2_50);
        long WinterFlowQueueService3 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 94.0f);
        long WinterFlowQueueService4 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 92.0f);
        long WinterFlowArrayHelper4 = WinterFlowArrayHelper(context, R.color.system_neutral2_100);
        long WinterFlowQueueService5 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 87.0f);
        long WinterFlowArrayHelper5 = WinterFlowArrayHelper(context, R.color.system_neutral2_200);
        WinterFlowArrayHelper(context, R.color.system_neutral2_300);
        long WinterFlowArrayHelper6 = WinterFlowArrayHelper(context, R.color.system_neutral2_400);
        long WinterFlowArrayHelper7 = WinterFlowArrayHelper(context, R.color.system_neutral2_500);
        WinterFlowArrayHelper(context, R.color.system_neutral2_600);
        long WinterFlowArrayHelper8 = WinterFlowArrayHelper(context, R.color.system_neutral2_700);
        long WinterFlowQueueService6 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 24.0f);
        long WinterFlowQueueService7 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 22.0f);
        long WinterFlowArrayHelper9 = WinterFlowArrayHelper(context, R.color.system_neutral2_800);
        long WinterFlowQueueService8 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 17.0f);
        long WinterFlowQueueService9 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 12.0f);
        long WinterFlowArrayHelper10 = WinterFlowArrayHelper(context, R.color.system_neutral2_900);
        long WinterFlowQueueService10 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 6.0f);
        long WinterFlowQueueService11 = WinterFlowQueueService(WinterFlowArrayHelper(context, R.color.system_neutral2_600), 4.0f);
        long WinterFlowArrayHelper11 = WinterFlowArrayHelper(context, R.color.system_neutral2_1000);
        long WinterFlowArrayHelper12 = WinterFlowArrayHelper(context, R.color.system_accent1_0);
        WinterFlowArrayHelper(context, R.color.system_accent1_10);
        WinterFlowArrayHelper(context, R.color.system_accent1_50);
        long WinterFlowArrayHelper13 = WinterFlowArrayHelper(context, R.color.system_accent1_100);
        long WinterFlowArrayHelper14 = WinterFlowArrayHelper(context, R.color.system_accent1_200);
        WinterFlowArrayHelper(context, R.color.system_accent1_300);
        WinterFlowArrayHelper(context, R.color.system_accent1_400);
        WinterFlowArrayHelper(context, R.color.system_accent1_500);
        long WinterFlowArrayHelper15 = WinterFlowArrayHelper(context, R.color.system_accent1_600);
        long WinterFlowArrayHelper16 = WinterFlowArrayHelper(context, R.color.system_accent1_700);
        long WinterFlowArrayHelper17 = WinterFlowArrayHelper(context, R.color.system_accent1_800);
        long WinterFlowArrayHelper18 = WinterFlowArrayHelper(context, R.color.system_accent1_900);
        WinterFlowArrayHelper(context, R.color.system_accent1_1000);
        long WinterFlowArrayHelper19 = WinterFlowArrayHelper(context, R.color.system_accent2_0);
        WinterFlowArrayHelper(context, R.color.system_accent2_10);
        WinterFlowArrayHelper(context, R.color.system_accent2_50);
        long WinterFlowArrayHelper20 = WinterFlowArrayHelper(context, R.color.system_accent2_100);
        long WinterFlowArrayHelper21 = WinterFlowArrayHelper(context, R.color.system_accent2_200);
        WinterFlowArrayHelper(context, R.color.system_accent2_300);
        WinterFlowArrayHelper(context, R.color.system_accent2_400);
        WinterFlowArrayHelper(context, R.color.system_accent2_500);
        long WinterFlowArrayHelper22 = WinterFlowArrayHelper(context, R.color.system_accent2_600);
        long WinterFlowArrayHelper23 = WinterFlowArrayHelper(context, R.color.system_accent2_700);
        long WinterFlowArrayHelper24 = WinterFlowArrayHelper(context, R.color.system_accent2_800);
        long WinterFlowArrayHelper25 = WinterFlowArrayHelper(context, R.color.system_accent2_900);
        WinterFlowArrayHelper(context, R.color.system_accent2_1000);
        long WinterFlowArrayHelper26 = WinterFlowArrayHelper(context, R.color.system_accent3_0);
        WinterFlowArrayHelper(context, R.color.system_accent3_10);
        WinterFlowArrayHelper(context, R.color.system_accent3_50);
        long WinterFlowArrayHelper27 = WinterFlowArrayHelper(context, R.color.system_accent3_100);
        long WinterFlowArrayHelper28 = WinterFlowArrayHelper(context, R.color.system_accent3_200);
        WinterFlowArrayHelper(context, R.color.system_accent3_300);
        WinterFlowArrayHelper(context, R.color.system_accent3_400);
        WinterFlowArrayHelper(context, R.color.system_accent3_500);
        long WinterFlowArrayHelper29 = WinterFlowArrayHelper(context, R.color.system_accent3_600);
        long WinterFlowArrayHelper30 = WinterFlowArrayHelper(context, R.color.system_accent3_700);
        long WinterFlowArrayHelper31 = WinterFlowArrayHelper(context, R.color.system_accent3_800);
        long WinterFlowArrayHelper32 = WinterFlowArrayHelper(context, R.color.system_accent3_900);
        WinterFlowArrayHelper(context, R.color.system_accent3_1000);
        return new WinterFlowResolverRuntime(WinterFlowArrayHelper2, WinterFlowQueueService, WinterFlowQueueService2, WinterFlowArrayHelper3, WinterFlowQueueService3, WinterFlowQueueService4, WinterFlowArrayHelper4, WinterFlowQueueService5, WinterFlowArrayHelper5, WinterFlowArrayHelper6, WinterFlowArrayHelper7, WinterFlowArrayHelper8, WinterFlowQueueService6, WinterFlowQueueService7, WinterFlowArrayHelper9, WinterFlowQueueService8, WinterFlowQueueService9, WinterFlowArrayHelper10, WinterFlowQueueService10, WinterFlowQueueService11, WinterFlowArrayHelper11, WinterFlowArrayHelper12, WinterFlowArrayHelper13, WinterFlowArrayHelper14, WinterFlowArrayHelper15, WinterFlowArrayHelper16, WinterFlowArrayHelper17, WinterFlowArrayHelper18, WinterFlowArrayHelper19, WinterFlowArrayHelper20, WinterFlowArrayHelper21, WinterFlowArrayHelper22, WinterFlowArrayHelper23, WinterFlowArrayHelper24, WinterFlowArrayHelper25, WinterFlowArrayHelper26, WinterFlowArrayHelper27, WinterFlowArrayHelper28, WinterFlowArrayHelper29, WinterFlowArrayHelper30, WinterFlowArrayHelper31, WinterFlowArrayHelper32);
    }

    public static final void WinterFlowCacheManagerAgent(final WinterFlowMapperManager winterFlowMapperManager, WinterFlowNetworkSession winterFlowNetworkSession, final WinterFlowExceptionXML winterFlowExceptionXML, final WinterFlowTransactionDecorator winterFlowTransactionDecorator, WinterFlowConfigurationPipeline winterFlowConfigurationPipeline, WinterFlowNetworkWidget winterFlowNetworkWidget, boolean z, WinterFlowDeploymentException winterFlowDeploymentException, final WinterFlowObjectSession winterFlowObjectSession, WinterFlowResolverLibrary winterFlowResolverLibrary, final int i) {
        final WinterFlowNetworkSession winterFlowNetworkSession2;
        final WinterFlowConfigurationPipeline winterFlowConfigurationPipeline2;
        final WinterFlowNetworkWidget winterFlowNetworkWidget2;
        final boolean z2;
        final WinterFlowDeploymentException winterFlowDeploymentException2;
        boolean z3;
        WinterFlowDeploymentException winterFlowDeploymentException3;
        int i2;
        WinterFlowNetworkSession winterFlowNetworkSession3;
        boolean z4;
        WinterFlowNetworkWidget winterFlowNetworkWidget3;
        WinterFlowDeploymentException winterFlowDeploymentException4;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(53695811);
        int i3 = i | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | 46861328 | (winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowObjectSession) ? 536870912 : 268435456);
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (306783379 & i3) != 306783378)) {
            winterFlowResolverLibrary.WinterFlowProxyStructure();
            if ((i & 1) == 0 || winterFlowResolverLibrary.WinterFlowResolverController()) {
                WinterFlowFrameworkLoader winterFlowFrameworkLoader = WinterFlowCompilerProcessor.WinterFlowRouterStructure;
                Object[] objArr = new Object[0];
                WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = WinterFlowNetworkSession.WinterFlowResolverController;
                boolean WinterFlowCacheManagerAgent2 = winterFlowResolverLibrary.WinterFlowCacheManagerAgent(0) | winterFlowResolverLibrary.WinterFlowCacheManagerAgent(0);
                Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                Object obj = WinterFlowModuleModule.WinterFlowRouterStructure;
                if (WinterFlowCacheManagerAgent2 || WinterFlowSyntaxSubsystem == obj) {
                    WinterFlowSyntaxSubsystem = new WinterFlowDeploymentEngine(16);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
                }
                WinterFlowNetworkSession winterFlowNetworkSession4 = (WinterFlowNetworkSession) WinterFlowWorkerVersionControl.WinterFlowThreadListener(objArr, winterFlowCacheManagerVersionControl, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 0);
                winterFlowConfigurationPipeline2 = WinterFlowCacheUtility.WinterFlowSingletonPlatform;
                float f = WinterFlowAlgorithmInterface.WinterFlowRouterStructure;
                WinterFlowConcurrencyParser winterFlowConcurrencyParser = (WinterFlowConcurrencyParser) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowBackendTransactionManager.WinterFlowRouterRouter);
                float WinterFlowHookDataSource2 = winterFlowConcurrencyParser.WinterFlowHookDataSource();
                Object WinterFlowCompilerVariable2 = winterFlowResolverLibrary.WinterFlowCompilerVariable();
                if ((WinterFlowCompilerVariable2 instanceof Float) && WinterFlowHookDataSource2 == ((Number) WinterFlowCompilerVariable2).floatValue()) {
                    z3 = false;
                } else {
                    winterFlowResolverLibrary.WinterFlowStrategyHook(Float.valueOf(WinterFlowHookDataSource2));
                    z3 = true;
                }
                Object WinterFlowSyntaxSubsystem2 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (z3 || WinterFlowSyntaxSubsystem2 == obj) {
                    WinterFlowSyntaxSubsystem2 = new WinterFlowAPIThread(new WinterFlowJSONDecorator(winterFlowConcurrencyParser));
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem2);
                }
                WinterFlowAPIThread winterFlowAPIThread = (WinterFlowAPIThread) WinterFlowSyntaxSubsystem2;
                boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowAPIThread);
                Object WinterFlowSyntaxSubsystem3 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem3 == obj) {
                    WinterFlowSyntaxSubsystem3 = new WinterFlowNetworkWidget(winterFlowAPIThread);
                    winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem3);
                }
                WinterFlowNetworkWidget winterFlowNetworkWidget4 = (WinterFlowNetworkWidget) WinterFlowSyntaxSubsystem3;
                WinterFlowWidgetConcurrency winterFlowWidgetConcurrency = WinterFlowFrontendTool.WinterFlowRouterStructure;
                winterFlowResolverLibrary.WinterFlowCompilerDataSource(282942128);
                WinterFlowSingletonStack winterFlowSingletonStack = (WinterFlowSingletonStack) winterFlowResolverLibrary.WinterFlowSyntax(WinterFlowFrontendTool.WinterFlowRouterStructure);
                if (winterFlowSingletonStack == null) {
                    winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                    winterFlowDeploymentException3 = null;
                } else {
                    boolean WinterFlowVariableVersionControl3 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowSingletonStack);
                    Object WinterFlowSyntaxSubsystem4 = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
                    if (WinterFlowVariableVersionControl3 || WinterFlowSyntaxSubsystem4 == obj) {
                        Object winterFlowDeploymentException5 = new WinterFlowDeploymentException(winterFlowSingletonStack.WinterFlowRouterStructure, winterFlowSingletonStack.WinterFlowHookDataSource, winterFlowSingletonStack.WinterFlowCacheManagerAgent, winterFlowSingletonStack.WinterFlowArrayNetwork);
                        winterFlowResolverLibrary.WinterFlowArrayFramework(winterFlowDeploymentException5);
                        WinterFlowSyntaxSubsystem4 = winterFlowDeploymentException5;
                    }
                    winterFlowDeploymentException3 = (WinterFlowDeploymentException) WinterFlowSyntaxSubsystem4;
                    winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                }
                i2 = i3 & (-238551153);
                winterFlowNetworkSession3 = winterFlowNetworkSession4;
                z4 = true;
                winterFlowNetworkWidget3 = winterFlowNetworkWidget4;
                winterFlowDeploymentException4 = winterFlowDeploymentException3;
            } else {
                winterFlowResolverLibrary.WinterFlowQueueService();
                winterFlowConfigurationPipeline2 = winterFlowConfigurationPipeline;
                winterFlowNetworkWidget3 = winterFlowNetworkWidget;
                z4 = z;
                winterFlowDeploymentException4 = winterFlowDeploymentException;
                i2 = i3 & (-238551153);
                winterFlowNetworkSession3 = winterFlowNetworkSession;
            }
            winterFlowResolverLibrary.WinterFlowOrchestrationSubsystem();
            WinterFlowCloudStack.WinterFlowCacheManagerAgent(winterFlowMapperManager, winterFlowNetworkSession3, winterFlowExceptionXML, winterFlowNetworkWidget3, z4, winterFlowDeploymentException4, winterFlowConfigurationPipeline2, winterFlowTransactionDecorator, winterFlowObjectSession, winterFlowResolverLibrary, 806907264 | (i2 & 14), 6 | ((i2 >> 18) & 7168));
            winterFlowNetworkWidget2 = winterFlowNetworkWidget3;
            z2 = z4;
            winterFlowDeploymentException2 = winterFlowDeploymentException4;
            winterFlowNetworkSession2 = winterFlowNetworkSession3;
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
            winterFlowNetworkSession2 = winterFlowNetworkSession;
            winterFlowConfigurationPipeline2 = winterFlowConfigurationPipeline;
            winterFlowNetworkWidget2 = winterFlowNetworkWidget;
            z2 = z;
            winterFlowDeploymentException2 = winterFlowDeploymentException;
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowEventEvent(winterFlowNetworkSession2, winterFlowExceptionXML, winterFlowTransactionDecorator, winterFlowConfigurationPipeline2, winterFlowNetworkWidget2, z2, winterFlowDeploymentException2, winterFlowObjectSession, i) { // from class: com.google.android.datatransport.WinterFlowScriptClass
                public final /* synthetic */ WinterFlowNetworkWidget WinterFlowResponseEngine;
                public final /* synthetic */ WinterFlowTransactionDecorator WinterFlowRouterRouter;
                public final /* synthetic */ WinterFlowDeploymentException WinterFlowServerProtocol;
                public final /* synthetic */ WinterFlowConfigurationPipeline WinterFlowSyntax;
                public final /* synthetic */ WinterFlowObjectSession WinterFlowThreadListener;
                public final /* synthetic */ boolean WinterFlowTransactionAgent;
                public final /* synthetic */ WinterFlowNetworkSession WinterFlowTransactionManagerStrategy;
                public final /* synthetic */ WinterFlowExceptionXML WinterFlowUnitTestResponse;

                @Override // com.google.android.datatransport.WinterFlowEventEvent
                public final Object WinterFlowVariableVersionControl(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int WinterFlowResponseEngine2 = WinterFlowConfigurationException.WinterFlowResponseEngine(24961);
                    WinterFlowEncryptionSubsystem.WinterFlowCacheManagerAgent(WinterFlowMapperManager.this, this.WinterFlowTransactionManagerStrategy, this.WinterFlowUnitTestResponse, this.WinterFlowRouterRouter, this.WinterFlowSyntax, this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowThreadListener, (WinterFlowResolverLibrary) obj2, WinterFlowResponseEngine2);
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            };
        }
    }

    public static final boolean WinterFlowCacheManagerListener(WinterFlowAdapterResponse winterFlowAdapterResponse) {
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowAdapterResponse.WinterFlowRouterRouter().WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
        if (winterFlowConsumerBandwidth != null) {
            return winterFlowConsumerBandwidth.WinterFlowHookDataSource();
        }
        return true;
    }

    public static boolean WinterFlowCacheTool(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final long WinterFlowCloudMicroservice(WinterFlowServiceProviderAgent winterFlowServiceProviderAgent, WinterFlowBackendBatch winterFlowBackendBatch, WinterFlowDataSourceRenderer winterFlowDataSourceRenderer) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (winterFlowBackendBatch == null) {
            return winterFlowServiceProviderAgent.WinterFlowCacheManagerAgent;
        }
        int i = winterFlowDataSourceRenderer.WinterFlowRouterStructure;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (winterFlowServiceProviderAgent.WinterFlowCacheManagerAgent >> 32));
        } else {
            if (i != 2) {
                return winterFlowServiceProviderAgent.WinterFlowCacheManagerAgent;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (winterFlowServiceProviderAgent.WinterFlowCacheManagerAgent & 4294967295L));
        }
        if (winterFlowBackendBatch == WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    public static final long WinterFlowCompilerHandler(WinterFlowServiceProviderAgent winterFlowServiceProviderAgent, WinterFlowBackendBatch winterFlowBackendBatch, WinterFlowDataSourceRenderer winterFlowDataSourceRenderer, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = winterFlowServiceProviderAgent.WinterFlowUnitTestResponse;
        if (winterFlowBackendBatch != null) {
            int i = winterFlowDataSourceRenderer.WinterFlowRouterStructure;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (winterFlowBackendBatch == WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (floatToRawIntBits & 4294967295L);
        }
        long WinterFlowArrayNetwork2 = WinterFlowHandlerResolver.WinterFlowArrayNetwork(WinterFlowCloudMicroservice(winterFlowServiceProviderAgent, winterFlowBackendBatch, winterFlowDataSourceRenderer), j2);
        if (z || !winterFlowServiceProviderAgent.WinterFlowSyntax) {
            return WinterFlowArrayNetwork2;
        }
        return 0L;
    }

    public static WinterFlowPackageLayer WinterFlowCompilerVariable(WinterFlowScriptManager winterFlowScriptManager) {
        WinterFlowResponseResponse winterFlowResponseResponse = WinterFlowFrontendLibrary.WinterFlowRouterStructure;
        WinterFlowCompilerEngine winterFlowCompilerEngine = WinterFlowCompilerEngine.WinterFlowHookDataSource;
        winterFlowResponseResponse.getClass();
        winterFlowCompilerEngine.getClass();
        WinterFlowStackProvider winterFlowStackProvider = new WinterFlowStackProvider(winterFlowScriptManager, winterFlowResponseResponse, winterFlowCompilerEngine);
        WinterFlowEventEmitterCacheManager WinterFlowRouterStructure2 = WinterFlowListenerProtocol.WinterFlowRouterStructure(WinterFlowPackageLayer.class);
        String WinterFlowHookDataSource2 = WinterFlowRouterStructure2.WinterFlowHookDataSource();
        if (WinterFlowHookDataSource2 != null) {
            return (WinterFlowPackageLayer) winterFlowStackProvider.WinterFlowConcurrencyThread(WinterFlowRouterStructure2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(WinterFlowHookDataSource2));
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Local and anonymous classes can not be ViewModels");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object WinterFlowConcurrencyThread(WinterFlowProviderStructure winterFlowProviderStructure, WinterFlowProtocolEntity winterFlowProtocolEntity) {
        if (!((WinterFlowUserManagerController) winterFlowProviderStructure).WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        WinterFlowConfigurationProcess winterFlowConfigurationProcess = (WinterFlowConfigurationProcess) WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowProviderStructure).WinterFlowStrategyTool;
        winterFlowConfigurationProcess.getClass();
        return WinterFlowQuerySyntax.WinterFlowConfigurationSubsystem(winterFlowConfigurationProcess, winterFlowProtocolEntity);
    }

    public static final Class WinterFlowConfigurationSubsystem(WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager) {
        winterFlowEventEmitterCacheManager.getClass();
        Class WinterFlowRouterStructure2 = winterFlowEventEmitterCacheManager.WinterFlowRouterStructure();
        WinterFlowRouterStructure2.getClass();
        return WinterFlowRouterStructure2;
    }

    public static final void WinterFlowConsumerUserManager(WinterFlowObjectSession winterFlowObjectSession, WinterFlowViewSoftware winterFlowViewSoftware, WinterFlowNodeSerializer winterFlowNodeSerializer, WinterFlowNodeSerializer winterFlowNodeSerializer2, WinterFlowProcessorSystem winterFlowProcessorSystem, WinterFlowProcessorSystem winterFlowProcessorSystem2) {
        WinterFlowNodeSerializer winterFlowNodeSerializer3 = winterFlowNodeSerializer;
        Region region = (Region) winterFlowNodeSerializer3.WinterFlowVariableVersionControl;
        WinterFlowNodeSerializer winterFlowNodeSerializer4 = winterFlowNodeSerializer2;
        Region region2 = (Region) winterFlowNodeSerializer4.WinterFlowVariableVersionControl;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowProcessorSystem2.WinterFlowCacheManagerAgent;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = winterFlowProcessorSystem2.WinterFlowCacheManagerAgent;
        if (!winterFlowSchedulerStructure.WinterFlowPackageIDE() || !winterFlowSchedulerStructure2.WinterFlowCacheManagerListener() || region2.isEmpty()) {
            if (winterFlowProcessorSystem2.WinterFlowServiceUtility()) {
                WinterFlowBackendCacheManager(winterFlowViewSoftware, winterFlowProcessorSystem, winterFlowProcessorSystem2);
                return;
            }
            return;
        }
        WinterFlowVersionParser WinterFlowThreadListener2 = winterFlowProcessorSystem2.WinterFlowThreadListener();
        if ((WinterFlowThreadListener2.WinterFlowRouterStructure >= WinterFlowThreadListener2.WinterFlowCacheManagerAgent) | (WinterFlowThreadListener2.WinterFlowHookDataSource >= WinterFlowThreadListener2.WinterFlowArrayNetwork)) {
            WinterFlowLibraryDeployment WinterFlowTransactionManagerStrategy2 = winterFlowProcessorSystem2.WinterFlowTransactionManagerStrategy();
            if (WinterFlowTransactionManagerStrategy2 == null) {
                WinterFlowRouterInvoker winterFlowRouterInvoker = winterFlowSchedulerStructure2.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent;
                WinterFlowThreadListener2 = WinterFlowCloudStack.WinterFlowBatchUI(winterFlowRouterInvoker).WinterFlowVariableBandwidth(winterFlowRouterInvoker, false);
            } else {
                WinterFlowUserManagerController winterFlowUserManagerController = ((WinterFlowUserManagerController) WinterFlowTransactionManagerStrategy2).WinterFlowVariableVersionControl;
                Object WinterFlowUnitTestResponse2 = winterFlowProcessorSystem2.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowHookDataSource);
                if (WinterFlowUnitTestResponse2 == null) {
                    WinterFlowUnitTestResponse2 = null;
                }
                WinterFlowThreadListener2 = WinterFlowFrameworkMechanism.WinterFlowVariableVersionControl(winterFlowUserManagerController, WinterFlowUnitTestResponse2 != null, false);
            }
        }
        WinterFlowLibraryInterface WinterFlowQueueService = WinterFlowCacheRuntime.WinterFlowQueueService(WinterFlowThreadListener2);
        winterFlowNodeSerializer3.WinterFlowHookDataSource(WinterFlowQueueService);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = winterFlowProcessorSystem2.WinterFlowTransactionManagerStrategy;
            if (i == winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            winterFlowViewSoftware.WinterFlowRouterRouter(i, new WinterFlowArrayModule(winterFlowProcessorSystem2, new WinterFlowLibraryInterface(bounds.left, bounds.top, bounds.right, bounds.bottom)));
            List WinterFlowResponseEngine2 = WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem2);
            int size = WinterFlowResponseEngine2.size() - 1;
            while (-1 < size) {
                if (!((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(WinterFlowResponseEngine2.get(size))).booleanValue()) {
                    WinterFlowConsumerUserManager(winterFlowObjectSession, winterFlowViewSoftware, winterFlowNodeSerializer3, winterFlowNodeSerializer4, winterFlowProcessorSystem, (WinterFlowProcessorSystem) WinterFlowResponseEngine2.get(size));
                }
                size--;
                winterFlowNodeSerializer3 = winterFlowNodeSerializer;
                winterFlowNodeSerializer4 = winterFlowNodeSerializer2;
            }
            if (WinterFlowSoftwareProtocol(winterFlowProcessorSystem2)) {
                region2.op(WinterFlowQueueService.WinterFlowRouterStructure, WinterFlowQueueService.WinterFlowHookDataSource, WinterFlowQueueService.WinterFlowCacheManagerAgent, WinterFlowQueueService.WinterFlowArrayNetwork, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ad, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowEventEmitterController(WinterFlowObjectSession winterFlowObjectSession, WinterFlowViewSoftware winterFlowViewSoftware, WinterFlowNodeSerializer winterFlowNodeSerializer, WinterFlowNodeSerializer winterFlowNodeSerializer2, WinterFlowProcessorSystem winterFlowProcessorSystem, WinterFlowProcessorSystem winterFlowProcessorSystem2) {
        boolean z;
        WinterFlowVersionParser WinterFlowVariableVersionControl2;
        WinterFlowObjectSession winterFlowObjectSession2 = winterFlowObjectSession;
        WinterFlowViewSoftware winterFlowViewSoftware2 = winterFlowViewSoftware;
        int i = winterFlowProcessorSystem.WinterFlowTransactionManagerStrategy;
        Region region = (Region) winterFlowNodeSerializer.WinterFlowVariableVersionControl;
        WinterFlowNodeSerializer winterFlowNodeSerializer3 = winterFlowNodeSerializer2;
        Region region2 = (Region) winterFlowNodeSerializer3.WinterFlowVariableVersionControl;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure = winterFlowProcessorSystem2.WinterFlowCacheManagerAgent;
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem2.WinterFlowArrayNetwork;
        WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = winterFlowProcessorSystem2.WinterFlowCacheManagerAgent;
        int i2 = winterFlowProcessorSystem2.WinterFlowTransactionManagerStrategy;
        boolean z2 = (winterFlowSchedulerStructure.WinterFlowPackageIDE() && winterFlowSchedulerStructure2.WinterFlowCacheManagerListener()) ? false : true;
        if (region2.isEmpty() && i2 != i) {
            return;
        }
        if (z2 && !winterFlowProcessorSystem2.WinterFlowServiceUtility()) {
            return;
        }
        WinterFlowLibraryInterface WinterFlowQueueService = WinterFlowCacheRuntime.WinterFlowQueueService(winterFlowProcessorSystem2.WinterFlowThreadListener());
        winterFlowNodeSerializer.WinterFlowHookDataSource(WinterFlowQueueService);
        if (i2 == i) {
            i2 = -1;
        }
        if (!region.op(region2, Region.Op.INTERSECT)) {
            if (winterFlowProcessorSystem2.WinterFlowServiceUtility()) {
                WinterFlowBackendCacheManager(winterFlowViewSoftware2, winterFlowProcessorSystem, winterFlowProcessorSystem2);
                return;
            } else {
                if (i2 == -1) {
                    Rect bounds = region.getBounds();
                    winterFlowViewSoftware2.WinterFlowRouterRouter(i2, new WinterFlowArrayModule(winterFlowProcessorSystem2, new WinterFlowLibraryInterface(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        Rect bounds2 = region.getBounds();
        winterFlowViewSoftware2.WinterFlowRouterRouter(i2, new WinterFlowArrayModule(winterFlowProcessorSystem2, new WinterFlowLibraryInterface(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        List WinterFlowResponseEngine2 = WinterFlowProcessorSystem.WinterFlowResponseEngine(4, winterFlowProcessorSystem2);
        if (winterFlowDecoratorBackend.WinterFlowUnitTestResponse) {
            WinterFlowProcessorSystem WinterFlowServerProtocol2 = winterFlowProcessorSystem2.WinterFlowServerProtocol();
            while (true) {
                if (WinterFlowServerProtocol2 == null) {
                    WinterFlowServerProtocol2 = null;
                    break;
                }
                WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = WinterFlowServerProtocol2.WinterFlowArrayNetwork.WinterFlowVariableVersionControl;
                if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowMapperProtocol) || winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowSerializerStructure)) {
                    break;
                } else {
                    WinterFlowServerProtocol2 = WinterFlowServerProtocol2.WinterFlowServerProtocol();
                }
            }
            if (WinterFlowServerProtocol2 != null) {
                WinterFlowUIMicroservice WinterFlowArrayNetwork2 = winterFlowProcessorSystem2.WinterFlowArrayNetwork();
                if (WinterFlowArrayNetwork2 != null) {
                    if (!WinterFlowArrayNetwork2.WinterFlowInheritanceJava().WinterFlowSingletonPlatform) {
                        WinterFlowArrayNetwork2 = null;
                    }
                }
                WinterFlowArrayNetwork2 = null;
                WinterFlowUIMicroservice WinterFlowArrayNetwork3 = WinterFlowServerProtocol2.WinterFlowArrayNetwork();
                if (WinterFlowArrayNetwork3 != null) {
                    if (!WinterFlowArrayNetwork3.WinterFlowInheritanceJava().WinterFlowSingletonPlatform) {
                        WinterFlowArrayNetwork3 = null;
                    }
                }
                WinterFlowArrayNetwork3 = null;
                if (WinterFlowArrayNetwork2 != null && WinterFlowArrayNetwork3 != null) {
                    WinterFlowVersionParser WinterFlowVariableBandwidth2 = WinterFlowArrayNetwork3.WinterFlowVariableBandwidth(WinterFlowArrayNetwork2, false);
                    z = !WinterFlowVariableBandwidth2.equals(WinterFlowVariableBandwidth2.WinterFlowCacheManagerAgent(WinterFlowHookProcessor.WinterFlowHookDataSource(0L, WinterFlowServerManager.WinterFlowUserManagerUserManager(WinterFlowArrayNetwork3.WinterFlowUnitTestResponse))));
                    if (z) {
                        WinterFlowNodeSerializer winterFlowNodeSerializer4 = new WinterFlowNodeSerializer(0);
                        WinterFlowLibraryDeployment WinterFlowTransactionManagerStrategy2 = winterFlowProcessorSystem2.WinterFlowTransactionManagerStrategy();
                        if (WinterFlowTransactionManagerStrategy2 == null) {
                            WinterFlowRouterInvoker winterFlowRouterInvoker = winterFlowSchedulerStructure2.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent;
                            WinterFlowVariableVersionControl2 = WinterFlowCloudStack.WinterFlowBatchUI(winterFlowRouterInvoker).WinterFlowVariableBandwidth(winterFlowRouterInvoker, false);
                        } else {
                            WinterFlowUserManagerController winterFlowUserManagerController = ((WinterFlowUserManagerController) WinterFlowTransactionManagerStrategy2).WinterFlowVariableVersionControl;
                            Object WinterFlowUnitTestResponse2 = winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowCacheWorker.WinterFlowHookDataSource);
                            WinterFlowVariableVersionControl2 = WinterFlowFrameworkMechanism.WinterFlowVariableVersionControl(winterFlowUserManagerController, (WinterFlowUnitTestResponse2 == null ? null : WinterFlowUnitTestResponse2) != null, false);
                        }
                        winterFlowNodeSerializer4.WinterFlowHookDataSource(WinterFlowCacheRuntime.WinterFlowQueueService(WinterFlowVariableVersionControl2));
                        int size = WinterFlowResponseEngine2.size() - 1;
                        while (-1 < size) {
                            if (!((Boolean) winterFlowObjectSession2.WinterFlowUnitTestResponse(WinterFlowResponseEngine2.get(size))).booleanValue()) {
                                WinterFlowConsumerUserManager(winterFlowObjectSession2, winterFlowViewSoftware2, new WinterFlowNodeSerializer(0), winterFlowNodeSerializer4, winterFlowProcessorSystem, (WinterFlowProcessorSystem) WinterFlowResponseEngine2.get(size));
                            }
                            size--;
                            winterFlowViewSoftware2 = winterFlowViewSoftware;
                        }
                        if (WinterFlowSoftwareProtocol(winterFlowProcessorSystem2)) {
                            return;
                        }
                        region2.op(WinterFlowQueueService.WinterFlowRouterStructure, WinterFlowQueueService.WinterFlowHookDataSource, WinterFlowQueueService.WinterFlowCacheManagerAgent, WinterFlowQueueService.WinterFlowArrayNetwork, Region.Op.DIFFERENCE);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        int size2 = WinterFlowResponseEngine2.size() - 1;
        while (-1 < size2) {
            if (!((Boolean) winterFlowObjectSession2.WinterFlowUnitTestResponse(WinterFlowResponseEngine2.get(size2))).booleanValue()) {
                WinterFlowEventEmitterController(winterFlowObjectSession2, winterFlowViewSoftware, winterFlowNodeSerializer, winterFlowNodeSerializer3, winterFlowProcessorSystem, (WinterFlowProcessorSystem) WinterFlowResponseEngine2.get(size2));
            }
            size2--;
            winterFlowObjectSession2 = winterFlowObjectSession;
            winterFlowNodeSerializer3 = winterFlowNodeSerializer2;
        }
        if (WinterFlowSoftwareProtocol(winterFlowProcessorSystem2)) {
        }
    }

    public static final void WinterFlowFrontendBackend(float[] fArr, float[] fArr2) {
        float WinterFlowVariableBandwidth2 = WinterFlowVariableBandwidth(fArr2, 0, fArr, 0);
        float WinterFlowVariableBandwidth3 = WinterFlowVariableBandwidth(fArr2, 0, fArr, 1);
        float WinterFlowVariableBandwidth4 = WinterFlowVariableBandwidth(fArr2, 0, fArr, 2);
        float WinterFlowVariableBandwidth5 = WinterFlowVariableBandwidth(fArr2, 0, fArr, 3);
        float WinterFlowVariableBandwidth6 = WinterFlowVariableBandwidth(fArr2, 1, fArr, 0);
        float WinterFlowVariableBandwidth7 = WinterFlowVariableBandwidth(fArr2, 1, fArr, 1);
        float WinterFlowVariableBandwidth8 = WinterFlowVariableBandwidth(fArr2, 1, fArr, 2);
        float WinterFlowVariableBandwidth9 = WinterFlowVariableBandwidth(fArr2, 1, fArr, 3);
        float WinterFlowVariableBandwidth10 = WinterFlowVariableBandwidth(fArr2, 2, fArr, 0);
        float WinterFlowVariableBandwidth11 = WinterFlowVariableBandwidth(fArr2, 2, fArr, 1);
        float WinterFlowVariableBandwidth12 = WinterFlowVariableBandwidth(fArr2, 2, fArr, 2);
        float WinterFlowVariableBandwidth13 = WinterFlowVariableBandwidth(fArr2, 2, fArr, 3);
        float WinterFlowVariableBandwidth14 = WinterFlowVariableBandwidth(fArr2, 3, fArr, 0);
        float WinterFlowVariableBandwidth15 = WinterFlowVariableBandwidth(fArr2, 3, fArr, 1);
        float WinterFlowVariableBandwidth16 = WinterFlowVariableBandwidth(fArr2, 3, fArr, 2);
        float WinterFlowVariableBandwidth17 = WinterFlowVariableBandwidth(fArr2, 3, fArr, 3);
        fArr[0] = WinterFlowVariableBandwidth2;
        fArr[1] = WinterFlowVariableBandwidth3;
        fArr[2] = WinterFlowVariableBandwidth4;
        fArr[3] = WinterFlowVariableBandwidth5;
        fArr[4] = WinterFlowVariableBandwidth6;
        fArr[5] = WinterFlowVariableBandwidth7;
        fArr[6] = WinterFlowVariableBandwidth8;
        fArr[7] = WinterFlowVariableBandwidth9;
        fArr[8] = WinterFlowVariableBandwidth10;
        fArr[9] = WinterFlowVariableBandwidth11;
        fArr[10] = WinterFlowVariableBandwidth12;
        fArr[11] = WinterFlowVariableBandwidth13;
        fArr[12] = WinterFlowVariableBandwidth14;
        fArr[13] = WinterFlowVariableBandwidth15;
        fArr[14] = WinterFlowVariableBandwidth16;
        fArr[15] = WinterFlowVariableBandwidth17;
    }

    public static final WinterFlowEventEmitterFramework WinterFlowHookDataSource(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        if (winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth) == null) {
            winterFlowEncryptionMicroservice = winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(new WinterFlowInterfaceLibrary(null));
        }
        return new WinterFlowEventEmitterFramework(winterFlowEncryptionMicroservice);
    }

    public static final Object WinterFlowMapperProtocol(WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization, long j, WinterFlowEventEvent winterFlowEventEvent) {
        while (true) {
            WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization2 = winterFlowDatabaseDeserialization;
            while (true) {
                if (winterFlowDatabaseDeserialization2.WinterFlowArrayNetwork >= j && !winterFlowDatabaseDeserialization2.WinterFlowCacheManagerAgent()) {
                    return winterFlowDatabaseDeserialization2;
                }
                Object objectVolatile = WinterFlowQueueThreadPool.WinterFlowRouterStructure.getObjectVolatile(winterFlowDatabaseDeserialization2, WinterFlowMicroserviceHelper.WinterFlowRouterStructure);
                WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowVariableVersionControl;
                if (objectVolatile == winterFlowJSONDecorator) {
                    return winterFlowJSONDecorator;
                }
                winterFlowDatabaseDeserialization = (WinterFlowDatabaseDeserialization) ((WinterFlowMicroserviceHelper) objectVolatile);
                if (winterFlowDatabaseDeserialization != null) {
                    break;
                }
                WinterFlowDatabaseDeserialization winterFlowDatabaseDeserialization3 = (WinterFlowDatabaseDeserialization) winterFlowEventEvent.WinterFlowVariableVersionControl(Long.valueOf(winterFlowDatabaseDeserialization2.WinterFlowArrayNetwork + 1), winterFlowDatabaseDeserialization2);
                while (true) {
                    Unsafe unsafe = WinterFlowQueueThreadPool.WinterFlowRouterStructure;
                    long j2 = WinterFlowMicroserviceHelper.WinterFlowRouterStructure;
                    if (unsafe.compareAndSwapObject(winterFlowDatabaseDeserialization2, j2, (Object) null, winterFlowDatabaseDeserialization3)) {
                        if (winterFlowDatabaseDeserialization2.WinterFlowCacheManagerAgent()) {
                            winterFlowDatabaseDeserialization2.WinterFlowArrayNetwork();
                        }
                        winterFlowDatabaseDeserialization2 = winterFlowDatabaseDeserialization3;
                    } else if (unsafe.getObjectVolatile(winterFlowDatabaseDeserialization2, j2) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final Object WinterFlowOrchestrationSubsystem(WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowVersionControlServer winterFlowVersionControlServer = new WinterFlowVersionControlServer(winterFlowTransactionManagerLayer, winterFlowTransactionManagerLayer.getContext());
        return WinterFlowConfigurationException.WinterFlowRouterRouter(winterFlowVersionControlServer, winterFlowVersionControlServer, winterFlowEventEvent);
    }

    public static final boolean WinterFlowPackageIDE(WinterFlowProcessorSystem winterFlowProcessorSystem) {
        WinterFlowUIMicroservice WinterFlowArrayNetwork2 = winterFlowProcessorSystem.WinterFlowArrayNetwork();
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl;
        return (WinterFlowArrayNetwork2 != null ? WinterFlowArrayNetwork2.WinterFlowSyntaxSingleton() : false) || winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowConcurrencyThread) || winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowOrchestrationSubsystem);
    }

    public static final Object WinterFlowProxyStructure(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, Object obj, Object obj2, WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Object WinterFlowFrameworkTransaction = WinterFlowInvokerComponent.WinterFlowFrameworkTransaction(winterFlowEncryptionMicroservice, obj2);
        try {
            WinterFlowSoftwareWebsocket winterFlowSoftwareWebsocket = new WinterFlowSoftwareWebsocket(winterFlowTransactionManagerLayer, winterFlowEncryptionMicroservice);
            WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(2, winterFlowEventEvent);
            Object WinterFlowVariableVersionControl2 = winterFlowEventEvent.WinterFlowVariableVersionControl(obj, winterFlowSoftwareWebsocket);
            WinterFlowInvokerComponent.WinterFlowCacheTool(winterFlowEncryptionMicroservice, WinterFlowFrameworkTransaction);
            if (WinterFlowVariableVersionControl2 == WinterFlowListenerJava.WinterFlowVariableVersionControl) {
                winterFlowTransactionManagerLayer.getClass();
            }
            return WinterFlowVariableVersionControl2;
        } catch (Throwable th) {
            WinterFlowInvokerComponent.WinterFlowCacheTool(winterFlowEncryptionMicroservice, WinterFlowFrameworkTransaction);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0240  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long WinterFlowQueueService(long j, float f) {
        int WinterFlowCompilerVariable2;
        float f2;
        float f3;
        float f4;
        double d;
        double[] dArr;
        double d2;
        int i;
        int i2;
        int i3;
        int ceil;
        double floor;
        double[] dArr2;
        double[] dArr3;
        double d3;
        double d4;
        double d5;
        double d6 = f;
        if ((d6 < 1.0E-4d) || (d6 > 99.9999d)) {
            return WinterFlowInvokerComponent.WinterFlowArrayNetwork(WinterFlowCacheRuntime.WinterFlowTransactionManagerStrategy(d6));
        }
        WinterFlowCacheComponent WinterFlowSingletonPlatform2 = WinterFlowTestingCloud.WinterFlowSingletonPlatform(WinterFlowInvokerComponent.WinterFlowConfiguration(j));
        float f5 = WinterFlowSingletonPlatform2.WinterFlowRouterStructure;
        float f6 = WinterFlowSingletonPlatform2.WinterFlowHookDataSource;
        WinterFlowIDEService winterFlowIDEService = WinterFlowIDEService.WinterFlowTransactionAgent;
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowIDEService, winterFlowIDEService)) {
            double d7 = f5;
            double d8 = f6;
            double[] dArr4 = WinterFlowInvokerComponent.WinterFlowServerProtocol;
            if (d8 < 1.0E-4d || d6 < 1.0E-4d || d6 > 99.9999d) {
                WinterFlowCompilerVariable2 = WinterFlowCacheRuntime.WinterFlowTransactionManagerStrategy(d6);
            } else {
                double d9 = d7 % 360.0d;
                if (d9 < 0.0d) {
                    d9 += 360.0d;
                }
                double radians = Math.toRadians(d9);
                double pow = (d6 > 8.0d ? Math.pow((d6 + 16.0d) / 116.0d, 3.0d) : d6 / 903.2962962962963d) * 100.0d;
                double sqrt = Math.sqrt(pow) * 11.0d;
                int i4 = 1;
                double pow2 = 1.0d / Math.pow(1.64d - Math.pow(0.29d, winterFlowIDEService.WinterFlowRouterStructure), 0.73d);
                double d10 = 2.0d;
                int i5 = 0;
                double cos = (Math.cos(radians + 2.0d) + 3.8d) * 0.25d * 3846.153846153846d * winterFlowIDEService.WinterFlowTransactionManagerStrategy * winterFlowIDEService.WinterFlowArrayNetwork;
                double sin = Math.sin(radians);
                double cos2 = Math.cos(radians);
                int i6 = 0;
                while (true) {
                    d = d10;
                    if (i6 >= 5) {
                        dArr = dArr4;
                        d2 = pow;
                        i = i4;
                        i2 = i5;
                        i3 = 8;
                        break;
                    }
                    int i7 = i4;
                    double d11 = d8;
                    double d12 = sqrt / 100.0d;
                    i3 = 8;
                    i2 = i5;
                    double pow3 = Math.pow(((d11 == 0.0d || sqrt == 0.0d) ? 0.0d : d11 / Math.sqrt(d12)) * pow2, 1.1111111111111112d);
                    i = i7;
                    dArr = dArr4;
                    d2 = pow;
                    double pow4 = (Math.pow(d12, (1.0d / winterFlowIDEService.WinterFlowVariableVersionControl) / winterFlowIDEService.WinterFlowResponseEngine) * winterFlowIDEService.WinterFlowHookDataSource) / winterFlowIDEService.WinterFlowCacheManagerAgent;
                    double d13 = (((0.305d + pow4) * 23.0d) * pow3) / (((pow3 * 108.0d) * sin) + (((11.0d * pow3) * cos2) + (23.0d * cos)));
                    double d14 = d13 * cos2;
                    double d15 = d13 * sin;
                    double d16 = pow4 * 460.0d;
                    double d17 = ((288.0d * d15) + ((451.0d * d14) + d16)) / 1403.0d;
                    double d18 = ((d16 - (891.0d * d14)) - (261.0d * d15)) / 1403.0d;
                    double d19 = ((d16 - (d14 * 220.0d)) - (d15 * 6300.0d)) / 1403.0d;
                    double WinterFlowCacheManagerListener = WinterFlowInvokerComponent.WinterFlowCacheManagerListener(d17);
                    double WinterFlowCacheManagerListener2 = WinterFlowInvokerComponent.WinterFlowCacheManagerListener(d18);
                    double WinterFlowCacheManagerListener3 = WinterFlowInvokerComponent.WinterFlowCacheManagerListener(d19);
                    double[][] dArr5 = WinterFlowInvokerComponent.WinterFlowTransactionAgent;
                    double[] dArr6 = dArr5[i2];
                    d3 = (dArr6[2] * WinterFlowCacheManagerListener3) + (dArr6[i] * WinterFlowCacheManagerListener2) + (dArr6[i2] * WinterFlowCacheManagerListener);
                    double[] dArr7 = dArr5[i];
                    d4 = (dArr7[2] * WinterFlowCacheManagerListener3) + (dArr7[i] * WinterFlowCacheManagerListener2) + (dArr7[i2] * WinterFlowCacheManagerListener);
                    double[] dArr8 = dArr5[2];
                    d5 = (WinterFlowCacheManagerListener3 * dArr8[2]) + (WinterFlowCacheManagerListener2 * dArr8[i]) + (WinterFlowCacheManagerListener * dArr8[i2]);
                    if (d3 < 0.0d || d4 < 0.0d || d5 < 0.0d) {
                        break;
                    }
                    double d20 = (dArr[2] * d5) + (dArr[i] * d4) + (dArr[i2] * d3);
                    if (d20 <= 0.0d) {
                        break;
                    }
                    if (i6 == 4) {
                        break;
                    }
                    double d21 = d20 - d2;
                    if (Math.abs(d21) < 0.002d) {
                        break;
                    }
                    sqrt -= (d21 * sqrt) / (d * d20);
                    i6++;
                    d10 = d;
                    d8 = d11;
                    i5 = i2;
                    i4 = i;
                    dArr4 = dArr;
                    pow = d2;
                }
                if (d3 <= 100.01d && d4 <= 100.01d && d5 <= 100.01d) {
                    WinterFlowCompilerVariable2 = ((WinterFlowCacheRuntime.WinterFlowOrchestrationSubsystem(d3) & 255) << 16) | (-16777216) | ((WinterFlowCacheRuntime.WinterFlowOrchestrationSubsystem(d4) & 255) << 8) | (WinterFlowCacheRuntime.WinterFlowOrchestrationSubsystem(d5) & 255);
                    if (WinterFlowCompilerVariable2 == 0) {
                        double[] dArr9 = new double[3];
                        dArr9[i2] = -1.0d;
                        dArr9[i] = -1.0d;
                        dArr9[2] = -1.0d;
                        double[] dArr10 = dArr9;
                        double d22 = 0.0d;
                        double d23 = 0.0d;
                        int i8 = i2;
                        int i9 = i8;
                        int i10 = i;
                        while (i9 < 12) {
                            double d24 = dArr[i2];
                            double d25 = dArr[i];
                            double d26 = dArr[2];
                            double d27 = i9 % 4 <= i ? 0.0d : 100.0d;
                            double d28 = i9 % 2 == 0 ? 0.0d : 100.0d;
                            if (i9 < 4) {
                                double d29 = ((d2 - (d25 * d27)) - (d26 * d28)) / d24;
                                if (WinterFlowInvokerComponent.WinterFlowUserManagerUserManager(d29)) {
                                    dArr2 = new double[3];
                                    dArr2[i2] = d29;
                                    dArr2[1] = d27;
                                    dArr2[2] = d28;
                                } else {
                                    dArr2 = new double[3];
                                    dArr2[i2] = -1.0d;
                                    dArr2[1] = -1.0d;
                                    dArr2[2] = -1.0d;
                                }
                            } else if (i9 < i3) {
                                double d30 = ((d2 - (d24 * d28)) - (d26 * d27)) / d25;
                                if (WinterFlowInvokerComponent.WinterFlowUserManagerUserManager(d30)) {
                                    dArr3 = new double[3];
                                    dArr3[i2] = d28;
                                    dArr3[1] = d30;
                                    dArr3[2] = d27;
                                    dArr2 = dArr3;
                                } else {
                                    dArr2 = new double[3];
                                    dArr2[i2] = -1.0d;
                                    dArr2[1] = -1.0d;
                                    dArr2[2] = -1.0d;
                                }
                            } else {
                                double d31 = ((d2 - (d24 * d27)) - (d25 * d28)) / d26;
                                if (WinterFlowInvokerComponent.WinterFlowUserManagerUserManager(d31)) {
                                    dArr3 = new double[3];
                                    dArr3[i2] = d27;
                                    dArr3[1] = d28;
                                    dArr3[2] = d31;
                                    dArr2 = dArr3;
                                } else {
                                    dArr2 = new double[3];
                                    dArr2[i2] = -1.0d;
                                    dArr2[1] = -1.0d;
                                    dArr2[2] = -1.0d;
                                }
                            }
                            if (dArr2[i2] >= 0.0d) {
                                double WinterFlowStrategyTool = WinterFlowInvokerComponent.WinterFlowStrategyTool(dArr2);
                                if (i8 == 0) {
                                    dArr9 = dArr2;
                                    dArr10 = dArr9;
                                    d22 = WinterFlowStrategyTool;
                                    d23 = d22;
                                    i8 = 1;
                                } else if (i10 != 0 || WinterFlowInvokerComponent.WinterFlowServerProtocol(d22, WinterFlowStrategyTool, d23)) {
                                    if (WinterFlowInvokerComponent.WinterFlowServerProtocol(d22, radians, WinterFlowStrategyTool)) {
                                        dArr10 = dArr2;
                                        i10 = i2;
                                        d23 = WinterFlowStrategyTool;
                                    } else {
                                        dArr9 = dArr2;
                                        i10 = i2;
                                        d22 = WinterFlowStrategyTool;
                                    }
                                }
                            }
                            i9++;
                            i3 = 8;
                            i = 1;
                        }
                        double[][] dArr11 = {dArr9, dArr10};
                        double[] dArr12 = dArr11[i2];
                        double WinterFlowStrategyTool2 = WinterFlowInvokerComponent.WinterFlowStrategyTool(dArr12);
                        double[] dArr13 = dArr11[1];
                        for (int i11 = i2; i11 < 3; i11++) {
                            double d32 = dArr12[i11];
                            double d33 = dArr13[i11];
                            if (d32 != d33) {
                                if (d32 < d33) {
                                    ceil = (int) Math.floor(WinterFlowInvokerComponent.WinterFlowCompilerDataSource(d32) - 0.5d);
                                    floor = Math.ceil(WinterFlowInvokerComponent.WinterFlowCompilerDataSource(dArr13[i11]) - 0.5d);
                                } else {
                                    ceil = (int) Math.ceil(WinterFlowInvokerComponent.WinterFlowCompilerDataSource(d32) - 0.5d);
                                    floor = Math.floor(WinterFlowInvokerComponent.WinterFlowCompilerDataSource(dArr13[i11]) - 0.5d);
                                }
                                int i12 = (int) floor;
                                double d34 = WinterFlowStrategyTool2;
                                for (int i13 = i2; i13 < 8 && Math.abs(i12 - ceil) > 1.0d; i13++) {
                                    int floor2 = (int) Math.floor((ceil + i12) / d);
                                    double d35 = WinterFlowInvokerComponent.WinterFlowThreadListener[floor2];
                                    double d36 = dArr12[i11];
                                    double d37 = dArr13[i11];
                                    if (d37 != d36) {
                                        d37 = (d35 - d36) / (d37 - d36);
                                    }
                                    double d38 = dArr12[i2];
                                    double d39 = ((dArr13[i2] - d38) * d37) + d38;
                                    double d40 = dArr12[1];
                                    double d41 = ((dArr13[1] - d40) * d37) + d40;
                                    double d42 = dArr12[2];
                                    double d43 = ((dArr13[2] - d42) * d37) + d42;
                                    double[] dArr14 = new double[3];
                                    dArr14[i2] = d39;
                                    dArr14[1] = d41;
                                    dArr14[2] = d43;
                                    double WinterFlowStrategyTool3 = WinterFlowInvokerComponent.WinterFlowStrategyTool(dArr14);
                                    if (WinterFlowInvokerComponent.WinterFlowServerProtocol(d34, radians, WinterFlowStrategyTool3)) {
                                        i12 = floor2;
                                        dArr13 = dArr14;
                                    } else {
                                        ceil = floor2;
                                        dArr12 = dArr14;
                                        d34 = WinterFlowStrategyTool3;
                                    }
                                }
                                WinterFlowStrategyTool2 = d34;
                            }
                        }
                        WinterFlowCompilerVariable2 = ((WinterFlowCacheRuntime.WinterFlowOrchestrationSubsystem((dArr12[i2] + dArr13[i2]) / d) & 255) << 16) | (-16777216) | ((WinterFlowCacheRuntime.WinterFlowOrchestrationSubsystem((dArr12[1] + dArr13[1]) / d) & 255) << 8) | (WinterFlowCacheRuntime.WinterFlowOrchestrationSubsystem((dArr12[2] + dArr13[2]) / d) & 255);
                    }
                }
                WinterFlowCompilerVariable2 = i2;
                if (WinterFlowCompilerVariable2 == 0) {
                }
            }
        } else if (f6 < 1.0d || Math.round(f) <= 0.0d || Math.round(f) >= 100.0d) {
            WinterFlowCompilerVariable2 = WinterFlowCacheRuntime.WinterFlowCompilerVariable(f);
        } else {
            float f7 = 0.0f;
            float min = f5 < 0.0f ? 0.0f : Math.min(360.0f, f5);
            float f8 = 0.0f;
            float f9 = f6;
            WinterFlowCacheComponent winterFlowCacheComponent = null;
            boolean z = true;
            while (true) {
                if (Math.abs(f8 - f6) >= 0.4000000059604645d) {
                    float f10 = 1000.0f;
                    float f11 = f7;
                    float f12 = f11;
                    float f13 = 1000.0f;
                    float f14 = 100.0f;
                    WinterFlowCacheComponent winterFlowCacheComponent2 = null;
                    while (true) {
                        f2 = f6;
                        if (Math.abs(f12 - f14) <= 0.009999999776482582d) {
                            f3 = 2.0f;
                            break;
                        }
                        float f15 = ((f14 - f12) / 2.0f) + f12;
                        int WinterFlowCacheManagerAgent2 = WinterFlowTestingCloud.WinterFlowVariableBandwidth(f15, f9, min).WinterFlowCacheManagerAgent(WinterFlowIDEService.WinterFlowTransactionAgent);
                        float WinterFlowPackageIDE = WinterFlowCacheRuntime.WinterFlowPackageIDE((WinterFlowCacheManagerAgent2 >> 16) & 255);
                        f3 = 2.0f;
                        float WinterFlowPackageIDE2 = WinterFlowCacheRuntime.WinterFlowPackageIDE((WinterFlowCacheManagerAgent2 >> 8) & 255);
                        float WinterFlowPackageIDE3 = WinterFlowCacheRuntime.WinterFlowPackageIDE(WinterFlowCacheManagerAgent2 & 255);
                        double d44 = WinterFlowPackageIDE;
                        double[] dArr15 = WinterFlowCacheRuntime.WinterFlowTransactionManagerStrategy[1];
                        float f16 = ((float) ((WinterFlowPackageIDE3 * dArr15[2]) + ((WinterFlowPackageIDE2 * dArr15[1]) + (d44 * dArr15[0])))) / 100.0f;
                        float cbrt = f16 <= 0.008856452f ? f16 * 903.2963f : (((float) Math.cbrt(f16)) * 116.0f) - 16.0f;
                        float abs = (float) Math.abs(f - cbrt);
                        if (abs < 0.2f) {
                            WinterFlowCacheComponent WinterFlowSingletonPlatform3 = WinterFlowTestingCloud.WinterFlowSingletonPlatform(WinterFlowCacheManagerAgent2);
                            WinterFlowCacheComponent WinterFlowVariableBandwidth2 = WinterFlowTestingCloud.WinterFlowVariableBandwidth(WinterFlowSingletonPlatform3.WinterFlowCacheManagerAgent, WinterFlowSingletonPlatform3.WinterFlowHookDataSource, min);
                            float f17 = WinterFlowSingletonPlatform3.WinterFlowArrayNetwork - WinterFlowVariableBandwidth2.WinterFlowArrayNetwork;
                            f4 = cbrt;
                            float f18 = WinterFlowSingletonPlatform3.WinterFlowVariableVersionControl - WinterFlowVariableBandwidth2.WinterFlowVariableVersionControl;
                            float f19 = WinterFlowSingletonPlatform3.WinterFlowTransactionManagerStrategy - WinterFlowVariableBandwidth2.WinterFlowTransactionManagerStrategy;
                            float pow5 = (float) (Math.pow(Math.sqrt((f19 * f19) + (f18 * f18) + (f17 * f17)), 0.63d) * 1.41d);
                            if (pow5 <= 1.0f) {
                                f13 = pow5;
                                winterFlowCacheComponent2 = WinterFlowSingletonPlatform3;
                                f10 = abs;
                            }
                        } else {
                            f4 = cbrt;
                        }
                        if (f10 == f11 && f13 == f11) {
                            break;
                        }
                        if (f4 < f) {
                            f6 = f2;
                            f12 = f15;
                        } else {
                            f6 = f2;
                            f14 = f15;
                        }
                    }
                    WinterFlowCacheComponent winterFlowCacheComponent3 = winterFlowCacheComponent2;
                    if (!z) {
                        if (winterFlowCacheComponent3 == null) {
                            f6 = f9;
                        } else {
                            winterFlowCacheComponent = winterFlowCacheComponent3;
                            f8 = f9;
                            f6 = f2;
                        }
                        f9 = ((f6 - f8) / f3) + f8;
                        f7 = f11;
                    } else {
                        if (winterFlowCacheComponent3 != null) {
                            WinterFlowCompilerVariable2 = winterFlowCacheComponent3.WinterFlowCacheManagerAgent(winterFlowIDEService);
                            break;
                        }
                        f9 = ((f2 - f8) / f3) + f8;
                        f7 = f11;
                        f6 = f2;
                        z = false;
                    }
                } else {
                    WinterFlowCompilerVariable2 = winterFlowCacheComponent == null ? WinterFlowCacheRuntime.WinterFlowCompilerVariable(f) : winterFlowCacheComponent.WinterFlowCacheManagerAgent(winterFlowIDEService);
                }
            }
        }
        return WinterFlowInvokerComponent.WinterFlowArrayNetwork(WinterFlowCompilerVariable2);
    }

    public static final WinterFlowViewSoftware WinterFlowResolverController(WinterFlowClassBackend winterFlowClassBackend, WinterFlowObjectSession winterFlowObjectSession) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            WinterFlowProcessorSystem WinterFlowRouterStructure2 = winterFlowClassBackend.WinterFlowRouterStructure();
            WinterFlowSchedulerStructure winterFlowSchedulerStructure = WinterFlowRouterStructure2.WinterFlowCacheManagerAgent;
            if (winterFlowSchedulerStructure.WinterFlowPackageIDE() && winterFlowSchedulerStructure.WinterFlowCacheManagerListener()) {
                WinterFlowVersionParser WinterFlowUnitTestResponse2 = WinterFlowRouterStructure2.WinterFlowUnitTestResponse();
                WinterFlowViewSoftware winterFlowViewSoftware = new WinterFlowViewSoftware(48);
                WinterFlowNodeSerializer winterFlowNodeSerializer = new WinterFlowNodeSerializer(0);
                winterFlowNodeSerializer.WinterFlowHookDataSource(WinterFlowCacheRuntime.WinterFlowQueueService(WinterFlowUnitTestResponse2));
                WinterFlowEventEmitterController(winterFlowObjectSession, winterFlowViewSoftware, new WinterFlowNodeSerializer(0), winterFlowNodeSerializer, WinterFlowRouterStructure2, WinterFlowRouterStructure2);
                return winterFlowViewSoftware;
            }
            WinterFlowViewSoftware winterFlowViewSoftware2 = WinterFlowVersionControlAgent.WinterFlowRouterStructure;
            winterFlowViewSoftware2.getClass();
            return winterFlowViewSoftware2;
        } finally {
            Trace.endSection();
        }
    }

    public static void WinterFlowRouterAdapter(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        byte[] bArr3 = (i4 & 16) == 16 ? WinterFlowCacheManagerAgent : (i4 & 32) == 32 ? WinterFlowArrayNetwork : WinterFlowHookDataSource;
        int i5 = (i2 > 1 ? (bArr[i + 1] << 24) >>> 16 : 0) | (i2 > 0 ? (bArr[i] << 24) >>> 8 : 0) | (i2 > 2 ? (bArr[i + 2] << 24) >>> 24 : 0);
        if (i2 == 1) {
            bArr2[i3] = bArr3[i5 >>> 18];
            bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 == 2) {
            bArr2[i3] = bArr3[i5 >>> 18];
            bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
            bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
            bArr2[i3 + 3] = 61;
            return;
        }
        if (i2 != 3) {
            return;
        }
        bArr2[i3] = bArr3[i5 >>> 18];
        bArr2[i3 + 1] = bArr3[(i5 >>> 12) & 63];
        bArr2[i3 + 2] = bArr3[(i5 >>> 6) & 63];
        bArr2[i3 + 3] = bArr3[i5 & 63];
    }

    public static WinterFlowEventProvider WinterFlowRouterRouter(WinterFlowEventProvider winterFlowEventProvider, int i) {
        WinterFlowDataSourceHandler winterFlowDataSourceHandler;
        if (i < 0 && i != -2 && i != -1) {
            WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowSyntax("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i));
            return null;
        }
        if (i == -1) {
            i = 0;
            winterFlowDataSourceHandler = WinterFlowDataSourceHandler.WinterFlowTransactionManagerStrategy;
        } else {
            winterFlowDataSourceHandler = WinterFlowDataSourceHandler.WinterFlowVariableVersionControl;
        }
        boolean z = winterFlowEventProvider instanceof WinterFlowConsumerProcess;
        WinterFlowEventEmitterPackage winterFlowEventEmitterPackage = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
        return z ? ((WinterFlowConsumerProcess) winterFlowEventProvider).WinterFlowHookDataSource(winterFlowEventEmitterPackage, i, winterFlowDataSourceHandler) : new WinterFlowProcessorEvent(winterFlowEventProvider, winterFlowEventEmitterPackage, i, winterFlowDataSourceHandler);
    }

    public static final void WinterFlowRouterStructure(WinterFlowMapperManager winterFlowMapperManager, WinterFlowInvokerConsumer winterFlowInvokerConsumer, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(380139498);
        int i2 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowMapperManager) ? 4 : 2) | i | 432;
        int i3 = 0;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i2 & 1, (i2 & 1171) != 1170)) {
            winterFlowInvokerConsumer = WinterFlowCacheUtility.WinterFlowUnitTestResponse;
            WinterFlowWorkerModule WinterFlowCacheManagerAgent2 = WinterFlowLibrary.WinterFlowCacheManagerAgent(winterFlowInvokerConsumer, false);
            boolean WinterFlowVariableVersionControl2 = winterFlowResolverLibrary.WinterFlowVariableVersionControl(WinterFlowCacheManagerAgent2);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowVariableVersionControl2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = new WinterFlowAPIVersionControl(i3, WinterFlowCacheManagerAgent2, winterFlowEventTool);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowUnitTestLibrary.WinterFlowTransactionManagerStrategy(winterFlowMapperManager, (WinterFlowEventEvent) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, i2 & 14, 0);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowInvokerConsumer winterFlowInvokerConsumer2 = winterFlowInvokerConsumer;
        WinterFlowStackEngine WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 != null) {
            WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowConsumerVersionControl(winterFlowMapperManager, winterFlowInvokerConsumer2, winterFlowEventTool, i, 2);
        }
    }

    public static String WinterFlowSerializerStructure(int i, byte[] bArr) {
        if (bArr == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Cannot serialize a null array.");
            return null;
        }
        if (i < 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Cannot have length offset: ", i));
            return null;
        }
        if (i > bArr.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, Integer.valueOf(i), Integer.valueOf(bArr.length)));
        }
        int i2 = ((i / 3) * 4) + (i % 3 <= 0 ? 0 : 4);
        byte[] bArr2 = new byte[i2];
        int i3 = i - 2;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            WinterFlowRouterAdapter(bArr, i4, 3, bArr2, i5, 0);
            i4 += 3;
            i5 += 4;
        }
        if (i4 < i) {
            WinterFlowRouterAdapter(bArr, i4, i - i4, bArr2, i5, 0);
            i5 += 4;
        }
        if (i5 <= i2 - 1) {
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr2, 0, bArr3, 0, i5);
            bArr2 = bArr3;
        }
        try {
            return new String(bArr2, "US-ASCII");
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr2);
        }
    }

    public static final boolean WinterFlowServerProtocol(WinterFlowServiceProviderAgent winterFlowServiceProviderAgent) {
        return !winterFlowServiceProviderAgent.WinterFlowRouterRouter && winterFlowServiceProviderAgent.WinterFlowArrayNetwork;
    }

    public static final void WinterFlowServiceUtility(int i) {
        if (i >= 1) {
            return;
        }
        WinterFlowCompilerMechanism.WinterFlowCacheManagerAgent(WinterFlowResolverBackend.WinterFlowSyntax("Expected positive parallelism level, but got ", i));
    }

    public static boolean WinterFlowSingletonPlatform() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
            com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource2 = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
            WinterFlowHookDataSource2.WinterFlowRouterStructure();
            context = WinterFlowHookDataSource2.WinterFlowRouterStructure;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:14|(1:16)|17|(1:19)(39:115|(2:118|119)|117|21|(5:103|104|105|106|107)|23|24|(1:26)(1:102)|27|28|(29:30|(1:95)|32|(1:34)(1:(1:94))|35|36|(1:38)|39|(1:41)(1:92)|42|(1:46)|(1:48)(1:91)|49|(1:51)(1:90)|52|(1:54)(1:89)|55|(1:57)(1:88)|58|(5:84|85|67|(1:69)(1:71)|70)|60|(5:80|81|67|(0)(0)|70)|62|63|(1:65)(6:73|(2:76|(1:78))|75|67|(0)(0)|70)|66|67|(0)(0)|70)|96|(1:98)(3:99|(1:101)|32)|(0)(0)|35|36|(0)|39|(0)(0)|42|(2:44|46)|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)|60|(0)|62|63|(0)(0)|66|67|(0)(0)|70)|20|21|(0)|23|24|(0)(0)|27|28|(0)|96|(0)(0)|(0)(0)|35|36|(0)|39|(0)(0)|42|(0)|(0)(0)|49|(0)(0)|52|(0)(0)|55|(0)(0)|58|(0)|60|(0)|62|63|(0)(0)|66|67|(0)(0)|70) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168 A[Catch: NumberFormatException -> 0x0176, TRY_ENTER, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x0176, blocks: (B:65:0x0168, B:78:0x0182), top: B:63:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0140 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void WinterFlowSoftwareEngine(Intent intent) {
        WinterFlowMiddlewareView winterFlowMiddlewareView;
        int parseInt;
        int i;
        String string;
        com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource2;
        String string2;
        Object[] objArr;
        String string3;
        String string4;
        long parseLong;
        String str;
        String str2;
        if (WinterFlowCacheTool(intent)) {
            WinterFlowSyntaxSubsystem(intent.getExtras(), "_nr");
        }
        int i2 = 0;
        if (!((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : WinterFlowSingletonPlatform()) || (winterFlowMiddlewareView = (WinterFlowMiddlewareView) FirebaseMessaging.WinterFlowThreadListener.get()) == null) {
            return;
        }
        WinterFlowSyntaxEngine winterFlowSyntaxEngine = null;
        r3 = null;
        String str3 = null;
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            Object obj = extras.get("google.ttl");
            if (obj instanceof Integer) {
                parseInt = ((Integer) obj).intValue();
            } else {
                if (obj instanceof String) {
                    try {
                        parseInt = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        WinterFlowHookDataSource2 = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
                    } catch (InterruptedException | ExecutionException e) {
                        e = e;
                    }
                    try {
                        Object obj2 = WinterFlowBackendComponent.WinterFlowServerProtocol;
                        WinterFlowHookDataSource2.WinterFlowRouterStructure();
                        string = (String) WinterFlowHookProcessor.WinterFlowArrayNetwork(((WinterFlowBackendComponent) WinterFlowHookDataSource2.WinterFlowArrayNetwork.WinterFlowRouterStructure(WinterFlowDatabaseSchemaBandwidth.class)).WinterFlowCacheManagerAgent());
                    } catch (InterruptedException e2) {
                        e = e2;
                        throw new RuntimeException(e);
                    }
                }
                String str4 = string;
                com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource3 = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
                WinterFlowHookDataSource3.WinterFlowRouterStructure();
                String packageName = WinterFlowHookDataSource3.WinterFlowRouterStructure.getPackageName();
                WinterFlowControllerProcess winterFlowControllerProcess = !WinterFlowJSONDecorator.WinterFlowThreadListener(extras) ? WinterFlowControllerProcess.DISPLAY_NOTIFICATION : WinterFlowControllerProcess.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                    if (!"1".equals(extras.getString("google.priority_reduced"))) {
                        string2 = extras.getString("google.priority");
                    }
                    objArr = 2;
                    if (objArr == 2) {
                        i2 = 5;
                    } else if (objArr == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    String str5 = string3 != null ? string3 : "";
                    string4 = extras.getString("from");
                    if (string4 != null && string4.startsWith("/topics/")) {
                        str3 = string4;
                    }
                    String str6 = str3 != null ? str3 : "";
                    String string5 = extras.getString("collapse_key");
                    String str7 = string5 != null ? string5 : "";
                    String string6 = extras.getString("google.c.a.m_l");
                    String str8 = string6 != null ? string6 : "";
                    String string7 = extras.getString("google.c.a.c_l");
                    String str9 = string7 != null ? string7 : "";
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException unused2) {
                        }
                        winterFlowSyntaxEngine = new WinterFlowSyntaxEngine(parseLong <= 0 ? parseLong : 0L, str5, str4, winterFlowControllerProcess, packageName, str7, i3, i, str6, str8, str9);
                    }
                    com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource4 = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
                    WinterFlowMapperEngine winterFlowMapperEngine = WinterFlowHookDataSource4.WinterFlowCacheManagerAgent;
                    WinterFlowHookDataSource4.WinterFlowRouterStructure();
                    str = winterFlowMapperEngine.WinterFlowVariableVersionControl;
                    if (str != null) {
                        try {
                            parseLong = Long.parseLong(str);
                        } catch (NumberFormatException unused3) {
                        }
                        winterFlowSyntaxEngine = new WinterFlowSyntaxEngine(parseLong <= 0 ? parseLong : 0L, str5, str4, winterFlowControllerProcess, packageName, str7, i3, i, str6, str8, str9);
                    }
                    WinterFlowHookDataSource4.WinterFlowRouterStructure();
                    str2 = winterFlowMapperEngine.WinterFlowHookDataSource;
                    if (str2.startsWith("1:")) {
                        String[] split = str2.split(":");
                        if (split.length >= 2) {
                            String str10 = split[1];
                            if (!str10.isEmpty()) {
                                parseLong = Long.parseLong(str10);
                            }
                        }
                        parseLong = 0;
                        winterFlowSyntaxEngine = new WinterFlowSyntaxEngine(parseLong <= 0 ? parseLong : 0L, str5, str4, winterFlowControllerProcess, packageName, str7, i3, i, str6, str8, str9);
                    } else {
                        parseLong = Long.parseLong(str2);
                    }
                    winterFlowSyntaxEngine = new WinterFlowSyntaxEngine(parseLong <= 0 ? parseLong : 0L, str5, str4, winterFlowControllerProcess, packageName, str7, i3, i, str6, str8, str9);
                }
                if (Constants.HIGH.equals(string2)) {
                    if (!Constants.NORMAL.equals(string2)) {
                        objArr = 0;
                    }
                    objArr = 2;
                } else {
                    objArr = 1;
                }
                if (objArr == 2) {
                }
                int i32 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                    str3 = string4;
                }
                if (str3 != null) {
                }
                String string52 = extras.getString("collapse_key");
                if (string52 != null) {
                }
                String string62 = extras.getString("google.c.a.m_l");
                if (string62 != null) {
                }
                String string72 = extras.getString("google.c.a.c_l");
                if (string72 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource42 = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
                WinterFlowMapperEngine winterFlowMapperEngine2 = WinterFlowHookDataSource42.WinterFlowCacheManagerAgent;
                WinterFlowHookDataSource42.WinterFlowRouterStructure();
                str = winterFlowMapperEngine2.WinterFlowVariableVersionControl;
                if (str != null) {
                }
                WinterFlowHookDataSource42.WinterFlowRouterStructure();
                str2 = winterFlowMapperEngine2.WinterFlowHookDataSource;
                if (str2.startsWith("1:")) {
                }
                winterFlowSyntaxEngine = new WinterFlowSyntaxEngine(parseLong <= 0 ? parseLong : 0L, str5, str4, winterFlowControllerProcess, packageName, str7, i32, i, str6, str8, str9);
            }
            i = parseInt;
            string = extras.getString("google.to");
            if (TextUtils.isEmpty(string)) {
            }
            String str42 = string;
            com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource32 = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
            WinterFlowHookDataSource32.WinterFlowRouterStructure();
            String packageName2 = WinterFlowHookDataSource32.WinterFlowRouterStructure.getPackageName();
            WinterFlowControllerProcess winterFlowControllerProcess2 = !WinterFlowJSONDecorator.WinterFlowThreadListener(extras) ? WinterFlowControllerProcess.DISPLAY_NOTIFICATION : WinterFlowControllerProcess.DATA_MESSAGE;
            string2 = extras.getString("google.delivered_priority");
            if (string2 == null) {
            }
            if (Constants.HIGH.equals(string2)) {
            }
            if (objArr == 2) {
            }
            int i322 = i2;
            string3 = extras.getString("google.message_id");
            if (string3 == null) {
            }
            if (string3 != null) {
            }
            string4 = extras.getString("from");
            if (string4 != null) {
            }
            if (str3 != null) {
            }
            String string522 = extras.getString("collapse_key");
            if (string522 != null) {
            }
            String string622 = extras.getString("google.c.a.m_l");
            if (string622 != null) {
            }
            String string722 = extras.getString("google.c.a.c_l");
            if (string722 != null) {
            }
            if (extras.containsKey("google.c.sender.id")) {
            }
            com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource422 = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
            WinterFlowMapperEngine winterFlowMapperEngine22 = WinterFlowHookDataSource422.WinterFlowCacheManagerAgent;
            WinterFlowHookDataSource422.WinterFlowRouterStructure();
            str = winterFlowMapperEngine22.WinterFlowVariableVersionControl;
            if (str != null) {
            }
            WinterFlowHookDataSource422.WinterFlowRouterStructure();
            str2 = winterFlowMapperEngine22.WinterFlowHookDataSource;
            if (str2.startsWith("1:")) {
            }
            winterFlowSyntaxEngine = new WinterFlowSyntaxEngine(parseLong <= 0 ? parseLong : 0L, str5, str42, winterFlowControllerProcess2, packageName2, str7, i322, i, str6, str8, str9);
        }
        if (winterFlowSyntaxEngine == null) {
            return;
        }
        try {
            WinterFlowInheritanceHelper winterFlowInheritanceHelper = new WinterFlowInheritanceHelper(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
            WinterFlowFrontendCache winterFlowFrontendCache = new WinterFlowFrontendCache("proto");
            WinterFlowEventEmitterOrchestration winterFlowEventEmitterOrchestration = new WinterFlowEventEmitterOrchestration(6);
            WinterFlowNodePlatform winterFlowNodePlatform = (WinterFlowNodePlatform) winterFlowMiddlewareView;
            Set set = winterFlowNodePlatform.WinterFlowRouterStructure;
            if (!set.contains(winterFlowFrontendCache)) {
                throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", winterFlowFrontendCache, set));
            }
            new WinterFlowObjectPackage(winterFlowNodePlatform.WinterFlowHookDataSource, winterFlowFrontendCache, winterFlowEventEmitterOrchestration, winterFlowNodePlatform.WinterFlowCacheManagerAgent).WinterFlowSerializerStructure(new WinterFlowTransactionProcess(new WinterFlowControllerCacheManager(winterFlowSyntaxEngine), winterFlowInheritanceHelper));
        } catch (RuntimeException unused4) {
        }
    }

    public static final boolean WinterFlowSoftwareProtocol(WinterFlowProcessorSystem winterFlowProcessorSystem) {
        if (!WinterFlowPackageIDE(winterFlowProcessorSystem)) {
            WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
            if (winterFlowDecoratorBackend.WinterFlowUnitTestResponse) {
                return true;
            }
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorBackend.WinterFlowVariableVersionControl;
            Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource;
            Object[] objArr2 = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
            long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((WinterFlowRendererOrchestration) obj).WinterFlowCacheManagerAgent) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final Class WinterFlowStrategyTool(WinterFlowEventEmitterCacheManager winterFlowEventEmitterCacheManager) {
        Class WinterFlowRouterStructure2 = winterFlowEventEmitterCacheManager.WinterFlowRouterStructure();
        if (WinterFlowRouterStructure2.isPrimitive()) {
            String name = WinterFlowRouterStructure2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals(Constants.LONG)) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return WinterFlowRouterStructure2;
    }

    public static void WinterFlowSyntaxSubsystem(Bundle bundle, String str) {
        try {
            com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = WinterFlowJSONDecorator.WinterFlowThreadListener(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            com.google.firebase.WinterFlowSyntaxEvent WinterFlowHookDataSource2 = com.google.firebase.WinterFlowSyntaxEvent.WinterFlowHookDataSource();
            WinterFlowHookDataSource2.WinterFlowRouterStructure();
            if (WinterFlowHookDataSource2.WinterFlowArrayNetwork.WinterFlowRouterStructure(WinterFlowAPILayer.class) == null) {
                return;
            }
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
        } catch (IllegalStateException unused3) {
        }
    }

    public static final WinterFlowUserManagerController WinterFlowTestingNode(WinterFlowLibraryDeployment winterFlowLibraryDeployment, int i) {
        WinterFlowUserManagerController winterFlowUserManagerController = ((WinterFlowUserManagerController) winterFlowLibraryDeployment).WinterFlowVariableVersionControl.WinterFlowResponseEngine;
        if (winterFlowUserManagerController == null || (winterFlowUserManagerController.WinterFlowRouterRouter & i) == 0) {
            return null;
        }
        while (winterFlowUserManagerController != null) {
            int i2 = winterFlowUserManagerController.WinterFlowUnitTestResponse;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return winterFlowUserManagerController;
            }
            winterFlowUserManagerController = winterFlowUserManagerController.WinterFlowResponseEngine;
        }
        return null;
    }

    public static final boolean WinterFlowThreadListener(WinterFlowServiceProviderAgent winterFlowServiceProviderAgent) {
        return winterFlowServiceProviderAgent.WinterFlowRouterRouter && !winterFlowServiceProviderAgent.WinterFlowArrayNetwork;
    }

    public static final void WinterFlowTransactionAgent(WinterFlowAdapterResponse winterFlowAdapterResponse, WinterFlowCloudManager winterFlowCloudManager) {
        WinterFlowConsumerBandwidth winterFlowConsumerBandwidth = (WinterFlowConsumerBandwidth) winterFlowAdapterResponse.WinterFlowRouterRouter().WinterFlowConsumerUserManager(WinterFlowSessionManagerProcess.WinterFlowVariableBandwidth);
        if (winterFlowConsumerBandwidth != null) {
            winterFlowConsumerBandwidth.WinterFlowArrayNetwork(winterFlowCloudManager);
        } else {
            WinterFlowCompilerMechanism.WinterFlowVariableVersionControl(winterFlowAdapterResponse, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WinterFlowTransactionManagerStrategy(WinterFlowRouterRefactoring winterFlowRouterRefactoring, WinterFlowJSONSerializer winterFlowJSONSerializer, WinterFlowVersionLayer winterFlowVersionLayer) {
        WinterFlowNetworkScheduler winterFlowNetworkScheduler;
        int i;
        WinterFlowListenerJava winterFlowListenerJava;
        int size;
        int i2;
        if (winterFlowVersionLayer instanceof WinterFlowNetworkScheduler) {
            winterFlowNetworkScheduler = (WinterFlowNetworkScheduler) winterFlowVersionLayer;
            int i3 = winterFlowNetworkScheduler.WinterFlowTransactionAgent;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                winterFlowNetworkScheduler.WinterFlowTransactionAgent = i3 - Integer.MIN_VALUE;
                Object obj = winterFlowNetworkScheduler.WinterFlowResponseEngine;
                i = winterFlowNetworkScheduler.WinterFlowTransactionAgent;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    List list = winterFlowRouterRefactoring.WinterFlowSyntax.WinterFlowMapperProtocol.WinterFlowRouterStructure;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (((WinterFlowObjectSystem) list.get(i4)).WinterFlowArrayNetwork) {
                            winterFlowNetworkScheduler.WinterFlowRouterRouter = winterFlowRouterRefactoring;
                            winterFlowNetworkScheduler.WinterFlowSyntax = winterFlowJSONSerializer;
                            winterFlowNetworkScheduler.WinterFlowTransactionAgent = 1;
                            obj = winterFlowRouterRefactoring.WinterFlowRouterStructure(winterFlowJSONSerializer, winterFlowNetworkScheduler);
                            winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            if (obj == winterFlowListenerJava) {
                            }
                            List list2 = ((WinterFlowCacheManagerUtility) obj).WinterFlowRouterStructure;
                            size = list2.size();
                            i2 = 0;
                            while (i2 < size) {
                            }
                            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                        }
                    }
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
                if (i != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                WinterFlowJSONSerializer winterFlowJSONSerializer2 = winterFlowNetworkScheduler.WinterFlowSyntax;
                WinterFlowRouterRefactoring winterFlowRouterRefactoring2 = winterFlowNetworkScheduler.WinterFlowRouterRouter;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                winterFlowJSONSerializer = winterFlowJSONSerializer2;
                winterFlowRouterRefactoring = winterFlowRouterRefactoring2;
                List list22 = ((WinterFlowCacheManagerUtility) obj).WinterFlowRouterStructure;
                size = list22.size();
                i2 = 0;
                while (i2 < size) {
                    if (((WinterFlowObjectSystem) list22.get(i2)).WinterFlowArrayNetwork) {
                        winterFlowNetworkScheduler.WinterFlowRouterRouter = winterFlowRouterRefactoring;
                        winterFlowNetworkScheduler.WinterFlowSyntax = winterFlowJSONSerializer;
                        winterFlowNetworkScheduler.WinterFlowTransactionAgent = 1;
                        obj = winterFlowRouterRefactoring.WinterFlowRouterStructure(winterFlowJSONSerializer, winterFlowNetworkScheduler);
                        winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (obj == winterFlowListenerJava) {
                            return winterFlowListenerJava;
                        }
                        List list222 = ((WinterFlowCacheManagerUtility) obj).WinterFlowRouterStructure;
                        size = list222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    } else {
                        i2++;
                    }
                }
                return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            }
        }
        winterFlowNetworkScheduler = new WinterFlowNetworkScheduler(winterFlowVersionLayer);
        Object obj2 = winterFlowNetworkScheduler.WinterFlowResponseEngine;
        i = winterFlowNetworkScheduler.WinterFlowTransactionAgent;
        if (i != 0) {
        }
    }

    public static final void WinterFlowUIMiddleware(WinterFlowEventCloud winterFlowEventCloud, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer, boolean z) {
        Object WinterFlowRouterAdapter2 = winterFlowEventCloud.WinterFlowRouterAdapter();
        Throwable WinterFlowVariableVersionControl2 = winterFlowEventCloud.WinterFlowVariableVersionControl(WinterFlowRouterAdapter2);
        Object winterFlowDecoratorTool = WinterFlowVariableVersionControl2 != null ? new WinterFlowDecoratorTool(WinterFlowVariableVersionControl2) : winterFlowEventCloud.WinterFlowUnitTestResponse(WinterFlowRouterAdapter2);
        if (!z) {
            winterFlowTransactionManagerLayer.WinterFlowSyntax(winterFlowDecoratorTool);
            return;
        }
        winterFlowTransactionManagerLayer.getClass();
        WinterFlowScriptHelper winterFlowScriptHelper = (WinterFlowScriptHelper) winterFlowTransactionManagerLayer;
        WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler = winterFlowScriptHelper.WinterFlowSyntax;
        Object obj = winterFlowScriptHelper.WinterFlowTransactionAgent;
        WinterFlowEncryptionMicroservice context = winterFlowOrchestrationCompiler.getContext();
        Object WinterFlowFrameworkTransaction = WinterFlowInvokerComponent.WinterFlowFrameworkTransaction(context, obj);
        WinterFlowResolverCloud WinterFlowFrameworkTransaction2 = WinterFlowFrameworkTransaction != WinterFlowInvokerComponent.WinterFlowOrchestrationSubsystem ? WinterFlowUnitTestLibrary.WinterFlowFrameworkTransaction(winterFlowOrchestrationCompiler, context, WinterFlowFrameworkTransaction) : null;
        try {
            winterFlowOrchestrationCompiler.WinterFlowSyntax(winterFlowDecoratorTool);
            if (WinterFlowFrameworkTransaction2 == null || WinterFlowFrameworkTransaction2.WinterFlowPipelineSoftware()) {
                WinterFlowInvokerComponent.WinterFlowCacheTool(context, WinterFlowFrameworkTransaction);
            }
        } catch (Throwable th) {
            if (WinterFlowFrameworkTransaction2 == null || WinterFlowFrameworkTransaction2.WinterFlowPipelineSoftware()) {
                WinterFlowInvokerComponent.WinterFlowCacheTool(context, WinterFlowFrameworkTransaction);
            }
            throw th;
        }
    }

    public static final Object WinterFlowUnitTestResponse(WinterFlowInheritance winterFlowInheritance, WinterFlowEventEvent winterFlowEventEvent, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowListenerJava winterFlowListenerJava;
        WinterFlowAlgorithmSession winterFlowAlgorithmSession;
        WinterFlowStrategyThread winterFlowStrategyThread = new WinterFlowStrategyThread(winterFlowTransactionManagerLayer.getContext(), winterFlowEventEvent, null);
        WinterFlowDatabaseEntity winterFlowDatabaseEntity = (WinterFlowDatabaseEntity) winterFlowInheritance;
        winterFlowDatabaseEntity.getClass();
        WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowTransactionManagerLayer));
        winterFlowEventCloud.WinterFlowSerializerStructure();
        WinterFlowRouterRefactoring winterFlowRouterRefactoring = new WinterFlowRouterRefactoring(winterFlowDatabaseEntity, winterFlowEventCloud);
        synchronized (winterFlowDatabaseEntity.WinterFlowConsumerUserManager) {
            winterFlowDatabaseEntity.WinterFlowResolverController.WinterFlowHookDataSource(winterFlowRouterRefactoring);
            WinterFlowTransactionManagerLayer WinterFlowCompilerVariable2 = WinterFlowCloudStack.WinterFlowCompilerVariable(WinterFlowCloudStack.WinterFlowServiceUtility(winterFlowRouterRefactoring, winterFlowRouterRefactoring, winterFlowStrategyThread));
            winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
            WinterFlowDeserializationHelper winterFlowDeserializationHelper = new WinterFlowDeserializationHelper(WinterFlowCompilerVariable2);
            winterFlowAlgorithmSession = WinterFlowAlgorithmSession.WinterFlowRouterStructure;
            winterFlowDeserializationHelper.WinterFlowSyntax(winterFlowAlgorithmSession);
        }
        winterFlowEventCloud.WinterFlowResolverController(new WinterFlowProviderFramework(22, winterFlowRouterRefactoring));
        Object WinterFlowBatchUI2 = winterFlowEventCloud.WinterFlowBatchUI();
        return WinterFlowBatchUI2 == winterFlowListenerJava ? WinterFlowBatchUI2 : winterFlowAlgorithmSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Typeface WinterFlowUserManagerUserManager(WinterFlowStrategyBackend winterFlowStrategyBackend, Context context) {
        int i = WinterFlowView.WinterFlowRouterStructure;
        Typeface typeface = null;
        if (!context.isRestricted()) {
            TypedValue typedValue = new TypedValue();
            Resources resources = context.getResources();
            resources.getValue(com.icewinter.flow.winter.icecatch.R.font.winter_app_font, typedValue, true);
            CharSequence charSequence = typedValue.string;
            if (charSequence == null) {
                throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(com.icewinter.flow.winter.icecatch.R.font.winter_app_font) + "\" (" + Integer.toHexString(com.icewinter.flow.winter.icecatch.R.font.winter_app_font) + ") is not a Font: " + typedValue);
            }
            String charSequence2 = charSequence.toString();
            if (charSequence2.startsWith("res/")) {
                int i2 = typedValue.assetCookie;
                WinterFlowThreadNode winterFlowThreadNode = WinterFlowAlgorithmProxy.WinterFlowHookDataSource;
                Typeface typeface2 = (Typeface) winterFlowThreadNode.WinterFlowCacheManagerAgent(WinterFlowAlgorithmProxy.WinterFlowHookDataSource(resources, charSequence2, i2));
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            WinterFlowDebugRequest WinterFlowTestingNode = WinterFlowUnitTestLibrary.WinterFlowTestingNode(resources.getXml(com.icewinter.flow.winter.icecatch.R.font.winter_app_font), resources);
                            if (WinterFlowTestingNode != null) {
                                typeface = WinterFlowAlgorithmProxy.WinterFlowRouterStructure(context, WinterFlowTestingNode, resources, charSequence2, typedValue.assetCookie, null);
                            }
                        } else {
                            int i3 = typedValue.assetCookie;
                            Typeface WinterFlowServiceUtility2 = WinterFlowAlgorithmProxy.WinterFlowRouterStructure.WinterFlowServiceUtility(context, resources, charSequence2);
                            if (WinterFlowServiceUtility2 != null) {
                                winterFlowThreadNode.WinterFlowArrayNetwork(WinterFlowAlgorithmProxy.WinterFlowHookDataSource(resources, charSequence2, i3), WinterFlowServiceUtility2);
                            }
                            typeface = WinterFlowServiceUtility2;
                        }
                    } catch (IOException | XmlPullParserException unused) {
                    }
                }
                if (typeface == null) {
                    throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(com.icewinter.flow.winter.icecatch.R.font.winter_app_font) + " could not be retrieved.");
                }
            }
            typeface = null;
            if (typeface == null) {
            }
        }
        typeface.getClass();
        return typeface;
    }

    public static final float WinterFlowVariableBandwidth(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static final void WinterFlowVariableVersionControl(WinterFlowJSONDecorator winterFlowJSONDecorator, WinterFlowServiceProviderAgent winterFlowServiceProviderAgent, WinterFlowBackendBatch winterFlowBackendBatch, WinterFlowDataSourceRenderer winterFlowDataSourceRenderer, WinterFlowSyntax winterFlowSyntax, long j) {
        float intBitsToFloat;
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) winterFlowSyntax.WinterFlowHookDataSource;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (winterFlowServiceProviderAgent.WinterFlowCacheManagerAgent >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (winterFlowServiceProviderAgent.WinterFlowCacheManagerAgent & 4294967295L));
        if (WinterFlowServerProtocol(winterFlowServiceProviderAgent)) {
            winterFlowSyntax.WinterFlowRouterStructure = 0;
            winterFlowMicroserviceFunction.WinterFlowArrayNetwork();
        }
        if (!WinterFlowThreadListener(winterFlowServiceProviderAgent) && !WinterFlowServerProtocol(winterFlowServiceProviderAgent)) {
            if (winterFlowMicroserviceFunction.WinterFlowHookDataSource == 3) {
                int i = winterFlowSyntax.WinterFlowRouterStructure;
                winterFlowSyntax.WinterFlowRouterStructure = i + 1;
                winterFlowMicroserviceFunction.WinterFlowServiceUtility(i, winterFlowServiceProviderAgent);
            } else {
                winterFlowMicroserviceFunction.WinterFlowRouterStructure(winterFlowServiceProviderAgent);
            }
            if (winterFlowSyntax.WinterFlowRouterStructure == 3) {
                winterFlowSyntax.WinterFlowRouterStructure = 0;
            }
            Object[] objArr = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
            int i2 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += Float.intBitsToFloat((int) (((WinterFlowServiceProviderAgent) objArr[i3]).WinterFlowCacheManagerAgent >> 32));
            }
            int i4 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((WinterFlowServiceProviderAgent) objArr2[i5]).WinterFlowCacheManagerAgent & 4294967295L));
            }
            intBitsToFloat3 = f2 / winterFlowMicroserviceFunction.WinterFlowHookDataSource;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (winterFlowBackendBatch != null) {
            int i6 = winterFlowDataSourceRenderer.WinterFlowRouterStructure;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = winterFlowBackendBatch == WinterFlowBackendBatch.WinterFlowTransactionManagerStrategy ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((WinterFlowThreadJava) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy).WinterFlowRouterStructure(winterFlowServiceProviderAgent.WinterFlowHookDataSource, WinterFlowHandlerResolver.WinterFlowVariableVersionControl(floatToRawIntBits, j));
    }

    public com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowResponseEngine(Context context, Looper looper, WinterFlowSchedulerParser winterFlowSchedulerParser, Object obj, WinterFlowCacheTransactionManager winterFlowCacheTransactionManager, WinterFlowCacheTransactionManager winterFlowCacheTransactionManager2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public com.google.android.gms.common.internal.WinterFlowSyntaxEvent WinterFlowSyntax(Context context, Looper looper, WinterFlowSchedulerParser winterFlowSchedulerParser, Object obj, WinterFlowAlgorithmPlatform winterFlowAlgorithmPlatform, WinterFlowJSONHelper winterFlowJSONHelper) {
        return WinterFlowResponseEngine(context, looper, winterFlowSchedulerParser, obj, (WinterFlowCacheTransactionManager) winterFlowAlgorithmPlatform, (WinterFlowCacheTransactionManager) winterFlowJSONHelper);
    }
}
