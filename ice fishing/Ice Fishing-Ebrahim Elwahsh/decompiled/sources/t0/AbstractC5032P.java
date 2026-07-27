package t0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.BP;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import u.AbstractC5088e;

/* renamed from: t0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5032P {

    /* renamed from: s, reason: collision with root package name */
    public static final List f40614s = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f40615a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f40616b;

    /* renamed from: j, reason: collision with root package name */
    public int f40623j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f40631r;

    /* renamed from: c, reason: collision with root package name */
    public int f40617c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f40618d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f40619e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f40620f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f40621g = -1;

    /* renamed from: h, reason: collision with root package name */
    public AbstractC5032P f40622h = null;
    public AbstractC5032P i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f40624k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f40625l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f40626m = 0;

    /* renamed from: n, reason: collision with root package name */
    public BP f40627n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f40628o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f40629p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f40630q = -1;

    public AbstractC5032P(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f40615a = view;
    }

    public final void a(int i) {
        this.f40623j = i | this.f40623j;
    }

    public final int b() {
        int i = this.f40621g;
        return i == -1 ? this.f40617c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f40623j & 1024) != 0 || (arrayList = this.f40624k) == null || arrayList.size() == 0) ? f40614s : this.f40625l;
    }

    public final boolean d() {
        View view = this.f40615a;
        return (view.getParent() == null || view.getParent() == this.f40631r) ? false : true;
    }

    public final boolean e() {
        return (this.f40623j & 1) != 0;
    }

    public final boolean f() {
        return (this.f40623j & 4) != 0;
    }

    public final boolean g() {
        if ((this.f40623j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = O.X.f2240a;
        return !this.f40615a.hasTransientState();
    }

    public final boolean h() {
        return (this.f40623j & 8) != 0;
    }

    public final boolean i() {
        return this.f40627n != null;
    }

    public final boolean j() {
        return (this.f40623j & 256) != 0;
    }

    public final boolean k() {
        return (this.f40623j & 2) != 0;
    }

    public final void l(int i, boolean z8) {
        if (this.f40618d == -1) {
            this.f40618d = this.f40617c;
        }
        if (this.f40621g == -1) {
            this.f40621g = this.f40617c;
        }
        if (z8) {
            this.f40621g += i;
        }
        this.f40617c += i;
        View view = this.f40615a;
        if (view.getLayoutParams() != null) {
            ((C5020D) view.getLayoutParams()).f40578c = true;
        }
    }

    public final void m() {
        this.f40623j = 0;
        this.f40617c = -1;
        this.f40618d = -1;
        this.f40619e = -1L;
        this.f40621g = -1;
        this.f40626m = 0;
        this.f40622h = null;
        this.i = null;
        ArrayList arrayList = this.f40624k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f40623j &= -1025;
        this.f40629p = 0;
        this.f40630q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z8) {
        int i = this.f40626m;
        int i4 = z8 ? i - 1 : i + 1;
        this.f40626m = i4;
        if (i4 < 0) {
            this.f40626m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z8 && i4 == 1) {
            this.f40623j |= 16;
        } else if (z8 && i4 == 0) {
            this.f40623j &= -17;
        }
    }

    public final boolean o() {
        return (this.f40623j & 128) != 0;
    }

    public final boolean p() {
        return (this.f40623j & 32) != 0;
    }

    public final String toString() {
        StringBuilder c4 = AbstractC5088e.c(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        c4.append(Integer.toHexString(hashCode()));
        c4.append(" position=");
        c4.append(this.f40617c);
        c4.append(" id=");
        c4.append(this.f40619e);
        c4.append(", oldPos=");
        c4.append(this.f40618d);
        c4.append(", pLpos:");
        c4.append(this.f40621g);
        StringBuilder sb = new StringBuilder(c4.toString());
        if (i()) {
            sb.append(" scrap ");
            sb.append(this.f40628o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f40623j & 2) != 0) {
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
            sb.append(" not recyclable(" + this.f40626m + ")");
        }
        if ((this.f40623j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f40615a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
