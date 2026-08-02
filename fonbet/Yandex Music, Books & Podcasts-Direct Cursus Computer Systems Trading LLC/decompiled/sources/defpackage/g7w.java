package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.ui.domik.d;
import com.yandex.passport.internal.ui.domik.relogin.a;
import com.yandex.passport.internal.ui.domik.s;
import com.yandex.passport.internal.ui.domik.v;
import com.yandex.passport.internal.ui.social.o;
import io.appmetrica.analytics.impl.I;
import io.appmetrica.analytics.impl.InterfaceC0526ol;
import io.appmetrica.analytics.impl.Y;
import java.util.concurrent.Callable;
import kotlin.Pair;

/* loaded from: classes5.dex */
public final /* synthetic */ class g7w implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g7w(v vVar, a0 a0Var, boolean z, l lVar) {
        this.c = vVar;
        this.d = a0Var;
        this.b = z;
        this.e = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00c4, code lost:
    
        if (r2 != false) goto L19;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        boolean z;
        boolean booleanValue;
        int i = this.a;
        int i2 = 4;
        boolean z2 = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return Y.a(z2, (I) obj3, (Y) obj2, (InterfaceC0526ol) obj);
            case 1:
                v vVar = (v) obj3;
                a0 a0Var = (a0) obj2;
                l lVar = (l) obj;
                String str = o.k;
                Parcelable.Creator<d> creator = d.CREATOR;
                d a = s.a(vVar.c);
                if (z2) {
                    i iVar = vVar.b;
                    iVar.getClass();
                    a0Var.getClass();
                    int ordinal = a0Var.d().ordinal();
                    z = true;
                    if (ordinal == 0) {
                        booleanValue = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.m)).booleanValue();
                        break;
                    } else if (ordinal == 1) {
                        booleanValue = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.l)).booleanValue();
                        break;
                    } else if (ordinal == 4) {
                        booleanValue = ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.k)).booleanValue();
                        break;
                    } else {
                        booleanValue = true;
                        break;
                    }
                }
                z = false;
                a0Var.getClass();
                o oVar = new o();
                Bundle bundle = new Bundle();
                bundle.putParcelable("track", a);
                bundle.putParcelable("social-type", a0Var);
                bundle.putParcelable("uid", null);
                bundle.putBoolean("use-native", z);
                if (lVar != null) {
                    bundle.putAll(cxb.K(new Pair("master-account", lVar)));
                }
                oVar.setArguments(bundle);
                return oVar;
            default:
                Parcelable.Creator<d> creator2 = d.CREATOR;
                a aVar = (a) com.yandex.passport.internal.ui.domik.base.a.D(d.i(d.i(d.i(s.a(((v) obj3).c), null, (String) obj2, null, null, null, null, null, null, null, null, null, 524275), null, null, null, null, (l) obj, null, null, null, null, null, null, 524223), null, null, null, null, null, null, null, null, null, null, null, 520191), new com.yandex.passport.internal.ui.authbytrack.a(i2));
                aVar.getArguments().putBoolean("is_account_changing_allowed", z2);
                return aVar;
        }
    }

    public /* synthetic */ g7w(v vVar, String str, l lVar, boolean z) {
        this.c = vVar;
        this.d = str;
        this.e = lVar;
        this.b = z;
    }

    public /* synthetic */ g7w(boolean z, I i, Y y, InterfaceC0526ol interfaceC0526ol) {
        this.b = z;
        this.c = i;
        this.d = y;
        this.e = interfaceC0526ol;
    }
}
