package com.gamericefishpro.space.ai;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.e = fVar;
    }

    @Override // com.gamericefishpro.space.ai.g
    public final File a() {
        Function2 function2;
        h hVar = this.e.v;
        boolean z = this.b;
        File file = this.a;
        if (z) {
            File[] fileArr = this.c;
            if (fileArr == null || this.d < fileArr.length) {
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = hVar.e) != null) {
                        function2.invoke(file, new a(this.a, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = hVar.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.c;
                Intrinsics.b(fileArr3);
                int i = this.d;
                this.d = i + 1;
                return fileArr3[i];
            }
            Function1 function3 = hVar.d;
            if (function3 != null) {
                function3.invoke(file);
                return null;
            }
        } else {
            Function1 function4 = hVar.c;
            if (function4 == null || ((Boolean) function4.invoke(file)).booleanValue()) {
                this.b = true;
                return file;
            }
        }
        return null;
    }
}
