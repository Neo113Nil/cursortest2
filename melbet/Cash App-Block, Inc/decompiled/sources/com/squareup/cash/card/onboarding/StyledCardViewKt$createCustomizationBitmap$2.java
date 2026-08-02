package com.squareup.cash.card.onboarding;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.protos.franklin.cards.CardTheme;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class StyledCardViewKt$createCustomizationBitmap$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ CustomizationDetails $customizationDetails;
    public final /* synthetic */ byte[] $customizationOverride;
    public final /* synthetic */ Function1 $errorReporter;
    public final /* synthetic */ int $height;
    public final /* synthetic */ CardTheme.CardCustomizationMargin $margin;
    public final /* synthetic */ Resources $resources;
    public final /* synthetic */ int $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyledCardViewKt$createCustomizationBitmap$2(byte[] bArr, CardTheme.CardCustomizationMargin cardCustomizationMargin, Function1 function1, CustomizationDetails customizationDetails, int i, int i2, Resources resources, Continuation continuation) {
        super(2, continuation);
        this.$customizationOverride = bArr;
        this.$margin = cardCustomizationMargin;
        this.$errorReporter = function1;
        this.$customizationDetails = customizationDetails;
        this.$width = i;
        this.$height = i2;
        this.$resources = resources;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StyledCardViewKt$createCustomizationBitmap$2(this.$customizationOverride, this.$margin, this.$errorReporter, this.$customizationDetails, this.$width, this.$height, this.$resources, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StyledCardViewKt$createCustomizationBitmap$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Resources resources = this.$resources;
        CardTheme.CardCustomizationMargin cardCustomizationMargin = this.$margin;
        byte[] bArr = this.$customizationOverride;
        if (bArr != null && bArr.length != 0) {
            try {
                int length = bArr.length;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, length, options);
                decodeByteArray.getClass();
                Bitmap convertToAlpha8 = CardsKt.convertToAlpha8(decodeByteArray);
                if (cardCustomizationMargin == null) {
                    return convertToAlpha8;
                }
                StyledCardViewKt.access$clipCard(cardCustomizationMargin, convertToAlpha8, resources);
                return convertToAlpha8;
            } catch (Exception e) {
                this.$errorReporter.invoke(e);
            }
        }
        Bitmap bitmap = CustomizationDetailsExtensionsKt.toBitmap(this.$customizationDetails, this.$width, this.$height);
        if (cardCustomizationMargin != null) {
            StyledCardViewKt.access$clipCard(cardCustomizationMargin, bitmap, resources);
        }
        return bitmap;
    }
}
