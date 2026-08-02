package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class oeo {
    public final File a;
    public final BigInteger b;
    public final File c;
    public final String d;
    public BigInteger e;
    public gh f;

    public oeo(File file) {
        file.getClass();
        this.a = file;
        BigInteger valueOf = BigInteger.valueOf(1L);
        valueOf.getClass();
        this.b = valueOf;
        this.c = new File(file, "log.lock");
        this.d = "log-%s.log";
    }

    public final boolean a(BufferedWriter bufferedWriter) {
        File file = this.a;
        file.mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.c, rhn.b.a());
            try {
                FileChannel channel = randomAccessFile.getChannel();
                channel.getClass();
                FileLock lock = channel.lock();
                try {
                    File[] listFiles = file.listFiles(new neo(this, 1));
                    if (listFiles == null) {
                        listFiles = new File[0];
                    }
                    uz0.p(listFiles, new t1n(2));
                    for (File file2 : listFiles) {
                        file2.getClass();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
                        try {
                            Iterator it = new n86(new wz0(3, bufferedReader)).iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                Object next = it.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    u75.n();
                                    throw null;
                                }
                                String str = (String) next;
                                if (!StringsKt.U(str)) {
                                    if (i > 0) {
                                        bufferedWriter.append('\n');
                                    }
                                    bufferedWriter.append((CharSequence) str);
                                }
                                i = i2;
                            }
                            bufferedReader.close();
                        } finally {
                        }
                    }
                    bufferedWriter.flush();
                    if (lock != null && lock.isValid()) {
                        lock.release();
                    }
                    randomAccessFile.close();
                    return true;
                } catch (Throwable th) {
                    if (lock != null && lock.isValid()) {
                        lock.release();
                    }
                    throw th;
                }
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final void b() {
        if (this.f != null) {
            return;
        }
        File file = this.a;
        file.mkdirs();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.c, rhn.b.a());
            try {
                FileChannel channel = randomAccessFile.getChannel();
                channel.getClass();
                FileLock lock = channel.lock();
                try {
                    String readLine = randomAccessFile.readLine();
                    BigInteger bigInteger = this.b;
                    if (readLine == null || readLine.length() == 0) {
                        randomAccessFile.writeBytes(bigInteger.toString());
                    } else {
                        try {
                            bigInteger = new BigInteger(readLine);
                        } catch (NumberFormatException unused) {
                            randomAccessFile.setLength(0L);
                            randomAccessFile.writeBytes(bigInteger.toString());
                        }
                    }
                    randomAccessFile.close();
                    this.e = bigInteger;
                    this.f = new gh(new File(file, String.format(this.d, Arrays.copyOf(new Object[]{bigInteger.toString()}, 1))));
                } finally {
                    if (lock != null && lock.isValid()) {
                        lock.release();
                    }
                }
            } finally {
            }
        } catch (IOException unused2) {
            this.e = null;
        }
    }
}
