package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import b.C0512b;
import java.util.concurrent.atomic.AtomicBoolean;
import p.AbstractC4820f;
import p.AbstractServiceConnectionC4825k;
import p.C4824j;

/* renamed from: com.google.android.gms.internal.ads.va, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4077va extends AbstractServiceConnectionC4825k {

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f35462n = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public Context f35463u;

    /* renamed from: v, reason: collision with root package name */
    public C3230fo f35464v;

    /* renamed from: w, reason: collision with root package name */
    public S0.i f35465w;

    /* renamed from: x, reason: collision with root package name */
    public C4824j f35466x;

    @Override // p.AbstractServiceConnectionC4825k
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4820f abstractC4820f) {
        this.f35466x = (C4824j) abstractC4820f;
        try {
            ((C0512b) abstractC4820f.f39797a).K0();
        } catch (RemoteException unused) {
        }
        this.f35465w = abstractC4820f.c(new C4023ua(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f35466x = null;
        this.f35465w = null;
    }
}
