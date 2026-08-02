package app.cash.broadway.presenter.molecule;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.room.InvalidationTracker$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class AnswersKt {
    public static final StaticProvidableCompositionLocal LocalAnswerDispatcher = new StaticProvidableCompositionLocal(new InvalidationTracker$$ExternalSyntheticLambda0(28));

    public static final StaticProvidableCompositionLocal getLocalAnswerDispatcher() {
        return LocalAnswerDispatcher;
    }
}
