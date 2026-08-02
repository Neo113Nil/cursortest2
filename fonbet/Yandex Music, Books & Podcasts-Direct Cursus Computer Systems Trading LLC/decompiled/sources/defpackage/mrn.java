package defpackage;

import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class mrn implements rr2 {
    public final Regex a;

    public mrn(String str) {
        this.a = new Regex(str);
    }

    @Override // defpackage.rr2
    public final boolean a(String str) {
        return this.a.e(str);
    }
}
