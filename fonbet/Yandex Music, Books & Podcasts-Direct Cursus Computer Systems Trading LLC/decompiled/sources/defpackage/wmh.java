package defpackage;

import android.net.Uri;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class wmh {
    public Object b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object j;
    public Object k;
    public Object f = new xmh();
    public Object g = new bnh();
    public Object h = Collections.EMPTY_LIST;
    public Object i = qsn.e;
    public Object l = new dnh();
    public Object m = jnh.d;
    public long a = -9223372036854775807L;

    public static void c(wmh wmhVar) {
        synchronized (((Set) wmhVar.m)) {
            try {
                Iterator it = ((Set) wmhVar.m).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void d(wmh wmhVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) wmhVar.e;
        sparseIntArray.clear();
        for (int i = 0; i < ((ArrayList) wmhVar.d).size(); i++) {
            sparseIntArray.put(((Integer) ((ArrayList) wmhVar.d).get(i)).intValue(), i);
        }
    }

    public onh a() {
        gnh gnhVar;
        bnh bnhVar = (bnh) this.g;
        vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
        Uri uri = (Uri) this.e;
        if (uri != null) {
            String str = (String) this.c;
            bnh bnhVar2 = (bnh) this.g;
            gnhVar = new gnh(uri, str, ((UUID) bnhVar2.d) != null ? new cnh(bnhVar2) : null, (vmh) this.j, (List) this.h, (String) this.d, (yde) this.i, this.a);
        } else {
            gnhVar = null;
        }
        String str2 = (String) this.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        xmh xmhVar = (xmh) this.f;
        xmhVar.getClass();
        anh anhVar = new anh(xmhVar);
        dnh dnhVar = (dnh) this.l;
        dnhVar.getClass();
        fnh fnhVar = new fnh(dnhVar);
        hoh hohVar = (hoh) this.k;
        if (hohVar == null) {
            hohVar = hoh.K;
        }
        return new onh(str3, anhVar, gnhVar, fnhVar, hohVar, (jnh) this.m);
    }

    public void b(List list) {
        this.h = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
    }

    public void e() {
        j();
        ((ArrayList) this.d).clear();
        ((SparseIntArray) this.e).clear();
        ((dhx) this.f).evictAll();
        ((ArrayList) this.g).clear();
        ((fsn) this.i).removeCallbacks((fbr) this.j);
        ((ArrayDeque) this.h).clear();
        BasePendingResult basePendingResult = (BasePendingResult) this.l;
        if (basePendingResult != null) {
            basePendingResult.b();
            this.l = null;
        }
        BasePendingResult basePendingResult2 = (BasePendingResult) this.k;
        if (basePendingResult2 != null) {
            basePendingResult2.b();
            this.k = null;
        }
        i();
        h();
    }

    public void f() {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        y1g.B("Must be called from the main thread.");
        if (this.a != 0 && (basePendingResult = (BasePendingResult) this.l) == null) {
            if (basePendingResult != null) {
                basePendingResult.b();
                this.l = null;
            }
            BasePendingResult basePendingResult3 = (BasePendingResult) this.k;
            if (basePendingResult3 != null) {
                basePendingResult3.b();
                this.k = null;
            }
            xun xunVar = (xun) this.c;
            xunVar.getClass();
            y1g.B("Must be called from the main thread.");
            if (xunVar.y()) {
                z0x z0xVar = new z0x(xunVar);
                xun.z(z0xVar);
                basePendingResult2 = z0xVar;
            } else {
                basePendingResult2 = xun.t();
            }
            this.l = basePendingResult2;
            basePendingResult2.h(new dfx(this, 0));
        }
    }

    public long g() {
        owh e = ((xun) this.c).e();
        if (e == null) {
            return 0L;
        }
        MediaInfo mediaInfo = e.a;
        int i = mediaInfo == null ? -1 : mediaInfo.b;
        int i2 = e.e;
        int i3 = e.f;
        int i4 = e.l;
        if (i2 == 1) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return 0L;
                    }
                } else if (i != 2) {
                    return 0L;
                }
            }
            if (i4 == 0) {
                return 0L;
            }
        }
        return e.b;
    }

    public void h() {
        synchronized (((Set) this.m)) {
            try {
                Iterator it = ((Set) this.m).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i() {
        synchronized (((Set) this.m)) {
            try {
                Iterator it = ((Set) this.m).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        synchronized (((Set) this.m)) {
            try {
                Iterator it = ((Set) this.m).iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
