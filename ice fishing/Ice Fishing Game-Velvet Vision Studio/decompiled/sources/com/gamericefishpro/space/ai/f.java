package com.gamericefishpro.space.ai;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.gamericefishpro.space.ph.b {
    public final ArrayDeque i;
    public final /* synthetic */ h v;

    public f(h hVar) {
        this.v = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.i = arrayDeque;
        File rootFile = hVar.a;
        if (rootFile.isDirectory()) {
            arrayDeque.push(b(rootFile));
        } else if (!rootFile.isFile()) {
            this.d = 2;
        } else {
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            arrayDeque.push(new d(rootFile));
        }
    }

    @Override // com.gamericefishpro.space.ph.b
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.i;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            File fileA = gVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(gVar.a) || !fileA.isDirectory() || arrayDeque.size() >= this.v.f) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.d = 2;
        } else {
            this.e = file;
            this.d = 1;
        }
    }

    public final b b(File file) {
        int iOrdinal = this.v.b.ordinal();
        if (iOrdinal == 0) {
            return new e(this, file);
        }
        if (iOrdinal == 1) {
            return new c(this, file);
        }
        throw new com.gamericefishpro.space.oh.k();
    }
}
