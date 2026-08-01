package t0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3675oP;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import u.AbstractC5049e;

/* renamed from: t0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5003S {

    /* renamed from: s, reason: collision with root package name */
    public static final List f40592s = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f40593a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f40594b;

    /* renamed from: j, reason: collision with root package name */
    public int f40601j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f40609r;

    /* renamed from: c, reason: collision with root package name */
    public int f40595c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f40596d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f40597e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f40598f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f40599g = -1;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC5003S f40600h = null;
    public AbstractC5003S i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f40602k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f40603l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f40604m = 0;

    /* renamed from: n, reason: collision with root package name */
    public C3675oP f40605n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40606o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f40607p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f40608q = -1;

    public AbstractC5003S(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f40593a = view;
    }

    public final void a(int i) {
        this.f40601j = i | this.f40601j;
    }

    public final int b() {
        int i = this.f40599g;
        return i == -1 ? this.f40595c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f40601j & 1024) != 0 || (arrayList = this.f40602k) == null || arrayList.size() == 0) ? f40592s : this.f40603l;
    }

    public final boolean d() {
        View view = this.f40593a;
        return (view.getParent() == null || view.getParent() == this.f40609r) ? false : true;
    }

    public final boolean e() {
        return (this.f40601j & 1) != 0;
    }

    public final boolean f() {
        return (this.f40601j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f40601j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = O.X.f2054a;
        return !this.f40593a.hasTransientState();
    }

    public final boolean h() {
        return (this.f40601j & 8) != 0;
    }

    public final boolean i() {
        return this.f40605n != null;
    }

    public final boolean j() {
        return (this.f40601j & 256) != 0;
    }

    public final boolean k() {
        return (this.f40601j & 2) != 0;
    }

    public final void l(int i, boolean z3) {
        if (this.f40596d == -1) {
            this.f40596d = this.f40595c;
        }
        if (this.f40599g == -1) {
            this.f40599g = this.f40595c;
        }
        if (z3) {
            this.f40599g += i;
        }
        this.f40595c += i;
        View view = this.f40593a;
        if (view.getLayoutParams() != null) {
            ((C4991F) view.getLayoutParams()).f40556c = true;
        }
    }

    public final void m() {
        this.f40601j = 0;
        this.f40595c = -1;
        this.f40596d = -1;
        this.f40597e = -1L;
        this.f40599g = -1;
        this.f40604m = 0;
        this.f40600h = null;
        this.i = null;
        ArrayList arrayList = this.f40602k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f40601j &= -1025;
        this.f40607p = 0;
        this.f40608q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z3) {
        int i = this.f40604m;
        int i6 = z3 ? i - 1 : i + 1;
        this.f40604m = i6;
        if (i6 < 0) {
            this.f40604m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z3 && i6 == 1) {
            this.f40601j |= 16;
        } else if (z3 && i6 == 0) {
            this.f40601j &= -17;
        }
    }

    public final boolean o() {
        return (this.f40601j & 128) != 0;
    }

    public final boolean p() {
        return (this.f40601j & 32) != 0;
    }

    public final String toString() {
        StringBuilder c9 = AbstractC5049e.c(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        c9.append(Integer.toHexString(hashCode()));
        c9.append(" position=");
        c9.append(this.f40595c);
        c9.append(" id=");
        c9.append(this.f40597e);
        c9.append(", oldPos=");
        c9.append(this.f40596d);
        c9.append(", pLpos:");
        c9.append(this.f40599g);
        StringBuilder sb = new StringBuilder(c9.toString());
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f40606o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f40601j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.f40604m + ")");
        }
        if ((this.f40601j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f40593a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
