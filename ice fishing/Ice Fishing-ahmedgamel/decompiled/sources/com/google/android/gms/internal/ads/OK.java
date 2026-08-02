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
    public static MessageDigest f27379u;

    /* renamed from: n, reason: collision with root package name */
    public Object f27380n;

    public OK(int i) {
        switch (i) {
            case 6:
                this.f27380n = new U7();
                break;
            default:
                this.f27380n = new Object();
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

    public abstract void D1(AbstractC4286zK abstractC4286zK);

    public abstract void E1(byte b9);

    public abstract AbstractC3627n8 F1();

    public abstract void H1(int i);

    public synchronized void I1(Object obj, Executor executor) {
        ((HashMap) this.f27380n).put(obj, executor);
    }

    public abstract void J1(int i);

    public abstract int K1();

    public abstract void L1(int i);

    public synchronized void M1(InterfaceC3765pl interfaceC3765pl) {
        for (Map.Entry entry : ((HashMap) this.f27380n).entrySet()) {
            ((Executor) entry.getValue()).execute(new RunnableC3996u0(21, interfaceC3765pl, entry.getKey()));
        }
    }

    public abstract void N1(long j6);

    public abstract void O1(long j6);

    public abstract void P1(String str);

    public abstract void U(byte[] bArr, int i, int i4);

    public abstract boolean W(long j6, Object obj);

    public MessageDigest X() {
        synchronized (this.f27380n) {
            MessageDigest messageDigest = f27379u;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f27379u = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f27379u;
        }
    }

    public abstract void Y(int i, int i4);

    public abstract void Z(Object obj, long j6, boolean z6);

    public abstract float a0(long j6, Object obj);

    public abstract void b0(int i, int i4);

    public abstract void c0(int i, long j6);

    public abstract void e0(int i, int i4);

    public abstract void f0(Object obj, long j6, float f2);

    public void k0() {
        if (o0() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (o0() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void l();

    public abstract int o0();

    public abstract double o1(long j6, Object obj);

    public abstract void p1(int i, int i4);

    public abstract void q1(int i, long j6);

    public abstract void s1(Object obj, long j6, double d9);

    public abstract void t1(int i, long j6);

    public abstract int u1();

    public abstract void v1(int i, boolean z6);

    public abstract int w1();

    public abstract void x1(int i, String str);

    public abstract void y1(int i, JK jk);

    public abstract void z1(JK jk);

    public OK(View view) {
        this.f27380n = new WeakReference(view);
    }

    public OK(Set set) {
        this.f27380n = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C2528Cl c2528Cl = (C2528Cl) it.next();
                synchronized (this) {
                    I1(c2528Cl.f24948a, c2528Cl.f24949b);
                }
            }
        }
    }
}
