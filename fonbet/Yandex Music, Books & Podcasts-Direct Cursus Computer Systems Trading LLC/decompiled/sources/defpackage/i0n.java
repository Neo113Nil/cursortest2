package defpackage;

import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public abstract class i0n {
    public static final LinkedHashMap a;

    static {
        Pair[] pairArr = {new Pair(bfb.UNKNOWN_ERR, new o2(26)), new Pair(bfb.ABORT_ERR, new o2(0)), new Pair(bfb.ATTESTATION_NOT_PRIVATE_ERR, new o2(16)), new Pair(bfb.CONSTRAINT_ERR, new o2(1)), new Pair(bfb.DATA_ERR, new o2(3)), new Pair(bfb.INVALID_STATE_ERR, new o2(10)), new Pair(bfb.ENCODING_ERR, new o2(4)), new Pair(bfb.NETWORK_ERR, new o2(12)), new Pair(bfb.NOT_ALLOWED_ERR, new o2(14)), new Pair(bfb.NOT_SUPPORTED_ERR, new o2(17)), new Pair(bfb.SECURITY_ERR, new o2(22)), new Pair(bfb.TIMEOUT_ERR, new o2(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(12));
        uah.k(linkedHashMap, pairArr);
        a = linkedHashMap;
    }
}
