package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import com.datadog.android.rum.Rum$createMonitor$1;
import com.plaid.internal.P5$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {
    public Handler handler;
    public final SnapshotStateObserver observer;
    public final ConstraintSetForInlineDsl$observer$1 onCommitAffectingConstrainLambdas;
    public final ConstraintLayoutScope scope;
    public boolean knownDirty = true;
    public final ArrayList previousDatas = new ArrayList();

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.constraintlayout.compose.ConstraintSetForInlineDsl$observer$1] */
    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        this.scope = constraintLayoutScope;
        final int i = 0;
        this.observer = new SnapshotStateObserver(new Function1(this) { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$observer$1
            public final /* synthetic */ ConstraintSetForInlineDsl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = i;
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this.this$0;
                switch (i2) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            function0.invoke();
                        } else {
                            Handler handler = constraintSetForInlineDsl.handler;
                            if (handler == null) {
                                handler = new Handler(Looper.getMainLooper());
                                constraintSetForInlineDsl.handler = handler;
                            }
                            handler.post(new P5$$ExternalSyntheticLambda0(4, function0));
                        }
                        break;
                    default:
                        constraintSetForInlineDsl.knownDirty = true;
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        final int i2 = 1;
        this.onCommitAffectingConstrainLambdas = new Function1(this) { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$observer$1
            public final /* synthetic */ ConstraintSetForInlineDsl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i22 = i2;
                ConstraintSetForInlineDsl constraintSetForInlineDsl = this.this$0;
                switch (i22) {
                    case 0:
                        Function0 function0 = (Function0) obj;
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            function0.invoke();
                        } else {
                            Handler handler = constraintSetForInlineDsl.handler;
                            if (handler == null) {
                                handler = new Handler(Looper.getMainLooper());
                                constraintSetForInlineDsl.handler = handler;
                            }
                            handler.post(new P5$$ExternalSyntheticLambda0(4, function0));
                        }
                        break;
                    default:
                        constraintSetForInlineDsl.knownDirty = true;
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final void applyTo(State state, List list) {
        this.previousDatas.clear();
        this.observer.observeReads(Unit.INSTANCE, this.onCommitAffectingConstrainLambdas, new Rum$createMonitor$1(1, list, this, state));
        this.knownDirty = false;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public final boolean isDirty(List list) {
        if (this.knownDirty) {
            return true;
        }
        int size = list.size();
        ArrayList arrayList = this.previousDatas;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            Object parentData = ((Measurable) list.get(i)).getParentData();
            if (!Intrinsics.areEqual(parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null, arrayList.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        SnapshotStateObserver snapshotStateObserver = this.observer;
        snapshotStateObserver.stop();
        snapshotStateObserver.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.observer.start();
    }
}
