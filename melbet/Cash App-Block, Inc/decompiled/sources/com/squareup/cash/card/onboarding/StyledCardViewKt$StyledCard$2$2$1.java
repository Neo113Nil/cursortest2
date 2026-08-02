package com.squareup.cash.card.onboarding;

import android.content.res.Resources;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
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
public final class StyledCardViewKt$StyledCard$2$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $customizationDrawable$delegate;
    public final /* synthetic */ int $customizationHeightPx;
    public final /* synthetic */ int $customizationWidthPx;
    public final /* synthetic */ StyledCardViewModel $model;
    public final /* synthetic */ Function1 $onError;
    public final /* synthetic */ Resources $resources;
    public MutableState L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledCardViewKt$StyledCard$2$2$1(StyledCardViewModel styledCardViewModel, int i, int i2, Resources resources, Function1 function1, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$model = styledCardViewModel;
        this.$customizationWidthPx = i;
        this.$customizationHeightPx = i2;
        this.$resources = resources;
        this.$onError = function1;
        this.$customizationDrawable$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StyledCardViewKt$StyledCard$2$2$1(this.$model, this.$customizationWidthPx, this.$customizationHeightPx, this.$resources, this.$onError, this.$customizationDrawable$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StyledCardViewKt$StyledCard$2$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            StyledCardViewModel styledCardViewModel = this.$model;
            CustomizationDetails customizationDetails = styledCardViewModel.customizationDetails;
            byte[] bArr = styledCardViewModel.customizationOverrideBytes;
            CardTheme.CardCustomizationMargin cardCustomizationMargin = styledCardViewModel.theme.card_customization_margin;
            MutableState mutableState2 = this.$customizationDrawable$delegate;
            this.L$0 = mutableState2;
            this.label = 1;
            Object withContext = JobKt.withContext(Dispatchers.Default, new StyledCardViewKt$createCustomizationBitmap$2(bArr, cardCustomizationMargin, this.$onError, customizationDetails, this.$customizationWidthPx, this.$customizationHeightPx, this.$resources, null), this);
            if (withContext == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = withContext;
            mutableState = mutableState2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mutableState = this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        mutableState.setValue(new AndroidImageBitmap((Bitmap) obj));
        return Unit.INSTANCE;
    }
}
