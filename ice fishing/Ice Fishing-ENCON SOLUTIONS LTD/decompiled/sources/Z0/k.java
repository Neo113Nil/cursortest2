package Z0;

import a1.C0099o;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1996a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1997b;

    /* renamed from: c, reason: collision with root package name */
    public final I0.b f1998c;

    /* renamed from: d, reason: collision with root package name */
    public j f1999d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2000e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2001f;

    public k(R0.b bVar, boolean z2) {
        I0.b bVar2 = new I0.b(bVar, "flutter/restoration", C0099o.f2035b, 9);
        this.f2000e = false;
        this.f2001f = false;
        i iVar = new i(4, this);
        this.f1998c = bVar2;
        this.f1996a = z2;
        bVar2.M(iVar);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
