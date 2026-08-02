package defpackage;

import java.text.StringCharacterIterator;
import ru.yandex.taxi.payment_options.model.pci_dss.CardType;

/* loaded from: classes13.dex */
public final class tc8 {
    public String a;
    public String b;
    public String c;
    public String d;
    public mb8 e;

    public tc8(int i) {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = mb8.e;
    }

    public final CardType a() {
        if (this.e.a.a.length() == 8) {
            return this.e.d;
        }
        mp8 mp8Var = CardType.Companion;
        String str = this.a;
        mp8Var.getClass();
        return mp8.a(str);
    }

    public final boolean b() {
        if (!d()) {
            return false;
        }
        if (this.d.length() == 0) {
            if (this.e.b) {
                return false;
            }
        } else if (this.d.length() != a().b()) {
            return false;
        }
        return c();
    }

    public final boolean c() {
        Integer l;
        Integer l2;
        if (this.b.length() != 0 && this.c.length() != 0 && (l = bvu0.l(10, this.b)) != null && (l2 = bvu0.l(10, this.c)) != null) {
            int intValue = l.intValue();
            int intValue2 = l2.intValue();
            if (1 <= intValue && intValue < 13 && intValue2 >= 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        if (this.a.length() == 0 ? false : a().f(this.a.length())) {
            int[][] iArr = {new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[]{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}};
            StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(this.a);
            char last = stringCharacterIterator.last();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (last != 65535) {
                    if (!Character.isDigit(last)) {
                        break;
                    }
                    i += iArr[i2 & 1][last - '0'];
                    last = stringCharacterIterator.previous();
                    i2++;
                } else if (i % 10 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public tc8() {
        this(0);
    }
}
