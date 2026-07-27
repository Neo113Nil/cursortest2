package l8;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class q implements E7.a {

    /* renamed from: n, reason: collision with root package name */
    public final v f39155n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f39156u;

    public q(r rVar, v vVar) {
        this.f39156u = rVar;
        this.f39155n = vVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l8.r] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [l8.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // E7.a
    public final Object invoke() {
        Throwable th;
        EnumC4710b enumC4710b;
        ?? r02 = this.f39156u;
        v vVar = this.f39155n;
        EnumC4710b enumC4710b2 = EnumC4710b.f39101x;
        ?? r32 = 1;
        IOException e6 = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    r02.a(r32, enumC4710b2, e6);
                    f8.c.a(vVar);
                    throw th;
                }
            } catch (IOException e9) {
                e6 = e9;
                enumC4710b = enumC4710b2;
            }
            if (!vVar.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r32 = enumC4710b2;
                    r02.a(r32, enumC4710b2, e6);
                    f8.c.a(vVar);
                    throw th;
                }
            } while (vVar.a(false, this));
            enumC4710b = EnumC4710b.f39099v;
            try {
                enumC4710b2 = EnumC4710b.f39096A;
                r02.a(enumC4710b, enumC4710b2, null);
                r32 = enumC4710b;
            } catch (IOException e10) {
                e6 = e10;
                enumC4710b2 = EnumC4710b.f39100w;
                r02.a(enumC4710b2, enumC4710b2, e6);
                r32 = enumC4710b;
                f8.c.a(vVar);
                return q7.v.f40183a;
            }
            f8.c.a(vVar);
            return q7.v.f40183a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
