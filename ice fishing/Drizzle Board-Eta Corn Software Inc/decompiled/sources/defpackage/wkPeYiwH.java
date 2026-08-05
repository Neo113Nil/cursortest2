package defpackage;

import com.kolosta.rejin.jilosa.presentation.ui.MainActivity;
import java.io.Closeable;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class wkPeYiwH implements rg0 {
    public final Object NCTxEWno;
    public final /* synthetic */ int qoPGr6Ce;

    public /* synthetic */ wkPeYiwH(int i, Object obj) {
        this.qoPGr6Ce = i;
        this.NCTxEWno = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0134  */
    @Override // defpackage.rg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ng0 NCTxEWno(Class cls, mt mtVar) {
        ng0 ng0Var;
        og0 og0Var;
        pg0 pg0Var;
        switch (this.qoPGr6Ce) {
            case 0:
                return new rAaHqhFJ(new ia(((la) ((a3AMA6yV) ra.OxcuoDLp((MainActivity) this.NCTxEWno, a3AMA6yV.class))).NCTxEWno), new y30(mtVar));
            case 1:
                final n30 n30Var = new n30();
                mcXgUFR8 mcxgufr8 = (mcXgUFR8) this.NCTxEWno;
                na naVar = new na((la) mcxgufr8.MdtA4re8, (ia) mcxgufr8.wxUZMvaN, w30.sjUBp5pO(mtVar));
                na naVar2 = (na) ((jm) fn.ow5vqvCr(naVar, jm.class));
                naVar2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap(13);
                linkedHashMap.put("sq", naVar2.NCTxEWno);
                linkedHashMap.put("wx", naVar2.MdtA4re8);
                linkedHashMap.put("iy", naVar2.wxUZMvaN);
                linkedHashMap.put("d50", naVar2.VgvYg0wo);
                linkedHashMap.put("x70", naVar2.P7K7Inc8);
                linkedHashMap.put("p80", naVar2.b2ZJblxo);
                linkedHashMap.put("h90", naVar2.Qr9iLBAD);
                linkedHashMap.put("fb0", naVar2.jb9XjC4I);
                linkedHashMap.put("yb0", naVar2.eVhOlqcC);
                n00 n00Var = (n00) (linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap)).get(cls.getName());
                zk zkVar = (zk) mtVar.qoPGr6Ce.get(km.wxUZMvaN);
                ((na) ((jm) fn.ow5vqvCr(naVar, jm.class))).getClass();
                Object obj = Collections.EMPTY_MAP.get(cls);
                if (obj == null) {
                    if (zkVar != null) {
                        m1.VgvYg0wo(cls.getName(), " does not have an assisted factory specified in @HiltViewModel.", "Found creation callback but class ");
                    } else if (n00Var != null) {
                        ng0Var = (ng0) n00Var.get();
                        r1 = ng0Var;
                        Closeable closeable = new Closeable() { // from class: im
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public final void close() {
                                n30.this.qoPGr6Ce();
                            }
                        };
                        r1.getClass();
                        og0Var = r1.qoPGr6Ce;
                        if (og0Var.wxUZMvaN) {
                            synchronized (og0Var.qoPGr6Ce) {
                                og0Var.MdtA4re8.add(closeable);
                            }
                        } else {
                            og0.qoPGr6Ce(closeable);
                        }
                    } else {
                        m1.VgvYg0wo(cls.getName(), " to be available in the multi-binding of @HiltViewModelMap but none was found.", "Expected the @HiltViewModel-annotated class ");
                    }
                    return r1;
                }
                if (n00Var != null) {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (zkVar == null) {
                    m1.VgvYg0wo(cls.getName(), " using @AssistedInject but no creation callback was provided in CreationExtras.", "Found @HiltViewModel-annotated class ");
                    return r1;
                }
                ng0Var = (ng0) zkVar.ow5vqvCr(obj);
                r1 = ng0Var;
                Closeable closeable2 = new Closeable() { // from class: im
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        n30.this.qoPGr6Ce();
                    }
                };
                r1.getClass();
                og0Var = r1.qoPGr6Ce;
                if (og0Var.wxUZMvaN) {
                }
                return r1;
            default:
                p5 qoPGr6Ce = m20.qoPGr6Ce(cls);
                pg0[] pg0VarArr = (pg0[]) this.NCTxEWno;
                pg0[] pg0VarArr2 = (pg0[]) Arrays.copyOf(pg0VarArr, pg0VarArr.length);
                int length = pg0VarArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        pg0Var = pg0VarArr2[i];
                        if (!pg0Var.qoPGr6Ce.equals(qoPGr6Ce)) {
                            i++;
                        }
                    } else {
                        pg0Var = null;
                    }
                }
                r1 = pg0Var != null ? (ng0) pg0Var.NCTxEWno.ow5vqvCr(mtVar) : null;
                if (r1 != null) {
                    return r1;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + qoPGr6Ce.NCTxEWno()).toString());
        }
    }
}
