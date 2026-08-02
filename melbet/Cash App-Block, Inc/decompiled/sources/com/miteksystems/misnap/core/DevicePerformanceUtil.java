package com.miteksystems.misnap.core;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Result;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class DevicePerformanceUtil {
    public static int a;
    public static final int[] b = {-1775228513, 802464304, 802464333, 802464302, 2067362118, 2067362060, 2067362084, 2067362241, 2067362117, 2067361998, -1853602818};

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        if (r3 != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getCurrentDevicePerformanceTier$default(Context context) {
        Integer num;
        int i;
        long j;
        context.getClass();
        int i2 = a;
        if (i2 != 0) {
            return i2;
        }
        int i3 = Build.VERSION.SDK_INT;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        ActivityManager activityManager = (ActivityManager) systemService;
        Integer num2 = null;
        if (i3 >= 31) {
            String str = Build.SOC_MODEL;
            str.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String upperCase = str.toUpperCase(locale);
            upperCase.getClass();
            num = Integer.valueOf(upperCase.hashCode());
        } else {
            num = null;
        }
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = 1;
            if (i5 >= availableProcessors) {
                break;
            }
            try {
                Result.Companion companion = Result.Companion;
                RandomAccessFile randomAccessFile = new RandomAccessFile(String.format(Locale.ENGLISH, "/sys/devices/system/cpu/cpu%d/cpufreq/scaling_cur_freq", Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1)), "r");
                i7 += parseCpuFreqFromLine$core_release(randomAccessFile.readLine()) / IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO;
                i6++;
                randomAccessFile.close();
            } catch (Throwable unused) {
                Result.Companion companion2 = Result.Companion;
            }
            i5++;
        }
        int ceil = i6 == 0 ? -1 : (int) Math.ceil(i7 / i6);
        try {
            Result.Companion companion3 = Result.Companion;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        } catch (Throwable unused2) {
            Result.Companion companion4 = Result.Companion;
            j = -1;
        }
        int memoryClass = activityManager.getMemoryClass();
        if (num != null) {
            while (true) {
                if (i4 >= 11) {
                    break;
                }
                int i8 = b[i4];
                if (i8 == num.intValue()) {
                    num2 = Integer.valueOf(i8);
                    break;
                }
                i4++;
            }
        }
        if (availableProcessors > 2 && memoryClass > 100 && ((j == -1 || j >= 2147483648L) && (availableProcessors > 4 || ceil == -1 || ceil > 1250))) {
            i = (availableProcessors < 8 || memoryClass <= 160 || (ceil != -1 && ceil <= 2055)) ? 2 : 3;
        }
        a = i;
        return i;
    }

    public static int parseCpuFreqFromLine$core_release(String str) {
        Object failure;
        if (str == null) {
            return 0;
        }
        try {
            Result.Companion companion = Result.Companion;
            MatcherMatchResult find = new Regex("[0-9-]+").find(str);
            failure = Integer.valueOf(find != null ? Integer.parseInt(find.getValue()) : 0);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            failure = new Result.Failure(th);
        }
        if (Result.m4120exceptionOrNullimpl(failure) != null) {
            failure = 0;
        }
        return ((Number) failure).intValue();
    }
}
