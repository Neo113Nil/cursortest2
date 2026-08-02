package ru.yandex.taxi.summary.promotions.models;

import defpackage.akz0;
import defpackage.bze;
import defpackage.c4v;
import defpackage.g00;
import defpackage.k7x0;
import defpackage.l051;
import defpackage.m051;
import defpackage.m7x0;
import defpackage.o051;
import defpackage.ocm;
import defpackage.p051;
import defpackage.r051;
import defpackage.s051;
import defpackage.u051;
import defpackage.uzg;
import defpackage.v051;
import defpackage.v19;
import defpackage.z051;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes10.dex */
public final class a {
    public final k7x0 a;
    public final v19 b = new v19(Locale.getDefault());

    public a(k7x0 k7x0Var) {
        this.a = k7x0Var;
    }

    public static z051 b(CommunicationItem.a aVar) {
        FormattedText formattedText = aVar.h;
        List list = aVar.e;
        uzg uzgVar = aVar.a;
        ocm ocmVar = aVar.d;
        akz0 akz0Var = aVar.c;
        ActionButton actionButton = aVar.b;
        g00 g00Var = aVar.f;
        bze bzeVar = aVar.g;
        return formattedText != null ? new v051(formattedText) : uzgVar != null ? new p051(uzgVar) : ocmVar != null ? new r051(ocmVar) : akz0Var != null ? new u051(akz0Var) : actionButton != null ? new m051(Collections.singletonList(actionButton)) : !list.isEmpty() ? new m051(list) : g00Var != null ? new l051(g00Var) : bzeVar != null ? new o051(bzeVar) : s051.a;
    }

    public final String a(c4v c4vVar) {
        String str = c4vVar.a;
        String str2 = c4vVar.b;
        if (str2 != null && str2.length() != 0) {
            return str2;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        return ((m7x0) this.a).a(str);
    }
}
