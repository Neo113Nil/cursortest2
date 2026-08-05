package defpackage;

import android.os.Trace;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z10 {
    public final ArrayList MdtA4re8;
    public ArrayList NCTxEWno;
    public int P7K7Inc8;
    public final /* synthetic */ RecyclerView Qr9iLBAD;
    public int VgvYg0wo;
    public y10 b2ZJblxo;
    public final ArrayList qoPGr6Ce;
    public final List wxUZMvaN;

    public z10(RecyclerView recyclerView) {
        this.Qr9iLBAD = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.qoPGr6Ce = arrayList;
        this.NCTxEWno = null;
        this.MdtA4re8 = new ArrayList();
        this.wxUZMvaN = Collections.unmodifiableList(arrayList);
        this.VgvYg0wo = 2;
        this.P7K7Inc8 = 2;
    }

    public final y10 MdtA4re8() {
        y10 y10Var = this.b2ZJblxo;
        if (y10Var != null) {
            return y10Var;
        }
        y10 y10Var2 = new y10();
        y10Var2.qoPGr6Ce = new SparseArray();
        y10Var2.NCTxEWno = 0;
        this.b2ZJblxo = y10Var2;
        return y10Var2;
    }

    public final int NCTxEWno(int i) {
        RecyclerView recyclerView = this.Qr9iLBAD;
        d20 d20Var = recyclerView.pP9Y2m6O;
        if (i >= 0 && i < d20Var.NCTxEWno()) {
            return !d20Var.P7K7Inc8 ? i : recyclerView.VgvYg0wo.b2ZJblxo(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + d20Var.NCTxEWno() + recyclerView.RXQxj5Oe());
    }

    public final void P7K7Inc8(int i) {
        ArrayList arrayList = this.MdtA4re8;
        qoPGr6Ce((g20) arrayList.get(i), true);
        arrayList.remove(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Qr9iLBAD(g20 g20Var) {
        boolean z;
        boolean z2;
        RecyclerView recyclerView = this.Qr9iLBAD;
        pl plVar = recyclerView.LfKQckgD;
        boolean Qr9iLBAD = g20Var.Qr9iLBAD();
        View view = g20Var.qoPGr6Ce;
        boolean z3 = true;
        if (Qr9iLBAD || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(g20Var.Qr9iLBAD());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.RXQxj5Oe());
            throw new IllegalArgumentException(sb.toString());
        }
        if (g20Var.jb9XjC4I()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + g20Var + recyclerView.RXQxj5Oe());
        }
        if (g20Var.ygLcUYwZ()) {
            m1.sjUBp5pO("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.RXQxj5Oe()));
            return;
        }
        if ((g20Var.jb9XjC4I & 16) == 0) {
            WeakHashMap weakHashMap = hg0.qoPGr6Ce;
            if (view.hasTransientState()) {
                z = true;
                if (g20Var.P7K7Inc8()) {
                    z3 = false;
                } else {
                    if (this.P7K7Inc8 <= 0 || (g20Var.jb9XjC4I & 526) != 0) {
                        z2 = false;
                    } else {
                        ArrayList arrayList = this.MdtA4re8;
                        int size = arrayList.size();
                        if (size >= this.P7K7Inc8 && size > 0) {
                            P7K7Inc8(0);
                            size--;
                        }
                        int[] iArr = RecyclerView.yzvmSy3z;
                        if (size > 0) {
                            int i = g20Var.MdtA4re8;
                            if (plVar.MdtA4re8 != null) {
                                int i2 = plVar.wxUZMvaN * 2;
                                for (int i3 = 0; i3 < i2; i3 += 2) {
                                    if (plVar.MdtA4re8[i3] == i) {
                                        break;
                                    }
                                }
                            }
                            int i4 = size - 1;
                            loop1: while (i4 >= 0) {
                                int i5 = ((g20) arrayList.get(i4)).MdtA4re8;
                                if (plVar.MdtA4re8 == null) {
                                    break;
                                }
                                int i6 = plVar.wxUZMvaN * 2;
                                for (int i7 = 0; i7 < i6; i7 += 2) {
                                    if (plVar.MdtA4re8[i7] == i5) {
                                        break;
                                    }
                                }
                                break loop1;
                            }
                            size = i4 + 1;
                        }
                        arrayList.add(size, g20Var);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        qoPGr6Ce(g20Var, true);
                    }
                    r4 = z2;
                }
                recyclerView.b2ZJblxo.OnDfzHZD(g20Var);
                if (r4 && !z3 && z) {
                    g20Var.amk52bBQ = null;
                    g20Var.OxcuoDLp = null;
                    return;
                }
                return;
            }
        }
        z = false;
        if (g20Var.P7K7Inc8()) {
        }
        recyclerView.b2ZJblxo.OnDfzHZD(g20Var);
        if (r4) {
        }
    }

    public final void VgvYg0wo() {
        ArrayList arrayList = this.MdtA4re8;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            P7K7Inc8(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.yzvmSy3z;
        pl plVar = this.Qr9iLBAD.LfKQckgD;
        int[] iArr2 = plVar.MdtA4re8;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        plVar.wxUZMvaN = 0;
    }

    public final void b2ZJblxo(View view) {
        g20 euDDoUNr = RecyclerView.euDDoUNr(view);
        boolean jb9XjC4I = euDDoUNr.jb9XjC4I();
        RecyclerView recyclerView = this.Qr9iLBAD;
        if (jb9XjC4I) {
            recyclerView.removeDetachedView(view, false);
        }
        if (euDDoUNr.Qr9iLBAD()) {
            euDDoUNr.OnDfzHZD.k3x7lurq(euDDoUNr);
        } else if (euDDoUNr.lDXGDhIF()) {
            euDDoUNr.jb9XjC4I &= -33;
        }
        Qr9iLBAD(euDDoUNr);
        if (recyclerView.Xkz7p5xa == null || euDDoUNr.P7K7Inc8()) {
            return;
        }
        recyclerView.Xkz7p5xa.wxUZMvaN(euDDoUNr);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0458 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g20 eVhOlqcC(int i, long j) {
        g20 g20Var;
        boolean z;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z4;
        ViewGroup.LayoutParams layoutParams;
        u10 u10Var;
        int i2;
        View view;
        boolean z5;
        int size;
        RecyclerView recyclerView = this.Qr9iLBAD;
        d20 d20Var = recyclerView.pP9Y2m6O;
        if (i < 0 || i >= d20Var.NCTxEWno()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + d20Var.NCTxEWno() + recyclerView.RXQxj5Oe());
        }
        boolean z6 = true;
        if (d20Var.P7K7Inc8) {
            ArrayList arrayList = this.NCTxEWno;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i3 = 0; i3 < size; i3++) {
                    g20Var = (g20) this.NCTxEWno.get(i3);
                    if (!g20Var.lDXGDhIF() && g20Var.NCTxEWno() == i) {
                        g20Var.qoPGr6Ce(32);
                        break;
                    }
                }
                recyclerView.OnDfzHZD.getClass();
            }
            g20Var = null;
            if (g20Var != null) {
                z = true;
                if (g20Var == null) {
                    ArrayList arrayList2 = this.qoPGr6Ce;
                    int size2 = arrayList2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        g20 g20Var2 = (g20) arrayList2.get(i4);
                        if (!g20Var2.lDXGDhIF() && g20Var2.NCTxEWno() == i && !g20Var2.VgvYg0wo() && (d20Var.P7K7Inc8 || !g20Var2.b2ZJblxo())) {
                            g20Var2.qoPGr6Ce(32);
                            g20Var = g20Var2;
                            break;
                        }
                    }
                    ArrayList arrayList3 = (ArrayList) recyclerView.P7K7Inc8.VgvYg0wo;
                    int size3 = arrayList3.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size3) {
                            view = null;
                            break;
                        }
                        view = (View) arrayList3.get(i5);
                        g20 euDDoUNr = RecyclerView.euDDoUNr(view);
                        if (euDDoUNr.NCTxEWno() == i && !euDDoUNr.VgvYg0wo() && !euDDoUNr.b2ZJblxo()) {
                            break;
                        }
                        i5++;
                    }
                    if (view != null) {
                        g20 euDDoUNr2 = RecyclerView.euDDoUNr(view);
                        f0 f0Var = recyclerView.P7K7Inc8;
                        a5 a5Var = (a5) f0Var.wxUZMvaN;
                        int indexOfChild = ((l10) f0Var.MdtA4re8).qoPGr6Ce.indexOfChild(view);
                        if (indexOfChild < 0) {
                            m1.lDXGDhIF(view, "view is not a child, cannot hide ");
                            return null;
                        }
                        if (!a5Var.wxUZMvaN(indexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                        }
                        a5Var.qoPGr6Ce(indexOfChild);
                        f0Var.eIA6dogk(view);
                        f0 f0Var2 = recyclerView.P7K7Inc8;
                        a5 a5Var2 = (a5) f0Var2.wxUZMvaN;
                        int indexOfChild2 = ((l10) f0Var2.MdtA4re8).qoPGr6Ce.indexOfChild(view);
                        int NCTxEWno = (indexOfChild2 == -1 || a5Var2.wxUZMvaN(indexOfChild2)) ? -1 : indexOfChild2 - a5Var2.NCTxEWno(indexOfChild2);
                        if (NCTxEWno == -1) {
                            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + euDDoUNr2 + recyclerView.RXQxj5Oe());
                        }
                        recyclerView.P7K7Inc8.k3x7lurq(NCTxEWno);
                        jb9XjC4I(view);
                        euDDoUNr2.qoPGr6Ce(8224);
                        g20Var = euDDoUNr2;
                    } else {
                        ArrayList arrayList4 = this.MdtA4re8;
                        int size4 = arrayList4.size();
                        for (int i6 = 0; i6 < size4; i6++) {
                            g20 g20Var3 = (g20) arrayList4.get(i6);
                            if (!g20Var3.VgvYg0wo() && g20Var3.NCTxEWno() == i) {
                                View view2 = g20Var3.qoPGr6Ce;
                                if (view2.getParent() == null || view2.getParent() == g20Var3.OxcuoDLp) {
                                    arrayList4.remove(i6);
                                    g20Var = g20Var3;
                                    break;
                                }
                            }
                        }
                        g20Var = null;
                    }
                    if (g20Var != null) {
                        if (g20Var.b2ZJblxo()) {
                            z5 = d20Var.P7K7Inc8;
                        } else {
                            int i7 = g20Var.MdtA4re8;
                            if (i7 < 0 || i7 >= recyclerView.OnDfzHZD.qoPGr6Ce()) {
                                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + g20Var + recyclerView.RXQxj5Oe());
                            }
                            if (!d20Var.P7K7Inc8) {
                                recyclerView.OnDfzHZD.getClass();
                                if (g20Var.VgvYg0wo != 0) {
                                    z5 = false;
                                }
                            }
                            recyclerView.OnDfzHZD.getClass();
                            z5 = true;
                        }
                        if (z5) {
                            z = true;
                        } else {
                            g20Var.qoPGr6Ce(4);
                            if (g20Var.Qr9iLBAD()) {
                                recyclerView.removeDetachedView(g20Var.qoPGr6Ce, false);
                                g20Var.OnDfzHZD.k3x7lurq(g20Var);
                            } else if (g20Var.lDXGDhIF()) {
                                g20Var.jb9XjC4I &= -33;
                            }
                            Qr9iLBAD(g20Var);
                            g20Var = null;
                        }
                    }
                }
                if (g20Var != null) {
                    int b2ZJblxo = recyclerView.VgvYg0wo.b2ZJblxo(i, 0);
                    if (b2ZJblxo < 0 || b2ZJblxo >= recyclerView.OnDfzHZD.qoPGr6Ce()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + b2ZJblxo + ").state:" + d20Var.NCTxEWno() + recyclerView.RXQxj5Oe());
                    }
                    recyclerView.OnDfzHZD.getClass();
                    recyclerView.OnDfzHZD.getClass();
                    if (g20Var == null) {
                        x10 x10Var = (x10) MdtA4re8().qoPGr6Ce.get(0);
                        if (x10Var != null) {
                            ArrayList arrayList5 = x10Var.qoPGr6Ce;
                            if (!arrayList5.isEmpty()) {
                                for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                                    g20 g20Var4 = (g20) arrayList5.get(size5);
                                    j2 = 3;
                                    View view3 = g20Var4.qoPGr6Ce;
                                    if (view3.getParent() == null || view3.getParent() == g20Var4.OxcuoDLp) {
                                        g20Var = (g20) arrayList5.remove(size5);
                                        break;
                                    }
                                }
                            }
                        }
                        j2 = 3;
                        g20Var = null;
                        if (g20Var != null) {
                            g20Var.ow5vqvCr();
                            int[] iArr = RecyclerView.yzvmSy3z;
                        }
                    } else {
                        j2 = 3;
                    }
                    if (g20Var == null) {
                        long nanoTime = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j5 = this.b2ZJblxo.qoPGr6Ce(0).NCTxEWno;
                            if (j5 != 0 && j5 + nanoTime >= j) {
                                return null;
                            }
                        }
                        m10 m10Var = recyclerView.OnDfzHZD;
                        m10Var.getClass();
                        try {
                            int i8 = jd0.qoPGr6Ce;
                            Trace.beginSection("RV CreateView");
                            g20 MdtA4re8 = m10Var.MdtA4re8(recyclerView);
                            View view4 = MdtA4re8.qoPGr6Ce;
                            if (view4.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            MdtA4re8.VgvYg0wo = 0;
                            Trace.endSection();
                            int[] iArr2 = RecyclerView.yzvmSy3z;
                            RecyclerView lwWCatUu = RecyclerView.lwWCatUu(view4);
                            if (lwWCatUu != null) {
                                MdtA4re8.NCTxEWno = new WeakReference(lwWCatUu);
                            }
                            j3 = 4;
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            x10 qoPGr6Ce = this.b2ZJblxo.qoPGr6Ce(0);
                            long j6 = qoPGr6Ce.NCTxEWno;
                            if (j6 != 0) {
                                nanoTime2 = (nanoTime2 / 4) + ((j6 / 4) * j2);
                            }
                            qoPGr6Ce.NCTxEWno = nanoTime2;
                            g20Var = MdtA4re8;
                            View view5 = g20Var.qoPGr6Ce;
                            if (z && !d20Var.P7K7Inc8) {
                                i2 = g20Var.jb9XjC4I;
                                if ((i2 & 8192) != 0) {
                                    g20Var.jb9XjC4I = i2 & (-8193);
                                    if (d20Var.jb9XjC4I) {
                                        q10.NCTxEWno(g20Var);
                                        q10 q10Var = recyclerView.Xkz7p5xa;
                                        g20Var.MdtA4re8();
                                        q10Var.getClass();
                                        fw fwVar = new fw();
                                        fwVar.qoPGr6Ce(g20Var);
                                        recyclerView.FXJmAAN1(g20Var, fwVar);
                                    }
                                }
                            }
                            if (!d20Var.P7K7Inc8 && g20Var.wxUZMvaN()) {
                                g20Var.P7K7Inc8 = i;
                            } else if (g20Var.wxUZMvaN() || (g20Var.jb9XjC4I & 2) != 0 || g20Var.VgvYg0wo()) {
                                int b2ZJblxo2 = recyclerView.VgvYg0wo.b2ZJblxo(i, 0);
                                g20Var.amk52bBQ = null;
                                g20Var.OxcuoDLp = recyclerView;
                                int i9 = g20Var.VgvYg0wo;
                                long nanoTime3 = recyclerView.getNanoTime();
                                if (j != Long.MAX_VALUE) {
                                    z2 = true;
                                    long j7 = this.b2ZJblxo.qoPGr6Ce(i9).MdtA4re8;
                                    if (j7 != 0 && j7 + nanoTime3 >= j) {
                                        z4 = false;
                                        z6 = true;
                                        layoutParams = view5.getLayoutParams();
                                        if (layoutParams == null) {
                                            u10Var = (u10) recyclerView.generateDefaultLayoutParams();
                                            view5.setLayoutParams(u10Var);
                                        } else if (recyclerView.checkLayoutParams(layoutParams)) {
                                            u10Var = (u10) layoutParams;
                                        } else {
                                            u10Var = (u10) recyclerView.generateLayoutParams(layoutParams);
                                            view5.setLayoutParams(u10Var);
                                        }
                                        u10Var.qoPGr6Ce = g20Var;
                                        if (z || !z4) {
                                            z6 = false;
                                        }
                                        u10Var.wxUZMvaN = z6;
                                        return g20Var;
                                    }
                                } else {
                                    z2 = true;
                                }
                                m10 m10Var2 = recyclerView.OnDfzHZD;
                                m10Var2.getClass();
                                z3 = g20Var.amk52bBQ == null ? z2 : false;
                                if (z3) {
                                    g20Var.MdtA4re8 = b2ZJblxo2;
                                    g20Var.jb9XjC4I = (g20Var.jb9XjC4I & (-520)) | 1;
                                    int i10 = jd0.qoPGr6Ce;
                                    Trace.beginSection("RV OnBindView");
                                }
                                g20Var.amk52bBQ = m10Var2;
                                g20Var.MdtA4re8();
                                m10Var2.NCTxEWno(g20Var, b2ZJblxo2);
                                if (z3) {
                                    ArrayList arrayList6 = g20Var.eVhOlqcC;
                                    if (arrayList6 != null) {
                                        arrayList6.clear();
                                    }
                                    g20Var.jb9XjC4I &= -1025;
                                    ViewGroup.LayoutParams layoutParams2 = view5.getLayoutParams();
                                    if (layoutParams2 instanceof u10) {
                                        ((u10) layoutParams2).MdtA4re8 = z2;
                                    }
                                }
                                long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                                x10 qoPGr6Ce2 = this.b2ZJblxo.qoPGr6Ce(g20Var.VgvYg0wo);
                                j4 = qoPGr6Ce2.MdtA4re8;
                                if (j4 != 0) {
                                    nanoTime4 = (nanoTime4 / j3) + ((j4 / j3) * j2);
                                }
                                qoPGr6Ce2.MdtA4re8 = nanoTime4;
                                accessibilityManager = recyclerView.U0LaHZX7;
                                if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                                    z6 = true;
                                    if (view5.getImportantForAccessibility() == 0) {
                                        view5.setImportantForAccessibility(1);
                                    }
                                    i20 i20Var = recyclerView.orhfF2Ya;
                                    if (i20Var != null) {
                                        h20 h20Var = i20Var.VgvYg0wo;
                                        if (h20Var != null) {
                                            View.AccessibilityDelegate VgvYg0wo = hg0.VgvYg0wo(view5);
                                            Mq3SeTnW mq3SeTnW = VgvYg0wo == null ? null : VgvYg0wo instanceof i7xS8jrb ? ((i7xS8jrb) VgvYg0wo).qoPGr6Ce : new Mq3SeTnW(VgvYg0wo);
                                            if (mq3SeTnW != null && mq3SeTnW != h20Var) {
                                                h20Var.VgvYg0wo.put(view5, mq3SeTnW);
                                            }
                                        }
                                        hg0.eVhOlqcC(view5, h20Var);
                                    }
                                } else {
                                    z6 = true;
                                }
                                if (d20Var.P7K7Inc8) {
                                    g20Var.P7K7Inc8 = i;
                                }
                                z4 = z6;
                                layoutParams = view5.getLayoutParams();
                                if (layoutParams == null) {
                                }
                                u10Var.qoPGr6Ce = g20Var;
                                if (z) {
                                }
                                z6 = false;
                                u10Var.wxUZMvaN = z6;
                                return g20Var;
                            }
                            z4 = false;
                            layoutParams = view5.getLayoutParams();
                            if (layoutParams == null) {
                            }
                            u10Var.qoPGr6Ce = g20Var;
                            if (z) {
                            }
                            z6 = false;
                            u10Var.wxUZMvaN = z6;
                            return g20Var;
                        } finally {
                            int i11 = jd0.qoPGr6Ce;
                            Trace.endSection();
                        }
                    }
                } else {
                    j2 = 3;
                }
                j3 = 4;
                View view52 = g20Var.qoPGr6Ce;
                if (z) {
                    i2 = g20Var.jb9XjC4I;
                    if ((i2 & 8192) != 0) {
                    }
                }
                if (!d20Var.P7K7Inc8) {
                }
                if (g20Var.wxUZMvaN()) {
                }
                int b2ZJblxo22 = recyclerView.VgvYg0wo.b2ZJblxo(i, 0);
                g20Var.amk52bBQ = null;
                g20Var.OxcuoDLp = recyclerView;
                int i92 = g20Var.VgvYg0wo;
                long nanoTime32 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                }
                m10 m10Var22 = recyclerView.OnDfzHZD;
                m10Var22.getClass();
                if (g20Var.amk52bBQ == null) {
                }
                if (z3) {
                }
                g20Var.amk52bBQ = m10Var22;
                g20Var.MdtA4re8();
                m10Var22.NCTxEWno(g20Var, b2ZJblxo22);
                if (z3) {
                }
                long nanoTime42 = recyclerView.getNanoTime() - nanoTime32;
                x10 qoPGr6Ce22 = this.b2ZJblxo.qoPGr6Ce(g20Var.VgvYg0wo);
                j4 = qoPGr6Ce22.MdtA4re8;
                if (j4 != 0) {
                }
                qoPGr6Ce22.MdtA4re8 = nanoTime42;
                accessibilityManager = recyclerView.U0LaHZX7;
                if (accessibilityManager == null) {
                }
                z6 = true;
                if (d20Var.P7K7Inc8) {
                }
                z4 = z6;
                layoutParams = view52.getLayoutParams();
                if (layoutParams == null) {
                }
                u10Var.qoPGr6Ce = g20Var;
                if (z) {
                }
                z6 = false;
                u10Var.wxUZMvaN = z6;
                return g20Var;
            }
        } else {
            g20Var = null;
        }
        z = false;
        if (g20Var == null) {
        }
        if (g20Var != null) {
        }
        j3 = 4;
        View view522 = g20Var.qoPGr6Ce;
        if (z) {
        }
        if (!d20Var.P7K7Inc8) {
        }
        if (g20Var.wxUZMvaN()) {
        }
        int b2ZJblxo222 = recyclerView.VgvYg0wo.b2ZJblxo(i, 0);
        g20Var.amk52bBQ = null;
        g20Var.OxcuoDLp = recyclerView;
        int i922 = g20Var.VgvYg0wo;
        long nanoTime322 = recyclerView.getNanoTime();
        if (j != Long.MAX_VALUE) {
        }
        m10 m10Var222 = recyclerView.OnDfzHZD;
        m10Var222.getClass();
        if (g20Var.amk52bBQ == null) {
        }
        if (z3) {
        }
        g20Var.amk52bBQ = m10Var222;
        g20Var.MdtA4re8();
        m10Var222.NCTxEWno(g20Var, b2ZJblxo222);
        if (z3) {
        }
        long nanoTime422 = recyclerView.getNanoTime() - nanoTime322;
        x10 qoPGr6Ce222 = this.b2ZJblxo.qoPGr6Ce(g20Var.VgvYg0wo);
        j4 = qoPGr6Ce222.MdtA4re8;
        if (j4 != 0) {
        }
        qoPGr6Ce222.MdtA4re8 = nanoTime422;
        accessibilityManager = recyclerView.U0LaHZX7;
        if (accessibilityManager == null) {
        }
        z6 = true;
        if (d20Var.P7K7Inc8) {
        }
        z4 = z6;
        layoutParams = view522.getLayoutParams();
        if (layoutParams == null) {
        }
        u10Var.qoPGr6Ce = g20Var;
        if (z) {
        }
        z6 = false;
        u10Var.wxUZMvaN = z6;
        return g20Var;
    }

    public final void jb9XjC4I(View view) {
        q10 q10Var;
        g20 euDDoUNr = RecyclerView.euDDoUNr(view);
        int i = euDDoUNr.jb9XjC4I & 12;
        RecyclerView recyclerView = this.Qr9iLBAD;
        if (i == 0 && euDDoUNr.eVhOlqcC() && (q10Var = recyclerView.Xkz7p5xa) != null) {
            eb ebVar = (eb) q10Var;
            if (euDDoUNr.MdtA4re8().isEmpty() && ebVar.b2ZJblxo && !euDDoUNr.VgvYg0wo()) {
                ArrayList arrayList = this.NCTxEWno;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.NCTxEWno = arrayList;
                }
                euDDoUNr.OnDfzHZD = this;
                euDDoUNr.ygLcUYwZ = true;
                arrayList.add(euDDoUNr);
                return;
            }
        }
        if (euDDoUNr.VgvYg0wo() && !euDDoUNr.b2ZJblxo()) {
            recyclerView.OnDfzHZD.getClass();
            m1.sjUBp5pO("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.RXQxj5Oe()));
        } else {
            euDDoUNr.OnDfzHZD = this;
            euDDoUNr.ygLcUYwZ = false;
            this.qoPGr6Ce.add(euDDoUNr);
        }
    }

    public final void k3x7lurq(g20 g20Var) {
        if (g20Var.ygLcUYwZ) {
            this.NCTxEWno.remove(g20Var);
        } else {
            this.qoPGr6Ce.remove(g20Var);
        }
        g20Var.OnDfzHZD = null;
        g20Var.ygLcUYwZ = false;
        g20Var.jb9XjC4I &= -33;
    }

    public final void ow5vqvCr() {
        t10 t10Var = this.Qr9iLBAD.ygLcUYwZ;
        this.P7K7Inc8 = this.VgvYg0wo + (t10Var != null ? t10Var.jb9XjC4I : 0);
        ArrayList arrayList = this.MdtA4re8;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.P7K7Inc8; size--) {
            P7K7Inc8(size);
        }
    }

    public final void qoPGr6Ce(g20 g20Var, boolean z) {
        RecyclerView.b2ZJblxo(g20Var);
        View view = g20Var.qoPGr6Ce;
        RecyclerView recyclerView = this.Qr9iLBAD;
        i20 i20Var = recyclerView.orhfF2Ya;
        if (i20Var != null) {
            h20 h20Var = i20Var.VgvYg0wo;
            hg0.eVhOlqcC(view, h20Var != null ? (Mq3SeTnW) h20Var.VgvYg0wo.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.lDXGDhIF;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                m1.qoPGr6Ce();
                return;
            } else if (recyclerView.pP9Y2m6O != null) {
                recyclerView.b2ZJblxo.OnDfzHZD(g20Var);
            }
        }
        g20Var.amk52bBQ = null;
        g20Var.OxcuoDLp = null;
        y10 MdtA4re8 = MdtA4re8();
        MdtA4re8.getClass();
        int i = g20Var.VgvYg0wo;
        ArrayList arrayList2 = MdtA4re8.qoPGr6Ce(i).qoPGr6Ce;
        ((x10) MdtA4re8.qoPGr6Ce.get(i)).getClass();
        if (5 <= arrayList2.size()) {
            return;
        }
        g20Var.ow5vqvCr();
        arrayList2.add(g20Var);
    }

    public final View wxUZMvaN(int i) {
        return eVhOlqcC(i, Long.MAX_VALUE).qoPGr6Ce;
    }
}
