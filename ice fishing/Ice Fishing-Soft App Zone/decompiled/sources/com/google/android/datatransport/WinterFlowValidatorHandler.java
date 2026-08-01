package com.google.android.datatransport;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowValidatorHandler {
    public static WeakReference WinterFlowHookDataSource;
    public WinterFlowObjectPackage WinterFlowRouterStructure;

    public final synchronized WinterFlowFunctionNetwork WinterFlowRouterStructure() {
        String str;
        WinterFlowFunctionNetwork winterFlowFunctionNetwork;
        WinterFlowObjectPackage winterFlowObjectPackage = this.WinterFlowRouterStructure;
        synchronized (((ArrayDeque) winterFlowObjectPackage.WinterFlowUnitTestResponse)) {
            str = (String) ((ArrayDeque) winterFlowObjectPackage.WinterFlowUnitTestResponse).peek();
        }
        Pattern pattern = WinterFlowFunctionNetwork.WinterFlowArrayNetwork;
        winterFlowFunctionNetwork = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                winterFlowFunctionNetwork = new WinterFlowFunctionNetwork(split[0], split[1]);
            }
        }
        return winterFlowFunctionNetwork;
    }
}
