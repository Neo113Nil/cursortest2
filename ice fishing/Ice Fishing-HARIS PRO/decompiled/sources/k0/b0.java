package k0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f3448t = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f3449a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f3450b;
    public int j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f3463r;

    /* renamed from: s, reason: collision with root package name */
    public C f3464s;

    /* renamed from: c, reason: collision with root package name */
    public int f3451c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f3452d = -1;
    public long e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f3453f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f3454g = -1;

    /* renamed from: h, reason: collision with root package name */
    public b0 f3455h = null;
    public b0 i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3456k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f3457l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f3458m = 0;

    /* renamed from: n, reason: collision with root package name */
    public Q f3459n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3460o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f3461p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f3462q = -1;

    public b0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3449a = view;
    }

    public final void a(int i) {
        this.j = i | this.j;
    }

    public final int b() {
        RecyclerView recyclerView;
        C adapter;
        int I2;
        if (this.f3464s == null || (recyclerView = this.f3463r) == null || (adapter = recyclerView.getAdapter()) == null || (I2 = this.f3463r.I(this)) == -1 || this.f3464s != adapter) {
            return -1;
        }
        return I2;
    }

    public final int c() {
        int i = this.f3454g;
        return i == -1 ? this.f3451c : i;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.f3456k) == null || arrayList.size() == 0) ? f3448t : this.f3457l;
    }

    public final boolean e(int i) {
        return (i & this.j) != 0;
    }

    public final boolean f() {
        View view = this.f3449a;
        return (view.getParent() == null || view.getParent() == this.f3463r) ? false : true;
    }

    public final boolean g() {
        return (this.j & 1) != 0;
    }

    public final boolean h() {
        return (this.j & 4) != 0;
    }

    public final boolean i() {
        if ((this.j & 16) == 0) {
            WeakHashMap weakHashMap = O.K.f747a;
            if (!this.f3449a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        return (this.j & 8) != 0;
    }

    public final boolean k() {
        return this.f3459n != null;
    }

    public final boolean l() {
        return (this.j & 256) != 0;
    }

    public final boolean m() {
        return (this.j & 2) != 0;
    }

    public final void n(int i, boolean z2) {
        if (this.f3452d == -1) {
            this.f3452d = this.f3451c;
        }
        if (this.f3454g == -1) {
            this.f3454g = this.f3451c;
        }
        if (z2) {
            this.f3454g += i;
        }
        this.f3451c += i;
        View view = this.f3449a;
        if (view.getLayoutParams() != null) {
            ((L) view.getLayoutParams()).f3398c = true;
        }
    }

    public final void o() {
        if (RecyclerView.z0 && l()) {
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }
        this.j = 0;
        this.f3451c = -1;
        this.f3452d = -1;
        this.e = -1L;
        this.f3454g = -1;
        this.f3458m = 0;
        this.f3455h = null;
        this.i = null;
        ArrayList arrayList = this.f3456k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.f3461p = 0;
        this.f3462q = -1;
        RecyclerView.l(this);
    }

    public final void p(boolean z2) {
        int i = this.f3458m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f3458m = i2;
        if (i2 < 0) {
            this.f3458m = 0;
            if (RecyclerView.z0) {
                throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
        } else if (!z2 && i2 == 1) {
            this.j |= 16;
        } else if (z2 && i2 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.f2109A0) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z2 + ":" + this);
        }
    }

    public final boolean q() {
        return (this.j & 128) != 0;
    }

    public final boolean r() {
        return (this.j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3451c + " id=" + this.e + ", oldPos=" + this.f3452d + ", pLpos:" + this.f3454g);
        if (k()) {
            sb.append(" scrap ");
            sb.append(this.f3460o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (h()) {
            sb.append(" invalid");
        }
        if (!g()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (j()) {
            sb.append(" removed");
        }
        if (q()) {
            sb.append(" ignored");
        }
        if (l()) {
            sb.append(" tmpDetached");
        }
        if (!i()) {
            sb.append(" not recyclable(" + this.f3458m + ")");
        }
        if ((this.j & 512) != 0 || h()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3449a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
