package com.yandex.passport.internal.ui.sloth.menu;

import android.view.View;
import com.yandex.passport.api.e2;
import com.yandex.passport.internal.ui.bouncer.roundabout.z;
import com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperActivity;
import defpackage.pjc;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i2 = UserMenuActivity.d;
                com.yandex.passport.internal.ui.a.r((UserMenuActivity) obj, com.yandex.plus.core.network.api.utils.a.G(new e2(new Throwable("Sloth returned crash"))));
                return Unit.a;
            case 1:
                z zVar = ((ManagingPlusDevicesHelperActivity) obj).a;
                if (zVar != null) {
                    ((View) zVar.e).setVisibility(0);
                    return Unit.a;
                }
                Intrinsics.j("ui");
                throw null;
            case 2:
                return ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.c) obj).getViewLifecycleOwner().getLifecycle();
            default:
                return new Boolean[((pjc[]) obj).length];
        }
    }
}
