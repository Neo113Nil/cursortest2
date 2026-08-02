package ru.yandex.taxi.logistics.sdk.confirmation_modal_view.ui;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.e4e;
import defpackage.f030;
import defpackage.j330;
import defpackage.k330;
import defpackage.l330;
import defpackage.l7x0;
import defpackage.lvi0;
import defpackage.m330;
import defpackage.n330;
import defpackage.ny61;
import defpackage.o330;
import defpackage.q8s;
import defpackage.w511;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class c {
    public final l7x0 a;
    public final q8s b;

    public c(q8s q8sVar, l7x0 l7x0Var) {
        this.a = l7x0Var;
        this.b = q8sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r2 == r4) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f030 f030Var, ContinuationImpl continuationImpl) {
        ConfirmationModalViewStateMapper$map$1 confirmationModalViewStateMapper$map$1;
        int i;
        o330 o330Var;
        l330 l330Var;
        l330 l330Var2;
        f030 f030Var2;
        l330 l330Var3;
        Object b;
        l330 l330Var4;
        l330 l330Var5;
        Object b2;
        l330 l330Var6;
        l330 l330Var7;
        l330 l330Var8;
        f030 f030Var3;
        f030 f030Var4 = f030Var;
        if (continuationImpl instanceof ConfirmationModalViewStateMapper$map$1) {
            confirmationModalViewStateMapper$map$1 = (ConfirmationModalViewStateMapper$map$1) continuationImpl;
            int i2 = confirmationModalViewStateMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmationModalViewStateMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = confirmationModalViewStateMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmationModalViewStateMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    o330 o330Var2 = f030Var4.b;
                    confirmationModalViewStateMapper$map$1.L$0 = f030Var4;
                    confirmationModalViewStateMapper$map$1.label = 1;
                    obj = b(o330Var2, confirmationModalViewStateMapper$map$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            l330Var3 = (l330) confirmationModalViewStateMapper$map$1.L$1;
                            f030Var2 = (f030) confirmationModalViewStateMapper$map$1.L$0;
                            kotlin.b.b(obj);
                            l330Var2 = (l330) obj;
                            f030 f030Var5 = f030Var2;
                            l330Var = l330Var3;
                            f030Var4 = f030Var5;
                            o330 o330Var3 = f030Var4.e.a;
                            confirmationModalViewStateMapper$map$1.L$0 = f030Var4;
                            confirmationModalViewStateMapper$map$1.L$1 = l330Var;
                            confirmationModalViewStateMapper$map$1.L$2 = l330Var2;
                            confirmationModalViewStateMapper$map$1.label = 3;
                            b = b(o330Var3, confirmationModalViewStateMapper$map$1);
                            if (b != obj2) {
                                l330Var4 = l330Var;
                                l330Var5 = l330Var2;
                                obj = b;
                                l330 l330Var9 = l330Var4;
                                l330 l330Var10 = (l330) obj;
                                o330 o330Var4 = f030Var4.d.a;
                                confirmationModalViewStateMapper$map$1.L$0 = f030Var4;
                                confirmationModalViewStateMapper$map$1.L$1 = l330Var9;
                                confirmationModalViewStateMapper$map$1.L$2 = l330Var5;
                                confirmationModalViewStateMapper$map$1.L$3 = l330Var10;
                                confirmationModalViewStateMapper$map$1.label = 4;
                                b2 = b(o330Var4, confirmationModalViewStateMapper$map$1);
                                if (b2 != obj2) {
                                }
                            }
                            return obj2;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            l330 l330Var11 = (l330) confirmationModalViewStateMapper$map$1.L$3;
                            l330 l330Var12 = (l330) confirmationModalViewStateMapper$map$1.L$2;
                            l330 l330Var13 = (l330) confirmationModalViewStateMapper$map$1.L$1;
                            f030Var3 = (f030) confirmationModalViewStateMapper$map$1.L$0;
                            kotlin.b.b(obj);
                            l330Var6 = l330Var11;
                            l330Var7 = l330Var12;
                            l330Var8 = l330Var13;
                            l330 l330Var14 = (l330) obj;
                            String str = f030Var3.a;
                            return new e4e(str == null ? new lvi0(this.a.a(str), null, null, null, null, 62) : null, l330Var8, l330Var7, l330Var14, l330Var6);
                        }
                        l330 l330Var15 = (l330) confirmationModalViewStateMapper$map$1.L$2;
                        l330 l330Var16 = (l330) confirmationModalViewStateMapper$map$1.L$1;
                        f030 f030Var6 = (f030) confirmationModalViewStateMapper$map$1.L$0;
                        kotlin.b.b(obj);
                        l330Var4 = l330Var16;
                        l330Var5 = l330Var15;
                        f030Var4 = f030Var6;
                        l330 l330Var92 = l330Var4;
                        l330 l330Var102 = (l330) obj;
                        o330 o330Var42 = f030Var4.d.a;
                        confirmationModalViewStateMapper$map$1.L$0 = f030Var4;
                        confirmationModalViewStateMapper$map$1.L$1 = l330Var92;
                        confirmationModalViewStateMapper$map$1.L$2 = l330Var5;
                        confirmationModalViewStateMapper$map$1.L$3 = l330Var102;
                        confirmationModalViewStateMapper$map$1.label = 4;
                        b2 = b(o330Var42, confirmationModalViewStateMapper$map$1);
                        if (b2 != obj2) {
                            l330Var6 = l330Var102;
                            obj = b2;
                            l330Var7 = l330Var5;
                            l330Var8 = l330Var92;
                            f030Var3 = f030Var4;
                            l330 l330Var142 = (l330) obj;
                            String str2 = f030Var3.a;
                            return new e4e(str2 == null ? new lvi0(this.a.a(str2), null, null, null, null, 62) : null, l330Var8, l330Var7, l330Var142, l330Var6);
                        }
                        return obj2;
                    }
                    f030Var4 = (f030) confirmationModalViewStateMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                l330 l330Var17 = (l330) obj;
                o330Var = f030Var4.c;
                if (o330Var != null) {
                    l330Var = l330Var17;
                    l330Var2 = null;
                    o330 o330Var32 = f030Var4.e.a;
                    confirmationModalViewStateMapper$map$1.L$0 = f030Var4;
                    confirmationModalViewStateMapper$map$1.L$1 = l330Var;
                    confirmationModalViewStateMapper$map$1.L$2 = l330Var2;
                    confirmationModalViewStateMapper$map$1.label = 3;
                    b = b(o330Var32, confirmationModalViewStateMapper$map$1);
                    if (b != obj2) {
                    }
                    return obj2;
                }
                confirmationModalViewStateMapper$map$1.L$0 = f030Var4;
                confirmationModalViewStateMapper$map$1.L$1 = l330Var17;
                confirmationModalViewStateMapper$map$1.L$2 = null;
                confirmationModalViewStateMapper$map$1.I$0 = 0;
                confirmationModalViewStateMapper$map$1.label = 2;
                Object b3 = b(o330Var, confirmationModalViewStateMapper$map$1);
                if (b3 != obj2) {
                    f030Var2 = f030Var4;
                    l330Var3 = l330Var17;
                    obj = b3;
                    l330Var2 = (l330) obj;
                    f030 f030Var52 = f030Var2;
                    l330Var = l330Var3;
                    f030Var4 = f030Var52;
                    o330 o330Var322 = f030Var4.e.a;
                    confirmationModalViewStateMapper$map$1.L$0 = f030Var4;
                    confirmationModalViewStateMapper$map$1.L$1 = l330Var;
                    confirmationModalViewStateMapper$map$1.L$2 = l330Var2;
                    confirmationModalViewStateMapper$map$1.label = 3;
                    b = b(o330Var322, confirmationModalViewStateMapper$map$1);
                    if (b != obj2) {
                    }
                }
                return obj2;
            }
        }
        confirmationModalViewStateMapper$map$1 = new ConfirmationModalViewStateMapper$map$1(this, continuationImpl);
        Object obj3 = confirmationModalViewStateMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmationModalViewStateMapper$map$1.label;
        if (i != 0) {
        }
        l330 l330Var172 = (l330) obj3;
        o330Var = f030Var4.c;
        if (o330Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(o330 o330Var, ContinuationImpl continuationImpl) {
        ConfirmationModalViewStateMapper$mapText$1 confirmationModalViewStateMapper$mapText$1;
        int i;
        if (continuationImpl instanceof ConfirmationModalViewStateMapper$mapText$1) {
            confirmationModalViewStateMapper$mapText$1 = (ConfirmationModalViewStateMapper$mapText$1) continuationImpl;
            int i2 = confirmationModalViewStateMapper$mapText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                confirmationModalViewStateMapper$mapText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = confirmationModalViewStateMapper$mapText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = confirmationModalViewStateMapper$mapText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(o330Var instanceof m330)) {
                        if (o330Var instanceof n330) {
                            return new k330(((n330) o330Var).a);
                        }
                        w511.b();
                        return null;
                    }
                    FormattedText formattedText = ((m330) o330Var).a;
                    confirmationModalViewStateMapper$mapText$1.L$0 = null;
                    confirmationModalViewStateMapper$mapText$1.label = 1;
                    obj = this.b.a(formattedText, confirmationModalViewStateMapper$mapText$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new j330((CharSequence) obj);
            }
        }
        confirmationModalViewStateMapper$mapText$1 = new ConfirmationModalViewStateMapper$mapText$1(this, continuationImpl);
        Object obj2 = confirmationModalViewStateMapper$mapText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = confirmationModalViewStateMapper$mapText$1.label;
        if (i != 0) {
        }
        return new j330((CharSequence) obj2);
    }
}
