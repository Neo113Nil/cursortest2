package defpackage;

import com.yandex.go.payments.data.model.response.Card;

/* loaded from: classes8.dex */
public final class syw {
    public final crg a;
    public final jtq0 b;

    public syw(crg crgVar, jtq0 jtq0Var) {
        this.a = crgVar;
        this.b = jtq0Var;
    }

    public final boolean a(Card card) {
        if (this.a.c(card.getH()) == null) {
            return false;
        }
        return !this.b.c().before(r2);
    }
}
