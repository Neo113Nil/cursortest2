package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.cart;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.b151;
import defpackage.fws0;
import defpackage.j6s;
import defpackage.jvs0;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.r1c;
import defpackage.r9x0;
import defpackage.sbv;
import defpackage.t09;
import defpackage.u09;
import defpackage.ul4;
import defpackage.v09;
import defpackage.w511;
import defpackage.x9x0;
import defpackage.y09;
import defpackage.y7m;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;

    public a(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
        this.b = q8sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x018c, code lost:
    
        if (r2 == r3) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00da, code lost:
    
        if (r2 == r3) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r4v6, types: [b151] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v09 v09Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        CartWidgetMapper$map$1 cartWidgetMapper$map$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        jvs0 jvs0Var;
        u09 u09Var;
        t09 t09Var;
        Object a;
        b151 b151Var;
        String str;
        v09 v09Var2;
        t09 t09Var2;
        jvs0 jvs0Var2;
        CharSequence charSequence;
        FormattedText formattedText;
        t09 t09Var3;
        CharSequence charSequence2;
        CharSequence charSequence3;
        FormattedText formattedText2;
        t09 t09Var4;
        t09 t09Var5;
        v09 v09Var3 = v09Var;
        if (continuationImpl instanceof CartWidgetMapper$map$1) {
            cartWidgetMapper$map$1 = (CartWidgetMapper$map$1) continuationImpl;
            int i2 = cartWidgetMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cartWidgetMapper$map$1.label = i2 - Integer.MIN_VALUE;
                CartWidgetMapper$map$1 cartWidgetMapper$map$12 = cartWidgetMapper$map$1;
                Object obj = cartWidgetMapper$map$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cartWidgetMapper$map$12.label;
                q8s q8sVar = this.b;
                CharSequence charSequence4 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    fws0 fws0Var = v09Var3.f;
                    if (fws0Var == null) {
                        jvs0Var = null;
                        r9x0 r9x0Var = v09Var3.g;
                        x9x0 x9x0Var = r9x0Var != null ? new x9x0(r9x0Var, null, null, null, 14) : jvs0Var instanceof r1c ? ((r1c) jvs0Var).b() : null;
                        String str2 = v09Var3.a;
                        u09Var = v09Var3.b;
                        if (u09Var == null) {
                            t09Var = null;
                        } else {
                            if (!(u09Var instanceof u09)) {
                                w511.b();
                                return null;
                            }
                            sbv sbvVar = u09Var.a;
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                            lvi0 g = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, sbvVar, null, null, 14);
                            String str3 = u09Var.b;
                            ldc f = str3 != null ? aVar.g.f(str3) : null;
                            y7m y7mVar = u09Var.c != null ? new y7m(r10.intValue()) : null;
                            ul4 ul4Var = u09Var.d;
                            t09Var = new t09(g, f, y7mVar, ul4Var != null ? aVar.c(ul4Var) : null);
                        }
                        FormattedText formattedText3 = v09Var3.c;
                        cartWidgetMapper$map$12.L$0 = v09Var3;
                        cartWidgetMapper$map$12.L$1 = null;
                        cartWidgetMapper$map$12.L$2 = jvs0Var;
                        cartWidgetMapper$map$12.L$3 = x9x0Var;
                        cartWidgetMapper$map$12.L$4 = str2;
                        cartWidgetMapper$map$12.L$5 = t09Var;
                        cartWidgetMapper$map$12.label = 2;
                        a = q8sVar.a(formattedText3, cartWidgetMapper$map$12);
                        if (a != coroutineSingletons) {
                            b151Var = x9x0Var;
                            str = str2;
                            v09Var2 = v09Var3;
                            t09Var2 = t09Var;
                            jvs0Var2 = jvs0Var;
                            obj = a;
                            charSequence = (CharSequence) obj;
                            formattedText = v09Var2.d;
                            if (formattedText == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    cartWidgetMapper$map$12.L$0 = v09Var3;
                    cartWidgetMapper$map$12.L$1 = null;
                    cartWidgetMapper$map$12.L$2 = null;
                    cartWidgetMapper$map$12.I$0 = 0;
                    cartWidgetMapper$map$12.label = 1;
                    obj = this.a.u(fws0Var, j6sVar, false, true, cartWidgetMapper$map$12);
                } else if (i == 1) {
                    v09Var3 = (v09) cartWidgetMapper$map$12.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            charSequence3 = (CharSequence) cartWidgetMapper$map$12.L$8;
                            charSequence2 = (CharSequence) cartWidgetMapper$map$12.L$7;
                            t09Var5 = (t09) cartWidgetMapper$map$12.L$6;
                            str = (String) cartWidgetMapper$map$12.L$5;
                            b151Var = (b151) cartWidgetMapper$map$12.L$3;
                            jvs0Var2 = (jvs0) cartWidgetMapper$map$12.L$2;
                            kotlin.b.b(obj);
                            charSequence4 = (CharSequence) obj;
                            t09Var4 = t09Var5;
                            return new y09(str, t09Var4, charSequence2, charSequence3, charSequence4, jvs0Var2, b151Var);
                        }
                        charSequence = (CharSequence) cartWidgetMapper$map$12.L$7;
                        t09Var2 = (t09) cartWidgetMapper$map$12.L$6;
                        str = (String) cartWidgetMapper$map$12.L$5;
                        b151Var = (b151) cartWidgetMapper$map$12.L$3;
                        jvs0Var2 = (jvs0) cartWidgetMapper$map$12.L$2;
                        v09Var2 = (v09) cartWidgetMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        t09 t09Var6 = t09Var2;
                        charSequence2 = charSequence;
                        charSequence3 = (CharSequence) obj;
                        t09Var3 = t09Var6;
                        formattedText2 = v09Var2.e;
                        if (formattedText2 != null) {
                            t09Var4 = t09Var3;
                            return new y09(str, t09Var4, charSequence2, charSequence3, charSequence4, jvs0Var2, b151Var);
                        }
                        cartWidgetMapper$map$12.L$0 = null;
                        cartWidgetMapper$map$12.L$1 = null;
                        cartWidgetMapper$map$12.L$2 = jvs0Var2;
                        cartWidgetMapper$map$12.L$3 = b151Var;
                        cartWidgetMapper$map$12.L$4 = null;
                        cartWidgetMapper$map$12.L$5 = str;
                        cartWidgetMapper$map$12.L$6 = t09Var3;
                        cartWidgetMapper$map$12.L$7 = charSequence2;
                        cartWidgetMapper$map$12.L$8 = charSequence3;
                        cartWidgetMapper$map$12.I$0 = 0;
                        cartWidgetMapper$map$12.label = 4;
                        Object a2 = q8sVar.a(formattedText2, cartWidgetMapper$map$12);
                        if (a2 != coroutineSingletons) {
                            t09Var5 = t09Var3;
                            obj = a2;
                            charSequence4 = (CharSequence) obj;
                            t09Var4 = t09Var5;
                            return new y09(str, t09Var4, charSequence2, charSequence3, charSequence4, jvs0Var2, b151Var);
                        }
                        return coroutineSingletons;
                    }
                    t09 t09Var7 = (t09) cartWidgetMapper$map$12.L$5;
                    String str4 = (String) cartWidgetMapper$map$12.L$4;
                    b151 b151Var2 = (b151) cartWidgetMapper$map$12.L$3;
                    jvs0 jvs0Var3 = (jvs0) cartWidgetMapper$map$12.L$2;
                    v09 v09Var4 = (v09) cartWidgetMapper$map$12.L$0;
                    kotlin.b.b(obj);
                    v09Var2 = v09Var4;
                    jvs0Var2 = jvs0Var3;
                    b151Var = b151Var2;
                    str = str4;
                    t09Var2 = t09Var7;
                    charSequence = (CharSequence) obj;
                    formattedText = v09Var2.d;
                    if (formattedText == null) {
                        cartWidgetMapper$map$12.L$0 = v09Var2;
                        cartWidgetMapper$map$12.L$1 = null;
                        cartWidgetMapper$map$12.L$2 = jvs0Var2;
                        cartWidgetMapper$map$12.L$3 = b151Var;
                        cartWidgetMapper$map$12.L$4 = null;
                        cartWidgetMapper$map$12.L$5 = str;
                        cartWidgetMapper$map$12.L$6 = t09Var2;
                        cartWidgetMapper$map$12.L$7 = charSequence;
                        cartWidgetMapper$map$12.I$0 = 0;
                        cartWidgetMapper$map$12.label = 3;
                        obj = q8sVar.a(formattedText, cartWidgetMapper$map$12);
                    } else {
                        t09Var3 = t09Var2;
                        charSequence2 = charSequence;
                        charSequence3 = null;
                        formattedText2 = v09Var2.e;
                        if (formattedText2 != null) {
                        }
                    }
                }
                jvs0Var = (jvs0) obj;
                r9x0 r9x0Var2 = v09Var3.g;
                x9x0 x9x0Var2 = r9x0Var2 != null ? new x9x0(r9x0Var2, null, null, null, 14) : jvs0Var instanceof r1c ? ((r1c) jvs0Var).b() : null;
                String str22 = v09Var3.a;
                u09Var = v09Var3.b;
                if (u09Var == null) {
                }
                FormattedText formattedText32 = v09Var3.c;
                cartWidgetMapper$map$12.L$0 = v09Var3;
                cartWidgetMapper$map$12.L$1 = null;
                cartWidgetMapper$map$12.L$2 = jvs0Var;
                cartWidgetMapper$map$12.L$3 = x9x0Var2;
                cartWidgetMapper$map$12.L$4 = str22;
                cartWidgetMapper$map$12.L$5 = t09Var;
                cartWidgetMapper$map$12.label = 2;
                a = q8sVar.a(formattedText32, cartWidgetMapper$map$12);
                if (a != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        cartWidgetMapper$map$1 = new CartWidgetMapper$map$1(this, continuationImpl);
        CartWidgetMapper$map$1 cartWidgetMapper$map$122 = cartWidgetMapper$map$1;
        Object obj2 = cartWidgetMapper$map$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cartWidgetMapper$map$122.label;
        q8s q8sVar2 = this.b;
        CharSequence charSequence42 = null;
        if (i != 0) {
        }
        jvs0Var = (jvs0) obj2;
        r9x0 r9x0Var22 = v09Var3.g;
        x9x0 x9x0Var22 = r9x0Var22 != null ? new x9x0(r9x0Var22, null, null, null, 14) : jvs0Var instanceof r1c ? ((r1c) jvs0Var).b() : null;
        String str222 = v09Var3.a;
        u09Var = v09Var3.b;
        if (u09Var == null) {
        }
        FormattedText formattedText322 = v09Var3.c;
        cartWidgetMapper$map$122.L$0 = v09Var3;
        cartWidgetMapper$map$122.L$1 = null;
        cartWidgetMapper$map$122.L$2 = jvs0Var;
        cartWidgetMapper$map$122.L$3 = x9x0Var22;
        cartWidgetMapper$map$122.L$4 = str222;
        cartWidgetMapper$map$122.L$5 = t09Var;
        cartWidgetMapper$map$122.label = 2;
        a = q8sVar2.a(formattedText322, cartWidgetMapper$map$122);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
