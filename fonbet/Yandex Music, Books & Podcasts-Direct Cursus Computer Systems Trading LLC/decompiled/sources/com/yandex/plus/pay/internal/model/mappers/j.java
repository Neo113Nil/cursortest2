package com.yandex.plus.pay.internal.model.mappers;

import com.yandex.plus.pay.api.exception.PlusPayParseException;
import com.yandex.plus.pay.data.mb.dto.i3;
import com.yandex.plus.pay.data.mb.dto.j3;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import com.yandex.plus.pay.repository.api.model.offers.a1;
import com.yandex.plus.pay.repository.api.model.offers.d1;
import com.yandex.plus.pay.repository.api.model.offers.g1;
import com.yandex.plus.pay.repository.api.model.offers.h1;
import com.yandex.plus.pay.repository.api.model.offers.i1;
import com.yandex.plus.pay.repository.api.model.offers.t0;
import com.yandex.plus.pay.repository.api.model.offers.x0;
import defpackage.b6e;
import defpackage.v75;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class j {
    public static final PlusPayRichText a(j3 j3Var) {
        PlusPayRichText.Item link;
        j3Var.getClass();
        String str = j3Var.a;
        List<i3> list = j3Var.b;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (i3 i3Var : list) {
            int ordinal = i3Var.b.ordinal();
            if (ordinal == 0) {
                String str2 = i3Var.a;
                String str3 = i3Var.d;
                if (str3 == null) {
                    throw new PlusPayParseException(new com.yandex.plus.home.common.network.e(new Exception("There must be not null link for rich text item with type LINK")));
                }
                link = new PlusPayRichText.Item.Link((String) null, str2, i3Var.c, str3, 1, (DefaultConstructorMarker) null);
            } else if (ordinal == 1) {
                link = new PlusPayRichText.Item.Highlight((String) null, i3Var.a, i3Var.c, 1, (DefaultConstructorMarker) null);
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return null;
                }
                link = new PlusPayRichText.Item.Strikethrough((String) null, i3Var.a, i3Var.c, 1, (DefaultConstructorMarker) null);
            }
            arrayList.add(link);
        }
        return new PlusPayRichText(str, arrayList);
    }

    public static final PlusPayRichText b(i1 i1Var) {
        PlusPayRichText.Item icon;
        i1Var.getClass();
        String str = i1Var.a;
        List<h1> list = i1Var.b;
        ArrayList arrayList = new ArrayList(v75.o(list, 10));
        for (h1 h1Var : list) {
            if (h1Var instanceof a1) {
                a1 a1Var = (a1) h1Var;
                icon = new PlusPayRichText.Item.Link(a1Var.b, a1Var.c, a1Var.d, a1Var.e);
            } else if (h1Var instanceof t0) {
                t0 t0Var = (t0) h1Var;
                icon = new PlusPayRichText.Item.Highlight(t0Var.b, t0Var.c, t0Var.d);
            } else if (h1Var instanceof g1) {
                g1 g1Var = (g1) h1Var;
                icon = new PlusPayRichText.Item.TextColor(g1Var.b, g1Var.c, g1Var.d, g1Var.e);
            } else if (h1Var instanceof d1) {
                d1 d1Var = (d1) h1Var;
                icon = new PlusPayRichText.Item.Strikethrough(d1Var.b, d1Var.c, d1Var.d);
            } else {
                if (!(h1Var instanceof x0)) {
                    b6e.s();
                    return null;
                }
                x0 x0Var = (x0) h1Var;
                icon = new PlusPayRichText.Item.Icon(x0Var.b, x0Var.c, (String) null, x0Var.e, 4, (DefaultConstructorMarker) null);
            }
            arrayList.add(icon);
        }
        return new PlusPayRichText(str, arrayList);
    }
}
