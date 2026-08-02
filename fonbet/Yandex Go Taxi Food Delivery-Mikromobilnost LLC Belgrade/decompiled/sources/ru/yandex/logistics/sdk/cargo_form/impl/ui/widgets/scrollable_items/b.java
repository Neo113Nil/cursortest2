package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.bkp0;
import defpackage.ckp0;
import defpackage.dkp0;
import defpackage.kvi0;
import defpackage.ldc;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.pzg0;
import defpackage.q8s;
import defpackage.r9x0;
import defpackage.tcc;
import defpackage.w511;
import defpackage.wjp0;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.xjp0;
import defpackage.yjp0;
import defpackage.zjp0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ScrollableItemBadge$Anchor;

/* loaded from: classes5.dex */
public final class b {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = q8sVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(dkp0 dkp0Var, ContinuationImpl continuationImpl) {
        ScrollableItemsMapper$map$1 scrollableItemsMapper$map$1;
        int i;
        if (continuationImpl instanceof ScrollableItemsMapper$map$1) {
            scrollableItemsMapper$map$1 = (ScrollableItemsMapper$map$1) continuationImpl;
            int i2 = scrollableItemsMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scrollableItemsMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scrollableItemsMapper$map$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollableItemsMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList = dkp0Var.b;
                    scrollableItemsMapper$map$1.L$0 = dkp0Var;
                    scrollableItemsMapper$map$1.label = 1;
                    obj = b(arrayList, scrollableItemsMapper$map$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dkp0Var = (dkp0) scrollableItemsMapper$map$1.L$0;
                    kotlin.b.b(obj);
                }
                return new ckp0((List) obj, dkp0Var.c, dkp0Var.a);
            }
        }
        scrollableItemsMapper$map$1 = new ScrollableItemsMapper$map$1(this, continuationImpl);
        Object obj3 = scrollableItemsMapper$map$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollableItemsMapper$map$1.label;
        if (i != 0) {
        }
        return new ckp0((List) obj3, dkp0Var.c, dkp0Var.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01bc -> B:12:0x01c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01cf -> B:13:0x01cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        ScrollableItemsMapper$mapItems$1 scrollableItemsMapper$mapItems$1;
        int i;
        Collection arrayList2;
        Iterator it;
        int i2;
        int i3;
        wjp0 wjp0Var;
        yjp0 yjp0Var;
        Collection collection;
        int i4;
        Collection collection2;
        int i5;
        int i6;
        FormattedText formattedText;
        yjp0 yjp0Var2;
        wjp0 wjp0Var2;
        int i7;
        Collection collection3;
        Object a;
        Collection collection4;
        xjp0 xjp0Var;
        int i8;
        ScrollableItemBadgeModel$Anchor scrollableItemBadgeModel$Anchor;
        if (continuationImpl instanceof ScrollableItemsMapper$mapItems$1) {
            scrollableItemsMapper$mapItems$1 = (ScrollableItemsMapper$mapItems$1) continuationImpl;
            int i9 = scrollableItemsMapper$mapItems$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                scrollableItemsMapper$mapItems$1.label = i9 - Integer.MIN_VALUE;
                Object obj = scrollableItemsMapper$mapItems$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollableItemsMapper$mapItems$1.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b;
                q8s q8sVar = this.a;
                int i10 = 0;
                if (i != 0) {
                    kotlin.b.b(obj);
                    arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    it = arrayList.iterator();
                    i2 = 0;
                    i3 = 0;
                    if (!it.hasNext()) {
                    }
                } else {
                    if (i == 1) {
                        i7 = scrollableItemsMapper$mapItems$1.I$2;
                        i2 = scrollableItemsMapper$mapItems$1.I$1;
                        i3 = scrollableItemsMapper$mapItems$1.I$0;
                        arrayList2 = (Collection) scrollableItemsMapper$mapItems$1.L$8;
                        xjp0Var = (xjp0) scrollableItemsMapper$mapItems$1.L$7;
                        wjp0Var2 = (wjp0) scrollableItemsMapper$mapItems$1.L$6;
                        it = (Iterator) scrollableItemsMapper$mapItems$1.L$4;
                        collection4 = (Collection) scrollableItemsMapper$mapItems$1.L$3;
                        kotlin.b.b(obj);
                        CharSequence charSequence = (CharSequence) obj;
                        ldc f = aVar.g.f(xjp0Var.b);
                        ScrollableItemBadge$Anchor scrollableItemBadge$Anchor = xjp0Var.c;
                        if (scrollableItemBadge$Anchor != null) {
                        }
                        if (i8 == -1) {
                        }
                        yjp0Var2 = new yjp0(charSequence, f, scrollableItemBadgeModel$Anchor);
                        collection3 = arrayList2;
                        arrayList2 = collection4;
                        FormattedText formattedText2 = wjp0Var2.a;
                        scrollableItemsMapper$mapItems$1.L$0 = null;
                        scrollableItemsMapper$mapItems$1.L$1 = null;
                        scrollableItemsMapper$mapItems$1.L$2 = null;
                        scrollableItemsMapper$mapItems$1.L$3 = arrayList2;
                        scrollableItemsMapper$mapItems$1.L$4 = it;
                        scrollableItemsMapper$mapItems$1.L$5 = null;
                        scrollableItemsMapper$mapItems$1.L$6 = wjp0Var2;
                        scrollableItemsMapper$mapItems$1.L$7 = yjp0Var2;
                        scrollableItemsMapper$mapItems$1.L$8 = collection3;
                        scrollableItemsMapper$mapItems$1.L$9 = null;
                        scrollableItemsMapper$mapItems$1.L$10 = null;
                        scrollableItemsMapper$mapItems$1.I$0 = i3;
                        scrollableItemsMapper$mapItems$1.I$1 = i2;
                        scrollableItemsMapper$mapItems$1.I$2 = i7;
                        scrollableItemsMapper$mapItems$1.label = 2;
                        a = q8sVar.a(formattedText2, scrollableItemsMapper$mapItems$1);
                        if (a != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i6 = scrollableItemsMapper$mapItems$1.I$1;
                        int i11 = scrollableItemsMapper$mapItems$1.I$0;
                        collection = (Collection) scrollableItemsMapper$mapItems$1.L$10;
                        CharSequence charSequence2 = (CharSequence) scrollableItemsMapper$mapItems$1.L$9;
                        yjp0Var = (yjp0) scrollableItemsMapper$mapItems$1.L$8;
                        wjp0Var = (wjp0) scrollableItemsMapper$mapItems$1.L$6;
                        Iterator it2 = (Iterator) scrollableItemsMapper$mapItems$1.L$4;
                        collection2 = (Collection) scrollableItemsMapper$mapItems$1.L$3;
                        kotlin.b.b(obj);
                        i4 = i11;
                        CharSequence charSequence3 = charSequence2;
                        it = it2;
                        int i12 = i4;
                        arrayList2 = collection2;
                        i3 = i12;
                        CharSequence charSequence4 = (CharSequence) obj;
                        CharSequence charSequence5 = charSequence3;
                        yjp0 yjp0Var3 = yjp0Var;
                        ldc f2 = aVar.g.f(wjp0Var.c);
                        lvi0 g = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, wjp0Var.d, new kvi0(pzg0.promo_cards_noimg), null, 12);
                        r9x0 r9x0Var = wjp0Var.e;
                        x2s x2sVar = wjp0Var.g;
                        collection.add(new zjp0(charSequence5, charSequence4, f2, g, new x9x0(r9x0Var, null, null, x2sVar, 6), x2sVar, yjp0Var3));
                        i2 = i6;
                        i10 = 0;
                        if (!it.hasNext()) {
                            return (List) arrayList2;
                        }
                        wjp0Var2 = (wjp0) it.next();
                        xjp0Var = wjp0Var2.f;
                        if (xjp0Var == null) {
                            collection3 = arrayList2;
                            yjp0Var2 = null;
                            i7 = 0;
                            FormattedText formattedText22 = wjp0Var2.a;
                            scrollableItemsMapper$mapItems$1.L$0 = null;
                            scrollableItemsMapper$mapItems$1.L$1 = null;
                            scrollableItemsMapper$mapItems$1.L$2 = null;
                            scrollableItemsMapper$mapItems$1.L$3 = arrayList2;
                            scrollableItemsMapper$mapItems$1.L$4 = it;
                            scrollableItemsMapper$mapItems$1.L$5 = null;
                            scrollableItemsMapper$mapItems$1.L$6 = wjp0Var2;
                            scrollableItemsMapper$mapItems$1.L$7 = yjp0Var2;
                            scrollableItemsMapper$mapItems$1.L$8 = collection3;
                            scrollableItemsMapper$mapItems$1.L$9 = null;
                            scrollableItemsMapper$mapItems$1.L$10 = null;
                            scrollableItemsMapper$mapItems$1.I$0 = i3;
                            scrollableItemsMapper$mapItems$1.I$1 = i2;
                            scrollableItemsMapper$mapItems$1.I$2 = i7;
                            scrollableItemsMapper$mapItems$1.label = 2;
                            a = q8sVar.a(formattedText22, scrollableItemsMapper$mapItems$1);
                            if (a != coroutineSingletons) {
                            }
                            return coroutineSingletons;
                        }
                        FormattedText formattedText3 = xjp0Var.a;
                        scrollableItemsMapper$mapItems$1.L$0 = null;
                        scrollableItemsMapper$mapItems$1.L$1 = null;
                        scrollableItemsMapper$mapItems$1.L$2 = null;
                        scrollableItemsMapper$mapItems$1.L$3 = arrayList2;
                        scrollableItemsMapper$mapItems$1.L$4 = it;
                        scrollableItemsMapper$mapItems$1.L$5 = null;
                        scrollableItemsMapper$mapItems$1.L$6 = wjp0Var2;
                        scrollableItemsMapper$mapItems$1.L$7 = xjp0Var;
                        scrollableItemsMapper$mapItems$1.L$8 = arrayList2;
                        scrollableItemsMapper$mapItems$1.L$9 = null;
                        scrollableItemsMapper$mapItems$1.L$10 = null;
                        scrollableItemsMapper$mapItems$1.I$0 = i3;
                        scrollableItemsMapper$mapItems$1.I$1 = i2;
                        scrollableItemsMapper$mapItems$1.I$2 = i10;
                        scrollableItemsMapper$mapItems$1.I$3 = i10;
                        scrollableItemsMapper$mapItems$1.label = 1;
                        obj = q8sVar.a(formattedText3, scrollableItemsMapper$mapItems$1);
                        if (obj != coroutineSingletons) {
                            collection4 = arrayList2;
                            i7 = i10;
                            CharSequence charSequence6 = (CharSequence) obj;
                            ldc f3 = aVar.g.f(xjp0Var.b);
                            ScrollableItemBadge$Anchor scrollableItemBadge$Anchor2 = xjp0Var.c;
                            i8 = scrollableItemBadge$Anchor2 != null ? -1 : bkp0.a[scrollableItemBadge$Anchor2.ordinal()];
                            if (i8 == -1) {
                                scrollableItemBadgeModel$Anchor = ScrollableItemBadgeModel$Anchor.TRAILING;
                            } else if (i8 == 1) {
                                scrollableItemBadgeModel$Anchor = ScrollableItemBadgeModel$Anchor.TRAILING;
                            } else {
                                if (i8 != 2) {
                                    w511.b();
                                    return null;
                                }
                                scrollableItemBadgeModel$Anchor = ScrollableItemBadgeModel$Anchor.LEADING;
                            }
                            yjp0Var2 = new yjp0(charSequence6, f3, scrollableItemBadgeModel$Anchor);
                            collection3 = arrayList2;
                            arrayList2 = collection4;
                            FormattedText formattedText222 = wjp0Var2.a;
                            scrollableItemsMapper$mapItems$1.L$0 = null;
                            scrollableItemsMapper$mapItems$1.L$1 = null;
                            scrollableItemsMapper$mapItems$1.L$2 = null;
                            scrollableItemsMapper$mapItems$1.L$3 = arrayList2;
                            scrollableItemsMapper$mapItems$1.L$4 = it;
                            scrollableItemsMapper$mapItems$1.L$5 = null;
                            scrollableItemsMapper$mapItems$1.L$6 = wjp0Var2;
                            scrollableItemsMapper$mapItems$1.L$7 = yjp0Var2;
                            scrollableItemsMapper$mapItems$1.L$8 = collection3;
                            scrollableItemsMapper$mapItems$1.L$9 = null;
                            scrollableItemsMapper$mapItems$1.L$10 = null;
                            scrollableItemsMapper$mapItems$1.I$0 = i3;
                            scrollableItemsMapper$mapItems$1.I$1 = i2;
                            scrollableItemsMapper$mapItems$1.I$2 = i7;
                            scrollableItemsMapper$mapItems$1.label = 2;
                            a = q8sVar.a(formattedText222, scrollableItemsMapper$mapItems$1);
                            if (a != coroutineSingletons) {
                                int i13 = i2;
                                i5 = i7;
                                i6 = i13;
                                Collection collection5 = arrayList2;
                                i4 = i3;
                                collection2 = collection5;
                                yjp0Var = yjp0Var2;
                                wjp0Var = wjp0Var2;
                                collection = collection3;
                                obj = a;
                                CharSequence charSequence7 = (CharSequence) obj;
                                formattedText = wjp0Var.b;
                                if (formattedText == null) {
                                    scrollableItemsMapper$mapItems$1.L$0 = null;
                                    scrollableItemsMapper$mapItems$1.L$1 = null;
                                    scrollableItemsMapper$mapItems$1.L$2 = null;
                                    scrollableItemsMapper$mapItems$1.L$3 = collection2;
                                    scrollableItemsMapper$mapItems$1.L$4 = it;
                                    scrollableItemsMapper$mapItems$1.L$5 = null;
                                    scrollableItemsMapper$mapItems$1.L$6 = wjp0Var;
                                    scrollableItemsMapper$mapItems$1.L$7 = null;
                                    scrollableItemsMapper$mapItems$1.L$8 = yjp0Var;
                                    scrollableItemsMapper$mapItems$1.L$9 = charSequence7;
                                    scrollableItemsMapper$mapItems$1.L$10 = collection;
                                    scrollableItemsMapper$mapItems$1.I$0 = i4;
                                    scrollableItemsMapper$mapItems$1.I$1 = i6;
                                    scrollableItemsMapper$mapItems$1.I$2 = i5;
                                    scrollableItemsMapper$mapItems$1.I$3 = 0;
                                    scrollableItemsMapper$mapItems$1.label = 3;
                                    Object a2 = q8sVar.a(formattedText, scrollableItemsMapper$mapItems$1);
                                    if (a2 != coroutineSingletons) {
                                        charSequence3 = charSequence7;
                                        obj = a2;
                                        int i122 = i4;
                                        arrayList2 = collection2;
                                        i3 = i122;
                                        CharSequence charSequence42 = (CharSequence) obj;
                                        CharSequence charSequence52 = charSequence3;
                                        yjp0 yjp0Var32 = yjp0Var;
                                        ldc f22 = aVar.g.f(wjp0Var.c);
                                        lvi0 g2 = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, wjp0Var.d, new kvi0(pzg0.promo_cards_noimg), null, 12);
                                        r9x0 r9x0Var2 = wjp0Var.e;
                                        x2s x2sVar2 = wjp0Var.g;
                                        collection.add(new zjp0(charSequence52, charSequence42, f22, g2, new x9x0(r9x0Var2, null, null, x2sVar2, 6), x2sVar2, yjp0Var32));
                                        i2 = i6;
                                        i10 = 0;
                                        if (!it.hasNext()) {
                                        }
                                    }
                                } else {
                                    int i14 = i4;
                                    arrayList2 = collection2;
                                    i3 = i14;
                                    charSequence52 = charSequence7;
                                    charSequence42 = null;
                                    yjp0 yjp0Var322 = yjp0Var;
                                    ldc f222 = aVar.g.f(wjp0Var.c);
                                    lvi0 g22 = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, wjp0Var.d, new kvi0(pzg0.promo_cards_noimg), null, 12);
                                    r9x0 r9x0Var22 = wjp0Var.e;
                                    x2s x2sVar22 = wjp0Var.g;
                                    collection.add(new zjp0(charSequence52, charSequence42, f222, g22, new x9x0(r9x0Var22, null, null, x2sVar22, 6), x2sVar22, yjp0Var322));
                                    i2 = i6;
                                    i10 = 0;
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    }
                    int i15 = scrollableItemsMapper$mapItems$1.I$2;
                    int i16 = scrollableItemsMapper$mapItems$1.I$1;
                    int i17 = scrollableItemsMapper$mapItems$1.I$0;
                    Collection collection6 = (Collection) scrollableItemsMapper$mapItems$1.L$8;
                    yjp0 yjp0Var4 = (yjp0) scrollableItemsMapper$mapItems$1.L$7;
                    wjp0 wjp0Var3 = (wjp0) scrollableItemsMapper$mapItems$1.L$6;
                    it = (Iterator) scrollableItemsMapper$mapItems$1.L$4;
                    Collection collection7 = (Collection) scrollableItemsMapper$mapItems$1.L$3;
                    kotlin.b.b(obj);
                    i5 = i15;
                    i6 = i16;
                    wjp0Var = wjp0Var3;
                    collection = collection6;
                    i4 = i17;
                    collection2 = collection7;
                    yjp0Var = yjp0Var4;
                    CharSequence charSequence72 = (CharSequence) obj;
                    formattedText = wjp0Var.b;
                    if (formattedText == null) {
                    }
                }
            }
        }
        scrollableItemsMapper$mapItems$1 = new ScrollableItemsMapper$mapItems$1(this, continuationImpl);
        Object obj2 = scrollableItemsMapper$mapItems$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollableItemsMapper$mapItems$1.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.b;
        q8s q8sVar2 = this.a;
        int i102 = 0;
        if (i != 0) {
        }
    }
}
