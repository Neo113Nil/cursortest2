package com.gamericefishpro.space.ai;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ f f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    @Override // com.gamericefishpro.space.ai.g
    public final File a() {
        File[] fileArr;
        Function1 function1;
        h hVar = this.f.v;
        boolean z = this.e;
        File file = this.a;
        if (z || this.c != null) {
            fileArr = this.c;
            if (fileArr == null && this.d < fileArr.length) {
                Intrinsics.b(fileArr);
                int i = this.d;
                this.d = i + 1;
                return fileArr[i];
            }
            if (!this.b) {
                this.b = true;
                return file;
            }
            function1 = hVar.d;
            if (function1 != null) {
                function1.invoke(file);
            }
        } else {
            Function1 function2 = hVar.c;
            if (function2 == null || ((Boolean) function2.invoke(file)).booleanValue()) {
                File[] fileArrListFiles = file.listFiles();
                this.c = fileArrListFiles;
                if (fileArrListFiles == null) {
                    Function2 function3 = hVar.e;
                    if (function3 != null) {
                        function3.invoke(file, new a(this.a, null, "Cannot list files in a directory", 2, null));
                    }
                    this.e = true;
                }
                fileArr = this.c;
                if (fileArr == null) {
                }
                if (!this.b) {
                    this.b = true;
                    return file;
                }
                function1 = hVar.d;
                if (function1 != null) {
                    function1.invoke(file);
                }
            }
        }
        return null;
    }
}
