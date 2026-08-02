package n8;

import N3.C;
import i8.p;
import i8.x;
import y8.r;

/* loaded from: classes2.dex */
public final class i extends x {

    /* renamed from: u, reason: collision with root package name */
    public final String f39692u;

    /* renamed from: v, reason: collision with root package name */
    public final long f39693v;

    /* renamed from: w, reason: collision with root package name */
    public final r f39694w;

    public i(String str, long j6, r rVar) {
        this.f39692u = str;
        this.f39693v = j6;
        this.f39694w = rVar;
    }

    @Override // i8.x
    public final long b() {
        return this.f39693v;
    }

    @Override // i8.x
    public final p j() {
        String str = this.f39692u;
        if (str == null) {
            return null;
        }
        Q7.i iVar = p.f38286b;
        try {
            return C.I(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // i8.x
    public final y8.g z() {
        return this.f39694w;
    }
}
