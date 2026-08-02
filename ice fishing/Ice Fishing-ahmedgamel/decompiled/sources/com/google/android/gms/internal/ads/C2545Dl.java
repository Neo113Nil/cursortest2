package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.Dl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2545Dl extends OK implements InterfaceC3950t8 {

    /* renamed from: v, reason: collision with root package name */
    public final WeakHashMap f25199v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f25200w;

    /* renamed from: x, reason: collision with root package name */
    public final St f25201x;

    public C2545Dl(Context context, Set set, St st) {
        super(set);
        this.f25199v = new WeakHashMap(1);
        this.f25200w = context;
        this.f25201x = st;
    }

    public final synchronized void R1(View view) {
        try {
            WeakHashMap weakHashMap = this.f25199v;
            ViewOnAttachStateChangeListenerC4004u8 viewOnAttachStateChangeListenerC4004u8 = (ViewOnAttachStateChangeListenerC4004u8) weakHashMap.get(view);
            if (viewOnAttachStateChangeListenerC4004u8 == null) {
                ViewOnAttachStateChangeListenerC4004u8 viewOnAttachStateChangeListenerC4004u82 = new ViewOnAttachStateChangeListenerC4004u8(this.f25200w, view);
                viewOnAttachStateChangeListenerC4004u82.f35265E.add(this);
                viewOnAttachStateChangeListenerC4004u82.d(3);
                weakHashMap.put(view, viewOnAttachStateChangeListenerC4004u82);
                viewOnAttachStateChangeListenerC4004u8 = viewOnAttachStateChangeListenerC4004u82;
            }
            if (this.f25201x.f28387X) {
                C3324ha c3324ha = AbstractC3592ma.f32940W1;
                s2.r rVar = s2.r.f40506e;
                if (((Boolean) rVar.f40509c.a(c3324ha)).booleanValue()) {
                    long longValue = ((Long) rVar.f40509c.a(AbstractC3592ma.f32931V1)).longValue();
                    P1.l lVar = viewOnAttachStateChangeListenerC4004u8.f35262B;
                    synchronized (lVar.f2370v) {
                        lVar.f2368n = longValue;
                    }
                    return;
                }
            }
            P1.l lVar2 = viewOnAttachStateChangeListenerC4004u8.f35262B;
            long j6 = ViewOnAttachStateChangeListenerC4004u8.f35260H;
            synchronized (lVar2.f2370v) {
                lVar2.f2368n = j6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final synchronized void f(C3896s8 c3896s8) {
        M1(new Ux(20, c3896s8));
    }
}
