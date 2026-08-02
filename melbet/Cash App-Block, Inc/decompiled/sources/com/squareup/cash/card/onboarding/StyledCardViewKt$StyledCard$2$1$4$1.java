package com.squareup.cash.card.onboarding;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class StyledCardViewKt$StyledCard$2$1$4$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ StyledCardViewModel $model;
    public final /* synthetic */ Function1 $onError;
    public final /* synthetic */ Resources $resources;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledCardViewKt$StyledCard$2$1$4$1(StyledCardViewModel styledCardViewModel, Resources resources, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.$model = styledCardViewModel;
        this.$resources = resources;
        this.$onError = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StyledCardViewKt$StyledCard$2$1$4$1(this.$model, this.$resources, this.$onError, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StyledCardViewKt$StyledCard$2$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            StyledCardViewModel styledCardViewModel = this.$model;
            CustomizationDetails customizationDetails = styledCardViewModel.customizationDetails;
            byte[] bArr = styledCardViewModel.customizationOverrideBytes;
            CardTheme.CardCustomizationMargin cardCustomizationMargin = styledCardViewModel.theme.card_customization_margin;
            this.label = 1;
            obj = JobKt.withContext(Dispatchers.Default, new StyledCardViewKt$createCustomizationBitmap$2(bArr, cardCustomizationMargin, this.$onError, customizationDetails, 1024, 645, this.$resources, null), this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return new AndroidImageBitmap((Bitmap) obj);
    }
}
