package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class VM67d7Sv {
    public final Object MdtA4re8;
    public final Object NCTxEWno;
    public Object P7K7Inc8;
    public Object VgvYg0wo;
    public int qoPGr6Ce;
    public Object wxUZMvaN;

    public VM67d7Sv(l10 l10Var) {
        this.NCTxEWno = new zz(30);
        this.MdtA4re8 = new ArrayList();
        this.wxUZMvaN = new ArrayList();
        this.qoPGr6Ce = 0;
        this.VgvYg0wo = l10Var;
        this.P7K7Inc8 = new tg0(23, this);
    }

    public int Ey6iv0m0(int i, int i2) {
        int i3;
        int i4;
        zz zzVar = (zz) this.NCTxEWno;
        ArrayList arrayList = (ArrayList) this.wxUZMvaN;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            FzsqRtM7 fzsqRtM7 = (FzsqRtM7) arrayList.get(size);
            int i5 = fzsqRtM7.qoPGr6Ce;
            int i6 = fzsqRtM7.NCTxEWno;
            if (i5 == 8) {
                int i7 = fzsqRtM7.wxUZMvaN;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            fzsqRtM7.NCTxEWno = i6 + 1;
                            fzsqRtM7.wxUZMvaN = i7 + 1;
                        } else if (i2 == 2) {
                            fzsqRtM7.NCTxEWno = i6 - 1;
                            fzsqRtM7.wxUZMvaN = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        fzsqRtM7.wxUZMvaN = i7 + 1;
                    } else if (i2 == 2) {
                        fzsqRtM7.wxUZMvaN = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        fzsqRtM7.NCTxEWno = i6 + 1;
                    } else if (i2 == 2) {
                        fzsqRtM7.NCTxEWno = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= fzsqRtM7.wxUZMvaN;
                } else if (i5 == 2) {
                    i += fzsqRtM7.wxUZMvaN;
                }
            } else if (i2 == 1) {
                fzsqRtM7.NCTxEWno = i6 + 1;
            } else if (i2 == 2) {
                fzsqRtM7.NCTxEWno = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            FzsqRtM7 fzsqRtM72 = (FzsqRtM7) arrayList.get(size2);
            int i8 = fzsqRtM72.qoPGr6Ce;
            int i9 = fzsqRtM72.wxUZMvaN;
            if (i8 == 8) {
                if (i9 == fzsqRtM72.NCTxEWno || i9 < 0) {
                    arrayList.remove(size2);
                    fzsqRtM72.MdtA4re8 = null;
                    zzVar.MdtA4re8(fzsqRtM72);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                fzsqRtM72.MdtA4re8 = null;
                zzVar.MdtA4re8(fzsqRtM72);
            }
        }
        return i;
    }

    public void KlHjfFWx(PorterDuff.Mode mode) {
        rc0 rc0Var = (rc0) this.VgvYg0wo;
        if (rc0Var == null) {
            rc0Var = new rc0();
            this.VgvYg0wo = rc0Var;
        }
        rc0Var.NCTxEWno = mode;
        rc0Var.MdtA4re8 = true;
        qoPGr6Ce();
    }

    public void MdtA4re8() {
        ArrayList arrayList = (ArrayList) this.wxUZMvaN;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((l10) this.VgvYg0wo).qoPGr6Ce((FzsqRtM7) arrayList.get(i));
        }
        sjUBp5pO(arrayList);
        this.qoPGr6Ce = 0;
    }

    public boolean NCTxEWno(int i) {
        ArrayList arrayList = (ArrayList) this.wxUZMvaN;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FzsqRtM7 fzsqRtM7 = (FzsqRtM7) arrayList.get(i2);
            int i3 = fzsqRtM7.qoPGr6Ce;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = fzsqRtM7.NCTxEWno;
                    int i5 = fzsqRtM7.wxUZMvaN + i4;
                    while (i4 < i5) {
                        if (b2ZJblxo(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (b2ZJblxo(fzsqRtM7.wxUZMvaN, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void OnDfzHZD(int i) {
        ColorStateList colorStateList;
        this.qoPGr6Ce = i;
        j5BPOSYv j5bposyv = (j5BPOSYv) this.MdtA4re8;
        if (j5bposyv != null) {
            Context context = ((View) this.NCTxEWno).getContext();
            synchronized (j5bposyv) {
                colorStateList = j5bposyv.qoPGr6Ce.b2ZJblxo(context, i);
            }
        } else {
            colorStateList = null;
        }
        OxcuoDLp(colorStateList);
        qoPGr6Ce();
    }

    public void OxcuoDLp(ColorStateList colorStateList) {
        if (colorStateList != null) {
            rc0 rc0Var = (rc0) this.wxUZMvaN;
            if (rc0Var == null) {
                rc0Var = new rc0();
                this.wxUZMvaN = rc0Var;
            }
            rc0Var.qoPGr6Ce = colorStateList;
            rc0Var.wxUZMvaN = true;
        } else {
            this.wxUZMvaN = null;
        }
        qoPGr6Ce();
    }

    public void P7K7Inc8(FzsqRtM7 fzsqRtM7, int i) {
        l10 l10Var = (l10) this.VgvYg0wo;
        l10Var.qoPGr6Ce(fzsqRtM7);
        int i2 = fzsqRtM7.qoPGr6Ce;
        if (i2 != 2) {
            if (i2 == 4) {
                l10Var.MdtA4re8(i, fzsqRtM7.wxUZMvaN, fzsqRtM7.MdtA4re8);
                return;
            } else {
                m1.sjUBp5pO("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = fzsqRtM7.wxUZMvaN;
        RecyclerView recyclerView = l10Var.qoPGr6Ce;
        recyclerView.VhgXwMj9(i, i3, true);
        recyclerView.LvHlPNBd = true;
        recyclerView.pP9Y2m6O.NCTxEWno += i3;
    }

    public ColorStateList Qr9iLBAD() {
        rc0 rc0Var = (rc0) this.VgvYg0wo;
        if (rc0Var != null) {
            return rc0Var.qoPGr6Ce;
        }
        return null;
    }

    public void VgvYg0wo(FzsqRtM7 fzsqRtM7) {
        int i;
        zz zzVar = (zz) this.NCTxEWno;
        int i2 = fzsqRtM7.qoPGr6Ce;
        if (i2 == 1 || i2 == 8) {
            m1.sjUBp5pO("should not dispatch add or move for pre layout");
            return;
        }
        int Ey6iv0m0 = Ey6iv0m0(fzsqRtM7.NCTxEWno, i2);
        int i3 = fzsqRtM7.NCTxEWno;
        int i4 = fzsqRtM7.qoPGr6Ce;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                m1.lDXGDhIF(fzsqRtM7, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < fzsqRtM7.wxUZMvaN; i6++) {
            int Ey6iv0m02 = Ey6iv0m0((i * i6) + fzsqRtM7.NCTxEWno, fzsqRtM7.qoPGr6Ce);
            int i7 = fzsqRtM7.qoPGr6Ce;
            if (i7 == 2 ? Ey6iv0m02 != Ey6iv0m0 : !(i7 == 4 && Ey6iv0m02 == Ey6iv0m0 + 1)) {
                FzsqRtM7 k3x7lurq = k3x7lurq(fzsqRtM7.MdtA4re8, i7, Ey6iv0m0, i5);
                P7K7Inc8(k3x7lurq, i3);
                k3x7lurq.MdtA4re8 = null;
                zzVar.MdtA4re8(k3x7lurq);
                if (fzsqRtM7.qoPGr6Ce == 4) {
                    i3 += i5;
                }
                i5 = 1;
                Ey6iv0m0 = Ey6iv0m02;
            } else {
                i5++;
            }
        }
        Object obj = fzsqRtM7.MdtA4re8;
        fzsqRtM7.MdtA4re8 = null;
        zzVar.MdtA4re8(fzsqRtM7);
        if (i5 > 0) {
            FzsqRtM7 k3x7lurq2 = k3x7lurq(obj, fzsqRtM7.qoPGr6Ce, Ey6iv0m0, i5);
            P7K7Inc8(k3x7lurq2, i3);
            k3x7lurq2.MdtA4re8 = null;
            zzVar.MdtA4re8(k3x7lurq2);
        }
    }

    public void amk52bBQ(ColorStateList colorStateList) {
        rc0 rc0Var = (rc0) this.VgvYg0wo;
        if (rc0Var == null) {
            rc0Var = new rc0();
            this.VgvYg0wo = rc0Var;
        }
        rc0Var.qoPGr6Ce = colorStateList;
        rc0Var.wxUZMvaN = true;
        qoPGr6Ce();
    }

    public int b2ZJblxo(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.wxUZMvaN;
        int size = arrayList.size();
        while (i2 < size) {
            FzsqRtM7 fzsqRtM7 = (FzsqRtM7) arrayList.get(i2);
            int i3 = fzsqRtM7.qoPGr6Ce;
            int i4 = fzsqRtM7.NCTxEWno;
            if (i3 == 8) {
                if (i4 == i) {
                    i = fzsqRtM7.wxUZMvaN;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (fzsqRtM7.wxUZMvaN <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = fzsqRtM7.wxUZMvaN;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += fzsqRtM7.wxUZMvaN;
            }
            i2++;
        }
        return i;
    }

    public void eVhOlqcC(AttributeSet attributeSet, int i) {
        ColorStateList b2ZJblxo;
        View view = (View) this.NCTxEWno;
        Context context = view.getContext();
        int[] iArr = z00.WYNAV5pd;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        View view2 = (View) this.NCTxEWno;
        hg0.jb9XjC4I(view2, view2.getContext(), iArr, attributeSet, (TypedArray) Mq3SeTnW.MdtA4re8, i);
        try {
            if (typedArray.hasValue(0)) {
                this.qoPGr6Ce = typedArray.getResourceId(0, -1);
                j5BPOSYv j5bposyv = (j5BPOSYv) this.MdtA4re8;
                Context context2 = view.getContext();
                int i2 = this.qoPGr6Ce;
                synchronized (j5bposyv) {
                    b2ZJblxo = j5bposyv.qoPGr6Ce.b2ZJblxo(context2, i2);
                }
                if (b2ZJblxo != null) {
                    OxcuoDLp(b2ZJblxo);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(Mq3SeTnW.sjUBp5pO(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(ud.NCTxEWno(typedArray.getInt(2, -1), null));
            }
            Mq3SeTnW.SgZGMMPL();
        } catch (Throwable th) {
            Mq3SeTnW.SgZGMMPL();
            throw th;
        }
    }

    public PorterDuff.Mode jb9XjC4I() {
        rc0 rc0Var = (rc0) this.VgvYg0wo;
        if (rc0Var != null) {
            return rc0Var.NCTxEWno;
        }
        return null;
    }

    public FzsqRtM7 k3x7lurq(Object obj, int i, int i2, int i3) {
        FzsqRtM7 fzsqRtM7 = (FzsqRtM7) ((zz) this.NCTxEWno).qoPGr6Ce();
        if (fzsqRtM7 != null) {
            fzsqRtM7.qoPGr6Ce = i;
            fzsqRtM7.NCTxEWno = i2;
            fzsqRtM7.wxUZMvaN = i3;
            fzsqRtM7.MdtA4re8 = obj;
            return fzsqRtM7;
        }
        FzsqRtM7 fzsqRtM72 = new FzsqRtM7();
        fzsqRtM72.qoPGr6Ce = i;
        fzsqRtM72.NCTxEWno = i2;
        fzsqRtM72.wxUZMvaN = i3;
        fzsqRtM72.MdtA4re8 = obj;
        return fzsqRtM72;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0123 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lDXGDhIF() {
        boolean z;
        char c;
        FzsqRtM7 k3x7lurq;
        int i;
        int i2;
        FzsqRtM7 k3x7lurq2;
        boolean z2;
        boolean z3;
        Object obj;
        FzsqRtM7 fzsqRtM7;
        zz zzVar = (zz) this.NCTxEWno;
        l10 l10Var = (l10) this.VgvYg0wo;
        tg0 tg0Var = (tg0) this.P7K7Inc8;
        ArrayList arrayList = (ArrayList) this.MdtA4re8;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((FzsqRtM7) arrayList.get(size)).qoPGr6Ce == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i3 = size + 1;
            VM67d7Sv vM67d7Sv = (VM67d7Sv) tg0Var.MdtA4re8;
            zz zzVar2 = (zz) vM67d7Sv.NCTxEWno;
            FzsqRtM7 fzsqRtM72 = (FzsqRtM7) arrayList.get(size);
            FzsqRtM7 fzsqRtM73 = (FzsqRtM7) arrayList.get(i3);
            int i4 = fzsqRtM73.qoPGr6Ce;
            if (i4 == 1) {
                int i5 = fzsqRtM72.wxUZMvaN;
                int i6 = fzsqRtM73.NCTxEWno;
                int i7 = i5 < i6 ? -1 : 0;
                int i8 = fzsqRtM72.NCTxEWno;
                if (i8 < i6) {
                    i7++;
                }
                if (i6 <= i8) {
                    fzsqRtM72.NCTxEWno = i8 + fzsqRtM73.wxUZMvaN;
                }
                int i9 = fzsqRtM73.NCTxEWno;
                if (i9 <= i5) {
                    fzsqRtM72.wxUZMvaN = i5 + fzsqRtM73.wxUZMvaN;
                }
                fzsqRtM73.NCTxEWno = i9 + i7;
                arrayList.set(size, fzsqRtM73);
                arrayList.set(i3, fzsqRtM72);
            } else if (i4 == 2) {
                int i10 = fzsqRtM72.NCTxEWno;
                int i11 = fzsqRtM72.wxUZMvaN;
                int i12 = fzsqRtM73.NCTxEWno;
                if (i10 < i11) {
                    if (i12 == i10 && fzsqRtM73.wxUZMvaN == i11 - i10) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i12 == i11 + 1 && fzsqRtM73.wxUZMvaN == i10 - i11) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i11 < i12) {
                    i12--;
                    fzsqRtM73.NCTxEWno = i12;
                } else {
                    int i13 = fzsqRtM73.wxUZMvaN;
                    if (i11 < i12 + i13) {
                        fzsqRtM73.wxUZMvaN = i13 - 1;
                        fzsqRtM72.qoPGr6Ce = 2;
                        fzsqRtM72.wxUZMvaN = 1;
                        if (fzsqRtM73.wxUZMvaN == 0) {
                            arrayList.remove(i3);
                            fzsqRtM73.MdtA4re8 = null;
                            zzVar2.MdtA4re8(fzsqRtM73);
                        }
                    }
                }
                int i14 = fzsqRtM72.NCTxEWno;
                if (i14 <= i12) {
                    fzsqRtM73.NCTxEWno = i12 + 1;
                } else {
                    int i15 = i12 + fzsqRtM73.wxUZMvaN;
                    if (i14 < i15) {
                        obj = null;
                        FzsqRtM7 k3x7lurq3 = vM67d7Sv.k3x7lurq(null, 2, i14 + 1, i15 - i14);
                        fzsqRtM73.wxUZMvaN = fzsqRtM72.NCTxEWno - fzsqRtM73.NCTxEWno;
                        fzsqRtM7 = k3x7lurq3;
                        if (z3) {
                            if (z2) {
                                if (fzsqRtM7 != null) {
                                    int i16 = fzsqRtM72.NCTxEWno;
                                    if (i16 > fzsqRtM7.NCTxEWno) {
                                        fzsqRtM72.NCTxEWno = i16 - fzsqRtM7.wxUZMvaN;
                                    }
                                    int i17 = fzsqRtM72.wxUZMvaN;
                                    if (i17 > fzsqRtM7.NCTxEWno) {
                                        fzsqRtM72.wxUZMvaN = i17 - fzsqRtM7.wxUZMvaN;
                                    }
                                }
                                int i18 = fzsqRtM72.NCTxEWno;
                                if (i18 > fzsqRtM73.NCTxEWno) {
                                    fzsqRtM72.NCTxEWno = i18 - fzsqRtM73.wxUZMvaN;
                                }
                                int i19 = fzsqRtM72.wxUZMvaN;
                                if (i19 > fzsqRtM73.NCTxEWno) {
                                    fzsqRtM72.wxUZMvaN = i19 - fzsqRtM73.wxUZMvaN;
                                }
                            } else {
                                if (fzsqRtM7 != null) {
                                    int i20 = fzsqRtM72.NCTxEWno;
                                    if (i20 >= fzsqRtM7.NCTxEWno) {
                                        fzsqRtM72.NCTxEWno = i20 - fzsqRtM7.wxUZMvaN;
                                    }
                                    int i21 = fzsqRtM72.wxUZMvaN;
                                    if (i21 >= fzsqRtM7.NCTxEWno) {
                                        fzsqRtM72.wxUZMvaN = i21 - fzsqRtM7.wxUZMvaN;
                                    }
                                }
                                int i22 = fzsqRtM72.NCTxEWno;
                                if (i22 >= fzsqRtM73.NCTxEWno) {
                                    fzsqRtM72.NCTxEWno = i22 - fzsqRtM73.wxUZMvaN;
                                }
                                int i23 = fzsqRtM72.wxUZMvaN;
                                if (i23 >= fzsqRtM73.NCTxEWno) {
                                    fzsqRtM72.wxUZMvaN = i23 - fzsqRtM73.wxUZMvaN;
                                }
                            }
                            arrayList.set(size, fzsqRtM73);
                            if (fzsqRtM72.NCTxEWno != fzsqRtM72.wxUZMvaN) {
                                arrayList.set(i3, fzsqRtM72);
                            } else {
                                arrayList.remove(i3);
                            }
                            if (fzsqRtM7 != null) {
                                arrayList.add(size, fzsqRtM7);
                            }
                        } else {
                            arrayList.set(size, fzsqRtM73);
                            arrayList.remove(i3);
                            fzsqRtM72.MdtA4re8 = obj;
                            zzVar2.MdtA4re8(fzsqRtM72);
                        }
                    }
                }
                obj = null;
                fzsqRtM7 = null;
                if (z3) {
                }
            } else if (i4 == 4) {
                int i24 = fzsqRtM72.wxUZMvaN;
                int i25 = fzsqRtM73.NCTxEWno;
                if (i24 < i25) {
                    fzsqRtM73.NCTxEWno = i25 - 1;
                } else {
                    int i26 = fzsqRtM73.wxUZMvaN;
                    if (i24 < i25 + i26) {
                        fzsqRtM73.wxUZMvaN = i26 - 1;
                        k3x7lurq = vM67d7Sv.k3x7lurq(fzsqRtM73.MdtA4re8, 4, fzsqRtM72.NCTxEWno, 1);
                        i = fzsqRtM72.NCTxEWno;
                        i2 = fzsqRtM73.NCTxEWno;
                        if (i > i2) {
                            fzsqRtM73.NCTxEWno = i2 + 1;
                        } else {
                            int i27 = i2 + fzsqRtM73.wxUZMvaN;
                            if (i < i27) {
                                int i28 = i27 - i;
                                k3x7lurq2 = vM67d7Sv.k3x7lurq(fzsqRtM73.MdtA4re8, 4, i + 1, i28);
                                fzsqRtM73.wxUZMvaN -= i28;
                                arrayList.set(i3, fzsqRtM72);
                                if (fzsqRtM73.wxUZMvaN > 0) {
                                    arrayList.set(size, fzsqRtM73);
                                } else {
                                    arrayList.remove(size);
                                    fzsqRtM73.MdtA4re8 = null;
                                    zzVar2.MdtA4re8(fzsqRtM73);
                                }
                                if (k3x7lurq != null) {
                                    arrayList.add(size, k3x7lurq);
                                }
                                if (k3x7lurq2 != null) {
                                    arrayList.add(size, k3x7lurq2);
                                }
                            }
                        }
                        k3x7lurq2 = null;
                        arrayList.set(i3, fzsqRtM72);
                        if (fzsqRtM73.wxUZMvaN > 0) {
                        }
                        if (k3x7lurq != null) {
                        }
                        if (k3x7lurq2 != null) {
                        }
                    }
                }
                k3x7lurq = null;
                i = fzsqRtM72.NCTxEWno;
                i2 = fzsqRtM73.NCTxEWno;
                if (i > i2) {
                }
                k3x7lurq2 = null;
                arrayList.set(i3, fzsqRtM72);
                if (fzsqRtM73.wxUZMvaN > 0) {
                }
                if (k3x7lurq != null) {
                }
                if (k3x7lurq2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i29 = 0; i29 < size2; i29++) {
            FzsqRtM7 fzsqRtM74 = (FzsqRtM7) arrayList.get(i29);
            int i30 = fzsqRtM74.qoPGr6Ce;
            if (i30 == 1) {
                ygLcUYwZ(fzsqRtM74);
            } else if (i30 == 2) {
                int i31 = fzsqRtM74.NCTxEWno;
                int i32 = fzsqRtM74.wxUZMvaN + i31;
                int i33 = i31;
                int i34 = 0;
                char c2 = 65535;
                while (i33 < i32) {
                    if (l10Var.NCTxEWno(i33) != null || NCTxEWno(i33)) {
                        if (c2 == 0) {
                            VgvYg0wo(k3x7lurq(null, 2, i31, i34));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 1;
                    } else {
                        if (c2 == 1) {
                            ygLcUYwZ(k3x7lurq(null, 2, i31, i34));
                            z = true;
                        } else {
                            z = false;
                        }
                        c = 0;
                    }
                    if (z) {
                        i33 -= i34;
                        i32 -= i34;
                        i34 = 1;
                    } else {
                        i34++;
                    }
                    i33++;
                    c2 = c;
                }
                if (i34 != fzsqRtM74.wxUZMvaN) {
                    fzsqRtM74.MdtA4re8 = null;
                    zzVar.MdtA4re8(fzsqRtM74);
                    fzsqRtM74 = k3x7lurq(null, 2, i31, i34);
                }
                if (c2 == 0) {
                    VgvYg0wo(fzsqRtM74);
                } else {
                    ygLcUYwZ(fzsqRtM74);
                }
            } else if (i30 == 4) {
                int i35 = fzsqRtM74.NCTxEWno;
                int i36 = fzsqRtM74.wxUZMvaN + i35;
                int i37 = i35;
                int i38 = 0;
                char c3 = 65535;
                while (i35 < i36) {
                    if (l10Var.NCTxEWno(i35) != null || NCTxEWno(i35)) {
                        if (c3 == 0) {
                            VgvYg0wo(k3x7lurq(fzsqRtM74.MdtA4re8, 4, i37, i38));
                            i37 = i35;
                            i38 = 0;
                        }
                        c3 = 1;
                    } else {
                        if (c3 == 1) {
                            ygLcUYwZ(k3x7lurq(fzsqRtM74.MdtA4re8, 4, i37, i38));
                            i37 = i35;
                            i38 = 0;
                        }
                        c3 = 0;
                    }
                    i38++;
                    i35++;
                }
                if (i38 != fzsqRtM74.wxUZMvaN) {
                    Object obj2 = fzsqRtM74.MdtA4re8;
                    fzsqRtM74.MdtA4re8 = null;
                    zzVar.MdtA4re8(fzsqRtM74);
                    fzsqRtM74 = k3x7lurq(obj2, 4, i37, i38);
                }
                if (c3 == 0) {
                    VgvYg0wo(fzsqRtM74);
                } else {
                    ygLcUYwZ(fzsqRtM74);
                }
            } else if (i30 == 8) {
                ygLcUYwZ(fzsqRtM74);
            }
        }
        arrayList.clear();
    }

    public void ow5vqvCr() {
        this.qoPGr6Ce = -1;
        OxcuoDLp(null);
        qoPGr6Ce();
    }

    public void qoPGr6Ce() {
        View view = (View) this.NCTxEWno;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((rc0) this.wxUZMvaN) != null) {
                rc0 rc0Var = (rc0) this.P7K7Inc8;
                if (rc0Var == null) {
                    rc0Var = new rc0();
                    this.P7K7Inc8 = rc0Var;
                }
                rc0Var.qoPGr6Ce = null;
                rc0Var.wxUZMvaN = false;
                rc0Var.NCTxEWno = null;
                rc0Var.MdtA4re8 = false;
                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    rc0Var.wxUZMvaN = true;
                    rc0Var.qoPGr6Ce = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    rc0Var.MdtA4re8 = true;
                    rc0Var.NCTxEWno = backgroundTintMode;
                }
                if (rc0Var.wxUZMvaN || rc0Var.MdtA4re8) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = j5BPOSYv.NCTxEWno;
                    e30.jb9XjC4I(background, rc0Var, drawableState);
                    return;
                }
            }
            rc0 rc0Var2 = (rc0) this.VgvYg0wo;
            if (rc0Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = j5BPOSYv.NCTxEWno;
                e30.jb9XjC4I(background, rc0Var2, drawableState2);
            } else {
                rc0 rc0Var3 = (rc0) this.wxUZMvaN;
                if (rc0Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = j5BPOSYv.NCTxEWno;
                    e30.jb9XjC4I(background, rc0Var3, drawableState3);
                }
            }
        }
    }

    public void sjUBp5pO(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FzsqRtM7 fzsqRtM7 = (FzsqRtM7) arrayList.get(i);
            fzsqRtM7.MdtA4re8 = null;
            ((zz) this.NCTxEWno).MdtA4re8(fzsqRtM7);
        }
        arrayList.clear();
    }

    public void wxUZMvaN() {
        l10 l10Var = (l10) this.VgvYg0wo;
        MdtA4re8();
        ArrayList arrayList = (ArrayList) this.MdtA4re8;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FzsqRtM7 fzsqRtM7 = (FzsqRtM7) arrayList.get(i);
            int i2 = fzsqRtM7.qoPGr6Ce;
            if (i2 == 1) {
                l10Var.qoPGr6Ce(fzsqRtM7);
                l10Var.wxUZMvaN(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN);
            } else if (i2 == 2) {
                l10Var.qoPGr6Ce(fzsqRtM7);
                int i3 = fzsqRtM7.NCTxEWno;
                int i4 = fzsqRtM7.wxUZMvaN;
                RecyclerView recyclerView = l10Var.qoPGr6Ce;
                recyclerView.VhgXwMj9(i3, i4, true);
                recyclerView.LvHlPNBd = true;
                recyclerView.pP9Y2m6O.NCTxEWno += i4;
            } else if (i2 == 4) {
                l10Var.qoPGr6Ce(fzsqRtM7);
                l10Var.MdtA4re8(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN, fzsqRtM7.MdtA4re8);
            } else if (i2 == 8) {
                l10Var.qoPGr6Ce(fzsqRtM7);
                l10Var.VgvYg0wo(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN);
            }
        }
        sjUBp5pO(arrayList);
        this.qoPGr6Ce = 0;
    }

    public void ygLcUYwZ(FzsqRtM7 fzsqRtM7) {
        l10 l10Var = (l10) this.VgvYg0wo;
        ((ArrayList) this.wxUZMvaN).add(fzsqRtM7);
        int i = fzsqRtM7.qoPGr6Ce;
        if (i == 1) {
            l10Var.wxUZMvaN(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN);
            return;
        }
        if (i == 2) {
            int i2 = fzsqRtM7.NCTxEWno;
            int i3 = fzsqRtM7.wxUZMvaN;
            RecyclerView recyclerView = l10Var.qoPGr6Ce;
            recyclerView.VhgXwMj9(i2, i3, false);
            recyclerView.LvHlPNBd = true;
            return;
        }
        if (i == 4) {
            l10Var.MdtA4re8(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN, fzsqRtM7.MdtA4re8);
        } else if (i == 8) {
            l10Var.VgvYg0wo(fzsqRtM7.NCTxEWno, fzsqRtM7.wxUZMvaN);
        } else {
            m1.lDXGDhIF(fzsqRtM7, "Unknown update op type for ");
        }
    }

    public VM67d7Sv(View view) {
        this.qoPGr6Ce = -1;
        this.NCTxEWno = view;
        this.MdtA4re8 = j5BPOSYv.qoPGr6Ce();
    }

    public VM67d7Sv(pu puVar) {
        this.NCTxEWno = puVar;
        this.MdtA4re8 = new ArrayList();
        this.VgvYg0wo = new LinkedHashMap();
    }
}
