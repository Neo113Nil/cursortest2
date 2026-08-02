package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class bfx extends mcx {
    private static final bfx zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private mfx zzh;

    static {
        bfx bfxVar = new bfx();
        zzb = bfxVar;
        mcx.k(bfx.class, bfxVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [iex] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mcx] */
    public static bfx n(byte[] bArr, qbx qbxVar) {
        bfx bfxVar = zzb;
        int length = bArr.length;
        if (length != 0) {
            ?? r2 = (mcx) bfxVar.d(4);
            try {
                ?? a = fex.c.a(r2.getClass());
                vx0 vx0Var = new vx0();
                qbxVar.getClass();
                a.i(r2, bArr, 0, length, vx0Var);
                a.a(r2);
                bfxVar = r2;
            } catch (cdx e) {
                throw e;
            } catch (IOException e2) {
                if (e2.getCause() instanceof cdx) {
                    throw ((cdx) e2.getCause());
                }
                throw new cdx(e2.getMessage(), e2);
            } catch (IndexOutOfBoundsException unused) {
                tiu.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            } catch (rex e3) {
                tiu.i(e3.getMessage());
                return null;
            }
        }
        if (bfxVar == null || mcx.m(bfxVar, true)) {
            return bfxVar;
        }
        tiu.i(new rex().getMessage());
        return null;
    }

    public static /* synthetic */ void o(bfx bfxVar, mfx mfxVar) {
        bfxVar.zzh = mfxVar;
        bfxVar.zzd |= 2;
    }

    public static /* synthetic */ void p(bfx bfxVar, int i) {
        bfxVar.zzg = i - 1;
        bfxVar.zzd |= 1;
    }

    public static afx q() {
        return (afx) zzb.f();
    }

    @Override // defpackage.mcx
    public final Object d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new hex(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", jax.c, "zzh", bgx.class});
        }
        if (i2 == 3) {
            return new bfx();
        }
        if (i2 == 4) {
            return new afx(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
