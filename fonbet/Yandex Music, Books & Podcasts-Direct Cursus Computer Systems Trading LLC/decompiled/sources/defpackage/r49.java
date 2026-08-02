package defpackage;

import java.util.regex.PatternSyntaxException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class r49 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ y5 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r49(y5 y5Var, int i) {
        super(1);
        this.r = i;
        this.s = y5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                Exception exc = (Exception) obj;
                if (exc instanceof PatternSyntaxException) {
                    ((dfb) this.s.s).d(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc).getPattern() + "'."));
                }
                break;
            case 1:
                Exception exc2 = (Exception) obj;
                if (exc2 instanceof PatternSyntaxException) {
                    ((dfb) this.s.s).d(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc2).getPattern() + "'."));
                }
                break;
            default:
                Exception exc3 = (Exception) obj;
                if (exc3 instanceof PatternSyntaxException) {
                    ((dfb) this.s.s).d(new IllegalArgumentException("Invalid regex pattern '" + ((PatternSyntaxException) exc3).getPattern() + "'."));
                }
                break;
        }
        return Unit.a;
    }
}
