package ru.yandex.taxi.masstransit.trains.checkout.actionpopup;

import defpackage.c7s0;
import defpackage.mja1;
import defpackage.ny61;
import defpackage.ovi0;
import defpackage.qx20;
import defpackage.sx20;
import defpackage.x940;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.masstransit.trains.checkout.model.ModalButtonResultType;

/* loaded from: classes6.dex */
public final class e {
    public final ru.yandex.taxi.widget.c a;

    public e(ru.yandex.taxi.widget.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0080, code lost:
    
        if (r2 == r4) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c7s0 c7s0Var, ContinuationImpl continuationImpl) {
        MtTrainCheckoutActionPopupInfoActionToStateMapper$map$1 mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1;
        int i;
        CharSequence charSequence;
        FormattedText formattedText;
        c7s0 c7s0Var2;
        CharSequence charSequence2;
        CharSequence charSequence3;
        ovi0 a;
        qx20 qx20Var;
        CharSequence charSequence4;
        ovi0 ovi0Var;
        CharSequence charSequence5;
        FormattedText formattedText2;
        CharSequence charSequence6;
        c7s0 c7s0Var3;
        ovi0 ovi0Var2;
        qx20 qx20Var2;
        sx20 sx20Var;
        c7s0 c7s0Var4 = c7s0Var;
        if (continuationImpl instanceof MtTrainCheckoutActionPopupInfoActionToStateMapper$map$1) {
            mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1 = (MtTrainCheckoutActionPopupInfoActionToStateMapper$map$1) continuationImpl;
            int i2 = mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.label;
                ru.yandex.taxi.widget.c cVar = this.a;
                ModalButtonResultType modalButtonResultType = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText3 = c7s0Var4.a;
                    if (formattedText3 == null) {
                        charSequence = null;
                        formattedText = c7s0Var4.b;
                        if (formattedText == null) {
                            c7s0Var2 = c7s0Var4;
                            charSequence2 = null;
                            String str = c7s0Var2.d;
                            if (str != null) {
                            }
                            qx20Var = c7s0Var2.c;
                            if (qx20Var != null) {
                            }
                            charSequence4 = charSequence;
                            ovi0Var = a;
                            charSequence5 = null;
                            CharSequence charSequence7 = charSequence2;
                            qx20Var2 = c7s0Var2.c;
                            if (qx20Var2 != null) {
                            }
                            return new x940(charSequence4, charSequence7, ovi0Var, charSequence5, modalButtonResultType);
                        }
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$0 = c7s0Var4;
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$1 = null;
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$2 = charSequence;
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.label = 2;
                        Object i3 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1, 30);
                        if (i3 != coroutineSingletons) {
                            c7s0Var2 = c7s0Var4;
                            charSequence3 = charSequence;
                            obj = i3;
                            CharSequence charSequence8 = (CharSequence) obj;
                            charSequence = charSequence3;
                            charSequence2 = charSequence8;
                            String str2 = c7s0Var2.d;
                            if (str2 != null) {
                            }
                            qx20Var = c7s0Var2.c;
                            if (qx20Var != null) {
                            }
                            charSequence4 = charSequence;
                            ovi0Var = a;
                            charSequence5 = null;
                            CharSequence charSequence72 = charSequence2;
                            qx20Var2 = c7s0Var2.c;
                            if (qx20Var2 != null) {
                            }
                            return new x940(charSequence4, charSequence72, ovi0Var, charSequence5, modalButtonResultType);
                        }
                        return coroutineSingletons;
                    }
                    mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$0 = c7s0Var4;
                    mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$1 = null;
                    mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.label = 1;
                    obj = ru.yandex.taxi.widget.c.i(cVar, formattedText3, null, mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1, 30);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ovi0Var2 = (ovi0) mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$4;
                            charSequence2 = (CharSequence) mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$3;
                            charSequence6 = (CharSequence) mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$2;
                            c7s0Var3 = (c7s0) mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$0;
                            kotlin.b.b(obj);
                            ovi0Var = ovi0Var2;
                            charSequence5 = (CharSequence) obj;
                            c7s0Var2 = c7s0Var3;
                            charSequence4 = charSequence6;
                            CharSequence charSequence722 = charSequence2;
                            qx20Var2 = c7s0Var2.c;
                            if (qx20Var2 != null && (sx20Var = qx20Var2.b) != null) {
                                modalButtonResultType = sx20Var.a();
                            }
                            return new x940(charSequence4, charSequence722, ovi0Var, charSequence5, modalButtonResultType);
                        }
                        charSequence3 = (CharSequence) mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$2;
                        c7s0Var2 = (c7s0) mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        CharSequence charSequence82 = (CharSequence) obj;
                        charSequence = charSequence3;
                        charSequence2 = charSequence82;
                        String str22 = c7s0Var2.d;
                        a = str22 != null ? mja1.a(str22, null, 6) : null;
                        qx20Var = c7s0Var2.c;
                        if (qx20Var != null || (formattedText2 = qx20Var.a) == null) {
                            charSequence4 = charSequence;
                            ovi0Var = a;
                            charSequence5 = null;
                            CharSequence charSequence7222 = charSequence2;
                            qx20Var2 = c7s0Var2.c;
                            if (qx20Var2 != null) {
                                modalButtonResultType = sx20Var.a();
                            }
                            return new x940(charSequence4, charSequence7222, ovi0Var, charSequence5, modalButtonResultType);
                        }
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$0 = c7s0Var2;
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$1 = null;
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$2 = charSequence;
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$3 = charSequence2;
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$4 = a;
                        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.label = 3;
                        Object i4 = ru.yandex.taxi.widget.c.i(cVar, formattedText2, null, mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1, 30);
                        if (i4 != coroutineSingletons) {
                            charSequence6 = charSequence;
                            c7s0Var3 = c7s0Var2;
                            obj = i4;
                            ovi0Var2 = a;
                            ovi0Var = ovi0Var2;
                            charSequence5 = (CharSequence) obj;
                            c7s0Var2 = c7s0Var3;
                            charSequence4 = charSequence6;
                            CharSequence charSequence72222 = charSequence2;
                            qx20Var2 = c7s0Var2.c;
                            if (qx20Var2 != null) {
                            }
                            return new x940(charSequence4, charSequence72222, ovi0Var, charSequence5, modalButtonResultType);
                        }
                        return coroutineSingletons;
                    }
                    c7s0Var4 = (c7s0) mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                charSequence = (CharSequence) obj;
                formattedText = c7s0Var4.b;
                if (formattedText == null) {
                }
            }
        }
        mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1 = new MtTrainCheckoutActionPopupInfoActionToStateMapper$map$1(this, continuationImpl);
        Object obj2 = mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtTrainCheckoutActionPopupInfoActionToStateMapper$map$1.label;
        ru.yandex.taxi.widget.c cVar2 = this.a;
        ModalButtonResultType modalButtonResultType2 = null;
        if (i != 0) {
        }
        charSequence = (CharSequence) obj2;
        formattedText = c7s0Var4.b;
        if (formattedText == null) {
        }
    }
}
