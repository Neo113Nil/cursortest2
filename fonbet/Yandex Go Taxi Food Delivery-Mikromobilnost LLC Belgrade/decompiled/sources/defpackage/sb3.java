package defpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class sb3 {
    public final /* synthetic */ int a = 0;
    public final File b;
    public final File c;

    public sb3(File file) {
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public synchronized void a(String str) {
        try {
            if (!this.b.exists() && !this.b.mkdirs()) {
                throw new IOException("Failed to create directory '" + this.b + "'");
            }
            if (!this.c.exists() && !this.c.createNewFile()) {
                throw new IOException("Failed to create file '" + this.c + "'");
            }
            g3r.g(this.c, str);
        } catch (Throwable th) {
            throw th;
        }
    }

    public qb3 b() {
        File file = this.b;
        if (file.exists()) {
            File file2 = this.c;
            if (file2.exists()) {
                file.delete();
            } else if (!file.renameTo(file2)) {
                lk91.j("Couldn't rename file " + file + " to backup file " + file2);
            }
        }
        try {
            return new qb3(file);
        } catch (FileNotFoundException e) {
            File parentFile = file.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                dac.g(g8e.n(file, "Couldn't create "), e);
                return null;
            }
            try {
                return new qb3(file);
            } catch (FileNotFoundException e2) {
                dac.g(g8e.n(file, "Couldn't create "), e2);
                return null;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return this.c.toString();
            default:
                return super.toString();
        }
    }

    public sb3(String str, String str2) {
        File file = new File(str);
        this.b = file;
        this.c = new File(file, str2);
    }
}
