package k;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.f141e = fVar;
    }

    @Override // k.g
    public final File a() {
        Function2 function2;
        boolean z = this.f138b;
        f fVar = this.f141e;
        File file = this.f144a;
        if (!z) {
            Function1 function1 = fVar.f143d.f147c;
            if ((function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) ? false : true) {
                return null;
            }
            this.f138b = true;
            return file;
        }
        File[] fileArr = this.f139c;
        if (fileArr != null && this.f140d >= fileArr.length) {
            Function1 function3 = fVar.f143d.f148d;
            if (function3 != null) {
                function3.invoke(file);
            }
            return null;
        }
        if (fileArr == null) {
            File[] fileArrListFiles = file.listFiles();
            this.f139c = fileArrListFiles;
            if (fileArrListFiles == null && (function2 = fVar.f143d.f149e) != null) {
                function2.a(file, new a(this.f144a, null, "Cannot list files in a directory", 2, null));
            }
            File[] fileArr2 = this.f139c;
            if (fileArr2 == null || fileArr2.length == 0) {
                Function1 function4 = fVar.f143d.f148d;
                if (function4 != null) {
                    function4.invoke(file);
                }
                return null;
            }
        }
        File[] fileArr3 = this.f139c;
        Intrinsics.b(fileArr3);
        int i2 = this.f140d;
        this.f140d = i2 + 1;
        return fileArr3[i2];
    }
}
