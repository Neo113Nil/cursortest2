package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Rn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2764Rn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27422a = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(String str, C3656nu c3656nu) {
        C3334hu c3334hu;
        C2754Rd K8;
        if (this.f27422a.containsKey(str)) {
            return;
        }
        C2754Rd c2754Rd = null;
        if (c3656nu != null) {
            try {
                K8 = c3656nu.f33064a.K();
                if (c3656nu != null) {
                    try {
                        c2754Rd = c3656nu.f33064a.n0();
                    } finally {
                        try {
                        } catch (C3334hu unused) {
                        }
                    }
                }
                boolean z8 = true;
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ha)).booleanValue()) {
                    if (c3656nu != null) {
                        try {
                            c3656nu.a();
                        } catch (C3334hu unused2) {
                        }
                    }
                    z8 = false;
                }
                this.f27422a.put(str, new C2747Qn(str, K8, c2754Rd, z8));
            } finally {
                try {
                } catch (C3334hu unused3) {
                }
            }
        }
        K8 = null;
        if (c3656nu != null) {
        }
        boolean z82 = true;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Ha)).booleanValue()) {
        }
        this.f27422a.put(str, new C2747Qn(str, K8, c2754Rd, z82));
    }

    public final synchronized C2747Qn b(String str) {
        return (C2747Qn) this.f27422a.get(str);
    }
}
