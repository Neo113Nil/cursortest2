package h;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.IceFishing.LiveIceFishing.C5248R;
import com.IceFishing.LiveIceFishing.MainActivity;

/* renamed from: h.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4548d implements a0.c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4546b f37891a;

    /* renamed from: b, reason: collision with root package name */
    public final DrawerLayout f37892b;

    /* renamed from: c, reason: collision with root package name */
    public final j.a f37893c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37894d;

    /* renamed from: e, reason: collision with root package name */
    public final int f37895e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f37896f = false;

    public C4548d(MainActivity mainActivity, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.f37891a = new b3.e(toolbar);
            toolbar.setNavigationOnClickListener(new N3.n(9, this));
        } else {
            this.f37891a = mainActivity.getDrawerToggleDelegate();
        }
        this.f37892b = drawerLayout;
        this.f37894d = C5248R.string.app_name;
        this.f37895e = C5248R.string.app_name;
        this.f37893c = new j.a(this.f37891a.g());
        this.f37891a.i();
    }

    public final void a(float f2) {
        j.a aVar = this.f37893c;
        if (f2 == 1.0f) {
            if (!aVar.i) {
                aVar.i = true;
                aVar.invalidateSelf();
            }
        } else if (f2 == 0.0f && aVar.i) {
            aVar.i = false;
            aVar.invalidateSelf();
        }
        aVar.setProgress(f2);
    }
}
