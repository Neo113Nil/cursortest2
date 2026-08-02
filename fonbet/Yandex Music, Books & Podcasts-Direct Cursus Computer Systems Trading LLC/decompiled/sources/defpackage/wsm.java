package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* loaded from: classes5.dex */
public final class wsm {
    public static final File b = new File("/proc");
    public final File a;

    public wsm(int i) {
        this.a = new File(b, String.valueOf(i));
    }

    public final String a(String str) {
        try {
            FileReader fileReader = new FileReader(new File(this.a, str));
            try {
                String readLine = new BufferedReader(fileReader).readLine();
                fileReader.close();
                return readLine;
            } finally {
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
