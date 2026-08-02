package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.disclaimers.db.DisclaimerDatabase;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.catalog.artist.ArtistItemsActivity;
import ru.yandex.music.catalog.artist.familiar.ArtistFamiliarActivity;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;
import ru.yandex.music.ui.view.CompoundImageView;

/* loaded from: classes4.dex */
public final class znk implements jpj, pm5, d6w, qq2, xxf, gbe, iz3, gdh, tt3, m1t, i6s, ju6, x7o {
    public static final kyd c = new kyd("PhonotekaSyncFullTimeMills", 300000, 200);
    public static final kyd d = new kyd("PhonotekaSyncTimeMills", 60000, 100);
    public static final kyd e = new kyd("PhonotekaSyncAllTimeMills", 300000, 200);
    public final /* synthetic */ int a;
    public final Object b;

    public znk(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new xq0();
                break;
            case 17:
                l18 l18Var = l18.b;
                bdt I = hag.I(a14.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                bdt I2 = hag.I(yzp.class);
                qdc qdcVar2 = l18Var.a;
                qdcVar2.getClass();
                this.b = new a06();
                break;
            case 24:
                Set set = rye.a;
                set.getClass();
                this.b = set;
                break;
            case 25:
                this.b = ild.t(Looper.getMainLooper());
                break;
            case 26:
                this.b = new y9t(ox6.g);
                break;
            default:
                SharedPreferences sharedPreferences = j3c.b().getSharedPreferences("com.facebook.AuthenticationTokenManager.SharedPreferences", 0);
                sharedPreferences.getClass();
                sharedPreferences.getClass();
                this.b = sharedPreferences;
                break;
        }
    }

    public static ArrayList F(List list) {
        List<afa> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (afa afaVar : list2) {
            String valueOf = String.valueOf(afaVar.a);
            arrayList.add(((Object) valueOf) + "::" + (afaVar.b / 1000));
        }
        return arrayList;
    }

    public static String H(Long l) {
        String format = tfs.g.a().format(l);
        format.getClass();
        return format;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(e23 e23Var, op8 op8Var, View view) {
        if (view instanceof yp8) {
            ((yp8) view).g(e23Var, op8Var, view);
            return;
        }
        float f = 0.0f;
        if (op8Var != null && !z(op8Var) && ((Boolean) op8Var.c.a(e23Var.b)).booleanValue() && op8Var.d == null) {
            f = view.getResources().getDimension(R.dimen.div_shadow_elevation);
        }
        view.setElevation(f);
    }

    public static boolean z(op8 op8Var) {
        if (op8Var == null) {
            return true;
        }
        return op8Var.a == null && op8Var.b == null && op8Var.c.equals(new ozb(Boolean.FALSE)) && op8Var.d == null && op8Var.e == null;
    }

    @Override // defpackage.ju6
    public pjc A() {
        return new fs(15, ((v1e) this.b).invoke());
    }

    public boolean B(mpf mpfVar) {
        if (!mpfVar.G()) {
            sme.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((y9t) this.b).remove(mpfVar);
    }

    @Override // defpackage.m1t
    public boolean C(mqs mqsVar, int i) {
        mqsVar.getClass();
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        if (r0 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
    
        if (r0 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int D(dsc dscVar) {
        String str = dscVar.n;
        if (str == null || !l5i.m(str)) {
            return at2.e(0, 0, 0, 0);
        }
        String str2 = dscVar.n;
        int i = dvt.a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return at2.e(4, 0, 0, 0);
        }
        return at2.e(1, 0, 0, 0);
    }

    @Override // defpackage.m1t
    public sbb E(uu5 uu5Var) {
        return new cx7(new gg5(0, uu5Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        uk6 uk6Var;
        kqv kqvVar2 = kqvVar;
        int i6 = this.a;
        int i7 = 1;
        Object obj = this.b;
        switch (i6) {
            case 2:
                int d2 = kqvVar2.d();
                er0 er0Var = (er0) obj;
                Context context = er0Var.k;
                int d3 = kqvVar2.d();
                ActionBarContextView actionBarContextView = er0Var.v;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    i = 0;
                    i2 = 8;
                    i3 = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) er0Var.v.getLayoutParams();
                    if (er0Var.v.isShown()) {
                        if (er0Var.J0 == null) {
                            er0Var.J0 = new Rect();
                            er0Var.K0 = new Rect();
                        }
                        Rect rect = er0Var.J0;
                        Rect rect2 = er0Var.K0;
                        rect.set(kqvVar2.b(), kqvVar2.d(), kqvVar2.c(), kqvVar2.a());
                        ViewGroup viewGroup = er0Var.B;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z = zhu.a;
                            whu.a(viewGroup, rect, rect2);
                            i4 = 0;
                        } else {
                            if (zhu.a) {
                                i4 = 0;
                            } else {
                                zhu.a = true;
                                i4 = 0;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    zhu.b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        zhu.b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                }
                            }
                            Method method = zhu.b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception e2) {
                                    Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                                }
                            }
                        }
                        int i8 = rect.top;
                        int i9 = rect.left;
                        int i10 = rect.right;
                        ViewGroup viewGroup2 = er0Var.B;
                        WeakHashMap weakHashMap = wdu.a;
                        kqv a = odu.a(viewGroup2);
                        int b = a == null ? i4 : a.b();
                        int c2 = a == null ? i4 : a.c();
                        if (marginLayoutParams.topMargin == i8 && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10) {
                            i5 = i4;
                        } else {
                            marginLayoutParams.topMargin = i8;
                            marginLayoutParams.leftMargin = i9;
                            marginLayoutParams.rightMargin = i10;
                            i5 = 1;
                        }
                        if (i8 <= 0 || er0Var.D != null) {
                            i2 = 8;
                            View view2 = er0Var.D;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i11 = marginLayoutParams2.height;
                                int i12 = marginLayoutParams.topMargin;
                                if (i11 != i12 || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c2) {
                                    marginLayoutParams2.height = i12;
                                    marginLayoutParams2.leftMargin = b;
                                    marginLayoutParams2.rightMargin = c2;
                                    er0Var.D.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            er0Var.D = view3;
                            i2 = 8;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = b;
                            layoutParams.rightMargin = c2;
                            er0Var.B.addView(er0Var.D, -1, layoutParams);
                        }
                        View view4 = er0Var.D;
                        int i13 = view4 == null ? i4 : 1;
                        if (i13 != 0 && view4.getVisibility() != 0) {
                            View view5 = er0Var.D;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & RemoteCameraConfig.Notification.ID) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                        }
                        if (!er0Var.I && i13 != 0) {
                            d3 = i4;
                        }
                        i3 = i13;
                        i7 = i5;
                        i = i4;
                    } else {
                        i2 = 8;
                        i = 0;
                        if (marginLayoutParams.topMargin != 0) {
                            marginLayoutParams.topMargin = 0;
                            i3 = false;
                        } else {
                            i3 = false;
                            i7 = 0;
                        }
                    }
                    if (i7 != 0) {
                        er0Var.v.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = er0Var.D;
                if (view6 != null) {
                    if (i3 == false) {
                        i = i2;
                    }
                    view6.setVisibility(i);
                }
                return wdu.l(view, d2 != d3 ? kqvVar2.f(kqvVar2.b(), d3, kqvVar2.c(), kqvVar2.a()) : kqvVar2);
            default:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj;
                if (!Objects.equals(coordinatorLayout.n, kqvVar2)) {
                    coordinatorLayout.n = kqvVar2;
                    boolean z2 = kqvVar2.d() > 0;
                    coordinatorLayout.o = z2;
                    coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
                    if (!kqvVar2.a.o()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i14 = 0; i14 < childCount; i14++) {
                            View childAt = coordinatorLayout.getChildAt(i14);
                            WeakHashMap weakHashMap2 = wdu.a;
                            if (childAt.getFitsSystemWindows() && (uk6Var = ((xk6) childAt.getLayoutParams()).a) != null) {
                                kqvVar2 = uk6Var.onApplyWindowInsets(coordinatorLayout, childAt, kqvVar2);
                                if (kqvVar2.a.o()) {
                                }
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return kqvVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [arf, java.lang.Object] */
    @Override // defpackage.xxf
    public u8q a() {
        return (u8q) ((BindCardActivity) this.b).p.getValue();
    }

    @Override // defpackage.xxf
    public Object b(o oVar, Class cls) {
        return ((rsd) qld.y(oVar)).a().b(s79.class);
    }

    @Override // defpackage.iz3
    public void c(u51 u51Var) {
        j71 j71Var = new j71(b81.Collection, u51Var);
        int i = ArtistFamiliarActivity.Y;
        Activity activity = (Activity) this.b;
        activity.startActivity(quj.H(activity, j71Var));
    }

    @Override // defpackage.xxf
    public void d() {
        ((mhk) ((BindCardActivity) this.b).D()).a.setVisibility(8);
    }

    @Override // defpackage.iz3
    public void e(u51 u51Var) {
        u51Var.getClass();
        int i = ArtistScreenActivity.w0;
        Activity activity = (Activity) this.b;
        PlaybackScope f = d.f(u51Var.a, u51Var.b);
        qi1 qi1Var = qi1.a;
        activity.startActivity(l48.p(activity, u51Var, f, null, 16));
    }

    @Override // defpackage.i6s
    public void f(Drawable drawable) {
        is5 is5Var = (is5) this.b;
        is5Var.a = drawable;
        Rect rect = new Rect(is5Var.b);
        CompoundImageView compoundImageView = is5Var.e;
        rect.inset(0, -compoundImageView.h);
        compoundImageView.invalidate(rect);
    }

    @Override // defpackage.m1t
    public sbb g(int i, uu5 uu5Var) {
        return null;
    }

    @Override // defpackage.m1t
    public boolean h() {
        n7q n7qVar;
        d6l x = p6g.x((e6l) ((f7l) this.b).c.getValue());
        if (x == null || (n7qVar = x.a) == null) {
            return false;
        }
        return vut.E(n7qVar);
    }

    @Override // defpackage.iz3
    public void i(ArrayList arrayList) {
        List q0;
        Activity activity = (Activity) this.b;
        int i = CollectionMainActivity.v0;
        activity.getClass();
        Intent putExtra = new Intent(activity, (Class<?>) CollectionMainActivity.class).putExtra("extra.item", v35.n).putExtra("downloaded.screen.artists.list.key", (arrayList == null || (q0 = CollectionsKt.q0(arrayList, 8)) == null) ? null : new ArrayList(q0));
        putExtra.getClass();
        activity.startActivity(putExtra);
    }

    @Override // defpackage.iz3
    public void k(u51 u51Var) {
        u51Var.getClass();
        Activity activity = (Activity) this.b;
        t tVar = activity instanceof t ? (t) activity : null;
        if (tVar != null) {
            lwg F = g0g.F(u51Var, false);
            y supportFragmentManager = tVar.getSupportFragmentManager();
            szf.R(supportFragmentManager, vz1.f(supportFragmentManager, F), d.f(u51Var.a, u51Var.b));
        }
    }

    @Override // defpackage.iz3
    public void l(u51 u51Var) {
        Activity activity = (Activity) this.b;
        int i = ArtistItemsActivity.Y;
        activity.getClass();
        activity.startActivity(kg5.z(activity, u51Var, zb1.a));
    }

    public void m(mpf mpfVar) {
        if (!mpfVar.G()) {
            sme.b("DepthSortedSet.add called on an unattached node");
        }
        ((y9t) this.b).add(mpfVar);
    }

    @Override // defpackage.d6w
    public void o() {
        d6w d6wVar = ((ss1) this.b).k;
        if (d6wVar != null) {
            d6wVar.o();
        }
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        fg3 fg3Var = (fg3) obj;
        fg3Var.getClass();
        z07 z07Var = (z07) this.b;
        z07Var.s.m(new px3(fg3Var));
        z07Var.r.m(ycv.a);
        new Handler(Looper.getMainLooper()).postDelayed(new q9(15, z07Var), 1500L);
    }

    @Override // defpackage.pm5
    public void r(Exception exc) {
        switch (this.a) {
            case 4:
                nr1 nr1Var = (nr1) this.b;
                if (exc == null) {
                    nr1Var.i(null);
                    break;
                } else {
                    nr1Var.b(exc);
                    break;
                }
            default:
                gw0 gw0Var = (gw0) ((le3) this.b).b;
                un4 A = gw0Var.d.A();
                z0j z0jVar = gw0Var.l;
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) z0jVar.c;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                    z0jVar.c = null;
                }
                z0jVar.b = false;
                gw0Var.j = null;
                gw0Var.e = false;
                kkp kkpVar = gw0Var.d;
                kkpVar.b = null;
                ((HashMap) kkpVar.c).clear();
                if (gw0Var.k) {
                    gw0Var.k = false;
                }
                if (gw0Var.f != null) {
                    jjo.b(new gc4(gw0Var, A, 0));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tt3
    public void s(Typeface typeface) {
        bu4 bu4Var = (bu4) this.b;
        if (bu4Var.t(typeface)) {
            bu4Var.l(false);
        }
    }

    public String toString() {
        switch (this.a) {
            case 26:
                return ((y9t) this.b).toString();
            default:
                return super.toString();
        }
    }

    public String u(String str) {
        str.getClass();
        t51 v = ((DisclaimerDatabase) this.b).v();
        v.getClass();
        s51 s51Var = (s51) CollectionsKt.firstOrNull((List) up6.F(v.a, true, false, new wq(str, 3)));
        if (s51Var != null) {
            return s51Var.c;
        }
        return null;
    }

    @Override // defpackage.m1t
    public Object v(mqs mqsVar, Continuation continuation) {
        return Boolean.FALSE;
    }

    public a58 w(String str, String str2) {
        String str3;
        str.getClass();
        m68 w = ((DisclaimerDatabase) this.b).w();
        w.getClass();
        z58 z58Var = (z58) up6.F(w.a, true, false, new cb(str, str2, 3));
        if (z58Var == null) {
            return null;
        }
        String str4 = z58Var.b;
        String str5 = z58Var.c;
        String str6 = z58Var.d;
        String str7 = z58Var.e;
        String str8 = z58Var.f;
        String str9 = z58Var.g;
        return new a58(str4, str5, str6, str7, str8, (str9 == null || (str3 = z58Var.h) == null) ? null : new f58(str9, str3));
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        z07 z07Var = (z07) this.b;
        z07Var.r.m(ycv.a);
        z07Var.s.m(new mx3(bfkVar));
        new Handler(Looper.getMainLooper()).postDelayed(new q9(15, z07Var), 1500L);
    }

    @Override // defpackage.xxf
    public fs7 y() {
        return new fs7(26);
    }

    @Override // defpackage.i6s
    public void j(Drawable drawable) {
    }

    @Override // defpackage.xxf
    public void n(boolean z) {
    }

    @Override // defpackage.i6s
    public void p(Drawable drawable) {
    }

    public znk(Context context, usr usrVar, z2b z2bVar) {
        this.a = 27;
        this.b = (DisclaimerDatabase) bzf.M(DisclaimerDatabase.class, context, "disclaimers.db", usrVar, z2bVar, null).b();
    }

    public znk(bx5 bx5Var, klx klxVar) {
        this.a = 0;
        this.b = bx5Var;
    }

    public znk(Activity activity) {
        this.a = 11;
        activity.getClass();
        this.b = activity;
    }

    public znk(f7l f7lVar) {
        this.a = 15;
        f7lVar.getClass();
        this.b = f7lVar;
    }

    public /* synthetic */ znk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
