package app.cash.broadway.ui.compose;

import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.UpdatesWindowFlags$TabConfig;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackOrientation;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackState;
import com.squareup.cash.composeUi.foundation.layout.SizeMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes.dex */
public final /* synthetic */ class ChromeConfigKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ ChromeConfigKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
        this.f$6 = obj7;
        this.f$7 = i;
        this.f$8 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        Object obj9 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ChromeConfigKt.ChromeConfig((UpdatesWindowFlags$TabConfig) obj9, (ChromeSystemIconColor) obj8, (ChromeSystemIconColor) obj7, (Boolean) obj6, (Boolean) obj5, (ToolbarConfig) obj4, (Float) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$8);
                break;
            case 1:
                ((Integer) obj2).getClass();
                DBUtil.TitleBarSub((String) obj9, (NavigationType) obj8, (Modifier) obj7, (DynamicColorConfiguration) obj6, (Function0) obj5, (Modifier) obj4, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$8);
                break;
            case 2:
                ((Integer) obj2).getClass();
                DBUtil.TitleBarSub((Function2) obj9, (NavigationType) obj8, (Modifier) obj7, (DynamicColorConfiguration) obj6, (Function0) obj5, (Modifier) obj4, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                SizeKt.AdaptiveStack((Modifier) obj9, (AdaptiveStackState) obj8, (LayoutDirection) obj7, (Arrangement$Horizontal) obj6, (SizeMode) obj5, (AdaptiveStackOrientation) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1), this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }
}
