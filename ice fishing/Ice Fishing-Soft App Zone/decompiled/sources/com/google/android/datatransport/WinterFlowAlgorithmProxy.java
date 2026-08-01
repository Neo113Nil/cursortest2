package com.google.android.datatransport;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import com.icewinter.flow.winter.icecatch.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowAlgorithmProxy {
    public static Paint WinterFlowCacheManagerAgent;
    public static final WinterFlowThreadNode WinterFlowHookDataSource;
    public static final WinterFlowDecoratorUI WinterFlowRouterStructure;

    static {
        WinterFlowHookProcessor.WinterFlowTransactionManagerStrategy("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            WinterFlowRouterStructure = new WinterFlowCompilerMicroservice();
        } else if (i >= 29) {
            WinterFlowRouterStructure = new WinterFlowInheritanceProtocol();
        } else if (i >= 28) {
            WinterFlowRouterStructure = new WinterFlowFrameworkService();
        } else {
            WinterFlowRouterStructure = new WinterFlowSessionDeserialization();
        }
        WinterFlowHookDataSource = new WinterFlowThreadNode(16);
        WinterFlowCacheManagerAgent = null;
        Trace.endSection();
    }

    public static Font WinterFlowArrayNetwork(Typeface typeface) {
        PositionedGlyphs shapeTextRun;
        int glyphCount;
        Font font;
        Paint paint = WinterFlowCacheManagerAgent;
        if (paint == null) {
            paint = new Paint();
            WinterFlowCacheManagerAgent = paint;
        }
        paint.setTextSize(10.0f);
        WinterFlowCacheManagerAgent.setTypeface(typeface);
        shapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, WinterFlowCacheManagerAgent);
        glyphCount = shapeTextRun.glyphCount();
        if (glyphCount == 0) {
            return null;
        }
        font = shapeTextRun.getFont(0);
        return font;
    }

    public static Typeface WinterFlowCacheManagerAgent(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface create = Typeface.create(str, 0);
            Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
            if (create != null && !create.equals(create2)) {
                return create;
            }
        }
        return null;
    }

    public static String WinterFlowHookDataSource(Resources resources, String str, int i) {
        return resources.getResourcePackageName(R.font.winter_app_font) + '-' + str + '-' + i + '-' + R.font.winter_app_font + "-0";
    }

    public static Typeface WinterFlowRouterStructure(Context context, WinterFlowDebugRequest winterFlowDebugRequest, Resources resources, String str, int i, WinterFlowSoftwareException winterFlowSoftwareException) {
        Typeface WinterFlowTransactionAgent;
        Typeface build;
        FontFamily build2;
        boolean z = winterFlowDebugRequest instanceof WinterFlowResponseRuntime;
        WinterFlowThreadNode winterFlowThreadNode = WinterFlowHookDataSource;
        if (z) {
            WinterFlowResponseRuntime winterFlowResponseRuntime = (WinterFlowResponseRuntime) winterFlowDebugRequest;
            String str2 = winterFlowResponseRuntime.WinterFlowHookDataSource;
            boolean z2 = false;
            if (TextUtils.isEmpty(str2) || (build = WinterFlowCacheManagerAgent(str2)) == null) {
                ArrayList arrayList = winterFlowResponseRuntime.WinterFlowRouterStructure;
                if (arrayList.size() == 1) {
                    build = WinterFlowCacheManagerAgent(((WinterFlowXMLHelper) arrayList.get(0)).WinterFlowVariableVersionControl);
                } else {
                    if (Build.VERSION.SDK_INT >= 31) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                Typeface.CustomFallbackBuilder customFallbackBuilder = null;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= arrayList.size()) {
                                        break;
                                    }
                                    WinterFlowXMLHelper winterFlowXMLHelper = (WinterFlowXMLHelper) arrayList.get(i3);
                                    if (i3 == arrayList.size() - 1 && TextUtils.isEmpty(winterFlowXMLHelper.WinterFlowTransactionManagerStrategy)) {
                                        customFallbackBuilder.setSystemFallback(winterFlowXMLHelper.WinterFlowVariableVersionControl);
                                        break;
                                    }
                                    String str3 = winterFlowXMLHelper.WinterFlowVariableVersionControl;
                                    String str4 = winterFlowXMLHelper.WinterFlowTransactionManagerStrategy;
                                    Font WinterFlowArrayNetwork = WinterFlowArrayNetwork(WinterFlowCacheManagerAgent(str3));
                                    if (WinterFlowArrayNetwork == null) {
                                        break;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        build2 = new FontFamily.Builder(WinterFlowArrayNetwork).build();
                                    } else {
                                        try {
                                            build2 = new FontFamily.Builder(WinterFlowUserManagerPlatform.WinterFlowTransactionManagerStrategy(WinterFlowArrayNetwork).setFontVariationSettings(str4).build()).build();
                                        } catch (IOException unused) {
                                        }
                                    }
                                    if (customFallbackBuilder == null) {
                                        customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
                                    } else {
                                        customFallbackBuilder.addCustomFallback(build2);
                                    }
                                    i3++;
                                }
                                build = customFallbackBuilder.build();
                            } else {
                                if (WinterFlowCacheManagerAgent(((WinterFlowXMLHelper) arrayList.get(i2)).WinterFlowVariableVersionControl) == null) {
                                    break;
                                }
                                i2++;
                            }
                        }
                    }
                    build = null;
                }
            }
            if (build != null) {
                winterFlowThreadNode.WinterFlowArrayNetwork(WinterFlowHookDataSource(resources, str, i), build);
                return build;
            }
            Handler handler = new Handler(Looper.getMainLooper());
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = new WinterFlowThreadPoolProcess(28);
            ArrayList arrayList2 = winterFlowResponseRuntime.WinterFlowRouterStructure;
            WinterFlowSchedulerXML winterFlowSchedulerXML = new WinterFlowSchedulerXML(handler, 0);
            WinterFlowAlgorithmArray winterFlowAlgorithmArray = new WinterFlowAlgorithmArray(4, winterFlowThreadPoolProcess, winterFlowSchedulerXML);
            if (arrayList2.size() > 1) {
                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("Fallbacks with blocking fetches are not supported for performance reasons");
                return null;
            }
            WinterFlowXMLHelper winterFlowXMLHelper2 = (WinterFlowXMLHelper) arrayList2.get(0);
            WinterFlowThreadNode winterFlowThreadNode2 = WinterFlowSessionManagerService.WinterFlowRouterStructure;
            ArrayList arrayList3 = new ArrayList(1);
            Object obj = new Object[]{winterFlowXMLHelper2}[0];
            Objects.requireNonNull(obj);
            arrayList3.add(obj);
            List unmodifiableList = Collections.unmodifiableList(arrayList3);
            StringBuilder sb = new StringBuilder();
            for (int i4 = 0; i4 < unmodifiableList.size(); i4++) {
                sb.append(((WinterFlowXMLHelper) unmodifiableList.get(i4)).WinterFlowUnitTestResponse);
                sb.append("-0");
                if (i4 < unmodifiableList.size() - 1) {
                    sb.append(";");
                }
            }
            String sb2 = sb.toString();
            WinterFlowTransactionAgent = (Typeface) WinterFlowSessionManagerService.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(sb2);
            if (WinterFlowTransactionAgent != null) {
                winterFlowSchedulerXML.execute(new WinterFlowValidatorSystem(21, winterFlowThreadPoolProcess, WinterFlowTransactionAgent, z2));
            } else {
                ArrayList arrayList4 = new ArrayList(1);
                Object obj2 = new Object[]{winterFlowXMLHelper2}[0];
                Objects.requireNonNull(obj2);
                arrayList4.add(obj2);
                WinterFlowSchedulerEventEmitter WinterFlowRouterStructure2 = WinterFlowSessionManagerService.WinterFlowRouterStructure(sb2, context, Collections.unmodifiableList(arrayList4));
                winterFlowAlgorithmArray.WinterFlowConsumerUserManager(WinterFlowRouterStructure2);
                WinterFlowTransactionAgent = WinterFlowRouterStructure2.WinterFlowRouterStructure;
            }
        } else {
            WinterFlowTransactionAgent = WinterFlowRouterStructure.WinterFlowTransactionAgent(context, (WinterFlowDecoratorView) winterFlowDebugRequest, resources);
        }
        if (WinterFlowTransactionAgent != null) {
            winterFlowThreadNode.WinterFlowArrayNetwork(WinterFlowHookDataSource(resources, str, i), WinterFlowTransactionAgent);
        }
        return WinterFlowTransactionAgent;
    }
}
