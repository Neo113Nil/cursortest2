package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class nbe implements dg7 {
    public final tce a;
    public final rwj b;

    public nbe(tce tceVar, rwj rwjVar) {
        this.a = tceVar;
        this.b = rwjVar;
    }

    public static final ImageDecoder.Source b(nbe nbeVar, tce tceVar) {
        rwj rwjVar = nbeVar.b;
        cak b = tceVar.b();
        if (b != null) {
            return ImageDecoder.createSource(b.toFile());
        }
        vnj g = tceVar.g();
        if (g instanceof zq1) {
            return ImageDecoder.createSource(rwjVar.a.getAssets(), ((zq1) g).j);
        }
        if (g instanceof pc6) {
            return ImageDecoder.createSource(rwjVar.a.getContentResolver(), ((pc6) g).j);
        }
        if (g instanceof x2o) {
            x2o x2oVar = (x2o) g;
            if (x2oVar.j.equals(rwjVar.a.getPackageName())) {
                return ImageDecoder.createSource(rwjVar.a.getResources(), x2oVar.k);
            }
        }
        int i = Build.VERSION.SDK_INT;
        return i >= 31 ? ImageDecoder.createSource(tceVar.o().k0()) : i == 30 ? ImageDecoder.createSource(ByteBuffer.wrap(tceVar.o().k0())) : ImageDecoder.createSource(tceVar.a().toFile());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.dg7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ibe ibeVar;
        Object obj;
        nm6 nm6Var;
        int i;
        tqn tqnVar;
        nbe nbeVar;
        tqn tqnVar2;
        if (continuation instanceof ibe) {
            ibeVar = (ibe) continuation;
            int i2 = ibeVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ibeVar.n = i2 - Integer.MIN_VALUE;
                obj = ibeVar.l;
                nm6Var = nm6.a;
                i = ibeVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    tqn tqnVar3 = new tqn();
                    kbe kbeVar = new kbe(this, tqnVar3);
                    ibeVar.j = this;
                    ibeVar.k = tqnVar3;
                    ibeVar.n = 1;
                    Object S = sk3.S(g.a, kbeVar, ibeVar);
                    if (S != nm6Var) {
                        tqnVar = tqnVar3;
                        obj = S;
                        nbeVar = this;
                    }
                    return nm6Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tqnVar2 = (tqn) ibeVar.j;
                    qgg.h0(obj);
                    return new zf7((Drawable) obj, tqnVar2.a);
                }
                tqnVar = ibeVar.k;
                nbeVar = (nbe) ibeVar.j;
                qgg.h0(obj);
                ibeVar.j = tqnVar;
                ibeVar.k = null;
                ibeVar.n = 2;
                obj = nbeVar.c((Drawable) obj, ibeVar);
                if (obj != nm6Var) {
                    tqnVar2 = tqnVar;
                    return new zf7((Drawable) obj, tqnVar2.a);
                }
                return nm6Var;
            }
        }
        ibeVar = new ibe(this, (cg6) continuation);
        obj = ibeVar.l;
        nm6Var = nm6.a;
        i = ibeVar.n;
        if (i != 0) {
        }
        ibeVar.j = tqnVar;
        ibeVar.k = null;
        ibeVar.n = 2;
        obj = nbeVar.c((Drawable) obj, ibeVar);
        if (obj != nm6Var) {
        }
        return nm6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Drawable drawable, cg6 cg6Var) {
        lbe lbeVar;
        int i;
        nbe nbeVar;
        if (cg6Var instanceof lbe) {
            lbeVar = (lbe) cg6Var;
            int i2 = lbeVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lbeVar.n = i2 - Integer.MIN_VALUE;
                Object obj = lbeVar.l;
                nm6 nm6Var = nm6.a;
                i = lbeVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!(drawable instanceof AnimatedImageDrawable)) {
                        return drawable;
                    }
                    AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
                    rwj rwjVar = this.b;
                    m6k m6kVar = rwjVar.l;
                    m6k m6kVar2 = rwjVar.l;
                    Integer num = (Integer) m6kVar.a("coil#repeat_count");
                    animatedImageDrawable.setRepeatCount(num != null ? num.intValue() : -1);
                    Function0 function0 = (Function0) m6kVar2.a("coil#animation_start_callback");
                    Function0 function02 = (Function0) m6kVar2.a("coil#animation_end_callback");
                    if (function0 != null || function02 != null) {
                        dq7 dq7Var = ca8.a;
                        bsd bsdVar = j5h.a.g;
                        mbe mbeVar = new mbe(drawable, function0, function02, null);
                        lbeVar.j = this;
                        lbeVar.k = drawable;
                        lbeVar.n = 1;
                        if (x97.V(bsdVar, mbeVar, lbeVar) == nm6Var) {
                            return nm6Var;
                        }
                    }
                    nbeVar = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    drawable = (Drawable) lbeVar.k;
                    nbeVar = lbeVar.j;
                    qgg.h0(obj);
                }
                return new rso(drawable, nbeVar.b.e);
            }
        }
        lbeVar = new lbe(this, cg6Var);
        Object obj2 = lbeVar.l;
        nm6 nm6Var2 = nm6.a;
        i = lbeVar.n;
        if (i != 0) {
        }
        return new rso(drawable, nbeVar.b.e);
    }
}
