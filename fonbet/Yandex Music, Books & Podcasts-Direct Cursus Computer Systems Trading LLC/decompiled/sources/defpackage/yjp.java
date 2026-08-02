package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes6.dex */
public abstract class yjp<T> {

    @NotNull
    public static final xjp Companion = new xjp();
    public static final Object b = btf.a(bwf.b, wjp.s);
    public final String a;

    public /* synthetic */ yjp(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public static final /* synthetic */ void d(yjp yjpVar, wq5 wq5Var, j5m j5mVar) {
        if (!wq5Var.e(j5mVar) && yjpVar.a == null) {
            return;
        }
        wq5Var.q(j5mVar, 0, tkr.a, yjpVar.a);
    }

    public abstract Object a();

    public abstract Object b();

    public final Object c(String str) {
        List split$default;
        str.getClass();
        String str2 = this.a;
        if (str.equals(str2)) {
            return b();
        }
        if (Intrinsics.d(str2, "*")) {
            return b();
        }
        split$default = StringsKt__StringsKt.split$default(str, new String[]{StringUtils.COMMA}, false, 0, 6, null);
        Iterator<T> it = split$default.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((String) it.next(), str2)) {
                return b();
            }
        }
        return a();
    }
}
