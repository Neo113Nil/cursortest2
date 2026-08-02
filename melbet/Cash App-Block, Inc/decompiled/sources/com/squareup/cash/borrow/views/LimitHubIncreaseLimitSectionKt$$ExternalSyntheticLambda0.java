package com.squareup.cash.borrow.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.tracing.Trace;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.protos.cash.ui.Icon;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class LimitHubIncreaseLimitSectionKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Icon f$0;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Icon icon = this.f$0;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    zzd zzdVar = Icons.Companion;
                    String str = icon.arcade_id;
                    str.getClass();
                    zzdVar.getClass();
                    Icons icons = zzd.get(str);
                    if (icons == null) {
                        gapComposer.startReplaceGroup(1881789457);
                    } else {
                        gapComposer.startReplaceGroup(1881789458);
                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                num.getClass();
                SsnViewKt.NotificationIcon(icon, composer, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LimitHubIncreaseLimitSectionKt$$ExternalSyntheticLambda0(Icon icon, int i) {
        this.f$0 = icon;
    }
}
