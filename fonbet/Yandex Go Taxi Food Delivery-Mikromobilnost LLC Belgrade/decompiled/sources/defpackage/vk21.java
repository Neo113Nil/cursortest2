package defpackage;

import com.ybsdk.feature.divkit.api.domain.LocalVariableName;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final class vk21 extends u05 {
    public final rb00 a;

    public vk21(rb00 rb00Var) {
        this.a = rb00Var;
    }

    @Override // defpackage.u05
    public final List a(a05 a05Var) {
        tk21 tk21Var = (tk21) a05Var;
        return ((t400) this.a).e() ? scc.g(new c5z(LocalVariableName.IS_NFC_BUTTON_AVAILABLE.getVarName(), String.valueOf(tk21Var.d)), new c5z(LocalVariableName.TOKENIZED_CARDS.getVarName(), tk21Var.e.toString())) : EmptyList.a;
    }
}
