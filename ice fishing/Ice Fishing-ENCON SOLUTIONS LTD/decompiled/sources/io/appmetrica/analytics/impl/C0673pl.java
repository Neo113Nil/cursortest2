package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;

@DoNotInline
@TargetApi(C0376e9.f5887I)
/* renamed from: io.appmetrica.analytics.impl.pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0673pl {

    /* renamed from: a, reason: collision with root package name */
    public static final C0673pl f6753a = new C0673pl();

    private C0673pl() {
    }

    public static final Integer a(SubscriptionInfo subscriptionInfo) {
        String mccString;
        mccString = subscriptionInfo.getMccString();
        return ParseUtils.intValueOf(mccString);
    }

    public static final Integer b(SubscriptionInfo subscriptionInfo) {
        String mncString;
        mncString = subscriptionInfo.getMncString();
        return ParseUtils.intValueOf(mncString);
    }
}
