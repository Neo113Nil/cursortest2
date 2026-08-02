package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.ybsdk.feature.autotopup.internal.presentation.instruction.AutoTopupInstructionFragment;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularFragment;
import com.ybsdk.feature.autotopup.internal.presentation.saver.RoundingFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v1.AutoTopupSetupFragment;
import com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2Fragment;
import com.ybsdk.feature.transfer.version2.internal.network.Transfer2Api;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data.a;
import com.ybsdk.rconfig.b;

/* loaded from: classes3.dex */
public final class tl3 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ tl3(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    public static lv3 a(tw51 tw51Var) {
        int i = 23;
        lk lkVar = new lk(i, new gwf(tw51Var, i));
        int i2 = 25;
        lk lkVar2 = new lk(i2, lkVar);
        gwf gwfVar = new gwf(tw51Var, 7);
        int i3 = 0;
        gu3 gu3Var = new gu3(gwfVar, i3);
        gwf gwfVar2 = new gwf(tw51Var, 10);
        int i4 = 17;
        c4 c4Var = new c4(lkVar2, gu3Var, gwfVar2, i4);
        int i5 = 22;
        lk lkVar3 = new lk(i5, new gwf(tw51Var, 9));
        gwf gwfVar3 = new gwf(tw51Var, i5);
        gwf gwfVar4 = new gwf(tw51Var, 20);
        gwf gwfVar5 = new gwf(tw51Var, i4);
        gwf gwfVar6 = new gwf(tw51Var, 15);
        gwf gwfVar7 = new gwf(tw51Var, 21);
        wri0 wri0Var = new wri0(gwfVar7, i3);
        int i6 = 1;
        k4 k4Var = new k4(lkVar, lkVar3, gwfVar4, gwfVar5, gwfVar6, lkVar3, gwfVar7, new f04(gwfVar7, wri0Var, i6), new wri0(gwfVar7, i6), new f04(gwfVar7, wri0Var, i3), new gwf(tw51Var, i2), i6);
        p4 p4Var = new p4((Object) gwfVar3, (xvf0) k4Var, 15);
        mx3 mx3Var = new mx3(k4Var, 1);
        gwf gwfVar8 = new gwf(tw51Var, 12);
        gwf gwfVar9 = new gwf(tw51Var, 24);
        int i7 = 18;
        gwf gwfVar10 = new gwf(tw51Var, i7);
        int i8 = 16;
        p4 p4Var2 = new p4((Object) gwfVar, (xvf0) gwfVar10, i8);
        gwf gwfVar11 = new gwf(tw51Var, 13);
        c4 c4Var2 = new c4(k4Var, gwfVar3, gwfVar11, i7);
        kk kkVar = new kk(n3w.a(new bz3(new w3i(gwfVar8, gwfVar9, gwfVar2, p4Var2, gwfVar10, c4Var2, p4Var, fz3.a, 4))), 2);
        gwf gwfVar12 = new gwf(tw51Var, 14);
        gwf gwfVar13 = new gwf(tw51Var, 11);
        gwf gwfVar14 = new gwf(tw51Var, 8);
        gwf gwfVar15 = new gwf(tw51Var, i8);
        gwf gwfVar16 = new gwf(tw51Var, 19);
        lk lkVar4 = new lk(26, gwfVar10);
        n3w a = n3w.a(new u24(new ryh(25, k4Var)));
        gu3 gu3Var2 = new gu3(gwfVar, 1);
        kz3 kz3Var = jz3.a;
        int i9 = 2;
        zv3 zv3Var = new zv3(n3w.a(new t14(new s14(gwfVar9, kz3Var, gwfVar12, gwfVar13, gwfVar14, gwfVar8, p4Var2, gwfVar2, gwfVar15, gwfVar16, c4Var2, p4Var, lkVar4, a, gu3Var2))), gwfVar12, i9);
        int i10 = 3;
        kk kkVar2 = new kk(n3w.a(new a14(new m(gwfVar13, c4Var2, mx3Var, p4Var, gwfVar16, gwfVar12, gwfVar9, new gu3(gwfVar, i10), a, new qy3(gwfVar10, gwfVar7, 1)))), i10);
        int i11 = 0;
        zv3 zv3Var2 = new zv3(n3w.a(new dw3(new w3i(gw3.a, gwfVar9, gwfVar12, kz3Var, k4Var, gu3Var2, p4Var2, gwfVar11, 2))), gwfVar12, i11);
        zv3 zv3Var3 = new zv3(n3w.a(new hy3(new st0(gwfVar9, gwfVar10, gwfVar7, (xvf0) ox3.a, new mx3(k4Var, i11), (xvf0) kz3Var, p4Var, gwfVar13, gwfVar12, new gu3(gwfVar, i9), new qy3(gwfVar10, gwfVar7, i11)))), gwfVar12, 1);
        zv3 zv3Var4 = new zv3(n3w.a(new qzk0(new bu0(k4Var, gwfVar9, gwfVar10, kz3Var, p4Var, gwfVar13, gwfVar12, new gu3(gwfVar, 4), new qy3(gwfVar10, gwfVar7, i9)))), gwfVar12, i10);
        iz3 iz3Var = new iz3();
        tv3 tv3Var = new tv3((b) ((h9g) tw51Var).v.A.get());
        y5e.i(6, "expectedSize");
        ImmutableMap.a aVar = new ImmutableMap.a(6);
        aVar.b(AutoTopupResultFragment.class, kkVar);
        aVar.b(AutoTopupSetupFragment.class, zv3Var);
        aVar.b(AutoTopupSetupV2Fragment.class, kkVar2);
        aVar.b(AutoTopupInstructionFragment.class, zv3Var2);
        aVar.b(AutoTopupRegularFragment.class, zv3Var3);
        aVar.b(RoundingFragment.class, zv3Var4);
        return new lv3(c4Var, lkVar3, p4Var, mx3Var, iz3Var, tv3Var, aVar.a());
    }

    public static tl3 b(eqh eqhVar) {
        return new tl3(eqhVar, 23);
    }

    public static tl3 c(eqh eqhVar) {
        return new tl3(eqhVar, 24);
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 5;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new sl3((hk3) xvf0Var.get(), 0);
            case 1:
                return new sl3((hk3) xvf0Var.get(), 1);
            case 2:
                return new bo3((jn3) xvf0Var.get());
            case 3:
                return new pj((pho) xvf0Var.get());
            case 4:
                return new a((Transfer2Api) xvf0Var.get());
            case 5:
                return a((tw51) xvf0Var.get());
            case 6:
                return new bh4((vdc) xvf0Var.get());
            case 7:
                PaymentSdkEnvironment paymentSdkEnvironment = ((pcy) xvf0Var.get()).a;
                int[] iArr = ocy.a;
                int i3 = iArr[paymentSdkEnvironment.ordinal()];
                if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                    w511.b();
                    return null;
                }
                int i4 = iArr[paymentSdkEnvironment.ordinal()];
                if (i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) {
                    return new pgb(null);
                }
                w511.b();
                return null;
            case 8:
                return (y22) xvf0Var.get();
            case 9:
                return (y22) xvf0Var.get();
            case 10:
                return (y22) xvf0Var.get();
            case 11:
                return (lz40) xvf0Var.get();
            case 12:
                return new q501(27);
            case 13:
                return (u870) xvf0Var.get();
            case 14:
                m3v m3vVar = (m3v) ((xvf0) ((yv90) ((vv90) xvf0Var.get())).h.R).get();
                q5z.i(m3vVar);
                return m3vVar;
            case 15:
                return (u870) xvf0Var.get();
            case 16:
                return (jcp0) xvf0Var.get();
            case 17:
                return ((Context) xvf0Var.get()).getSharedPreferences("flags_preferencese", 0);
            case 18:
                return new kg5("CancellableDelayedAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.delayed.cancellable.a) xvf0Var.get(), m18.Companion.serializer());
            case 19:
                return new sr4(i2, (v2a0) xvf0Var.get());
            case 20:
                return new xw5((bx5) xvf0Var.get());
            case 21:
                return ((Context) xvf0Var.get()).getSharedPreferences("flags_preferencese", 0);
            case 22:
                return new fx5((rwo) xvf0Var.get());
            case 23:
                return new o61((pho) xvf0Var.get());
            case 24:
                return new v86((pho) xvf0Var.get());
            case 25:
                return new pm5(i2, (dbv) xvf0Var.get());
            case 26:
                return new pj((pho) xvf0Var.get());
            case 27:
                return new com.ybsdk.feature.transfer.version2.internal.screens.budget.data.a((Transfer2Api) xvf0Var.get());
            case 28:
                return new yu6((Context) xvf0Var.get());
            default:
                return new tf7();
        }
    }

    public /* synthetic */ tl3(Object obj, xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
