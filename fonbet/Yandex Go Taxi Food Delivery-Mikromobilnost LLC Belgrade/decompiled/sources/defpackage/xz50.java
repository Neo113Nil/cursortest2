package defpackage;

import com.squareup.moshi.Types;
import com.ybsdk.rconfig.CommonExperiment;
import com.ybsdk.rconfig.ExperimentApplyType;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.NetworkCodeRangeData;
import com.ybsdk.rconfig.configs.NetworkCooldownEnabledData;
import com.ybsdk.rconfig.configs.NetworkCooldownPolicyData;
import com.ybsdk.rconfig.configs.NetworkRetryBudgetData;
import com.ybsdk.rconfig.configs.NetworkRetryConditionData;
import com.ybsdk.rconfig.configs.NetworkRetryConfigData;
import com.ybsdk.rconfig.configs.NetworkRetryConfigSettingData;
import com.ybsdk.rconfig.configs.NetworkRetryEnabledData;
import com.ybsdk.rconfig.configs.NetworkRetryPolicyData;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.time.DurationUnit;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes9.dex */
public abstract class xz50 {
    public static final dfr a;

    static {
        ParameterizedType newParameterizedType = Types.newParameterizedType(CommonExperiment.class, NetworkRetryConfigData.class);
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long e = e3n.e(kp50.U(1000, durationUnit));
        DurationUnit durationUnit2 = DurationUnit.SECONDS;
        NetworkRetryPolicyData networkRetryPolicyData = new NetworkRetryPolicyData(2.0d, e, e3n.e(kp50.U(15, durationUnit2)), e3n.e(kp50.U(15, durationUnit2)), e3n.e(kp50.U(10, durationUnit2)));
        NetworkCooldownPolicyData networkCooldownPolicyData = new NetworkCooldownPolicyData(e3n.e(kp50.U(10000, durationUnit)), e3n.e(kp50.U(20000, durationUnit)));
        NetworkRetryBudgetData networkRetryBudgetData = new NetworkRetryBudgetData(false, 2.0d, 5.0d, 0.1d);
        Integer valueOf = Integer.valueOf(NetworkRequestException.TOO_MANY_REQUESTS);
        d6w d6wVar = uuu.a;
        a = new dfr("yb_mobile_network_retry_config", newParameterizedType, new CommonExperiment(new NetworkRetryConfigData(networkRetryPolicyData, networkCooldownPolicyData, networkRetryBudgetData, Collections.singletonList(new NetworkRetryConfigSettingData(new NetworkRetryConditionData(valueOf, new NetworkCodeRangeData(d6wVar.a, d6wVar.b)), new NetworkRetryEnabledData(true), new NetworkCooldownEnabledData(false)))), ExperimentApplyType.LATEST));
    }

    public static final k1k0 a(b bVar) {
        NetworkRetryConfigData networkRetryConfigData = (NetworkRetryConfigData) bVar.d(a).getData();
        List<NetworkRetryConfigSettingData> settings = networkRetryConfigData.getSettings();
        ArrayList arrayList = new ArrayList();
        for (Object obj : settings) {
            if (((NetworkRetryConfigSettingData) obj).getRetry().isEnabled()) {
                arrayList.add(obj);
            }
        }
        List<NetworkRetryConfigSettingData> settings2 = networkRetryConfigData.getSettings();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : settings2) {
            if (((NetworkRetryConfigSettingData) obj2).getCooldown().isEnabled()) {
                arrayList2.add(obj2);
            }
        }
        o430 o430Var = e3n.b;
        long timeoutMs = networkRetryConfigData.getRetryPolicy().getTimeoutMs();
        DurationUnit durationUnit = DurationUnit.MILLISECONDS;
        long V = kp50.V(timeoutMs, durationUnit);
        long V2 = kp50.V(networkRetryConfigData.getRetryPolicy().getDelayMarginMs(), durationUnit);
        qi4 qi4Var = new qi4(kp50.V(networkRetryConfigData.getRetryPolicy().getBaseMs(), durationUnit), networkRetryConfigData.getRetryPolicy().getFactor(), kp50.V(networkRetryConfigData.getRetryPolicy().getCapMs(), durationUnit), new khs());
        vz50 vz50Var = new vz50();
        ArrayList arrayList3 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new wz50(0, (NetworkRetryConfigSettingData) it.next()));
        }
        ListBuilder a2 = rcc.a();
        a2.add(vz50Var);
        a2.addAll(arrayList3);
        wz50 wz50Var = new wz50(1, a2.j());
        NetworkCooldownPolicyData cooldownPolicy = networkRetryConfigData.getCooldownPolicy();
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            NetworkRetryConfigSettingData networkRetryConfigSettingData = (NetworkRetryConfigSettingData) it2.next();
            Integer code = networkRetryConfigSettingData.getCondition().getCode();
            NetworkCodeRangeData codeRange = networkRetryConfigSettingData.getCondition().getCodeRange();
            Integer num = null;
            Integer valueOf = codeRange != null ? Integer.valueOf(codeRange.getLowerBound()) : null;
            NetworkCodeRangeData codeRange2 = networkRetryConfigSettingData.getCondition().getCodeRange();
            if (codeRange2 != null) {
                num = Integer.valueOf(codeRange2.getUpperBound());
            }
            arrayList4.add(new sne(new rne(code, valueOf, num), cooldownPolicy.getMinCooldownMs(), cooldownPolicy.getMaxCooldownMs()));
        }
        return new k1k0(V, qi4Var, wz50Var, V2, arrayList4);
    }
}
