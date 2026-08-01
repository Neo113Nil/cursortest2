package B;

import B0.p;
import B0.q;
import O.C0030f;
import O.InterfaceC0027c;
import O.InterfaceC0029e;
import O.InterfaceC0039o;
import O.K;
import O.h0;
import O.j0;
import Z.C0074w;
import Z.E;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.window.layout.y;
import c0.C0122c;
import c0.C0123d;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.lumenpath.harispro.hrnavigator.MainActivity;
import f0.w;
import f0.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.C0222f;
import l.InterfaceC0227k;
import l.MenuC0229m;
import l.RunnableC0221e;
import l.SubMenuC0216E;
import l.ViewOnKeyListenerC0223g;
import l.o;
import l.x;
import m.C0264l;
import m.F0;
import m.InterfaceC0270o;
import m.V0;
import m.Y;

/* loaded from: classes.dex */
public class b implements InterfaceC0039o, C0.a, InterfaceC0227k, InterfaceC0027c, InterfaceC0029e, O1.e, V.i, T, i0.e, F0, x, Y {

    /* renamed from: c, reason: collision with root package name */
    public static b f8c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10b;

    public /* synthetic */ b(int i, Object obj) {
        this.f9a = i;
        this.f10b = obj;
    }

    private final void C(MenuC0229m menuC0229m) {
    }

    public P.f A(int i) {
        return null;
    }

    public void B() {
        ((C0074w) this.f10b).f1631d.M();
    }

    public boolean D(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // O.InterfaceC0027c
    public void a(Bundle bundle) {
        ((ContentInfo.Builder) this.f10b).setExtras(bundle);
    }

    @Override // l.x
    public void b(MenuC0229m menuC0229m, boolean z2) {
        if (menuC0229m instanceof SubMenuC0216E) {
            ((SubMenuC0216E) menuC0229m).f3650z.k().c(false);
        }
        x xVar = ((C0264l) this.f10b).e;
        if (xVar != null) {
            xVar.b(menuC0229m, z2);
        }
    }

    @Override // m.Y
    public void c(int i) {
    }

    @Override // O.InterfaceC0027c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f10b).setLinkUri(uri);
    }

    @Override // m.F0
    public void e(MenuC0229m menuC0229m, o oVar) {
        ((ViewOnKeyListenerC0223g) this.f10b).f3677f.removeCallbacksAndMessages(menuC0229m);
    }

    @Override // O.InterfaceC0029e
    public int f() {
        int source;
        source = ((ContentInfo) this.f10b).getSource();
        return source;
    }

    @Override // O.InterfaceC0029e
    public ClipData h() {
        ClipData clip;
        clip = ((ContentInfo) this.f10b).getClip();
        return clip;
    }

    @Override // m.F0
    public void i(MenuC0229m menuC0229m, o oVar) {
        ViewOnKeyListenerC0223g viewOnKeyListenerC0223g = (ViewOnKeyListenerC0223g) this.f10b;
        viewOnKeyListenerC0223g.f3677f.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0223g.f3679h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC0229m == ((C0222f) arrayList.get(i)).f3672b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC0223g.f3677f.postAtTime(new RunnableC0221e(this, i2 < arrayList.size() ? (C0222f) arrayList.get(i2) : null, oVar, menuC0229m), menuC0229m, SystemClock.uptimeMillis() + 200);
    }

    @Override // l.x
    public boolean j(MenuC0229m menuC0229m) {
        C0264l c0264l = (C0264l) this.f10b;
        if (menuC0229m == c0264l.f3961c) {
            return false;
        }
        c0264l.f3980y = ((SubMenuC0216E) menuC0229m).f3649A.f3736a;
        x xVar = c0264l.e;
        if (xVar != null) {
            return xVar.j(menuC0229m);
        }
        return false;
    }

    @Override // O.InterfaceC0027c
    public C0030f k() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f10b).build();
        return new C0030f(new b(build));
    }

    @Override // i0.e
    public void l(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f10b).setResultCode(i);
    }

    @Override // O.InterfaceC0029e
    public int n() {
        int flags;
        flags = ((ContentInfo) this.f10b).getFlags();
        return flags;
    }

    @Override // m.Y
    public void o(int i, float f2) {
    }

    @Override // l.InterfaceC0227k
    public boolean p(MenuC0229m menuC0229m, MenuItem menuItem) {
        switch (this.f9a) {
            case 5:
                BottomNavigationView bottomNavigationView = (BottomNavigationView) this.f10b;
                if (bottomNavigationView.f710f != null && menuItem.getItemId() == bottomNavigationView.getSelectedItemId()) {
                    Y0.c cVar = (Y0.c) bottomNavigationView.f710f;
                    cVar.getClass();
                    int i = MainActivity.f2774B;
                    cVar.f1401a.t(menuItem.getItemId());
                    return true;
                }
                N0.j jVar = bottomNavigationView.e;
                if (jVar == null) {
                    return false;
                }
                int i2 = MainActivity.f2774B;
                D1.i.e(menuItem, "item");
                MainActivity mainActivity = ((Y0.c) jVar).f1401a;
                z zVar = mainActivity.f2777y;
                if (zVar == null) {
                    D1.i.i("navController");
                    throw null;
                }
                w f2 = zVar.f();
                if (f2 != null && menuItem.getItemId() == f2.f2994h) {
                    mainActivity.t(menuItem.getItemId());
                    return false;
                }
                z zVar2 = mainActivity.f2777y;
                if (zVar2 == null) {
                    D1.i.i("navController");
                    throw null;
                }
                int itemId = menuItem.getItemId();
                w f3 = zVar2.f();
                if ((f3 != null && itemId == f3.f2994h) || zVar2.o(itemId, false)) {
                    return false;
                }
                zVar2.l(itemId, null);
                return false;
            default:
                InterfaceC0270o interfaceC0270o = ((ActionMenuView) this.f10b).f1832z;
                if (interfaceC0270o == null) {
                    return false;
                }
                Iterator it = ((CopyOnWriteArrayList) ((V0) interfaceC0270o).f3890a.f1852G.f617c).iterator();
                while (it.hasNext()) {
                    if (((E) it.next()).f1409a.o()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // i0.e
    public void q() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // l.InterfaceC0227k
    public void r(MenuC0229m menuC0229m) {
        switch (this.f9a) {
            case 5:
                break;
            default:
                V0 v02 = ((ActionMenuView) this.f10b).f1827u;
                if (v02 != null) {
                    v02.r(menuC0229m);
                    break;
                }
                break;
        }
    }

    @Override // O.InterfaceC0039o
    public j0 s(View view, j0 j0Var) {
        switch (this.f9a) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f10b;
                if (!Objects.equals(coordinatorLayout.f1917n, j0Var)) {
                    coordinatorLayout.f1917n = j0Var;
                    boolean z2 = j0Var.d() > 0;
                    coordinatorLayout.f1918o = z2;
                    coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
                    h0 h0Var = j0Var.f819a;
                    if (!h0Var.m()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap = K.f747a;
                            if (!childAt.getFitsSystemWindows() || ((f) childAt.getLayoutParams()).f12a == null || !h0Var.m()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                    break;
                }
                break;
            default:
                q qVar = (q) this.f10b;
                p pVar = qVar.f72m;
                if (pVar != null) {
                    qVar.f67f.f2387W.remove(pVar);
                }
                p pVar2 = new p(qVar.i, j0Var);
                qVar.f72m = pVar2;
                pVar2.e(qVar.getWindow());
                BottomSheetBehavior bottomSheetBehavior = qVar.f67f;
                p pVar3 = qVar.f72m;
                ArrayList arrayList = bottomSheetBehavior.f2387W;
                if (!arrayList.contains(pVar3)) {
                    arrayList.add(pVar3);
                    break;
                }
                break;
        }
        return j0Var;
    }

    @Override // V.i
    public void t(R.j jVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new V.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new V.l(this, jVar, threadPoolExecutor, 0));
    }

    public String toString() {
        switch (this.f9a) {
            case 7:
                return "ContentInfoCompat{" + ((ContentInfo) this.f10b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // androidx.lifecycle.T
    public Q u(Class cls, C0122c c0122c) {
        C0123d c0123d;
        D1.e a2 = D1.o.a(cls);
        C0123d[] c0123dArr = (C0123d[]) this.f10b;
        C0123d[] c0123dArr2 = (C0123d[]) Arrays.copyOf(c0123dArr, c0123dArr.length);
        D1.i.e(c0123dArr2, "initializers");
        int length = c0123dArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                c0123d = null;
                break;
            }
            c0123d = c0123dArr2[i];
            if (c0123d.f2341a.equals(a2)) {
                break;
            }
            i++;
        }
        Q q2 = c0123d != null ? (Q) androidx.navigation.fragment.a.f2086b.g(c0122c) : null;
        if (q2 != null) {
            return q2;
        }
        throw new IllegalArgumentException(("No initializer set for given class " + R.j.t(a2)).toString());
    }

    @Override // O.InterfaceC0029e
    public ContentInfo v() {
        return (ContentInfo) this.f10b;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // O1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(O1.f fVar, v1.d dVar) {
        O1.a aVar;
        int i;
        Throwable th;
        P1.g gVar;
        if (dVar instanceof O1.a) {
            aVar = (O1.a) dVar;
            int i2 = aVar.f844g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f844g = i2 - Integer.MIN_VALUE;
                Object obj = aVar.e;
                w1.a aVar2 = w1.a.f4662a;
                i = aVar.f844g;
                t1.i iVar = t1.i.f4388c;
                if (i != 0) {
                    h0.f.D(obj);
                    v1.i iVar2 = aVar.f4760b;
                    D1.i.b(iVar2);
                    P1.g gVar2 = new P1.g(fVar, iVar2);
                    try {
                        aVar.f842d = gVar2;
                        aVar.f844g = 1;
                        Object d2 = ((y) this.f10b).d(gVar2, aVar);
                        if (d2 != aVar2) {
                            d2 = iVar;
                        }
                        if (d2 == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = gVar2;
                        gVar.l();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.f842d;
                    try {
                        h0.f.D(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        gVar.l();
                        throw th;
                    }
                }
                gVar.l();
                return iVar;
            }
        }
        aVar = new O1.a(this, (x1.c) dVar);
        Object obj2 = aVar.e;
        w1.a aVar22 = w1.a.f4662a;
        i = aVar.f844g;
        t1.i iVar3 = t1.i.f4388c;
        if (i != 0) {
        }
        gVar.l();
        return iVar3;
    }

    @Override // m.Y
    public void x(int i) {
    }

    @Override // O.InterfaceC0027c
    public void y(int i) {
        ((ContentInfo.Builder) this.f10b).setFlags(i);
    }

    public P.f z(int i) {
        return null;
    }

    public b(C0123d[] c0123dArr) {
        this.f9a = 20;
        D1.i.e(c0123dArr, "initializers");
        this.f10b = c0123dArr;
    }

    public b(int i) {
        this.f9a = i;
        switch (i) {
            case 9:
                this.f10b = new P.g(this);
                break;
            case 14:
                this.f10b = new Object();
                new Handler(Looper.getMainLooper(), new U0.d(this));
                break;
        }
    }

    public b(TextView textView) {
        this.f9a = 17;
        this.f10b = new X.g(textView);
    }

    public b(EditText editText) {
        this.f9a = 16;
        this.f10b = new F.i(editText);
    }

    public b(Context context) {
        this.f9a = 15;
        this.f10b = context.getApplicationContext();
    }

    public b(ContentInfo contentInfo) {
        this.f9a = 7;
        contentInfo.getClass();
        this.f10b = B0.a.g(contentInfo);
    }

    public b(ClipData clipData, int i) {
        this.f9a = 6;
        this.f10b = B0.a.e(clipData, i);
    }
}
