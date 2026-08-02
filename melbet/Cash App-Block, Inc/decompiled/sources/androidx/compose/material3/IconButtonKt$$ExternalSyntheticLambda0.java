package androidx.compose.material3;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import app.cash.versioned.Versioned;
import coil3.RealImageLoader;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.fidesmo.viewmodels.FidesmoProvisioningViewModel;
import com.squareup.cash.fidesmo.viewmodels.ScanningStarPlacement;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormMerchantTransactionKt;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.paychecks.views.wheel.ReceiptWheelContentKt;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.franklin.api.FormBlocker;
import com.withpersona.sdk2.camera.ContextUtilsKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class IconButtonKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Modifier modifier, InstrumentCellViewModel instrumentCellViewModel, AvatarSize avatarSize, boolean z, Color color, Function0 function0, int i, int i2) {
        this.$r8$classId = 8;
        this.f$1 = modifier;
        this.f$3 = instrumentCellViewModel;
        this.f$5 = avatarSize;
        this.f$2 = z;
        this.f$6 = color;
        this.f$0 = function0;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$3;
        Object obj6 = this.f$0;
        Object obj7 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                MenuKt.IconButton((Function0) obj6, (Modifier) obj7, this.f$2, (IconButtonColors) obj5, (Shape) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                AccountToDoKt.AccountSectionRow((Modifier) obj7, (Icons) obj5, (String) obj4, (String) obj3, this.f$2, (Function0) obj6, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                AccountToDoKt.AccountToolbar((Modifier) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, this.f$2, (Composer) obj, updateChangedFlags3, this.f$8);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                ActivityTabViewKt.ActivityTab((ActivityTabViewModel) obj6, (Function1) obj7, (RealCashVibrator) obj5, (RealImageLoader) obj4, (RealScrollPerformanceTrackerFactory) obj3, this.f$2, (Composer) obj, updateChangedFlags4, this.f$8);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                StorageUtil.ButtonIcon((Icons) obj5, (String) obj4, (Function0) obj6, (Modifier) obj7, this.f$2, (Alignment) obj3, (Composer) obj, updateChangedFlags5, this.f$8);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                FidesmoProvisioningViewKt.ScanningContent((FidesmoProvisioningViewModel.Scanning) obj6, (Function1) obj7, (ScanningStarPlacement) obj5, this.f$2, (Function1) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags6, this.f$8);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                ArcadeFormMerchantTransactionKt.ArcadeFormMerchantTransaction((LocalizedMoneyFormatter.Factory) obj7, (RealImageLoader) obj5, (FormBlocker.Element.MerchantTransactionElement) obj4, (Function0) obj6, this.f$2, (Function1) obj3, (Composer) obj, updateChangedFlags7, this.f$8);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                ContextUtilsKt.GenericTreeElements((GenericTreeElementsViewModel) obj6, (Modifier) obj7, (RealImageLoader) obj5, this.f$2, (Function3) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags8, this.f$8);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                InstrumentCellKt.m3578InstrumentRowjM_yU8I((Modifier) obj7, (InstrumentCellViewModel) obj5, (AvatarSize) obj4, this.f$2, (Color) obj3, (Function0) obj6, (Composer) obj, updateChangedFlags9, this.f$8);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(i2 | 1);
                Transformations.MoneybotChatView((MoneybotChatViewModel) obj6, (RealImageLoader) obj7, (RealCashVibrator) obj5, (Function1) obj4, this.f$2, (ClientRenderablePluginRegistry) obj3, (Composer) obj, updateChangedFlags10, this.f$8);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(i2 | 1);
                LazyDslKt.QuickActionsBar((MessageViewModel.MoneybotMessageViewModel.ThumbState) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, this.f$2, (Composer) obj, updateChangedFlags11, this.f$8);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int updateChangedFlags12 = Updater.updateChangedFlags(i2 | 1);
                ComposerKt.CircleButtonContainer((Modifier) obj7, this.f$2, (Function0) obj6, (String) obj5, (String) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags12, this.f$8);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int updateChangedFlags13 = Updater.updateChangedFlags(i2 | 1);
                ReceiptWheelContentKt.EditDistributionCommonImplementation((String) obj6, (String) obj7, this.f$2, (Function3) obj5, (String) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags13, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags14 = Updater.updateChangedFlags(1);
                QuickPayViewKt.NoteInputView((Modifier) obj7, (String) obj6, (String) obj5, this.f$7, this.f$2, (Function1) obj4, (Versioned) obj3, (Composer) obj, updateChangedFlags14, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Modifier modifier, Icons icons, String str, String str2, boolean z, Function0 function0, int i, int i2) {
        this.$r8$classId = 1;
        this.f$1 = modifier;
        this.f$3 = icons;
        this.f$5 = str;
        this.f$6 = str2;
        this.f$2 = z;
        this.f$0 = function0;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Modifier modifier, String str, String str2, int i, boolean z, Function1 function1, Versioned versioned, int i2, int i3) {
        this.$r8$classId = 13;
        this.f$1 = modifier;
        this.f$0 = str;
        this.f$3 = str2;
        this.f$7 = i;
        this.f$2 = z;
        this.f$5 = function1;
        this.f$6 = versioned;
        this.f$8 = i3;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Modifier modifier, boolean z, Function0 function0, String str, String str2, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 11;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$0 = function0;
        this.f$3 = str;
        this.f$5 = str2;
        this.f$6 = composableLambdaImpl;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(ActivityTabViewModel activityTabViewModel, Function1 function1, RealCashVibrator realCashVibrator, RealImageLoader realImageLoader, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, boolean z, int i, int i2) {
        this.$r8$classId = 3;
        this.f$0 = activityTabViewModel;
        this.f$1 = function1;
        this.f$3 = realCashVibrator;
        this.f$5 = realImageLoader;
        this.f$6 = realScrollPerformanceTrackerFactory;
        this.f$2 = z;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Icons icons, String str, Function0 function0, Modifier modifier, boolean z, Alignment alignment, int i, int i2) {
        this.$r8$classId = 4;
        this.f$3 = icons;
        this.f$5 = str;
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$6 = alignment;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(MoneybotChatViewModel moneybotChatViewModel, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Function1 function1, boolean z, ClientRenderablePluginRegistry clientRenderablePluginRegistry, int i, int i2) {
        this.$r8$classId = 9;
        this.f$0 = moneybotChatViewModel;
        this.f$1 = realImageLoader;
        this.f$3 = realCashVibrator;
        this.f$5 = function1;
        this.f$2 = z;
        this.f$6 = clientRenderablePluginRegistry;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(LocalizedMoneyFormatter.Factory factory, RealImageLoader realImageLoader, FormBlocker.Element.MerchantTransactionElement merchantTransactionElement, Function0 function0, boolean z, Function1 function1, int i, int i2) {
        this.$r8$classId = 6;
        this.f$1 = factory;
        this.f$3 = realImageLoader;
        this.f$5 = merchantTransactionElement;
        this.f$0 = function0;
        this.f$2 = z;
        this.f$6 = function1;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, boolean z, Function function, Function1 function1, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = z;
        this.f$5 = function;
        this.f$6 = function1;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Object obj, Object obj2, boolean z, Object obj3, Object obj4, Function function, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = z;
        this.f$3 = obj3;
        this.f$5 = obj4;
        this.f$6 = function;
        this.f$7 = i;
        this.f$8 = i2;
    }

    public /* synthetic */ IconButtonKt$$ExternalSyntheticLambda0(Object obj, Function0 function0, Function0 function02, Function0 function03, Function0 function04, boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = obj;
        this.f$0 = function0;
        this.f$3 = function02;
        this.f$5 = function03;
        this.f$6 = function04;
        this.f$2 = z;
        this.f$7 = i;
        this.f$8 = i2;
    }
}
