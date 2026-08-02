package app.cash.broadway.presenter.molecule;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;
import app.cash.molecule.AndroidUiDispatcher;
import bo.app.u4$$ExternalSyntheticLambda0;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public abstract class MoleculePresenterKt {
    public static final StaticProvidableCompositionLocal LocalPlacement = new StaticProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(29));
    public static final StaticProvidableCompositionLocal LocalActivityLifecycleOwner = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(1));
    public static final StaticProvidableCompositionLocal LocalPresenterLifecycleOwner = new StaticProvidableCompositionLocal(new u4$$ExternalSyntheticLambda0(2));

    public static MoleculePresenterKt$asPresenter$1 asPresenter$default(MoleculePresenter moleculePresenter) {
        CoroutineContext coroutineContext = (CoroutineContext) AndroidUiDispatcher.Main$delegate.getValue();
        moleculePresenter.getClass();
        coroutineContext.getClass();
        return new MoleculePresenterKt$asPresenter$1(moleculePresenter, coroutineContext);
    }
}
