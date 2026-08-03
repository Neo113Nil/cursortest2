package y1;

import android.view.View;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import m0.d2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class w1 implements androidx.lifecycle.s {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dd.e f8669g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m0.n1 f8670h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d2 f8671i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ pc.s f8672j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f8673k;

    public w1(dd.e eVar, m0.n1 n1Var, d2 d2Var, pc.s sVar, View view) {
        this.f8669g = eVar;
        this.f8670h = n1Var;
        this.f8671i = d2Var;
        this.f8672j = sVar;
        this.f8673k = view;
    }

    @Override // androidx.lifecycle.s
    public final void b(androidx.lifecycle.u uVar, androidx.lifecycle.o oVar) {
        boolean z10;
        yc.f fVar = null;
        switch (v1.f8662a[oVar.ordinal()]) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                yc.a0.q(this.f8669g, null, new v.k0(this.f8672j, this.f8671i, uVar, this, this.f8673k, null), 1);
                return;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                m0.n1 n1Var = this.f8670h;
                if (n1Var != null) {
                    b4.e eVar = (b4.e) n1Var.f4686i;
                    synchronized (eVar.f961b) {
                        try {
                            synchronized (eVar.f961b) {
                                z10 = eVar.f960a;
                            }
                            if (!z10) {
                                ArrayList arrayList = (ArrayList) eVar.f962c;
                                eVar.f962c = (ArrayList) eVar.f963d;
                                eVar.f963d = arrayList;
                                eVar.f960a = true;
                                int size = arrayList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    ((fc.d) arrayList.get(i10)).resumeWith(ac.o.f277a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                d2 d2Var = this.f8671i;
                synchronized (d2Var.f4550b) {
                    if (d2Var.f4567s) {
                        d2Var.f4567s = false;
                        fVar = d2Var.t();
                    }
                }
                if (fVar != null) {
                    ((yc.g) fVar).resumeWith(ac.o.f277a);
                    return;
                }
                return;
            case 3:
                d2 d2Var2 = this.f8671i;
                synchronized (d2Var2.f4550b) {
                    d2Var2.f4567s = true;
                }
                return;
            case 4:
                this.f8671i.s();
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new ac.d();
        }
    }
}
