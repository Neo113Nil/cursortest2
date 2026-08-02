package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class fo {
    public final Class a;
    public final /* synthetic */ int b;

    public fo(int i, Class cls) {
        this.b = i;
        this.a = cls;
    }

    public final Object a(d8 d8Var) {
        switch (this.b) {
            case 0:
                bo boVar = (bo) d8Var;
                return new vrm(new t1f(boVar.p().r()), boVar.q().n());
            case 1:
                ko koVar = (ko) d8Var;
                fo[] foVarArr = {new fo(2, mie.class)};
                HashMap hashMap = new HashMap();
                int length = foVarArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        fo foVar = foVarArr[i];
                        boolean containsKey = hashMap.containsKey(foVar.a);
                        Class cls = foVar.a;
                        if (containsKey) {
                            xq0.x(tlm.i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        } else {
                            hashMap.put(cls, foVar);
                            i++;
                        }
                    } else {
                        if (foVarArr.length > 0) {
                            Class cls2 = foVarArr[0].a;
                        }
                        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                        po p = koVar.p();
                        fo foVar2 = (fo) unmodifiableMap.get(mie.class);
                        if (foVar2 != null) {
                            mie mieVar = (mie) foVar2.a(p);
                            fo[] foVarArr2 = {new fo(8, q4h.class)};
                            HashMap hashMap2 = new HashMap();
                            int length2 = foVarArr2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    fo foVar3 = foVarArr2[i2];
                                    boolean containsKey2 = hashMap2.containsKey(foVar3.a);
                                    Class cls3 = foVar3.a;
                                    if (containsKey2) {
                                        xq0.x(tlm.i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                                    } else {
                                        hashMap2.put(cls3, foVar3);
                                        i2++;
                                    }
                                } else {
                                    if (foVarArr2.length > 0) {
                                        Class cls4 = foVarArr2[0].a;
                                    }
                                    Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
                                    x0e q = koVar.q();
                                    fo foVar4 = (fo) unmodifiableMap2.get(q4h.class);
                                    if (foVar4 != null) {
                                        return new s6b(mieVar, (q4h) foVar4.a(q), koVar.q().r().o());
                                    }
                                    b6e.v(q4h.class.getCanonicalName(), " not supported.", "Requested primitive class ");
                                }
                            }
                        } else {
                            b6e.v(mie.class.getCanonicalName(), " not supported.", "Requested primitive class ");
                        }
                    }
                }
                return null;
            case 2:
                po poVar = (po) d8Var;
                return new no(poVar.q().r(), poVar.r().n());
            case 3:
                uo uoVar = (uo) d8Var;
                return new so(uoVar.p().r(), uoVar.q().n());
            case 4:
                return new xo(((zo) d8Var).o().r());
            case 5:
                return new cp(((ep) d8Var).o().r());
            case 6:
                return new gp(((ip) d8Var).o().r());
            case 7:
                return new oa4(((qa4) d8Var).o().r(), 0);
            case 8:
                x0e x0eVar = (x0e) d8Var;
                xsd n = x0eVar.r().n();
                SecretKeySpec secretKeySpec = new SecretKeySpec(x0eVar.q().r(), "HMAC");
                int o = x0eVar.r().o();
                int ordinal = n.ordinal();
                if (ordinal == 1) {
                    return new vrm(new anx("HMACSHA1", secretKeySpec), o);
                }
                if (ordinal == 3) {
                    return new vrm(new anx("HMACSHA256", secretKeySpec), o);
                }
                if (ordinal == 4) {
                    return new vrm(new anx("HMACSHA512", secretKeySpec), o);
                }
                b6e.m("unknown hash");
                return null;
            case 9:
                String n2 = ((vhf) d8Var).o().n();
                return xhf.a(n2).b(n2);
            case 10:
                aif aifVar = (aif) d8Var;
                String o2 = aifVar.o().o();
                return new yhf(aifVar.o().n(), xhf.a(o2).b(o2));
            default:
                return new oa4(((w6w) d8Var).o().r(), 1);
        }
    }
}
