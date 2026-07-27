package com.appsflyer.internal;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.appsflyer.AFLogger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AFa1ySDK {
    private static AFa1ySDK getMonetizationNetwork;
    private final Map<String, String> AFAdRevenueData = new HashMap<String, String>() { // from class: com.appsflyer.internal.AFa1ySDK.1
        {
            put("aa", "ro.arch");
            put("ab", "ro.chipname");
            put("ac", "ro.dalvik.vm.native.bridge");
            put("ad", "persist.sys.nativebridge");
            put("ae", "ro.enable.native.bridge.exec");
            put("af", "dalvik.vm.isa.x86.features");
            put("ag", "dalvik.vm.isa.x86.variant");
            put("ah", "ro.zygote");
            put("ai", "ro.allow.mock.location");
            put("aj", "ro.dalvik.vm.isa.arm");
            put("ak", "dalvik.vm.isa.arm.features");
            put("al", "dalvik.vm.isa.arm.variant");
            put("am", "dalvik.vm.isa.arm64.features");
            put("an", "dalvik.vm.isa.arm64.variant");
            put("ao", "vzw.os.rooted");
            put("ap", "ro.build.user");
            put("aq", "ro.kernel.qemu");
            put("ar", "ro.hardware");
            put("as", "ro.product.cpu.abi");
            put("at", "ro.product.cpu.abilist");
            put("au", "ro.product.cpu.abilist32");
            put("av", "ro.product.cpu.abilist64");
        }
    };

    AFa1ySDK() {
    }

    public static AFa1ySDK getMediationNetwork() {
        if (getMonetizationNetwork == null) {
            getMonetizationNetwork = new AFa1ySDK();
        }
        return getMonetizationNetwork;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0007, code lost:
    
        if (getMediationNetwork(r5) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getRevenue(Context context, String str) {
        String str2 = null;
        if (str != null) {
            try {
            } catch (Exception e) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e);
                return str2;
            }
        }
        str2 = "invalid timestamp";
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        aFa1lSDK.getCurrencyIso4217Code("pr", getCurrencyIso4217Code());
        aFa1lSDK.getCurrencyIso4217Code("an", getMonetizationNetwork(context));
        return aFa1lSDK;
    }

    private static boolean getMediationNetwork(String str) {
        return str.matches("\\d+");
    }

    private static boolean getMediationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static String AFAdRevenueData() {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i2 <= 2) {
                        i2++;
                        sb.append(AFa1uSDK.XPOSED.AFAdRevenueData);
                        if (stackTraceElement.getMethodName().equals("main")) {
                            sb.append("+a");
                        }
                        if (stackTraceElement.getMethodName().equals("handleHookedMethod")) {
                            sb.append("+h");
                        }
                        sb.append(";");
                    }
                    if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                        i++;
                    }
                }
            }
            if (i > 1) {
                sb.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
        }
        try {
            if (AFAdRevenueData(new StringBuilder("/proc/").append(Process.myPid()).append("/maps").toString(), "frida")) {
                sb.append(AFa1uSDK.FRIDA.AFAdRevenueData);
                if (Build.VERSION.SDK_INT < 29 && AFAdRevenueData("/proc/net/tcp", "69A2")) {
                    sb.append("+prt");
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e);
            sb.append(e.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb.append(";");
        return sb.toString();
    }

    private AFa1lSDK getMonetizationNetwork(Context context) {
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        try {
            aFa1lSDK.getCurrencyIso4217Code(EnumC0059AFa1ySDK.HOOKING.getMonetizationNetwork, AFAdRevenueData());
            aFa1lSDK.getMediationNetwork.put(AFa1lSDK.getCurrencyIso4217Code(EnumC0059AFa1ySDK.DEBUGGABLE.getMonetizationNetwork), Boolean.valueOf(getMediationNetwork(context)));
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
        }
        return aFa1lSDK;
    }

    private AFa1lSDK getCurrencyIso4217Code() {
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        try {
            for (Map.Entry<String, String> entry : this.AFAdRevenueData.entrySet()) {
                String currencyIso4217Code = getCurrencyIso4217Code(entry.getValue());
                if (currencyIso4217Code != null && !currencyIso4217Code.equals("")) {
                    aFa1lSDK.getCurrencyIso4217Code(entry.getKey(), currencyIso4217Code);
                }
            }
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e);
        }
        return aFa1lSDK;
    }

    private static String getCurrencyIso4217Code(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e);
            return null;
        }
    }

    private static boolean AFAdRevenueData(String str, String str2) throws Exception {
        String readLine;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(readLine.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e);
            throw new Exception("FNF");
        } catch (IOException e2) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e2);
            throw new Exception("IOF");
        } catch (Exception e3) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e3);
            throw new Exception("GF");
        }
    }

    /* renamed from: com.appsflyer.internal.AFa1ySDK$AFa1ySDK, reason: collision with other inner class name */
    enum EnumC0059AFa1ySDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMonetizationNetwork;

        EnumC0059AFa1ySDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String AFAdRevenueData;

        AFa1uSDK(String str) {
            this.AFAdRevenueData = str;
        }
    }
}
