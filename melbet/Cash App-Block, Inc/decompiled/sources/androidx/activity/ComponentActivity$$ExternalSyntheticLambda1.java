package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.navigationevent.DirectNavigationEventInput;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ComponentActivity$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ComponentActivity f$0;

    public /* synthetic */ ComponentActivity$$ExternalSyntheticLambda1(ComponentActivity componentActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = componentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ComponentActivity componentActivity = this.f$0;
        switch (i) {
            case 0:
                return ComponentActivity.$r8$lambda$Xj9c8VIP9DfEvaTmZt0ejAuC4a4(componentActivity);
            case 1:
                int i2 = ComponentActivity.$r8$clinit;
                componentActivity.reportFullyDrawn();
                return Unit.INSTANCE;
            case 2:
                int i3 = ComponentActivity.$r8$clinit;
                DirectNavigationEventInput directNavigationEventInput = new DirectNavigationEventInput();
                componentActivity.getNavigationEventDispatcher().addInput(directNavigationEventInput);
                return directNavigationEventInput;
            case 3:
                int i4 = ComponentActivity.$r8$clinit;
                return new SavedStateViewModelFactory(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
            default:
                int i5 = ComponentActivity.$r8$clinit;
                int i6 = 1;
                OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new ComponentActivity$$ExternalSyntheticLambda0(componentActivity, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        componentActivity.getLifecycle().addObserver(new ComponentActivity$$ExternalSyntheticLambda12(onBackPressedDispatcher, componentActivity));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new MainActivity$$ExternalSyntheticLambda8(i6, componentActivity, onBackPressedDispatcher));
                    }
                }
                return onBackPressedDispatcher;
        }
    }
}
