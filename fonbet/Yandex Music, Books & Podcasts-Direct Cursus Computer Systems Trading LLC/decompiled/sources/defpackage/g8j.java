package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public abstract class g8j {
    public static final cpi a;

    static {
        cpi cpiVar = uhj.a;
        a = new cpi();
    }

    public static final void a(xci xciVar, int i, int i2) {
        if (!(xciVar instanceof cw7)) {
            b(xciVar, i & xciVar.c, i2);
            return;
        }
        cw7 cw7Var = (cw7) xciVar;
        int i3 = cw7Var.o;
        b(xciVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (xci xciVar2 = cw7Var.p; xciVar2 != null; xciVar2 = xciVar2.f) {
            a(xciVar2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(xci xciVar, int i, int i2) {
        if (i2 != 0 || xciVar.H0()) {
            if ((i & 2) != 0 && (xciVar instanceof epf)) {
                h4a.z((epf) xciVar);
                if (i2 == 2) {
                    f8j D = bcx.D(xciVar, 2);
                    D.o = true;
                    D.D.invoke();
                    if (D.F != null) {
                        if (D.G != null) {
                            D.G = null;
                        }
                        D.x1(false, null);
                        D.l.V(false);
                    }
                }
            }
            if ((i & 128) != 0 && (xciVar instanceof qof) && i2 != 2) {
                bcx.F(xciVar).D();
            }
            if ((i & 256) != 0 && (xciVar instanceof amd) && i2 != 2) {
                mpf F = bcx.F(xciVar);
                if (!F.q() && !F.r() && !F.Z) {
                    AndroidComposeView androidComposeView = (AndroidComposeView) ppf.a(F);
                    ((eqi) androidComposeView.v0.e.b).d(F);
                    F.Z = true;
                    androidComposeView.G(null);
                }
            }
            if ((i & 4) != 0 && (xciVar instanceof ipa)) {
                vq1.Z((ipa) xciVar);
            }
            if ((i & 8) != 0 && (xciVar instanceof ofp)) {
                bcx.F(xciVar).r = true;
            }
            if ((i & 64) != 0 && (xciVar instanceof a7k)) {
                qpf qpfVar = bcx.F((a7k) xciVar).G;
                qpfVar.p.r = true;
                zwg zwgVar = qpfVar.q;
                if (zwgVar != null) {
                    zwgVar.w = true;
                }
            }
            if ((i & 2048) != 0 && (xciVar instanceof xoc)) {
                xoc xocVar = (xoc) xciVar;
                jt3.b = null;
                xocVar.r(jt3.a);
                if (jt3.b != null) {
                    xci xciVar2 = (xci) xocVar;
                    if (!xciVar2.a.n) {
                        sme.b("visitChildren called on an unattached node");
                    }
                    eqi eqiVar = new eqi(new xci[16]);
                    xci xciVar3 = xciVar2.a;
                    xci xciVar4 = xciVar3.f;
                    if (xciVar4 == null) {
                        bcx.o(eqiVar, xciVar3);
                    } else {
                        eqiVar.d(xciVar4);
                    }
                    while (true) {
                        int i3 = eqiVar.c;
                        if (i3 == 0) {
                            break;
                        }
                        xci xciVar5 = (xci) eqiVar.m(i3 - 1);
                        if ((xciVar5.d & 1024) == 0) {
                            bcx.o(eqiVar, xciVar5);
                        } else {
                            while (true) {
                                if (xciVar5 == null) {
                                    break;
                                }
                                if ((xciVar5.c & 1024) != 0) {
                                    eqi eqiVar2 = null;
                                    while (xciVar5 != null) {
                                        if (xciVar5 instanceof dpc) {
                                            dpc dpcVar = (dpc) xciVar5;
                                            roc rocVar = ((uoc) bcx.G(dpcVar).getFocusOwner()).g;
                                            if (rocVar.d.a(dpcVar) && !rocVar.f) {
                                                rocVar.a.invoke(new ceb(0, rocVar, roc.class, "invalidateNodes", "invalidateNodes()V", 0, 26));
                                                rocVar.f = true;
                                            }
                                        } else if ((xciVar5.c & 1024) != 0 && (xciVar5 instanceof cw7)) {
                                            int i4 = 0;
                                            for (xci xciVar6 = ((cw7) xciVar5).p; xciVar6 != null; xciVar6 = xciVar6.f) {
                                                if ((xciVar6.c & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        xciVar5 = xciVar6;
                                                    } else {
                                                        if (eqiVar2 == null) {
                                                            eqiVar2 = new eqi(new xci[16]);
                                                        }
                                                        if (xciVar5 != null) {
                                                            eqiVar2.d(xciVar5);
                                                            xciVar5 = null;
                                                        }
                                                        eqiVar2.d(xciVar6);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        xciVar5 = bcx.p(eqiVar2);
                                    }
                                } else {
                                    xciVar5 = xciVar5.f;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(xciVar instanceof moc)) {
                return;
            }
            moc mocVar = (moc) xciVar;
            roc rocVar2 = ((uoc) bcx.G(mocVar).getFocusOwner()).g;
            if (!rocVar2.e.a(mocVar) || rocVar2.f) {
                return;
            }
            rocVar2.a.invoke(new ceb(0, rocVar2, roc.class, "invalidateNodes", "invalidateNodes()V", 0, 26));
            rocVar2.f = true;
        }
    }

    public static final void c(xci xciVar) {
        if (!xciVar.n) {
            sme.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(xciVar, -1, 0);
    }

    public static final int d(wci wciVar) {
        int i = wciVar instanceof cpf ? 3 : 1;
        if (wciVar instanceof aje) {
            i |= 4;
        }
        if (wciVar instanceof mfp) {
            i |= 8;
        }
        if (wciVar instanceof tfm) {
            i |= 16;
        }
        if ((wciVar instanceof zci) || (wciVar instanceof cdi)) {
            i |= 32;
        }
        if (wciVar instanceof ih2) {
            i |= 256;
        }
        if (wciVar instanceof z6k) {
            i |= 64;
        }
        return wciVar instanceof ih3 ? 524288 | i : i;
    }

    public static final int e(xci xciVar) {
        int i = xciVar.c;
        if (i != 0) {
            return i;
        }
        Class<?> cls = xciVar.getClass();
        cpi cpiVar = a;
        int d = cpiVar.d(cls);
        if (d >= 0) {
            return cpiVar.c[d];
        }
        int i2 = xciVar instanceof epf ? 3 : 1;
        if (xciVar instanceof ipa) {
            i2 |= 4;
        }
        if (xciVar instanceof ofp) {
            i2 |= 8;
        }
        if (xciVar instanceof ofm) {
            i2 |= 16;
        }
        if (xciVar instanceof bdi) {
            i2 |= 32;
        }
        if (xciVar instanceof a7k) {
            i2 |= 64;
        }
        if (xciVar instanceof qof) {
            i2 |= 128;
        }
        if (xciVar instanceof amd) {
            i2 |= 256;
        }
        if (xciVar instanceof dpc) {
            i2 |= 1024;
        }
        if (xciVar instanceof xoc) {
            i2 |= 2048;
        }
        if (xciVar instanceof moc) {
            i2 |= 4096;
        }
        if (xciVar instanceof waf) {
            i2 |= RemoteCameraConfig.Notification.ID;
        }
        if (xciVar instanceof hfo) {
            i2 |= 16384;
        }
        if (xciVar instanceof yr5) {
            i2 |= SQLiteDatabase.OPEN_NOMUTEX;
        }
        if (xciVar instanceof w9t) {
            i2 |= SQLiteDatabase.OPEN_PRIVATECACHE;
        }
        if (xciVar instanceof ih3) {
            i2 |= 524288;
        }
        cpiVar.i(i2, cls);
        return i2;
    }

    public static final int f(xci xciVar) {
        if (!(xciVar instanceof cw7)) {
            return e(xciVar);
        }
        cw7 cw7Var = (cw7) xciVar;
        int i = cw7Var.o;
        for (xci xciVar2 = cw7Var.p; xciVar2 != null; xciVar2 = xciVar2.f) {
            i |= f(xciVar2);
        }
        return i;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
