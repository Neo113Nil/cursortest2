package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0508b;
import java.lang.ref.WeakReference;
import p.AbstractC4816f;
import p.AbstractServiceConnectionC4821k;
import p.C4820j;

/* renamed from: com.google.android.gms.internal.ads.oN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3673oN extends AbstractServiceConnectionC4821k {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f32896n;

    public C3673oN(C4108wa c4108wa) {
        this.f32896n = new WeakReference(c4108wa);
    }

    @Override // p.AbstractServiceConnectionC4821k
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4816f abstractC4816f) {
        C4108wa c4108wa = (C4108wa) this.f32896n.get();
        if (c4108wa != null) {
            c4108wa.f34839b = (C4820j) abstractC4816f;
            try {
                ((C0508b) abstractC4816f.f39689a).M0();
            } catch (RemoteException unused) {
            }
            j4.q qVar = c4108wa.f34841d;
            if (qVar != null) {
                C4108wa c4108wa2 = (C4108wa) qVar.f38433n;
                C4820j c4820j = c4108wa2.f34839b;
                if (c4820j == null) {
                    c4108wa2.f34838a = null;
                } else if (c4108wa2.f34838a == null) {
                    c4108wa2.f34838a = c4820j.c(null);
                }
                com.bumptech.glide.manager.o oVar = new com.bumptech.glide.manager.o(c4108wa2.f34838a);
                u2.D.z(oVar, (Bundle) qVar.f38434u);
                m8.i b9 = oVar.b();
                Context context = (Context) qVar.f38435v;
                ((Intent) b9.f39362n).setPackage(AbstractC4094wD.a(context));
                b9.f(context, (Uri) qVar.f38436w);
                Activity activity = (Activity) context;
                C3673oN c3673oN = c4108wa2.f34840c;
                if (c3673oN == null) {
                    return;
                }
                activity.unbindService(c3673oN);
                c4108wa2.f34839b = null;
                c4108wa2.f34838a = null;
                c4108wa2.f34840c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C4108wa c4108wa = (C4108wa) this.f32896n.get();
        if (c4108wa != null) {
            c4108wa.f34839b = null;
            c4108wa.f34838a = null;
        }
    }
}
