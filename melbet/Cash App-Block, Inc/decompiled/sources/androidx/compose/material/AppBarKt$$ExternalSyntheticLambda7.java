package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.squareup.cash.common.composeui.VisibleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class AppBarKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ComposableLambdaImpl f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ long f$4;
    public final /* synthetic */ long f$5;
    public final /* synthetic */ float f$6;

    public /* synthetic */ AppBarKt$$ExternalSyntheticLambda7(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function2 function2, ComposableLambdaImpl composableLambdaImpl2, long j, long j2, float f, int i) {
        this.f$0 = composableLambdaImpl;
        this.f$1 = modifier;
        this.f$2 = function2;
        this.f$3 = composableLambdaImpl2;
        this.f$4 = j;
        this.f$5 = j2;
        this.f$6 = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$2;
        Object obj4 = this.f$3;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1575943);
                AppBarKt.m463TopAppBarxWeB9s(this.f$0, this.f$1, (Function2) obj3, (ComposableLambdaImpl) obj4, this.f$4, this.f$5, this.f$6, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(24577);
                VisibleKt.m3487DrawerViewWe2iE6E(this.f$1, (String) obj4, (TextStyle) obj3, this.f$4, this.f$0, this.f$5, this.f$6, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AppBarKt$$ExternalSyntheticLambda7(Modifier modifier, String str, TextStyle textStyle, long j, ComposableLambdaImpl composableLambdaImpl, long j2, float f, int i) {
        this.f$1 = modifier;
        this.f$3 = str;
        this.f$2 = textStyle;
        this.f$4 = j;
        this.f$0 = composableLambdaImpl;
        this.f$5 = j2;
        this.f$6 = f;
    }
}
