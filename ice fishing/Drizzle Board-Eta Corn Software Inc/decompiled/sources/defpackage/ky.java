package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final /* synthetic */ class ky implements zk {
    public final /* synthetic */ long MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ ky(int i, long j) {
        this.NCTxEWno = i;
        this.MdtA4re8 = j;
    }

    @Override // defpackage.zk
    public final Object ow5vqvCr(Object obj) {
        h40 Ey6iv0m0;
        int i = this.NCTxEWno;
        long j = this.MdtA4re8;
        f40 f40Var = (f40) obj;
        switch (i) {
            case 0:
                f40Var.getClass();
                Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT * FROM pairings WHERE id = ?");
                try {
                    Ey6iv0m0.qoPGr6Ce(1, j);
                    return Ey6iv0m0.amk52bBQ() ? new oy(Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "id")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "name")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "emoji")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "subtitle")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "description")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "sauceBase")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "intensity")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "intensityLevel")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "prepMinutes")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "cuisine")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "scope")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "tags")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "contextNote")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "flow")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "popularity")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "novelty")), Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "openedAt")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "rating"))) : null;
                } finally {
                }
            default:
                f40Var.getClass();
                Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT * FROM sprint_rounds WHERE id = ?");
                try {
                    Ey6iv0m0.qoPGr6Ce(1, j);
                    return Ey6iv0m0.amk52bBQ() ? new z80(Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "id")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "traitKey")), Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "elapsedMillis")), (int) Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "accuracyPercent")), Ey6iv0m0.getLong(le0.sjUBp5pO(Ey6iv0m0, "finishedAt")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "correctOrder")), Ey6iv0m0.wxUZMvaN(le0.sjUBp5pO(Ey6iv0m0, "userOrder"))) : null;
                } finally {
                }
        }
    }
}
