package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.a;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes10.dex */
public final class tkh implements usb {
    public final tyy a;
    public final int b;
    public final osb[] c;
    public final kpg d;
    public loo e;
    public pxt0 f;
    public int g;
    public BehindLiveWindowException h;

    public tkh(tyy tyyVar, pxt0 pxt0Var, int i, loo looVar, kpg kpgVar, dlh dlhVar, boolean z) {
        vzz0[] vzz0VarArr;
        this.a = tyyVar;
        this.f = pxt0Var;
        this.b = i;
        this.e = looVar;
        this.d = kpgVar;
        oxt0 oxt0Var = pxt0Var.f[i];
        this.c = new osb[looVar.length()];
        for (int i2 = 0; i2 < this.c.length; i2++) {
            int indexInTrackGroup = looVar.getIndexInTrackGroup(i2);
            a aVar = oxt0Var.j[indexInTrackGroup];
            if (aVar.r != null) {
                nxt0 nxt0Var = pxt0Var.e;
                nxt0Var.getClass();
                vzz0VarArr = nxt0Var.c;
            } else {
                vzz0VarArr = null;
            }
            vzz0[] vzz0VarArr2 = vzz0VarArr;
            int i3 = oxt0Var.a;
            int i4 = i3 == 2 ? 4 : 0;
            long j = oxt0Var.c;
            long j2 = pxt0Var.g;
            this.c[i2] = new su6(new les(dlhVar, !z ? 35 : 3, null, new uzz0(indexInTrackGroup, i3, j, -9223372036854775807L, j2, j2, aVar, 0, vzz0VarArr2, i4, null, null), ImmutableList.p(), null), oxt0Var.a, aVar);
        }
    }

    @Override // defpackage.usb
    public final void b() {
        BehindLiveWindowException behindLiveWindowException = this.h;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.a.b();
    }

    @Override // defpackage.usb
    public final long c(long j, g7q0 g7q0Var) {
        oxt0 oxt0Var = this.f.f[this.b];
        int e = tw21.e(oxt0Var.o, j, true);
        long[] jArr = oxt0Var.o;
        long j2 = jArr[e];
        return g7q0Var.a(j, j2, (j2 >= j || e >= oxt0Var.k - 1) ? j2 : jArr[e + 1]);
    }

    @Override // defpackage.usb
    public final boolean d(nsb nsbVar, boolean z, swy swyVar, twy twyVar) {
        rwy fallbackSelectionFor = twyVar.getFallbackSelectionFor(s001.a(this.e), swyVar);
        if (!z || fallbackSelectionFor == null || fallbackSelectionFor.a != 2) {
            return false;
        }
        loo looVar = this.e;
        return looVar.excludeTrack(looVar.indexOf(nsbVar.w), fallbackSelectionFor.b);
    }

    @Override // defpackage.usb
    public final boolean e(long j, nsb nsbVar, List list) {
        if (this.h != null) {
            return false;
        }
        return this.e.shouldCancelChunkLoad(j, nsbVar, list);
    }

    @Override // defpackage.usb
    public final int f(long j, List list) {
        return (this.h != null || this.e.length() < 2) ? list.size() : this.e.evaluateQueueSize(j, list);
    }

    @Override // defpackage.usb
    public final void g(nsb nsbVar) {
    }

    @Override // defpackage.usb
    public final void h(xzy xzyVar, long j, List list, psb psbVar) {
        List list2;
        int a;
        long c;
        loo looVar;
        if (this.h != null) {
            return;
        }
        oxt0[] oxt0VarArr = this.f.f;
        int i = this.b;
        oxt0 oxt0Var = oxt0VarArr[i];
        int i2 = oxt0Var.k;
        long[] jArr = oxt0Var.o;
        if (i2 == 0) {
            psbVar.b = !r4.d;
            return;
        }
        if (list.isEmpty()) {
            a = tw21.e(jArr, j, true);
            list2 = list;
        } else {
            list2 = list;
            a = (int) (((ib10) b64.c(1, list2)).a() - this.g);
            if (a < 0) {
                this.h = new BehindLiveWindowException();
                return;
            }
        }
        if (a >= oxt0Var.k) {
            psbVar.b = !this.f.d;
            return;
        }
        long j2 = xzyVar.a;
        long j3 = j - j2;
        pxt0 pxt0Var = this.f;
        if (pxt0Var.d) {
            oxt0 oxt0Var2 = pxt0Var.f[i];
            int i3 = oxt0Var2.k - 1;
            c = (oxt0Var2.c(i3) + oxt0Var2.o[i3]) - j2;
        } else {
            c = -9223372036854775807L;
        }
        int length = this.e.length();
        jb10[] jb10VarArr = new jb10[length];
        int i4 = 0;
        while (true) {
            looVar = this.e;
            if (i4 >= length) {
                break;
            }
            looVar.getIndexInTrackGroup(i4);
            jb10VarArr[i4] = new j9h(oxt0Var, a);
            i4++;
        }
        looVar.updateSelectedTrack(j2, j3, c, list2, jb10VarArr);
        long j4 = jArr[a];
        long c2 = oxt0Var.c(a) + j4;
        long j5 = list.isEmpty() ? j : -9223372036854775807L;
        int i5 = this.g + a;
        int selectedIndex = this.e.getSelectedIndex();
        osb osbVar = this.c[selectedIndex];
        Uri a2 = oxt0Var.a(this.e.getIndexInTrackGroup(selectedIndex), a);
        SystemClock.elapsedRealtime();
        a selectedFormat = this.e.getSelectedFormat();
        int selectionReason = this.e.getSelectionReason();
        Object selectionData = this.e.getSelectionData();
        mpg mpgVar = new mpg();
        mpgVar.a = a2;
        psbVar.a = new fee(this.d, mpgVar.a(), selectedFormat, selectionReason, selectionData, j4, c2, j5, -9223372036854775807L, i5, 1, j4, osbVar);
    }

    @Override // defpackage.usb
    public final void release() {
        for (osb osbVar : this.c) {
            ((su6) osbVar).d();
        }
    }
}
