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
    public static final List f40589s = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f40590a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f40591b;

    /* renamed from: j, reason: collision with root package name */
    public int f40598j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f40606r;

    /* renamed from: c, reason: collision with root package name */
    public int f40592c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f40593d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f40594e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f40595f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f40596g = -1;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC5003S f40597h = null;
    public AbstractC5003S i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f40599k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f40600l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f40601m = 0;

    /* renamed from: n, reason: collision with root package name */
    public C3675oP f40602n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40603o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f40604p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f40605q = -1;

    public AbstractC5003S(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f40590a = view;
    }

    public final void a(int i) {
        this.f40598j = i | this.f40598j;
    }

    public final int b() {
        int i = this.f40596g;
        return i == -1 ? this.f40592c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f40598j & 1024) != 0 || (arrayList = this.f40599k) == null || arrayList.size() == 0) ? f40589s : this.f40600l;
    }

    public final boolean d() {
        View view = this.f40590a;
        return (view.getParent() == null || view.getParent() == this.f40606r) ? false : true;
    }

    public final boolean e() {
        return (this.f40598j & 1) != 0;
    }

    public final boolean f() {
        return (this.f40598j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f40598j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = O.X.f2054a;
        return !this.f40590a.hasTransientState();
    }

    public final boolean h() {
        return (this.f40598j & 8) != 0;
    }

    public final boolean i() {
        return this.f40602n != null;
    }

    public final boolean j() {
        return (this.f40598j & 256) != 0;
    }

    public final boolean k() {
        return (this.f40598j & 2) != 0;
    }

    public final void l(int i, boolean z3) {
        if (this.f40593d == -1) {
            this.f40593d = this.f40592c;
        }
        if (this.f40596g == -1) {
            this.f40596g = this.f40592c;
        }
        if (z3) {
            this.f40596g += i;
        }
        this.f40592c += i;
        View view = this.f40590a;
        if (view.getLayoutParams() != null) {
            ((C4991F) view.getLayoutParams()).f40553c = true;
        }
    }

    public final void m() {
        this.f40598j = 0;
        this.f40592c = -1;
        this.f40593d = -1;
        this.f40594e = -1L;
        this.f40596g = -1;
        this.f40601m = 0;
        this.f40597h = null;
        this.i = null;
        ArrayList arrayList = this.f40599k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f40598j &= -1025;
        this.f40604p = 0;
        this.f40605q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z3) {
        int i = this.f40601m;
        int i6 = z3 ? i - 1 : i + 1;
        this.f40601m = i6;
        if (i6 < 0) {
            this.f40601m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z3 && i6 == 1) {
            this.f40598j |= 16;
        } else if (z3 && i6 == 0) {
            this.f40598j &= -17;
        }
    }

    public final boolean o() {
        return (this.f40598j & 128) != 0;
    }

    public final boolean p() {
        return (this.f40598j & 32) != 0;
    }

    public final String toString() {
        StringBuilder c9 = AbstractC5049e.c(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        c9.append(Integer.toHexString(hashCode()));
        c9.append(" position=");
        c9.append(this.f40592c);
        c9.append(" id=");
        c9.append(this.f40594e);
        c9.append(", oldPos=");
        c9.append(this.f40593d);
        c9.append(", pLpos:");
        c9.append(this.f40596g);
        StringBuilder sb = new StringBuilder(c9.toString());
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f40603o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f40598j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f40601m + ")");
        }
        if ((this.f40598j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f40590a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
