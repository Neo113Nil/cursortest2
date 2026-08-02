package androidx.room;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.activity.compose.LocalFullyDrawnReporterOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.collection.internal.Lock;
import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.OverscrollConfiguration;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProviderKt;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.material.RippleConfiguration;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.retain.ForgetfulRetainedValuesStore;
import androidx.compose.runtime.retain.LocalRetainedValuesStoreKt;
import androidx.compose.runtime.saveable.SaveableStateHolderImpl;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.graphics.Color;
import androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.cash.broadway.presenter.Placement;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.random.Random;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes.dex */
public final /* synthetic */ class InvalidationTracker$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ InvalidationTracker$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class<?> returnType;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Unit.INSTANCE;
            case 2:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = LocalFullyDrawnReporterOwner.LocalFullyDrawnReporterOwner;
                return null;
            case 3:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = LocalOnBackPressedDispatcherOwner.LocalOnBackPressedDispatcherOwner;
                return null;
            case 4:
                Random.Default.getClass();
                return Integer.valueOf(Random.defaultRandom.nextInt(2147418112) + 65536);
            case 5:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal3 = IndicationKt.LocalIndication;
                return DefaultDebugIndication.INSTANCE;
            case 6:
                return new OverscrollConfiguration();
            case 7:
                return new ScrollState(0);
            case 9:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = BasicText_androidKt.LocalBackgroundTextMeasurementExecutor;
            case 8:
                return null;
            case 10:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal4 = TextContextMenuProviderKt.LocalTextContextMenuDropdownProvider;
                return null;
            case 11:
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                return DefaultIoScheduler.INSTANCE;
            case 12:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal5 = SelectionRegistrarKt.LocalSelectionRegistrar;
                return null;
            case 13:
                return new RippleConfiguration(Color.Unspecified, null);
            case 14:
                ComposerKt.composeRuntimeError("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 15:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 16:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = LocalRetainedValuesStoreKt.LocalRetainedValuesStore;
                return ForgetfulRetainedValuesStore.INSTANCE;
            case 17:
                return new SaveableStateHolderImpl(new LinkedHashMap());
            case 18:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = SaveableStateRegistryKt.LocalSaveableStateRegistry;
                return null;
            case 19:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal4 = InspectionTablesKt.LocalInspectionTables;
                return null;
            case 20:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 21:
                DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal6 = LocalNavigationEventDispatcherOwner.LocalNavigationEventDispatcherOwner;
                return null;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Boolean.TRUE;
            case 24:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 25:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 26:
                try {
                    String[] strArr = FrameworkSQLiteDatabase.CONFLICT_VALUES;
                    Method method = (Method) FrameworkSQLiteDatabase.getThreadSessionMethod$delegate.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 27:
                return new Lock(i);
            case 28:
                throw new IllegalStateException("LocalAnswerDispatcher is only available when being executed by Broadway or under test using MoleculePresenter#test.");
            default:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal5 = MoleculePresenterKt.LocalPlacement;
                return Placement.Foreground.INSTANCE;
        }
    }

    public /* synthetic */ InvalidationTracker$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
    }
}
