package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Pn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2731Pn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f26860a = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(String str, C3535lu c3535lu) {
        C3267gu c3267gu;
        C2804Ud i02;
        if (this.f26860a.containsKey(str)) {
            return;
        }
        C2804Ud c2804Ud = null;
        if (c3535lu != null) {
            try {
                i02 = c3535lu.f31864a.i0();
                if (c3535lu != null) {
                    try {
                        c2804Ud = c3535lu.f31864a.k0();
                    } finally {
                        try {
                        } catch (C3267gu unused) {
                        }
                    }
                }
                boolean z3 = true;
                if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ha)).booleanValue()) {
                    if (c3535lu != null) {
                        try {
                            c3535lu.a();
                        } catch (C3267gu unused2) {
                        }
                    }
                    z3 = false;
                }
                this.f26860a.put(str, new C2714On(str, i02, c2804Ud, z3));
            } finally {
                try {
                } catch (C3267gu unused3) {
                }
            }
        }
        i02 = null;
        if (c3535lu != null) {
        }
        boolean z32 = true;
        if (((Boolean) q2.r.f40204e.f40207c.a(AbstractC3569ma.Ha)).booleanValue()) {
        }
        this.f26860a.put(str, new C2714On(str, i02, c2804Ud, z32));
    }

    public final synchronized C2714On b(String str) {
        return (C2714On) this.f26860a.get(str);
    }
}
