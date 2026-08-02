package j0;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4604a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f38404a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f38405b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f38406c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38407d;

    public C4604a(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f38404a = intentFilter;
        this.f38405b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.f38405b);
        sb.append(" filter=");
        sb.append(this.f38404a);
        if (this.f38407d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
