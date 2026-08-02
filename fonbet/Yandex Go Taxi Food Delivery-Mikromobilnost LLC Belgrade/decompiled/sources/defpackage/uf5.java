package defpackage;

import android.os.Build;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.controllers.a;

/* loaded from: classes.dex */
public final class uf5 extends a {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uf5(e8e e8eVar, int i) {
        super(e8eVar);
        this.b = i;
    }

    @Override // defpackage.d7e
    public final boolean a(fa51 fa51Var) {
        switch (this.b) {
            case 0:
                return fa51Var.j.c;
            case 1:
                return fa51Var.j.e;
            case 2:
                return fa51Var.j.a == NetworkType.CONNECTED;
            case 3:
                NetworkType networkType = fa51Var.j.a;
                if (networkType != NetworkType.UNMETERED) {
                    return Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED;
                }
                return true;
            default:
                return fa51Var.j.f;
        }
    }

    @Override // androidx.work.impl.constraints.controllers.a
    public final int c() {
        switch (this.b) {
            case 0:
                return 6;
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 7;
            default:
                return 9;
        }
    }

    @Override // androidx.work.impl.constraints.controllers.a
    public final boolean d(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                u060 u060Var = (u060) obj;
                return (u060Var.a && u060Var.b) ? false : true;
            case 3:
                u060 u060Var2 = (u060) obj;
                return !u060Var2.a || u060Var2.c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
