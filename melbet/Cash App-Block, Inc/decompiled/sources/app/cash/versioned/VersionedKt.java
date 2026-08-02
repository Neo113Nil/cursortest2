package app.cash.versioned;

import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class VersionedKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewEquity.deepLinkSpecs;
    }

    public static final Versioned update(Versioned versioned, Object obj) {
        return versioned != null ? new Versioned(obj, versioned.version + 1) : new Versioned(obj, 0);
    }
}
