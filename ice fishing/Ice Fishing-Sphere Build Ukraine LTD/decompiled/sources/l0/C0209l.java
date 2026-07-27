package l0;

import L.C0026b;
import e0.C0126b;
import java.util.HashMap;

/* renamed from: l0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2738a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f2739b;

    /* renamed from: c, reason: collision with root package name */
    public final C0026b f2740c;

    /* renamed from: d, reason: collision with root package name */
    public C0208k f2741d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2742e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2743f;

    public C0209l(C0126b c0126b, boolean z2) {
        C0026b c0026b = new C0026b(c0126b, "flutter/restoration", m0.o.f2782a, 8);
        this.f2742e = false;
        this.f2743f = false;
        C0200c c0200c = new C0200c(10, this);
        this.f2740c = c0026b;
        this.f2738a = z2;
        c0026b.J(c0200c);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
