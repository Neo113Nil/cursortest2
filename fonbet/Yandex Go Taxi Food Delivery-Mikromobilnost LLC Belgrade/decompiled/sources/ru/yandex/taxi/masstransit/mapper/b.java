package ru.yandex.taxi.masstransit.mapper;

import defpackage.avj0;
import defpackage.bdc;
import defpackage.df30;
import defpackage.ej30;
import defpackage.fj30;
import defpackage.gj30;
import defpackage.gv30;
import defpackage.j73;
import defpackage.kyh0;
import defpackage.my6;
import defpackage.n1j;
import defpackage.nj30;
import defpackage.ny61;
import defpackage.oov0;
import defpackage.q47;
import defpackage.rw30;
import defpackage.su30;
import defpackage.tcc;
import defpackage.udu;
import defpackage.vb6;
import defpackage.wb6;
import defpackage.xng0;
import defpackage.zuj0;
import defpackage.zy6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.common_models.ui.TextStyle;

/* loaded from: classes6.dex */
public final class b {
    public final zuj0 a;
    public final a b;

    public b(zuj0 zuj0Var, a aVar) {
        this.a = zuj0Var;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(n1j n1jVar, oov0 oov0Var, ru.yandex.taxi.masstransit.geopayment.tickets.model.a aVar, Set set, boolean z, ContinuationImpl continuationImpl) {
        MtExpandedRoutesUiStateMapper$mapUiState$1 mtExpandedRoutesUiStateMapper$mapUiState$1;
        int i;
        udu uduVar;
        boolean isEmpty;
        List list;
        zy6 fj30Var;
        zy6 zy6Var;
        n1j n1jVar2 = n1jVar;
        if (continuationImpl instanceof MtExpandedRoutesUiStateMapper$mapUiState$1) {
            mtExpandedRoutesUiStateMapper$mapUiState$1 = (MtExpandedRoutesUiStateMapper$mapUiState$1) continuationImpl;
            int i2 = mtExpandedRoutesUiStateMapper$mapUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtExpandedRoutesUiStateMapper$mapUiState$1.label = i2 - Integer.MIN_VALUE;
                MtExpandedRoutesUiStateMapper$mapUiState$1 mtExpandedRoutesUiStateMapper$mapUiState$12 = mtExpandedRoutesUiStateMapper$mapUiState$1;
                Object obj = mtExpandedRoutesUiStateMapper$mapUiState$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtExpandedRoutesUiStateMapper$mapUiState$12.label;
                zuj0 zuj0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    su30 su30Var = n1jVar2.b.a;
                    gv30 gv30Var = su30Var.f;
                    String format = String.format("%s-%s", Arrays.copyOf(new Object[]{gv30Var.a, gv30Var.b}, 2));
                    String obj3 = su30Var.c.b.toString();
                    gv30 gv30Var2 = su30Var.f;
                    udu uduVar2 = new udu(obj3, format, kotlin.collections.a.X(j73.A(new String[]{obj3, ((avj0) zuj0Var).i(kyh0.mt_interval_borders, gv30Var2.a, gv30Var2.b)}), Extension.FIX_SPACE, null, null, null, 62));
                    rw30 rw30Var = n1jVar2.b;
                    mtExpandedRoutesUiStateMapper$mapUiState$12.L$0 = n1jVar2;
                    mtExpandedRoutesUiStateMapper$mapUiState$12.L$1 = null;
                    mtExpandedRoutesUiStateMapper$mapUiState$12.L$2 = null;
                    mtExpandedRoutesUiStateMapper$mapUiState$12.L$3 = null;
                    mtExpandedRoutesUiStateMapper$mapUiState$12.L$4 = uduVar2;
                    mtExpandedRoutesUiStateMapper$mapUiState$12.Z$0 = z;
                    mtExpandedRoutesUiStateMapper$mapUiState$12.label = 1;
                    uduVar = uduVar2;
                    obj = this.b.f(rw30Var, set, oov0Var, aVar, z, null, false, mtExpandedRoutesUiStateMapper$mapUiState$12);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uduVar = (udu) mtExpandedRoutesUiStateMapper$mapUiState$12.L$4;
                    n1jVar2 = (n1j) mtExpandedRoutesUiStateMapper$mapUiState$12.L$0;
                    kotlin.b.b(obj);
                }
                List list2 = (List) obj;
                wb6 wb6Var = n1jVar2.a;
                String str = n1jVar2.c;
                ButtonOrientation buttonOrientation = ButtonOrientation.HORIZONTAL;
                List list3 = wb6Var.a;
                isEmpty = list3.isEmpty();
                zy6 zy6Var2 = gj30.a;
                if (isEmpty) {
                    List<vb6> list4 = list3;
                    ArrayList arrayList = new ArrayList(tcc.n(list4, 10));
                    for (vb6 vb6Var : list4) {
                        int i3 = nj30.a[vb6Var.a.ordinal()];
                        if (i3 == 1) {
                            fj30Var = new fj30(str);
                        } else if (i3 != 2) {
                            fj30Var = ej30.a;
                        } else {
                            zy6Var = zy6Var2;
                            arrayList.add(new my6(vb6Var.b, null, vb6Var.d, null, zy6Var, vb6Var.c, null, false, false, 16182));
                        }
                        zy6Var = fj30Var;
                        arrayList.add(new my6(vb6Var.b, null, vb6Var.d, null, zy6Var, vb6Var.c, null, false, false, 16182));
                    }
                    list = arrayList;
                } else {
                    list = Collections.singletonList(new my6(((avj0) zuj0Var).h(kyh0.mt_view_on_map), new bdc(xng0.textOnControl), new bdc(xng0.controlMain), TextStyle.ACCENT, zy6Var2, null, null, false, false, 16292));
                }
                return new df30(uduVar, list2, new q47(buttonOrientation, list));
            }
        }
        mtExpandedRoutesUiStateMapper$mapUiState$1 = new MtExpandedRoutesUiStateMapper$mapUiState$1(this, continuationImpl);
        MtExpandedRoutesUiStateMapper$mapUiState$1 mtExpandedRoutesUiStateMapper$mapUiState$122 = mtExpandedRoutesUiStateMapper$mapUiState$1;
        Object obj4 = mtExpandedRoutesUiStateMapper$mapUiState$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtExpandedRoutesUiStateMapper$mapUiState$122.label;
        zuj0 zuj0Var2 = this.a;
        if (i != 0) {
        }
        List list22 = (List) obj4;
        wb6 wb6Var2 = n1jVar2.a;
        String str2 = n1jVar2.c;
        ButtonOrientation buttonOrientation2 = ButtonOrientation.HORIZONTAL;
        List list32 = wb6Var2.a;
        isEmpty = list32.isEmpty();
        zy6 zy6Var22 = gj30.a;
        if (isEmpty) {
        }
        return new df30(uduVar, list22, new q47(buttonOrientation2, list));
    }
}
