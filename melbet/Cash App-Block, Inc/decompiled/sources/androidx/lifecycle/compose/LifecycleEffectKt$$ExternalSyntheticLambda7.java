package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.LifecycleOwner;
import app.cash.molecule.PlatformKt;
import coil3.size.DimensionKt;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class LifecycleEffectKt$$ExternalSyntheticLambda7 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ LifecycleEffectKt$$ExternalSyntheticLambda7(TouchRecorder touchRecorder, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 4;
        this.f$0 = touchRecorder;
        this.f$1 = modifier;
        this.f$2 = composableLambdaImpl;
        this.f$3 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Object obj3 = this.f$2;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                DimensionKt.LifecycleStartEffectImpl((LifecycleOwner) obj5, (LifecycleStartStopEffectScope) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((ComposableLambdaImpl) obj5).invoke(obj4, obj3, (Composer) obj, Updater.updateChangedFlags(i2) | 1);
                break;
            case 2:
                ((Integer) obj2).getClass();
                ((SaveableStateHolderImpl) obj5).SaveableStateProvider(obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                PlatformKt.RegisterAlias((Function1) obj3, (RegisterAliasViewModel) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                Strings.TouchRecordingLayout((TouchRecorder) obj5, (Modifier) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(393), this.f$3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LifecycleEffectKt$$ExternalSyntheticLambda7(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = i;
    }

    public /* synthetic */ LifecycleEffectKt$$ExternalSyntheticLambda7(Function1 function1, RegisterAliasViewModel registerAliasViewModel, Modifier modifier, int i) {
        this.$r8$classId = 3;
        this.f$2 = function1;
        this.f$0 = registerAliasViewModel;
        this.f$1 = modifier;
        this.f$3 = i;
    }
}
