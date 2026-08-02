package com.anythink.basead.exoplayer.h.b;

import android.util.Log;
import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.h.b.d;
import com.anythink.basead.exoplayer.h.x;

/* loaded from: classes.dex */
public final class b implements d.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8309a = "BaseMediaChunkOutput";

    /* renamed from: b, reason: collision with root package name */
    private final int[] f8310b;

    /* renamed from: c, reason: collision with root package name */
    private final x[] f8311c;

    public b(int[] iArr, x[] xVarArr) {
        this.f8310b = iArr;
        this.f8311c = xVarArr;
    }

    @Override // com.anythink.basead.exoplayer.h.b.d.b
    public final m a(int i) {
        int i4 = 0;
        while (true) {
            int[] iArr = this.f8310b;
            if (i4 >= iArr.length) {
                Log.e(f8309a, "Unmatched track of type: ".concat(String.valueOf(i)));
                return new com.anythink.basead.exoplayer.e.d();
            }
            if (i == iArr[i4]) {
                return this.f8311c[i4];
            }
            i4++;
        }
    }

    public final int[] a() {
        int[] iArr = new int[this.f8311c.length];
        int i = 0;
        while (true) {
            x[] xVarArr = this.f8311c;
            if (i >= xVarArr.length) {
                return iArr;
            }
            x xVar = xVarArr[i];
            if (xVar != null) {
                iArr[i] = xVar.b();
            }
            i++;
        }
    }

    public final void a(long j6) {
        for (x xVar : this.f8311c) {
            if (xVar != null) {
                xVar.a(j6);
            }
        }
    }
}
