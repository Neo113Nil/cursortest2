package defpackage;

import com.connectsdk.etc.helper.HttpMessage;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class gq3 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ hq3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq3(hq3 hq3Var, int i) {
        super(0);
        this.r = i;
        this.s = hq3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        hq3 hq3Var = this.s;
        switch (i) {
            case 0:
                cp3 cp3Var = cp3.n;
                return men.F((zvd) hq3Var.f);
            default:
                String a = ((zvd) hq3Var.f).a(HttpMessage.CONTENT_TYPE_HEADER);
                if (a == null) {
                    return null;
                }
                Pattern pattern = twh.e;
                try {
                    return q5g.C(a);
                } catch (IllegalArgumentException unused) {
                    return null;
                }
        }
    }
}
