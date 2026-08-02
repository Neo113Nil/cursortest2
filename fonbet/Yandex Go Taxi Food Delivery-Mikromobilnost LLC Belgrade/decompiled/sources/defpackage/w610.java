package defpackage;

import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes9.dex */
public final class w610 {
    public final Matcher a;
    public final CharSequence b;
    public final v610 c = new v610(this);
    public u1l d;

    public w610(Matcher matcher, CharSequence charSequence) {
        this.a = matcher;
        this.b = charSequence;
    }

    public final List a() {
        if (this.d == null) {
            this.d = new u1l(1, this);
        }
        return this.d;
    }

    public final d6w b() {
        Matcher matcher = this.a;
        return y6i0.n(matcher.start(), matcher.end());
    }

    public final w610 c() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        if (matcher2.find(end)) {
            return new w610(matcher2, charSequence);
        }
        return null;
    }
}
