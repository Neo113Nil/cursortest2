package com.anythink.core.common.m.a.a;

import com.anythink.core.common.m.a.k;
import com.anythink.core.common.n.b.ag;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: a, reason: collision with root package name */
    private final ag f14439a;

    public f(ag agVar) {
        this.f14439a = agVar;
    }

    private InputStream d() {
        ag agVar = this.f14439a;
        if (agVar != null) {
            return agVar.c().i();
        }
        return null;
    }

    @Override // com.anythink.core.common.m.a.k
    public final long a() {
        ag agVar = this.f14439a;
        if (agVar != null) {
            return agVar.b();
        }
        return 0L;
    }

    @Override // com.anythink.core.common.m.a.k
    public final String b() {
        try {
            ag agVar = this.f14439a;
            return agVar != null ? agVar.d() : null;
        } finally {
            ag agVar2 = this.f14439a;
            if (agVar2 != null) {
                agVar2.close();
            }
        }
    }

    @Override // com.anythink.core.common.m.a.k
    public final String c() {
        try {
            StringBuilder sb = new StringBuilder();
            ag agVar = this.f14439a;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(agVar != null ? agVar.c().i() : null));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append('\n');
            }
            String sb2 = sb.toString();
            ag agVar2 = this.f14439a;
            if (agVar2 != null) {
                agVar2.close();
            }
            return sb2;
        } catch (Throwable th) {
            ag agVar3 = this.f14439a;
            if (agVar3 != null) {
                agVar3.close();
            }
            throw th;
        }
    }
}
