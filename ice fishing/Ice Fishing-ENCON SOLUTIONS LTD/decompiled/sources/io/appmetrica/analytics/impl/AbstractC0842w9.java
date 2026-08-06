package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.w9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0842w9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f7096a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumSet f7097b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumSet f7098c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumSet f7099d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumSet f7100e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumSet f7101f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumSet f7102g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumSet f7103h;

    /* renamed from: i, reason: collision with root package name */
    public static final List f7104i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f7105j;

    static {
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC0301bb enumC0301bb2 = EnumC0301bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC0301bb enumC0301bb3 = EnumC0301bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC0301bb enumC0301bb4 = EnumC0301bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0301bb enumC0301bb5 = EnumC0301bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC0301bb enumC0301bb6 = EnumC0301bb.EVENT_TYPE_ANR;
        f7096a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC0301bb enumC0301bb7 = EnumC0301bb.EVENT_TYPE_UNDEFINED;
        EnumC0301bb enumC0301bb8 = EnumC0301bb.EVENT_TYPE_PURGE_BUFFER;
        EnumC0301bb enumC0301bb9 = EnumC0301bb.EVENT_TYPE_SEND_REFERRER;
        EnumC0301bb enumC0301bb10 = EnumC0301bb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC0301bb enumC0301bb11 = EnumC0301bb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC0301bb enumC0301bb12 = EnumC0301bb.EVENT_TYPE_ACTIVATION;
        EnumC0301bb enumC0301bb13 = EnumC0301bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC0301bb enumC0301bb14 = EnumC0301bb.EVENT_TYPE_SET_SESSION_EXTRA;
        f7097b = EnumSet.of(enumC0301bb7, enumC0301bb8, enumC0301bb9, enumC0301bb10, enumC0301bb11, enumC0301bb12, enumC0301bb13, enumC0301bb5, enumC0301bb14);
        EnumC0301bb enumC0301bb15 = EnumC0301bb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC0301bb enumC0301bb16 = EnumC0301bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f7098c = EnumSet.of(enumC0301bb15, enumC0301bb4, enumC0301bb5, enumC0301bb13, enumC0301bb16);
        EnumC0301bb enumC0301bb17 = EnumC0301bb.EVENT_TYPE_REGULAR;
        f7099d = EnumSet.of(enumC0301bb4, enumC0301bb5, enumC0301bb3, enumC0301bb, enumC0301bb2, enumC0301bb16, enumC0301bb13, enumC0301bb17, EnumC0301bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC0301bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC0301bb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC0301bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC0301bb8, EnumC0301bb.EVENT_TYPE_INIT, EnumC0301bb.EVENT_TYPE_SEND_USER_PROFILE, EnumC0301bb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC0301bb9, enumC0301bb10, enumC0301bb11, EnumC0301bb.EVENT_TYPE_FIRST_ACTIVATION, EnumC0301bb.EVENT_TYPE_START, EnumC0301bb.EVENT_TYPE_APP_OPEN, EnumC0301bb.EVENT_TYPE_APP_UPDATE, enumC0301bb6);
        f7100e = EnumSet.of(enumC0301bb17);
        f7101f = EnumSet.of(enumC0301bb17);
        f7102g = EnumSet.of(enumC0301bb13);
        f7103h = EnumSet.of(EnumC0301bb.EVENT_TYPE_ALIVE, enumC0301bb8, enumC0301bb14, enumC0301bb5, enumC0301bb13);
        f7104i = Arrays.asList(0, 6145, 4097, 8224);
        f7105j = Arrays.asList(12290);
    }
}
