package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.appforeground.AppForegroundState;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$models$$inlined$CollectEffect$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $chatSessionManager$delegate$inlined;
    public final /* synthetic */ MutableState $currentSuggestionsId$delegate$inlined;
    public final /* synthetic */ Flow $flow;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ MoneybotChatPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotChatPresenter$models$$inlined$CollectEffect$1(Flow flow, Continuation continuation, MoneybotChatPresenter moneybotChatPresenter, MutableState mutableState, MutableState mutableState2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$flow = flow;
        this.this$0 = moneybotChatPresenter;
        this.$chatSessionManager$delegate$inlined = mutableState;
        this.$currentSuggestionsId$delegate$inlined = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                MoneybotChatPresenter$models$$inlined$CollectEffect$1 moneybotChatPresenter$models$$inlined$CollectEffect$1 = new MoneybotChatPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, this.this$0, this.$chatSessionManager$delegate$inlined, this.$currentSuggestionsId$delegate$inlined, 0);
                moneybotChatPresenter$models$$inlined$CollectEffect$1.L$0 = obj;
                return moneybotChatPresenter$models$$inlined$CollectEffect$1;
            default:
                MoneybotChatPresenter$models$$inlined$CollectEffect$1 moneybotChatPresenter$models$$inlined$CollectEffect$12 = new MoneybotChatPresenter$models$$inlined$CollectEffect$1(this.$flow, continuation, this.this$0, this.$chatSessionManager$delegate$inlined, this.$currentSuggestionsId$delegate$inlined, 1);
                moneybotChatPresenter$models$$inlined$CollectEffect$12.L$0 = obj;
                return moneybotChatPresenter$models$$inlined$CollectEffect$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotChatPresenter$models$$inlined$CollectEffect$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Flow flow = this.$flow;
        switch (i) {
            case 0:
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final MutableState mutableState = this.$currentSuggestionsId$delegate$inlined;
                    final int i3 = 0;
                    final MoneybotChatPresenter moneybotChatPresenter = this.this$0;
                    final MutableState mutableState2 = this.$chatSessionManager$delegate$inlined;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$$inlined$CollectEffect$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i4 = i3;
                            CoroutineScope coroutineScope2 = coroutineScope;
                            switch (i4) {
                                case 0:
                                    MoneybotChatPresenter.PluginMessage pluginMessage = (MoneybotChatPresenter.PluginMessage) obj2;
                                    boolean z = pluginMessage.hidden;
                                    MoneybotChatPresenter moneybotChatPresenter2 = moneybotChatPresenter;
                                    if (!z) {
                                        moneybotChatPresenter2.sendMessageAnimating$delegate.setValue(Boolean.TRUE);
                                    }
                                    JobKt.launch$default(coroutineScope2, null, null, new MusicPresenter$models$1$1(moneybotChatPresenter2, pluginMessage, mutableState2, mutableState, null, 10), 3);
                                    break;
                                default:
                                    JobKt.launch$default(coroutineScope2, null, null, new MusicPresenter$models$1$1(moneybotChatPresenter, (AppForegroundState) obj2, mutableState2, mutableState, null, 9), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowCollector, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                final CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final MutableState mutableState3 = this.$currentSuggestionsId$delegate$inlined;
                    final int i5 = 1;
                    final MoneybotChatPresenter moneybotChatPresenter2 = this.this$0;
                    final MutableState mutableState4 = this.$chatSessionManager$delegate$inlined;
                    FlowCollector flowCollector2 = new FlowCollector() { // from class: com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$$inlined$CollectEffect$1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            int i42 = i5;
                            CoroutineScope coroutineScope22 = coroutineScope2;
                            switch (i42) {
                                case 0:
                                    MoneybotChatPresenter.PluginMessage pluginMessage = (MoneybotChatPresenter.PluginMessage) obj2;
                                    boolean z = pluginMessage.hidden;
                                    MoneybotChatPresenter moneybotChatPresenter22 = moneybotChatPresenter2;
                                    if (!z) {
                                        moneybotChatPresenter22.sendMessageAnimating$delegate.setValue(Boolean.TRUE);
                                    }
                                    JobKt.launch$default(coroutineScope22, null, null, new MusicPresenter$models$1$1(moneybotChatPresenter22, pluginMessage, mutableState4, mutableState3, null, 10), 3);
                                    break;
                                default:
                                    JobKt.launch$default(coroutineScope22, null, null, new MusicPresenter$models$1$1(moneybotChatPresenter2, (AppForegroundState) obj2, mutableState4, mutableState3, null, 9), 3);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(flowCollector2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
