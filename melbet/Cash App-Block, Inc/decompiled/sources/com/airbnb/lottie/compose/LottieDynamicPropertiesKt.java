package com.airbnb.lottie.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000-\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0011\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0010\u001a1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006$\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00068\nX\u008a\u0084\u0002"}, d2 = {"", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "properties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "rememberLottieDynamicProperties", "([Lcom/airbnb/lottie/compose/LottieDynamicProperty;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "T", "property", "value", "", "keyPath", "rememberLottieDynamicProperty", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "callback", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", "toValueCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1;", "callbackState", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieDynamicPropertiesKt {
    public static final LottieDynamicProperties rememberLottieDynamicProperties(LottieDynamicProperty<?>[] lottieDynamicPropertyArr, Composer composer, int i) {
        lottieDynamicPropertyArr.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceableGroup(-395574495);
        int hashCode = Arrays.hashCode(lottieDynamicPropertyArr);
        gapComposer.startReplaceableGroup(34468001);
        boolean changed = gapComposer.changed(hashCode);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new LottieDynamicProperties(ArraysKt___ArraysKt.toList(lottieDynamicPropertyArr));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        LottieDynamicProperties lottieDynamicProperties = (LottieDynamicProperties) rememberedValue;
        gapComposer.end(false);
        gapComposer.end(false);
        return lottieDynamicProperties;
    }

    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t, T t2, String[] strArr, Composer composer, int i) {
        strArr.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceableGroup(-1788530187);
        gapComposer.startReplaceableGroup(1613443961);
        boolean changed = gapComposer.changed(strArr);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new KeyPath((String[]) Arrays.copyOf(strArr, strArr.length));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        KeyPath keyPath = (KeyPath) rememberedValue;
        gapComposer.end(false);
        gapComposer.startReplaceableGroup(1613444012);
        boolean z = true;
        boolean changed2 = gapComposer.changed(keyPath) | ((((i & 14) ^ 6) > 4 && gapComposer.changed(t)) || (i & 6) == 4);
        if ((((i & 112) ^ 48) <= 32 || !gapComposer.changed(t2)) && (i & 48) != 32) {
            z = false;
        }
        boolean z2 = changed2 | z;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new LottieDynamicProperty(t, keyPath, t2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) rememberedValue2;
        gapComposer.end(false);
        gapComposer.end(false);
        return lottieDynamicProperty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function1<LottieFrameInfo<T>, T> rememberLottieDynamicProperty$lambda$4(State state) {
        return (Function1) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1] */
    public static final LottieDynamicPropertiesKt$toValueCallback$1 toValueCallback(final Function1 function1) {
        return new LottieValueCallback() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public Object getValue(LottieFrameInfo frameInfo) {
                frameInfo.getClass();
                return Function1.this.invoke(frameInfo);
            }
        };
    }

    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t, String[] strArr, Function1<? super LottieFrameInfo<T>, ? extends T> function1, Composer composer, int i) {
        strArr.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceableGroup(1331897370);
        int hashCode = Arrays.hashCode(strArr);
        gapComposer.startReplaceableGroup(1613445061);
        boolean changed = gapComposer.changed(hashCode);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = new KeyPath((String[]) Arrays.copyOf(strArr, strArr.length));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        KeyPath keyPath = (KeyPath) rememberedValue;
        gapComposer.end(false);
        final MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer);
        gapComposer.startReplaceableGroup(1613445186);
        boolean changed2 = ((((i & 14) ^ 6) > 4 && gapComposer.changed(t)) || (i & 6) == 4) | gapComposer.changed(keyPath);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new LottieDynamicProperty((Object) t, keyPath, (Function1) new Function1<LottieFrameInfo<T>, T>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final T invoke(LottieFrameInfo<T> lottieFrameInfo) {
                    Function1 rememberLottieDynamicProperty$lambda$4;
                    lottieFrameInfo.getClass();
                    rememberLottieDynamicProperty$lambda$4 = LottieDynamicPropertiesKt.rememberLottieDynamicProperty$lambda$4(State.this);
                    return (T) rememberLottieDynamicProperty$lambda$4.invoke(lottieFrameInfo);
                }
            });
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) rememberedValue2;
        gapComposer.end(false);
        gapComposer.end(false);
        return lottieDynamicProperty;
    }
}
