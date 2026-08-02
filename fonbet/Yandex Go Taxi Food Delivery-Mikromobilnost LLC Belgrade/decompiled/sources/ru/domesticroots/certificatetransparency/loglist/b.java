package ru.domesticroots.certificatetransparency.loglist;

import defpackage.bfz;
import defpackage.cfz;
import defpackage.j9i0;
import defpackage.jpg;
import defpackage.kfz;
import defpackage.l9i0;
import defpackage.lfz;
import defpackage.m9i0;
import defpackage.mfz;
import defpackage.n9i0;
import defpackage.nfz;
import defpackage.o9i0;
import defpackage.ofz;
import defpackage.p9i0;
import defpackage.pfz;
import defpackage.qfz;
import defpackage.rfz;
import defpackage.rgb1;
import defpackage.s4b1;
import defpackage.sbs0;
import defpackage.sez;
import defpackage.tcc;
import defpackage.tls;
import defpackage.uez;
import defpackage.uh6;
import defpackage.uza;
import defpackage.vez;
import defpackage.w511;
import defpackage.wez;
import defpackage.xez;
import defpackage.ycc;
import defpackage.yvi0;
import defpackage.zez;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;
import ru.CryptoPro.JCP.JCP;
import ru.domesticroots.certificatetransparency.datasource.c;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.Log;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.LogListV2;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.Operator;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State;
import ru.domesticroots.certificatetransparency.internal.loglist.parser.LogListJsonParserV2;

/* loaded from: classes9.dex */
public abstract class b {
    public static jpg a(a aVar, ru.domesticroots.certificatetransparency.cache.a aVar2) {
        final p9i0 p9i0Var = new p9i0(0);
        return new c(new ru.domesticroots.certificatetransparency.datasource.b(new ru.domesticroots.certificatetransparency.datasource.a(new sez(), aVar2).j(new yvi0(aVar)), new tls() { // from class: ru.domesticroots.certificatetransparency.loglist.LogListDataSourceFactory$createDataSource$2
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0055  */
            @Override // defpackage.tls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                rgb1 pfzVar;
                n9i0 n9i0Var = (n9i0) obj;
                p9i0 p9i0Var2 = p9i0.this;
                p9i0Var2.getClass();
                if (!(n9i0Var instanceof m9i0)) {
                    if (n9i0Var instanceof l9i0) {
                        l9i0 l9i0Var = (l9i0) n9i0Var;
                        return l9i0Var instanceof j9i0 ? new wez(((j9i0) l9i0Var).a()) : l9i0Var instanceof o9i0 ? new bfz(((o9i0) l9i0Var).a()) : vez.a;
                    }
                    w511.b();
                    return null;
                }
                m9i0 m9i0Var = (m9i0) n9i0Var;
                byte[] a = m9i0Var.a();
                byte[] b = m9i0Var.b();
                cfz cfzVar = p9i0Var2.a;
                cfzVar.getClass();
                rgb1 rgb1Var = rfz.a;
                if (b != null) {
                    try {
                        Signature signature = Signature.getInstance(JCP.SIGN_SHA256_RSA_NAME);
                        signature.initVerify(cfzVar.a);
                        signature.update(a);
                        if (!signature.verify(b)) {
                            rgb1Var = ofz.a;
                        }
                    } catch (InvalidKeyException e) {
                        pfzVar = new nfz(e);
                        rgb1Var = pfzVar;
                        if (rgb1Var instanceof rfz) {
                        }
                    } catch (NoSuchAlgorithmException e2) {
                        pfzVar = new mfz(e2);
                        rgb1Var = pfzVar;
                        if (rgb1Var instanceof rfz) {
                        }
                    } catch (SignatureException e3) {
                        pfzVar = new pfz(e3);
                        rgb1Var = pfzVar;
                        if (rgb1Var instanceof rfz) {
                        }
                    }
                }
                if (rgb1Var instanceof rfz) {
                    if (rgb1Var instanceof qfz) {
                        return new sbs0((qfz) rgb1Var);
                    }
                    w511.b();
                    return null;
                }
                xez xezVar = p9i0Var2.b;
                String str = new String(a, uza.a);
                ((LogListJsonParserV2) xezVar).getClass();
                try {
                    List<Operator> operators = ((LogListV2) LogListJsonParserV2.a.b(LogListV2.Companion.serializer(), str)).getOperators();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = operators.iterator();
                    while (it.hasNext()) {
                        ycc.r(((Operator) it.next()).getLogs(), arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        Log log = (Log) next;
                        if (log.getState() != null && !(log.getState() instanceof State.Pending) && !(log.getState() instanceof State.Rejected)) {
                            arrayList2.add(next);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        Log log2 = (Log) it3.next();
                        try {
                            arrayList3.add(new kfz(uh6.u(s4b1.b(log2.getKey())), ((log2.getState() instanceof State.Retired) || (log2.getState() instanceof State.ReadOnly)) ? Long.valueOf(log2.getState().getTimestamp()) : null));
                        } catch (IllegalArgumentException e4) {
                            return new lfz(e4, log2.getKey());
                        } catch (NoSuchAlgorithmException e5) {
                            return new lfz(e5, log2.getKey());
                        } catch (InvalidKeySpecException e6) {
                            return new lfz(e6, log2.getKey());
                        }
                    }
                    return new zez(arrayList3);
                } catch (SerializationException e7) {
                    return new uez(e7);
                }
            }
        }));
    }
}
