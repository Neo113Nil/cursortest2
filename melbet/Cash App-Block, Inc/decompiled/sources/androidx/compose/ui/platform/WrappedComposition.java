package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.node.Owner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.squareup.cash.R;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class WrappedComposition implements Composition, LifecycleEventObserver {
    public Lifecycle addedToLifecycle;
    public boolean disposed;
    public Function2 lastContent = ComposableSingletons$Wrapper_androidKt.f10lambda$1759434350;
    public final CompositionImpl original;
    public final AndroidComposeView owner;

    public WrappedComposition(AndroidComposeView androidComposeView, CompositionImpl compositionImpl) {
        this.owner = androidComposeView;
        this.original = compositionImpl;
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.owner.setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.addedToLifecycle;
            if (lifecycle != null) {
                lifecycle.removeObserver(this);
            }
            this.addedToLifecycle = null;
        }
        this.original.dispose();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.disposed) {
                return;
            }
            setContent(this.lastContent);
        }
    }

    public final void setContent(final Function2 function2) {
        this.owner.setOnReadyForComposition(new Function1() { // from class: androidx.compose.ui.platform.WrappedComposition$setContent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ComposeViewContext composeViewContext = (ComposeViewContext) obj;
                WrappedComposition wrappedComposition = WrappedComposition.this;
                if (!wrappedComposition.disposed) {
                    LifecycleOwner lifecycleOwner = composeViewContext.lifecycleOwner;
                    View view = composeViewContext.view;
                    Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                    Function2 function22 = function2;
                    wrappedComposition.lastContent = function22;
                    if (wrappedComposition.addedToLifecycle == null) {
                        if (Intrinsics.areEqual(Looper.myLooper(), view.getHandler().getLooper())) {
                            wrappedComposition.addedToLifecycle = lifecycle;
                            lifecycle.addObserver(wrappedComposition);
                        } else {
                            view.post(new MainActivity$$ExternalSyntheticLambda8(3, wrappedComposition, lifecycle));
                        }
                    } else if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                        wrappedComposition.original.setContent(new ComposableLambdaImpl(new AnonymousClass2(wrappedComposition, composeViewContext, function22), true, -1723985096));
                    }
                }
                return Unit.INSTANCE;
            }

            /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends Lambda implements Function2 {
                public final /* synthetic */ Object $composeViewContext;
                public final /* synthetic */ Function2 $content;
                public final /* synthetic */ int $r8$classId = 1;
                public final /* synthetic */ Object this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Owner owner, UriHandler uriHandler, Function2 function2, int i) {
                    super(2);
                    this.this$0 = owner;
                    this.$composeViewContext = uriHandler;
                    this.$content = function2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i = this.$r8$classId;
                    Function2 function2 = this.$content;
                    Object obj3 = this.$composeViewContext;
                    Object obj4 = this.this$0;
                    int i2 = 1;
                    switch (i) {
                        case 0:
                            Composer composer = (Composer) obj;
                            int intValue = ((Number) obj2).intValue();
                            WrappedComposition wrappedComposition = (WrappedComposition) obj4;
                            int i3 = 0;
                            GapComposer gapComposer = (GapComposer) composer;
                            if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                AndroidComposeView androidComposeView = wrappedComposition.owner;
                                boolean changedInstance = gapComposer.changedInstance(wrappedComposition);
                                Object rememberedValue = gapComposer.rememberedValue();
                                Continuation continuation = null;
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (changedInstance || rememberedValue == neverEqualPolicy) {
                                    rememberedValue = new WrappedComposition$setContent$1$2$1$1(wrappedComposition, continuation, i3);
                                    gapComposer.updateRememberedValue(rememberedValue);
                                }
                                Updater.LaunchedEffect(gapComposer, androidComposeView, (Function2) rememberedValue);
                                boolean changedInstance2 = gapComposer.changedInstance(wrappedComposition);
                                Object rememberedValue2 = gapComposer.rememberedValue();
                                if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new WrappedComposition$setContent$1$2$1$1(wrappedComposition, continuation, i2);
                                    gapComposer.updateRememberedValue(rememberedValue2);
                                }
                                Updater.LaunchedEffect(gapComposer, androidComposeView, (Function2) rememberedValue2);
                                ((ComposeViewContext) obj3).ProvideCompositionLocals$ui(androidComposeView, function2, gapComposer, 0);
                            } else {
                                gapComposer.skipToGroupEnd();
                            }
                            break;
                        default:
                            ((Number) obj2).intValue();
                            CompositionLocalsKt.ProvideCommonCompositionLocals((Owner) obj4, (UriHandler) obj3, function2, (Composer) obj, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(WrappedComposition wrappedComposition, ComposeViewContext composeViewContext, Function2 function2) {
                    super(2);
                    this.this$0 = wrappedComposition;
                    this.$composeViewContext = composeViewContext;
                    this.$content = function2;
                }
            }
        });
    }
}
