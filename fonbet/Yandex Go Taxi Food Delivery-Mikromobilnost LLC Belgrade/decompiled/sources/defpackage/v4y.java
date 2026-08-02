package defpackage;

import kotlin.Result;
import kotlin.a;
import kotlinx.serialization.json.b;

/* loaded from: classes.dex */
public abstract class v4y implements s76 {
    public final i3y a = a.a(new ppr(19, this));

    @Override // defpackage.s76
    public final b a() {
        Object value = ((Result) this.a.getValue()).getValue();
        kotlin.b.b(value);
        return (b) value;
    }

    public abstract b b();
}
