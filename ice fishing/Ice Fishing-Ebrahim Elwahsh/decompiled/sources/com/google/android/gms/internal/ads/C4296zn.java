package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4296zn extends k2.u {

    /* renamed from: b, reason: collision with root package name */
    public final C3917sm f35605b;

    public C4296zn(C3917sm c3917sm) {
        this.f35605b = c3917sm;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // k2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoEnd() {
        q2.C0 q6;
        q2.A0 r9 = this.f35605b.r();
        if (r9 != null) {
            try {
                q6 = r9.q();
            } catch (RemoteException unused) {
            }
            if (q6 != null) {
                return;
            }
            try {
                q6.g();
                return;
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.g("Unable to call onVideoEnd()", e6);
                return;
            }
        }
        q6 = null;
        if (q6 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // k2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoPause() {
        q2.C0 q6;
        q2.A0 r9 = this.f35605b.r();
        if (r9 != null) {
            try {
                q6 = r9.q();
            } catch (RemoteException unused) {
            }
            if (q6 != null) {
                return;
            }
            try {
                q6.e();
                return;
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.g("Unable to call onVideoEnd()", e6);
                return;
            }
        }
        q6 = null;
        if (q6 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // k2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onVideoStart() {
        q2.C0 q6;
        q2.A0 r9 = this.f35605b.r();
        if (r9 != null) {
            try {
                q6 = r9.q();
            } catch (RemoteException unused) {
            }
            if (q6 != null) {
                return;
            }
            try {
                q6.c();
                return;
            } catch (RemoteException e6) {
                int i = t2.C.f40822b;
                u2.i.g("Unable to call onVideoEnd()", e6);
                return;
            }
        }
        q6 = null;
        if (q6 != null) {
        }
    }
}
