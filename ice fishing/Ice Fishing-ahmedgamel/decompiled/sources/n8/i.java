package n8;

import L3.F;
import i8.p;
import i8.x;
import y8.r;

/* loaded from: classes2.dex */
public final class i extends x {

    /* renamed from: u, reason: collision with root package name */
    public final String f39525u;

    /* renamed from: v, reason: collision with root package name */
    public final long f39526v;

    /* renamed from: w, reason: collision with root package name */
    public final r f39527w;

    public i(String str, long j6, r rVar) {
        this.f39525u = str;
        this.f39526v = j6;
        this.f39527w = rVar;
    }

    @Override // i8.x
    public final long b() {
        return this.f39526v;
    }

    @Override // i8.x
    public final p j() {
        String str = this.f39525u;
        if (str == null) {
            return null;
        }
        Q7.i iVar = p.f38167b;
        try {
            return F.l(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // i8.x
    public final y8.g z() {
        return this.f39527w;
    }
}
