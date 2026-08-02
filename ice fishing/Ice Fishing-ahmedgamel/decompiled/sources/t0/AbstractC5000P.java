package t0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.C3698oP;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import u.AbstractC5050e;

/* renamed from: t0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5000P {

    /* renamed from: s, reason: collision with root package name */
    public static final List f40642s = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f40643a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f40644b;

    /* renamed from: j, reason: collision with root package name */
    public int f40651j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f40659r;

    /* renamed from: c, reason: collision with root package name */
    public int f40645c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f40646d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f40647e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f40648f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f40649g = -1;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC5000P f40650h = null;
    public AbstractC5000P i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f40652k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f40653l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f40654m = 0;

    /* renamed from: n, reason: collision with root package name */
    public C3698oP f40655n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40656o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f40657p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f40658q = -1;

    public AbstractC5000P(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f40643a = view;
    }

    public final void a(int i) {
        this.f40651j = i | this.f40651j;
    }

    public final int b() {
        int i = this.f40649g;
        return i == -1 ? this.f40645c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f40651j & 1024) != 0 || (arrayList = this.f40652k) == null || arrayList.size() == 0) ? f40642s : this.f40653l;
    }

    public final boolean d() {
        View view = this.f40643a;
        return (view.getParent() == null || view.getParent() == this.f40659r) ? false : true;
    }

    public final boolean e() {
        return (this.f40651j & 1) != 0;
    }

    public final boolean f() {
        return (this.f40651j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f40651j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = O.X.f2142a;
        return !this.f40643a.hasTransientState();
    }

    public final boolean h() {
        return (this.f40651j & 8) != 0;
    }

    public final boolean i() {
        return this.f40655n != null;
    }

    public final boolean j() {
        return (this.f40651j & 256) != 0;
    }

    public final boolean k() {
        return (this.f40651j & 2) != 0;
    }

    public final void l(int i, boolean z6) {
        if (this.f40646d == -1) {
            this.f40646d = this.f40645c;
        }
        if (this.f40649g == -1) {
            this.f40649g = this.f40645c;
        }
        if (z6) {
            this.f40649g += i;
        }
        this.f40645c += i;
        View view = this.f40643a;
        if (view.getLayoutParams() != null) {
            ((C4988D) view.getLayoutParams()).f40606c = true;
        }
    }

    public final void m() {
        this.f40651j = 0;
        this.f40645c = -1;
        this.f40646d = -1;
        this.f40647e = -1L;
        this.f40649g = -1;
        this.f40654m = 0;
        this.f40650h = null;
        this.i = null;
        ArrayList arrayList = this.f40652k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f40651j &= -1025;
        this.f40657p = 0;
        this.f40658q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z6) {
        int i = this.f40654m;
        int i4 = z6 ? i - 1 : i + 1;
        this.f40654m = i4;
        if (i4 < 0) {
            this.f40654m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z6 && i4 == 1) {
            this.f40651j |= 16;
        } else if (z6 && i4 == 0) {
            this.f40651j &= -17;
        }
    }

    public final boolean o() {
        return (this.f40651j & 128) != 0;
    }

    public final boolean p() {
        return (this.f40651j & 32) != 0;
    }

    public final String toString() {
        StringBuilder c9 = AbstractC5050e.c(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        c9.append(Integer.toHexString(hashCode()));
        c9.append(" position=");
        c9.append(this.f40645c);
        c9.append(" id=");
        c9.append(this.f40647e);
        c9.append(", oldPos=");
        c9.append(this.f40646d);
        c9.append(", pLpos:");
        c9.append(this.f40649g);
        StringBuilder sb = new StringBuilder(c9.toString());
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f40656o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f40651j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f40654m + ")");
        }
        if ((this.f40651j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f40643a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
