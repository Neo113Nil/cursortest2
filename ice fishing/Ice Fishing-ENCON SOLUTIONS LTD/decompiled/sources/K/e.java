package K;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import j.C0961b;
import j.C0962c;
import j.C0965f;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, j, Q.d {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f1025n = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f1026a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final String f1027b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    public final I0.b f1028c = new I0.b(2);

    /* renamed from: d, reason: collision with root package name */
    public I0.b f1029d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.e f1030e;

    /* renamed from: f, reason: collision with root package name */
    public l f1031f;

    /* renamed from: g, reason: collision with root package name */
    public D0.j f1032g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1033h;

    /* renamed from: i, reason: collision with root package name */
    public final C.j f1034i;

    /* renamed from: j, reason: collision with root package name */
    public final d f1035j;

    /* renamed from: k, reason: collision with root package name */
    public int f1036k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1037l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1038m;

    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.lifecycle.j, java.lang.Object] */
    public e() {
        Object obj;
        v vVar;
        new b(this, 1);
        this.f1030e = androidx.lifecycle.e.f2469e;
        new n();
        new AtomicInteger();
        this.f1033h = new ArrayList();
        this.f1034i = new C.j(10, this);
        this.f1031f = new l(this);
        this.f1032g = new D0.j(this);
        ArrayList arrayList = this.f1033h;
        C.j jVar = this.f1034i;
        if (!arrayList.contains(jVar)) {
            if (this.f1026a >= 0) {
                e eVar = (e) jVar.f124b;
                eVar.f1032g.b();
                androidx.lifecycle.e eVar2 = eVar.f1031f.f2476c;
                if (eVar2 != androidx.lifecycle.e.f2466b && eVar2 != androidx.lifecycle.e.f2467c) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                J1.h hVar = (J1.h) eVar.f1032g.f226c;
                hVar.getClass();
                Iterator it = ((C0965f) hVar.f868c).iterator();
                while (true) {
                    C0961b c0961b = (C0961b) it;
                    obj = null;
                    if (!c0961b.hasNext()) {
                        vVar = null;
                        break;
                    }
                    Map.Entry components = (Map.Entry) c0961b.next();
                    kotlin.jvm.internal.i.d(components, "components");
                    String str = (String) components.getKey();
                    vVar = (v) components.getValue();
                    if (kotlin.jvm.internal.i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                        break;
                    }
                }
                if (vVar == null) {
                    v vVar2 = new v((J1.h) eVar.f1032g.f226c, eVar);
                    C0965f c0965f = (C0965f) ((J1.h) eVar.f1032g.f226c).f868c;
                    C0962c a2 = c0965f.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (a2 != null) {
                        obj = a2.f8018b;
                    } else {
                        C0962c c0962c = new C0962c("androidx.lifecycle.internal.SavedStateHandlesProvider", vVar2);
                        c0965f.f8027d++;
                        C0962c c0962c2 = c0965f.f8025b;
                        if (c0962c2 == null) {
                            c0965f.f8024a = c0962c;
                            c0965f.f8025b = c0962c;
                        } else {
                            c0962c2.f8019c = c0962c;
                            c0962c.f8020d = c0962c2;
                            c0965f.f8025b = c0962c;
                        }
                    }
                    if (((v) obj) != null) {
                        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                    }
                    eVar.f1031f.a(new Q.a(1, vVar2));
                }
                D0.j jVar2 = eVar.f1032g;
                if (!jVar2.f225b) {
                    jVar2.b();
                }
                l b2 = jVar2.f224a.b();
                if (b2.f2476c.compareTo(androidx.lifecycle.e.f2468d) >= 0) {
                    throw new IllegalStateException(("performRestore cannot be called when owner is " + b2.f2476c).toString());
                }
                J1.h hVar2 = (J1.h) jVar2.f226c;
                if (!hVar2.f866a) {
                    throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
                }
                if (hVar2.f867b) {
                    throw new IllegalStateException("SavedStateRegistry was already restored.");
                }
                hVar2.f869d = null;
                hVar2.f867b = true;
            } else {
                arrayList.add(jVar);
            }
        }
        new b(this, 0);
        new c(this);
        this.f1035j = new d(this);
        this.f1036k = -1;
        new m0.j(2, this);
    }

    @Override // Q.d
    public final J1.h a() {
        return (J1.h) this.f1032g.f226c;
    }

    @Override // androidx.lifecycle.j
    public final l b() {
        return this.f1031f;
    }

    public final L.b c() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final I0.b d() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.f1037l) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1038m) {
            return;
        }
        this.f1038m = true;
        this.f1037l = true;
        if (this.f1036k >= 0) {
            I0.b d2 = d();
            int i2 = this.f1036k;
            if (i2 < 0) {
                throw new IllegalArgumentException(C1.a.f(i2, "Bad id: "));
            }
            synchronized (((ArrayList) d2.f721b)) {
            }
            this.f1036k = -1;
            return;
        }
        a aVar = new a(d());
        h hVar = new h();
        hVar.f1041a = 3;
        hVar.f1042b = this;
        ((ArrayList) aVar.f1019d).add(hVar);
        hVar.f1043c = 0;
        hVar.f1044d = 0;
        hVar.f1045e = 0;
        hVar.f1046f = 0;
        if (aVar.f1018c) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + aVar);
            PrintWriter printWriter = new PrintWriter(new i());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(aVar.f1017b);
            printWriter.print(" mCommitted=");
            printWriter.println(aVar.f1018c);
            ArrayList arrayList = (ArrayList) aVar.f1019d;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    h hVar2 = (h) arrayList.get(i3);
                    switch (hVar2.f1041a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
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
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + hVar2.f1041a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(hVar2.f1042b);
                    if (hVar2.f1043c != 0 || hVar2.f1044d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(hVar2.f1043c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(hVar2.f1044d));
                    }
                    if (hVar2.f1045e != 0 || hVar2.f1046f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(hVar2.f1045e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(hVar2.f1046f));
                    }
                }
            }
            printWriter.close();
        }
        aVar.f1018c = true;
        I0.b bVar = (I0.b) aVar.f1020e;
        aVar.f1017b = -1;
        synchronized (((ArrayList) bVar.f721b)) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1027b);
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
