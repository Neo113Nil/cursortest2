package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.stripe.android.financialconnections.ui.TextResource;
import com.stripe.android.financialconnections.ui.components.TextKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class FlowLayoutKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ int f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ FlowLayoutKt$$ExternalSyntheticLambda1(Modifier modifier, Arrangement$Horizontal arrangement$Horizontal, Arrangement$Vertical arrangement$Vertical, BiasAlignment.Vertical vertical, int i, int i2, ComposableLambdaImpl composableLambdaImpl, int i3, int i4) {
        this.f$0 = modifier;
        this.f$1 = arrangement$Horizontal;
        this.f$2 = arrangement$Vertical;
        this.f$3 = vertical;
        this.f$4 = i;
        this.f$5 = i2;
        this.f$6 = composableLambdaImpl;
        this.f$7 = i3;
        this.f$8 = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$6;
        Object obj4 = this.f$3;
        Object obj5 = this.f$2;
        Object obj6 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                OffsetKt.FlowRow(this.f$0, (Arrangement$Horizontal) obj6, (Arrangement$Vertical) obj5, (BiasAlignment.Vertical) obj4, this.f$4, this.f$5, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                TextKt.m4020AnnotatedTextrm0N8CA((TextResource) obj6, (Function1) obj5, (TextStyle) obj4, this.f$0, (Map) obj3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FlowLayoutKt$$ExternalSyntheticLambda1(TextResource textResource, Function1 function1, TextStyle textStyle, Modifier modifier, Map map, int i, int i2, int i3, int i4) {
        this.f$1 = textResource;
        this.f$2 = function1;
        this.f$3 = textStyle;
        this.f$0 = modifier;
        this.f$6 = map;
        this.f$4 = i;
        this.f$5 = i2;
        this.f$7 = i3;
        this.f$8 = i4;
    }
}
