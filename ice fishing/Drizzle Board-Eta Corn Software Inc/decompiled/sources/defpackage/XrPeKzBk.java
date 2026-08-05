package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class XrPeKzBk implements Runnable {
    public Object MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public final Object wxUZMvaN;

    public /* synthetic */ XrPeKzBk(Object obj, int i, Object obj2) {
        this.NCTxEWno = i;
        this.wxUZMvaN = obj;
        this.MdtA4re8 = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        wr wrVar;
        uc ucVar;
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4 = this.NCTxEWno;
        int i5 = 1;
        Object obj = this.wxUZMvaN;
        switch (i4) {
            case 0:
                f7oeun2L f7oeun2l = (f7oeun2L) this.MdtA4re8;
                CTE3lpUp cTE3lpUp = (CTE3lpUp) obj;
                yr yrVar = cTE3lpUp.wxUZMvaN;
                if (yrVar != null && (wrVar = yrVar.VgvYg0wo) != null) {
                    wrVar.ygLcUYwZ(yrVar);
                }
                View view = (View) cTE3lpUp.jb9XjC4I;
                if (view != null && view.getWindowToken() != null) {
                    if (!f7oeun2l.NCTxEWno()) {
                        if (f7oeun2l.VgvYg0wo != null) {
                            f7oeun2l.wxUZMvaN(0, 0, false, false);
                        }
                    }
                    cTE3lpUp.I5GHvsYW = f7oeun2l;
                }
                cTE3lpUp.FySoLYna = null;
                return;
            case 1:
                ((YksF3V7p) this.MdtA4re8).qoPGr6Ce = obj;
                return;
            case 2:
                ((Application) this.MdtA4re8).unregisterActivityLifecycleCallbacks((YksF3V7p) obj);
                return;
            case 3:
                Object obj2 = this.MdtA4re8;
                try {
                    Method method = nJuO6ggC.wxUZMvaN;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        nJuO6ggC.VgvYg0wo.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                c1 c1Var = (c1) obj;
                e1 e1Var = c1Var.VgvYg0wo;
                if (e1Var.b2ZJblxo == c1Var.wxUZMvaN) {
                    List list = c1Var.MdtA4re8;
                    uc ucVar2 = (uc) this.MdtA4re8;
                    e1Var.VgvYg0wo = list;
                    e1Var.P7K7Inc8 = Collections.unmodifiableList(list);
                    tg0 tg0Var = e1Var.qoPGr6Ce;
                    int[] iArr2 = ucVar2.NCTxEWno;
                    ArrayList arrayList = ucVar2.qoPGr6Ce;
                    int i6 = ucVar2.VgvYg0wo;
                    tg0 tg0Var2 = ucVar2.wxUZMvaN;
                    f2 f2Var = new f2(tg0Var);
                    ArrayDeque arrayDeque = new ArrayDeque();
                    int i7 = ucVar2.P7K7Inc8;
                    int size = arrayList.size() - 1;
                    int i8 = i7;
                    int i9 = i6;
                    while (size >= 0) {
                        tc tcVar = (tc) arrayList.get(size);
                        int i10 = tcVar.qoPGr6Ce;
                        int i11 = tcVar.MdtA4re8;
                        int i12 = i5;
                        int i13 = i10 + i11;
                        int i14 = tcVar.NCTxEWno;
                        int i15 = i14 + i11;
                        e1 e1Var2 = e1Var;
                        while (i9 > i13) {
                            i9--;
                            int i16 = iArr2[i9];
                            if ((i16 & 12) != 0) {
                                int i17 = i16 >> 4;
                                i2 = i13;
                                iArr = iArr2;
                                vc qoPGr6Ce = uc.qoPGr6Ce(arrayDeque, i17, false);
                                if (qoPGr6Ce != null) {
                                    int i18 = (i6 - qoPGr6Ce.NCTxEWno) - 1;
                                    f2Var.MdtA4re8(i9, i18);
                                    if ((i16 & 4) != 0) {
                                        tg0Var2.U0LaHZX7(i9, i17);
                                        f2Var.NCTxEWno(i18, i12);
                                    }
                                } else {
                                    boolean z = i12;
                                    arrayDeque.add(new vc(i9, (i6 - i9) - (z ? 1 : 0), z));
                                }
                            } else {
                                i2 = i13;
                                iArr = iArr2;
                                if (f2Var.NCTxEWno != 2 || (i3 = f2Var.MdtA4re8) < i9 || i3 > i9 + 1) {
                                    f2Var.qoPGr6Ce();
                                    f2Var.MdtA4re8 = i9;
                                    f2Var.wxUZMvaN = 1;
                                    f2Var.NCTxEWno = 2;
                                } else {
                                    f2Var.wxUZMvaN++;
                                    f2Var.MdtA4re8 = i9;
                                }
                                i6--;
                            }
                            i13 = i2;
                            iArr2 = iArr;
                            i12 = 1;
                        }
                        int[] iArr3 = iArr2;
                        while (i8 > i15) {
                            i8--;
                            int i19 = ucVar2.MdtA4re8[i8];
                            if ((i19 & 12) != 0) {
                                int i20 = i19 >> 4;
                                ucVar = ucVar2;
                                vc qoPGr6Ce2 = uc.qoPGr6Ce(arrayDeque, i20, true);
                                if (qoPGr6Ce2 == null) {
                                    arrayDeque.add(new vc(i8, i6 - i9, false));
                                } else {
                                    f2Var.MdtA4re8((i6 - qoPGr6Ce2.NCTxEWno) - 1, i9);
                                    if ((i19 & 4) != 0) {
                                        tg0Var2.U0LaHZX7(i20, i8);
                                        f2Var.NCTxEWno(i9, 1);
                                    }
                                }
                            } else {
                                ucVar = ucVar2;
                                if (f2Var.NCTxEWno == 1 && i9 >= (i = f2Var.MdtA4re8)) {
                                    int i21 = f2Var.wxUZMvaN;
                                    if (i9 <= i + i21) {
                                        f2Var.wxUZMvaN = i21 + 1;
                                        f2Var.MdtA4re8 = Math.min(i9, i);
                                        i6++;
                                    }
                                }
                                f2Var.qoPGr6Ce();
                                f2Var.MdtA4re8 = i9;
                                f2Var.wxUZMvaN = 1;
                                f2Var.NCTxEWno = 1;
                                i6++;
                            }
                            ucVar2 = ucVar;
                        }
                        uc ucVar3 = ucVar2;
                        int i22 = i14;
                        int i23 = i10;
                        for (int i24 = 0; i24 < i11; i24++) {
                            if ((iArr3[i23] & 15) == 2) {
                                tg0Var2.U0LaHZX7(i23, i22);
                                f2Var.NCTxEWno(i23, 1);
                            }
                            i23++;
                            i22++;
                        }
                        size--;
                        ucVar2 = ucVar3;
                        i5 = 1;
                        i8 = i14;
                        i9 = i10;
                        e1Var = e1Var2;
                        iArr2 = iArr3;
                    }
                    f2Var.qoPGr6Ce();
                    e1Var.qoPGr6Ce();
                    return;
                }
                return;
            case 5:
                Typeface typeface = (Typeface) obj;
                ej0 ej0Var = (ej0) ((ya0) this.MdtA4re8).MdtA4re8;
                if (ej0Var != null) {
                    ej0Var.eIA6dogk(typeface);
                    return;
                }
                return;
            case 6:
                ((m3) this.MdtA4re8).U0LaHZX7((em) obj);
                return;
            case 7:
                zo zoVar = (zo) obj;
                n9 n9Var = zoVar.VgvYg0wo;
                int i25 = 0;
                while (true) {
                    try {
                        ((Runnable) this.MdtA4re8).run();
                    } catch (Throwable th2) {
                        ej0.gjV1z5T1(uf.NCTxEWno, th2);
                    }
                    Runnable DK9slbsy = zoVar.DK9slbsy();
                    if (DK9slbsy == null) {
                        return;
                    }
                    this.MdtA4re8 = DK9slbsy;
                    i25++;
                    if (i25 >= 16 && n9Var.gjV1z5T1(zoVar)) {
                        n9Var.RXQxj5Oe(zoVar, this);
                        return;
                    }
                }
                break;
            case 8:
                ((xh) this.MdtA4re8).accept(obj);
                return;
            default:
                ((m3) obj).U0LaHZX7((kg) this.MdtA4re8);
                return;
        }
    }

    public /* synthetic */ XrPeKzBk(Object obj, Object obj2, int i, boolean z) {
        this.NCTxEWno = i;
        this.MdtA4re8 = obj;
        this.wxUZMvaN = obj2;
    }
}
