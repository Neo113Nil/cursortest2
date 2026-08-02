package defpackage;

import com.yandex.music.shared.network.api.okhttp.AuthenticatorHelper$RefreshTokenException;
import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class t9w {
    public final /* synthetic */ faw a;

    public t9w(faw fawVar) {
        this.a = fawVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        s9w s9wVar;
        int i;
        Object m;
        try {
            if (cg6Var instanceof s9w) {
                s9wVar = (s9w) cg6Var;
                int i2 = s9wVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    s9wVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = s9wVar.j;
                    nm6 nm6Var = nm6.a;
                    i = s9wVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        av0 av0Var = (av0) this.a.d.getValue();
                        s9wVar.l = 1;
                        m = ((iv0) av0Var).m(s9wVar);
                        if (m == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        m = ((z7o) obj).a;
                    }
                    qgg.h0(m);
                    return (String) m;
                }
            }
            if (i != 0) {
            }
            qgg.h0(m);
            return (String) m;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            throw new AuthenticatorHelper$RefreshTokenException(e2);
        }
        s9wVar = new s9w(this, cg6Var);
        Object obj2 = s9wVar.j;
        nm6 nm6Var2 = nm6.a;
        i = s9wVar.l;
    }
}
