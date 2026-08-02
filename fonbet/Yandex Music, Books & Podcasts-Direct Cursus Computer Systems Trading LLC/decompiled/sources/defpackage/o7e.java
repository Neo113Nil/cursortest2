package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o7e implements r8c {
    public final Object a;
    public final jyr b;
    public final boolean c;

    public o7e(arf arfVar, jyr jyrVar, boolean z) {
        this.a = arfVar;
        this.b = jyrVar;
        this.c = z;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [arf, java.lang.Object] */
    @Override // defpackage.r8c
    public final s8c a(Object obj, rwj rwjVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.d(uri.getScheme(), "http") && !Intrinsics.d(uri.getScheme(), "https")) {
            return null;
        }
        return new r7e(uri.toString(), rwjVar, this.a, this.b, this.c);
    }
}
