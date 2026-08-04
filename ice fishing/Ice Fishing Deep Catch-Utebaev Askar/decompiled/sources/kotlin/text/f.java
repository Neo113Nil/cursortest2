package kotlin.text;

import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f implements MatchResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f204b;

    public f(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f203a = matcher;
        this.f204b = new e(this);
    }
}
