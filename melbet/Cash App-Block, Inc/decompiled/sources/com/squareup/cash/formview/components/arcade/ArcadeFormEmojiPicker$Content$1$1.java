package com.squareup.cash.formview.components.arcade;

import com.squareup.cash.formview.components.FormElementViewBuilder$toView$18;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.app.SubmitFormRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ArcadeFormEmojiPicker$Content$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ArcadeFormEmojiPicker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeFormEmojiPicker$Content$1$1(ArcadeFormEmojiPicker arcadeFormEmojiPicker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = arcadeFormEmojiPicker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ArcadeFormEmojiPicker$Content$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ArcadeFormEmojiPicker$Content$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        ArcadeFormEmojiPicker arcadeFormEmojiPicker = this.this$0;
        FormBlocker.Element.EmojiPickerElement emojiPickerElement = arcadeFormEmojiPicker.element;
        FormBlocker.Element.EmojiPickerElement.InitialSelection initialSelection = emojiPickerElement.initial_selection;
        if (initialSelection != null) {
            FormBlocker.Element.EmojiPickerElement.EmojiCategory.EmojiOption emojiOption = (FormBlocker.Element.EmojiPickerElement.EmojiCategory.EmojiOption) CollectionsKt.first((List) emojiPickerElement.categories.get((int) initialSelection.categories_index).emojiOptions);
            FormElementViewBuilder$toView$18 formElementViewBuilder$toView$18 = arcadeFormEmojiPicker.onEvent;
            String str = arcadeFormEmojiPicker.formElementId;
            String str2 = emojiOption.icon_id;
            str2.getClass();
            formElementViewBuilder$toView$18.invoke(new FormViewEvent.UpdateResultEvent.EmojiPickChanged(str, new SubmitFormRequest.ElementResult.EmojiPickerResult(str2)));
        }
        return Unit.INSTANCE;
    }
}
