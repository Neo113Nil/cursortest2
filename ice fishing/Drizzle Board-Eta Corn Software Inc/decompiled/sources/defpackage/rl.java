package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class rl implements Runnable {
    public static final ThreadLocal P7K7Inc8 = new ThreadLocal();
    public static final sc b2ZJblxo = new sc(1);
    public long MdtA4re8;
    public ArrayList NCTxEWno;
    public ArrayList VgvYg0wo;
    public long wxUZMvaN;

    public static g20 MdtA4re8(RecyclerView recyclerView, int i, long j) {
        int gjV1z5T1 = recyclerView.P7K7Inc8.gjV1z5T1();
        for (int i2 = 0; i2 < gjV1z5T1; i2++) {
            g20 euDDoUNr = RecyclerView.euDDoUNr(recyclerView.P7K7Inc8.FySoLYna(i2));
            if (euDDoUNr.MdtA4re8 == i && !euDDoUNr.VgvYg0wo()) {
                return null;
            }
        }
        z10 z10Var = recyclerView.MdtA4re8;
        try {
            recyclerView.aZz0PFXp();
            g20 eVhOlqcC = z10Var.eVhOlqcC(i, j);
            if (eVhOlqcC != null) {
                if (!eVhOlqcC.wxUZMvaN() || eVhOlqcC.VgvYg0wo()) {
                    z10Var.qoPGr6Ce(eVhOlqcC, false);
                } else {
                    z10Var.b2ZJblxo(eVhOlqcC.qoPGr6Ce);
                }
            }
            recyclerView.Xkz7p5xa(false);
            return eVhOlqcC;
        } catch (Throwable th) {
            recyclerView.Xkz7p5xa(false);
            throw th;
        }
    }

    public final void NCTxEWno(long j) {
        ql qlVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ql qlVar2;
        ArrayList arrayList = this.VgvYg0wo;
        ArrayList arrayList2 = this.NCTxEWno;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            pl plVar = recyclerView3.LfKQckgD;
            if (windowVisibility == 0) {
                plVar.NCTxEWno(recyclerView3, false);
                i += plVar.wxUZMvaN;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                pl plVar2 = recyclerView4.LfKQckgD;
                int abs = Math.abs(plVar2.NCTxEWno) + Math.abs(plVar2.qoPGr6Ce);
                for (int i5 = 0; i5 < plVar2.wxUZMvaN * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        qlVar2 = new ql();
                        arrayList.add(qlVar2);
                    } else {
                        qlVar2 = (ql) arrayList.get(i3);
                    }
                    int[] iArr = plVar2.MdtA4re8;
                    int i6 = iArr[i5 + 1];
                    qlVar2.qoPGr6Ce = i6 <= abs;
                    qlVar2.NCTxEWno = abs;
                    qlVar2.MdtA4re8 = i6;
                    qlVar2.wxUZMvaN = recyclerView4;
                    qlVar2.VgvYg0wo = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, b2ZJblxo);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (qlVar = (ql) arrayList.get(i7)).wxUZMvaN) != null; i7++) {
            g20 MdtA4re8 = MdtA4re8(recyclerView, qlVar.VgvYg0wo, qlVar.qoPGr6Ce ? Long.MAX_VALUE : j);
            if (MdtA4re8 != null && MdtA4re8.NCTxEWno != null && MdtA4re8.wxUZMvaN() && !MdtA4re8.VgvYg0wo() && (recyclerView2 = (RecyclerView) MdtA4re8.NCTxEWno.get()) != null) {
                if (recyclerView2.i7xS8jrb && recyclerView2.P7K7Inc8.gjV1z5T1() != 0) {
                    z10 z10Var = recyclerView2.MdtA4re8;
                    q10 q10Var = recyclerView2.Xkz7p5xa;
                    if (q10Var != null) {
                        q10Var.VgvYg0wo();
                    }
                    t10 t10Var = recyclerView2.ygLcUYwZ;
                    if (t10Var != null) {
                        t10Var.hGvurcGl(z10Var);
                        recyclerView2.ygLcUYwZ.Wi7iiXC4(z10Var);
                    }
                    z10Var.qoPGr6Ce.clear();
                    z10Var.VgvYg0wo();
                }
                pl plVar3 = recyclerView2.LfKQckgD;
                plVar3.NCTxEWno(recyclerView2, true);
                if (plVar3.wxUZMvaN != 0) {
                    try {
                        int i8 = jd0.qoPGr6Ce;
                        Trace.beginSection("RV Nested Prefetch");
                        d20 d20Var = recyclerView2.pP9Y2m6O;
                        m10 m10Var = recyclerView2.OnDfzHZD;
                        d20Var.MdtA4re8 = 1;
                        d20Var.wxUZMvaN = m10Var.qoPGr6Ce();
                        d20Var.P7K7Inc8 = false;
                        d20Var.b2ZJblxo = false;
                        d20Var.Qr9iLBAD = false;
                        for (int i9 = 0; i9 < plVar3.wxUZMvaN * 2; i9 += 2) {
                            MdtA4re8(recyclerView2, plVar3.MdtA4re8[i9], j);
                        }
                        Trace.endSection();
                        qlVar.qoPGr6Ce = false;
                        qlVar.NCTxEWno = 0;
                        qlVar.MdtA4re8 = 0;
                        qlVar.wxUZMvaN = null;
                        qlVar.VgvYg0wo = 0;
                    } catch (Throwable th) {
                        int i10 = jd0.qoPGr6Ce;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            qlVar.qoPGr6Ce = false;
            qlVar.NCTxEWno = 0;
            qlVar.MdtA4re8 = 0;
            qlVar.wxUZMvaN = null;
            qlVar.VgvYg0wo = 0;
        }
    }

    public final void qoPGr6Ce(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.KlHjfFWx && this.MdtA4re8 == 0) {
            this.MdtA4re8 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        pl plVar = recyclerView.LfKQckgD;
        plVar.qoPGr6Ce = i;
        plVar.NCTxEWno = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.NCTxEWno;
        try {
            int i = jd0.qoPGr6Ce;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    NCTxEWno(TimeUnit.MILLISECONDS.toNanos(j) + this.wxUZMvaN);
                }
            }
            this.MdtA4re8 = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.MdtA4re8 = 0L;
            int i3 = jd0.qoPGr6Ce;
            Trace.endSection();
            throw th;
        }
    }
}
