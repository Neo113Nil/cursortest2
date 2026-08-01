package com.anythink.core.common.o;

import android.os.Process;
import android.os.SystemClock;
import com.anythink.core.common.v.k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f15944a = 100;

    /* renamed from: b, reason: collision with root package name */
    private static long f15945b;

    /* renamed from: c, reason: collision with root package name */
    private static long f15946c = SystemClock.uptimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private static final File f15947d = new File(k.b("L3Byb2Mv") + Process.myPid() + k.b("L3N0YXQ="));

    public static int a() {
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(f15947d);
            try {
                inputStreamReader = new InputStreamReader(fileInputStream);
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String[] split = bufferedReader.readLine().split(" ");
                        long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                        long j6 = parseLong - f15945b;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        float f3 = ((uptimeMillis - f15946c) / 1000.0f) * 100.0f;
                        f15945b = parseLong;
                        f15946c = uptimeMillis;
                        int availableProcessors = (int) (((j6 / f3) * 100.0f) / Runtime.getRuntime().availableProcessors());
                        try {
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return availableProcessors;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused2) {
                                    return 0;
                                }
                            }
                        } finally {
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable unused3) {
                                }
                            }
                            if (inputStreamReader != null) {
                                inputStreamReader.close();
                            }
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                        }
                    }
                } catch (Throwable th3) {
                    bufferedReader = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                bufferedReader = null;
                th = th4;
                inputStreamReader = null;
            }
        } catch (Throwable th5) {
            inputStreamReader = null;
            bufferedReader = null;
            th = th5;
            fileInputStream = null;
        }
    }
}
