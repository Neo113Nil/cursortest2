package ua;

import com.onesignal.common.events.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface b extends d {
    boolean getCanRequestPermission();

    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Object prompt(boolean z10, fc.d dVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
