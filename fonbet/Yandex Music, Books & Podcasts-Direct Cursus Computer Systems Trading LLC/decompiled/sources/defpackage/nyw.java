package defpackage;

import android.util.Log;
import android.util.SparseArray;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class nyw extends uyw {
    public final SparseArray f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyw(vyf vyfVar) {
        super(vyfVar);
        int i = pmd.c;
        this.f = new SparseArray();
        vyfVar.a("AutoManageHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f.size(); i++) {
            kyw n = n(i);
            if (n != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(n.a);
                printWriter.println(StringUtils.PROCESS_POSTFIX_DELIMITER);
                n.h.h(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // defpackage.uyw, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i() {
        this.b = true;
        SparseArray sparseArray = this.f;
        Log.d("AutoManageHelper", "onStart " + this.b + StringUtil.SPACE + String.valueOf(sparseArray));
        if (this.c.get() == null) {
            for (int i = 0; i < this.f.size(); i++) {
                kyw n = n(i);
                if (n != null) {
                    n.h.g();
                }
            }
        }
    }

    @Override // defpackage.uyw, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        this.b = false;
        for (int i = 0; i < this.f.size(); i++) {
            kyw n = n(i);
            if (n != null) {
                n.h.a();
            }
        }
    }

    @Override // defpackage.uyw
    public final void k(h66 h66Var, int i) {
        SparseArray sparseArray = this.f;
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        kyw kywVar = (kyw) sparseArray.get(i);
        if (kywVar != null) {
            kyw kywVar2 = (kyw) sparseArray.get(i);
            sparseArray.remove(i);
            if (kywVar2 != null) {
                uww uwwVar = kywVar2.h;
                lyw lywVar = uwwVar.c;
                lywVar.getClass();
                synchronized (lywVar.i) {
                    try {
                        if (!lywVar.d.remove(kywVar2)) {
                            Log.w("GmsClientEvents", "unregisterConnectionFailedListener(): listener " + String.valueOf(kywVar2) + " not found");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                uwwVar.a();
            }
            smd smdVar = kywVar.i;
            if (smdVar != null) {
                smdVar.X(h66Var);
            }
        }
    }

    @Override // defpackage.uyw
    public final void l() {
        for (int i = 0; i < this.f.size(); i++) {
            kyw n = n(i);
            if (n != null) {
                n.h.g();
            }
        }
    }

    public final kyw n(int i) {
        SparseArray sparseArray = this.f;
        if (sparseArray.size() <= i) {
            return null;
        }
        return (kyw) sparseArray.get(sparseArray.keyAt(i));
    }
}
