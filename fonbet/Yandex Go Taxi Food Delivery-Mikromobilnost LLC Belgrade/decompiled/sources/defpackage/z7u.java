package defpackage;

import com.yandex.xplat.xflags.IncompatibleTypesError;
import com.yandex.xplat.xflags.VariableCastError;
import com.yandex.xplat.xflags.VariableType;

/* loaded from: classes2.dex */
public class z7u implements ut5 {
    @Override // defpackage.ut5
    public final b231 a(b231 b231Var, b231 b231Var2) {
        VariableType variableType = b231Var2.a;
        VariableType variableType2 = b231Var.a;
        VariableType variableType3 = VariableType.Array;
        if (variableType2 == variableType3 && variableType == VariableType.String_) {
            u63 u63Var = variableType2 == variableType3 ? (u63) b231Var : null;
            VariableCastError variableCastError = new VariableCastError(b231Var, variableType3);
            if (u63Var != null) {
                return new ia6(u63Var.b.contains(b231Var2.f()));
            }
            throw variableCastError;
        }
        VariableType variableType4 = VariableType.Map;
        if (variableType2 != variableType4 || variableType != VariableType.String_) {
            throw new IncompatibleTypesError(variableType2, variableType);
        }
        if (variableType2 != variableType4) {
            throw new VariableCastError(b231Var, variableType4);
        }
        ny61.u();
        return null;
    }
}
