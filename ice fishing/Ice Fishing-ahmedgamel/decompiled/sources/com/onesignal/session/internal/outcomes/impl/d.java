package com.onesignal.session.internal.outcomes.impl;

import java.util.List;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(InterfaceC5240d interfaceC5240d);

    Object deleteOldOutcomeEvent(f fVar, InterfaceC5240d interfaceC5240d);

    Object getAllEventsToSend(InterfaceC5240d interfaceC5240d);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<K5.b> list, InterfaceC5240d interfaceC5240d);

    Object saveOutcomeEvent(f fVar, InterfaceC5240d interfaceC5240d);

    Object saveUniqueOutcomeEventParams(f fVar, InterfaceC5240d interfaceC5240d);
}
