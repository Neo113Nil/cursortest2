package defpackage;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.player.ui.debug.model.DrmMode;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

/* loaded from: classes6.dex */
public final class raw extends aur implements uyc {
    public /* synthetic */ wb6 j;
    public /* synthetic */ f3t k;
    public /* synthetic */ hxj l;
    public /* synthetic */ azd m;
    public /* synthetic */ djs n;
    public final /* synthetic */ iz7 o;
    public final /* synthetic */ taw p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raw(iz7 iz7Var, taw tawVar, Continuation continuation) {
        super(6, continuation);
        this.o = iz7Var;
        this.p = tawVar;
    }

    @Override // defpackage.uyc
    public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        raw rawVar = new raw(this.o, this.p, (Continuation) obj6);
        rawVar.j = (wb6) obj;
        rawVar.k = (f3t) obj2;
        rawVar.l = (hxj) obj3;
        rawVar.m = (azd) obj4;
        rawVar.n = (djs) obj5;
        return rawVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        jg7 jg7Var;
        DrmMode drmMode;
        String str;
        String str2;
        tk2 tk2Var;
        yg0 yg0Var;
        nm6 nm6Var = nm6.a;
        qgg.h0(obj);
        wb6 wb6Var = this.j;
        f3t f3tVar = this.k;
        hxj hxjVar = this.l;
        azd azdVar = this.m;
        djs djsVar = this.n;
        iz7 iz7Var = this.o;
        paw pawVar = (paw) iz7Var.e;
        String D = pawVar != null ? pawVar.D() : null;
        qe7 qe7Var = (qe7) ((xdr) iz7Var.c).getValue();
        vcu vcuVar = f3tVar.a;
        sy1 sy1Var = f3tVar.b;
        zpr zprVar = f3tVar.c;
        mmq mmqVar = hxjVar.a;
        DrmMode drmMode2 = hxjVar.b;
        int i = hxjVar.c;
        String str3 = hxjVar.d;
        String str4 = hxjVar.e;
        tk2 tk2Var2 = azdVar.a;
        cgg cggVar = azdVar.b;
        rn3 rn3Var = azdVar.c;
        pi3 pi3Var = azdVar.d;
        jg7 jg7Var2 = f3tVar.e;
        jg7 jg7Var3 = f3tVar.d;
        Long l = djsVar.c;
        zmf zmfVar = djsVar.a;
        String str5 = djsVar.b;
        SessionColor sessionColor = djsVar.d;
        taw tawVar = this.p;
        List w0 = CollectionsKt.w0(tawVar.s);
        List w02 = CollectionsKt.w0(tawVar.t);
        List w03 = CollectionsKt.w0(tawVar.u);
        long currentTimeMillis = System.currentTimeMillis();
        if (D != null) {
            iz7 iz7Var2 = tawVar.v;
            if (((yg0) iz7Var2.l) == null || !Intrinsics.d(((qe7) ((fkn) iz7Var2.d).a.getValue()).a, D)) {
                drmMode = drmMode2;
                tk2Var = tk2Var2;
                str = str5;
                int i2 = 256;
                str2 = str3;
                x23 b = new wul().b(D, zo2.a, 256, 256, null);
                yg0 o = xee.o(256, 256, 2);
                Bitmap b2 = fx1.b(o);
                int i3 = 0;
                while (i3 < i2) {
                    jg7 jg7Var4 = jg7Var3;
                    int i4 = 0;
                    while (i4 < i2) {
                        if (b.b(i3, i4)) {
                            b2.setPixel(i3, i4, -16777216);
                        } else {
                            b2.setPixel(i3, i4, -1);
                        }
                        i4++;
                        i2 = 256;
                    }
                    i3++;
                    jg7Var3 = jg7Var4;
                    i2 = 256;
                }
                jg7Var = jg7Var3;
                iz7Var2.l = o;
                yg0Var = o;
            } else {
                yg0Var = (yg0) iz7Var2.l;
                jg7Var = jg7Var3;
                drmMode = drmMode2;
                str = str5;
                str2 = str3;
                tk2Var = tk2Var2;
            }
        } else {
            jg7Var = jg7Var3;
            drmMode = drmMode2;
            str = str5;
            str2 = str3;
            tk2Var = tk2Var2;
            yg0Var = null;
        }
        boolean z = qe7Var.z;
        sessionColor.getClass();
        return new qe7(D, wb6Var, vcuVar, sy1Var, zprVar, mmqVar, jg7Var, jg7Var2, drmMode, i, str2, tk2Var, cggVar, rn3Var, pi3Var, l, zmfVar, str4, str, sessionColor, w0, w02, w03, currentTimeMillis, yg0Var, z);
    }
}
