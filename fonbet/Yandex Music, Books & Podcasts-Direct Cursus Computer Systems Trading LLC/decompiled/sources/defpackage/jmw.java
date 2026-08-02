package defpackage;

import com.yandex.media.ynison.service.e0;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class jmw {
    public final wmg a;
    public final l6o b;
    public final jmg c;
    public final f7l d;

    public jmw(wmg wmgVar, l6o l6oVar, jmg jmgVar) {
        this.a = wmgVar;
        this.b = l6oVar;
        this.c = jmgVar;
        this.d = ((oq7) l6oVar.d.getValue()).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        imw imwVar;
        int i;
        e0 e0Var;
        if (cg6Var instanceof imw) {
            imwVar = (imw) cg6Var;
            int i2 = imwVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imwVar.l = i2 - Integer.MIN_VALUE;
                Object obj = imwVar.j;
                nm6 nm6Var = nm6.a;
                i = imwVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    this.b.a().getClass();
                    imwVar.l = 1;
                    obj = x97.V(dm6.b, new fcn(this.a.a, continuation, 1), imwVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                e0Var = (e0) obj;
                if (e0Var == null) {
                    return e0Var.n();
                }
                return null;
            }
        }
        imwVar = new imw(this, cg6Var);
        Object obj2 = imwVar.j;
        nm6 nm6Var2 = nm6.a;
        i = imwVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        e0Var = (e0) obj2;
        if (e0Var == null) {
        }
    }
}
