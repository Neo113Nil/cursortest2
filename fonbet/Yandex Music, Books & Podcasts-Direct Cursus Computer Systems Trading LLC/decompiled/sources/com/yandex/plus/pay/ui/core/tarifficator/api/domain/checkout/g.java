package com.yandex.plus.pay.ui.core.tarifficator.api.domain.checkout;

import android.content.Context;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.data.common.y;
import com.yandex.plus.home.api.prefetch.j;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.a4g;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.v75;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class g extends aur implements Function2 {
    public int j;
    public final /* synthetic */ LinkedHashMap k;
    public final /* synthetic */ h l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(LinkedHashMap linkedHashMap, h hVar, Continuation continuation) {
        super(2, continuation);
        this.k = linkedHashMap;
        this.l = hVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.k, this.l, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        h hVar;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        if (i != 0) {
            if (i == 1) {
                qgg.h0(obj);
                return obj;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        qgg.h0(obj);
        Collection values = this.k.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : values) {
            if (obj2 instanceof PlusPayRichText.Item.Icon) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hVar = this.l;
            if (!hasNext) {
                break;
            }
            PlusPayRichText.Item.Icon icon = (PlusPayRichText.Item.Icon) it.next();
            com.yandex.plus.ui.core.theme.a aVar = (com.yandex.plus.ui.core.theme.a) hVar.b.a.getValue();
            Context context = hVar.a;
            y image = icon.getImage();
            arrayList2.add(u.r(context, aVar) ? image.b : image.a);
        }
        j jVar = new j(CollectionsKt.w0(CollectionsKt.z0(arrayList2)), hVar, (Continuation) null, 26);
        this.j = 1;
        Object O = a4g.O(jVar, this);
        return O == nm6Var ? nm6Var : O;
    }
}
