package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public final class ypf implements anr {
    public final /* synthetic */ zpf a;
    public final /* synthetic */ Object b;

    public ypf(zpf zpfVar, Object obj) {
        this.a = zpfVar;
        this.b = obj;
    }

    @Override // defpackage.anr
    public final void a() {
        zpf zpfVar = this.a;
        mpf mpfVar = zpfVar.a;
        zpfVar.d();
        mpf mpfVar2 = (mpf) zpfVar.j.k(this.b);
        if (mpfVar2 != null) {
            if (zpfVar.o <= 0) {
                sme.b("No pre-composed items to dispose");
            }
            int k = ((eqi) ((epi) mpfVar.p()).b).k(mpfVar2);
            if (k < ((eqi) ((epi) mpfVar.p()).b).c - zpfVar.o) {
                sme.b("Item is not in pre-composed item range");
            }
            zpfVar.n++;
            zpfVar.o--;
            int i = (((eqi) ((epi) mpfVar.p()).b).c - zpfVar.o) - zpfVar.n;
            mpfVar.q = true;
            mpfVar.K(k, i, 1);
            mpfVar.q = false;
            zpfVar.c(i);
        }
    }

    @Override // defpackage.anr
    public final int b() {
        mpf mpfVar = (mpf) this.a.j.g(this.b);
        if (mpfVar != null) {
            return ((eqi) ((epi) mpfVar.o()).b).c;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ne0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [xci] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [xci] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.anr
    public final void c(ne0 ne0Var) {
        cr crVar;
        xci xciVar;
        v9t v9tVar;
        mpf mpfVar = (mpf) this.a.j.g(this.b);
        if (mpfVar == null || (crVar = mpfVar.F) == null || (xciVar = (xci) crVar.f) == null) {
            return;
        }
        if (!xciVar.a.n) {
            sme.b("visitSubtreeIf called on an unattached node");
        }
        eqi eqiVar = new eqi(new xci[16]);
        xci xciVar2 = xciVar.a;
        xci xciVar3 = xciVar2.f;
        if (xciVar3 == null) {
            bcx.o(eqiVar, xciVar2);
        } else {
            eqiVar.d(xciVar3);
        }
        while (true) {
            int i = eqiVar.c;
            if (i == 0) {
                return;
            }
            xci xciVar4 = (xci) eqiVar.m(i - 1);
            if ((xciVar4.d & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                for (xci xciVar5 = xciVar4; xciVar5 != null; xciVar5 = xciVar5.f) {
                    if ((xciVar5.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                        cw7 cw7Var = xciVar5;
                        ?? r7 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof w9t) {
                                w9t w9tVar = (w9t) cw7Var;
                                if ("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(w9tVar.h())) {
                                    ne0Var.invoke(w9tVar);
                                    v9tVar = v9t.b;
                                } else {
                                    v9tVar = v9t.a;
                                }
                                if (v9tVar == v9t.c) {
                                    return;
                                }
                                if (v9tVar == v9t.b) {
                                    break;
                                }
                            } else if ((cw7Var.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar6 = cw7Var.p;
                                int i2 = 0;
                                cw7Var = cw7Var;
                                r7 = r7;
                                while (xciVar6 != null) {
                                    if ((xciVar6.c & SQLiteDatabase.OPEN_PRIVATECACHE) != 0) {
                                        i2++;
                                        r7 = r7;
                                        if (i2 == 1) {
                                            cw7Var = xciVar6;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r7.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r7.d(xciVar6);
                                        }
                                    }
                                    xciVar6 = xciVar6.f;
                                    cw7Var = cw7Var;
                                    r7 = r7;
                                }
                                if (i2 == 1) {
                                }
                            }
                            cw7Var = bcx.p(r7);
                        }
                    }
                }
            }
            bcx.o(eqiVar, xciVar4);
        }
    }

    @Override // defpackage.anr
    public final void d(int i, long j) {
        zpf zpfVar = this.a;
        mpf mpfVar = (mpf) zpfVar.j.g(this.b);
        if (mpfVar == null || !mpfVar.G()) {
            return;
        }
        int i2 = ((eqi) ((epi) mpfVar.o()).b).c;
        if (i < 0 || i >= i2) {
            sme.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (mpfVar.H()) {
            sme.a("Pre-measure called on node that is not placed");
        }
        mpf mpfVar2 = zpfVar.a;
        mpfVar2.q = true;
        ((AndroidComposeView) ppf.a(mpfVar)).v((mpf) ((epi) mpfVar.o()).get(i), j);
        mpfVar2.q = false;
    }
}
