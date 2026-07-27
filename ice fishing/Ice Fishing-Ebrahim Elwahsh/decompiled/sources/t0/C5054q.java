package t0;

import android.view.View;
import com.google.android.gms.internal.ads.BP;
import java.util.List;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5054q {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40765a;

    /* renamed from: b, reason: collision with root package name */
    public int f40766b;

    /* renamed from: c, reason: collision with root package name */
    public int f40767c;

    /* renamed from: d, reason: collision with root package name */
    public int f40768d;

    /* renamed from: e, reason: collision with root package name */
    public int f40769e;

    /* renamed from: f, reason: collision with root package name */
    public int f40770f;

    /* renamed from: g, reason: collision with root package name */
    public int f40771g;

    /* renamed from: h, reason: collision with root package name */
    public int f40772h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f40773j;

    /* renamed from: k, reason: collision with root package name */
    public List f40774k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40775l;

    public final void a(View view) {
        int b9;
        int size = this.f40774k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((AbstractC5032P) this.f40774k.get(i4)).f40615a;
            C5020D c5020d = (C5020D) view3.getLayoutParams();
            if (view3 != view && !c5020d.f40576a.h() && (b9 = (c5020d.f40576a.b() - this.f40768d) * this.f40769e) >= 0 && b9 < i) {
                view2 = view3;
                if (b9 == 0) {
                    break;
                } else {
                    i = b9;
                }
            }
        }
        if (view2 == null) {
            this.f40768d = -1;
        } else {
            this.f40768d = ((C5020D) view2.getLayoutParams()).f40576a.b();
        }
    }

    public final View b(BP bp) {
        List list = this.f40774k;
        if (list == null) {
            View view = bp.i(this.f40768d, Long.MAX_VALUE).f40615a;
            this.f40768d += this.f40769e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC5032P) this.f40774k.get(i)).f40615a;
            C5020D c5020d = (C5020D) view2.getLayoutParams();
            if (!c5020d.f40576a.h() && this.f40768d == c5020d.f40576a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
