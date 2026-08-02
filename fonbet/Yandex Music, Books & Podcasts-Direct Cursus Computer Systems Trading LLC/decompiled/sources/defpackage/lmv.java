package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.e0;
import com.yandex.media.ynison.service.f;
import com.yandex.media.ynison.service.x;
import kotlin.coroutines.Continuation;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes6.dex */
public final class lmv {
    public final jyr a;
    public final jyr b;
    public final jyr c;

    public lmv(jyr jyrVar, jyr jyrVar2, jyr jyrVar3) {
        this.a = jyrVar;
        this.b = jyrVar2;
        this.c = jyrVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, dmv dmvVar, cg6 cg6Var) {
        fmv fmvVar;
        int i;
        Drawable a;
        if (cg6Var instanceof fmv) {
            fmvVar = (fmv) cg6Var;
            int i2 = fmvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fmvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = fmvVar.j;
                nm6 nm6Var = nm6.a;
                i = fmvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    co6 a2 = dmvVar.a();
                    int s = wct.s();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(cce.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    cce cceVar = (cce) qdcVar.C(I);
                    pce d0 = n7w.d0(a2, context, s, to6.c(a2.b, context), to6.a(a2.b, context));
                    d0.o = Boolean.FALSE;
                    rce a3 = d0.a();
                    fmvVar.l = 1;
                    obj = cceVar.a(a3, fmvVar);
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
                a = ((sce) obj).a();
                if (a != null) {
                    int intrinsicWidth = a.getIntrinsicWidth();
                    int intrinsicHeight = a.getIntrinsicHeight();
                    if (!(a instanceof BitmapDrawable) || ((BitmapDrawable) a).getBitmap() != null) {
                        return vq2.M(a, intrinsicWidth, intrinsicHeight, null);
                    }
                }
                return null;
            }
        }
        fmvVar = new fmv(this, cg6Var);
        Object obj2 = fmvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = fmvVar.l;
        if (i != 0) {
        }
        a = ((sce) obj2).a();
        if (a != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:
    
        if (r12 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, cg6 cg6Var) {
        gmv gmvVar;
        int i;
        dmv dmvVar;
        dmv dmvVar2;
        Object c;
        Bitmap bitmap;
        dmv dmvVar3;
        if (cg6Var instanceof gmv) {
            gmvVar = (gmv) cg6Var;
            int i2 = gmvVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gmvVar.o = i2 - Integer.MIN_VALUE;
                Object obj = gmvVar.m;
                Object obj2 = nm6.a;
                i = gmvVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    gmvVar.j = context;
                    gmvVar.o = 1;
                    obj = f(gmvVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            dmvVar2 = gmvVar.k;
                            qgg.h0(obj);
                            Bitmap bitmap2 = (Bitmap) obj;
                            gmvVar.j = null;
                            gmvVar.k = dmvVar2;
                            gmvVar.l = bitmap2;
                            gmvVar.o = 3;
                            c = c(dmvVar2, gmvVar);
                            if (c != obj2) {
                                bitmap = bitmap2;
                                obj = c;
                                dmvVar3 = dmvVar2;
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                dmvVar3.getClass();
                                if (!(dmvVar3 instanceof yje)) {
                                }
                            }
                            return obj2;
                        }
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Bitmap bitmap3 = gmvVar.l;
                        dmvVar3 = gmvVar.k;
                        qgg.h0(obj);
                        bitmap = bitmap3;
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        dmvVar3.getClass();
                        if (!(dmvVar3 instanceof yje)) {
                            yje yjeVar = (yje) dmvVar3;
                            return new slv(bitmap, null, yjeVar.a, "", null, cb0.u(yjeVar, booleanValue2));
                        }
                        if (dmvVar3 instanceof n0t) {
                            n0t n0tVar = (n0t) dmvVar3;
                            mqs mqsVar = n0tVar.a;
                            return new slv(bitmap, mqsVar.f().a, mqsVar.j(), fxf.W(mqsVar).toString(), mqsVar.i(), cb0.u(n0tVar, booleanValue2));
                        }
                        if (!(dmvVar3 instanceof c8u)) {
                            b6e.s();
                            return null;
                        }
                        c8u c8uVar = (c8u) dmvVar3;
                        x1u x1uVar = c8uVar.a;
                        return new slv(bitmap, null, x1uVar.b, v5g.B(x1uVar).toString(), x1uVar.n, cb0.u(c8uVar, booleanValue2));
                    }
                    context = gmvVar.j;
                    qgg.h0(obj);
                }
                dmvVar = (dmv) obj;
                if (dmvVar != null) {
                    return null;
                }
                gmvVar.j = null;
                gmvVar.k = dmvVar;
                gmvVar.o = 2;
                Object a = a(context, dmvVar, gmvVar);
                if (a != obj2) {
                    obj = a;
                    dmvVar2 = dmvVar;
                    Bitmap bitmap22 = (Bitmap) obj;
                    gmvVar.j = null;
                    gmvVar.k = dmvVar2;
                    gmvVar.l = bitmap22;
                    gmvVar.o = 3;
                    c = c(dmvVar2, gmvVar);
                    if (c != obj2) {
                    }
                }
                return obj2;
            }
        }
        gmvVar = new gmv(this, cg6Var);
        Object obj3 = gmvVar.m;
        Object obj22 = nm6.a;
        i = gmvVar.o;
        if (i != 0) {
        }
        dmvVar = (dmv) obj3;
        if (dmvVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(dmv dmvVar, cg6 cg6Var) {
        hmv hmvVar;
        int i;
        j1g j1gVar;
        if (cg6Var instanceof hmv) {
            hmvVar = (hmv) cg6Var;
            int i2 = hmvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hmvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = hmvVar.j;
                nm6 nm6Var = nm6.a;
                i = hmvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    boolean z = dmvVar instanceof n0t;
                    jyr jyrVar = this.c;
                    if (z) {
                        pjc w = ((t3g) jyrVar.getValue()).w(((n0t) dmvVar).a);
                        hmvVar.l = 1;
                        obj = zsd.g0(w, hmvVar);
                    } else if (dmvVar instanceof c8u) {
                        pjc x = ((t3g) jyrVar.getValue()).x(((c8u) dmvVar).a);
                        hmvVar.l = 2;
                        obj = zsd.g0(x, hmvVar);
                    } else {
                        if (!(dmvVar instanceof yje)) {
                            b6e.s();
                            return null;
                        }
                        j1gVar = j1g.b;
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    qgg.h0(obj);
                    j1gVar = (j1g) obj;
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j1gVar = (j1g) obj;
                }
                return Boolean.valueOf(j1gVar == j1g.a);
            }
        }
        hmvVar = new hmv(this, cg6Var);
        Object obj2 = hmvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = hmvVar.l;
        if (i != 0) {
        }
        return Boolean.valueOf(j1gVar == j1g.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(f fVar, cg6 cg6Var) {
        imv imvVar;
        int i;
        mqs mqsVar;
        if (cg6Var instanceof imv) {
            imvVar = (imv) cg6Var;
            int i2 = imvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                imvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = imvVar.j;
                nm6 nm6Var = nm6.a;
                i = imvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cmv cmvVar = (cmv) this.b.getValue();
                    String t = fVar.t();
                    t.getClass();
                    imvVar.l = 1;
                    obj = cmvVar.a(t, imvVar);
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
                mqsVar = (mqs) obj;
                if (mqsVar != null) {
                    return null;
                }
                return new n0t(mqsVar);
            }
        }
        imvVar = new imv(this, cg6Var);
        Object obj2 = imvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = imvVar.l;
        if (i != 0) {
        }
        mqsVar = (mqs) obj2;
        if (mqsVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(f fVar, cg6 cg6Var) {
        jmv jmvVar;
        int i;
        x1u x1uVar;
        if (cg6Var instanceof jmv) {
            jmvVar = (jmv) cg6Var;
            int i2 = jmvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jmvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jmvVar.j;
                nm6 nm6Var = nm6.a;
                i = jmvVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    cmv cmvVar = (cmv) this.b.getValue();
                    String t = fVar.t();
                    t.getClass();
                    jmvVar.l = 1;
                    obj = cmvVar.b(t, jmvVar);
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
                x1uVar = (x1u) obj;
                if (x1uVar != null) {
                    return null;
                }
                return new c8u(x1uVar);
            }
        }
        jmvVar = new jmv(this, cg6Var);
        Object obj2 = jmvVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jmvVar.l;
        if (i != 0) {
        }
        x1uVar = (x1u) obj2;
        if (x1uVar != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r10 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (r10 == r1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0059, code lost:
    
        if (r10 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        kmv kmvVar;
        int i;
        e0 e0Var;
        a0 n;
        x j;
        f s;
        if (cg6Var instanceof kmv) {
            kmvVar = (kmv) cg6Var;
            int i2 = kmvVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kmvVar.l = i2 - Integer.MIN_VALUE;
                Object obj = kmvVar.j;
                Object obj2 = nm6.a;
                i = kmvVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    wmg wmgVar = (wmg) this.a.getValue();
                    kmvVar.l = 1;
                    obj = x97.V(dm6.b, new fcn(wmgVar.a, continuation, 1), kmvVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return (dmv) obj;
                        }
                        if (i == 3) {
                            qgg.h0(obj);
                            return (dmv) obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                e0Var = (e0) obj;
                if (e0Var != null && (n = e0Var.n()) != null && (j = n.j()) != null && (s = uwf.s(j)) != null) {
                    switch (emv.a[s.u().ordinal()]) {
                        case -1:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        case 0:
                        default:
                            b6e.s();
                            return null;
                        case 1:
                            kmvVar.l = 2;
                            obj = d(s, kmvVar);
                            break;
                        case 2:
                            boolean z = j.C().l() == fhl.b;
                            co6 co6Var = new co6(new jcv(s.q().g(), WebPath$Storage.DEFAULT_LIBRARY), z ? qo6.i : qo6.h, null);
                            String w = s.w();
                            w.getClass();
                            return new yje(w, co6Var, z);
                        case 3:
                            kmvVar.l = 3;
                            obj = e(s, kmvVar);
                            break;
                    }
                }
                return null;
            }
        }
        kmvVar = new kmv(this, cg6Var);
        Object obj3 = kmvVar.j;
        Object obj22 = nm6.a;
        i = kmvVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        e0Var = (e0) obj3;
        if (e0Var != null) {
            switch (emv.a[s.u().ordinal()]) {
            }
        }
        return null;
    }
}
