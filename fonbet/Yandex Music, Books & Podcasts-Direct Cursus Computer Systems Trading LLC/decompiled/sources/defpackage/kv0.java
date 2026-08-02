package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseBooleanArray;
import androidx.media3.session.i;
import com.connectsdk.service.webos.lgcast.common.utils.AppUtil;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class kv0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ kv0(x0 x0Var, int i, List list, wrh wrhVar) {
        this.c = x0Var;
        this.b = i;
        this.d = list;
        this.e = wrhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AppUtil.lambda$showToast$0((Context) this.c, (String) this.d, (Object[]) this.e, this.b);
                return;
            case 1:
                x0 x0Var = (x0) this.c;
                List list = (List) this.d;
                wrh wrhVar = (wrh) this.e;
                i iVar = ((sth) x0Var.d).h;
                int i = this.b;
                if (i == -1) {
                    iVar.t.A0(list);
                } else {
                    iVar.t.K0(list, i);
                }
                new SparseBooleanArray().append(20, true);
                iVar.r(wrhVar);
                return;
            default:
                hgp hgpVar = (hgp) this.c;
                de2 de2Var = (de2) this.d;
                int i2 = this.b;
                Runnable runnable = (Runnable) this.e;
                bko bkoVar = (bko) hgpVar.a;
                try {
                    try {
                        bko bkoVar2 = (bko) hgpVar.d;
                        Objects.requireNonNull(bkoVar2);
                        bkoVar.D(new rot(bkoVar2, 1));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) hgpVar.b).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            bkoVar.D(new nj7(hgpVar, de2Var, i2, 6));
                        } else {
                            hgpVar.n(de2Var, i2);
                        }
                    } catch (hyr unused) {
                        ((ime) hgpVar.e).K(de2Var, i2 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ kv0(hgp hgpVar, de2 de2Var, int i, Runnable runnable) {
        this.c = hgpVar;
        this.d = de2Var;
        this.b = i;
        this.e = runnable;
    }

    public /* synthetic */ kv0(Context context, String str, Object[] objArr, int i) {
        this.c = context;
        this.d = str;
        this.e = objArr;
        this.b = i;
    }
}
