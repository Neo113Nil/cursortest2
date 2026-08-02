package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.numeric_input;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.avu0;
import defpackage.b64;
import defpackage.co60;
import defpackage.do60;
import defpackage.j6s;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.sbv;
import defpackage.tky0;
import defpackage.w511;
import defpackage.x0w;
import defpackage.y0w;
import defpackage.z0w;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = q8sVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j6s j6sVar, do60 do60Var, ContinuationImpl continuationImpl) {
        NumericInputMapper$map$1 numericInputMapper$map$1;
        int i;
        String str;
        String str2;
        CharSequence charSequence;
        x0w x0wVar;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        FormattedText formattedText;
        Object a;
        z0w z0wVar;
        int i2;
        do60 do60Var2 = do60Var;
        if (continuationImpl instanceof NumericInputMapper$map$1) {
            numericInputMapper$map$1 = (NumericInputMapper$map$1) continuationImpl;
            int i3 = numericInputMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                numericInputMapper$map$1.label = i3 - Integer.MIN_VALUE;
                Object obj = numericInputMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = numericInputMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Map map = j6sVar.a;
                    String str3 = do60Var2.d;
                    z0w z0wVar2 = do60Var2.h;
                    Object obj2 = map.get(str3);
                    str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        str = "";
                    }
                    if (z0wVar2 instanceof x0w) {
                        BigDecimal h = avu0.h(str);
                        int i4 = (h != null && (((bigDecimal = (x0wVar = (x0w) z0wVar2).a) != null && bigDecimal.compareTo(h) > 0) || ((bigDecimal2 = x0wVar.b) != null && bigDecimal2.compareTo(h) < 0))) ? 1 : 0;
                        if (i4 != 0 && (formattedText = ((x0w) z0wVar2).c) != null) {
                            numericInputMapper$map$1.L$0 = null;
                            numericInputMapper$map$1.L$1 = do60Var2;
                            numericInputMapper$map$1.L$2 = str;
                            numericInputMapper$map$1.L$3 = null;
                            numericInputMapper$map$1.L$4 = null;
                            numericInputMapper$map$1.I$0 = i4;
                            numericInputMapper$map$1.I$1 = 0;
                            numericInputMapper$map$1.label = 1;
                            a = this.a.a(formattedText, numericInputMapper$map$1);
                            if (a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else if (!(z0wVar2 instanceof y0w)) {
                        w511.b();
                        return null;
                    }
                    str2 = str;
                    charSequence = null;
                    String str4 = do60Var2.b;
                    String str5 = do60Var2.c;
                    sbv sbvVar = do60Var2.e;
                    lvi0 g = sbvVar != null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(this.b, sbvVar, null, null, 14) : null;
                    boolean z = do60Var2.f;
                    String str6 = do60Var2.d;
                    String str7 = do60Var2.a;
                    String str8 = do60Var2.g;
                    tky0 tky0Var = new tky0(str6, true, null, str7, str8);
                    String j = b64.j(str8, "More");
                    z0wVar = do60Var2.h;
                    if (z0wVar instanceof x0w) {
                        i2 = 3;
                    } else {
                        if (!(z0wVar instanceof y0w)) {
                            w511.b();
                            return null;
                        }
                        i2 = 4;
                    }
                    return new co60(str2, str4, str5, charSequence, g, z, tky0Var, str8, j, i2, do60Var2.a);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str9 = (String) numericInputMapper$map$1.L$2;
                do60 do60Var3 = (do60) numericInputMapper$map$1.L$1;
                kotlin.b.b(obj);
                a = obj;
                str = str9;
                do60Var2 = do60Var3;
                str2 = str;
                charSequence = (CharSequence) a;
                String str42 = do60Var2.b;
                String str52 = do60Var2.c;
                sbv sbvVar2 = do60Var2.e;
                if (sbvVar2 != null) {
                }
                boolean z2 = do60Var2.f;
                String str62 = do60Var2.d;
                String str72 = do60Var2.a;
                String str82 = do60Var2.g;
                tky0 tky0Var2 = new tky0(str62, true, null, str72, str82);
                String j2 = b64.j(str82, "More");
                z0wVar = do60Var2.h;
                if (z0wVar instanceof x0w) {
                }
                return new co60(str2, str42, str52, charSequence, g, z2, tky0Var2, str82, j2, i2, do60Var2.a);
            }
        }
        numericInputMapper$map$1 = new NumericInputMapper$map$1(this, continuationImpl);
        Object obj3 = numericInputMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = numericInputMapper$map$1.label;
        if (i != 0) {
        }
        str2 = str;
        charSequence = (CharSequence) a;
        String str422 = do60Var2.b;
        String str522 = do60Var2.c;
        sbv sbvVar22 = do60Var2.e;
        if (sbvVar22 != null) {
        }
        boolean z22 = do60Var2.f;
        String str622 = do60Var2.d;
        String str722 = do60Var2.a;
        String str822 = do60Var2.g;
        tky0 tky0Var22 = new tky0(str622, true, null, str722, str822);
        String j22 = b64.j(str822, "More");
        z0wVar = do60Var2.h;
        if (z0wVar instanceof x0w) {
        }
        return new co60(str2, str422, str522, charSequence, g, z22, tky0Var22, str822, j22, i2, do60Var2.a);
    }
}
