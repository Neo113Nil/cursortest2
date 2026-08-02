package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public class u05 implements ev31 {
    public List a(a05 a05Var) {
        return EmptyList.a;
    }

    public rtz0 b(a05 a05Var) {
        return qtz0.a;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        a05 a05Var = (a05) obj;
        Throwable error = a05Var.getError();
        v7l entity = a05Var.getEntity();
        if (error != null) {
            return new r05(r501.a(error, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
        }
        if (entity == null) {
            return new s05(a05Var.a());
        }
        rr51 rr51Var = entity.c;
        List a = a(a05Var);
        String str = entity.a;
        Text i = str != null ? g8e.i(Text.Companion, str) : Text.Empty.INSTANCE;
        String str2 = entity.b;
        return new q05(rr51Var, a, new stz0(i, str2 != null ? g8e.i(Text.Companion, str2) : null, null, null, null, b(a05Var), false, null, null, null, null, null, 32732));
    }
}
