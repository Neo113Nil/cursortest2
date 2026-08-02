package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls20;", "", "Companion", "q20", "r20", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class s20 {
    public static final r20 Companion = new r20();
    public final String a;
    public final Boolean b;
    public final Boolean c;
    public final FormattedText d;
    public final FormattedText e;
    public final int f;
    public final FormattedText g;
    public final k6a0 h;

    public /* synthetic */ s20(int i, String str, Boolean bool, Boolean bool2, FormattedText formattedText, FormattedText formattedText2, int i2, FormattedText formattedText3, k6a0 k6a0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool2;
        }
        if ((i & 8) == 0) {
            this.d = FormattedText.c;
        } else {
            this.d = formattedText;
        }
        if ((i & 16) == 0) {
            this.e = FormattedText.c;
        } else {
            this.e = formattedText2;
        }
        if ((i & 32) == 0) {
            this.f = 100;
        } else {
            this.f = i2;
        }
        if ((i & 64) == 0) {
            this.g = FormattedText.c;
        } else {
            this.g = formattedText3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = k6a0Var;
        }
    }

    public s20() {
        FormattedText formattedText = FormattedText.c;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = formattedText;
        this.e = formattedText;
        this.f = 100;
        this.g = formattedText;
        this.h = null;
    }
}
