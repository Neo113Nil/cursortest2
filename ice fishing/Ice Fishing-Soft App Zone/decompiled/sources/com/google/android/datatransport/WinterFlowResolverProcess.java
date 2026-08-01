package com.google.android.datatransport;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverProcess {
    public final /* synthetic */ ComponentActivity WinterFlowRouterRouter;
    public final LinkedHashMap WinterFlowRouterStructure = new LinkedHashMap();
    public final LinkedHashMap WinterFlowHookDataSource = new LinkedHashMap();
    public final LinkedHashMap WinterFlowCacheManagerAgent = new LinkedHashMap();
    public final ArrayList WinterFlowArrayNetwork = new ArrayList();
    public final transient LinkedHashMap WinterFlowVariableVersionControl = new LinkedHashMap();
    public final LinkedHashMap WinterFlowTransactionManagerStrategy = new LinkedHashMap();
    public final Bundle WinterFlowUnitTestResponse = new Bundle();

    public WinterFlowResolverProcess(ComponentActivity componentActivity) {
        this.WinterFlowRouterRouter = componentActivity;
    }

    public final void WinterFlowArrayNetwork(String str) {
        Integer num;
        str.getClass();
        if (!this.WinterFlowArrayNetwork.contains(str) && (num = (Integer) this.WinterFlowHookDataSource.remove(str)) != null) {
            this.WinterFlowRouterStructure.remove(num);
        }
        this.WinterFlowVariableVersionControl.remove(str);
        LinkedHashMap linkedHashMap = this.WinterFlowTransactionManagerStrategy;
        if (linkedHashMap.containsKey(str)) {
            Objects.toString(linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.WinterFlowUnitTestResponse;
        if (bundle.containsKey(str)) {
            Objects.toString((WinterFlowScriptVersion) WinterFlowServerManager.WinterFlowBatchUI(bundle, str));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.WinterFlowCacheManagerAgent;
        WinterFlowQueueEntity winterFlowQueueEntity = (WinterFlowQueueEntity) linkedHashMap2.get(str);
        if (winterFlowQueueEntity != null) {
            ArrayList arrayList = winterFlowQueueEntity.WinterFlowHookDataSource;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                winterFlowQueueEntity.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy((WinterFlowNodeProtocol) obj);
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }

    public final void WinterFlowCacheManagerAgent(String str) {
        LinkedHashMap linkedHashMap = this.WinterFlowHookDataSource;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        WinterFlowDeploymentEngine winterFlowDeploymentEngine = new WinterFlowDeploymentEngine(0);
        Iterator it = new WinterFlowConfigurationFrontend(new WinterFlowThreadPoolView(winterFlowDeploymentEngine, new WinterFlowCompilerCloud(27, winterFlowDeploymentEngine), 1)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            Integer valueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.WinterFlowRouterStructure;
            if (!linkedHashMap2.containsKey(valueOf)) {
                int intValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue), str);
                linkedHashMap.put(str, Integer.valueOf(intValue));
                return;
            }
        }
        WinterFlowCompilerMechanism.WinterFlowSyntax("Sequence contains no element matching the predicate.");
    }

    public final void WinterFlowHookDataSource(int i, WinterFlowQuerySyntax winterFlowQuerySyntax, String str) {
        Bundle bundle;
        int i2;
        ComponentActivity componentActivity = this.WinterFlowRouterRouter;
        WinterFlowNodeEngine WinterFlowOrchestrationSubsystem = winterFlowQuerySyntax.WinterFlowOrchestrationSubsystem(componentActivity, str);
        int i3 = 0;
        if (WinterFlowOrchestrationSubsystem != null) {
            new Handler(Looper.getMainLooper()).post(new WinterFlowGatewayHelper(i, i3, this, WinterFlowOrchestrationSubsystem));
            return;
        }
        Intent WinterFlowSyntax = winterFlowQuerySyntax.WinterFlowSyntax(componentActivity, str);
        if (WinterFlowSyntax.getExtras() != null) {
            Bundle extras = WinterFlowSyntax.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                WinterFlowSyntax.setExtrasClassLoader(componentActivity.getClassLoader());
            }
        }
        if (WinterFlowSyntax.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = WinterFlowSyntax.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            WinterFlowSyntax.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (!"androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(WinterFlowSyntax.getAction())) {
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(WinterFlowSyntax.getAction())) {
                componentActivity.startActivityForResult(WinterFlowSyntax, i, bundle2);
                return;
            }
            WinterFlowRouterWebsocket winterFlowRouterWebsocket = (WinterFlowRouterWebsocket) WinterFlowSyntax.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                winterFlowRouterWebsocket.getClass();
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                componentActivity.startIntentSenderForResult(winterFlowRouterWebsocket.WinterFlowVariableVersionControl, i2, winterFlowRouterWebsocket.WinterFlowTransactionManagerStrategy, winterFlowRouterWebsocket.WinterFlowUnitTestResponse, winterFlowRouterWebsocket.WinterFlowRouterRouter, 0, bundle2);
                return;
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new WinterFlowGatewayHelper(i2, 1, this, e));
                return;
            }
        }
        String[] stringArrayExtra = WinterFlowSyntax.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
            if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i4], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i4));
            }
        }
        int size = hashSet.size();
        String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
        if (size > 0) {
            if (size == stringArrayExtra.length) {
                return;
            }
            int i5 = 0;
            while (i3 < stringArrayExtra.length) {
                if (!hashSet.contains(Integer.valueOf(i3))) {
                    strArr[i5] = stringArrayExtra[i3];
                    i5++;
                }
                i3++;
            }
        }
        componentActivity.requestPermissions(stringArrayExtra, i);
    }

    public final boolean WinterFlowRouterStructure(int i, int i2, Intent intent) {
        String str = (String) this.WinterFlowRouterStructure.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        WinterFlowRefactoringAPI winterFlowRefactoringAPI = (WinterFlowRefactoringAPI) this.WinterFlowVariableVersionControl.get(str);
        if ((winterFlowRefactoringAPI != null ? winterFlowRefactoringAPI.WinterFlowRouterStructure : null) != null) {
            ArrayList arrayList = this.WinterFlowArrayNetwork;
            if (arrayList.contains(str)) {
                winterFlowRefactoringAPI.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy(winterFlowRefactoringAPI.WinterFlowHookDataSource.WinterFlowEventEmitterController(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.WinterFlowTransactionManagerStrategy.remove(str);
        this.WinterFlowUnitTestResponse.putParcelable(str, new WinterFlowScriptVersion(intent, i2));
        return true;
    }
}
