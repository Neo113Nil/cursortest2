package app.cash.local.views.composeuiview;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.room.TransactorKt;
import app.cash.local.viewmodels.LocalEditorialViewModel;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalEditorialViewKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalEditorialViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ LocalEditorialViewKt$$ExternalSyntheticLambda1(LocalEditorialViewModel localEditorialViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = localEditorialViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        LocalEditorialViewModel localEditorialViewModel = this.f$0;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    gapComposer.skipToGroupEnd();
                } else if (localEditorialViewModel.showShareButton) {
                    gapComposer.startReplaceGroup(-1468723577);
                    Icons icons = Icons.Share24;
                    String str = localEditorialViewModel.title;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(15, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, str2, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (intValue & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1468559246);
                    gapComposer.end(false);
                }
                break;
            default:
                Modifier modifier = (Modifier) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    LocalAddBrandsViewKt.LocalEditorialView(modifier, localEditorialViewModel, function1, gapComposer2, intValue2 & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
