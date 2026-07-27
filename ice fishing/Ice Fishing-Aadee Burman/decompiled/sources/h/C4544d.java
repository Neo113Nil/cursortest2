package h;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.icefishing.icefishinglive2.C5275R;
import com.icefishing.icefishinglive2.MainActivity;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4544d implements a0.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4542b f37865a;

    /* renamed from: b, reason: collision with root package name */
    public final DrawerLayout f37866b;

    /* renamed from: c, reason: collision with root package name */
    public final j.a f37867c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37868d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37869e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37870f = false;

    public C4544d(MainActivity mainActivity, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.f37865a = new Z2.e(toolbar);
            toolbar.setNavigationOnClickListener(new L3.q(3, this));
        } else {
            this.f37865a = mainActivity.getDrawerToggleDelegate();
        }
        this.f37866b = drawerLayout;
        this.f37868d = C5275R.string.app_name;
        this.f37869e = C5275R.string.app_name;
        this.f37867c = new j.a(this.f37865a.j());
        this.f37865a.t();
    }

    public final void a(float f3) {
        j.a aVar = this.f37867c;
        if (f3 == 1.0f) {
            if (!aVar.i) {
                aVar.i = true;
                aVar.invalidateSelf();
            }
        } else if (f3 == 0.0f && aVar.i) {
            aVar.i = false;
            aVar.invalidateSelf();
        }
        aVar.setProgress(f3);
    }
}
