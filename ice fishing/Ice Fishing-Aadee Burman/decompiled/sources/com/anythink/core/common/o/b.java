package com.anythink.core.common.o;

import android.app.ActivityManager;
import android.content.Context;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.core.common.v.k;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b {
    public static int a() {
        return a(1);
    }

    public static int b() {
        return a(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r3 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int a(int i) {
        FileReader fileReader;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(k.b("L3Byb2MvbWVtaW5mbw=="));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(fileReader, 8192);
                String str = "";
                for (int i6 = 0; i6 < i; i6++) {
                    try {
                        str = bufferedReader2.readLine();
                    } catch (IOException unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                    } catch (Throwable unused3) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused4) {
                            }
                        }
                    }
                }
                int longValue = (int) (Long.valueOf(str.split("\\s+")[1]).longValue() / 1024);
                try {
                    bufferedReader2.close();
                } catch (IOException unused5) {
                }
                try {
                    fileReader.close();
                } catch (IOException unused6) {
                }
                return longValue;
            } catch (IOException unused7) {
            } catch (Throwable unused8) {
            }
        } catch (IOException unused9) {
            fileReader = null;
        } catch (Throwable unused10) {
            fileReader = null;
        }
        return 0;
    }

    public static int a(ActivityManager activityManager) {
        try {
            activityManager.getMemoryInfo(new ActivityManager.MemoryInfo());
            return (int) ((Runtime.getRuntime().totalMemory() / 1024) / 1024);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static int a(Context context, ActivityManager activityManager) {
        return (context.getApplicationContext().getApplicationInfo().flags & o.f7742d) == 1048576 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
    }
}
