package defpackage;

import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class ho extends j5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho() {
        super(x0e.class, new fo(8, q4h.class));
        this.d = 7;
    }

    public static void w(io ioVar) {
        if (ioVar.n() < 10) {
            b6e.m("tag size too short");
        } else {
            if (ioVar.n() <= 16) {
                return;
            }
            b6e.m("tag size too long");
        }
    }

    public static void x(z0e z0eVar) {
        if (z0eVar.o() < 10) {
            b6e.m("tag size too small");
            return;
        }
        int ordinal = z0eVar.n().ordinal();
        if (ordinal == 1) {
            if (z0eVar.o() <= 20) {
                return;
            }
            b6e.m("tag size too big");
        } else if (ordinal == 3) {
            if (z0eVar.o() <= 32) {
                return;
            }
            b6e.m("tag size too big");
        } else if (ordinal != 4) {
            b6e.m("unknown hash type");
        } else {
            if (z0eVar.o() <= 64) {
                return;
            }
            b6e.m("tag size too big");
        }
    }

    @Override // defpackage.j5
    public final String n() {
        switch (this.d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 7:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
            case 8:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 9:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    @Override // defpackage.j5
    public final b1 p() {
        switch (this.d) {
            case 0:
                return new go(eo.class);
            case 1:
                return new go(this);
            case 2:
                return new go(this, (byte) 0);
            case 3:
                return new go(this, (char) 0);
            case 4:
                return new go(this, 0);
            case 5:
                return new go(this, (short) 0);
            case 6:
                return new go(this, (byte) 0, false);
            case 7:
                return new go(this, (byte) 0, (byte) 0);
            case 8:
                return new go(this, (byte) 0, (char) 0);
            case 9:
                return new go(this, (byte) 0, 0);
            default:
                return new go(this, (byte) 0, (short) 0);
        }
    }

    @Override // defpackage.j5
    public final naf q() {
        switch (this.d) {
            case 0:
                return naf.SYMMETRIC;
            case 1:
                return naf.SYMMETRIC;
            case 2:
                return naf.SYMMETRIC;
            case 3:
                return naf.SYMMETRIC;
            case 4:
                return naf.SYMMETRIC;
            case 5:
                return naf.SYMMETRIC;
            case 6:
                return naf.SYMMETRIC;
            case 7:
                return naf.SYMMETRIC;
            case 8:
                return naf.REMOTE;
            case 9:
                return naf.REMOTE;
            default:
                return naf.SYMMETRIC;
        }
    }

    @Override // defpackage.j5
    public final d8 s(mn3 mn3Var) {
        switch (this.d) {
            case 0:
                return bo.t(mn3Var, y0c.a());
            case 1:
                return ko.t(mn3Var, y0c.a());
            case 2:
                return uo.t(mn3Var, y0c.a());
            case 3:
                return zo.r(mn3Var, y0c.a());
            case 4:
                return ep.r(mn3Var, y0c.a());
            case 5:
                return ip.r(mn3Var, y0c.a());
            case 6:
                return qa4.r(mn3Var, y0c.a());
            case 7:
                return x0e.u(mn3Var, y0c.a());
            case 8:
                return vhf.r(mn3Var, y0c.a());
            case 9:
                return aif.r(mn3Var, y0c.a());
            default:
                return w6w.r(mn3Var, y0c.a());
        }
    }

    @Override // defpackage.j5
    public final void v(d8 d8Var) {
        switch (this.d) {
            case 0:
                bo boVar = (bo) d8Var;
                qwt.c(boVar.r());
                if (boVar.p().size() == 32) {
                    w(boVar.q());
                    return;
                } else {
                    b6e.m("AesCmacKey size wrong, must be 32 bytes");
                    return;
                }
            case 1:
                ko koVar = (ko) d8Var;
                qwt.c(koVar.r());
                fo[] foVarArr = {new fo(2, mie.class)};
                HashMap hashMap = new HashMap();
                fo foVar = foVarArr[0];
                boolean containsKey = hashMap.containsKey(foVar.a);
                Class cls = foVar.a;
                if (containsKey) {
                    xq0.x(tlm.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                hashMap.put(cls, foVar);
                Class cls2 = foVarArr[0].a;
                Collections.unmodifiableMap(hashMap);
                po p = koVar.p();
                qwt.c(p.s());
                qwt.a(p.q().size());
                ro r = p.r();
                if (r.n() < 12 || r.n() > 16) {
                    b6e.m("invalid IV size");
                    return;
                }
                fo[] foVarArr2 = {new fo(8, q4h.class)};
                HashMap hashMap2 = new HashMap();
                fo foVar2 = foVarArr2[0];
                boolean containsKey2 = hashMap2.containsKey(foVar2.a);
                Class cls3 = foVar2.a;
                if (containsKey2) {
                    xq0.x(tlm.i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    return;
                }
                hashMap2.put(cls3, foVar2);
                Class cls4 = foVarArr2[0].a;
                Collections.unmodifiableMap(hashMap2);
                x0e q = koVar.q();
                qwt.c(q.s());
                if (q.q().size() >= 16) {
                    x(q.r());
                    return;
                } else {
                    b6e.m("key too short");
                    return;
                }
            case 2:
                uo uoVar = (uo) d8Var;
                qwt.c(uoVar.r());
                qwt.a(uoVar.p().size());
                if (uoVar.q().n() == 12 || uoVar.q().n() == 16) {
                    return;
                }
                b6e.m("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                zo zoVar = (zo) d8Var;
                qwt.c(zoVar.p());
                qwt.a(zoVar.o().size());
                return;
            case 4:
                ep epVar = (ep) d8Var;
                qwt.c(epVar.p());
                qwt.a(epVar.o().size());
                return;
            case 5:
                ip ipVar = (ip) d8Var;
                qwt.c(ipVar.p());
                if (ipVar.o().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + ipVar.o().size() + ". Valid keys must have 64 bytes.");
            case 6:
                qa4 qa4Var = (qa4) d8Var;
                qwt.c(qa4Var.p());
                if (qa4Var.o().size() == 32) {
                    return;
                }
                b6e.m("invalid ChaCha20Poly1305Key: incorrect key length");
                return;
            case 7:
                x0e x0eVar = (x0e) d8Var;
                qwt.c(x0eVar.s());
                if (x0eVar.q().size() >= 16) {
                    x(x0eVar.r());
                    return;
                } else {
                    b6e.m("key too short");
                    return;
                }
            case 8:
                qwt.c(((vhf) d8Var).p());
                return;
            case 9:
                qwt.c(((aif) d8Var).p());
                return;
            default:
                w6w w6wVar = (w6w) d8Var;
                qwt.c(w6wVar.p());
                if (w6wVar.o().size() == 32) {
                    return;
                }
                b6e.m("invalid XChaCha20Poly1305Key: incorrect key length");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho(Class cls, fo[] foVarArr, int i) {
        super(cls, foVarArr);
        this.d = i;
    }
}
