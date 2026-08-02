package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class go extends b1 {
    public final /* synthetic */ int c = 1;

    public go(ho hoVar, byte b, char c) {
        super(1, whf.class);
    }

    @Override // defpackage.b1
    public final Object b(d8 d8Var) {
        switch (this.c) {
            case 0:
                eo eoVar = (eo) d8Var;
                ao s = bo.s();
                s.d();
                bo.m((bo) s.b);
                byte[] a = qhn.a(eoVar.m());
                jn3 n = mn3.n(a, 0, a.length);
                s.d();
                bo.n((bo) s.b, n);
                io n2 = eoVar.n();
                s.d();
                bo.o((bo) s.b, n2);
                return (bo) s.b();
            case 1:
                lo loVar = (lo) d8Var;
                fo[] foVarArr = {new fo(2, mie.class)};
                HashMap hashMap = new HashMap();
                int length = foVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        if (foVarArr.length > 0) {
                            Class cls = foVarArr[0].a;
                        }
                        Collections.unmodifiableMap(hashMap);
                        qo m = loVar.m();
                        oo t = po.t();
                        ro o = m.o();
                        t.d();
                        po.n((po) t.b, o);
                        byte[] a2 = qhn.a(m.n());
                        jn3 n3 = mn3.n(a2, 0, a2.length);
                        t.d();
                        po.o((po) t.b, n3);
                        t.d();
                        po.m((po) t.b);
                        po poVar = (po) t.b();
                        fo[] foVarArr2 = {new fo(8, q4h.class)};
                        HashMap hashMap2 = new HashMap();
                        for (fo foVar : foVarArr2) {
                            boolean containsKey = hashMap2.containsKey(foVar.a);
                            Class cls2 = foVar.a;
                            if (containsKey) {
                                xq0.x(tlm.i(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                            } else {
                                hashMap2.put(cls2, foVar);
                            }
                        }
                        if (foVarArr2.length > 0) {
                            Class cls3 = foVarArr2[0].a;
                        }
                        Collections.unmodifiableMap(hashMap2);
                        y0e n4 = loVar.n();
                        w0e t2 = x0e.t();
                        t2.d();
                        x0e.m((x0e) t2.b);
                        z0e o2 = n4.o();
                        t2.d();
                        x0e.n((x0e) t2.b, o2);
                        byte[] a3 = qhn.a(n4.n());
                        jn3 n5 = mn3.n(a3, 0, a3.length);
                        t2.d();
                        x0e.o((x0e) t2.b, n5);
                        x0e x0eVar = (x0e) t2.b();
                        jo s2 = ko.s();
                        s2.d();
                        ko.n((ko) s2.b, poVar);
                        s2.d();
                        ko.o((ko) s2.b, x0eVar);
                        s2.d();
                        ko.m((ko) s2.b);
                        return (ko) s2.b();
                    }
                    fo foVar2 = foVarArr[i];
                    boolean containsKey2 = hashMap.containsKey(foVar2.a);
                    Class cls4 = foVar2.a;
                    if (containsKey2) {
                        xq0.x(tlm.i(cls4, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    } else {
                        hashMap.put(cls4, foVar2);
                        i++;
                    }
                }
                return null;
            case 2:
                vo voVar = (vo) d8Var;
                to s3 = uo.s();
                byte[] a4 = qhn.a(voVar.m());
                jn3 n6 = mn3.n(a4, 0, a4.length);
                s3.d();
                uo.o((uo) s3.b, n6);
                wo n7 = voVar.n();
                s3.d();
                uo.n((uo) s3.b, n7);
                s3.d();
                uo.m((uo) s3.b);
                return (uo) s3.b();
            case 3:
                yo q = zo.q();
                byte[] a5 = qhn.a(((bp) d8Var).n());
                jn3 n8 = mn3.n(a5, 0, a5.length);
                q.d();
                zo.n((zo) q.b, n8);
                q.d();
                zo.m((zo) q.b);
                return (zo) q.b();
            case 4:
                dp q2 = ep.q();
                byte[] a6 = qhn.a(((fp) d8Var).m());
                jn3 n9 = mn3.n(a6, 0, a6.length);
                q2.d();
                ep.n((ep) q2.b, n9);
                q2.d();
                ep.m((ep) q2.b);
                return (ep) q2.b();
            case 5:
                hp q3 = ip.q();
                byte[] a7 = qhn.a(((kp) d8Var).n());
                jn3 n10 = mn3.n(a7, 0, a7.length);
                q3.d();
                ip.n((ip) q3.b, n10);
                q3.d();
                ip.m((ip) q3.b);
                return (ip) q3.b();
            case 6:
                pa4 q4 = qa4.q();
                q4.d();
                qa4.m((qa4) q4.b);
                byte[] a8 = qhn.a(32);
                jn3 n11 = mn3.n(a8, 0, a8.length);
                q4.d();
                qa4.n((qa4) q4.b, n11);
                return (qa4) q4.b();
            case 7:
                y0e y0eVar = (y0e) d8Var;
                w0e t3 = x0e.t();
                t3.d();
                x0e.m((x0e) t3.b);
                z0e o3 = y0eVar.o();
                t3.d();
                x0e.n((x0e) t3.b, o3);
                byte[] a9 = qhn.a(y0eVar.n());
                jn3 n12 = mn3.n(a9, 0, a9.length);
                t3.d();
                x0e.o((x0e) t3.b, n12);
                return (x0e) t3.b();
            case 8:
                uhf q5 = vhf.q();
                q5.d();
                vhf.n((vhf) q5.b, (whf) d8Var);
                q5.d();
                vhf.m((vhf) q5.b);
                return (vhf) q5.b();
            case 9:
                zhf q6 = aif.q();
                q6.d();
                aif.n((aif) q6.b, (bif) d8Var);
                q6.d();
                aif.m((aif) q6.b);
                return (aif) q6.b();
            default:
                v6w q7 = w6w.q();
                q7.d();
                w6w.m((w6w) q7.b);
                byte[] a10 = qhn.a(32);
                jn3 n13 = mn3.n(a10, 0, a10.length);
                q7.d();
                w6w.n((w6w) q7.b, n13);
                return (w6w) q7.b();
        }
    }

    @Override // defpackage.b1
    public final d8 g(mn3 mn3Var) {
        switch (this.c) {
            case 0:
                return eo.o(mn3Var, y0c.a());
            case 1:
                return lo.o(mn3Var, y0c.a());
            case 2:
                return vo.o(mn3Var, y0c.a());
            case 3:
                return bp.p(mn3Var, y0c.a());
            case 4:
                return fp.n(mn3Var, y0c.a());
            case 5:
                return kp.p(mn3Var, y0c.a());
            case 6:
                return ra4.m(mn3Var, y0c.a());
            case 7:
                return y0e.p(mn3Var, y0c.a());
            case 8:
                return whf.o(mn3Var, y0c.a());
            case 9:
                return bif.p(mn3Var, y0c.a());
            default:
                return x6w.m(mn3Var, y0c.a());
        }
    }

    @Override // defpackage.b1
    public final void h(d8 d8Var) {
        switch (this.c) {
            case 0:
                eo eoVar = (eo) d8Var;
                ho.w(eoVar.n());
                if (eoVar.m() == 32) {
                    return;
                }
                b6e.m("AesCmacKey size wrong, must be 32 bytes");
                return;
            case 1:
                lo loVar = (lo) d8Var;
                fo[] foVarArr = {new fo(2, mie.class)};
                HashMap hashMap = new HashMap();
                for (fo foVar : foVarArr) {
                    boolean containsKey = hashMap.containsKey(foVar.a);
                    Class cls = foVar.a;
                    if (containsKey) {
                        xq0.x(tlm.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    hashMap.put(cls, foVar);
                }
                if (foVarArr.length > 0) {
                    Class cls2 = foVarArr[0].a;
                }
                Collections.unmodifiableMap(hashMap);
                qo m = loVar.m();
                qwt.a(m.n());
                ro o = m.o();
                if (o.n() < 12 || o.n() > 16) {
                    b6e.m("invalid IV size");
                    return;
                }
                fo[] foVarArr2 = {new fo(8, q4h.class)};
                HashMap hashMap2 = new HashMap();
                for (fo foVar2 : foVarArr2) {
                    boolean containsKey2 = hashMap2.containsKey(foVar2.a);
                    Class cls3 = foVar2.a;
                    if (containsKey2) {
                        xq0.x(tlm.i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return;
                    }
                    hashMap2.put(cls3, foVar2);
                }
                if (foVarArr2.length > 0) {
                    Class cls4 = foVarArr2[0].a;
                }
                Collections.unmodifiableMap(hashMap2);
                y0e n = loVar.n();
                if (n.n() < 16) {
                    b6e.m("key too short");
                    return;
                } else {
                    ho.x(n.o());
                    qwt.a(loVar.m().n());
                    return;
                }
            case 2:
                vo voVar = (vo) d8Var;
                qwt.a(voVar.m());
                if (voVar.n().n() == 12 || voVar.n().n() == 16) {
                    return;
                }
                b6e.m("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                qwt.a(((bp) d8Var).n());
                return;
            case 4:
                qwt.a(((fp) d8Var).m());
                return;
            case 5:
                kp kpVar = (kp) d8Var;
                if (kpVar.n() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + kpVar.n() + ". Valid keys must have 64 bytes.");
            case 6:
                return;
            case 7:
                y0e y0eVar = (y0e) d8Var;
                if (y0eVar.n() >= 16) {
                    ho.x(y0eVar.o());
                    return;
                } else {
                    b6e.m("key too short");
                    return;
                }
            case 8:
                return;
            case 9:
                return;
            default:
                return;
        }
    }

    public /* synthetic */ go(Class cls) {
        super(1, cls);
    }

    public go(ho hoVar, byte b, int i) {
        super(1, bif.class);
    }

    public go(ho hoVar, char c) {
        super(1, bp.class);
    }

    public go(ho hoVar, byte b) {
        super(1, vo.class);
    }

    public go(ho hoVar, byte b, boolean z) {
        super(1, ra4.class);
    }

    public go(ho hoVar, int i) {
        super(1, fp.class);
    }

    public go(ho hoVar, short s) {
        super(1, kp.class);
    }

    public go(ho hoVar, byte b, short s) {
        super(1, x6w.class);
    }

    public go(ho hoVar) {
        super(1, lo.class);
    }

    public go(ho hoVar, byte b, byte b2) {
        super(1, y0e.class);
    }
}
