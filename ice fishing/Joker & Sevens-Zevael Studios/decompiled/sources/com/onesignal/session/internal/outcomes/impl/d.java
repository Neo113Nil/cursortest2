package com.onesignal.session.internal.outcomes.impl;

import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface d {
    Object cleanCachedUniqueOutcomeEventNotifications(fc.d dVar);

    Object deleteOldOutcomeEvent(f fVar, fc.d dVar);

    Object getAllEventsToSend(fc.d dVar);

    Object getNotCachedUniqueInfluencesForOutcome(String str, List<ab.b> list, fc.d dVar);

    Object saveOutcomeEvent(f fVar, fc.d dVar);

    Object saveUniqueOutcomeEventParams(f fVar, fc.d dVar);
}
