package ru.yandex.taxi.surge.interactor;

import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import defpackage.bvf0;
import defpackage.lpw0;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.pye0;
import defpackage.q47;
import defpackage.qye0;
import defpackage.tt2;
import defpackage.w511;
import defpackage.xjf;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes6.dex */
public final class p {
    public final tt2 a;
    public final pwy0 b;
    public final ru.yandex.taxi.widget.utils.e c;

    public p(tt2 tt2Var, pwy0 pwy0Var, ru.yandex.taxi.widget.utils.e eVar) {
        this.a = tt2Var;
        this.b = pwy0Var;
        this.c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(p pVar, pye0 pye0Var, ContinuationImpl continuationImpl) {
        SurgeFeedbackSentStateInteractor$formatText$1 surgeFeedbackSentStateInteractor$formatText$1;
        int i;
        String str;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3;
        Object obj;
        CharSequence charSequence;
        p pVar2 = pVar;
        pye0 pye0Var2 = pye0Var;
        pVar2.getClass();
        if (continuationImpl instanceof SurgeFeedbackSentStateInteractor$formatText$1) {
            surgeFeedbackSentStateInteractor$formatText$1 = (SurgeFeedbackSentStateInteractor$formatText$1) continuationImpl;
            int i2 = surgeFeedbackSentStateInteractor$formatText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgeFeedbackSentStateInteractor$formatText$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = surgeFeedbackSentStateInteractor$formatText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeFeedbackSentStateInteractor$formatText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    str = pye0Var2.d;
                    if (str == null || str.length() == 0) {
                        return pye0Var2.b;
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    ru.yandex.taxi.widget.utils.e eVar = pVar2.c;
                    surgeFeedbackSentStateInteractor$formatText$1.L$0 = pye0Var2;
                    surgeFeedbackSentStateInteractor$formatText$1.L$1 = str;
                    surgeFeedbackSentStateInteractor$formatText$1.L$2 = spannableStringBuilder;
                    surgeFeedbackSentStateInteractor$formatText$1.L$3 = spannableStringBuilder;
                    surgeFeedbackSentStateInteractor$formatText$1.L$4 = pVar2;
                    surgeFeedbackSentStateInteractor$formatText$1.L$5 = " ";
                    surgeFeedbackSentStateInteractor$formatText$1.L$6 = spannableStringBuilder;
                    surgeFeedbackSentStateInteractor$formatText$1.label = 1;
                    Object f = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, surgeFeedbackSentStateInteractor$formatText$1, 6);
                    if (f == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    spannableStringBuilder2 = spannableStringBuilder;
                    spannableStringBuilder3 = spannableStringBuilder2;
                    obj = f;
                    charSequence = " ";
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = (SpannableStringBuilder) surgeFeedbackSentStateInteractor$formatText$1.L$6;
                    CharSequence charSequence2 = (CharSequence) surgeFeedbackSentStateInteractor$formatText$1.L$5;
                    p pVar3 = (p) surgeFeedbackSentStateInteractor$formatText$1.L$4;
                    spannableStringBuilder2 = (SpannableStringBuilder) surgeFeedbackSentStateInteractor$formatText$1.L$3;
                    spannableStringBuilder3 = (SpannableStringBuilder) surgeFeedbackSentStateInteractor$formatText$1.L$2;
                    str = (String) surgeFeedbackSentStateInteractor$formatText$1.L$1;
                    pye0 pye0Var3 = (pye0) surgeFeedbackSentStateInteractor$formatText$1.L$0;
                    kotlin.b.b(obj2);
                    spannableStringBuilder = spannableStringBuilder4;
                    pVar2 = pVar3;
                    obj = obj2;
                    charSequence = charSequence2;
                    pye0Var2 = pye0Var3;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                pVar2.getClass();
                spannableStringBuilder.append(charSequence, bitmapDrawable != null ? new CustomImageSpan(bitmapDrawable, 2, false, true, new xjf(str), 4, null) : null, 33);
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) pye0Var2.b);
                return new SpannedString(spannableStringBuilder3);
            }
        }
        surgeFeedbackSentStateInteractor$formatText$1 = new SurgeFeedbackSentStateInteractor$formatText$1(pVar2, continuationImpl);
        Object obj22 = surgeFeedbackSentStateInteractor$formatText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeFeedbackSentStateInteractor$formatText$1.label;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
        pVar2.getClass();
        spannableStringBuilder.append(charSequence, bitmapDrawable2 != null ? new CustomImageSpan(bitmapDrawable2, 2, false, true, new xjf(str), 4, null) : null, 33);
        spannableStringBuilder2.append((CharSequence) " ");
        spannableStringBuilder2.append((CharSequence) pye0Var2.b);
        return new SpannedString(spannableStringBuilder3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, qye0 qye0Var, ContinuationImpl continuationImpl) {
        SurgeFeedbackSentStateInteractor$mapButtons$1 surgeFeedbackSentStateInteractor$mapButtons$1;
        int i;
        int i2;
        ButtonOrientation buttonOrientation;
        pVar.getClass();
        if (continuationImpl instanceof SurgeFeedbackSentStateInteractor$mapButtons$1) {
            surgeFeedbackSentStateInteractor$mapButtons$1 = (SurgeFeedbackSentStateInteractor$mapButtons$1) continuationImpl;
            int i3 = surgeFeedbackSentStateInteractor$mapButtons$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                surgeFeedbackSentStateInteractor$mapButtons$1.label = i3 - Integer.MIN_VALUE;
                Object obj = surgeFeedbackSentStateInteractor$mapButtons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgeFeedbackSentStateInteractor$mapButtons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SurgeFeedbackSentStateInteractor$mapButtons$buttons$1 surgeFeedbackSentStateInteractor$mapButtons$buttons$1 = new SurgeFeedbackSentStateInteractor$mapButtons$buttons$1(qye0Var, pVar, null);
                    surgeFeedbackSentStateInteractor$mapButtons$1.L$0 = qye0Var;
                    surgeFeedbackSentStateInteractor$mapButtons$1.label = 1;
                    obj = bvf0.n(surgeFeedbackSentStateInteractor$mapButtons$buttons$1, surgeFeedbackSentStateInteractor$mapButtons$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qye0Var = (qye0) surgeFeedbackSentStateInteractor$mapButtons$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                i2 = lpw0.a[qye0Var.a.ordinal()];
                if (i2 != 1) {
                    buttonOrientation = ButtonOrientation.VERTICAL;
                } else {
                    if (i2 != 2) {
                        w511.b();
                        return null;
                    }
                    buttonOrientation = ButtonOrientation.HORIZONTAL;
                }
                return new q47(buttonOrientation, list);
            }
        }
        surgeFeedbackSentStateInteractor$mapButtons$1 = new SurgeFeedbackSentStateInteractor$mapButtons$1(pVar, continuationImpl);
        Object obj2 = surgeFeedbackSentStateInteractor$mapButtons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgeFeedbackSentStateInteractor$mapButtons$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        i2 = lpw0.a[qye0Var.a.ordinal()];
        if (i2 != 1) {
        }
        return new q47(buttonOrientation, list2);
    }
}
