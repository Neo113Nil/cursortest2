package androidx.compose.foundation.text.input.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.MatchResult;

/* loaded from: classes3.dex */
public final /* synthetic */ class HandwritingGestureApi34$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$IntRef f$0;
    public final /* synthetic */ Ref$IntRef f$1;

    public /* synthetic */ HandwritingGestureApi34$$ExternalSyntheticLambda2(Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i) {
        this.$r8$classId = i;
        this.f$0 = ref$IntRef;
        this.f$1 = ref$IntRef2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Ref$IntRef ref$IntRef = this.f$1;
        Ref$IntRef ref$IntRef2 = this.f$0;
        MatchResult matchResult = (MatchResult) obj;
        switch (i) {
            case 0:
                if (ref$IntRef2.element == -1) {
                    ref$IntRef2.element = matchResult.getRange().first;
                }
                ref$IntRef.element = matchResult.getRange().last + 1;
                break;
            default:
                if (ref$IntRef2.element == -1) {
                    ref$IntRef2.element = matchResult.getRange().first;
                }
                ref$IntRef.element = matchResult.getRange().last + 1;
                break;
        }
        return "";
    }
}
