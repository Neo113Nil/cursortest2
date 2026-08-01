package com.anythink.basead.exoplayer.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.anythink.basead.exoplayer.k.af;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    c f6435a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6436b;

    /* renamed from: c, reason: collision with root package name */
    private final b f6437c;

    /* renamed from: d, reason: collision with root package name */
    private final BroadcastReceiver f6438d;

    public final class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            c a9 = c.a(intent);
            if (a9.equals(d.this.f6435a)) {
                return;
            }
            d dVar = d.this;
            dVar.f6435a = a9;
            b unused = dVar.f6437c;
        }

        public /* synthetic */ a(d dVar, byte b9) {
            this();
        }
    }

    public interface b {
        void a();
    }

    private d(Context context, b bVar) {
        this.f6436b = (Context) com.anythink.basead.exoplayer.k.a.a(context);
        this.f6437c = (b) com.anythink.basead.exoplayer.k.a.a(bVar);
        this.f6438d = af.f8346a >= 21 ? new a(this, (byte) 0) : null;
    }

    private void b() {
        BroadcastReceiver broadcastReceiver = this.f6438d;
        if (broadcastReceiver != null) {
            this.f6436b.unregisterReceiver(broadcastReceiver);
        }
    }

    private c a() {
        BroadcastReceiver broadcastReceiver = this.f6438d;
        c a9 = c.a(broadcastReceiver == null ? null : this.f6436b.registerReceiver(broadcastReceiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
        this.f6435a = a9;
        return a9;
    }
}
