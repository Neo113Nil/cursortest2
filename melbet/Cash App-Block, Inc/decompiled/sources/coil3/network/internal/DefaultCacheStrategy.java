package coil3.network.internal;

import coil3.network.CacheStrategy;
import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;

/* loaded from: classes3.dex */
public final class DefaultCacheStrategy implements CacheStrategy {
    public static final Set CACHEABLE_STATUS_CODES = ArraysKt___ArraysKt.toSet(new Integer[]{Integer.valueOf(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE), Integer.valueOf(EnumC0170g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE), Integer.valueOf(HttpStatusCode.NOT_FOUND_404), 405, 410, 414, 501});
}
