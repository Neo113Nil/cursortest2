package com.squareup.cash.directory_ui.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.ui.Ui;
import app.cash.directoryui.viewmodels.DirectoryListItem;
import coil3.RealImageLoader;
import com.google.android.gms.common.zzc;
import com.squareup.cash.db2.profile.ProfileQueries$$ExternalSyntheticLambda13;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MooncakeHeaderView$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Button f$0;
    public final /* synthetic */ MooncakeHeaderView f$1;
    public final /* synthetic */ DirectoryListItem.Header f$2;
    public final /* synthetic */ Ui.EventReceiver f$3;

    public /* synthetic */ MooncakeHeaderView$$ExternalSyntheticLambda6(Button button, MooncakeHeaderView mooncakeHeaderView, DirectoryListItem.Header header, Ui.EventReceiver eventReceiver, int i) {
        this.$r8$classId = i;
        this.f$0 = button;
        this.f$1 = mooncakeHeaderView;
        this.f$2 = header;
        this.f$3 = eventReceiver;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1191499361, new MooncakeHeaderView$$ExternalSyntheticLambda6(this.f$0, this.f$1, this.f$2, this.f$3, 1), gapComposer), gapComposer, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    RealImageLoader realImageLoader = this.f$1.imageLoader;
                    Button button = this.f$0;
                    boolean changedInstance = gapComposer2.changedInstance(button);
                    Ui.EventReceiver eventReceiver = this.f$3;
                    boolean changedInstance2 = changedInstance | gapComposer2.changedInstance(eventReceiver);
                    DirectoryListItem.Header header = this.f$2;
                    boolean changedInstance3 = changedInstance2 | gapComposer2.changedInstance(header);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changedInstance3 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new ProfileQueries$$ExternalSyntheticLambda13(button, eventReceiver, header);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    zzc.SectionHeaderButton(button, realImageLoader, null, (Function1) rememberedValue, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
