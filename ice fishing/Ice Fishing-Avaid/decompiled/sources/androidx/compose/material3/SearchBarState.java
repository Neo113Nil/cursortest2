package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.material3.SearchBarState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: SearchBar.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;Bi\b\u0002\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\f\u0010\rB-\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\f\u0010\u0010BI\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\f\u0010\u0011J\u000e\u00104\u001a\u000205H\u0086@¢\u0006\u0002\u00106J\u000e\u00107\u001a\u000205H\u0086@¢\u0006\u0002\u00106J\u0016\u00108\u001a\u0002052\u0006\u00109\u001a\u00020\u0004H\u0086@¢\u0006\u0002\u0010:R \u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\bX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR/\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0017\u001a\u0004\u0018\u00010 8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010'\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0011\u0010,\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b,\u0010\u001bR\u0011\u0010-\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001b\u00100\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b1\u0010/¨\u0006<"}, d2 = {"Landroidx/compose/material3/SearchBarState;", "", "animatable", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "contentAnimatable", "animationSpecForExpand", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpecForCollapse", "animationSpecForContentFadeIn", "animationSpecForContentFadeOut", "<init>", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "initialValue", "Landroidx/compose/material3/SearchBarValue;", "(Landroidx/compose/material3/SearchBarValue;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "(Landroidx/compose/material3/SearchBarValue;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/AnimationSpec;)V", "getAnimatable$material3", "()Landroidx/compose/animation/core/Animatable;", "getAnimationSpecForExpand$material3", "()Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpecForCollapse$material3", "<set-?>", "", "expandsToFullScreen", "getExpandsToFullScreen$material3", "()Z", "setExpandsToFullScreen$material3", "(Z)V", "expandsToFullScreen$delegate", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "collapsedCoords", "getCollapsedCoords", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "setCollapsedCoords", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "collapsedCoords$delegate", NotificationCompat.CATEGORY_PROGRESS, "getProgress", "()F", "contentProgress", "getContentProgress$material3", "isAnimating", "targetValue", "getTargetValue", "()Landroidx/compose/material3/SearchBarValue;", "currentValue", "getCurrentValue", "currentValue$delegate", "Landroidx/compose/runtime/State;", "animateToExpanded", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToCollapsed", "snapTo", "fraction", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public final class SearchBarState {
    public static final int $stable = 0;
    private static final float Collapsed = 0.0f;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float Expanded = 1.0f;
    private final Animatable<Float, AnimationVector1D> animatable;
    private final AnimationSpec<Float> animationSpecForCollapse;
    private final AnimationSpec<Float> animationSpecForContentFadeIn;
    private final AnimationSpec<Float> animationSpecForContentFadeOut;
    private final AnimationSpec<Float> animationSpecForExpand;

    /* renamed from: collapsedCoords$delegate, reason: from kotlin metadata */
    private final MutableState collapsedCoords;
    private final Animatable<Float, AnimationVector1D> contentAnimatable;

    /* renamed from: currentValue$delegate, reason: from kotlin metadata */
    private final State currentValue;

    /* renamed from: expandsToFullScreen$delegate, reason: from kotlin metadata */
    private final MutableState expandsToFullScreen;

    public /* synthetic */ SearchBarState(Animatable animatable, Animatable animatable2, AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, AnimationSpec animationSpec4, DefaultConstructorMarker defaultConstructorMarker) {
        this(animatable, animatable2, animationSpec, animationSpec2, animationSpec3, animationSpec4);
    }

    private SearchBarState(Animatable<Float, AnimationVector1D> animatable, Animatable<Float, AnimationVector1D> animatable2, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, AnimationSpec<Float> animationSpec3, AnimationSpec<Float> animationSpec4) {
        this.animatable = animatable;
        this.contentAnimatable = animatable2;
        this.animationSpecForExpand = animationSpec;
        this.animationSpecForCollapse = animationSpec2;
        this.animationSpecForContentFadeIn = animationSpec3;
        this.animationSpecForContentFadeOut = animationSpec4;
        this.expandsToFullScreen = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.collapsedCoords = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: androidx.compose.material3.SearchBarState$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SearchBarValue currentValue_delegate$lambda$0;
                currentValue_delegate$lambda$0 = SearchBarState.currentValue_delegate$lambda$0(SearchBarState.this);
                return currentValue_delegate$lambda$0;
            }
        });
    }

    public final Animatable<Float, AnimationVector1D> getAnimatable$material3() {
        return this.animatable;
    }

    public final AnimationSpec<Float> getAnimationSpecForExpand$material3() {
        return this.animationSpecForExpand;
    }

    public final AnimationSpec<Float> getAnimationSpecForCollapse$material3() {
        return this.animationSpecForCollapse;
    }

    public SearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2) {
        this(AnimatableKt.Animatable$default(searchBarValue == SearchBarValue.Expanded ? 1.0f : 0.0f, 0.0f, 2, null), AnimatableKt.Animatable$default(searchBarValue != SearchBarValue.Expanded ? 0.0f : 1.0f, 0.0f, 2, null), animationSpec, animationSpec2, AnimationSpecKt.snap$default(0, 1, null), AnimationSpecKt.snap$default(0, 1, null));
    }

    public SearchBarState(SearchBarValue searchBarValue, AnimationSpec<Float> animationSpec, AnimationSpec<Float> animationSpec2, AnimationSpec<Float> animationSpec3, AnimationSpec<Float> animationSpec4) {
        this(AnimatableKt.Animatable$default(searchBarValue == SearchBarValue.Expanded ? 1.0f : 0.0f, 0.0f, 2, null), AnimatableKt.Animatable$default(searchBarValue != SearchBarValue.Expanded ? 0.0f : 1.0f, 0.0f, 2, null), animationSpec, animationSpec2, animationSpec3, animationSpec4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getExpandsToFullScreen$material3() {
        return ((Boolean) this.expandsToFullScreen.getValue()).booleanValue();
    }

    public final void setExpandsToFullScreen$material3(boolean z) {
        this.expandsToFullScreen.setValue(Boolean.valueOf(z));
    }

    public final LayoutCoordinates getCollapsedCoords() {
        return (LayoutCoordinates) this.collapsedCoords.getValue();
    }

    public final void setCollapsedCoords(LayoutCoordinates layoutCoordinates) {
        this.collapsedCoords.setValue(layoutCoordinates);
    }

    public final float getProgress() {
        return RangesKt.coerceIn(this.animatable.getValue().floatValue(), 0.0f, 1.0f);
    }

    public final float getContentProgress$material3() {
        return RangesKt.coerceIn(this.contentAnimatable.getValue().floatValue(), 0.0f, 1.0f);
    }

    public final boolean isAnimating() {
        return this.animatable.isRunning();
    }

    public final SearchBarValue getTargetValue() {
        if (this.animatable.getTargetValue().floatValue() == 1.0f) {
            return SearchBarValue.Expanded;
        }
        return SearchBarValue.Collapsed;
    }

    public final SearchBarValue getCurrentValue() {
        return (SearchBarValue) this.currentValue.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SearchBarValue currentValue_delegate$lambda$0(SearchBarState searchBarState) {
        if (searchBarState.animatable.getValue().floatValue() <= 0.02f) {
            return SearchBarValue.Collapsed;
        }
        return SearchBarValue.Expanded;
    }

    public final Object animateToExpanded(Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new SearchBarState$animateToExpanded$2(this, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    public final Object animateToCollapsed(Continuation<? super Unit> continuation) {
        Object coroutineScope = CoroutineScopeKt.coroutineScope(new SearchBarState$animateToCollapsed$2(this, null), continuation);
        return coroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : Unit.INSTANCE;
    }

    public final Object snapTo(float f, Continuation<? super Unit> continuation) {
        Object snapTo = this.animatable.snapTo(Boxing.boxFloat(f), continuation);
        return snapTo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo : Unit.INSTANCE;
    }

    /* compiled from: SearchBar.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJH\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/SearchBarState$Companion;", "", "<init>", "()V", "Collapsed", "", "Expanded", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SearchBarState;", "animationSpecForExpand", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpecForCollapse", "animationSpecForContentFadeIn", "animationSpecForContentFadeOut", "material3"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<SearchBarState, ?> Saver(final AnimationSpec<Float> animationSpecForExpand, final AnimationSpec<Float> animationSpecForCollapse) {
            return ListSaverKt.listSaver(new Function2() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    List Saver$lambda$0;
                    Saver$lambda$0 = SearchBarState.Companion.Saver$lambda$0((SaverScope) obj, (SearchBarState) obj2);
                    return Saver$lambda$0;
                }
            }, new Function1() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SearchBarState Saver$lambda$1;
                    Saver$lambda$1 = SearchBarState.Companion.Saver$lambda$1(AnimationSpec.this, animationSpecForCollapse, (List) obj);
                    return Saver$lambda$1;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$0(SaverScope saverScope, SearchBarState searchBarState) {
            return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(searchBarState.getProgress()), Float.valueOf(searchBarState.getContentProgress$material3())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchBarState Saver$lambda$1(AnimationSpec animationSpec, AnimationSpec animationSpec2, List list) {
            return new SearchBarState(new Animatable(list.get(0), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null), new Animatable(list.get(1), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null), animationSpec, animationSpec2, AnimationSpecKt.snap$default(0, 1, null), AnimationSpecKt.snap$default(0, 1, null), null);
        }

        public final Saver<SearchBarState, ?> Saver(final AnimationSpec<Float> animationSpecForExpand, final AnimationSpec<Float> animationSpecForCollapse, final AnimationSpec<Float> animationSpecForContentFadeIn, final AnimationSpec<Float> animationSpecForContentFadeOut) {
            return ListSaverKt.listSaver(new Function2() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    List Saver$lambda$2;
                    Saver$lambda$2 = SearchBarState.Companion.Saver$lambda$2((SaverScope) obj, (SearchBarState) obj2);
                    return Saver$lambda$2;
                }
            }, new Function1() { // from class: androidx.compose.material3.SearchBarState$Companion$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SearchBarState Saver$lambda$3;
                    Saver$lambda$3 = SearchBarState.Companion.Saver$lambda$3(AnimationSpec.this, animationSpecForCollapse, animationSpecForContentFadeIn, animationSpecForContentFadeOut, (List) obj);
                    return Saver$lambda$3;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List Saver$lambda$2(SaverScope saverScope, SearchBarState searchBarState) {
            return CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(searchBarState.getProgress()), Float.valueOf(searchBarState.getContentProgress$material3())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SearchBarState Saver$lambda$3(AnimationSpec animationSpec, AnimationSpec animationSpec2, AnimationSpec animationSpec3, AnimationSpec animationSpec4, List list) {
            return new SearchBarState(new Animatable(list.get(0), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null), new Animatable(list.get(1), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), null, null, 12, null), animationSpec, animationSpec2, animationSpec3, animationSpec4, null);
        }
    }
}
