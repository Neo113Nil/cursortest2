package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import ru.cprocsp.ACSPTLSProxy.tools.Constants;

/* loaded from: classes9.dex */
public abstract class La {
    public static final Set a;
    public static final EnumSet b;
    public static final EnumSet c;
    public static final EnumSet d;
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public static final EnumSet h;
    public static final List i;
    public static final List j;

    static {
        Hc hc = Hc.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        Hc hc2 = Hc.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        Hc hc3 = Hc.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        Hc hc4 = Hc.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        Hc hc5 = Hc.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        Hc hc6 = Hc.EVENT_TYPE_ANR;
        a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        Hc hc7 = Hc.EVENT_TYPE_UNDEFINED;
        Hc hc8 = Hc.EVENT_TYPE_PURGE_BUFFER;
        Hc hc9 = Hc.EVENT_TYPE_SEND_REFERRER;
        Hc hc10 = Hc.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Hc hc11 = Hc.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Hc hc12 = Hc.EVENT_TYPE_ACTIVATION;
        Hc hc13 = Hc.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        Hc hc14 = Hc.EVENT_TYPE_SET_SESSION_EXTRA;
        b = EnumSet.of(hc7, hc8, hc9, hc10, hc11, hc12, hc13, hc5, hc14);
        Hc hc15 = Hc.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        Hc hc16 = Hc.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        c = EnumSet.of(hc15, hc4, hc5, hc13, hc16);
        Hc hc17 = Hc.EVENT_TYPE_REGULAR;
        d = EnumSet.of(hc4, hc5, hc3, hc, hc2, hc16, hc13, hc17, Hc.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, Hc.EVENT_TYPE_SEND_ECOMMERCE_EVENT, Hc.EVENT_TYPE_SEND_REVENUE_EVENT, Hc.EVENT_TYPE_SEND_AD_REVENUE_EVENT, hc8, Hc.EVENT_TYPE_INIT, Hc.EVENT_TYPE_SEND_USER_PROFILE, Hc.EVENT_TYPE_SET_USER_PROFILE_ID, hc9, hc10, hc11, Hc.EVENT_TYPE_FIRST_ACTIVATION, Hc.EVENT_TYPE_START, Hc.EVENT_TYPE_APP_OPEN, Hc.EVENT_TYPE_APP_UPDATE, hc6);
        e = EnumSet.of(hc17);
        f = EnumSet.of(hc17);
        g = EnumSet.of(hc13);
        h = EnumSet.of(Hc.EVENT_TYPE_ALIVE, hc8, hc14, hc5, hc13);
        i = Arrays.asList(0, 6145, Integer.valueOf(Constants.INTENT_ADDRESS_ID), 8224);
        j = Arrays.asList(12290);
    }
}
