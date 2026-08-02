package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4306zn extends m2.u {

    /* renamed from: b, reason: collision with root package name */
    public final C4089vm f36219b;

    public C4306zn(C4089vm c4089vm) {
        this.f36219b = c4089vm;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // m2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoEnd() {
        s2.C0 s9;
        s2.A0 r9 = this.f36219b.r();
        if (r9 != null) {
            try {
                s9 = r9.s();
            } catch (RemoteException unused) {
            }
            if (s9 != null) {
                return;
            }
            try {
                s9.g();
                return;
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.g("Unable to call onVideoEnd()", e9);
                return;
            }
        }
        s9 = null;
        if (s9 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // m2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoPause() {
        s2.C0 s9;
        s2.A0 r9 = this.f36219b.r();
        if (r9 != null) {
            try {
                s9 = r9.s();
            } catch (RemoteException unused) {
            }
            if (s9 != null) {
                return;
            }
            try {
                s9.h();
                return;
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.g("Unable to call onVideoEnd()", e9);
                return;
            }
        }
        s9 = null;
        if (s9 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // m2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoStart() {
        s2.C0 s9;
        s2.A0 r9 = this.f36219b.r();
        if (r9 != null) {
            try {
                s9 = r9.s();
            } catch (RemoteException unused) {
            }
            if (s9 != null) {
                return;
            }
            try {
                s9.d();
                return;
            } catch (RemoteException e9) {
                int i = w2.z.f41712b;
                x2.i.g("Unable to call onVideoEnd()", e9);
                return;
            }
        }
        s9 = null;
        if (s9 != null) {
        }
    }
}
