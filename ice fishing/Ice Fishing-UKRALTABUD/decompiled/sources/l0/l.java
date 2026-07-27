package l0;

import L.C0051b;
import e0.C0126b;
import java.util.HashMap;
import m0.C0217o;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2730a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2731b;

    /* renamed from: c, reason: collision with root package name */
    public final C0051b f2732c;

    /* renamed from: d, reason: collision with root package name */
    public k f2733d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2734e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2735f;

    public l(C0126b c0126b, boolean z2) {
        C0051b c0051b = new C0051b(c0126b, "flutter/restoration", C0217o.f2774a, 8);
        this.f2734e = false;
        this.f2735f = false;
        C0200c c0200c = new C0200c(10, this);
        this.f2732c = c0051b;
        this.f2730a = z2;
        c0051b.J(c0200c);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
