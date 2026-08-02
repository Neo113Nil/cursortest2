package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.an91;
import defpackage.cy8;
import defpackage.l690;
import defpackage.mx8;
import defpackage.nx8;
import defpackage.ny61;
import defpackage.o690;
import defpackage.q8s;
import defpackage.r9x0;
import defpackage.rh4;
import defpackage.ry8;
import defpackage.sy8;
import defpackage.tcc;
import defpackage.vx8;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.zh4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;

/* loaded from: classes5.dex */
public final class c {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public c(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = q8sVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0098 -> B:10:0x009b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sy8 sy8Var, ContinuationImpl continuationImpl) {
        CarouselItemsMapper$map$1 carouselItemsMapper$map$1;
        int i;
        sy8 sy8Var2;
        Iterator it;
        int i2;
        Collection collection;
        int i3;
        l690 b;
        if (continuationImpl instanceof CarouselItemsMapper$map$1) {
            carouselItemsMapper$map$1 = (CarouselItemsMapper$map$1) continuationImpl;
            int i4 = carouselItemsMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                carouselItemsMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj = carouselItemsMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carouselItemsMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sy8Var2 = sy8Var;
                    ArrayList arrayList = sy8Var2.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    i2 = 0;
                    collection = arrayList2;
                    i3 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = carouselItemsMapper$map$1.I$1;
                    i3 = carouselItemsMapper$map$1.I$0;
                    collection = (Collection) carouselItemsMapper$map$1.L$7;
                    it = (Iterator) carouselItemsMapper$map$1.L$4;
                    Collection collection2 = (Collection) carouselItemsMapper$map$1.L$3;
                    sy8 sy8Var3 = (sy8) carouselItemsMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    collection.add((cy8) obj);
                    collection = collection2;
                    sy8Var2 = sy8Var3;
                    if (it.hasNext()) {
                        vx8 vx8Var = (vx8) it.next();
                        carouselItemsMapper$map$1.L$0 = sy8Var2;
                        carouselItemsMapper$map$1.L$1 = null;
                        carouselItemsMapper$map$1.L$2 = null;
                        carouselItemsMapper$map$1.L$3 = collection;
                        carouselItemsMapper$map$1.L$4 = it;
                        carouselItemsMapper$map$1.L$5 = null;
                        carouselItemsMapper$map$1.L$6 = null;
                        carouselItemsMapper$map$1.L$7 = collection;
                        carouselItemsMapper$map$1.I$0 = i3;
                        carouselItemsMapper$map$1.I$1 = i2;
                        carouselItemsMapper$map$1.I$2 = 0;
                        carouselItemsMapper$map$1.label = 1;
                        Object b2 = b(vx8Var, carouselItemsMapper$map$1);
                        if (b2 == obj2) {
                            return obj2;
                        }
                        sy8Var3 = sy8Var2;
                        obj = b2;
                        collection2 = collection;
                        collection.add((cy8) obj);
                        collection = collection2;
                        sy8Var2 = sy8Var3;
                        if (it.hasNext()) {
                            List list = (List) collection;
                            float f = sy8Var2.c;
                            o690 o690Var = sy8Var2.d;
                            ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b;
                            if (o690Var != null) {
                                aVar.getClass();
                                b = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                            } else {
                                b = an91.b(0.0f, 0.0f, 3);
                            }
                            l690 l690Var = b;
                            mx8 mx8Var = sy8Var2.e;
                            return new ry8(list, f, l690Var, mx8Var != null ? new nx8(aVar.g.f(mx8Var.a), aVar.g.f(mx8Var.b)) : null, sy8Var2.f != null ? new Long(r0.intValue() * 1000) : null, sy8Var2.g, sy8Var2.a);
                        }
                    }
                }
            }
        }
        carouselItemsMapper$map$1 = new CarouselItemsMapper$map$1(this, continuationImpl);
        Object obj3 = carouselItemsMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carouselItemsMapper$map$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r2 == r4) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(vx8 vx8Var, ContinuationImpl continuationImpl) {
        CarouselItemsMapper$mapCarouselItem$1 carouselItemsMapper$mapCarouselItem$1;
        int i;
        FormattedText formattedText;
        CharSequence charSequence;
        CharSequence charSequence2;
        vx8 vx8Var2;
        CharSequence charSequence3;
        o690 o690Var;
        l690 b;
        vx8 vx8Var3 = vx8Var;
        if (continuationImpl instanceof CarouselItemsMapper$mapCarouselItem$1) {
            carouselItemsMapper$mapCarouselItem$1 = (CarouselItemsMapper$mapCarouselItem$1) continuationImpl;
            int i2 = carouselItemsMapper$mapCarouselItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                carouselItemsMapper$mapCarouselItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = carouselItemsMapper$mapCarouselItem$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = carouselItemsMapper$mapCarouselItem$1.label;
                q8s q8sVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText2 = vx8Var3.a;
                    carouselItemsMapper$mapCarouselItem$1.L$0 = vx8Var3;
                    carouselItemsMapper$mapCarouselItem$1.label = 1;
                    obj = q8sVar.a(formattedText2, carouselItemsMapper$mapCarouselItem$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        charSequence3 = (CharSequence) carouselItemsMapper$mapCarouselItem$1.L$2;
                        vx8Var2 = (vx8) carouselItemsMapper$mapCarouselItem$1.L$0;
                        kotlin.b.b(obj);
                        charSequence = charSequence3;
                        charSequence2 = (CharSequence) obj;
                        vx8Var3 = vx8Var2;
                        ContentAlignment contentAlignment = vx8Var3.c;
                        x2s x2sVar = vx8Var3.g;
                        o690Var = vx8Var3.d;
                        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b;
                        if (o690Var != null) {
                            aVar.getClass();
                            b = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                        } else {
                            b = an91.b(0.0f, 0.0f, 3);
                        }
                        l690 l690Var = b;
                        rh4 rh4Var = vx8Var3.e;
                        zh4 a = rh4Var != null ? aVar.a(rh4Var) : null;
                        r9x0 r9x0Var = vx8Var3.f;
                        return new cy8(charSequence, charSequence2, contentAlignment, l690Var, a, r9x0Var != null ? new x9x0(r9x0Var, null, null, x2sVar, 6) : null, x2sVar);
                    }
                    vx8Var3 = (vx8) carouselItemsMapper$mapCarouselItem$1.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence4 = (CharSequence) obj;
                formattedText = vx8Var3.b;
                if (formattedText != null) {
                    charSequence = charSequence4;
                    charSequence2 = null;
                    ContentAlignment contentAlignment2 = vx8Var3.c;
                    x2s x2sVar2 = vx8Var3.g;
                    o690Var = vx8Var3.d;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.b;
                    if (o690Var != null) {
                    }
                    l690 l690Var2 = b;
                    rh4 rh4Var2 = vx8Var3.e;
                    if (rh4Var2 != null) {
                    }
                    r9x0 r9x0Var2 = vx8Var3.f;
                    return new cy8(charSequence, charSequence2, contentAlignment2, l690Var2, a, r9x0Var2 != null ? new x9x0(r9x0Var2, null, null, x2sVar2, 6) : null, x2sVar2);
                }
                carouselItemsMapper$mapCarouselItem$1.L$0 = vx8Var3;
                carouselItemsMapper$mapCarouselItem$1.L$1 = null;
                carouselItemsMapper$mapCarouselItem$1.L$2 = charSequence4;
                carouselItemsMapper$mapCarouselItem$1.I$0 = 0;
                carouselItemsMapper$mapCarouselItem$1.label = 2;
                Object a2 = q8sVar.a(formattedText, carouselItemsMapper$mapCarouselItem$1);
                if (a2 != coroutineSingletons) {
                    vx8Var2 = vx8Var3;
                    charSequence3 = charSequence4;
                    obj = a2;
                    charSequence = charSequence3;
                    charSequence2 = (CharSequence) obj;
                    vx8Var3 = vx8Var2;
                    ContentAlignment contentAlignment22 = vx8Var3.c;
                    x2s x2sVar22 = vx8Var3.g;
                    o690Var = vx8Var3.d;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar22 = this.b;
                    if (o690Var != null) {
                    }
                    l690 l690Var22 = b;
                    rh4 rh4Var22 = vx8Var3.e;
                    if (rh4Var22 != null) {
                    }
                    r9x0 r9x0Var22 = vx8Var3.f;
                    return new cy8(charSequence, charSequence2, contentAlignment22, l690Var22, a, r9x0Var22 != null ? new x9x0(r9x0Var22, null, null, x2sVar22, 6) : null, x2sVar22);
                }
                return coroutineSingletons;
            }
        }
        carouselItemsMapper$mapCarouselItem$1 = new CarouselItemsMapper$mapCarouselItem$1(this, continuationImpl);
        Object obj2 = carouselItemsMapper$mapCarouselItem$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = carouselItemsMapper$mapCarouselItem$1.label;
        q8s q8sVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj2;
        formattedText = vx8Var3.b;
        if (formattedText != null) {
        }
    }
}
