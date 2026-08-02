package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* loaded from: classes5.dex */
public final /* synthetic */ class lrn extends ezc implements Function1 {
    public static final lrn a = new lrn();

    public lrn() {
        super(1, MatchResult.class, "next", "next()Lkotlin/text/MatchResult;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MatchResult matchResult = (MatchResult) obj;
        matchResult.getClass();
        return matchResult.next();
    }
}
