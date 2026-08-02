package defpackage;

import com.yandex.music.shared.network.retrypolicy.api.RetryPolicyDto;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* loaded from: classes4.dex */
public abstract class dk6 {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map a(RetryPolicyDto retryPolicyDto) {
        Set<Map.Entry> entrySet;
        Pair pair;
        List<Long> attempts;
        retryPolicyDto.getClass();
        Map statusCodes = retryPolicyDto.getStatusCodes();
        if (statusCodes == null || (entrySet = statusCodes.entrySet()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            Integer num = (Integer) entry.getKey();
            if (num != null) {
                int intValue = num.intValue();
                RetryPolicyDto.Attempts attempts2 = (RetryPolicyDto.Attempts) entry.getValue();
                if (attempts2 != null && (attempts = attempts2.getAttempts()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Long l : attempts) {
                        ffb ffbVar = l != null ? new ffb(l.longValue()) : null;
                        if (ffbVar != null) {
                            arrayList2.add(ffbVar);
                        }
                    }
                    pair = new Pair(new hgb(intValue), arrayList2);
                    if (pair == null) {
                        arrayList.add(pair);
                    }
                }
            }
            pair = null;
            if (pair == null) {
            }
        }
        return uah.n(arrayList);
    }
}
