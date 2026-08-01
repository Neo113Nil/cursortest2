package h;

import Z.AbstractC0059g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class y extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0059g f3241a;

    public y(AbstractC0059g abstractC0059g) {
        this.f3241a = abstractC0059g;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f3241a.i();
    }
}
