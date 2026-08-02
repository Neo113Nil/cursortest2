package com.google.android.gms.internal.mlkit_vision_barcode;

import com.squareup.cash.cdf.customersupport.Channel;
import com.squareup.cash.cdf.customersupport.CustomerSupportContactComplete;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.screens.SupportScreens;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.collections.EmptyList;

/* loaded from: classes7.dex */
public abstract class zzpd {
    public static Boolean shouldIgnorePerformancePoints;

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewAddMoneyWithParams.deepLinkSpecs;
    }

    public static final Channel toChannel(Article.ContactOption contactOption) {
        contactOption.getClass();
        int ordinal = contactOption.ordinal();
        if (ordinal == 0) {
            return Channel.CHAT;
        }
        if (ordinal == 1) {
            return Channel.CALLBACK;
        }
        if (ordinal == 2) {
            return Channel.EMAIL;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void trackComplete(Analytics analytics, SupportScreens.ContactScreens.Data data, boolean z) {
        data.getClass();
        analytics.track(new CustomerSupportContactComplete(toChannel(data.contactOption), data.flowToken, Boolean.valueOf(z), null, null, null), null);
    }
}
