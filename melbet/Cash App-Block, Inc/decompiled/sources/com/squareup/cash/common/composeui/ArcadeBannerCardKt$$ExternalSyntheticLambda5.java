package com.squareup.cash.common.composeui;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.formview.components.arcade.ArcadeLocalImageIconKt;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeBannerCardKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ ArcadeBannerCardKt$$ExternalSyntheticLambda5(Icons icons, Modifier modifier, long j, long j2, int i, int i2) {
        this.$r8$classId = 2;
        this.f$0 = icons;
        this.f$3 = modifier;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$4 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        Object obj3 = this.f$3;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                VisibleKt.m3481ActionButtoneopBjH0((String) obj4, this.f$1, this.f$2, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                VisibleKt.m3498SubtitleRIQooxk((String) obj4, this.f$1, this.f$2, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                ArcadeLocalImageIconKt.m3560ArcadeLocalIconjA1GFJw((Icons) obj4, (Modifier) obj3, this.f$1, this.f$2, (Composer) obj, updateChangedFlags, this.f$4);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                long j = this.f$1;
                long j2 = this.f$2;
                ChannelListViewKt.m3728NotificationSectionHeadereopBjH0((String) obj4, j, j2, (PaddingValues) obj3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeBannerCardKt$$ExternalSyntheticLambda5(String str, long j, long j2, Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = obj;
        this.f$4 = i;
    }
}
