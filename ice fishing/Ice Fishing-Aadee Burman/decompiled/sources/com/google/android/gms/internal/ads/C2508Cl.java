package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.Cl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2508Cl extends OK implements InterfaceC3927t8 {

    /* renamed from: v, reason: collision with root package name */
    public final WeakHashMap f24213v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f24214w;

    /* renamed from: x, reason: collision with root package name */
    public final St f24215x;

    public C2508Cl(Context context, Set set, St st) {
        super(set);
        this.f24213v = new WeakHashMap(1);
        this.f24214w = context;
        this.f24215x = st;
    }

    public final synchronized void Q1(View view) {
        try {
            WeakHashMap weakHashMap = this.f24213v;
            ViewOnAttachStateChangeListenerC3981u8 viewOnAttachStateChangeListenerC3981u8 = (ViewOnAttachStateChangeListenerC3981u8) weakHashMap.get(view);
            if (viewOnAttachStateChangeListenerC3981u8 == null) {
                ViewOnAttachStateChangeListenerC3981u8 viewOnAttachStateChangeListenerC3981u82 = new ViewOnAttachStateChangeListenerC3981u8(this.f24214w, view);
                viewOnAttachStateChangeListenerC3981u82.f34491E.add(this);
                viewOnAttachStateChangeListenerC3981u82.d(3);
                weakHashMap.put(view, viewOnAttachStateChangeListenerC3981u82);
                viewOnAttachStateChangeListenerC3981u8 = viewOnAttachStateChangeListenerC3981u82;
            }
            if (this.f24215x.f27604X) {
                C3301ha c3301ha = AbstractC3569ma.f32160W1;
                q2.r rVar = q2.r.f40204e;
                if (((Boolean) rVar.f40207c.a(c3301ha)).booleanValue()) {
                    long longValue = ((Long) rVar.f40207c.a(AbstractC3569ma.f32151V1)).longValue();
                    N1.l lVar = viewOnAttachStateChangeListenerC3981u8.f34488B;
                    synchronized (lVar.f1926v) {
                        lVar.f1924n = longValue;
                    }
                    return;
                }
            }
            N1.l lVar2 = viewOnAttachStateChangeListenerC3981u8.f34488B;
            long j6 = ViewOnAttachStateChangeListenerC3981u8.f34486H;
            synchronized (lVar2.f1926v) {
                lVar2.f1924n = j6;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3927t8
    public final synchronized void f(C3873s8 c3873s8) {
        M1(new Ux(20, c3873s8));
    }
}
