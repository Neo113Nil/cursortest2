package io.appmetrica.analytics.blecollecting.impl;

import java.util.Map;
import kotlin.Pair;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;

/* loaded from: classes9.dex */
public final class O {
    public final Map a = kotlin.collections.b.i(new Pair("all_matches", 1), new Pair("first_match", 2), new Pair("match_lost", 3));
    public final Map b = kotlin.collections.b.i(new Pair("aggressive", 1), new Pair("sticky", 2));
    public final Map c = kotlin.collections.b.i(new Pair("one", 1), new Pair("few", 2), new Pair(CspBioProgressConstants.MAX, 3));
    public final Map d = kotlin.collections.b.i(new Pair("low_power", 1), new Pair("balanced", 2), new Pair("low_latency", 3));
}
