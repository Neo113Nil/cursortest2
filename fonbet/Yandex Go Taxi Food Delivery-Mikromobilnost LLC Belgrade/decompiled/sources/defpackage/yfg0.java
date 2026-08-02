package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes3.dex */
public final class yfg0 implements ev31 {
    public final stz0 a = new stz0(Text.Empty.INSTANCE, null, null, null, null, qtz0.a, false, null, null, null, null, null, 32734);

    public yfg0() {
        b bVar = Text.Companion;
        int i = dzh0.ybsdk_qr_payment_subscriptions_empty_title;
        bVar.getClass();
        new Text.Resource(i);
        new Text.Resource(dzh0.ybsdk_qr_payment_subscriptions_empty_description);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0108  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        boolean z;
        List list;
        stz0 stz0Var;
        fwn fwnVar;
        rbv rbvVar;
        ThemedImageUrlEntity image;
        llq0 llq0Var;
        Object obj2;
        j1v0 j1v0Var = (j1v0) obj;
        PageHeaderEntity pageHeaderEntity = j1v0Var.b;
        u8j0 u8j0Var = j1v0Var.a;
        z1v0 z1v0Var = (z1v0) u8j0Var.a();
        if (z1v0Var instanceof z1v0) {
            z = z1v0Var.a.isEmpty();
        } else {
            if (z1v0Var != null) {
                w511.b();
                return null;
            }
            z = true;
        }
        boolean z2 = u8j0Var instanceof t8j0;
        if (z2 || (u8j0Var instanceof s8j0)) {
            list = EmptyList.a;
        } else {
            if (!(u8j0Var instanceof r8j0)) {
                w511.b();
                return null;
            }
            z1v0 z1v0Var2 = (z1v0) ((r8j0) u8j0Var).a;
            if (!(z1v0Var2 instanceof z1v0)) {
                w511.b();
                return null;
            }
            String str = z1v0Var2.c;
            List list2 = z1v0Var2.a;
            if (list2.isEmpty()) {
                llq0Var = null;
            } else {
                List<wj1> list3 = list2;
                ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
                for (wj1 wj1Var : list3) {
                    String str2 = wj1Var.a;
                    String str3 = wj1Var.b;
                    rbv f = job1.f(wj1Var.c, new cbg0(15));
                    if (f == null) {
                        f = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
                    }
                    arrayList.add(new tmq0(str2, str3, f, jl40.l(wj1Var.a, str)));
                }
                llq0Var = new llq0(arrayList);
            }
            ListBuilder a = rcc.a();
            if (pageHeaderEntity != null) {
                a.add(pageHeaderEntity);
            }
            if (llq0Var != null) {
                a.add(llq0Var);
            }
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (jl40.l(((wj1) obj2).a, str)) {
                    break;
                }
            }
            wj1 wj1Var2 = (wj1) obj2;
            if (wj1Var2 != null) {
                a.addAll(wj1Var2.d);
            }
            list = a.j();
        }
        List list4 = list;
        if (z) {
            stz0Var = this.a;
        } else {
            Text.Empty empty = Text.Empty.INSTANCE;
            z1v0 z1v0Var3 = (z1v0) u8j0Var.a();
            if (z1v0Var3 instanceof z1v0) {
                if (pageHeaderEntity != null && (image = pageHeaderEntity.getImage()) != null) {
                    rbvVar = job1.f(image, new cbg0(14));
                    stz0Var = new stz0(empty, null, null, null, null, rbvVar == null ? new ptz0(rbvVar) : qtz0.a, false, null, null, null, null, null, 32734);
                }
            } else if (z1v0Var3 != null) {
                w511.b();
                return null;
            }
            rbvVar = null;
            stz0Var = new stz0(empty, null, null, null, null, rbvVar == null ? new ptz0(rbvVar) : qtz0.a, false, null, null, null, null, null, 32734);
        }
        boolean z3 = u8j0Var instanceof s8j0;
        s8j0 s8j0Var = z3 ? (s8j0) u8j0Var : null;
        Throwable th = s8j0Var != null ? s8j0Var.a : null;
        z1v0 z1v0Var4 = (z1v0) u8j0Var.a();
        if (z1v0Var4 instanceof z1v0) {
            fwnVar = z1v0Var4.b;
        } else {
            if (z1v0Var4 != null) {
                w511.b();
                return null;
            }
            fwnVar = null;
        }
        return new k1v0(list4, z2, stz0Var, z3, th, (fwnVar == null || !z) ? null : fwnVar);
    }
}
