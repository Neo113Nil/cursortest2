package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import b.C0508b;
import java.util.concurrent.atomic.AtomicBoolean;
import p.AbstractC4816f;
import p.AbstractServiceConnectionC4821k;
import p.C4820j;

/* renamed from: com.google.android.gms.internal.ads.va, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4054va extends AbstractServiceConnectionC4821k {

    /* renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f34705n = new AtomicBoolean(false);

    /* renamed from: u, reason: collision with root package name */
    public Context f34706u;

    /* renamed from: v, reason: collision with root package name */
    public C3153eo f34707v;

    /* renamed from: w, reason: collision with root package name */
    public S0.i f34708w;

    /* renamed from: x, reason: collision with root package name */
    public C4820j f34709x;

    @Override // p.AbstractServiceConnectionC4821k
    public final void onCustomTabsServiceConnected(ComponentName componentName, AbstractC4816f abstractC4816f) {
        this.f34709x = (C4820j) abstractC4816f;
        try {
            ((C0508b) abstractC4816f.f39686a).M0();
        } catch (RemoteException unused) {
        }
        this.f34708w = abstractC4816f.c(new C4000ua(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f34709x = null;
        this.f34708w = null;
    }
}
