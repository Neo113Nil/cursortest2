package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.session.m;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class bmh implements jkh {
    public final Context a;
    public final kkh b;
    public final bnp c;
    public final bdg d;
    public final zlh e;
    public final p33 f;
    public final Bundle g;
    public iwe i;
    public fhh j;
    public boolean k;
    public boolean l;
    public boolean o;
    public amh m = new amh();
    public amh n = new amh();
    public mmo p = new mmo(13);
    public final long h = 100;
    public long q = -9223372036854775807L;
    public long r = -9223372036854775807L;

    public bmh(Context context, kkh kkhVar, bnp bnpVar, Bundle bundle, Looper looper, p33 p33Var) {
        this.d = new bdg(looper, dzr.a, new wlh(this));
        this.a = context;
        this.b = kkhVar;
        this.e = new zlh(this, looper);
        this.c = bnpVar;
        this.g = bundle;
        this.f = p33Var;
        qsn qsnVar = qsn.e;
    }

    public static i6l Q0(i6l i6lVar) {
        if (i6lVar == null) {
            return null;
        }
        if (i6lVar.d > 0.0f) {
            return i6lVar;
        }
        vq1.n0("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j = i6lVar.c;
        long j2 = i6lVar.e;
        int i = i6lVar.f;
        CharSequence charSequence = i6lVar.g;
        AbstractCollection abstractCollection = i6lVar.i;
        if (abstractCollection != null) {
            arrayList.addAll(abstractCollection);
        }
        return new i6l(i6lVar.a, i6lVar.b, j, 1.0f, j2, i, charSequence, i6lVar.h, arrayList, i6lVar.j, i6lVar.k);
    }

    public static g8l R0(int i, onh onhVar, long j, boolean z) {
        return new g8l(null, i, onhVar, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    public static List X(List list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.jkh
    public final int A() {
        return ((rdl) this.p.b).c.f;
    }

    @Override // defpackage.jkh
    public final void A0(List list) {
        K0(list, Integer.MAX_VALUE);
    }

    @Override // defpackage.jkh
    public final void B() {
        this.i.v().a.skipToPrevious();
    }

    @Override // defpackage.jkh
    public final boolean B0() {
        rdl rdlVar = (rdl) this.p.b;
        if (rdlVar.q.a == 1) {
            return rdlVar.s;
        }
        iwe iweVar = this.i;
        if (iweVar == null) {
            return false;
        }
        rkh o = iweVar.o();
        hee heeVar = rwf.a;
        return o != null && o.e == 0;
    }

    @Override // defpackage.jkh
    public final void C() {
        W0(v0(), 0L);
    }

    @Override // defpackage.jkh
    public final boolean C0() {
        return ((rdl) this.p.b).i;
    }

    @Override // defpackage.jkh
    public final void D(int i, boolean z) {
        if (dvt.a < 23) {
            vq1.n0("MCImplLegacy", "Session doesn't support setting mute state at API level less than 23");
            return;
        }
        if (z != B0()) {
            rdl c = ((rdl) this.p.b).c(c0(), z);
            mmo mmoVar = this.p;
            Y0(new mmo(c, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        }
        ((okh) this.i.b).a.adjustVolume(z ? -100 : 100, i);
    }

    @Override // defpackage.jkh
    public final long D0() {
        return t0();
    }

    @Override // defpackage.jkh
    public final void E() {
        N(1);
    }

    @Override // defpackage.jkh
    public final void E0(int i) {
        o0(i, 1);
    }

    @Override // defpackage.jkh
    public final void F(int i) {
        int c0 = c0();
        int i2 = n0().c;
        if (i2 == 0 || c0 + 1 <= i2) {
            rdl c = ((rdl) this.p.b).c(c0 + 1, B0());
            mmo mmoVar = this.p;
            Y0(new mmo(c, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        }
        ((okh) this.i.b).a.adjustVolume(1, i);
    }

    @Override // defpackage.jkh
    public final void F0() {
        this.i.v().a.fastForward();
    }

    @Override // defpackage.jkh
    public final void G(int i, int i2, List list) {
        vq1.v(i >= 0 && i <= i2);
        int o = ((m) ((rdl) this.p.b).j).o();
        if (i > o) {
            return;
        }
        int min = Math.min(i2, o);
        K0(list, min);
        J(i, min);
    }

    @Override // defpackage.jkh
    public final void G0() {
        this.i.v().a.rewind();
    }

    @Override // defpackage.jkh
    public final hoh H0() {
        onh s = ((rdl) this.p.b).s();
        return s == null ? hoh.K : s.d;
    }

    @Override // defpackage.jkh
    public final void I(int i) {
        J(i, i + 1);
    }

    @Override // defpackage.jkh
    public final void I0(List list) {
        a0(0, -9223372036854775807L, list);
    }

    @Override // defpackage.jkh
    public final void J(int i, int i2) {
        vq1.v(i >= 0 && i2 >= i);
        int o = V().o();
        int min = Math.min(i2, o);
        if (i >= o || i == min) {
            return;
        }
        m mVar = (m) ((rdl) this.p.b).j;
        mVar.getClass();
        tde tdeVar = new tde(4);
        yde ydeVar = mVar.e;
        tdeVar.c(ydeVar.subList(0, i));
        tdeVar.c(ydeVar.subList(min, ydeVar.size()));
        m mVar2 = new m(tdeVar.f(), mVar.f);
        int v0 = v0();
        int i3 = min - i;
        if (v0 >= i) {
            v0 = v0 < min ? -1 : v0 - i3;
        }
        if (v0 == -1) {
            v0 = dvt.i(i, 0, mVar2.o() - 1);
            vq1.n0("MCImplLegacy", "Currently playing item is removed. Assumes item at " + v0 + " is the new current item");
        }
        rdl m = ((rdl) this.p.b).m(mVar2, v0);
        mmo mmoVar = this.p;
        Y0(new mmo(m, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        if (U0()) {
            while (i < min && i < this.m.a.size()) {
                this.i.w(((ksh) this.m.a.get(i)).a);
                i++;
            }
        }
    }

    @Override // defpackage.jkh
    public final long J0() {
        long c = vwh.c((rdl) this.p.b, this.q, this.r, this.b.f);
        this.q = c;
        return c;
    }

    @Override // defpackage.jkh
    public final void K() {
        this.i.v().a.skipToPrevious();
    }

    @Override // defpackage.jkh
    public final void K0(List list, int i) {
        vq1.v(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        m mVar = (m) ((rdl) this.p.b).j;
        if (mVar.p()) {
            a0(0, -9223372036854775807L, list);
            return;
        }
        int min = Math.min(i, V().o());
        m q = mVar.q(list, min);
        int v0 = v0();
        int size = list.size();
        if (v0 >= min) {
            v0 += size;
        }
        rdl m = ((rdl) this.p.b).m(q, v0);
        mmo mmoVar = this.p;
        Y0(new mmo(m, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        if (U0()) {
            z(list, min);
        }
    }

    @Override // defpackage.jkh
    public final void L(boolean z) {
        rdl rdlVar = (rdl) this.p.b;
        if (rdlVar.t == z) {
            return;
        }
        this.q = vwh.c(rdlVar, this.q, this.r, this.b.f);
        this.r = SystemClock.elapsedRealtime();
        rdl d = ((rdl) this.p.b).d(1, 0, z);
        mmo mmoVar = this.p;
        Y0(new mmo(d, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        if (!U0() || ((rdl) this.p.b).j.p()) {
            return;
        }
        iwe iweVar = this.i;
        if (z) {
            iweVar.v().a.play();
        } else {
            iweVar.v().a.pause();
        }
    }

    @Override // defpackage.jkh
    public final long L0() {
        return ((rdl) this.p.b).A;
    }

    @Override // defpackage.jkh
    public final void M() {
        this.i.v().a.skipToNext();
    }

    @Override // defpackage.jkh
    public final blp M0() {
        return (blp) this.p.c;
    }

    @Override // defpackage.jkh
    public final void N(int i) {
        int c0 = c0() - 1;
        if (c0 >= n0().b) {
            rdl c = ((rdl) this.p.b).c(c0, B0());
            mmo mmoVar = this.p;
            Y0(new mmo(c, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        }
        ((okh) this.i.b).a.adjustVolume(-1, i);
    }

    @Override // defpackage.jkh
    public final yde N0() {
        return (yde) this.p.e;
    }

    @Override // defpackage.jkh
    public final e3t O() {
        return e3t.b;
    }

    @Override // defpackage.jkh
    public final Bundle O0() {
        return this.g;
    }

    @Override // defpackage.jkh
    public final void P(dv1 dv1Var, boolean z) {
        vq1.n0("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // defpackage.jkh
    public final lcg P0(alp alpVar) {
        Bundle bundle = Bundle.EMPTY;
        boolean contains = ((blp) this.p.c).a.contains(alpVar);
        String str = alpVar.b;
        if (contains) {
            this.i.v().T(bundle, str);
            return leu.S(new ump(0));
        }
        xop xopVar = new xop();
        ss6 ss6Var = new ss6(this.b.e, xopVar, 4);
        iwe iweVar = this.i;
        iweVar.getClass();
        if (TextUtils.isEmpty(str)) {
            xq0.x("command must neither be null nor empty");
            return null;
        }
        ((okh) iweVar.b).a.sendCommand(str, bundle, ss6Var);
        return xopVar;
    }

    @Override // defpackage.jkh
    public final void Q(hoh hohVar) {
        vq1.n0("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // defpackage.jkh
    public final int R() {
        return -1;
    }

    @Override // defpackage.jkh
    public final void S(boolean z) {
        D(1, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x06c7, code lost:
    
        if (r10 != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x06c9, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x06cb, code lost:
    
        if (r10 != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x02cb, code lost:
    
        if (r34 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x02d3, code lost:
    
        if (defpackage.rwf.w(r13, 512) == false) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x07f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x07fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0832 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06ff  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0692 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02cb  */
    /* JADX WARN: Type inference failed for: r10v27, types: [java.util.AbstractCollection, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.AbstractCollection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S0(boolean z, amh amhVar) {
        MediaController.PlaybackInfo playbackInfo;
        String str;
        String str2;
        int i;
        rkh rkhVar;
        long j;
        m mVar;
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3;
        hoh j6;
        hoh hohVar;
        rkh rkhVar2;
        int i4;
        ioh iohVar;
        long j7;
        m mVar2;
        rkh rkhVar3;
        boolean z2;
        long j8;
        hoh hohVar2;
        int i5;
        boolean z3;
        yde f;
        int i6;
        boolean z4;
        int i7;
        qsn qsnVar;
        blp blpVar;
        ?? r10;
        String string;
        d8l d8lVar;
        qlp qlpVar;
        ioh iohVar2;
        long j9;
        blp blpVar2;
        rkh rkhVar4;
        hzk hzkVar;
        dv1 dv1Var;
        boolean z5;
        int i8;
        p08 c;
        m mVar3;
        onh onhVar;
        boolean p;
        pcn pcnVar;
        int i9;
        yde ydeVar;
        boolean z6;
        boolean z7;
        Integer num;
        Integer num2;
        if (this.k || !this.l) {
            return;
        }
        amh amhVar2 = this.m;
        mmo mmoVar = this.p;
        String packageName = ((okh) this.i.b).a.getPackageName();
        long flags = ((okh) this.i.b).a.getFlags();
        boolean z8 = ((okh) this.i.b).e.d() != null;
        int ratingType = ((okh) this.i.b).a.getRatingType();
        kkh kkhVar = this.b;
        long j10 = kkhVar.f;
        String volumeControlId = (dvt.a >= 30 && (playbackInfo = ((okh) this.i.b).a.getPlaybackInfo()) != null) ? playbackInfo.getVolumeControlId() : null;
        boolean z9 = this.o;
        List list = amhVar2.a;
        i6l i6lVar = (i6l) amhVar2.e;
        List list2 = amhVar.a;
        Bundle bundle = (Bundle) amhVar.h;
        boolean z10 = z8;
        i6l i6lVar2 = (i6l) amhVar.e;
        ioh iohVar3 = (ioh) amhVar.f;
        rkh rkhVar5 = (rkh) amhVar.d;
        boolean z11 = list != list2;
        if (z11) {
            m mVar4 = m.g;
            str2 = volumeControlId;
            hld.w(4, "initialCapacity");
            str = packageName;
            Object[] objArr = new Object[4];
            j = j10;
            int i10 = 0;
            int i11 = 0;
            while (i10 < list2.size()) {
                ksh kshVar = (ksh) list2.get(i10);
                hee heeVar = rwf.a;
                int i12 = i10;
                int i13 = ratingType;
                rkh rkhVar6 = rkhVar5;
                pcn pcnVar2 = new pcn(rwf.h(kshVar.a), kshVar.b, -9223372036854775807L);
                int i14 = i11 + 1;
                int e = pde.e(objArr.length, i14);
                if (e > objArr.length) {
                    objArr = Arrays.copyOf(objArr, e);
                }
                objArr[i11] = pcnVar2;
                ratingType = i13;
                i10 = i12 + 1;
                i11 = i14;
                rkhVar5 = rkhVar6;
            }
            i = ratingType;
            rkhVar = rkhVar5;
            mVar = new m(yde.t(i11, objArr), null);
        } else {
            str = packageName;
            str2 = volumeControlId;
            i = ratingType;
            rkhVar = rkhVar5;
            j = j10;
            m mVar5 = (m) ((rdl) mmoVar.b).j;
            mVar = new m(mVar5.e, mVar5.f);
        }
        boolean z12 = ((ioh) amhVar2.f) != iohVar3 || z;
        if (i6lVar == null) {
            j3 = -1;
            j2 = -1;
        } else {
            j2 = -1;
            j3 = i6lVar.j;
        }
        if (i6lVar2 == null) {
            j4 = j3;
            j5 = j2;
        } else {
            j4 = j3;
            j5 = i6lVar2.j;
        }
        boolean z13 = j4 != j5 || z;
        long d = rwf.d(iohVar3);
        boolean z14 = z12;
        if (z14 || z13 || z11) {
            int i15 = i;
            if (list2 != null && j5 != j2) {
                long j11 = j5;
                i2 = 0;
                while (i2 < list2.size()) {
                    if (((ksh) list2.get(i2)).b == j11) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i2 = -1;
            boolean z15 = iohVar3 != null;
            if (z15 && z14) {
                i3 = i15;
                j6 = rwf.k(iohVar3, i3);
            } else {
                i3 = i15;
                j6 = (z15 || !z13) ? ((rdl) mmoVar.b).z : i2 == -1 ? hoh.K : rwf.j(((ksh) list2.get(i2)).a, i3);
            }
            yde ydeVar2 = mVar.e;
            hoh hohVar3 = j6;
            int i16 = -1;
            if (i2 == -1) {
                if (!z14) {
                    i16 = -1;
                } else if (z15) {
                    vq1.n0("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                    CharSequence charSequence = iohVar3.a.getCharSequence("android.media.metadata.MEDIA_ID");
                    mVar = new m(ydeVar2, new pcn(rwf.i(charSequence != null ? charSequence.toString() : null, iohVar3, i3), -1L, d));
                    i2 = mVar.o() - 1;
                    hohVar = hohVar3;
                } else {
                    mVar = new m(ydeVar2, null);
                    i2 = 0;
                    hohVar = hohVar3;
                }
            }
            if (i2 != i16) {
                mVar = new m(ydeVar2, null);
                if (z15) {
                    onh onhVar2 = i2 >= mVar.o() ? null : mVar.s(i2).a;
                    onhVar2.getClass();
                    onh i17 = rwf.i(onhVar2.a, iohVar3, i3);
                    yde ydeVar3 = mVar.e;
                    int size = ydeVar3.size();
                    pcn pcnVar3 = mVar.f;
                    vq1.v(i2 < size || (i2 == ydeVar3.size() && pcnVar3 != null));
                    if (i2 == ydeVar3.size()) {
                        mVar = new m(ydeVar3, new pcn(i17, -1L, d));
                    } else {
                        long j12 = ((pcn) ydeVar3.get(i2)).b;
                        tde tdeVar = new tde(4);
                        tdeVar.c(ydeVar3.subList(0, i2));
                        tdeVar.a(new pcn(i17, j12, d));
                        tdeVar.c(ydeVar3.subList(i2 + 1, ydeVar3.size()));
                        mVar = new m(tdeVar.f(), pcnVar3);
                    }
                }
                hohVar = hohVar3;
            }
            i2 = 0;
            hohVar = hohVar3;
        } else {
            rdl rdlVar = (rdl) mmoVar.b;
            i2 = rdlVar.c.a.b;
            hohVar = rdlVar.z;
        }
        if (rkhVar != null) {
            rkhVar2 = rkhVar;
            i4 = rkhVar2.c;
        } else {
            rkhVar2 = rkhVar;
            i4 = 0;
        }
        bz2 bz2Var = new bz2(11);
        if (i6lVar2 == null) {
            iohVar = iohVar3;
            j7 = 0;
        } else {
            iohVar = iohVar3;
            j7 = i6lVar2.e;
        }
        if (i6lVar2 == null) {
            mVar2 = mVar;
        } else {
            mVar2 = mVar;
            switch (i6lVar2.a) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    rkhVar3 = rkhVar2;
                    z2 = true;
                    break;
            }
            if (rwf.w(j7, 4L) || z2) {
                j8 = 4;
                if (rwf.w(j7, 2L)) {
                }
            } else {
                j8 = 4;
            }
            bz2Var.i(1);
            if (rwf.w(j7, 16384L)) {
                bz2Var.i(2);
            }
            if ((rwf.w(j7, 32768L) && rwf.w(j7, 1024L)) || ((rwf.w(j7, 65536L) && rwf.w(j7, 2048L)) || (rwf.w(j7, 131072L) && rwf.w(j7, 8192L)))) {
                bz2Var.k(31, 2);
            }
            if (rwf.w(j7, 8L)) {
                bz2Var.i(11);
            }
            if (rwf.w(j7, 64L)) {
                bz2Var.i(12);
            }
            int i18 = i2;
            if (rwf.w(j7, 256L)) {
                bz2Var.k(5, 4);
            }
            if (rwf.w(j7, 32L)) {
                bz2Var.k(9, 8);
            }
            if (rwf.w(j7, 16L)) {
                bz2Var.k(7, 6);
            }
            if (rwf.w(j7, 4194304L)) {
                bz2Var.i(13);
            }
            if (rwf.w(j7, 1L)) {
                bz2Var.i(3);
            }
            if (i4 == 1) {
                bz2Var.k(26, 34);
            } else if (i4 == 2) {
                bz2Var.k(26, 34, 25, 33);
            }
            bz2Var.k(23, 17, 18, 16, 21, 32);
            if ((flags & j8) != 0) {
                bz2Var.i(20);
                if (rwf.w(j7, 4096L)) {
                    bz2Var.i(10);
                }
            }
            if (z10) {
                if (rwf.w(j7, 262144L)) {
                    bz2Var.i(15);
                }
                if (rwf.w(j7, 2097152L)) {
                    bz2Var.i(14);
                }
            }
            d8l d8lVar2 = new d8l(bz2Var.q());
            CharSequence charSequence2 = (CharSequence) amhVar2.g;
            CharSequence charSequence3 = (CharSequence) amhVar.g;
            if (charSequence2 == charSequence3) {
                hohVar2 = ((rdl) mmoVar.b).m;
            } else if (charSequence3 == null) {
                hohVar2 = hoh.K;
            } else {
                eoh eohVar = new eoh();
                eohVar.a = charSequence3;
                hohVar2 = new hoh(eohVar);
            }
            hoh hohVar4 = hohVar2;
            int q = rwf.q(amhVar.b);
            boolean s = rwf.s(amhVar.c);
            if (i6lVar != i6lVar2 || z9) {
                HashSet hashSet = new HashSet();
                qsn qsnVar2 = alp.d;
                for (int i19 = 0; i19 < qsnVar2.d; i19++) {
                    hashSet.add(new alp(((Integer) qsnVar2.get(i19)).intValue()));
                }
                if (!z10) {
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            alp alpVar = (alp) it.next();
                            if (alpVar.a == 40010) {
                                hashSet.remove(alpVar);
                            }
                        }
                    }
                }
                if (i6lVar2 != null && (r10 = i6lVar2.i) != 0) {
                    for (h6l h6lVar : r10) {
                        String str3 = h6lVar.a;
                        Bundle bundle2 = h6lVar.d;
                        if (bundle2 == null) {
                            bundle2 = Bundle.EMPTY;
                        }
                        hashSet.add(new alp(bundle2, str3));
                    }
                }
                blp blpVar3 = new blp(hashSet);
                if (i6lVar2 == null) {
                    ude udeVar = yde.b;
                    qsnVar = qsn.e;
                } else {
                    ?? r9 = i6lVar2.i;
                    if (r9 == 0) {
                        ude udeVar2 = yde.b;
                        qsnVar = qsn.e;
                    } else {
                        hld.w(4, "initialCapacity");
                        Object[] objArr2 = new Object[4];
                        Iterator it2 = r9.iterator();
                        int i20 = 0;
                        while (it2.hasNext()) {
                            h6l h6lVar2 = (h6l) it2.next();
                            String str4 = h6lVar2.a;
                            Bundle bundle3 = h6lVar2.d;
                            if (bundle3 != null) {
                                i6 = q;
                                z4 = s;
                                i7 = bundle3.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                            } else {
                                i6 = q;
                                z4 = s;
                                i7 = 0;
                            }
                            Iterator it3 = it2;
                            sb5 sb5Var = new sb5(i7, h6lVar2.c);
                            if (bundle3 == null) {
                                bundle3 = Bundle.EMPTY;
                            }
                            sb5Var.c(new alp(bundle3, str4));
                            sb5Var.f = h6lVar2.b;
                            sb5Var.h = true;
                            tb5 a = sb5Var.a();
                            int i21 = i20 + 1;
                            int e2 = pde.e(objArr2.length, i21);
                            if (e2 > objArr2.length) {
                                objArr2 = Arrays.copyOf(objArr2, e2);
                            }
                            objArr2[i20] = a;
                            i20 = i21;
                            q = i6;
                            s = z4;
                            it2 = it3;
                        }
                        i5 = q;
                        z3 = s;
                        f = tb5.f(yde.t(i20, objArr2), d8lVar2, bundle);
                        blpVar = blpVar3;
                    }
                }
                i5 = q;
                f = qsnVar;
                z3 = s;
                blpVar = blpVar3;
            } else {
                blpVar = (blp) mmoVar.c;
                f = (yde) mmoVar.e;
                i5 = q;
                z3 = s;
            }
            hzk m = rwf.m(i6lVar2);
            if (i6lVar2 != null) {
                int i22 = i6lVar2.a;
                int i23 = i6lVar2.f;
                CharSequence charSequence4 = i6lVar2.g;
                Bundle bundle4 = i6lVar2.k;
                if (i22 != 7 && i23 != 0) {
                    int r = rwf.r(i23);
                    if (charSequence4 != null) {
                        string = charSequence4.toString();
                    } else {
                        Context context = this.a;
                        if (r == -100) {
                            string = context.getString(R.string.error_message_disconnected);
                        } else if (r == 1) {
                            string = context.getString(R.string.error_message_info_cancelled);
                        } else if (r == -6) {
                            string = context.getString(R.string.error_message_not_supported);
                        } else if (r == -5) {
                            string = context.getString(R.string.error_message_io);
                        } else if (r == -4) {
                            string = context.getString(R.string.error_message_permission_denied);
                        } else if (r == -3) {
                            string = context.getString(R.string.error_message_bad_value);
                        } else if (r != -2) {
                            switch (r) {
                                case -110:
                                    string = context.getString(R.string.error_message_content_already_playing);
                                    break;
                                case -109:
                                    string = context.getString(R.string.error_message_end_of_playlist);
                                    break;
                                case -108:
                                    string = context.getString(R.string.error_message_setup_required);
                                    break;
                                case -107:
                                    string = context.getString(R.string.error_message_skip_limit_reached);
                                    break;
                                case -106:
                                    string = context.getString(R.string.error_message_not_available_in_region);
                                    break;
                                case -105:
                                    string = context.getString(R.string.error_message_parental_control_restricted);
                                    break;
                                case -104:
                                    string = context.getString(R.string.error_message_concurrent_stream_limit);
                                    break;
                                case -103:
                                    string = context.getString(R.string.error_message_premium_account_required);
                                    break;
                                case -102:
                                    string = context.getString(R.string.error_message_authentication_expired);
                                    break;
                                default:
                                    string = context.getString(R.string.error_message_fallback);
                                    break;
                            }
                        } else {
                            string = context.getString(R.string.error_message_invalid_state);
                        }
                    }
                    if (bundle4 == null) {
                        bundle4 = Bundle.EMPTY;
                    }
                    qlp qlpVar2 = new qlp(string, r, bundle4);
                    d8lVar = d8lVar2;
                    qlpVar = qlpVar2;
                    iohVar2 = iohVar;
                    j9 = j;
                    blpVar2 = blpVar;
                    long c2 = rwf.c(i6lVar2, iohVar2, j9);
                    long a2 = rwf.a(i6lVar2, iohVar2, j9);
                    d8l d8lVar3 = d8lVar;
                    yde ydeVar4 = f;
                    blp blpVar4 = blpVar2;
                    qlp qlpVar3 = qlpVar;
                    int b = vwh.b(rwf.a(i6lVar2, iohVar2, j9), rwf.d(iohVar2));
                    long a3 = rwf.a(i6lVar2, iohVar2, j9) - rwf.c(i6lVar2, iohVar2, j9);
                    boolean z16 = (iohVar2 == null || iohVar2.a("android.media.metadata.ADVERTISEMENT") == 0) ? false : true;
                    p0l p0lVar = i6lVar2 == null ? p0l.d : new p0l(i6lVar2.d);
                    if (rkhVar3 == null) {
                        hzkVar = m;
                        dv1Var = dv1.g;
                        rkhVar4 = rkhVar3;
                    } else {
                        rkhVar4 = rkhVar3;
                        ev1 ev1Var = rkhVar4.b.a;
                        hzkVar = m;
                        AudioAttributes audioAttributes = ev1Var.a;
                        audioAttributes.getClass();
                        dv1Var = new dv1(audioAttributes.getContentType(), ev1Var.a(), ev1Var.b(), 1, 0);
                    }
                    if (i6lVar2 != null) {
                        switch (i6lVar2.a) {
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 9:
                            case 10:
                            case 11:
                                z5 = true;
                                break;
                        }
                        if (i6lVar2 != null) {
                            try {
                                int i24 = i6lVar2.a;
                                long d2 = rwf.d(iohVar2);
                                boolean z17 = d2 != -9223372036854775807L && rwf.c(i6lVar2, iohVar2, j9) >= d2;
                                switch (i24) {
                                    case 1:
                                        break;
                                    case 0:
                                    case 7:
                                    case 8:
                                        i8 = 1;
                                        break;
                                    case 2:
                                        break;
                                    case 3:
                                        i8 = 3;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 9:
                                    case 10:
                                    case 11:
                                        i8 = 2;
                                        break;
                                    default:
                                        throw new qwf("Invalid state of PlaybackStateCompat: " + i24);
                                }
                            } catch (qwf unused) {
                                vq1.K("MCImplLegacy", "Received invalid playback state " + i6lVar2.a + " from package " + str + ". Keeping the previous state.");
                                i8 = ((rdl) mmoVar.b).y;
                            }
                            int i25 = i8;
                            boolean z18 = i6lVar2 != null && i6lVar2.a == 3;
                            if (rkhVar4 != null) {
                                c = p08.e;
                            } else {
                                int i26 = rkhVar4.a == 2 ? 1 : 0;
                                n8n n8nVar = new n8n(i26);
                                n8nVar.d = rkhVar4.d;
                                vq1.v(i26 != 0 || str2 == null);
                                n8nVar.e = str2;
                                c = n8nVar.c();
                            }
                            p08 p08Var = c;
                            int i27 = rkhVar4 != null ? 0 : rkhVar4.e;
                            boolean z19 = rkhVar4 != null && rkhVar4.e == 0;
                            rdl rdlVar2 = (rdl) mmoVar.b;
                            long j13 = rdlVar2.A;
                            long j14 = rdlVar2.B;
                            long j15 = rdlVar2.C;
                            Bundle bundle5 = (Bundle) amhVar.h;
                            if (i18 >= mVar2.o()) {
                                mVar3 = mVar2;
                                onhVar = null;
                            } else {
                                mVar3 = mVar2;
                                onhVar = mVar3.s(i18).a;
                            }
                            tmp tmpVar = new tmp(R0(i18, onhVar, c2, z16), z16, SystemClock.elapsedRealtime(), d, a2, b, a3, -9223372036854775807L, d, a2);
                            g8l g8lVar = tmp.k;
                            int i28 = i5;
                            rdl rdlVar3 = new rdl(hzkVar, 0, tmpVar, g8lVar, g8lVar, 0, p0lVar, i28, z3, tcu.d, mVar3, 0, hohVar4, 1.0f, dv1Var, sv6.c, p08Var, i27, z19, z5, 1, 0, i25, z18, false, hohVar, j13, j14, j15, e3t.b, w0t.F);
                            mmo mmoVar2 = new mmo(rdlVar3, blpVar4, d8lVar3, ydeVar4, bundle5, qlpVar3);
                            amh amhVar3 = this.m;
                            mmo mmoVar3 = this.p;
                            long j16 = kkhVar.f;
                            Integer num3 = 3;
                            p = ((rdl) mmoVar3.b).j.p();
                            boolean p2 = mVar3.p();
                            if (!p && p2) {
                                num3 = null;
                                num = null;
                            } else if (p || p2) {
                                onh s2 = ((rdl) mmoVar3.b).s();
                                vq1.B(s2);
                                pcnVar = mVar3.f;
                                if (pcnVar != null || !s2.equals(pcnVar.a)) {
                                    i9 = 0;
                                    while (true) {
                                        ydeVar = mVar3.e;
                                        if (i9 >= ydeVar.size()) {
                                            z6 = false;
                                        } else if (!s2.equals(((pcn) ydeVar.get(i9)).a)) {
                                            i9++;
                                        }
                                    }
                                    if (z6) {
                                        num = 4;
                                    } else {
                                        if (!s2.equals(rdlVar3.s())) {
                                            z7 = true;
                                            num3 = 1;
                                            num = 0;
                                            Pair create = Pair.create(num, num3);
                                            X0(z, amhVar, true, mmoVar2, (Integer) create.first, (Integer) create.second);
                                            if (this.o) {
                                                return;
                                            }
                                            this.o = false;
                                            if (Looper.myLooper() != kkhVar.e.getLooper()) {
                                                z7 = false;
                                            }
                                            vq1.A(z7);
                                            kkhVar.d.getClass();
                                            return;
                                        }
                                        long c3 = rwf.c((i6l) amhVar3.e, (ioh) amhVar3.f, j16);
                                        long c4 = rwf.c(i6lVar2, iohVar2, j16);
                                        if (c4 == 0 && i28 == 1) {
                                            num = 0;
                                            num2 = null;
                                        } else {
                                            num = Math.abs(c3 - c4) > 100 ? 5 : null;
                                            num2 = null;
                                        }
                                        num3 = num2;
                                    }
                                }
                                z6 = true;
                                if (z6) {
                                }
                            } else {
                                num = 0;
                            }
                            z7 = true;
                            Pair create2 = Pair.create(num, num3);
                            X0(z, amhVar, true, mmoVar2, (Integer) create2.first, (Integer) create2.second);
                            if (this.o) {
                            }
                        }
                        i8 = 1;
                        int i252 = i8;
                        if (i6lVar2 != null) {
                            if (rkhVar4 != null) {
                            }
                            p08 p08Var2 = c;
                            if (rkhVar4 != null) {
                            }
                            if (rkhVar4 != null) {
                                rdl rdlVar22 = (rdl) mmoVar.b;
                                long j132 = rdlVar22.A;
                                long j142 = rdlVar22.B;
                                long j152 = rdlVar22.C;
                                Bundle bundle52 = (Bundle) amhVar.h;
                                if (i18 >= mVar2.o()) {
                                }
                                tmp tmpVar2 = new tmp(R0(i18, onhVar, c2, z16), z16, SystemClock.elapsedRealtime(), d, a2, b, a3, -9223372036854775807L, d, a2);
                                g8l g8lVar2 = tmp.k;
                                int i282 = i5;
                                rdl rdlVar32 = new rdl(hzkVar, 0, tmpVar2, g8lVar2, g8lVar2, 0, p0lVar, i282, z3, tcu.d, mVar3, 0, hohVar4, 1.0f, dv1Var, sv6.c, p08Var2, i27, z19, z5, 1, 0, i252, z18, false, hohVar, j132, j142, j152, e3t.b, w0t.F);
                                mmo mmoVar22 = new mmo(rdlVar32, blpVar4, d8lVar3, ydeVar4, bundle52, qlpVar3);
                                amh amhVar32 = this.m;
                                mmo mmoVar32 = this.p;
                                long j162 = kkhVar.f;
                                Integer num32 = 3;
                                p = ((rdl) mmoVar32.b).j.p();
                                boolean p22 = mVar3.p();
                                if (!p) {
                                }
                                if (p) {
                                }
                                onh s22 = ((rdl) mmoVar32.b).s();
                                vq1.B(s22);
                                pcnVar = mVar3.f;
                                if (pcnVar != null) {
                                }
                                i9 = 0;
                                while (true) {
                                    ydeVar = mVar3.e;
                                    if (i9 >= ydeVar.size()) {
                                    }
                                    i9++;
                                }
                                if (z6) {
                                }
                                z7 = true;
                                Pair create22 = Pair.create(num, num32);
                                X0(z, amhVar, true, mmoVar22, (Integer) create22.first, (Integer) create22.second);
                                if (this.o) {
                                }
                            }
                            rdl rdlVar222 = (rdl) mmoVar.b;
                            long j1322 = rdlVar222.A;
                            long j1422 = rdlVar222.B;
                            long j1522 = rdlVar222.C;
                            Bundle bundle522 = (Bundle) amhVar.h;
                            if (i18 >= mVar2.o()) {
                            }
                            tmp tmpVar22 = new tmp(R0(i18, onhVar, c2, z16), z16, SystemClock.elapsedRealtime(), d, a2, b, a3, -9223372036854775807L, d, a2);
                            g8l g8lVar22 = tmp.k;
                            int i2822 = i5;
                            rdl rdlVar322 = new rdl(hzkVar, 0, tmpVar22, g8lVar22, g8lVar22, 0, p0lVar, i2822, z3, tcu.d, mVar3, 0, hohVar4, 1.0f, dv1Var, sv6.c, p08Var2, i27, z19, z5, 1, 0, i252, z18, false, hohVar, j1322, j1422, j1522, e3t.b, w0t.F);
                            mmo mmoVar222 = new mmo(rdlVar322, blpVar4, d8lVar3, ydeVar4, bundle522, qlpVar3);
                            amh amhVar322 = this.m;
                            mmo mmoVar322 = this.p;
                            long j1622 = kkhVar.f;
                            Integer num322 = 3;
                            p = ((rdl) mmoVar322.b).j.p();
                            boolean p222 = mVar3.p();
                            if (!p) {
                            }
                            if (p) {
                            }
                            onh s222 = ((rdl) mmoVar322.b).s();
                            vq1.B(s222);
                            pcnVar = mVar3.f;
                            if (pcnVar != null) {
                            }
                            i9 = 0;
                            while (true) {
                                ydeVar = mVar3.e;
                                if (i9 >= ydeVar.size()) {
                                }
                                i9++;
                            }
                            if (z6) {
                            }
                            z7 = true;
                            Pair create222 = Pair.create(num, num322);
                            X0(z, amhVar, true, mmoVar222, (Integer) create222.first, (Integer) create222.second);
                            if (this.o) {
                            }
                        }
                        if (rkhVar4 != null) {
                        }
                        p08 p08Var22 = c;
                        if (rkhVar4 != null) {
                        }
                        if (rkhVar4 != null) {
                        }
                        rdl rdlVar2222 = (rdl) mmoVar.b;
                        long j13222 = rdlVar2222.A;
                        long j14222 = rdlVar2222.B;
                        long j15222 = rdlVar2222.C;
                        Bundle bundle5222 = (Bundle) amhVar.h;
                        if (i18 >= mVar2.o()) {
                        }
                        tmp tmpVar222 = new tmp(R0(i18, onhVar, c2, z16), z16, SystemClock.elapsedRealtime(), d, a2, b, a3, -9223372036854775807L, d, a2);
                        g8l g8lVar222 = tmp.k;
                        int i28222 = i5;
                        rdl rdlVar3222 = new rdl(hzkVar, 0, tmpVar222, g8lVar222, g8lVar222, 0, p0lVar, i28222, z3, tcu.d, mVar3, 0, hohVar4, 1.0f, dv1Var, sv6.c, p08Var22, i27, z19, z5, 1, 0, i252, z18, false, hohVar, j13222, j14222, j15222, e3t.b, w0t.F);
                        mmo mmoVar2222 = new mmo(rdlVar3222, blpVar4, d8lVar3, ydeVar4, bundle5222, qlpVar3);
                        amh amhVar3222 = this.m;
                        mmo mmoVar3222 = this.p;
                        long j16222 = kkhVar.f;
                        Integer num3222 = 3;
                        p = ((rdl) mmoVar3222.b).j.p();
                        boolean p2222 = mVar3.p();
                        if (!p) {
                        }
                        if (p) {
                        }
                        onh s2222 = ((rdl) mmoVar3222.b).s();
                        vq1.B(s2222);
                        pcnVar = mVar3.f;
                        if (pcnVar != null) {
                        }
                        i9 = 0;
                        while (true) {
                            ydeVar = mVar3.e;
                            if (i9 >= ydeVar.size()) {
                            }
                            i9++;
                        }
                        if (z6) {
                        }
                        z7 = true;
                        Pair create2222 = Pair.create(num, num3222);
                        X0(z, amhVar, true, mmoVar2222, (Integer) create2222.first, (Integer) create2222.second);
                        if (this.o) {
                        }
                    }
                    z5 = false;
                    if (i6lVar2 != null) {
                    }
                    i8 = 1;
                    int i2522 = i8;
                    if (i6lVar2 != null) {
                    }
                    if (rkhVar4 != null) {
                    }
                    p08 p08Var222 = c;
                    if (rkhVar4 != null) {
                    }
                    if (rkhVar4 != null) {
                    }
                    rdl rdlVar22222 = (rdl) mmoVar.b;
                    long j132222 = rdlVar22222.A;
                    long j142222 = rdlVar22222.B;
                    long j152222 = rdlVar22222.C;
                    Bundle bundle52222 = (Bundle) amhVar.h;
                    if (i18 >= mVar2.o()) {
                    }
                    tmp tmpVar2222 = new tmp(R0(i18, onhVar, c2, z16), z16, SystemClock.elapsedRealtime(), d, a2, b, a3, -9223372036854775807L, d, a2);
                    g8l g8lVar2222 = tmp.k;
                    int i282222 = i5;
                    rdl rdlVar32222 = new rdl(hzkVar, 0, tmpVar2222, g8lVar2222, g8lVar2222, 0, p0lVar, i282222, z3, tcu.d, mVar3, 0, hohVar4, 1.0f, dv1Var, sv6.c, p08Var222, i27, z19, z5, 1, 0, i2522, z18, false, hohVar, j132222, j142222, j152222, e3t.b, w0t.F);
                    mmo mmoVar22222 = new mmo(rdlVar32222, blpVar4, d8lVar3, ydeVar4, bundle52222, qlpVar3);
                    amh amhVar32222 = this.m;
                    mmo mmoVar32222 = this.p;
                    long j162222 = kkhVar.f;
                    Integer num32222 = 3;
                    p = ((rdl) mmoVar32222.b).j.p();
                    boolean p22222 = mVar3.p();
                    if (!p) {
                    }
                    if (p) {
                    }
                    onh s22222 = ((rdl) mmoVar32222.b).s();
                    vq1.B(s22222);
                    pcnVar = mVar3.f;
                    if (pcnVar != null) {
                    }
                    i9 = 0;
                    while (true) {
                        ydeVar = mVar3.e;
                        if (i9 >= ydeVar.size()) {
                        }
                        i9++;
                    }
                    if (z6) {
                    }
                    z7 = true;
                    Pair create22222 = Pair.create(num, num32222);
                    X0(z, amhVar, true, mmoVar22222, (Integer) create22222.first, (Integer) create22222.second);
                    if (this.o) {
                    }
                }
            }
            d8lVar = d8lVar2;
            blpVar2 = blpVar;
            iohVar2 = iohVar;
            j9 = j;
            qlpVar = null;
            long c22 = rwf.c(i6lVar2, iohVar2, j9);
            long a22 = rwf.a(i6lVar2, iohVar2, j9);
            d8l d8lVar32 = d8lVar;
            yde ydeVar42 = f;
            blp blpVar42 = blpVar2;
            qlp qlpVar32 = qlpVar;
            int b2 = vwh.b(rwf.a(i6lVar2, iohVar2, j9), rwf.d(iohVar2));
            long a32 = rwf.a(i6lVar2, iohVar2, j9) - rwf.c(i6lVar2, iohVar2, j9);
            if (iohVar2 == null) {
                if (i6lVar2 == null) {
                }
                if (rkhVar3 == null) {
                }
                if (i6lVar2 != null) {
                }
                z5 = false;
                if (i6lVar2 != null) {
                }
                i8 = 1;
                int i25222 = i8;
                if (i6lVar2 != null) {
                }
                if (rkhVar4 != null) {
                }
                p08 p08Var2222 = c;
                if (rkhVar4 != null) {
                }
                if (rkhVar4 != null) {
                }
                rdl rdlVar222222 = (rdl) mmoVar.b;
                long j1322222 = rdlVar222222.A;
                long j1422222 = rdlVar222222.B;
                long j1522222 = rdlVar222222.C;
                Bundle bundle522222 = (Bundle) amhVar.h;
                if (i18 >= mVar2.o()) {
                }
                tmp tmpVar22222 = new tmp(R0(i18, onhVar, c22, z16), z16, SystemClock.elapsedRealtime(), d, a22, b2, a32, -9223372036854775807L, d, a22);
                g8l g8lVar22222 = tmp.k;
                int i2822222 = i5;
                rdl rdlVar322222 = new rdl(hzkVar, 0, tmpVar22222, g8lVar22222, g8lVar22222, 0, p0lVar, i2822222, z3, tcu.d, mVar3, 0, hohVar4, 1.0f, dv1Var, sv6.c, p08Var2222, i27, z19, z5, 1, 0, i25222, z18, false, hohVar, j1322222, j1422222, j1522222, e3t.b, w0t.F);
                mmo mmoVar222222 = new mmo(rdlVar322222, blpVar42, d8lVar32, ydeVar42, bundle522222, qlpVar32);
                amh amhVar322222 = this.m;
                mmo mmoVar322222 = this.p;
                long j1622222 = kkhVar.f;
                Integer num322222 = 3;
                p = ((rdl) mmoVar322222.b).j.p();
                boolean p222222 = mVar3.p();
                if (!p) {
                }
                if (p) {
                }
                onh s222222 = ((rdl) mmoVar322222.b).s();
                vq1.B(s222222);
                pcnVar = mVar3.f;
                if (pcnVar != null) {
                }
                i9 = 0;
                while (true) {
                    ydeVar = mVar3.e;
                    if (i9 >= ydeVar.size()) {
                    }
                    i9++;
                }
                if (z6) {
                }
                z7 = true;
                Pair create222222 = Pair.create(num, num322222);
                X0(z, amhVar, true, mmoVar222222, (Integer) create222222.first, (Integer) create222222.second);
                if (this.o) {
                }
            }
            if (i6lVar2 == null) {
            }
            if (rkhVar3 == null) {
            }
            if (i6lVar2 != null) {
            }
            z5 = false;
            if (i6lVar2 != null) {
            }
            i8 = 1;
            int i252222 = i8;
            if (i6lVar2 != null) {
            }
            if (rkhVar4 != null) {
            }
            p08 p08Var22222 = c;
            if (rkhVar4 != null) {
            }
            if (rkhVar4 != null) {
            }
            rdl rdlVar2222222 = (rdl) mmoVar.b;
            long j13222222 = rdlVar2222222.A;
            long j14222222 = rdlVar2222222.B;
            long j15222222 = rdlVar2222222.C;
            Bundle bundle5222222 = (Bundle) amhVar.h;
            if (i18 >= mVar2.o()) {
            }
            tmp tmpVar222222 = new tmp(R0(i18, onhVar, c22, z16), z16, SystemClock.elapsedRealtime(), d, a22, b2, a32, -9223372036854775807L, d, a22);
            g8l g8lVar222222 = tmp.k;
            int i28222222 = i5;
            rdl rdlVar3222222 = new rdl(hzkVar, 0, tmpVar222222, g8lVar222222, g8lVar222222, 0, p0lVar, i28222222, z3, tcu.d, mVar3, 0, hohVar4, 1.0f, dv1Var, sv6.c, p08Var22222, i27, z19, z5, 1, 0, i252222, z18, false, hohVar, j13222222, j14222222, j15222222, e3t.b, w0t.F);
            mmo mmoVar2222222 = new mmo(rdlVar3222222, blpVar42, d8lVar32, ydeVar42, bundle5222222, qlpVar32);
            amh amhVar3222222 = this.m;
            mmo mmoVar3222222 = this.p;
            long j16222222 = kkhVar.f;
            Integer num3222222 = 3;
            p = ((rdl) mmoVar3222222.b).j.p();
            boolean p2222222 = mVar3.p();
            if (!p) {
            }
            if (p) {
            }
            onh s2222222 = ((rdl) mmoVar3222222.b).s();
            vq1.B(s2222222);
            pcnVar = mVar3.f;
            if (pcnVar != null) {
            }
            i9 = 0;
            while (true) {
                ydeVar = mVar3.e;
                if (i9 >= ydeVar.size()) {
                }
                i9++;
            }
            if (z6) {
            }
            z7 = true;
            Pair create2222222 = Pair.create(num, num3222222);
            X0(z, amhVar, true, mmoVar2222222, (Integer) create2222222.first, (Integer) create2222222.second);
            if (this.o) {
            }
        }
        rkhVar3 = rkhVar2;
        z2 = false;
        if (rwf.w(j7, 4L)) {
        }
        j8 = 4;
        if (rwf.w(j7, 2L)) {
        }
    }

    @Override // defpackage.jkh
    public final void T(onh onhVar) {
        x(onhVar, -9223372036854775807L);
    }

    public final void T0() {
        ris risVar = new ris();
        vq1.A(U0() && !((rdl) this.p.b).j.p());
        rdl rdlVar = (rdl) this.p.b;
        m mVar = (m) rdlVar.j;
        int i = rdlVar.c.a.b;
        mVar.m(i, risVar, 0L);
        onh onhVar = risVar.c;
        if (mVar.r(i) != -1) {
            boolean z = ((rdl) this.p.b).t;
            iwe iweVar = this.i;
            if (z) {
                iweVar.v().a.play();
            } else {
                iweVar.v().a.prepare();
            }
        } else {
            jnh jnhVar = onhVar.f;
            String str = onhVar.a;
            if (jnhVar.a != null) {
                boolean z2 = ((rdl) this.p.b).t;
                iwe iweVar2 = this.i;
                if (z2) {
                    tkh v = iweVar2.v();
                    Uri uri = jnhVar.a;
                    Bundle bundle = jnhVar.c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    v.a.playFromUri(uri, bundle);
                } else {
                    tkh v2 = iweVar2.v();
                    Uri uri2 = jnhVar.a;
                    Bundle bundle2 = jnhVar.c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    v2.a.prepareFromUri(uri2, bundle2);
                }
            } else {
                String str2 = jnhVar.b;
                mmo mmoVar = this.p;
                if (str2 != null) {
                    boolean z3 = ((rdl) mmoVar.b).t;
                    iwe iweVar3 = this.i;
                    if (z3) {
                        tkh v3 = iweVar3.v();
                        String str3 = jnhVar.b;
                        Bundle bundle3 = jnhVar.c;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        v3.a.playFromSearch(str3, bundle3);
                    } else {
                        tkh v4 = iweVar3.v();
                        String str4 = jnhVar.b;
                        Bundle bundle4 = jnhVar.c;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        v4.a.prepareFromSearch(str4, bundle4);
                    }
                } else {
                    boolean z4 = ((rdl) mmoVar.b).t;
                    iwe iweVar4 = this.i;
                    if (z4) {
                        tkh v5 = iweVar4.v();
                        Bundle bundle5 = jnhVar.c;
                        if (bundle5 == null) {
                            bundle5 = Bundle.EMPTY;
                        }
                        v5.a.playFromMediaId(str, bundle5);
                    } else {
                        tkh v6 = iweVar4.v();
                        Bundle bundle6 = jnhVar.c;
                        if (bundle6 == null) {
                            bundle6 = Bundle.EMPTY;
                        }
                        v6.a.prepareFromMediaId(str, bundle6);
                    }
                }
            }
        }
        if (((rdl) this.p.b).c.a.f != 0) {
            this.i.v().a.seekTo(((rdl) this.p.b).c.a.f);
        }
        if (((d8l) this.p.d).a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < mVar.o(); i2++) {
                if (i2 != i && mVar.r(i2) == -1) {
                    mVar.m(i2, risVar, 0L);
                    arrayList.add(risVar.c);
                }
            }
            z(arrayList, 0);
        }
    }

    @Override // defpackage.jkh
    public final int U() {
        return 0;
    }

    public final boolean U0() {
        return ((rdl) this.p.b).y != 1;
    }

    @Override // defpackage.jkh
    public final sis V() {
        return ((rdl) this.p.b).j;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V0() {
        ioh iohVar;
        int i;
        d9e d;
        int z;
        if (this.k || this.l) {
            return;
        }
        this.l = true;
        rkh o = this.i.o();
        i6l Q0 = Q0(this.i.p());
        MediaMetadata metadata = ((okh) this.i.b).a.getMetadata();
        if (metadata != null) {
            xy0 xy0Var = ioh.c;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            iohVar = ioh.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            iohVar.b = metadata;
        } else {
            iohVar = null;
        }
        List<MediaSession.QueueItem> queue = ((okh) this.i.b).a.getQueue();
        List X = X(queue != null ? ksh.a(queue) : null);
        CharSequence queueTitle = ((okh) this.i.b).a.getQueueTitle();
        d9e d2 = ((okh) this.i.b).e.d();
        int i2 = -1;
        if (d2 != null) {
            try {
                i = -1;
                i2 = d2.g();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e);
            }
            d = ((okh) this.i.b).e.d();
            if (d != null) {
                try {
                    z = d.z();
                } catch (RemoteException e2) {
                    Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e2);
                }
                S0(true, new amh(o, Q0, iohVar, X, queueTitle, i2, z, ((okh) this.i.b).a.getExtras()));
            }
            z = i;
            S0(true, new amh(o, Q0, iohVar, X, queueTitle, i2, z, ((okh) this.i.b).a.getExtras()));
        }
        i = -1;
        d = ((okh) this.i.b).e.d();
        if (d != null) {
        }
        z = i;
        S0(true, new amh(o, Q0, iohVar, X, queueTitle, i2, z, ((okh) this.i.b).a.getExtras()));
    }

    @Override // defpackage.jkh
    public final void W(int i, onh onhVar) {
        G(i, i + 1, yde.y(onhVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W0(int i, long j) {
        Integer num;
        Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        rdl j5;
        int i3 = i;
        long j6 = j;
        vq1.v(i3 >= 0);
        int v0 = v0();
        sis sisVar = ((rdl) this.p.b).j;
        if ((sisVar.p() || i3 < sisVar.o()) && !i()) {
            if (i3 != v0) {
                long r = ((m) ((rdl) this.p.b).j).r(i3);
                if (r != -1) {
                    this.i.v().a.skipToQueueItem(r);
                    num = 2;
                    long J0 = J0();
                    if (j6 != -9223372036854775807L) {
                        j6 = J0;
                        num2 = null;
                    } else {
                        this.i.v().a.seekTo(j6);
                        num2 = 1;
                    }
                    if (num != null) {
                        long t0 = t0();
                        long duration = getDuration();
                        long max = j6 < J0 ? j6 : Math.max(j6, t0);
                        j2 = max;
                        i2 = duration == -9223372036854775807L ? 0 : (int) ((100 * max) / duration);
                        j3 = max - j6;
                        j4 = duration;
                    } else {
                        i2 = 0;
                        j2 = 0;
                        j3 = 0;
                        j4 = -9223372036854775807L;
                    }
                    j5 = ((rdl) this.p.b).j(new tmp(R0(i3, sisVar.p() ? sisVar.m(i3, new ris(), 0L).c : null, j6, false), false, SystemClock.elapsedRealtime(), j4, j2, i2, j3, -9223372036854775807L, j4, j2));
                    if (j5.y != 1) {
                        j5 = j5.f(2, null);
                    }
                    rdl rdlVar = j5;
                    mmo mmoVar = this.p;
                    Y0(new mmo(rdlVar, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), num2, num);
                }
                dfi.o(i3, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", "MCImplLegacy");
            }
            i3 = v0;
            num = null;
            long J02 = J0();
            if (j6 != -9223372036854775807L) {
            }
            if (num != null) {
            }
            j5 = ((rdl) this.p.b).j(new tmp(R0(i3, sisVar.p() ? sisVar.m(i3, new ris(), 0L).c : null, j6, false), false, SystemClock.elapsedRealtime(), j4, j2, i2, j3, -9223372036854775807L, j4, j2));
            if (j5.y != 1) {
            }
            rdl rdlVar2 = j5;
            mmo mmoVar2 = this.p;
            Y0(new mmo(rdlVar2, (blp) mmoVar2.c, (d8l) mmoVar2.d, (yde) mmoVar2.e, (Bundle) mmoVar2.f, (qlp) null), num2, num);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x00d3, code lost:
    
        if (r10 == r3) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (android.text.TextUtils.equals(r4.g, r12.g) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(boolean z, amh amhVar, boolean z2, final mmo mmoVar, Integer num, Integer num2) {
        boolean z3;
        final ?? r3;
        yde ydeVar = (yde) mmoVar.e;
        amh amhVar2 = this.m;
        mmo mmoVar2 = this.p;
        if (amhVar2 != amhVar) {
            this.m = new amh(amhVar);
        }
        if (z2) {
            this.n = this.m;
        }
        this.p = mmoVar;
        kkh kkhVar = this.b;
        if (z) {
            kkhVar.i1();
            if (((yde) mmoVar2.e).equals(ydeVar)) {
                return;
            }
            kkhVar.e.post(new juc(16, this, mmoVar));
            return;
        }
        rdl rdlVar = (rdl) mmoVar2.b;
        sis sisVar = rdlVar.j;
        rdl rdlVar2 = (rdl) mmoVar.b;
        qlp qlpVar = (qlp) mmoVar.g;
        blp blpVar = (blp) mmoVar.c;
        boolean equals = sisVar.equals(rdlVar2.j);
        final int i = 2;
        bdg bdgVar = this.d;
        if (!equals) {
            bdgVar.c(0, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        CharSequence charSequence = (CharSequence) amhVar2.g;
        CharSequence charSequence2 = (CharSequence) amhVar.g;
        i6l i6lVar = (i6l) amhVar.e;
        boolean equals2 = Objects.equals(charSequence, charSequence2);
        final int i2 = 3;
        if (!equals2) {
            bdgVar.c(15, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i2) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        int i3 = 9;
        if (num != null) {
            bdgVar.c(11, new u13(i3, mmoVar2, mmoVar, num));
        }
        if (num2 != null) {
            bdgVar.c(1, new v13(23, mmoVar, num2));
        }
        i6l i6lVar2 = (i6l) amhVar2.e;
        final int i4 = 7;
        boolean z4 = i6lVar2 != null && i6lVar2.a == 7;
        boolean z5 = i6lVar != null && i6lVar.a == 7;
        final int i5 = 10;
        if (z4 && z5) {
            int i6 = dvt.a;
            if (i6lVar2.f == i6lVar.f) {
            }
            hzk m = rwf.m(i6lVar);
            bdgVar.c(10, new nlh(2, m));
            if (m != null) {
                bdgVar.c(10, new nlh(3, m));
            }
        }
        if (((ioh) amhVar2.f) != ((ioh) amhVar.f)) {
            bdgVar.c(14, new wlh(this));
        }
        if (rdlVar.y != rdlVar2.y) {
            final int i7 = 4;
            bdgVar.c(4, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i7) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (rdlVar.t != rdlVar2.t) {
            final int i8 = 5;
            bdgVar.c(5, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i8) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (rdlVar.v != rdlVar2.v) {
            final int i9 = 6;
            bdgVar.c(7, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i9) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.g.equals(rdlVar2.g)) {
            bdgVar.c(12, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i4) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (rdlVar.h != rdlVar2.h) {
            final int i10 = 8;
            bdgVar.c(8, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i10) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (rdlVar.i != rdlVar2.i) {
            final int i11 = 9;
            bdgVar.c(9, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i11) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.o.equals(rdlVar2.o)) {
            bdgVar.c(20, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i5) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (!rdlVar.q.equals(rdlVar2.q)) {
            final int i12 = 11;
            bdgVar.c(29, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (i12) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (rdlVar.r == rdlVar2.r && rdlVar.s == rdlVar2.s) {
            z3 = false;
        } else {
            z3 = false;
            final ?? r14 = 0 == true ? 1 : 0;
            bdgVar.c(30, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (r14) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (((d8l) mmoVar2.d).equals((d8l) mmoVar.d)) {
            r3 = 1;
        } else {
            r3 = 1;
            bdgVar.c(13, new ycg() { // from class: vlh
                @Override // defpackage.ycg
                public final void invoke(Object obj) {
                    f8l f8lVar = (f8l) obj;
                    switch (r3) {
                        case 0:
                            rdl rdlVar3 = (rdl) mmoVar.b;
                            f8lVar.s(rdlVar3.r, rdlVar3.s);
                            break;
                        case 1:
                            f8lVar.V((d8l) mmoVar.d);
                            break;
                        case 2:
                            rdl rdlVar4 = (rdl) mmoVar.b;
                            f8lVar.R(rdlVar4.j, rdlVar4.k);
                            break;
                        case 3:
                            f8lVar.v(((rdl) mmoVar.b).m);
                            break;
                        case 4:
                            f8lVar.p(((rdl) mmoVar.b).y);
                            break;
                        case 5:
                            f8lVar.G(4, ((rdl) mmoVar.b).t);
                            break;
                        case 6:
                            f8lVar.X(((rdl) mmoVar.b).v);
                            break;
                        case 7:
                            f8lVar.U(((rdl) mmoVar.b).g);
                            break;
                        case 8:
                            f8lVar.b(((rdl) mmoVar.b).h);
                            break;
                        case 9:
                            f8lVar.q(((rdl) mmoVar.b).i);
                            break;
                        case 10:
                            f8lVar.D(((rdl) mmoVar.b).o);
                            break;
                        default:
                            f8lVar.z(((rdl) mmoVar.b).q);
                            break;
                    }
                }
            });
        }
        if (!((blp) mmoVar2.c).equals(blpVar)) {
            kkhVar.getClass();
            vq1.A(Looper.myLooper() == kkhVar.e.getLooper() ? r3 : z3);
            kkhVar.d.f();
        }
        if (!((yde) mmoVar2.e).equals(ydeVar)) {
            v13 v13Var = new v13(22, this, mmoVar);
            kkhVar.getClass();
            vq1.A(Looper.myLooper() == kkhVar.e.getLooper() ? r3 : z3);
            v13Var.accept(kkhVar.d);
        }
        if (qlpVar != null) {
            kkhVar.getClass();
            if (Looper.myLooper() == kkhVar.e.getLooper()) {
                z3 = r3;
            }
            vq1.A(z3);
            kkhVar.d.getClass();
        }
        bdgVar.b();
    }

    @Override // defpackage.jkh
    public final void Y() {
        F(1);
    }

    public final void Y0(mmo mmoVar, Integer num, Integer num2) {
        X0(false, this.m, false, mmoVar, num, num2);
    }

    @Override // defpackage.jkh
    public final w0t Z() {
        return w0t.F;
    }

    @Override // defpackage.jkh
    public final void a() {
        Messenger messenger;
        if (this.k) {
            return;
        }
        this.k = true;
        fhh fhhVar = this.j;
        if (fhhVar != null) {
            chh chhVar = fhhVar.a;
            pv9 pv9Var = chhVar.f;
            if (pv9Var != null && (messenger = chhVar.g) != null) {
                try {
                    Message obtain = Message.obtain();
                    obtain.what = 7;
                    obtain.arg1 = 1;
                    obtain.replyTo = messenger;
                    ((Messenger) pv9Var.b).send(obtain);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            chhVar.b.disconnect();
            this.j = null;
        }
        iwe iweVar = this.i;
        if (iweVar != null) {
            zlh zlhVar = this.e;
            if (zlhVar == null) {
                xq0.x("callback must not be null");
                return;
            }
            if (((Set) iweVar.c).remove(zlhVar)) {
                try {
                    ((okh) iweVar.b).b(zlhVar);
                } finally {
                    zlhVar.j(null);
                }
            } else {
                Log.w("MediaControllerCompat", "the callback has never been registered");
            }
            zlhVar.d.removeCallbacksAndMessages(null);
            this.i = null;
        }
        this.l = false;
        this.d.d();
    }

    @Override // defpackage.jkh
    public final void a0(int i, long j, List list) {
        if (list.isEmpty()) {
            y();
            return;
        }
        rdl n = ((rdl) this.p.b).n(m.g.q(list, 0), new tmp(R0(i, (onh) list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        mmo mmoVar = this.p;
        Y0(new mmo(n, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        if (U0()) {
            T0();
        }
    }

    @Override // defpackage.jkh
    public final void b() {
        L(false);
    }

    @Override // defpackage.jkh
    public final void b0() {
        this.i.v().a.skipToNext();
    }

    @Override // defpackage.jkh
    public final int c() {
        return ((rdl) this.p.b).y;
    }

    @Override // defpackage.jkh
    public final int c0() {
        rdl rdlVar = (rdl) this.p.b;
        if (rdlVar.q.a == 1) {
            return rdlVar.r;
        }
        iwe iweVar = this.i;
        if (iweVar == null) {
            return 0;
        }
        rkh o = iweVar.o();
        hee heeVar = rwf.a;
        if (o == null) {
            return 0;
        }
        return o.e;
    }

    @Override // defpackage.jkh
    public final void connect() {
        bnp bnpVar = this.c;
        int type = bnpVar.a.getType();
        kkh kkhVar = this.b;
        if (type != 0) {
            kkhVar.j1(new xlh(this, 1));
            return;
        }
        Object u = bnpVar.a.u();
        vq1.B(u);
        kkhVar.j1(new juc(15, this, (msh) u));
        kkhVar.e.post(new xlh(this, 0));
    }

    @Override // defpackage.jkh
    public final void d() {
        L(true);
    }

    @Override // defpackage.jkh
    public final long d0() {
        return -9223372036854775807L;
    }

    @Override // defpackage.jkh
    public final boolean e() {
        return ((rdl) this.p.b).v;
    }

    @Override // defpackage.jkh
    public final void e0(int i, long j) {
        W0(i, j);
    }

    @Override // defpackage.jkh
    public final boolean f() {
        return false;
    }

    @Override // defpackage.jkh
    public final d8l f0() {
        return (d8l) this.p.d;
    }

    @Override // defpackage.jkh
    public final int g() {
        return ((rdl) this.p.b).h;
    }

    @Override // defpackage.jkh
    public final boolean g0() {
        return ((rdl) this.p.b).t;
    }

    @Override // defpackage.jkh
    public final long getDuration() {
        return ((rdl) this.p.b).c.d;
    }

    @Override // defpackage.jkh
    public final float getVolume() {
        return 1.0f;
    }

    @Override // defpackage.jkh
    public final void h(Surface surface) {
        vq1.n0("MCImplLegacy", "Session doesn't support setting Surface");
    }

    @Override // defpackage.jkh
    public final void h0(boolean z) {
        if (z != C0()) {
            rdl k = ((rdl) this.p.b).k(z);
            mmo mmoVar = this.p;
            Y0(new mmo(k, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        }
        tkh v = this.i.v();
        hee heeVar = rwf.a;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", z ? 1 : 0);
        v.T(bundle, "android.support.v4.media.session.action.SET_SHUFFLE_MODE");
    }

    @Override // defpackage.jkh
    public final boolean i() {
        return ((rdl) this.p.b).c.b;
    }

    @Override // defpackage.jkh
    public final long i0() {
        return ((rdl) this.p.b).C;
    }

    @Override // defpackage.jkh
    public final boolean isConnected() {
        return this.l;
    }

    @Override // defpackage.jkh
    public final void j(SurfaceView surfaceView) {
        vq1.n0("MCImplLegacy", "Session doesn't support setting SurfaceView");
    }

    @Override // defpackage.jkh
    public final void j0(f8l f8lVar) {
        this.d.a(f8lVar);
    }

    @Override // defpackage.jkh
    public final hzk k() {
        return ((rdl) this.p.b).a;
    }

    @Override // defpackage.jkh
    public final int k0() {
        return v0();
    }

    @Override // defpackage.jkh
    public final sv6 l() {
        vq1.n0("MCImplLegacy", "Session doesn't support getting Cue");
        return sv6.c;
    }

    @Override // defpackage.jkh
    public final tcu l0() {
        vq1.n0("MCImplLegacy", "Session doesn't support getting VideoSize");
        return tcu.d;
    }

    @Override // defpackage.jkh
    public final p0l m() {
        return ((rdl) this.p.b).g;
    }

    @Override // defpackage.jkh
    public final dv1 m0() {
        return ((rdl) this.p.b).o;
    }

    @Override // defpackage.jkh
    public final void n(TextureView textureView) {
        vq1.n0("MCImplLegacy", "Session doesn't support setting TextureView");
    }

    @Override // defpackage.jkh
    public final p08 n0() {
        return ((rdl) this.p.b).q;
    }

    @Override // defpackage.jkh
    public final long o() {
        return getDuration();
    }

    @Override // defpackage.jkh
    public final void o0(int i, int i2) {
        p08 n0 = n0();
        int i3 = n0.b;
        int i4 = n0.c;
        if (i3 <= i && (i4 == 0 || i <= i4)) {
            rdl c = ((rdl) this.p.b).c(i, B0());
            mmo mmoVar = this.p;
            Y0(new mmo(c, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        }
        ((okh) this.i.b).a.setVolumeTo(i, i2);
    }

    @Override // defpackage.jkh
    public final void p(TextureView textureView) {
        vq1.n0("MCImplLegacy", "Session doesn't support clearing TextureView");
    }

    @Override // defpackage.jkh
    public final int p0() {
        return -1;
    }

    @Override // defpackage.jkh
    public final void q() {
        rdl rdlVar = (rdl) this.p.b;
        if (rdlVar.y != 1) {
            return;
        }
        rdl f = rdlVar.f(rdlVar.j.p() ? 4 : 2, null);
        mmo mmoVar = this.p;
        Y0(new mmo(f, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        if (((rdl) this.p.b).j.p()) {
            return;
        }
        T0();
    }

    @Override // defpackage.jkh
    public final void q0(int i) {
        W0(i, 0L);
    }

    @Override // defpackage.jkh
    public final void r(p0l p0lVar) {
        if (!p0lVar.equals(m())) {
            rdl e = ((rdl) this.p.b).e(p0lVar);
            mmo mmoVar = this.p;
            Y0(new mmo(e, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        }
        this.i.v().U(p0lVar.a);
    }

    @Override // defpackage.jkh
    public final long r0() {
        return ((rdl) this.p.b).B;
    }

    @Override // defpackage.jkh
    public final void s(long j) {
        W0(v0(), j);
    }

    @Override // defpackage.jkh
    public final long s0() {
        return J0();
    }

    @Override // defpackage.jkh
    public final void stop() {
        rdl rdlVar = (rdl) this.p.b;
        if (rdlVar.y == 1) {
            return;
        }
        tmp tmpVar = rdlVar.c;
        g8l g8lVar = tmpVar.a;
        long j = tmpVar.d;
        long j2 = g8lVar.f;
        rdl j3 = rdlVar.j(new tmp(g8lVar, false, SystemClock.elapsedRealtime(), j, j2, vwh.b(j2, j), 0L, -9223372036854775807L, j, j2));
        rdl rdlVar2 = (rdl) this.p.b;
        if (rdlVar2.y != 1) {
            j3 = j3.f(1, rdlVar2.a);
        }
        rdl rdlVar3 = j3;
        mmo mmoVar = this.p;
        Y0(new mmo(rdlVar3, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        this.i.v().a.stop();
    }

    @Override // defpackage.jkh
    public final void t(float f) {
        vq1.n0("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // defpackage.jkh
    public final long t0() {
        return ((rdl) this.p.b).c.e;
    }

    @Override // defpackage.jkh
    public final void u(float f) {
        if (f != m().a) {
            rdl e = ((rdl) this.p.b).e(new p0l(f));
            mmo mmoVar = this.p;
            Y0(new mmo(e, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        }
        this.i.v().U(f);
    }

    @Override // defpackage.jkh
    public final hoh u0() {
        return ((rdl) this.p.b).m;
    }

    @Override // defpackage.jkh
    public final void v(SurfaceView surfaceView) {
        vq1.n0("MCImplLegacy", "Session doesn't support clearing SurfaceView");
    }

    @Override // defpackage.jkh
    public final int v0() {
        return ((rdl) this.p.b).c.a.b;
    }

    @Override // defpackage.jkh
    public final long w() {
        return ((rdl) this.p.b).c.g;
    }

    @Override // defpackage.jkh
    public final void w0(int i) {
        if (i != g()) {
            rdl i2 = ((rdl) this.p.b).i(i);
            mmo mmoVar = this.p;
            Y0(new mmo(i2, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        }
        tkh v = this.i.v();
        int n = rwf.n(i);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", n);
        v.T(bundle, "android.support.v4.media.session.action.SET_REPEAT_MODE");
    }

    @Override // defpackage.jkh
    public final void x(onh onhVar, long j) {
        a0(0, j, yde.y(onhVar));
    }

    @Override // defpackage.jkh
    public final void x0(f8l f8lVar) {
        this.d.e(f8lVar);
    }

    @Override // defpackage.jkh
    public final void y() {
        J(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.jkh
    public final void y0(int i, int i2) {
        z0(i, i + 1, i2);
    }

    public final void z(List list, int i) {
        ArrayList arrayList = new ArrayList();
        ylh ylhVar = new ylh(i, 0, this, new AtomicInteger(0), list, arrayList);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = ((onh) list.get(i2)).d.k;
            if (bArr == null) {
                arrayList.add(null);
                ylhVar.run();
            } else {
                lcg d = this.f.d(bArr);
                arrayList.add(d);
                Handler handler = this.b.e;
                Objects.requireNonNull(handler);
                d.a(ylhVar, new dk7(handler, 0));
            }
        }
    }

    @Override // defpackage.jkh
    public final void z0(int i, int i2, int i3) {
        vq1.v(i >= 0 && i <= i2 && i3 >= 0);
        m mVar = (m) ((rdl) this.p.b).j;
        int o = mVar.o();
        int min = Math.min(i2, o);
        int i4 = min - i;
        int i5 = o - i4;
        int i6 = i5 - 1;
        int min2 = Math.min(i3, i5);
        if (i >= o || i == min || i == min2) {
            return;
        }
        int v0 = v0();
        if (v0 >= i) {
            v0 = v0 < min ? -1 : v0 - i4;
        }
        if (v0 == -1) {
            v0 = dvt.i(i, 0, i6);
            vq1.n0("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + v0 + " would be the new current item");
        }
        if (v0 >= min2) {
            v0 += i4;
        }
        ArrayList arrayList = new ArrayList(mVar.e);
        dvt.X(i, min, min2, arrayList);
        rdl m = ((rdl) this.p.b).m(new m(yde.v(arrayList), mVar.f), v0);
        mmo mmoVar = this.p;
        Y0(new mmo(m, (blp) mmoVar.c, (d8l) mmoVar.d, (yde) mmoVar.e, (Bundle) mmoVar.f, (qlp) null), null, null);
        if (U0()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < i4; i7++) {
                arrayList2.add((ksh) this.m.a.get(i));
                this.i.w(((ksh) this.m.a.get(i)).a);
            }
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                this.i.i(((ksh) arrayList2.get(i8)).a, i8 + min2);
            }
        }
    }

    @Override // defpackage.jkh
    public final void H(w0t w0tVar) {
    }
}
