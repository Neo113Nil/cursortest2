package t9;

import java.util.Collection;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface a extends com.onesignal.common.events.d {
    boolean evaluateMessageTriggers(com.onesignal.inAppMessages.internal.a aVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    boolean isTriggerOnMessage(com.onesignal.inAppMessages.internal.a aVar, Collection<String> collection);

    boolean messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a aVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
