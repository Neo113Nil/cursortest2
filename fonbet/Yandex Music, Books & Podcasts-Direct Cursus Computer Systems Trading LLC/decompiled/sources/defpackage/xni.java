package defpackage;

import android.content.IntentFilter;

/* loaded from: classes4.dex */
public abstract class xni {
    public static final IntentFilter a;
    public static final jyr b;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        a = intentFilter;
        b = btf.b(new u5i(8));
    }
}
