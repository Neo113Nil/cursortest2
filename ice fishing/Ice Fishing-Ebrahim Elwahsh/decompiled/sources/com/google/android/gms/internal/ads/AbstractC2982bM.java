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

/* renamed from: com.google.android.gms.internal.ads.bM, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2982bM {

    /* renamed from: u, reason: collision with root package name */
    public static MessageDigest f29482u;

    /* renamed from: n, reason: collision with root package name */
    public final Object f29483n;

    public AbstractC2982bM(int i) {
        switch (i) {
            case 5:
                this.f29483n = new Y7();
                break;
            default:
                this.f29483n = new Object();
                break;
        }
    }

    public abstract void N(Object obj, long j9, byte b9);

    public MessageDigest Q() {
        synchronized (this.f29483n) {
            MessageDigest messageDigest = f29482u;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f29482u = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f29482u;
        }
    }

    public abstract boolean R(long j9, Object obj);

    public abstract void T(int i, long j9);

    public abstract void W(Object obj, long j9, boolean z8);

    public abstract float X(long j9, Object obj);

    public abstract void Y(Object obj, long j9, float f6);

    public abstract double a0(long j9, Object obj);

    public abstract void k();

    public abstract void k1(Object obj, long j9, double d2);

    public abstract byte l1(long j9);

    public abstract int m1();

    public abstract int n1();

    public abstract boolean p1();

    public abstract void q1();

    public abstract AbstractC3832r8 r1();

    public synchronized void s1(Object obj, Executor executor) {
        ((HashMap) this.f29483n).put(obj, executor);
    }

    public abstract int t1();

    public synchronized void u1(InterfaceC3701ol interfaceC3701ol) {
        for (Map.Entry entry : ((HashMap) this.f29483n).entrySet()) {
            ((Executor) entry.getValue()).execute(new MD(21, interfaceC3701ol, entry.getKey()));
        }
    }

    public AbstractC2982bM(View view) {
        this.f29483n = new WeakReference(view);
    }

    public AbstractC2982bM(Set set) {
        this.f29483n = new HashMap();
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                C2473Al c2473Al = (C2473Al) it.next();
                synchronized (this) {
                    s1(c2473Al.f23886a, c2473Al.f23887b);
                }
            }
        }
    }
}
