package app.cash.broadway.presenter;

import androidx.lifecycle.LifecycleOwner;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt$asPresenter$1;
import app.cash.broadway.screen.Answer;
import kotlin.collections.EmptyMap;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public interface Presenter {

    public interface Binding {
        StateFlow getModels();

        void sendAnswer(Answer answer);

        void sendEvent(Object obj);
    }

    public interface LifecycleBinding {
    }

    public interface PlaceableBinding {
    }

    public interface RenavigationBinding {
    }

    public interface SwipeBinding {
    }

    static Binding start$default(MoleculePresenterKt$asPresenter$1 moleculePresenterKt$asPresenter$1, CoroutineScope coroutineScope, LifecycleOwner lifecycleOwner) {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return moleculePresenterKt$asPresenter$1.start(coroutineScope, lifecycleOwner, null, new SavedState(emptyMap));
    }

    default SavedState saveState() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return new SavedState(emptyMap);
    }

    Binding start(CoroutineScope coroutineScope, LifecycleOwner lifecycleOwner, Answer answer, SavedState savedState);
}
