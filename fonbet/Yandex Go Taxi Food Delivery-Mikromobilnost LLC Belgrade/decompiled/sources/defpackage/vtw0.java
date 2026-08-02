package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.surge.models.dto.TextBlockSize;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lvtw0;", "", "Companion", "ttw0", "utw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class vtw0 {
    public static final utw0 Companion = new utw0();
    public static final i3y[] j = {null, null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new bhw0(24)), null, null, null, null, null};
    public final ytw0 a;
    public final FormattedText b;
    public final FormattedText c;
    public final TextBlockSize d;
    public final luw0 e;
    public final boolean f;
    public final stw0 g;
    public final boolean h;
    public final boolean i;

    public /* synthetic */ vtw0(int i, ytw0 ytw0Var, FormattedText formattedText, FormattedText formattedText2, TextBlockSize textBlockSize, luw0 luw0Var, boolean z, stw0 stw0Var, boolean z2, boolean z3) {
        this.a = (i & 1) == 0 ? new ytw0(0) : ytw0Var;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = FormattedText.c;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = TextBlockSize.UNKNOWN;
        } else {
            this.d = textBlockSize;
        }
        if ((i & 16) == 0) {
            this.e = kuw0.INSTANCE;
        } else {
            this.e = luw0Var;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = stw0Var;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z2;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z3;
        }
    }

    public vtw0() {
        this(0);
    }

    public vtw0(int i) {
        ytw0 ytw0Var = new ytw0(0);
        FormattedText formattedText = FormattedText.c;
        TextBlockSize textBlockSize = TextBlockSize.UNKNOWN;
        kuw0 kuw0Var = kuw0.INSTANCE;
        this.a = ytw0Var;
        this.b = formattedText;
        this.c = formattedText;
        this.d = textBlockSize;
        this.e = kuw0Var;
        this.f = false;
        this.g = null;
        this.h = false;
        this.i = false;
    }
}
