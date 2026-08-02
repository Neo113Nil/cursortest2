package com.squareup.cash.moneybot.presenters;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPreambleManager;
import com.squareup.cash.music.presenters.MusicPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class MoneybotPreambleEditorPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public MusicPresenter L$0;
    public int label;
    public final /* synthetic */ MusicPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MoneybotPreambleEditorPresenter$models$1$1(MusicPresenter musicPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = musicPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        MusicPresenter musicPresenter = this.this$0;
        switch (i) {
            case 0:
                return new MoneybotPreambleEditorPresenter$models$1$1(musicPresenter, continuation, 0);
            default:
                return new MoneybotPreambleEditorPresenter$models$1$1(musicPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((MoneybotPreambleEditorPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MusicPresenter musicPresenter;
        String str;
        MusicPresenter musicPresenter2;
        int i = this.$r8$classId;
        MusicPresenter musicPresenter3 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealMoneybotPreambleManager realMoneybotPreambleManager = (RealMoneybotPreambleManager) musicPresenter3.musicPlayer;
                    this.L$0 = musicPresenter3;
                    this.label = 1;
                    obj = realMoneybotPreambleManager.moneybotPreambleOverride.get(this);
                    if (obj != coroutineSingletons) {
                        musicPresenter = musicPresenter3;
                    }
                    break;
                } else if (i2 == 1) {
                    musicPresenter = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    musicPresenter2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str = (String) obj;
                    musicPresenter = musicPresenter2;
                    ((ParcelableSnapshotMutableState) musicPresenter.args).setValue(str);
                    break;
                }
                str = (String) obj;
                if (str == null) {
                    this.L$0 = musicPresenter;
                    this.label = 2;
                    obj = MusicPresenter.access$fetchMoneybotPreamble(musicPresenter3, this);
                    if (obj != coroutineSingletons) {
                        musicPresenter2 = musicPresenter;
                        str = (String) obj;
                        musicPresenter = musicPresenter2;
                    }
                }
                ((ParcelableSnapshotMutableState) musicPresenter.args).setValue(str);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = musicPresenter3;
                    this.label = 1;
                    obj = MusicPresenter.access$fetchMoneybotPreamble(musicPresenter3, this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    musicPresenter3 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ((ParcelableSnapshotMutableState) musicPresenter3.args).setValue((String) obj);
                break;
        }
        return Unit.INSTANCE;
    }
}
