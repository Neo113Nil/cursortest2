package defpackage;

import com.yandex.go.beginners.domain.model.BeginnersOnboardingModel$ServiceInfo$IconType;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class zk5 {
    public static BeginnersOnboardingModel$ServiceInfo$IconType a(String str) {
        Object obj;
        String str2;
        Iterator<E> it = BeginnersOnboardingModel$ServiceInfo$IconType.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            str2 = ((BeginnersOnboardingModel$ServiceInfo$IconType) obj).tag;
            if (jl40.l(str2, str)) {
                break;
            }
        }
        BeginnersOnboardingModel$ServiceInfo$IconType beginnersOnboardingModel$ServiceInfo$IconType = (BeginnersOnboardingModel$ServiceInfo$IconType) obj;
        return beginnersOnboardingModel$ServiceInfo$IconType == null ? BeginnersOnboardingModel$ServiceInfo$IconType.Undefined : beginnersOnboardingModel$ServiceInfo$IconType;
    }
}
