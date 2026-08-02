package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public abstract class wtf0 implements leo {
    public final String a;
    public final Map b;
    public final i3y c;

    public wtf0(String str, Map map) {
        this.a = str;
        this.b = map;
        this.c = a.b(LazyThreadSafetyMode.NONE, new csf0(1, this));
    }

    @Override // defpackage.leo
    public final String a() {
        return (String) this.c.getValue();
    }

    @Override // defpackage.leo
    public final String getName() {
        return this.a;
    }

    public /* synthetic */ wtf0(int i, String str, Map map, boolean z) {
        this(str, (i & 2) != 0 ? b.f() : map);
    }
}
