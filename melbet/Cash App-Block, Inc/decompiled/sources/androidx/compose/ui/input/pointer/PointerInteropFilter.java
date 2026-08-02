package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;
import androidx.datastore.core.SimpleActor;
import kotlin.jvm.functions.Function1;
import retrofit2.KotlinExtensions$await$2$1;

/* loaded from: classes.dex */
public final class PointerInteropFilter implements Modifier.Element {
    public boolean disallowIntercept;
    public Function1 onTouchEvent;
    public final SimpleActor pointerInputFilter = new SimpleActor(this);
    public KotlinExtensions$await$2$1 requestDisallowInterceptTouchEvent;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DispatchToViewState {
        public static final /* synthetic */ DispatchToViewState[] $VALUES;
        public static final DispatchToViewState Dispatching;
        public static final DispatchToViewState NotDispatching;
        public static final DispatchToViewState Unknown;

        static {
            DispatchToViewState dispatchToViewState = new DispatchToViewState("Unknown", 0);
            Unknown = dispatchToViewState;
            DispatchToViewState dispatchToViewState2 = new DispatchToViewState("Dispatching", 1);
            Dispatching = dispatchToViewState2;
            DispatchToViewState dispatchToViewState3 = new DispatchToViewState("NotDispatching", 2);
            NotDispatching = dispatchToViewState3;
            $VALUES = new DispatchToViewState[]{dispatchToViewState, dispatchToViewState2, dispatchToViewState3};
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) $VALUES.clone();
        }
    }
}
