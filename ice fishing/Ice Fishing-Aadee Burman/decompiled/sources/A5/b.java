package A5;

import com.onesignal.common.events.d;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public interface b extends d {
    boolean getCanRequestPermission();

    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Object prompt(boolean z3, InterfaceC5267d interfaceC5267d);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
