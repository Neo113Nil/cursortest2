package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class aac implements zbf {
    public final boolean a;

    public aac(boolean z) {
        this.a = z;
    }

    @Override // defpackage.zbf
    public final String a(Object obj, rwj rwjVar) {
        File file = (File) obj;
        if (!this.a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
