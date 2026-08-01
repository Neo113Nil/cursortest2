package t0;

import android.view.View;
import com.google.android.gms.internal.ads.C3675oP;
import java.util.List;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5022q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40746a;

    /* renamed from: b, reason: collision with root package name */
    public int f40747b;

    /* renamed from: c, reason: collision with root package name */
    public int f40748c;

    /* renamed from: d, reason: collision with root package name */
    public int f40749d;

    /* renamed from: e, reason: collision with root package name */
    public int f40750e;

    /* renamed from: f, reason: collision with root package name */
    public int f40751f;

    /* renamed from: g, reason: collision with root package name */
    public int f40752g;

    /* renamed from: h, reason: collision with root package name */
    public int f40753h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f40754j;

    /* renamed from: k, reason: collision with root package name */
    public List f40755k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40756l;

    public final void a(View view) {
        int b9;
        int size = this.f40755k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < size; i6++) {
            View view3 = ((AbstractC5003S) this.f40755k.get(i6)).f40593a;
            C4991F c4991f = (C4991F) view3.getLayoutParams();
            if (view3 != view && !c4991f.f40554a.h() && (b9 = (c4991f.f40554a.b() - this.f40749d) * this.f40750e) >= 0 && b9 < i) {
                view2 = view3;
                if (b9 == 0) {
                    break;
                } else {
                    i = b9;
                }
            }
        }
        if (view2 == null) {
            this.f40749d = -1;
        } else {
            this.f40749d = ((C4991F) view2.getLayoutParams()).f40554a.b();
        }
    }

    public final View b(C3675oP c3675oP) {
        List list = this.f40755k;
        if (list == null) {
            View view = c3675oP.i(this.f40749d, Long.MAX_VALUE).f40593a;
            this.f40749d += this.f40750e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC5003S) this.f40755k.get(i)).f40593a;
            C4991F c4991f = (C4991F) view2.getLayoutParams();
            if (!c4991f.f40554a.h() && this.f40749d == c4991f.f40554a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
