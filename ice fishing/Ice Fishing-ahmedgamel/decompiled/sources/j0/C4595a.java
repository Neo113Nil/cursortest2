package j0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4595a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f38285a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f38286b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38287c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38288d;

    public C4595a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f38285a = intentFilter;
        this.f38286b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f38286b);
        sb.append(" filter=");
        sb.append(this.f38285a);
        if (this.f38288d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
