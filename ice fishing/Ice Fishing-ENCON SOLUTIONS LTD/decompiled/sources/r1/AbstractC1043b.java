package r1;

import R1.l;
import a.AbstractC0083a;
import androidx.datastore.preferences.protobuf.C0112l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.i;
import u0.AbstractC1050a;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1043b extends AbstractC1050a {
    public static void G(File file, File target) {
        i.e(file, "<this>");
        i.e(target, "target");
        if (!file.exists()) {
            throw new C1042a(file, null, "The source file doesn't exist.");
        }
        if (target.exists()) {
            throw new C1042a(file, target, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new C0112l(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                l.g(fileInputStream, fileOutputStream, 8192);
                AbstractC0083a.e(fileOutputStream, null);
                AbstractC0083a.e(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC0083a.e(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String H(File file) {
        Charset charset = z1.a.f8620a;
        i.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            i.d(stringWriter2, "toString(...)");
            AbstractC0083a.e(inputStreamReader, null);
            return stringWriter2;
        } finally {
        }
    }

    public static final void I(FileOutputStream fileOutputStream, String text, Charset charset) {
        i.e(text, "text");
        i.e(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            i.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        i.b(onUnmappableCharacter);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        i.d(allocate2, "allocate(...)");
        int i2 = 0;
        int i3 = 0;
        while (i2 < text.length()) {
            int min = Math.min(8192 - i3, text.length() - i2);
            int i4 = i2 + min;
            char[] array = allocate.array();
            i.d(array, "array(...)");
            text.getChars(i2, i4, array, i3);
            allocate.limit(min + i3);
            i3 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i4 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i3 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i2 = i4;
        }
    }
}
