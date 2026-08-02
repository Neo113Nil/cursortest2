package androidx.compose.ui.platform;

import androidx.savedstate.SavedStateRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends Lambda implements Function0 {
    public final /* synthetic */ SavedStateRegistry $androidxRegistry;
    public final /* synthetic */ String $key;
    public final /* synthetic */ boolean $registered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.$registered = z;
        this.$androidxRegistry = savedStateRegistry;
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.$registered) {
            this.$androidxRegistry.unregisterSavedStateProvider(this.$key);
        }
        return Unit.INSTANCE;
    }
}
