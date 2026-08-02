package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class wge implements zqr {
    public final Object a;
    public final Object b;
    public final Object c;
    public volatile Object d;

    public wge(vw1 vw1Var) {
        this.a = btf.b(new v1e(3, vw1Var));
        this.b = new ReentrantLock();
        this.c = new LinkedBlockingQueue();
    }

    public void a(String str) {
        gh ghVar;
        BigInteger add;
        BigInteger subtract;
        FileChannel channel;
        oeo oeoVar = (oeo) ((jyr) this.a).getValue();
        wq wqVar = new wq(str, 27);
        oeoVar.getClass();
        oeoVar.b();
        int i = 5;
        while (true) {
            int i2 = i - 1;
            if (i <= 0 || (ghVar = oeoVar.f) == null) {
                return;
            }
            FileOutputStream fileOutputStream = ghVar.c;
            if (((fileOutputStream == null || (channel = fileOutputStream.getChannel()) == null) ? -1L : channel.size()) <= 102400) {
                wqVar.invoke(ghVar);
                return;
            }
            File file = oeoVar.a;
            File file2 = oeoVar.c;
            gh ghVar2 = oeoVar.f;
            if (ghVar2 != null) {
                BufferedOutputStream bufferedOutputStream = ghVar2.d;
                if (bufferedOutputStream != null) {
                    j66.O(bufferedOutputStream);
                }
                ghVar2.d = null;
                ghVar2.c = null;
            }
            oeoVar.f = null;
            BigInteger bigInteger = oeoVar.e;
            if (bigInteger == null || (add = bigInteger.add(BigInteger.ONE)) == null) {
                oeoVar.b();
            } else {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file2, rhn.b.a());
                    try {
                        FileChannel channel2 = randomAccessFile.getChannel();
                        channel2.getClass();
                        FileLock lock = channel2.lock();
                        try {
                            String readLine = randomAccessFile.readLine();
                            if (readLine == null || readLine.length() == 0) {
                                randomAccessFile.writeBytes(add.toString());
                            } else {
                                try {
                                    subtract = new BigInteger(readLine);
                                } catch (NumberFormatException unused) {
                                    BigInteger bigInteger2 = BigInteger.ONE;
                                    bigInteger2.getClass();
                                    subtract = add.subtract(bigInteger2);
                                    subtract.getClass();
                                }
                                if (subtract.compareTo(add) >= 0) {
                                    add = subtract;
                                } else {
                                    randomAccessFile.setLength(0L);
                                    randomAccessFile.writeBytes(add.toString());
                                }
                            }
                            if (lock != null && lock.isValid()) {
                                lock.release();
                            }
                            randomAccessFile.close();
                            oeoVar.e = add;
                            oeoVar.f = new gh(new File(file, String.format(oeoVar.d, Arrays.copyOf(new Object[]{add.toString()}, 1))));
                            try {
                                randomAccessFile = new RandomAccessFile(file2, rhn.b.a());
                                try {
                                    FileChannel channel3 = randomAccessFile.getChannel();
                                    channel3.getClass();
                                    FileLock lock2 = channel3.lock();
                                    try {
                                        File[] listFiles = file.listFiles(new neo(oeoVar, 0));
                                        if (listFiles == null) {
                                            listFiles = new File[0];
                                        }
                                        if (listFiles.length > 20) {
                                            uz0.p(listFiles, new mj(new t1n(2)));
                                            IntRange intRange = new IntRange(20, listFiles.length - 1, 1);
                                            Iterator it = (intRange.isEmpty() ? c5b.a : uz0.c(uz0.k(20, intRange.b + 1, listFiles))).iterator();
                                            while (it.hasNext()) {
                                                ((File) it.next()).delete();
                                            }
                                        }
                                        if (lock2 != null && lock2.isValid()) {
                                            lock2.release();
                                        }
                                        randomAccessFile.close();
                                    } catch (Throwable th) {
                                        if (lock2 != null && lock2.isValid()) {
                                            lock2.release();
                                        }
                                        throw th;
                                    }
                                } finally {
                                }
                            } catch (IOException unused2) {
                                continue;
                            }
                        } catch (Throwable th2) {
                            if (lock != null && lock.isValid()) {
                                lock.release();
                            }
                            throw th2;
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                } catch (IOException unused3) {
                    oeoVar.e = null;
                }
            }
            i = i2;
        }
    }

    public void b() {
        if (((l2f) this.d) != null) {
            return;
        }
        ReentrantLock reentrantLock = (ReentrantLock) this.b;
        reentrantLock.lock();
        try {
            if (((l2f) this.d) != null) {
                return;
            }
            this.d = zdg.I("Music:Log", new v1e(2, this), 5);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.zqr
    public Object get() {
        List list;
        List list2 = (List) this.d;
        if (list2 != null) {
            return list2;
        }
        synchronized (this.c) {
            try {
                list = (List) this.d;
                if (list == null) {
                    list = (List) ((zqr) this.a).get();
                    if (!list.isEmpty()) {
                        for (int i = 1; i < list.size(); i++) {
                            luo luoVar = (luo) list.get(i - 1);
                            luo luoVar2 = (luo) list.get(i);
                            if (luoVar.a < luoVar2.a && luoVar.b >= luoVar2.b) {
                            }
                        }
                        this.d = list;
                    }
                    list = (List) ((zqr) this.b).get();
                    this.d = list;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }

    public wge(zqr zqrVar, zqr zqrVar2) {
        this.c = new Object();
        this.a = zqrVar;
        this.b = zqrVar2;
    }
}
