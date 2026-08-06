package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class ck0 {
    public static final zf0 GWasM1elztuh;

    static {
        zf0 zf0Var = pk0.GWasM1elztuh;
        GWasM1elztuh = new zf0();
    }

    public static final boolean AvO7iQsrTN(int i) {
        return ((i & 128) != 0) | ((i & 4194304) != 0);
    }

    public static final int EljAMC1QTz(he0 he0Var) {
        if (!(he0Var instanceof yk)) {
            return OOA6hdeuvCS(he0Var);
        }
        yk ykVar = (yk) he0Var;
        int i = ykVar.mE4lRynR;
        for (he0 he0Var2 = ykVar.jivtDDk9H; he0Var2 != null; he0Var2 = he0Var2.JFJ3QoxA) {
            i |= EljAMC1QTz(he0Var2);
        }
        return i;
    }

    public static final void GWasM1elztuh(he0 he0Var, int i, int i2) {
        if (!(he0Var instanceof yk)) {
            Yi7zF1RB1(he0Var, i & he0Var.AvO7iQsrTN, i2);
            return;
        }
        yk ykVar = (yk) he0Var;
        int i3 = ykVar.mE4lRynR;
        Yi7zF1RB1(he0Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (he0 he0Var2 = ykVar.jivtDDk9H; he0Var2 != null; he0Var2 = he0Var2.JFJ3QoxA) {
            GWasM1elztuh(he0Var2, i4, i2);
        }
    }

    public static final int OOA6hdeuvCS(he0 he0Var) {
        int i = he0Var.AvO7iQsrTN;
        if (i != 0) {
            return i;
        }
        Class<?> cls = he0Var.getClass();
        zf0 zf0Var = GWasM1elztuh;
        int xqGvceK5x = zf0Var.xqGvceK5x(cls);
        if (xqGvceK5x >= 0) {
            return zf0Var.X1lG3V04pd[xqGvceK5x];
        }
        int i2 = he0Var instanceof w50 ? 3 : 1;
        if (he0Var instanceof go) {
            i2 |= 4;
        }
        if (he0Var instanceof b01) {
            i2 |= 8;
        }
        if (he0Var instanceof nq0) {
            i2 |= 16;
        }
        if (he0Var instanceof ke0) {
            i2 |= 32;
        }
        if (he0Var instanceof go0) {
            i2 |= 64;
        }
        if (he0Var instanceof l50) {
            i2 |= 4194432;
        } else if (he0Var instanceof ed0) {
            i2 |= 128;
        }
        if (he0Var instanceof gy) {
            i2 |= 256;
        }
        if (he0Var instanceof rt) {
            i2 |= 1024;
        }
        boolean z = he0Var instanceof g6;
        if (z) {
            i2 |= 2048;
        }
        if (z) {
            i2 |= 4096;
        }
        if (he0Var instanceof y40) {
            i2 |= 8192;
        }
        if (he0Var instanceof PCrRnrghk5) {
            i2 |= 16384;
        }
        if (he0Var instanceof ef) {
            i2 |= 32768;
        }
        if (he0Var instanceof va1) {
            i2 |= 262144;
        }
        if (he0Var instanceof w7) {
            i2 |= 524288;
        }
        if (he0Var instanceof g10) {
            i2 |= 2097152;
        }
        if (he0Var instanceof i70) {
            i2 |= 8388608;
        }
        zf0Var.AvO7iQsrTN(i2, cls);
        return i2;
    }

    public static final void X1lG3V04pd(he0 he0Var) {
        if (!he0Var.Mjvvu5DE) {
            t10.Yi7zF1RB1("autoInvalidateUpdatedNode called on unattached node");
        }
        GWasM1elztuh(he0Var, -1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void Yi7zF1RB1(he0 he0Var, int i, int i2) {
        if (i2 != 0 || he0Var.UjhVk5crk()) {
            if ((i & 2) != 0 && (he0Var instanceof w50)) {
                n4.XnEVoBF0td1l((w50) he0Var);
                if (i2 == 2) {
                    vc0.AEn1Rrio(he0Var, 2).Jz7YUlEP53();
                }
            }
            if ((i & 128) != 0 && i2 != 2) {
                vc0.eUH21U3apd(he0Var).ozMwhSAI();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                vc0.eUH21U3apd(he0Var).J3Xc8BaqpN8(false);
            }
            if ((i & 256) != 0 && (he0Var instanceof gy)) {
                if (i2 == 1) {
                    g60 eUH21U3apd = vc0.eUH21U3apd(he0Var);
                    eUH21U3apd.mqNvfisv7(eUH21U3apd.z19UFEN2I + 1);
                } else if (i2 == 2) {
                    vc0.eUH21U3apd(he0Var).mqNvfisv7(r0.z19UFEN2I - 1);
                }
                if (i2 != 2) {
                    g60 eUH21U3apd2 = vc0.eUH21U3apd(he0Var);
                    if (eUH21U3apd2.z19UFEN2I != 0 && !eUH21U3apd2.WIEu4Ya2g8() && !eUH21U3apd2.YmKjaVtbfp5Z() && !eUH21U3apd2.VeqTn1PQw7) {
                        c cVar = (c) j60.GWasM1elztuh(eUH21U3apd2);
                        d dVar = cVar.c4eaifQP.OOA6hdeuvCS;
                        dVar.getClass();
                        if (eUH21U3apd2.z19UFEN2I > 0) {
                            ((rg0) dVar.EljAMC1QTz).Yi7zF1RB1(eUH21U3apd2);
                            eUH21U3apd2.VeqTn1PQw7 = true;
                        }
                        cVar.ozMwhSAI(null);
                    }
                }
            }
            if ((i & 4) != 0 && (he0Var instanceof go)) {
                p.uFEq9NpZ((go) he0Var);
            }
            if ((i & 8) != 0 && (he0Var instanceof b01)) {
                vc0.eUH21U3apd(he0Var).Y6hRI1cF8 = true;
            }
            if ((i & 64) != 0 && (he0Var instanceof go0)) {
                k60 k60Var = vc0.eUH21U3apd((go0) he0Var).MZhzXH72;
                k60Var.WIEu4Ya2g8.Y6hRI1cF8 = true;
                ac0 ac0Var = k60Var.YmKjaVtbfp5Z;
                if (ac0Var != null) {
                    ac0Var.pog2g9KITJA = true;
                }
            }
            if ((i & 2048) != 0 && (he0Var instanceof g6)) {
                ge0 ge0Var = ((g6) he0Var).mE4lRynR;
                t10.Yi7zF1RB1("applyFocusProperties called on wrong node");
                ge0Var.getClass();
                o4.YmKjaVtbfp5Z();
                return;
            }
            if ((i & 4096) != 0 && (he0Var instanceof g6)) {
                g6 g6Var = (g6) he0Var;
                ht htVar = ((nt) ((c) vc0.A1EKNP6CxJ(g6Var)).getFocusOwner()).xqGvceK5x;
                if (htVar.xqGvceK5x.GWasM1elztuh(g6Var)) {
                    htVar.GWasM1elztuh();
                }
            }
            if ((i & 2097152) != 0 && (he0Var instanceof g10) && i2 == 2) {
                ((g10) he0Var).lv06NcmrQ();
            }
        }
    }

    public static final int xqGvceK5x(ge0 ge0Var) {
        int i = ge0Var instanceof fo ? 5 : 1;
        if (ge0Var instanceof l4) {
            i |= 8;
        }
        if (ge0Var instanceof v2) {
            i |= 64;
        }
        return ge0Var instanceof w7 ? 524288 | i : i;
    }
}
