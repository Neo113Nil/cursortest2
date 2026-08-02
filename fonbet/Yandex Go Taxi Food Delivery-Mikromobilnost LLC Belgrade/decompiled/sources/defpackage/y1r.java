package defpackage;

import java.io.File;
import kotlin.io.AccessDeniedException;

/* loaded from: classes9.dex */
public final class y1r extends x1r {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ c2r f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1r(c2r c2rVar, File file) {
        super(file);
        this.f = c2rVar;
    }

    @Override // defpackage.d2r
    public final File a() {
        int i;
        boolean z = this.e;
        File file = this.a;
        if (!z && this.c == null) {
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null) {
                wls wlsVar = (wls) this.f.w.d;
                if (wlsVar != null) {
                    wlsVar.invoke(file, new AccessDeniedException(file));
                }
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && (i = this.d) < fileArr.length) {
            this.d = i + 1;
            return fileArr[i];
        }
        if (this.b) {
            return null;
        }
        this.b = true;
        return file;
    }
}
