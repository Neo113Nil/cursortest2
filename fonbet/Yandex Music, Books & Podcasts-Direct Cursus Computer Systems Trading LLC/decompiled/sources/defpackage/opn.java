package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class opn {
    public static final List t = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int j;
    public RecyclerView r;
    public qon s;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public opn h = null;
    public opn i = null;
    public ArrayList k = null;
    public List l = null;
    public int m = 0;
    public amh n = null;
    public boolean o = false;
    public int p = 0;
    public int q = -1;

    public opn(View view) {
        if (view != null) {
            this.a = view;
        } else {
            xq0.x("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i) {
        this.j = i | this.j;
    }

    public final int b() {
        RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.W(this);
    }

    public final int c() {
        RecyclerView recyclerView;
        qon adapter;
        int W;
        if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (W = this.r.W(this)) == -1) {
            return -1;
        }
        return adapter.b(this.s, this, W);
    }

    public final int d() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List f() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? t : this.l;
    }

    public final boolean g() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.r) ? false : true;
    }

    public final boolean h() {
        return (this.j & 1) != 0;
    }

    public final boolean i() {
        return (this.j & 4) != 0;
    }

    public final boolean j() {
        if ((this.j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = wdu.a;
        return !this.a.hasTransientState();
    }

    public final boolean k() {
        return (this.j & 8) != 0;
    }

    public final boolean l() {
        return this.n != null;
    }

    public final boolean m() {
        return (this.j & 256) != 0;
    }

    public final boolean n() {
        return (this.j & 2) != 0;
    }

    public final void o(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((zon) view.getLayoutParams()).c = true;
        }
    }

    public final void p() {
        if (RecyclerView.j1 && m()) {
            rj7.n(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.v(this);
    }

    public final void q(boolean z) {
        int i = this.m;
        int i2 = z ? i - 1 : i + 1;
        this.m = i2;
        if (i2 < 0) {
            this.m = 0;
            if (RecyclerView.j1) {
                qq6.b(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                return;
            } else {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.k1) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + StringUtils.PROCESS_POSTFIX_DELIMITER + this);
        }
    }

    public final boolean r() {
        return (this.j & 128) != 0;
    }

    public final boolean s() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder m = tlm.m(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        m.append(Integer.toHexString(hashCode()));
        m.append(" position=");
        m.append(this.c);
        m.append(" id=");
        m.append(this.e);
        m.append(", oldPos=");
        m.append(this.d);
        m.append(", pLpos:");
        m.append(this.g);
        StringBuilder sb = new StringBuilder(m.toString());
        if (l()) {
            sb.append(" scrap ");
            sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (i()) {
            sb.append(" invalid");
        }
        if (!h()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (k()) {
            sb.append(" removed");
        }
        if (r()) {
            sb.append(" ignored");
        }
        if (m()) {
            sb.append(" tmpDetached");
        }
        if (!j()) {
            sb.append(" not recyclable(" + this.m + ")");
        }
        if ((this.j & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 || i()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
