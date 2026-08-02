package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class v8s {
    public final arf a;

    public v8s(jyr jyrVar) {
        jyrVar.getClass();
        this.a = jyrVar;
    }

    public final boolean a(mqs mqsVar) {
        mqsVar.getClass();
        lja ljaVar = (lja) ((e6q) ((uaa) this.a.getValue())).e.getValue();
        Set set = ljaVar.a;
        String str = mqsVar.a;
        return set.contains(str) || ljaVar.c.contains(str);
    }
}
