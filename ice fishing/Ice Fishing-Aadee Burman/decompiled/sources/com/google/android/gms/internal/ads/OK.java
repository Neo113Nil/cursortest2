package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class OK {

    /* renamed from: u, reason: collision with root package name */
    public static MessageDigest f26597u;

    /* renamed from: n, reason: collision with root package name */
    public Object f26598n;

    public OK(int i) {
        switch (i) {
            case 6:
                this.f26598n = new U7();
                break;
            default:
                this.f26598n = new Object();
                break;
        }
    }

    public static int S(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public static int T(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    public abstract boolean A1();

    public abstract void B1(int i, byte[] bArr);

    public abstract void C1();

    public abstract void D1(AbstractC4263zK abstractC4263zK);

    public abstract void E1(byte b9);

    public abstract AbstractC3604n8 F1();

    public abstract void G1(int i);

    public synchronized void H1(Object obj, Executor executor) {
        ((HashMap) this.f26598n).put(obj, executor);
    }

    public abstract void I1(int i);

    public abstract int J1();

    public abstract void K1(int i);

    public synchronized void M1(InterfaceC3742pl interfaceC3742pl) {
        for (Map.Entry entry : ((HashMap) this.f26598n).entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC3973u0(21, interfaceC3742pl, entry.getKey()));
        }
    }

    public abstract void N1(long j6);

    public abstract void O1(long j6);

    public abstract void P1(String str);

    public abstract void U(byte[] bArr, int i, int i6);

    public abstract boolean W(long j6, Object obj);

    public MessageDigest X() {
        synchronized (this.f26598n) {
            MessageDigest messageDigest = f26597u;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f26597u = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f26597u;
        }
    }

    public abstract void Y(int i, int i6);

    public abstract void Z(Object obj, long j6, boolean z3);

    public abstract float a0(long j6, Object obj);

    public abstract void b0(int i, int i6);

    public abstract void c0(int i, long j6);

    public abstract void e0(int i, int i6);

    public void k0() {
        if (p0() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (p0() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void l();

    public abstract void n1(Object obj, long j6, float f3);

    public abstract double o1(long j6, Object obj);

    public abstract int p0();

    public abstract void p1(int i, int i6);

    public abstract void q1(int i, long j6);

    public abstract void r1(Object obj, long j6, double d2);

    public abstract void s1(int i, long j6);

    public abstract int u1();

    public abstract void v1(int i, boolean z3);

    public abstract int w1();

    public abstract void x1(int i, String str);

    public abstract void y1(int i, JK jk);

    public abstract void z1(JK jk);

    public OK(View view) {
        this.f26598n = new WeakReference(view);
    }

    public OK(Set set) {
        this.f26598n = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C2491Bl c2491Bl = (C2491Bl) it.next();
                synchronized (this) {
                    H1(c2491Bl.f23935a, c2491Bl.f23936b);
                }
            }
        }
    }
}
