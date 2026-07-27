package p8;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class q implements I7.a {

    /* renamed from: n, reason: collision with root package name */
    public final v f39872n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f39873u;

    public q(r rVar, v vVar) {
        this.f39873u = rVar;
        this.f39872n = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [p8.r] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [p8.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // I7.a
    public final Object invoke() {
        Throwable th;
        EnumC4856b enumC4856b;
        ?? r02 = this.f39873u;
        v vVar = this.f39872n;
        EnumC4856b enumC4856b2 = EnumC4856b.f39818x;
        ?? r32 = 1;
        IOException e9 = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    r02.a(r32, enumC4856b2, e9);
                    j8.c.a(vVar);
                    throw th;
                }
            } catch (IOException e10) {
                e9 = e10;
                enumC4856b = enumC4856b2;
            }
            if (!vVar.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r32 = enumC4856b2;
                    r02.a(r32, enumC4856b2, e9);
                    j8.c.a(vVar);
                    throw th;
                }
            } while (vVar.a(false, this));
            enumC4856b = EnumC4856b.f39816v;
            try {
                enumC4856b2 = EnumC4856b.f39813A;
                r02.a(enumC4856b, enumC4856b2, null);
                r32 = enumC4856b;
            } catch (IOException e11) {
                e9 = e11;
                enumC4856b2 = EnumC4856b.f39817w;
                r02.a(enumC4856b2, enumC4856b2, e9);
                r32 = enumC4856b;
                j8.c.a(vVar);
                return u7.v.f41350a;
            }
            j8.c.a(vVar);
            return u7.v.f41350a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
