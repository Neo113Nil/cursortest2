package coil3.util;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public abstract class IntPair {
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1474constructorimpl(int i, int i2) {
        return (i2 & BodyPartID.bodyIdMax) | (i << 32);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLightningUri.deepLinkSpecs;
    }
}
