package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.yn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4229yn extends k2.u {

    /* renamed from: b, reason: collision with root package name */
    public final C4012um f35221b;

    public C4229yn(C4012um c4012um) {
        this.f35221b = c4012um;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // k2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoEnd() {
        q2.C0 s9;
        q2.A0 r9 = this.f35221b.r();
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
                int i = u2.z.f41319b;
                v2.i.g("Unable to call onVideoEnd()", e9);
                return;
            }
        }
        s9 = null;
        if (s9 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // k2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoPause() {
        q2.C0 s9;
        q2.A0 r9 = this.f35221b.r();
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
                int i = u2.z.f41319b;
                v2.i.g("Unable to call onVideoEnd()", e9);
                return;
            }
        }
        s9 = null;
        if (s9 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // k2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoStart() {
        q2.C0 s9;
        q2.A0 r9 = this.f35221b.r();
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
                int i = u2.z.f41319b;
                v2.i.g("Unable to call onVideoEnd()", e9);
                return;
            }
        }
        s9 = null;
        if (s9 != null) {
        }
    }
}
