package defpackage;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

/* loaded from: classes5.dex */
public final class jch implements MatchResult {
    public final Matcher a;
    public final CharSequence b;
    public final l7 c;
    public fb9 d;

    public jch(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new l7(1, this);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        if (this.d == null) {
            this.d = new fb9(1, this);
        }
        fb9 fb9Var = this.d;
        fb9Var.getClass();
        return fb9Var;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange b() {
        Matcher matcher = this.a;
        return yhn.m(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String group = this.a.group();
        group.getClass();
        return group;
    }

    @Override // kotlin.text.MatchResult
    public final jch next() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(end)) {
            return new jch(matcher2, charSequence);
        }
        return null;
    }
}
