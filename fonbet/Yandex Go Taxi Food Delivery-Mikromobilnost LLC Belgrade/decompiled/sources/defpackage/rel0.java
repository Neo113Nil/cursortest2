package defpackage;

import ru.yandex.taxi.map.utils.a;

/* loaded from: classes6.dex */
public final class rel0 {
    public Long a;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r1.longValue() <= r10) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r8.intValue() <= r7) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (30000 <= r10) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(zzs zzsVar, long j, zzs zzsVar2, long j2, kl3 kl3Var, tls tlsVar) {
        boolean z = false;
        if (j != 0 && j2 != 0 && !jl40.l(zzsVar, zzsVar2)) {
            long j3 = j2 - j;
            float j4 = a.j(zzsVar, zzsVar2);
            if (kl3Var instanceof jby0) {
                jby0 jby0Var = (jby0) kl3Var;
                Long l = jby0Var.b;
                if (l != null) {
                }
                if (jby0Var.c != null) {
                }
                if (z && kl3Var.a()) {
                    tlsVar.invoke(new pel0((int) j4, (int) j3, new nel0(zzsVar.a, zzsVar.b), new mel0(zzsVar2.a, zzsVar2.b)));
                }
                return z;
            }
            if (!(kl3Var instanceof iby0)) {
                w511.b();
            }
        }
        return false;
    }
}
