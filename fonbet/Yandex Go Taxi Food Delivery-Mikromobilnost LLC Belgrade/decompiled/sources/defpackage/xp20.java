package defpackage;

import com.yandex.mob.m;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class xp20 implements twl {
    public final m a;

    public xp20(m mVar) {
        this.a = mVar;
    }

    @Override // defpackage.twl
    public final List a(String str) {
        List b = this.a.b(str);
        if (!b.isEmpty()) {
            return b;
        }
        try {
            return twl.W1.a(str);
        } catch (Throwable unused) {
            return EmptyList.a;
        }
    }
}
