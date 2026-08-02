package com.yandex.plus.pay.ui.common.internal.error.content;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import defpackage.b6e;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class j {
    public final com.yandex.plus.pay.ui.core.api.common.a a;
    public String b;
    public String c;
    public String d;
    public String e;
    public k f;
    public final ArrayList g;

    public j(PlusPayCompositeOffers.Offer offer, com.yandex.plus.pay.ui.core.api.common.a aVar) {
        offer.getClass();
        aVar.getClass();
        this.a = aVar;
        this.g = new ArrayList();
    }

    public final void a(String str) {
        this.d = str;
        this.e = this.a.a(R.string.PlusPay_Error_ErrorCode_Accessibility, str);
    }

    public final f b(e eVar) {
        String str;
        int ordinal = eVar.ordinal();
        com.yandex.plus.pay.ui.core.api.common.a aVar = this.a;
        if (ordinal == 0) {
            str = aVar.get(R.string.PlusPay_Error_Unknown_Button);
        } else if (ordinal == 1) {
            str = aVar.get(R.string.PlusPay_Error_Button_Retry);
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            str = aVar.get(R.string.PlusPay_Error_Button_ChangeCard);
        }
        return new f(str, eVar);
    }

    public final void c(int i) {
        this.c = this.a.get(i);
    }

    public final void d(int i) {
        this.b = this.a.get(i);
    }
}
