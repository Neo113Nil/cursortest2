package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0512b;
import java.lang.ref.WeakReference;
import p.AbstractC4820f;
import p.AbstractServiceConnectionC4825k;
import p.C4824j;

/* renamed from: com.google.android.gms.internal.ads.oN, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3696oN extends AbstractServiceConnectionC4825k {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f33683n;

    public C3696oN(C4131wa c4131wa) {
        this.f33683n = new WeakReference(c4131wa);
    }

    @Override // p.AbstractServiceConnectionC4825k
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4820f abstractC4820f) {
        C4131wa c4131wa = (C4131wa) this.f33683n.get();
        if (c4131wa != null) {
            c4131wa.f35616b = (C4824j) abstractC4820f;
            try {
                ((C0512b) abstractC4820f.f39797a).K0();
            } catch (RemoteException unused) {
            }
            l4.q qVar = c4131wa.f35618d;
            if (qVar != null) {
                C4131wa c4131wa2 = (C4131wa) qVar.f38945n;
                C4824j c4824j = c4131wa2.f35616b;
                if (c4824j == null) {
                    c4131wa2.f35615a = null;
                } else if (c4131wa2.f35615a == null) {
                    c4131wa2.f35615a = c4824j.c(null);
                }
                com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n(c4131wa2.f35615a);
                w2.D.z(nVar, (Bundle) qVar.f38946u);
                LP b9 = nVar.b();
                Context context = (Context) qVar.f38947v;
                ((Intent) b9.f26916u).setPackage(AbstractC4117wD.a(context));
                b9.i(context, (Uri) qVar.f38948w);
                Activity activity = (Activity) context;
                C3696oN c3696oN = c4131wa2.f35617c;
                if (c3696oN == null) {
                    return;
                }
                activity.unbindService(c3696oN);
                c4131wa2.f35616b = null;
                c4131wa2.f35615a = null;
                c4131wa2.f35617c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C4131wa c4131wa = (C4131wa) this.f33683n.get();
        if (c4131wa != null) {
            c4131wa.f35616b = null;
            c4131wa.f35615a = null;
        }
    }
}
