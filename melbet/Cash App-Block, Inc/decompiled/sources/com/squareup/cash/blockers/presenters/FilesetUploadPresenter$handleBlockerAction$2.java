package com.squareup.cash.blockers.presenters;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.protos.franklin.api.BlockerAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class FilesetUploadPresenter$handleBlockerAction$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List $files;
    public final /* synthetic */ MutableState $submittingState;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ FilesetUploadPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesetUploadPresenter$handleBlockerAction$2(MutableState mutableState, FilesetUploadPresenter filesetUploadPresenter, List list, Continuation continuation) {
        super(2, continuation);
        this.$submittingState = mutableState;
        this.this$0 = filesetUploadPresenter;
        this.$files = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FilesetUploadPresenter$handleBlockerAction$2 filesetUploadPresenter$handleBlockerAction$2 = new FilesetUploadPresenter$handleBlockerAction$2(this.$submittingState, this.this$0, this.$files, continuation);
        filesetUploadPresenter$handleBlockerAction$2.L$0 = obj;
        return filesetUploadPresenter$handleBlockerAction$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FilesetUploadPresenter$handleBlockerAction$2) create((BlockerAction.SubmitAction) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BlockerAction.SubmitAction submitAction = (BlockerAction.SubmitAction) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MutableState mutableState = this.$submittingState;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            mutableState.setValue(submitAction.direction == BlockerAction.SubmitAction.AnimationDirection.BACKWARD ? FilesetUploadViewModel.SubmittingState.BACKWARD : FilesetUploadViewModel.SubmittingState.FORWARD);
            String str = submitAction.id;
            str.getClass();
            List list = this.$files;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((FilesetUploadViewModel.FileViewModel) it.next()).id);
            }
            this.L$0 = null;
            this.label = 1;
            if (FilesetUploadPresenter.access$submitFileset(this.this$0, str, arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        mutableState.setValue(FilesetUploadViewModel.SubmittingState.IDLE);
        return Unit.INSTANCE;
    }
}
