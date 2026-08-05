package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class x80 implements zk {
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ x80(int i) {
        this.NCTxEWno = i;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        h40 Ey6iv0m0;
        switch (this.NCTxEWno) {
            case 0:
                f40 f40Var = (f40) obj;
                f40Var.getClass();
                Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT * FROM sprint_rounds ORDER BY finishedAt DESC");
                try {
                    int sjUBp5pO = le0.sjUBp5pO(Ey6iv0m0, "id");
                    int sjUBp5pO2 = le0.sjUBp5pO(Ey6iv0m0, "traitKey");
                    int sjUBp5pO3 = le0.sjUBp5pO(Ey6iv0m0, "elapsedMillis");
                    int sjUBp5pO4 = le0.sjUBp5pO(Ey6iv0m0, "accuracyPercent");
                    int sjUBp5pO5 = le0.sjUBp5pO(Ey6iv0m0, "finishedAt");
                    int sjUBp5pO6 = le0.sjUBp5pO(Ey6iv0m0, "correctOrder");
                    int sjUBp5pO7 = le0.sjUBp5pO(Ey6iv0m0, "userOrder");
                    ArrayList arrayList = new ArrayList();
                    while (Ey6iv0m0.amk52bBQ()) {
                        arrayList.add(new z80(Ey6iv0m0.getLong(sjUBp5pO), Ey6iv0m0.wxUZMvaN(sjUBp5pO2), Ey6iv0m0.getLong(sjUBp5pO3), (int) Ey6iv0m0.getLong(sjUBp5pO4), Ey6iv0m0.getLong(sjUBp5pO5), Ey6iv0m0.wxUZMvaN(sjUBp5pO6), Ey6iv0m0.wxUZMvaN(sjUBp5pO7)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                f40 f40Var2 = (f40) obj;
                f40Var2.getClass();
                Ey6iv0m0 = f40Var2.Ey6iv0m0("SELECT * FROM sprint_rounds ORDER BY finishedAt DESC LIMIT 1");
                try {
                    return Ey6iv0m0.amk52bBQ() ? new z80(Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "id")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "traitKey")), Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "elapsedMillis")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "accuracyPercent")), Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "finishedAt")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "correctOrder")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "userOrder"))) : null;
                } finally {
                }
            case 2:
                f40 f40Var3 = (f40) obj;
                f40Var3.getClass();
                Ey6iv0m0 = f40Var3.Ey6iv0m0("SELECT COUNT(*) FROM sprint_rounds");
                try {
                    int i = Ey6iv0m0.amk52bBQ() ? (int) Ey6iv0m0.getLong(0) : 0;
                    Ey6iv0m0.close();
                    return Integer.valueOf(i);
                } finally {
                }
            case 3:
                xx xxVar = (xx) obj;
                xxVar.getClass();
                return xxVar.NCTxEWno;
            case 4:
                h40 h40Var = (h40) obj;
                h40Var.getClass();
                return Boolean.valueOf(h40Var.amk52bBQ());
            default:
                h40 h40Var2 = (h40) obj;
                h40Var2.getClass();
                o60 o60Var = new o60();
                while (h40Var2.amk52bBQ()) {
                    o60Var.add(Integer.valueOf((int) h40Var2.getLong(0)));
                }
                return g50.qoPGr6Ce(o60Var);
        }
    }
}
