package com.gamericefishpro.space.d6;

import android.text.TextUtils;
import com.gamericefishpro.space.s4.o;
import com.gamericefishpro.space.s4.v;
import com.gamericefishpro.space.t0.y0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h, o {
    public final /* synthetic */ int d;
    public final String e;

    public a(String query) {
        this.d = 0;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(query, "query");
        this.e = query;
    }

    @Override // com.gamericefishpro.space.s4.o
    public boolean a(CharSequence charSequence, int i, int i2, v vVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.e)) {
            return true;
        }
        vVar.c = (vVar.c & 3) | 4;
        return false;
    }

    @Override // com.gamericefishpro.space.d6.h
    public void j(g statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(statement, "statement");
    }

    @Override // com.gamericefishpro.space.d6.h
    public String l() {
        return this.e;
    }

    public String toString() {
        switch (this.d) {
            case 2:
                return y0.i(new StringBuilder("<"), this.e, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ a(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // com.gamericefishpro.space.s4.o
    public Object getResult() {
        return this;
    }
}
