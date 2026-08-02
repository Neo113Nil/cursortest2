package defpackage;

import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.b;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupEditBottomSheet;
import com.ybsdk.feature.deeplink.api.actions.AutoTopupEnableSetting;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final /* synthetic */ class x04 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ x04(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r3 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        r6 = new defpackage.thq0(r3);
        r0 = ((defpackage.u04) r5.X()).g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
    
        if ((r0 instanceof defpackage.ru3) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        r5.g0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a8, code lost:
    
        r5.l0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if ((r0 instanceof defpackage.pu3) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        r5.v0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        defpackage.x4c.g("onSelectedPaymentMethodChanged with state", null, java.lang.String.valueOf(((defpackage.u04) r5.X()).g), java.util.Collections.singletonList(defpackage.lrp0.d), 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        if (r3 == null) goto L38;
     */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        h5a0 h5a0Var;
        pz3 pz3Var;
        Object obj2;
        Object obj3;
        int i = this.a;
        int i2 = 28;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.a0(new eo1(i2, ((AutoTopupEnableSetting) obj).getSetting()));
                break;
            case 1:
                bVar.a0(new v5(i2, ((AutoTopupEditBottomSheet) obj).getSetting(), bVar));
                break;
            default:
                String str = (String) obj;
                iaa0 iaa0Var = ((u04) bVar.X()).i;
                if (iaa0Var != null) {
                    Iterator it = iaa0Var.b.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj3 = it.next();
                            if (jl40.l(((h5a0) obj3).getId(), str)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    h5a0Var = (h5a0) obj3;
                    break;
                }
                iaa0 iaa0Var2 = ((u04) bVar.X()).i;
                if (iaa0Var2 != null && (pz3Var = iaa0Var2.a) != null) {
                    Iterator it2 = pz3Var.c.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (jl40.l(((h5a0) obj2).getId(), str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    h5a0Var = (h5a0) obj2;
                    break;
                } else {
                    h5a0Var = null;
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
