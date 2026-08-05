package defpackage;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class n6 extends ej0 {
    public final /* synthetic */ int ygLcUYwZ;

    public /* synthetic */ n6(int i) {
        this.ygLcUYwZ = i;
    }

    @Override // defpackage.ej0
    public final void MdtA4re8(h40 h40Var, Object obj) {
        switch (this.ygLcUYwZ) {
            case 0:
                p6 p6Var = (p6) obj;
                h40Var.getClass();
                h40Var.qoPGr6Ce(1, p6Var.qoPGr6Ce);
                h40Var.qoPGr6Ce(2, p6Var.NCTxEWno);
                h40Var.qoPGr6Ce(3, p6Var.MdtA4re8);
                h40Var.qoPGr6Ce(4, p6Var.wxUZMvaN);
                break;
            case 1:
                xs xsVar = (xs) obj;
                h40Var.getClass();
                h40Var.qoPGr6Ce(1, xsVar.qoPGr6Ce);
                h40Var.MdtA4re8(xsVar.NCTxEWno, 2);
                h40Var.qoPGr6Ce(3, xsVar.MdtA4re8 ? 1L : 0L);
                h40Var.qoPGr6Ce(4, xsVar.wxUZMvaN);
                break;
            case 2:
                oy oyVar = (oy) obj;
                h40Var.getClass();
                h40Var.qoPGr6Ce(1, oyVar.qoPGr6Ce);
                h40Var.MdtA4re8(oyVar.NCTxEWno, 2);
                h40Var.MdtA4re8(oyVar.MdtA4re8, 3);
                h40Var.MdtA4re8(oyVar.wxUZMvaN, 4);
                h40Var.MdtA4re8(oyVar.VgvYg0wo, 5);
                h40Var.MdtA4re8(oyVar.P7K7Inc8, 6);
                h40Var.MdtA4re8(oyVar.b2ZJblxo, 7);
                h40Var.qoPGr6Ce(8, oyVar.Qr9iLBAD);
                h40Var.qoPGr6Ce(9, oyVar.jb9XjC4I);
                h40Var.MdtA4re8(oyVar.eVhOlqcC, 10);
                h40Var.MdtA4re8(oyVar.k3x7lurq, 11);
                h40Var.MdtA4re8(oyVar.ow5vqvCr, 12);
                h40Var.MdtA4re8(oyVar.OnDfzHZD, 13);
                h40Var.MdtA4re8(oyVar.ygLcUYwZ, 14);
                h40Var.qoPGr6Ce(15, oyVar.lDXGDhIF);
                h40Var.qoPGr6Ce(16, oyVar.sjUBp5pO);
                h40Var.qoPGr6Ce(17, oyVar.OxcuoDLp);
                h40Var.qoPGr6Ce(18, oyVar.amk52bBQ);
                break;
            default:
                z80 z80Var = (z80) obj;
                h40Var.getClass();
                h40Var.qoPGr6Ce(1, z80Var.qoPGr6Ce);
                h40Var.MdtA4re8(z80Var.NCTxEWno, 2);
                h40Var.qoPGr6Ce(3, z80Var.MdtA4re8);
                h40Var.qoPGr6Ce(4, z80Var.wxUZMvaN);
                h40Var.qoPGr6Ce(5, z80Var.VgvYg0wo);
                h40Var.MdtA4re8(z80Var.P7K7Inc8, 6);
                h40Var.MdtA4re8(z80Var.b2ZJblxo, 7);
                break;
        }
    }

    @Override // defpackage.ej0
    public final String ow5vqvCr() {
        switch (this.ygLcUYwZ) {
            case 0:
                return "INSERT OR REPLACE INTO `compares` (`id`,`leftId`,`rightId`,`comparedAt`) VALUES (nullif(?, 0),?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `mood_state` (`id`,`moodKey`,`introShown`,`ratingDismissedFor`) VALUES (?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `pairings` (`id`,`name`,`emoji`,`subtitle`,`description`,`sauceBase`,`intensity`,`intensityLevel`,`prepMinutes`,`cuisine`,`scope`,`tags`,`contextNote`,`flow`,`popularity`,`novelty`,`openedAt`,`rating`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `sprint_rounds` (`id`,`traitKey`,`elapsedMillis`,`accuracyPercent`,`finishedAt`,`correctOrder`,`userOrder`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }
}
