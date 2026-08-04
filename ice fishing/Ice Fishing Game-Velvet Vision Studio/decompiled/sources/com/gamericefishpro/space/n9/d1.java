package com.gamericefishpro.space.n9;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ f1 e;

    public d1(f1 f1Var, String str, long j) {
        Objects.requireNonNull(f1Var);
        this.e = f1Var;
        com.gamericefishpro.space.v8.c0.d(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.v().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.e.v().edit();
        editorEdit.putLong(this.a, j);
        editorEdit.apply();
        this.d = j;
    }
}
