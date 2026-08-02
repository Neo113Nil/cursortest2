package defpackage;

import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class uku0 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public boolean e;
    public volatile b f;
    public volatile qn11 g;

    public /* synthetic */ uku0(String str, String str2, String str3, long j, boolean z, b bVar, int i) {
        this(str, str2, str3, j, z, (i & 32) != 0 ? null : bVar, (qn11) null);
    }

    public final b a() {
        b bVar;
        Object failure;
        b bVar2 = this.f;
        if (bVar2 != null) {
            return bVar2;
        }
        synchronized (this) {
            bVar = this.f;
            if (bVar == null) {
                try {
                    failure = sbx.d.d(this.c);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                bVar = (b) failure;
                if (bVar != null) {
                    this.f = bVar;
                } else {
                    bVar = null;
                }
            }
        }
        return bVar;
    }

    public uku0(String str, String str2, String str3, long j, boolean z, b bVar, qn11 qn11Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = z;
        this.f = bVar;
        this.g = qn11Var;
    }
}
