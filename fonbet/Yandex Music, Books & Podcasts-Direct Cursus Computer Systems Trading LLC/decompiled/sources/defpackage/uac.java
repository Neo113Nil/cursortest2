package defpackage;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class uac extends rac {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ ab8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uac(ab8 ab8Var, File file) {
        super(file);
        file.getClass();
        this.e = ab8Var;
    }

    @Override // defpackage.vac
    public final File a() {
        Function2 function2;
        wac wacVar = (wac) this.e.e;
        boolean z = this.b;
        File file = this.a;
        if (z) {
            File[] fileArr = this.c;
            if (fileArr == null || this.d < fileArr.length) {
                if (fileArr == null) {
                    File[] listFiles = file.listFiles();
                    this.c = listFiles;
                    if (listFiles == null && (function2 = wacVar.e) != null) {
                        File file2 = this.a;
                        function2.invoke(file2, new ba(file2, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = wacVar.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.c;
                fileArr3.getClass();
                int i = this.d;
                this.d = i + 1;
                return fileArr3[i];
            }
            Function1 function12 = wacVar.d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = wacVar.c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.b = true;
                return file;
            }
        }
        return null;
    }
}
