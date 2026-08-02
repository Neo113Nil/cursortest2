package com.bumptech.glide.module;

import com.squareup.cash.clientroutes.ClientRoute;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public abstract class AppGlideModule {
    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewLoanRepayUpcomingDeprecated.deepLinkSpecs;
    }
}
