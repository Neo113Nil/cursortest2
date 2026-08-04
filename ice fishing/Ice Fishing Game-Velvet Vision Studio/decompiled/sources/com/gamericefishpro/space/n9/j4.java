package com.gamericefishpro.space.n9;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 implements q4, x0 {
    public final /* synthetic */ m4 d;

    public /* synthetic */ j4(m4 m4Var) {
        this.d = m4Var;
    }

    @Override // com.gamericefishpro.space.n9.q4
    public void a(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        m4 m4Var = this.d;
        if (!zIsEmpty) {
            m4Var.c().A(new com.gamericefishpro.space.d4.r0(this, str, str2, bundle, 10, false));
            return;
        }
        r1 r1Var = m4Var.E;
        if (r1Var != null) {
            v0 v0Var = r1Var.y;
            r1.l(v0Var);
            v0Var.y.b(str2, "AppId not known when logging event");
        }
    }

    @Override // com.gamericefishpro.space.n9.x0
    public /* synthetic */ void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.d.A(str, i, th, bArr, map);
    }
}
