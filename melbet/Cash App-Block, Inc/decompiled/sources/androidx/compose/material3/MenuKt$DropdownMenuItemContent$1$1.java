package androidx.compose.material3;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.material3.ButtonKt$Button$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class MenuKt$DropdownMenuItemContent$1$1 implements Function2 {
    public final /* synthetic */ Object $colors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Function $leadingIcon;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $text;
    public final /* synthetic */ Object $trailingIcon;

    public MenuKt$DropdownMenuItemContent$1$1(Function0 function0, Modifier modifier, boolean z, ImageVector imageVector, String str) {
        this.$leadingIcon = function0;
        this.$trailingIcon = modifier;
        this.$enabled = z;
        this.$colors = imageVector;
        this.$text = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.$text;
        Object obj4 = this.$colors;
        Object obj5 = this.$trailingIcon;
        Function function = this.$leadingIcon;
        int i2 = 2;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                Function2 function2 = (Function2) obj5;
                MenuItemColors menuItemColors = (MenuItemColors) obj4;
                Function2 function22 = (Function2) function;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    boolean z = this.$enabled;
                    if (function22 != null) {
                        gapComposer.startReplaceGroup(-864613220);
                        Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(z ? menuItemColors.leadingIconColor : menuItemColors.disabledLeadingIconColor, ContentColorKt.LocalContentColor), Expect_jvmKt.rememberComposableLambda(1241781204, new DatePickerKt$DatePickerHeader$1$1(i2, function22), gapComposer), gapComposer, 56);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-864293207);
                        gapComposer.end(false);
                    }
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.LocalContentColor;
                    Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(z ? menuItemColors.textColor : menuItemColors.disabledTextColor, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-893579015, new TooltipKt$TooltipBox$3(function22, function2, (ComposableLambdaImpl) obj3, 4), gapComposer), gapComposer, 56);
                    if (function2 != null) {
                        gapComposer.startReplaceGroup(-863394951);
                        Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(z ? menuItemColors.trailingIconColor : menuItemColors.disabledTrailingIconColor, dynamicProvidableCompositionLocal), Expect_jvmKt.rememberComposableLambda(-782441013, new DatePickerKt$DatePickerHeader$1$1(3, function2), gapComposer), gapComposer, 56);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-863072055);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Number) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    MenuKt.IconButton((Function0) function, (Modifier) obj5, this.$enabled, null, null, Expect_jvmKt.rememberComposableLambda(-1301085432, new ButtonKt$Button$2.AnonymousClass1(i2, (ImageVector) obj4, (String) obj3), gapComposer2), gapComposer2, 1572864, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public MenuKt$DropdownMenuItemContent$1$1(Function2 function2, MenuItemColors menuItemColors, boolean z, Function2 function22, ComposableLambdaImpl composableLambdaImpl) {
        this.$leadingIcon = function2;
        this.$colors = menuItemColors;
        this.$enabled = z;
        this.$trailingIcon = function22;
        this.$text = composableLambdaImpl;
    }
}
