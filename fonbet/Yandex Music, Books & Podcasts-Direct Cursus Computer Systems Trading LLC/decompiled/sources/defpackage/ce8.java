package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ce8 {
    public final yqf a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public ce8(yqf yqfVar, boolean z, boolean z2, boolean z3) {
        this.a = yqfVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static boolean a(String str) {
        return Intrinsics.d(str, "http") || Intrinsics.d(str, "https");
    }

    public final void b(bd8 bd8Var, xzb xzbVar) {
        Uri uri;
        szb szbVar = bd8Var.d;
        if (szbVar == null || (uri = (Uri) szbVar.a(xzbVar)) == null) {
            return;
        }
        if (!a(uri.getScheme())) {
            int i = i9f.a;
        } else {
            if (!this.b || this.a.get() == null) {
                return;
            }
            l1j.f();
        }
    }
}
