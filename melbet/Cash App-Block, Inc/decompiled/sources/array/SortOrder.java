package array;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class SortOrder {

    public final class Unknown extends SortOrder {
        public static final Unknown INSTANCE$1 = new Unknown();
        public static final Unknown INSTANCE$2 = new Unknown();
        public static final Unknown INSTANCE = new Unknown();
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFavorites.deepLinkSpecs;
    }
}
