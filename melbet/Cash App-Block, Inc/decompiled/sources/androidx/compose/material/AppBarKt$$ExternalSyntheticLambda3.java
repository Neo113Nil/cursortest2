package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class AppBarKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ float f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Modifier f$6;
    public final /* synthetic */ ComposableLambdaImpl f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ AppBarKt$$ExternalSyntheticLambda3(long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = j;
        this.f$1 = j2;
        this.f$2 = f;
        this.f$3 = paddingValues;
        this.f$5 = windowInsets;
        this.f$6 = modifier;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$8;
        Object obj3 = this.f$5;
        Object obj4 = this.f$3;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                AppBarKt.m461AppBarHkEspTQ(this.f$0, this.f$1, this.f$2, (PaddingValues) obj4, (WindowInsets) obj3, this.f$6, this.f$7, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                TooltipKt.m562PlainTooltipgv3ox5I((TooltipScopeImpl) obj4, this.f$6, this.f$2, (Shape) obj3, this.f$0, this.f$1, this.f$7, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AppBarKt$$ExternalSyntheticLambda3(TooltipScopeImpl tooltipScopeImpl, Modifier modifier, float f, Shape shape, long j, long j2, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$3 = tooltipScopeImpl;
        this.f$6 = modifier;
        this.f$2 = f;
        this.f$5 = shape;
        this.f$0 = j;
        this.f$1 = j2;
        this.f$7 = composableLambdaImpl;
        this.f$8 = i;
    }
}
