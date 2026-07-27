package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import b.C0518b;
import java.lang.ref.WeakReference;
import p.AbstractC4846f;
import p.AbstractServiceConnectionC4851k;
import p.C4850j;

/* loaded from: classes2.dex */
public final class CN extends AbstractServiceConnectionC4851k {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f24166n;

    public CN(C3905sa c3905sa) {
        this.f24166n = new WeakReference(c3905sa);
    }

    @Override // p.AbstractServiceConnectionC4851k
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4846f abstractC4846f) {
        C3905sa c3905sa = (C3905sa) this.f24166n.get();
        if (c3905sa != null) {
            c3905sa.f34247b = (C4850j) abstractC4846f;
            try {
                ((C0518b) abstractC4846f.f39754a).N0();
            } catch (RemoteException unused) {
            }
            S0.i iVar = c3905sa.f34249d;
            if (iVar != null) {
                C3905sa c3905sa2 = (C3905sa) iVar.f2901u;
                C4850j c4850j = c3905sa2.f34247b;
                if (c4850j == null) {
                    c3905sa2.f34246a = null;
                } else if (c3905sa2.f34246a == null) {
                    c3905sa2.f34246a = c4850j.c(null);
                }
                com.bumptech.glide.manager.n nVar = new com.bumptech.glide.manager.n(c3905sa2.f34246a);
                t2.G.z(nVar, (Bundle) iVar.f2902v);
                S0.l b9 = nVar.b();
                Context context = (Context) iVar.f2903w;
                ((Intent) b9.f2910u).setPackage(XC.c(context));
                b9.q(context, (Uri) iVar.f2904x);
                Activity activity = (Activity) context;
                CN cn = c3905sa2.f34248c;
                if (cn == null) {
                    return;
                }
                activity.unbindService(cn);
                c3905sa2.f34247b = null;
                c3905sa2.f34246a = null;
                c3905sa2.f34248c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3905sa c3905sa = (C3905sa) this.f24166n.get();
        if (c3905sa != null) {
            c3905sa.f34247b = null;
            c3905sa.f34246a = null;
        }
    }
}
