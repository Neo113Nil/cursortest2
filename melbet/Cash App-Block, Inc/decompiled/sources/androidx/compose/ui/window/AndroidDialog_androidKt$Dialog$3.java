package androidx.compose.ui.window;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import com.squareup.cash.presenters.AliasFormatter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class AndroidDialog_androidKt$Dialog$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ Object $onDismissRequest;
    public final /* synthetic */ Object $properties;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidDialog_androidKt$Dialog$3(Object obj, Object obj2, Function2 function2, int i, int i2) {
        super(2);
        this.$r8$classId = i2;
        this.$onDismissRequest = obj;
        this.$properties = obj2;
        this.$content = function2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.$$changed;
        Function2 function2 = this.$content;
        Object obj3 = this.$properties;
        Object obj4 = this.$onDismissRequest;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                AliasFormatter.Dialog((Function0) obj4, (DialogProperties) obj3, (ComposableLambdaImpl) function2, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                RulerKt.SubcomposeLayout((SubcomposeLayoutState) obj4, (Modifier) obj3, function2, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
