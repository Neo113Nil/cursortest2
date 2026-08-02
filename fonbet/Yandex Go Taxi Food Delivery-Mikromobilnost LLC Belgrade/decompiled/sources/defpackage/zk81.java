package defpackage;

import com.monetization.ads.quality.base.model.configuration.AdQualityVerifiableNetwork;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import yads.a7;

/* loaded from: classes7.dex */
public final class zk81 {
    public static void a(jl61 jl61Var) {
        AdQualityVerifiableNetwork adQualityVerifiableNetwork;
        Object obj;
        Map map = jl61Var.h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            cx81 cx81Var = a7.c;
            String str = (String) entry.getKey();
            cx81Var.getClass();
            Iterator<E> it = a7.e.iterator();
            while (true) {
                adQualityVerifiableNetwork = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (jl40.l(((a7) obj).b, str)) {
                    }
                } else {
                    obj = null;
                }
            }
            a7 a7Var = (a7) obj;
            switch (a7Var == null ? -1 : nu81.a[a7Var.ordinal()]) {
                case 1:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.ADMOB;
                    break;
                case 2:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.APPLOVIN;
                    break;
                case 3:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.APPLOVINMAX;
                    break;
                case 4:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.BIGOADS;
                    break;
                case 5:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.CHARTBOOST;
                    break;
                case 6:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.DIGITALTURBINE;
                    break;
                case 7:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.GOOGLE;
                    break;
                case 8:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.INMOBI;
                    break;
                case 9:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.IRONSOURCE;
                    break;
                case 10:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.MINTEGRAL;
                    break;
                case 11:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.MYTARGET;
                    break;
                case 12:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.PANGLE;
                    break;
                case 13:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.TAPJOY;
                    break;
                case 14:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.UNITYADS;
                    break;
                case 15:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.VUNGLE;
                    break;
                case 16:
                    adQualityVerifiableNetwork = AdQualityVerifiableNetwork.YANDEX;
                    break;
            }
            if (adQualityVerifiableNetwork != null) {
                linkedHashMap.put(adQualityVerifiableNetwork, new pe81(((vz61) entry.getValue()).b, ((vz61) entry.getValue()).a));
            }
        }
    }
}
