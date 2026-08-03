package s3;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v0;
import androidx.lifecycle.w;
import androidx.lifecycle.x0;
import androidx.lifecycle.y0;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import x4.s;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, u, y0, androidx.lifecycle.k, e4.e {

    /* renamed from: u, reason: collision with root package name */
    public static final Object f6412u = null;

    /* renamed from: g, reason: collision with root package name */
    public final int f6413g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final String f6414h = UUID.randomUUID().toString();

    /* renamed from: i, reason: collision with root package name */
    public final j f6415i = new j();

    /* renamed from: j, reason: collision with root package name */
    public final boolean f6416j = true;

    /* renamed from: k, reason: collision with root package name */
    public final p f6417k = p.f701k;

    /* renamed from: l, reason: collision with root package name */
    public w f6418l;

    /* renamed from: m, reason: collision with root package name */
    public s f6419m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f6420n;

    /* renamed from: o, reason: collision with root package name */
    public final d f6421o;

    /* renamed from: p, reason: collision with root package name */
    public final c f6422p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6423q;

    /* renamed from: r, reason: collision with root package name */
    public int f6424r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6425s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6426t;

    public e() {
        new b0();
        new AtomicInteger();
        this.f6420n = new ArrayList();
        this.f6421o = new d(this);
        this.f6418l = new w(this, true);
        this.f6419m = new s(new g4.a(this, new n0(1, this)));
        ArrayList arrayList = this.f6420n;
        d dVar = this.f6421o;
        if (!arrayList.contains(dVar)) {
            if (this.f6413g >= 0) {
                e eVar = dVar.f6411a;
                eVar.f6419m.g();
                m0.d(eVar);
            } else {
                arrayList.add(dVar);
            }
        }
        new b4.g(14, this);
        new b(this);
        this.f6422p = new c(this);
        this.f6423q = true;
        this.f6424r = -1;
        new d(this);
    }

    @Override // e4.e
    public final x4.l b() {
        return (x4.l) this.f6419m.f8357i;
    }

    public final j c() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // androidx.lifecycle.k
    public final v0 d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.k
    public final x3.b e() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View f() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // androidx.lifecycle.y0
    public final x0 g() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.u
    public final w h() {
        return this.f6418l;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.f6425s) {
            return;
        }
        if (j.j(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f6426t) {
            return;
        }
        this.f6426t = true;
        this.f6425s = true;
        if (this.f6424r >= 0) {
            j c3 = c();
            int i10 = this.f6424r;
            if (i10 < 0) {
                throw new IllegalArgumentException(a4.d.g("Bad id: ", i10));
            }
            synchronized (c3.f6430a) {
            }
            this.f6424r = -1;
            return;
        }
        a aVar = new a(c());
        l lVar = new l();
        lVar.f6436a = 3;
        lVar.f6437b = this;
        aVar.f6405a.add(lVar);
        lVar.f6438c = 0;
        lVar.f6439d = 0;
        lVar.f6440e = 0;
        lVar.f6441f = 0;
        j jVar = aVar.f6406b;
        if (aVar.f6407c) {
            throw new IllegalStateException("commit already called");
        }
        if (j.j(2)) {
            Log.v("FragmentManager", "Commit: " + aVar);
            PrintWriter printWriter = new PrintWriter(new m());
            ArrayList arrayList = aVar.f6405a;
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(aVar.f6408d);
            printWriter.print(" mCommitted=");
            printWriter.println(aVar.f6407c);
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    l lVar2 = (l) arrayList.get(i11);
                    switch (lVar2.f6436a) {
                        case 0:
                            str = "NULL";
                            break;
                        case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                            str = "ADD";
                            break;
                        case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case com.onesignal.core.internal.config.d.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + lVar2.f6436a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i11);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(lVar2.f6437b);
                    if (lVar2.f6438c != 0 || lVar2.f6439d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(lVar2.f6438c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(lVar2.f6439d));
                    }
                    if (lVar2.f6440e != 0 || lVar2.f6441f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(lVar2.f6440e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(lVar2.f6441f));
                    }
                }
            }
            printWriter.close();
        }
        aVar.f6407c = true;
        aVar.f6408d = -1;
        synchronized (jVar.f6430a) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f6414h);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
