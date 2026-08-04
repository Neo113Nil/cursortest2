package k;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f136f = fVar;
    }

    @Override // k.g
    public final File a() {
        boolean z = this.f135e;
        f fVar = this.f136f;
        File file = this.f144a;
        if (!z && this.f133c == null) {
            Function1 function1 = fVar.f143d.f147c;
            if ((function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) ? false : true) {
                return null;
            }
            File[] fileArrListFiles = file.listFiles();
            this.f133c = fileArrListFiles;
            if (fileArrListFiles == null) {
                Function2 function2 = fVar.f143d.f149e;
                if (function2 != null) {
                    function2.a(file, new a(this.f144a, null, "Cannot list files in a directory", 2, null));
                }
                this.f135e = true;
            }
        }
        File[] fileArr = this.f133c;
        if (fileArr != null && this.f134d < fileArr.length) {
            Intrinsics.b(fileArr);
            int i2 = this.f134d;
            this.f134d = i2 + 1;
            return fileArr[i2];
        }
        if (!this.f132b) {
            this.f132b = true;
            return file;
        }
        Function1 function3 = fVar.f143d.f148d;
        if (function3 != null) {
            function3.invoke(file);
        }
        return null;
    }
}
