package t0;

import android.view.View;
import com.google.android.gms.internal.ads.C3698oP;
import java.util.List;

/* renamed from: t0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5020p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f40793a;

    /* renamed from: b, reason: collision with root package name */
    public int f40794b;

    /* renamed from: c, reason: collision with root package name */
    public int f40795c;

    /* renamed from: d, reason: collision with root package name */
    public int f40796d;

    /* renamed from: e, reason: collision with root package name */
    public int f40797e;

    /* renamed from: f, reason: collision with root package name */
    public int f40798f;

    /* renamed from: g, reason: collision with root package name */
    public int f40799g;

    /* renamed from: h, reason: collision with root package name */
    public int f40800h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f40801j;

    /* renamed from: k, reason: collision with root package name */
    public List f40802k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f40803l;

    public final void a(View view) {
        int b9;
        int size = this.f40802k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((AbstractC5000P) this.f40802k.get(i4)).f40643a;
            C4988D c4988d = (C4988D) view3.getLayoutParams();
            if (view3 != view && !c4988d.f40604a.h() && (b9 = (c4988d.f40604a.b() - this.f40796d) * this.f40797e) >= 0 && b9 < i) {
                view2 = view3;
                if (b9 == 0) {
                    break;
                } else {
                    i = b9;
                }
            }
        }
        if (view2 == null) {
            this.f40796d = -1;
        } else {
            this.f40796d = ((C4988D) view2.getLayoutParams()).f40604a.b();
        }
    }

    public final View b(C3698oP c3698oP) {
        List list = this.f40802k;
        if (list == null) {
            View view = c3698oP.i(this.f40796d, Long.MAX_VALUE).f40643a;
            this.f40796d += this.f40797e;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((AbstractC5000P) this.f40802k.get(i)).f40643a;
            C4988D c4988d = (C4988D) view2.getLayoutParams();
            if (!c4988d.f40604a.h() && this.f40796d == c4988d.f40604a.b()) {
                a(view2);
                return view2;
            }
        }
        return null;
    }
}
