package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.FlexBoxScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: FlexBox.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/FlexBoxScopeInstance;", "Landroidx/compose/foundation/layout/FlexBoxScope;", "<init>", "()V", "flex", "Landroidx/compose/ui/Modifier;", "flexConfig", "Landroidx/compose/foundation/layout/FlexConfig;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class FlexBoxScopeInstance implements FlexBoxScope {
    public static final int $stable = 0;
    public static final FlexBoxScopeInstance INSTANCE = new FlexBoxScopeInstance();

    @Override // androidx.compose.foundation.layout.FlexBoxScope
    public /* synthetic */ Modifier flex(Modifier modifier, Function1 function1) {
        return FlexBoxScope.CC.$default$flex(this, modifier, function1);
    }

    private FlexBoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.FlexBoxScope
    public Modifier flex(Modifier modifier, FlexConfig flexConfig) {
        return modifier.then(new FlexBoxChildElement(flexConfig));
    }
}
