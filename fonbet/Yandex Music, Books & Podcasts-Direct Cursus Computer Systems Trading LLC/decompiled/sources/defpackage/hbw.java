package defpackage;

import android.net.Uri;
import kotlin.text.c;

/* loaded from: classes6.dex */
public final class hbw implements eqt {
    @Override // defpackage.eqt
    public final ou2 a(String str, boolean z) {
        str.getClass();
        return new ibw(str);
    }

    @Override // defpackage.eqt
    public final boolean b(String str) {
        str.getClass();
        Uri parse = Uri.parse(str);
        parse.getClass();
        return c.o(parse.getAuthority(), "plus-home-sdk", true);
    }
}
