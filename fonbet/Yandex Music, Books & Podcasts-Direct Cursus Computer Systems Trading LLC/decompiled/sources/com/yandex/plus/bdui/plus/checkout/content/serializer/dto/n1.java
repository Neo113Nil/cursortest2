package com.yandex.plus.bdui.plus.checkout.content.serializer.dto;

import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.v75;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class n1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static final PlusPayRichText a(m1 m1Var) {
        ?? r1;
        PlusPayRichText.Item text;
        m1Var.getClass();
        String str = m1Var.a;
        List list = m1Var.b;
        if (list != null) {
            List<j1> list2 = list;
            r1 = new ArrayList(v75.o(list2, 10));
            for (j1 j1Var : list2) {
                if (j1Var instanceof d0) {
                    d0 d0Var = (d0) j1Var;
                    String str2 = d0Var.b;
                    String str3 = d0Var.a;
                    c0 c0Var = d0Var.c;
                    String str4 = c0Var.a;
                    q1 q1Var = c0Var.b;
                    q1Var.getClass();
                    text = new PlusPayRichText.Item.TextColor(str2, str3, str4, new com.yandex.plus.core.data.common.v(r1.L(q1Var.b), r1.L(q1Var.a)));
                } else if (j1Var instanceof k0) {
                    k0 k0Var = (k0) j1Var;
                    text = new PlusPayRichText.Item.Highlight(k0Var.b, k0Var.a, k0Var.c.a);
                } else if (j1Var instanceof q0) {
                    q0 q0Var = (q0) j1Var;
                    text = new PlusPayRichText.Item.Icon(q0Var.b, q0Var.a, null, u.F(q0Var.c.a));
                } else if (j1Var instanceof w0) {
                    w0 w0Var = (w0) j1Var;
                    String str5 = w0Var.b;
                    String str6 = w0Var.a;
                    v0 v0Var = w0Var.c;
                    text = new PlusPayRichText.Item.Link(str5, str6, v0Var.a, v0Var.b);
                } else if (j1Var instanceof c1) {
                    c1 c1Var = (c1) j1Var;
                    text = new PlusPayRichText.Item.Strikethrough(c1Var.b, c1Var.a, c1Var.c.a);
                } else {
                    if (!(j1Var instanceof i1)) {
                        b6e.s();
                        return null;
                    }
                    i1 i1Var = (i1) j1Var;
                    text = new PlusPayRichText.Item.Text(i1Var.b, i1Var.a, i1Var.c.a);
                }
                r1.add(text);
            }
        } else {
            r1 = c5b.a;
        }
        return new PlusPayRichText(str, r1);
    }
}
