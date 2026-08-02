package com.netcetera.threeds.sdk.infrastructure;

import android.util.Range;
import com.plaid.internal.EnumC0170g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;

/* loaded from: classes5.dex */
public class setRendererPriorityPolicy {
    private static int cleanup = 0;
    private static int getSDKVersion = 1;
    public static final Range<Integer> initialize = Range.create(200, Integer.valueOf(EnumC0170g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE));
    public static final Integer getWarnings = Integer.valueOf(EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
    public static final Integer ThreeDS2Service = Integer.valueOf(HttpStatusCode.UNAUTHORIZED_401);
    public static final Integer ThreeDS2ServiceInstance = 403;
    public static final Range<Integer> get = Range.create(500, 599);

    static {
        int i = cleanup;
        getSDKVersion = ((i ^ 11) + ((i & 11) << 1)) % 128;
    }
}
