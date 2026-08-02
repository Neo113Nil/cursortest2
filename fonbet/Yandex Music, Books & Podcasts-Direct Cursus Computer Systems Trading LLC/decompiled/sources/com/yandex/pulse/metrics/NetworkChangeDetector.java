package com.yandex.pulse.metrics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.jj4;
import defpackage.jsg;
import defpackage.n7b;
import defpackage.uo7;
import defpackage.v4i;
import defpackage.xav;
import defpackage.zav;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/yandex/pulse/metrics/NetworkChangeDetector;", "Landroid/content/BroadcastReceiver;", "Lxav;", "handlerCallback", "Lxav;", "n7b", "jsg", "v4i", "histograms_release"}, k = 1, mv = {1, 6, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class NetworkChangeDetector extends BroadcastReceiver {
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final v4i b;
    public final zav c;
    public final IntentFilter d;
    public int e;
    public final n7b f;
    public boolean g;
    public final boolean h;

    @Keep
    @NotNull
    private final xav handlerCallback;
    public boolean i;

    public NetworkChangeDetector(Context context, v4i v4iVar) {
        context.getClass();
        this.a = context;
        this.b = v4iVar;
        uo7 uo7Var = new uo7(3, this);
        this.handlerCallback = uo7Var;
        this.c = new zav(uo7Var);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.d = intentFilter;
        this.e = a();
        context.getClass();
        n7b n7bVar = new n7b();
        Object systemService = context.getSystemService("connectivity");
        if (systemService == null) {
            jj4.j("null cannot be cast to non-null type android.net.ConnectivityManager");
            throw null;
        }
        n7bVar.a = (ConnectivityManager) systemService;
        this.f = n7bVar;
        this.h = true;
    }

    public final int a() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.a).getActiveNetworkInfo();
            return (activeNetworkInfo == null ? new jsg(-1, -1, false) : new jsg(activeNetworkInfo.getType(), activeNetworkInfo.getSubtype(), true)).b;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        this.c.sendEmptyMessage(0);
    }
}
