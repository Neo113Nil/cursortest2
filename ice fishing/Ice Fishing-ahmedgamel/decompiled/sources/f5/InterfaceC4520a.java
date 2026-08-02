package f5;

import android.location.Location;
import com.onesignal.common.events.d;
import z7.InterfaceC5240d;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC4520a extends d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Location getLastLocation();

    Object start(InterfaceC5240d interfaceC5240d);

    Object stop(InterfaceC5240d interfaceC5240d);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
