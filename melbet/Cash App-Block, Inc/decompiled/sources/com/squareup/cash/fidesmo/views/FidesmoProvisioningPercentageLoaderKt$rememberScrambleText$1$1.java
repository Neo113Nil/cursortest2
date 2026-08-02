package com.squareup.cash.fidesmo.views;

import androidx.compose.runtime.MutableState;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.family.fixtures.FamilyActivityFixtures$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.random.Random;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $displayedText$delegate;
    public final /* synthetic */ MutableState $hasTransitionedToPercentage;
    public final /* synthetic */ boolean $isInPreview;
    public final /* synthetic */ Integer $progressPercent;
    public final /* synthetic */ String $targetText;
    public int I$0;
    public int I$1;
    public int I$2;
    public int I$3;
    public int I$4;
    public String L$0;
    public Function1 L$1;
    public String L$2;
    public MutableState L$3;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1(boolean z, String str, Integer num, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$isInPreview = z;
        this.$targetText = str;
        this.$progressPercent = num;
        this.$hasTransitionedToPercentage = mutableState;
        this.$displayedText$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1(this.$isInPreview, this.$targetText, this.$progressPercent, this.$hasTransitionedToPercentage, this.$displayedText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FidesmoProvisioningPercentageLoaderKt$rememberScrambleText$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0097, code lost:
    
        if (java.lang.Math.abs(r7.intValue() - r8.intValue()) <= 1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0199 -> B:5:0x019c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int length;
        int length2;
        String str;
        String str2;
        Function1 familyActivityFixtures$$ExternalSyntheticLambda0;
        int i;
        int i2;
        int i3;
        MutableState mutableState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        MutableState mutableState2 = this.$displayedText$delegate;
        String str3 = this.$targetText;
        if (i4 == 0) {
            SafeTrace.throwOnFailure(obj);
            String str4 = (String) mutableState2.getValue();
            if (this.$isInPreview) {
                mutableState2.setValue(str3);
                return Unit.INSTANCE;
            }
            Integer num = this.$progressPercent;
            MutableState mutableState3 = this.$hasTransitionedToPercentage;
            int i5 = (num == null || ((Boolean) mutableState3.getValue()).booleanValue()) ? 0 : 1;
            if (i5 != 0) {
                mutableState3.setValue(Boolean.TRUE);
            }
            if (num == null) {
                mutableState3.setValue(Boolean.FALSE);
            }
            if (i5 == 0) {
                if (str4.length() != str3.length()) {
                    Integer intOrNull = StringsKt.toIntOrNull(StringsKt.removeSuffix(str4, "%"));
                    Integer intOrNull2 = StringsKt.toIntOrNull(StringsKt.removeSuffix(str3, "%"));
                    if (intOrNull != null) {
                        if (intOrNull2 != null) {
                        }
                    }
                }
                mutableState2.setValue(str3);
                return Unit.INSTANCE;
            }
            length = str4.length();
            length2 = str3.length();
            str = str4;
            str2 = str3;
            familyActivityFixtures$$ExternalSyntheticLambda0 = new FamilyActivityFixtures$$ExternalSyntheticLambda0(25);
            i = 0;
            i2 = i5;
            i3 = 14;
            mutableState = mutableState2;
            if (i < i3) {
            }
        } else {
            if (i4 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$4;
            length2 = this.I$3;
            length = this.I$2;
            i3 = this.I$1;
            i2 = this.I$0;
            mutableState = this.L$3;
            str2 = this.L$2;
            familyActivityFixtures$$ExternalSyntheticLambda0 = this.L$1;
            str = this.L$0;
            SafeTrace.throwOnFailure(obj);
            MutableState mutableState4 = mutableState2;
            String str5 = str3;
            int i6 = 1;
            i += i6;
            mutableState2 = mutableState4;
            str3 = str5;
            if (i < i3) {
                float f = (i + 1) / i3;
                int floatValue = (int) (((length2 - length) * ((Number) familyActivityFixtures$$ExternalSyntheticLambda0.invoke(new Float(f))).floatValue()) + length);
                StringBuilder sb = new StringBuilder();
                int i7 = 0;
                while (i7 < floatValue) {
                    int i8 = floatValue;
                    MutableState mutableState5 = mutableState2;
                    String str6 = str3;
                    float coerceIn = RangesKt___RangesKt.coerceIn((length2 * f) - i7, RecyclerView.DECELERATION_RATE, 1.0f);
                    if (i7 < str2.length()) {
                        Random.Default.getClass();
                        if (Random.defaultRandom.nextFloat() < coerceIn) {
                            sb.append(str2.charAt(i7));
                            i7++;
                            floatValue = i8;
                            mutableState2 = mutableState5;
                            str3 = str6;
                        }
                    }
                    Character orNull = StringsKt___StringsKt.getOrNull(i7, str2);
                    char charValue = (orNull == null && (orNull = StringsKt___StringsKt.getOrNull(i7, str)) == null) ? 'x' : orNull.charValue();
                    sb.append(Character.isUpperCase(charValue) ? StringsKt___StringsKt.random("ABCDEFGHIJKLMNOPQRSTUVWXYZ", Random.Default) : Character.isLowerCase(charValue) ? StringsKt___StringsKt.random("abcdefghijklmnopqrstuvwxyz", Random.Default) : Character.isDigit(charValue) ? StringsKt___StringsKt.random("0123456789", Random.Default) : charValue == ' ' ? ' ' : StringsKt___StringsKt.random(".·…:•-_", Random.Default));
                    i7++;
                    floatValue = i8;
                    mutableState2 = mutableState5;
                    str3 = str6;
                }
                mutableState4 = mutableState2;
                str5 = str3;
                mutableState.setValue(sb.toString());
                this.L$0 = str;
                this.L$1 = familyActivityFixtures$$ExternalSyntheticLambda0;
                this.L$2 = str2;
                this.L$3 = mutableState;
                this.I$0 = i2;
                this.I$1 = i3;
                this.I$2 = length;
                this.I$3 = length2;
                this.I$4 = i;
                i6 = 1;
                this.label = 1;
                if (JobKt.delay(50L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i += i6;
                mutableState2 = mutableState4;
                str3 = str5;
                if (i < i3) {
                    mutableState2.setValue(str3);
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
