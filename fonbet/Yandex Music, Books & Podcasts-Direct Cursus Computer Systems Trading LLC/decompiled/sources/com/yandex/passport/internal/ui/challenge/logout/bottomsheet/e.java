package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LogoutBottomSheetActivity b;

    public /* synthetic */ e(LogoutBottomSheetActivity logoutBottomSheetActivity, int i) {
        this.a = i;
        this.b = logoutBottomSheetActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.b;
        switch (i) {
            case 0:
                int i2 = LogoutBottomSheetActivity.k;
                return new com.yandex.passport.internal.ui.bouncer.roundabout.o(logoutBottomSheetActivity);
            case 1:
                int i3 = LogoutBottomSheetActivity.k;
                LogoutBottomSheetActivity logoutBottomSheetActivity2 = this.b;
                com.yandex.passport.internal.flags.i iVar = logoutBottomSheetActivity2.a;
                if (iVar != null) {
                    return ((Boolean) iVar.b(com.yandex.passport.internal.flags.o.S)).booleanValue() ? new com.yandex.passport.internal.ui.common.a(new ComposeView(logoutBottomSheetActivity2, null, 0, 6, null)) : new w0(new n1(logoutBottomSheetActivity2));
                }
                Intrinsics.j("flagRepository");
                throw null;
            case 2:
                int i4 = LogoutBottomSheetActivity.k;
                return new g(logoutBottomSheetActivity.k());
            default:
                int i5 = LogoutBottomSheetActivity.k;
                logoutBottomSheetActivity.k().G(r0.b);
                return Unit.a;
        }
    }
}
