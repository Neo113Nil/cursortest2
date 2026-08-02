package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class bu9 {
    public final dfb a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();

    public bu9(dfb dfbVar) {
        this.a = dfbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(String str, String str2) {
        Unit unit = null;
        cjs cjsVar = this.c.contains(str) ? (cjs) this.b.get(str) : null;
        if (cjsVar != null) {
            mgs mgsVar = cjsVar.j;
            switch (str2.hashCode()) {
                case -1367724422:
                    if (str2.equals("cancel")) {
                        mgsVar.a();
                        break;
                    }
                    cjsVar.c.d(new IllegalArgumentException(str2.concat(" is unsupported timer command!")));
                    break;
                case -934426579:
                    if (str2.equals("resume")) {
                        String str3 = mgsVar.a;
                        int D = ouj.D(mgsVar.k);
                        if (D == 0) {
                            mgsVar.e("The timer '" + str3 + "' is stopped!");
                            break;
                        } else if (D == 1) {
                            mgsVar.e("The timer '" + str3 + "' already working!");
                            break;
                        } else if (D == 2) {
                            mgsVar.k = 2;
                            mgsVar.n = -1L;
                            mgsVar.g();
                            break;
                        }
                    }
                    cjsVar.c.d(new IllegalArgumentException(str2.concat(" is unsupported timer command!")));
                    break;
                case 3540994:
                    if (str2.equals("stop")) {
                        int D2 = ouj.D(mgsVar.k);
                        if (D2 == 0) {
                            mgsVar.e("The timer '" + mgsVar.a + "' already stopped!");
                            break;
                        } else if (D2 == 1 || D2 == 2) {
                            mgsVar.k = 1;
                            mgsVar.d.invoke(Long.valueOf(mgsVar.d()));
                            mgsVar.b();
                            mgsVar.f();
                            break;
                        }
                    }
                    cjsVar.c.d(new IllegalArgumentException(str2.concat(" is unsupported timer command!")));
                    break;
                case 106440182:
                    if (str2.equals("pause")) {
                        String str4 = mgsVar.a;
                        int D3 = ouj.D(mgsVar.k);
                        if (D3 == 0) {
                            mgsVar.e("The timer '" + str4 + "' already stopped!");
                            break;
                        } else if (D3 == 1) {
                            mgsVar.k = 3;
                            mgsVar.b.invoke(Long.valueOf(mgsVar.d()));
                            mgsVar.h();
                            mgsVar.m = -1L;
                            break;
                        } else if (D3 == 2) {
                            mgsVar.e("The timer '" + str4 + "' already paused!");
                            break;
                        }
                    }
                    cjsVar.c.d(new IllegalArgumentException(str2.concat(" is unsupported timer command!")));
                    break;
                case 108404047:
                    if (str2.equals("reset")) {
                        mgsVar.a();
                        mgsVar.j();
                        break;
                    }
                    cjsVar.c.d(new IllegalArgumentException(str2.concat(" is unsupported timer command!")));
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        mgsVar.j();
                        break;
                    }
                    cjsVar.c.d(new IllegalArgumentException(str2.concat(" is unsupported timer command!")));
                    break;
                default:
                    cjsVar.c.d(new IllegalArgumentException(str2.concat(" is unsupported timer command!")));
                    break;
            }
            unit = Unit.a;
        }
        if (unit == null) {
            this.a.d(new IllegalArgumentException(hrg.q("Timer with id '", str, "' does not exist!")));
        }
    }

    public final void b(gc8 gc8Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            cjs cjsVar = (cjs) this.b.get((String) it.next());
            if (cjsVar != null && !gc8Var.equals(cjsVar.e)) {
                cjsVar.e = gc8Var;
                if (cjsVar.i) {
                    cjsVar.j.g();
                    cjsVar.i = false;
                }
            }
        }
    }

    public final void c(gc8 gc8Var) {
        for (cjs cjsVar : this.b.values()) {
            if (gc8Var.equals(cjsVar.e)) {
                cjsVar.e = null;
                cjsVar.j.h();
                cjsVar.i = true;
            }
        }
    }
}
