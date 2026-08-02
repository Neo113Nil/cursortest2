package com.fillr.featuretoggle;

import android.app.Activity;
import com.caverock.androidsvg.SVG;
import com.fillr.featuretoggle.metric.UnleashMetricsSender;
import com.fillr.featuretoggle.strategy.DevKeyStrategy;
import com.google.android.gms.auth.api.zbc;
import com.google.mlkit.vision.text.zza;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import net.oneformapp.PopEncryptorV2_;

/* loaded from: classes4.dex */
public final class DefaultUnleash {
    public static final List BUILTIN_STRATEGIES;
    public static final DevKeyStrategy UNKNOWN_STRATEGY;
    public final UnleashMetricsSender metricService;
    public final HashMap strategyMap;
    public final zbc toggleRepository;

    static {
        DevKeyStrategy devKeyStrategy = new DevKeyStrategy(3);
        DevKeyStrategy devKeyStrategy2 = new DevKeyStrategy(5);
        new Random();
        BUILTIN_STRATEGIES = Arrays.asList(devKeyStrategy, devKeyStrategy2, new DevKeyStrategy(6), new DevKeyStrategy(7), new DevKeyStrategy(8), new DevKeyStrategy(10), new DevKeyStrategy(0), new DevKeyStrategy(1), new DevKeyStrategy(11), new DevKeyStrategy(4), new DevKeyStrategy(2));
        UNKNOWN_STRATEGY = new DevKeyStrategy(9);
    }

    public DefaultUnleash(Activity activity, PopEncryptorV2_ popEncryptorV2_, DevKeyStrategy... devKeyStrategyArr) {
        this.toggleRepository = new zbc(activity, popEncryptorV2_, new SVG(popEncryptorV2_));
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            List list = BUILTIN_STRATEGIES;
            if (i >= list.size()) {
                break;
            }
            hashMap.put(((DevKeyStrategy) list.get(i)).getName(), (DevKeyStrategy) list.get(i));
            i++;
        }
        for (DevKeyStrategy devKeyStrategy : devKeyStrategyArr) {
            hashMap.put(devKeyStrategy.getName(), devKeyStrategy);
        }
        this.strategyMap = hashMap;
        UnleashMetricsSender unleashMetricsSender = new UnleashMetricsSender(popEncryptorV2_, 1);
        this.metricService = unleashMetricsSender;
        hashMap.keySet();
        zza zzaVar = new zza(5);
        unleashMetricsSender.unleashConfig.getClass();
        UnleashMetricsSender unleashMetricsSender2 = (UnleashMetricsSender) unleashMetricsSender.gson;
        if (unleashMetricsSender2.unleashConfig.isInit) {
            return;
        }
        try {
            unleashMetricsSender2.post((URL) unleashMetricsSender2.clientRegistrationURL, zzaVar);
        } catch (UnleashException e) {
            e.getMessage();
        }
    }
}
