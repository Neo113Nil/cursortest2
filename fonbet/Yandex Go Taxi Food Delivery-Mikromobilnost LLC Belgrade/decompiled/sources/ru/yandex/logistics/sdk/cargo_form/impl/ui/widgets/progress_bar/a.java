package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.progress_bar;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.an91;
import defpackage.bif0;
import defpackage.dif0;
import defpackage.eif0;
import defpackage.fif0;
import defpackage.g8a1;
import defpackage.hjf0;
import defpackage.l690;
import defpackage.ldc;
import defpackage.ny61;
import defpackage.o690;
import defpackage.q8s;
import defpackage.rg90;
import defpackage.uhf0;
import defpackage.w511;
import defpackage.zhf0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.logistics.sdk.ui_models.progress_bar.PartialProgressBarStyleSides;

/* loaded from: classes5.dex */
public final class a {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public a(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = q8sVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(hjf0 hjf0Var, ContinuationImpl continuationImpl) {
        ProgressBarMapper$map$1 progressBarMapper$map$1;
        int i;
        bif0 bif0Var;
        rg90 rg90Var;
        rg90 rg90Var2;
        Object obj;
        rg90 rg90Var3;
        PartialProgressBarStyleSides partialProgressBarStyleSides;
        String str;
        o690 o690Var;
        l690 b;
        hjf0 hjf0Var2 = hjf0Var;
        if (continuationImpl instanceof ProgressBarMapper$map$1) {
            progressBarMapper$map$1 = (ProgressBarMapper$map$1) continuationImpl;
            int i2 = progressBarMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                progressBarMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = progressBarMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = progressBarMapper$map$1.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b;
                CharSequence charSequence = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    bif0Var = hjf0Var2.b;
                    if (bif0Var != null) {
                        g8a1 g8a1Var = bif0Var.d;
                        if (g8a1Var instanceof eif0) {
                            eif0 eif0Var = (eif0) g8a1Var;
                            ldc f = aVar.g.f(eif0Var.b);
                            long j = f != null ? f.a : ldc.b;
                            ldc f2 = aVar.g.f(eif0Var.c);
                            long j2 = f2 != null ? f2.a : ldc.g;
                            int i3 = uhf0.a[eif0Var.e.ordinal()];
                            if (i3 == 1) {
                                partialProgressBarStyleSides = PartialProgressBarStyleSides.ROUNDED;
                            } else {
                                if (i3 != 2) {
                                    w511.b();
                                    return null;
                                }
                                partialProgressBarStyleSides = PartialProgressBarStyleSides.SQUARE;
                            }
                            rg90Var = new rg90(j, j2, eif0Var.d, partialProgressBarStyleSides, eif0Var.f);
                        } else {
                            if (!(g8a1Var instanceof fif0)) {
                                w511.b();
                                return null;
                            }
                            rg90Var = null;
                        }
                        if (rg90Var != null) {
                            FormattedText formattedText = bif0Var.a;
                            if (formattedText == null) {
                                rg90Var2 = rg90Var;
                                double d = bif0Var.b;
                                str = bif0Var.c;
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = str;
                                o690Var = bif0Var.e;
                                if (o690Var != null) {
                                    aVar.getClass();
                                    b = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                                } else {
                                    b = an91.b(0.0f, 0.0f, 3);
                                }
                                return new zhf0(new dif0(charSequence, d, str2, rg90Var2, b), hjf0Var2.c, hjf0Var2.a);
                            }
                            progressBarMapper$map$1.L$0 = hjf0Var2;
                            progressBarMapper$map$1.L$1 = bif0Var;
                            progressBarMapper$map$1.L$2 = rg90Var;
                            progressBarMapper$map$1.L$3 = null;
                            progressBarMapper$map$1.I$0 = 0;
                            progressBarMapper$map$1.label = 1;
                            Object a = this.a.a(formattedText, progressBarMapper$map$1);
                            if (a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            obj = a;
                            rg90Var3 = rg90Var;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rg90Var3 = (rg90) progressBarMapper$map$1.L$2;
                bif0 bif0Var2 = (bif0) progressBarMapper$map$1.L$1;
                hjf0 hjf0Var3 = (hjf0) progressBarMapper$map$1.L$0;
                kotlin.b.b(obj2);
                bif0Var = bif0Var2;
                hjf0Var2 = hjf0Var3;
                obj = obj2;
                charSequence = (CharSequence) obj;
                rg90Var2 = rg90Var3;
                double d2 = bif0Var.b;
                str = bif0Var.c;
                if (str == null) {
                }
                String str22 = str;
                o690Var = bif0Var.e;
                if (o690Var != null) {
                }
                return new zhf0(new dif0(charSequence, d2, str22, rg90Var2, b), hjf0Var2.c, hjf0Var2.a);
            }
        }
        progressBarMapper$map$1 = new ProgressBarMapper$map$1(this, continuationImpl);
        Object obj22 = progressBarMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = progressBarMapper$map$1.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.b;
        CharSequence charSequence2 = null;
        if (i != 0) {
        }
        charSequence2 = (CharSequence) obj;
        rg90Var2 = rg90Var3;
        double d22 = bif0Var.b;
        str = bif0Var.c;
        if (str == null) {
        }
        String str222 = str;
        o690Var = bif0Var.e;
        if (o690Var != null) {
        }
        return new zhf0(new dif0(charSequence2, d22, str222, rg90Var2, b), hjf0Var2.c, hjf0Var2.a);
    }
}
