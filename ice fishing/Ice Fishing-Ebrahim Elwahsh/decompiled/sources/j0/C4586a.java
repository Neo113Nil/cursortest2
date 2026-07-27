package j0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4586a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f38468a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f38469b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38470c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38471d;

    public C4586a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f38468a = intentFilter;
        this.f38469b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f38469b);
        sb.append(" filter=");
        sb.append(this.f38468a);
        if (this.f38471d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
