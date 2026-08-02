package yads;

import defpackage.k4o;
import defpackage.sl61;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class cb0 {
    public static final sl61 b;
    public static final cb0 c;
    public static final cb0 d;
    public static final /* synthetic */ cb0[] e;
    public static final /* synthetic */ k4o f;

    static {
        cb0 cb0Var = new cb0("DEFAULT", 0);
        c = cb0Var;
        cb0 cb0Var2 = new cb0(IDialogId.INTENT_EXTRA_OUT_RESULT, 1);
        d = cb0Var2;
        cb0[] cb0VarArr = {cb0Var, cb0Var2};
        e = cb0VarArr;
        f = a.a(cb0VarArr);
        b = new sl61();
    }

    public static cb0 valueOf(String str) {
        return (cb0) Enum.valueOf(cb0.class, str);
    }

    public static cb0[] values() {
        return (cb0[]) e.clone();
    }
}
