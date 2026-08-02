package ru.yandex.taxi.surge.interactor;

import android.graphics.drawable.BitmapDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import defpackage.bvf0;
import defpackage.evu0;
import defpackage.is60;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.pye0;
import defpackage.q47;
import defpackage.qye0;
import defpackage.rye0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wt60;
import defpackage.wu1;
import defpackage.xjf;
import defpackage.zuw0;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.ui.ButtonOrientation;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes6.dex */
public final class r {
    public final tt2 a;
    public final wiq0 b;
    public final ru.yandex.taxi.widget.utils.e c;
    public final ru.yandex.taxi.surge.repository.a d;

    public r(tt2 tt2Var, wiq0 wiq0Var, ru.yandex.taxi.widget.utils.e eVar, ru.yandex.taxi.surge.repository.a aVar) {
        this.a = tt2Var;
        this.b = wiq0Var;
        this.c = eVar;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(r rVar, pye0 pye0Var, ContinuationImpl continuationImpl) {
        SurgePriceComplainStateInteractor$formatText$1 surgePriceComplainStateInteractor$formatText$1;
        int i;
        String str;
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        SpannableStringBuilder spannableStringBuilder3;
        Object obj;
        CharSequence charSequence;
        r rVar2 = rVar;
        pye0 pye0Var2 = pye0Var;
        rVar2.getClass();
        if (continuationImpl instanceof SurgePriceComplainStateInteractor$formatText$1) {
            surgePriceComplainStateInteractor$formatText$1 = (SurgePriceComplainStateInteractor$formatText$1) continuationImpl;
            int i2 = surgePriceComplainStateInteractor$formatText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                surgePriceComplainStateInteractor$formatText$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = surgePriceComplainStateInteractor$formatText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgePriceComplainStateInteractor$formatText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    str = pye0Var2.d;
                    if (str == null || str.length() == 0) {
                        return pye0Var2.b;
                    }
                    spannableStringBuilder = new SpannableStringBuilder();
                    ru.yandex.taxi.widget.utils.e eVar = rVar2.c;
                    surgePriceComplainStateInteractor$formatText$1.L$0 = pye0Var2;
                    surgePriceComplainStateInteractor$formatText$1.L$1 = str;
                    surgePriceComplainStateInteractor$formatText$1.L$2 = spannableStringBuilder;
                    surgePriceComplainStateInteractor$formatText$1.L$3 = spannableStringBuilder;
                    surgePriceComplainStateInteractor$formatText$1.L$4 = rVar2;
                    surgePriceComplainStateInteractor$formatText$1.L$5 = " ";
                    surgePriceComplainStateInteractor$formatText$1.L$6 = spannableStringBuilder;
                    surgePriceComplainStateInteractor$formatText$1.label = 1;
                    Object f = ru.yandex.taxi.widget.utils.e.f(eVar, str, null, surgePriceComplainStateInteractor$formatText$1, 6);
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
                    SpannableStringBuilder spannableStringBuilder4 = (SpannableStringBuilder) surgePriceComplainStateInteractor$formatText$1.L$6;
                    CharSequence charSequence2 = (CharSequence) surgePriceComplainStateInteractor$formatText$1.L$5;
                    r rVar3 = (r) surgePriceComplainStateInteractor$formatText$1.L$4;
                    spannableStringBuilder2 = (SpannableStringBuilder) surgePriceComplainStateInteractor$formatText$1.L$3;
                    spannableStringBuilder3 = (SpannableStringBuilder) surgePriceComplainStateInteractor$formatText$1.L$2;
                    str = (String) surgePriceComplainStateInteractor$formatText$1.L$1;
                    pye0 pye0Var3 = (pye0) surgePriceComplainStateInteractor$formatText$1.L$0;
                    kotlin.b.b(obj2);
                    spannableStringBuilder = spannableStringBuilder4;
                    rVar2 = rVar3;
                    obj = obj2;
                    charSequence = charSequence2;
                    pye0Var2 = pye0Var3;
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                rVar2.getClass();
                spannableStringBuilder.append(charSequence, bitmapDrawable != null ? new CustomImageSpan(bitmapDrawable, 2, false, true, new xjf(str), 4, null) : null, 33);
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) pye0Var2.b);
                return new SpannedString(spannableStringBuilder3);
            }
        }
        surgePriceComplainStateInteractor$formatText$1 = new SurgePriceComplainStateInteractor$formatText$1(rVar2, continuationImpl);
        Object obj22 = surgePriceComplainStateInteractor$formatText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgePriceComplainStateInteractor$formatText$1.label;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
        rVar2.getClass();
        spannableStringBuilder.append(charSequence, bitmapDrawable2 != null ? new CustomImageSpan(bitmapDrawable2, 2, false, true, new xjf(str), 4, null) : null, 33);
        spannableStringBuilder2.append((CharSequence) " ");
        spannableStringBuilder2.append((CharSequence) pye0Var2.b);
        return new SpannedString(spannableStringBuilder3);
    }

    public static final wt60 b(r rVar) {
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) rVar.b).m();
        if (m == null) {
            return null;
        }
        is60 is60Var = m.J0.b;
        String str = m.b;
        wu1 wu1Var = m.O;
        return new wt60(is60Var, str, wu1Var != null ? wu1Var.a() : null);
    }

    public static final boolean c(r rVar, Set set, String str) {
        rVar.getClass();
        if (!set.isEmpty()) {
            return true;
        }
        String obj = evu0.k0(str).toString();
        return (obj == null || obj.length() == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(qye0 qye0Var, boolean z, boolean z2, boolean z3, ContinuationImpl continuationImpl) {
        SurgePriceComplainStateInteractor$mapButtons$1 surgePriceComplainStateInteractor$mapButtons$1;
        int i;
        qye0 qye0Var2;
        int i2;
        ButtonOrientation buttonOrientation;
        if (continuationImpl instanceof SurgePriceComplainStateInteractor$mapButtons$1) {
            surgePriceComplainStateInteractor$mapButtons$1 = (SurgePriceComplainStateInteractor$mapButtons$1) continuationImpl;
            int i3 = surgePriceComplainStateInteractor$mapButtons$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                surgePriceComplainStateInteractor$mapButtons$1.label = i3 - Integer.MIN_VALUE;
                Object obj = surgePriceComplainStateInteractor$mapButtons$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = surgePriceComplainStateInteractor$mapButtons$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    SurgePriceComplainStateInteractor$mapButtons$buttons$1 surgePriceComplainStateInteractor$mapButtons$buttons$1 = new SurgePriceComplainStateInteractor$mapButtons$buttons$1(qye0Var, this, z2, z, z3, null);
                    surgePriceComplainStateInteractor$mapButtons$1.L$0 = qye0Var;
                    surgePriceComplainStateInteractor$mapButtons$1.Z$0 = z;
                    surgePriceComplainStateInteractor$mapButtons$1.Z$1 = z2;
                    surgePriceComplainStateInteractor$mapButtons$1.Z$2 = z3;
                    surgePriceComplainStateInteractor$mapButtons$1.label = 1;
                    obj = bvf0.n(surgePriceComplainStateInteractor$mapButtons$buttons$1, surgePriceComplainStateInteractor$mapButtons$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    qye0Var2 = qye0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qye0Var2 = (qye0) surgePriceComplainStateInteractor$mapButtons$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                i2 = zuw0.a[qye0Var2.a.ordinal()];
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
        surgePriceComplainStateInteractor$mapButtons$1 = new SurgePriceComplainStateInteractor$mapButtons$1(this, continuationImpl);
        Object obj2 = surgePriceComplainStateInteractor$mapButtons$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = surgePriceComplainStateInteractor$mapButtons$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj2;
        i2 = zuw0.a[qye0Var2.a.ordinal()];
        if (i2 != 1) {
        }
        return new q47(buttonOrientation, list2);
    }

    public final tpr e(rye0 rye0Var) {
        ru.yandex.taxi.surge.repository.a aVar = this.d;
        tpr t = kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(new m0(aVar.g, aVar.e, new SurgePriceComplainStateInteractor$priceComplainStates$1(this, rye0Var, null)), new SurgePriceComplainStateInteractor$priceComplainStates$2(this, rye0Var, null)));
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.F(t, mdh.b);
    }
}
