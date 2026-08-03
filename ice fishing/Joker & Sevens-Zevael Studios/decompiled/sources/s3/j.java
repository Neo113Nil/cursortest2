package s3;

import android.util.Log;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import x2.r;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6430a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final k f6431b = new k();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f6432c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f6433d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6434e;

    public j() {
        new g(this);
        this.f6433d = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new m6.i(this);
        new CopyOnWriteArrayList();
        final int i10 = 0;
        new g3.a(this) { // from class: s3.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f6428b;

            {
                this.f6428b = this;
            }

            @Override // g3.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f6428b.a();
                        break;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        j jVar = this.f6428b;
                        jVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            jVar.c();
                            break;
                        }
                        break;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        boolean z10 = ((x2.b) obj).f8223a;
                        this.f6428b.d();
                        break;
                    default:
                        boolean z11 = ((r) obj).f8284a;
                        this.f6428b.g();
                        break;
                }
            }
        };
        final int i11 = 1;
        new g3.a(this) { // from class: s3.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f6428b;

            {
                this.f6428b = this;
            }

            @Override // g3.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f6428b.a();
                        break;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        j jVar = this.f6428b;
                        jVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            jVar.c();
                            break;
                        }
                        break;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        boolean z10 = ((x2.b) obj).f8223a;
                        this.f6428b.d();
                        break;
                    default:
                        boolean z11 = ((r) obj).f8284a;
                        this.f6428b.g();
                        break;
                }
            }
        };
        final int i12 = 2;
        new g3.a(this) { // from class: s3.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f6428b;

            {
                this.f6428b = this;
            }

            @Override // g3.a
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.f6428b.a();
                        break;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        j jVar = this.f6428b;
                        jVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            jVar.c();
                            break;
                        }
                        break;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        boolean z10 = ((x2.b) obj).f8223a;
                        this.f6428b.d();
                        break;
                    default:
                        boolean z11 = ((r) obj).f8284a;
                        this.f6428b.g();
                        break;
                }
            }
        };
        final int i13 = 3;
        new g3.a(this) { // from class: s3.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f6428b;

            {
                this.f6428b = this;
            }

            @Override // g3.a
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        this.f6428b.a();
                        break;
                    case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                        j jVar = this.f6428b;
                        jVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            jVar.c();
                            break;
                        }
                        break;
                    case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                        boolean z10 = ((x2.b) obj).f8223a;
                        this.f6428b.d();
                        break;
                    default:
                        boolean z11 = ((r) obj).f8284a;
                        this.f6428b.g();
                        break;
                }
            }
        };
        this.f6434e = -1;
        new ArrayDeque();
        new b4.g(15, this);
    }

    public static boolean j(int i10) {
        return Log.isLoggable("FragmentManager", i10);
    }

    public static boolean k(e eVar) {
        return eVar == null || eVar.f6416j;
    }

    public final void a() {
        for (e eVar : this.f6431b.a()) {
            if (eVar != null) {
                eVar.f6415i.a();
            }
        }
    }

    public final boolean b() {
        if (this.f6434e < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (e eVar : this.f6431b.a()) {
            if (eVar != null && k(eVar) && eVar.f6415i.b()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(eVar);
                z10 = true;
            }
        }
        if (this.f6432c != null) {
            for (int i10 = 0; i10 < this.f6432c.size(); i10++) {
                e eVar2 = (e) this.f6432c.get(i10);
                if (arrayList == null || !arrayList.contains(eVar2)) {
                    eVar2.getClass();
                }
            }
        }
        this.f6432c = arrayList;
        return z10;
    }

    public final void c() {
        for (e eVar : this.f6431b.a()) {
            if (eVar != null) {
                eVar.f6415i.c();
            }
        }
    }

    public final void d() {
        for (e eVar : this.f6431b.a()) {
            if (eVar != null) {
                eVar.f6415i.d();
            }
        }
    }

    public final boolean e() {
        if (this.f6434e < 1) {
            return false;
        }
        for (e eVar : this.f6431b.a()) {
            if (eVar != null && eVar.f6415i.e()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        if (this.f6434e < 1) {
            return;
        }
        for (e eVar : this.f6431b.a()) {
            if (eVar != null) {
                eVar.f6415i.f();
            }
        }
    }

    public final void g() {
        for (e eVar : this.f6431b.a()) {
            if (eVar != null) {
                eVar.f6415i.g();
            }
        }
    }

    public final boolean h() {
        boolean z10 = false;
        if (this.f6434e < 1) {
            return false;
        }
        for (e eVar : this.f6431b.a()) {
            if (eVar != null && k(eVar) && eVar.f6415i.h()) {
                z10 = true;
            }
        }
        return z10;
    }

    public final void i() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append("null");
        sb.append("}}");
        return sb.toString();
    }
}
