package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.Qn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2768Qn {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27853a = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(String str, C3558lu c3558lu) {
        C3290gu c3290gu;
        C2826Ud i02;
        if (this.f27853a.containsKey(str)) {
            return;
        }
        C2826Ud c2826Ud = null;
        if (c3558lu != null) {
            try {
                i02 = c3558lu.f32644a.i0();
                if (c3558lu != null) {
                    try {
                        c2826Ud = c3558lu.f32644a.k0();
                    } finally {
                        try {
                        } catch (C3290gu unused) {
                        }
                    }
                }
                boolean z6 = true;
                if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ha)).booleanValue()) {
                    if (c3558lu != null) {
                        try {
                            c3558lu.a();
                        } catch (C3290gu unused2) {
                        }
                    }
                    z6 = false;
                }
                this.f27853a.put(str, new C2751Pn(str, i02, c2826Ud, z6));
            } finally {
                try {
                } catch (C3290gu unused3) {
                }
            }
        }
        i02 = null;
        if (c3558lu != null) {
        }
        boolean z62 = true;
        if (((Boolean) s2.r.f40506e.f40509c.a(AbstractC3592ma.Ha)).booleanValue()) {
        }
        this.f27853a.put(str, new C2751Pn(str, i02, c2826Ud, z62));
    }

    public final synchronized C2751Pn b(String str) {
        return (C2751Pn) this.f27853a.get(str);
    }
}
