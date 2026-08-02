package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class Ea {
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
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC0603rc enumC0603rc2 = EnumC0603rc.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC0603rc enumC0603rc3 = EnumC0603rc.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC0603rc enumC0603rc4 = EnumC0603rc.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0603rc enumC0603rc5 = EnumC0603rc.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0603rc enumC0603rc6 = EnumC0603rc.EVENT_TYPE_ANR;
        a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0603rc enumC0603rc7 = EnumC0603rc.EVENT_TYPE_UNDEFINED;
        EnumC0603rc enumC0603rc8 = EnumC0603rc.EVENT_TYPE_PURGE_BUFFER;
        EnumC0603rc enumC0603rc9 = EnumC0603rc.EVENT_TYPE_SEND_REFERRER;
        EnumC0603rc enumC0603rc10 = EnumC0603rc.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0603rc enumC0603rc11 = EnumC0603rc.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0603rc enumC0603rc12 = EnumC0603rc.EVENT_TYPE_ACTIVATION;
        EnumC0603rc enumC0603rc13 = EnumC0603rc.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0603rc enumC0603rc14 = EnumC0603rc.EVENT_TYPE_SET_SESSION_EXTRA;
        b = EnumSet.of(enumC0603rc7, enumC0603rc8, enumC0603rc9, enumC0603rc10, enumC0603rc11, enumC0603rc12, enumC0603rc13, enumC0603rc5, enumC0603rc14);
        EnumC0603rc enumC0603rc15 = EnumC0603rc.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0603rc enumC0603rc16 = EnumC0603rc.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        c = EnumSet.of(enumC0603rc15, enumC0603rc4, enumC0603rc5, enumC0603rc13, enumC0603rc16);
        EnumC0603rc enumC0603rc17 = EnumC0603rc.EVENT_TYPE_REGULAR;
        d = EnumSet.of(enumC0603rc4, enumC0603rc5, enumC0603rc3, enumC0603rc, enumC0603rc2, enumC0603rc16, enumC0603rc13, enumC0603rc17, EnumC0603rc.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0603rc.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0603rc.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0603rc.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0603rc8, EnumC0603rc.EVENT_TYPE_INIT, EnumC0603rc.EVENT_TYPE_SEND_USER_PROFILE, EnumC0603rc.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0603rc9, enumC0603rc10, enumC0603rc11, EnumC0603rc.EVENT_TYPE_FIRST_ACTIVATION, EnumC0603rc.EVENT_TYPE_START, EnumC0603rc.EVENT_TYPE_APP_OPEN, EnumC0603rc.EVENT_TYPE_APP_UPDATE, enumC0603rc6);
        e = EnumSet.of(enumC0603rc17);
        f = EnumSet.of(enumC0603rc17);
        g = EnumSet.of(enumC0603rc13);
        h = EnumSet.of(EnumC0603rc.EVENT_TYPE_ALIVE, enumC0603rc8, enumC0603rc14, enumC0603rc5, enumC0603rc13);
        i = Arrays.asList(0, 6145, 4097, 8224);
        j = Arrays.asList(12290);
    }
}
