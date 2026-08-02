package com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.j;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.o;
import com.yandex.plus.core.data.common.r;
import com.yandex.plus.core.data.common.s;
import com.yandex.plus.core.data.common.v;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.home.common.utils.i;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.ern;
import defpackage.fkn;
import defpackage.jhp;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.nrn;
import defpackage.o7t;
import defpackage.qgg;
import defpackage.t75;
import defpackage.tah;
import defpackage.u75;
import defpackage.v75;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z75;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class h implements d {
    public final Context a;
    public final fkn b;
    public final com.yandex.plus.core.imageloader.b c;
    public final com.yandex.plus.log.api.b d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;

    public h(Context context, fkn fknVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.log.api.b bVar2) {
        context.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.a = context;
        this.b = fknVar;
        this.c = bVar;
        this.d = bVar2;
        this.e = com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_highlightTextColor);
        this.f = com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_alertColor);
        this.g = com.yandex.plus.home.common.utils.a.b(context, R.attr.pay_sdk_secondaryTextColor);
        this.h = context.getResources().getDimension(R.dimen.pay_sdk_strikethrough_size);
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, List list, String str, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IntRange intRange = (IntRange) it.next();
            spannableStringBuilder.replace(intRange.a, intRange.b + 1, (CharSequence) str);
            int i = intRange.a;
            IntRange intRange2 = new IntRange(i, str.length() + i, 1);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                spannableStringBuilder.setSpan(it2.next(), intRange2.a, intRange2.b, 17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayRichText plusPayRichText, Function2 function2, cg6 cg6Var) {
        e eVar;
        int i;
        SpannableStringBuilder spannableStringBuilder;
        Function2 function22;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Iterator it2;
        Object obj;
        String str;
        List list;
        Object obj2;
        Iterator it3;
        List c;
        List list2;
        if (cg6Var instanceof e) {
            eVar = (e) cg6Var;
            int i2 = eVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.o = i2 - Integer.MIN_VALUE;
                Object obj3 = eVar.m;
                nm6 nm6Var = nm6.a;
                i = eVar.o;
                Object obj4 = null;
                if (i != 0) {
                    qgg.h0(obj3);
                    spannableStringBuilder = new SpannableStringBuilder(plusPayRichText.getText());
                    List<PlusPayRichText.Item> items = plusPayRichText.getItems();
                    int a = tah.a(v75.o(items, 10));
                    if (a < 16) {
                        a = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(a);
                    for (Object obj5 : items) {
                        linkedHashMap2.put("{{" + ((PlusPayRichText.Item) obj5).getKey() + "}}", obj5);
                    }
                    eVar.j = function2;
                    eVar.k = spannableStringBuilder;
                    eVar.l = linkedHashMap2;
                    eVar.o = 1;
                    dq7 dq7Var = ca8.a;
                    obj3 = x97.V(mn7.d, new g(linkedHashMap2, this, null), eVar);
                    if (obj3 == nm6Var) {
                        return nm6Var;
                    }
                    function22 = function2;
                    linkedHashMap = linkedHashMap2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    linkedHashMap = eVar.l;
                    spannableStringBuilder = eVar.k;
                    function22 = eVar.j;
                    qgg.h0(obj3);
                }
                Map map = (Map) obj3;
                it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str2 = (String) entry.getKey();
                    PlusPayRichText.Item item = (PlusPayRichText.Item) entry.getValue();
                    List k = jhp.k(new o7t(Regex.c(new Regex(str2, nrn.LITERAL), spannableStringBuilder), f.b));
                    boolean z = item instanceof PlusPayRichText.Item.TextColor;
                    fkn fknVar = this.b;
                    int i3 = 2;
                    Context context = this.a;
                    if (z) {
                        PlusPayRichText.Item.TextColor textColor = (PlusPayRichText.Item.TextColor) item;
                        com.yandex.plus.ui.core.theme.a aVar = (com.yandex.plus.ui.core.theme.a) fknVar.a.getValue();
                        v<k> color = textColor.getColor();
                        k kVar = u.r(context, aVar) ? color.b : color.a;
                        if (kVar instanceof com.yandex.plus.core.data.common.f) {
                            list = t75.c(new ForegroundColorSpan(((com.yandex.plus.core.data.common.f) kVar).b));
                        } else {
                            if (!(kVar instanceof j)) {
                                StringBuilder sb = new StringBuilder("Unsupported color type in TextColor replacement. Type: ");
                                if (kVar == null || (str = ern.a(kVar.getClass()).h()) == null) {
                                    str = "null";
                                }
                                String data = textColor.getData();
                                v<k> color2 = textColor.getColor();
                                sb.append(str);
                                sb.append(", Text: ");
                                sb.append(data);
                                sb.append(", Color: ");
                                sb.append(color2);
                                throw new IllegalStateException(sb.toString().toString());
                            }
                            List<s> list3 = ((j) kVar).b;
                            ArrayList arrayList = new ArrayList();
                            for (s sVar : list3) {
                                if (sVar instanceof o) {
                                    o oVar = (o) sVar;
                                    List list4 = oVar.b;
                                    String data2 = textColor.getData();
                                    obj2 = obj4;
                                    if (list4.size() < i3) {
                                        Integer num = (Integer) CollectionsKt.firstOrNull(list4);
                                        if (num == null) {
                                            b6e.n("Linear gradient must have at least one color. Text: ", data2, ", gradient: ", oVar);
                                            return obj2;
                                        }
                                        list2 = t75.c(new ForegroundColorSpan(num.intValue()));
                                    } else {
                                        list2 = t75.c(new com.yandex.plus.home.common.utils.g(data2, ((Number) CollectionsKt.Q(list4)).intValue(), ((Number) CollectionsKt.Y(list4)).intValue()));
                                    }
                                    it3 = it;
                                } else {
                                    obj2 = obj4;
                                    if (!(sVar instanceof r)) {
                                        b6e.s();
                                        return obj2;
                                    }
                                    r rVar = (r) sVar;
                                    String data3 = textColor.getData();
                                    List list5 = rVar.b;
                                    Pair pair = rVar.d;
                                    Pair pair2 = rVar.e;
                                    it3 = it;
                                    if (list5.size() < i3) {
                                        Integer num2 = (Integer) CollectionsKt.firstOrNull(list5);
                                        if (num2 == null) {
                                            b6e.n("Radial gradient must have at least one color. Text: ", data3, ", gradient: ", rVar);
                                            return obj2;
                                        }
                                        c = t75.c(new ForegroundColorSpan(num2.intValue()));
                                    } else {
                                        List list6 = rVar.c;
                                        ArrayList arrayList2 = new ArrayList(v75.o(list6, 10));
                                        Iterator it4 = list6.iterator();
                                        while (it4.hasNext()) {
                                            arrayList2.add(Float.valueOf((float) ((Number) it4.next()).doubleValue()));
                                            pair = pair;
                                        }
                                        Pair pair3 = pair;
                                        c = t75.c(new com.yandex.plus.home.common.utils.j(data3, CollectionsKt.v0(list5), CollectionsKt.t0(arrayList2), (float) ((Number) pair2.a).doubleValue(), (float) ((Number) pair2.b).doubleValue(), (float) ((Number) pair3.a).doubleValue(), (float) ((Number) pair3.b).doubleValue()));
                                    }
                                    list2 = c;
                                }
                                z75.t(arrayList, list2);
                                it = it3;
                                obj4 = obj2;
                                i3 = 2;
                            }
                            list = arrayList;
                        }
                        it2 = it;
                        obj = obj4;
                        b(spannableStringBuilder, k, textColor.getData(), list);
                    } else {
                        it2 = it;
                        obj = obj4;
                        if (item instanceof PlusPayRichText.Item.Icon) {
                            PlusPayRichText.Item.Icon icon = (PlusPayRichText.Item.Icon) item;
                            com.yandex.plus.ui.core.theme.a aVar2 = (com.yandex.plus.ui.core.theme.a) fknVar.a.getValue();
                            y image = icon.getImage();
                            Drawable drawable = (Drawable) map.get(u.r(context, aVar2) ? image.b : image.a);
                            if (drawable != null) {
                                float applyDimension = TypedValue.applyDimension(2, 16.0f, context.getResources().getDisplayMetrics());
                                drawable.setBounds(0, 0, (int) ((drawable.getIntrinsicWidth() * applyDimension) / drawable.getIntrinsicHeight()), (int) applyDimension);
                                b(spannableStringBuilder, k, StringUtil.SPACE, t75.c(new com.yandex.plus.home.common.utils.spantext.b(drawable, 2, false, 12)));
                            } else {
                                b(spannableStringBuilder, k, icon.getAltText(), c5b.a);
                            }
                        } else {
                            boolean z2 = item instanceof PlusPayRichText.Item.Link;
                            int i4 = this.e;
                            if (z2) {
                                PlusPayRichText.Item.Link link = (PlusPayRichText.Item.Link) item;
                                b(spannableStringBuilder, k, link.getData(), u75.h(new ForegroundColorSpan(i4), new i(new com.yandex.plus.pay.internal.d(7, function22, link), false)));
                            } else if (item instanceof PlusPayRichText.Item.Strikethrough) {
                                b(spannableStringBuilder, k, StringUtil.SPACE, t75.c(new com.yandex.plus.home.common.utils.spantext.c(this.h, this.f, Integer.valueOf(this.g), ((PlusPayRichText.Item.Strikethrough) item).getData())));
                            } else if (item instanceof PlusPayRichText.Item.Highlight) {
                                b(spannableStringBuilder, k, ((PlusPayRichText.Item.Highlight) item).getData(), t75.c(new ForegroundColorSpan(i4)));
                            } else {
                                if (!(item instanceof PlusPayRichText.Item.Text)) {
                                    b6e.s();
                                    return obj;
                                }
                                b(spannableStringBuilder, k, ((PlusPayRichText.Item.Text) item).getData(), c5b.a);
                            }
                        }
                    }
                    it = it2;
                    obj4 = obj;
                }
                return spannableStringBuilder;
            }
        }
        eVar = new e(this, cg6Var);
        Object obj32 = eVar.m;
        nm6 nm6Var2 = nm6.a;
        i = eVar.o;
        Object obj42 = null;
        if (i != 0) {
        }
        Map map2 = (Map) obj32;
        it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
        }
        return spannableStringBuilder;
    }
}
