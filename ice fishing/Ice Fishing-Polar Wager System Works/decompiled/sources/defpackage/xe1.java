package defpackage;

/* loaded from: classes.dex */
public abstract class xe1 {
    static {
        new defpackage.ve1(3, null);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:10:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object IHQe1A4L2xu(defpackage.fe1 r5, boolean r6, defpackage.pv0 r7, defpackage.v7 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.we1
            if (r0 == 0) goto L13
            r0 = r8
            we1 r0 = (defpackage.we1) r0
            int r1 = r0.JlrlGoKF
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.JlrlGoKF = r1
            goto L18
        L13:
            we1 r0 = new we1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.ez2rX8ReCYw
            int r1 = r0.JlrlGoKF
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.SH1y5HwkJhh
            pv0 r6 = r0.riuEU0zW4
            fe1 r7 = r0.EXtogiMhuM
            defpackage.f70.nBH8hAHy(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.db.AARZUJiTa(r5)
            r5 = 0
            return r5
        L36:
            defpackage.f70.nBH8hAHy(r8)
        L39:
            r0.EXtogiMhuM = r5
            r0.riuEU0zW4 = r7
            r0.SH1y5HwkJhh = r6
            r0.JlrlGoKF = r2
            java.lang.Object r8 = r5.IHQe1A4L2xu(r7, r0)
            vj r1 = defpackage.vj.adDC3e2L
            if (r8 != r1) goto L4a
            return r1
        L4a:
            ov0 r8 = (defpackage.ov0) r8
            boolean r1 = r1MBDhnF(r8, r6)
            if (r1 == 0) goto L39
            java.util.List r5 = r8.IHQe1A4L2xu
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xe1.IHQe1A4L2xu(fe1, boolean, pv0, v7):java.lang.Object");
    }

    public static boolean r1MBDhnF(defpackage.ov0 ov0Var, boolean z) {
        java.util.List list = ov0Var.IHQe1A4L2xu;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                return true;
            }
            defpackage.sv0 sv0Var = (defpackage.sv0) list.get(i);
            if (!z) {
                z2 = defpackage.s70.JlrlGoKF(sv0Var);
            } else if (sv0Var.oh6vYeIP() || sv0Var.EXtogiMhuM || !sv0Var.F7NU4MC0GW) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i++;
        }
    }
}
