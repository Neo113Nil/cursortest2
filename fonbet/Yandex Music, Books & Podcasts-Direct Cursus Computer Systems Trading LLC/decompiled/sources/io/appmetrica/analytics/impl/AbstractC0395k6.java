package io.appmetrica.analytics.impl;

import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.k6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0395k6 {
    public static final List a = CollectionUtils.createSortedListWithoutRepetitions(ConnectableDevice.KEY_ID, "session_id", "session_type", "number_in_session", "type", "global_number", "time", "event_description");
}
