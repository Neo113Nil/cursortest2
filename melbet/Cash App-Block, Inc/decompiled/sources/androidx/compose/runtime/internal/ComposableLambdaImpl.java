package androidx.compose.runtime.internal;

import androidx.compose.animation.core.Transition$$ExternalSyntheticLambda2;
import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda7;
import com.squareup.cash.offers.views.OffersSearchViewKt$$ExternalSyntheticLambda6;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes.dex */
public final class ComposableLambdaImpl implements Function2, Function3, Function4, Function5, Function6, Function7, Function8, Function9, Function10, Function11, Function13, Function14, Function15, Function16, Function17, Function18, Function19, Function20, Function21 {
    public Object _block;
    public final int key;
    public RecomposeScopeImpl scope;
    public ArrayList scopes;
    public final boolean tracked;

    public ComposableLambdaImpl(Object obj, boolean z, int i) {
        this.key = i;
        this.tracked = z;
        this._block = obj;
    }

    public final Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, final Object obj5, final Object obj6, final Object obj7, final Object obj8, final Object obj9, final Object obj10, final Object obj11, final Object obj12, Composer composer, final int i, final int i2) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(this.key);
        trackRead(gapComposer);
        int bitsForSlot = gapComposer.changed(this) ? Expect_jvmKt.bitsForSlot(2, 12) : Expect_jvmKt.bitsForSlot(1, 12);
        Object obj13 = this._block;
        obj13.getClass();
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(15, obj13);
        Object invoke = ((Function15) obj13).invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, gapComposer, Integer.valueOf(i), Integer.valueOf(i2 | bitsForSlot));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj14, Object obj15) {
                    ((Integer) obj15).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i) | 1;
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, (Composer) obj14, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
        return invoke;
    }

    public final void trackRead(Composer composer) {
        RecomposeScopeImpl currentRecomposeScope$runtime;
        if (!this.tracked || (currentRecomposeScope$runtime = ((GapComposer) composer).getCurrentRecomposeScope$runtime()) == null) {
            return;
        }
        currentRecomposeScope$runtime.flags |= 1;
        RecomposeScopeImpl recomposeScopeImpl = this.scope;
        if (recomposeScopeImpl == null || !recomposeScopeImpl.getValid() || recomposeScopeImpl == currentRecomposeScope$runtime || Intrinsics.areEqual(recomposeScopeImpl.anchor, currentRecomposeScope$runtime.anchor)) {
            this.scope = currentRecomposeScope$runtime;
            return;
        }
        ArrayList arrayList = this.scopes;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.scopes = arrayList2;
            arrayList2.add(currentRecomposeScope$runtime);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            if (recomposeScopeImpl2 == null || !recomposeScopeImpl2.getValid() || recomposeScopeImpl2 == currentRecomposeScope$runtime || Intrinsics.areEqual(recomposeScopeImpl2.anchor, currentRecomposeScope$runtime.anchor)) {
                arrayList.set(i, currentRecomposeScope$runtime);
                return;
            }
        }
        arrayList.add(currentRecomposeScope$runtime);
    }

    public final void update(Function function) {
        if (Intrinsics.areEqual(this._block, function)) {
            return;
        }
        boolean z = this._block == null;
        this._block = function;
        if (z || !this.tracked) {
            return;
        }
        RecomposeScopeImpl recomposeScopeImpl = this.scope;
        if (recomposeScopeImpl != null) {
            CompositionImpl compositionImpl = recomposeScopeImpl.owner;
            if (compositionImpl != null) {
                compositionImpl.invalidate(recomposeScopeImpl, null);
            }
            this.scope = null;
        }
        ArrayList arrayList = this.scopes;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
                CompositionImpl compositionImpl2 = recomposeScopeImpl2.owner;
                if (compositionImpl2 != null) {
                    compositionImpl2.invalidate(recomposeScopeImpl2, null);
                }
            }
            arrayList.clear();
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke(obj, obj2, (Composer) obj3, ((Number) obj4).intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke(obj, obj2, obj3, (Composer) obj4, ((Number) obj5).intValue());
    }

    @Override // kotlin.jvm.functions.Function6
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke(obj, obj2, obj3, obj4, (Composer) obj5, ((Number) obj6).intValue());
    }

    @Override // kotlin.jvm.functions.Function7
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return invoke(obj, obj2, obj3, obj4, obj5, (Composer) obj6, ((Number) serializable).intValue());
    }

    @Override // kotlin.jvm.functions.Function8
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Serializable serializable) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, (Composer) obj7, ((Number) serializable).intValue());
    }

    @Override // kotlin.jvm.functions.Function15
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Serializable serializable) {
        return invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, (Composer) obj13, ((Number) obj14).intValue(), ((Number) serializable).intValue());
    }

    public final Object invoke(Composer composer, int i) {
        int bitsForSlot;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(this.key);
        trackRead(gapComposer);
        if (gapComposer.changed(this)) {
            bitsForSlot = Expect_jvmKt.bitsForSlot(2, 0);
        } else {
            bitsForSlot = Expect_jvmKt.bitsForSlot(1, 0);
        }
        int i2 = i | bitsForSlot;
        Object obj = this._block;
        obj.getClass();
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(2, obj);
        Object invoke = ((Function2) obj).invoke(gapComposer, Integer.valueOf(i2));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposableLambdaImpl$invoke$1(2, 8, ComposableLambdaImpl.class, this, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;");
        }
        return invoke;
    }

    public final Object invoke(Object obj, Composer composer, int i) {
        int bitsForSlot;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(this.key);
        trackRead(gapComposer);
        if (gapComposer.changed(this)) {
            bitsForSlot = Expect_jvmKt.bitsForSlot(2, 1);
        } else {
            bitsForSlot = Expect_jvmKt.bitsForSlot(1, 1);
        }
        Object obj2 = this._block;
        obj2.getClass();
        int i2 = 3;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, obj2);
        Object invoke = ((Function3) obj2).invoke(obj, gapComposer, Integer.valueOf(bitsForSlot | i));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Transition$$ExternalSyntheticLambda2(this, obj, i, i2);
        }
        return invoke;
    }

    public final Object invoke(Object obj, Object obj2, Composer composer, int i) {
        int bitsForSlot;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(this.key);
        trackRead(gapComposer);
        if (gapComposer.changed(this)) {
            bitsForSlot = Expect_jvmKt.bitsForSlot(2, 2);
        } else {
            bitsForSlot = Expect_jvmKt.bitsForSlot(1, 2);
        }
        Object obj3 = this._block;
        obj3.getClass();
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(4, obj3);
        Object invoke = ((Function4) obj3).invoke(obj, obj2, gapComposer, Integer.valueOf(bitsForSlot | i));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleEffectKt$$ExternalSyntheticLambda7(this, obj, obj2, i, 1);
        }
        return invoke;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Composer composer, int i) {
        int bitsForSlot;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(this.key);
        trackRead(gapComposer);
        if (gapComposer.changed(this)) {
            bitsForSlot = Expect_jvmKt.bitsForSlot(2, 3);
        } else {
            bitsForSlot = Expect_jvmKt.bitsForSlot(1, 3);
        }
        Object obj4 = this._block;
        obj4.getClass();
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(5, obj4);
        Object invoke = ((Function5) obj4).invoke(obj, obj2, obj3, gapComposer, Integer.valueOf(bitsForSlot | i));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(this, obj, obj2, obj3, i);
        }
        return invoke;
    }

    public final Object invoke(final Object obj, final Object obj2, final Object obj3, final Object obj4, Composer composer, final int i) {
        int bitsForSlot;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(this.key);
        trackRead(gapComposer);
        if (gapComposer.changed(this)) {
            bitsForSlot = Expect_jvmKt.bitsForSlot(2, 4);
        } else {
            bitsForSlot = Expect_jvmKt.bitsForSlot(1, 4);
        }
        Object obj5 = this._block;
        obj5.getClass();
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(6, obj5);
        Object invoke = ((Function6) obj5).invoke(obj, obj2, obj3, obj4, gapComposer, Integer.valueOf(bitsForSlot | i));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.compose.runtime.internal.ComposableLambdaImpl$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    ComposableLambdaImpl.this.invoke(obj, obj2, obj3, obj4, (Composer) obj6, Updater.updateChangedFlags(i) | 1);
                    return Unit.INSTANCE;
                }
            };
        }
        return invoke;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Composer composer, int i) {
        int bitsForSlot;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(this.key);
        trackRead(gapComposer);
        if (gapComposer.changed(this)) {
            bitsForSlot = Expect_jvmKt.bitsForSlot(2, 5);
        } else {
            bitsForSlot = Expect_jvmKt.bitsForSlot(1, 5);
        }
        Object obj6 = this._block;
        obj6.getClass();
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(7, obj6);
        Object invoke = ((Function7) obj6).invoke(obj, obj2, obj3, obj4, obj5, gapComposer, Integer.valueOf(i | bitsForSlot));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OffersSearchViewKt$$ExternalSyntheticLambda6(this, obj, obj2, obj3, obj4, obj5, i, 1);
        }
        return invoke;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Composer composer, int i) {
        int bitsForSlot;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(this.key);
        trackRead(gapComposer);
        if (gapComposer.changed(this)) {
            bitsForSlot = Expect_jvmKt.bitsForSlot(2, 6);
        } else {
            bitsForSlot = Expect_jvmKt.bitsForSlot(1, 6);
        }
        Object obj7 = this._block;
        obj7.getClass();
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(8, obj7);
        Object invoke = ((Function8) obj7).invoke(obj, obj2, obj3, obj4, obj5, obj6, gapComposer, Integer.valueOf(i | bitsForSlot));
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(this, obj, obj2, obj3, obj4, obj5, obj6, i);
        }
        return invoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((Composer) obj, ((Number) obj2).intValue());
    }
}
