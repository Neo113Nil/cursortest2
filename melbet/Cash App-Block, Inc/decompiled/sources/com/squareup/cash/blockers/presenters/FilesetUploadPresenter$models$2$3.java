package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.presenters.FilesetUploadPresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.cdf.document.DocumentUploadSubmit;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.protos.franklin.api.BlockerAction;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class FilesetUploadPresenter$models$2$3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $files$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $submittingState;
    public int label;
    public final /* synthetic */ FilesetUploadPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilesetUploadPresenter$models$2$3(FilesetUploadPresenter filesetUploadPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = filesetUploadPresenter;
        this.$submittingState = mutableState;
        this.$files$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new FilesetUploadPresenter$models$2$3(this.this$0, this.$submittingState, this.$files$delegate, continuation, 0);
            case 1:
                return new FilesetUploadPresenter$models$2$3(this.this$0, this.$submittingState, this.$files$delegate, continuation, 1);
            case 2:
                return new FilesetUploadPresenter$models$2$3(this.this$0, this.$submittingState, this.$files$delegate, continuation, 2);
            default:
                return new FilesetUploadPresenter$models$2$3(this.this$0, this.$submittingState, this.$files$delegate, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FilesetUploadPresenter$models$2$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$files$delegate;
        FilesetUploadPresenter filesetUploadPresenter = this.this$0;
        MutableState mutableState2 = this.$submittingState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockerAction blockerAction = filesetUploadPresenter.args.dismissAction;
                    List list = (List) mutableState.getValue();
                    this.label = 1;
                    if (FilesetUploadPresenter.access$handleBlockerAction(filesetUploadPresenter, blockerAction, list, mutableState2, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                BlockersScreens.FilesetUploadScreen filesetUploadScreen = filesetUploadPresenter.args;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Analytics analytics = filesetUploadPresenter.analytics;
                    int size = ((List) mutableState.getValue()).size();
                    String valueOf = String.valueOf(filesetUploadScreen.blockersData.clientScenario);
                    String str = filesetUploadScreen.blockersData.flowToken;
                    str.getClass();
                    analytics.track(new DocumentUploadSubmit(Integer.valueOf(size), valueOf, str), null);
                    BlockerAction blockerAction2 = filesetUploadScreen.primaryAction;
                    List list2 = (List) mutableState.getValue();
                    this.label = 1;
                    if (FilesetUploadPresenter.access$handleBlockerAction(filesetUploadPresenter, blockerAction2, list2, mutableState2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BlockerAction blockerAction3 = filesetUploadPresenter.args.secondaryAction;
                    List list3 = (List) mutableState.getValue();
                    this.label = 1;
                    if (FilesetUploadPresenter.access$handleBlockerAction(filesetUploadPresenter, blockerAction3, list3, mutableState2, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FilesetUploadPresenter.UriToUpload uriToUpload = (FilesetUploadPresenter.UriToUpload) mutableState2.getValue();
                    if (uriToUpload != null) {
                        this.label = 1;
                        obj = FilesetUploadPresenter.access$uploadFile(filesetUploadPresenter, uriToUpload, this);
                        if (obj == coroutineSingletons4) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                FilesetUploadViewModel.FileViewModel fileViewModel = (FilesetUploadViewModel.FileViewModel) obj;
                if (fileViewModel != null) {
                    mutableState.setValue(CollectionsKt.plus((Collection) mutableState.getValue(), (Object) fileViewModel));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
