package k;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes.dex */
public class j extends i {
    public static String a(File file) throws IOException {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            Intrinsics.checkNotNullParameter(inputStreamReader, "<this>");
            StringWriter out = new StringWriter();
            Intrinsics.checkNotNullParameter(inputStreamReader, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            char[] cArr = new char[8192];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                if (i2 < 0) {
                    String string = out.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
                    a.c.b(inputStreamReader, null);
                    return string;
                }
                out.write(cArr, 0, i2);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.c.b(inputStreamReader, th);
                throw th2;
            }
        }
    }

    public static void b(File file, String text) throws IOException {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] array = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(array, "this as java.lang.String).getBytes(charset)");
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            Unit unit = Unit.f157a;
            a.c.b(fileOutputStream, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.c.b(fileOutputStream, th);
                throw th2;
            }
        }
    }
}
