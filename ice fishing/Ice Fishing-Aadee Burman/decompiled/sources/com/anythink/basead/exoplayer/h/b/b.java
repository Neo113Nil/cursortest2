package com.anythink.basead.exoplayer.h.b;

import android.util.Log;
import com.anythink.basead.exoplayer.e.m;
import com.anythink.basead.exoplayer.h.b.d;
import com.anythink.basead.exoplayer.h.x;

/* loaded from: classes.dex */
public final class b implements d.b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f7523a = "BaseMediaChunkOutput";

    /* renamed from: b, reason: collision with root package name */
    private final int[] f7524b;

    /* renamed from: c, reason: collision with root package name */
    private final x[] f7525c;

    public b(int[] iArr, x[] xVarArr) {
        this.f7524b = iArr;
        this.f7525c = xVarArr;
    }

    @Override // com.anythink.basead.exoplayer.h.b.d.b
    public final m a(int i) {
        int i6 = 0;
        while (true) {
            int[] iArr = this.f7524b;
            if (i6 >= iArr.length) {
                Log.e(f7523a, "Unmatched track of type: ".concat(String.valueOf(i)));
                return new com.anythink.basead.exoplayer.e.d();
            }
            if (i == iArr[i6]) {
                return this.f7525c[i6];
            }
            i6++;
        }
    }

    public final int[] a() {
        int[] iArr = new int[this.f7525c.length];
        int i = 0;
        while (true) {
            x[] xVarArr = this.f7525c;
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
        for (x xVar : this.f7525c) {
            if (xVar != null) {
                xVar.a(j6);
            }
        }
    }
}
