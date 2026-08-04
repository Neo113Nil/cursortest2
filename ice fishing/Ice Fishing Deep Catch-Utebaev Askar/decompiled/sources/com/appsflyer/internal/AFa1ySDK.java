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

/* JADX INFO: loaded from: classes.dex */
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

    public enum AFa1uSDK {
        XPOSED("xps"),
        FRIDA("frd");

        String AFAdRevenueData;

        AFa1uSDK(String str) {
            this.AFAdRevenueData = str;
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFa1ySDK$AFa1ySDK, reason: collision with other inner class name */
    public enum EnumC0000AFa1ySDK {
        HOOKING("hk"),
        DEBUGGABLE("dbg");

        String getMonetizationNetwork;

        EnumC0000AFa1ySDK(String str) {
            this.getMonetizationNetwork = str;
        }
    }

    private static String AFAdRevenueData() {
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                for (StackTraceElement stackTraceElement : it.next().getValue()) {
                    if (stackTraceElement.toString().contains("de.robv.android.xposed") && i3 <= 2) {
                        i3++;
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
                        i2++;
                    }
                }
            }
            if (i2 > 1) {
                sb.append("mz;");
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("hooking check error", th);
        }
        try {
            StringBuilder sb2 = new StringBuilder("/proc/");
            sb2.append(Process.myPid());
            sb2.append("/maps");
            if (AFAdRevenueData(sb2.toString(), "frida")) {
                sb.append(AFa1uSDK.FRIDA.AFAdRevenueData);
                if (Build.VERSION.SDK_INT < 29 && AFAdRevenueData("/proc/net/tcp", "69A2")) {
                    sb.append("+prt");
                }
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("frida detection error", e2);
            sb.append(e2.getMessage().toLowerCase(Locale.getDefault()));
        }
        sb.append(";");
        return sb.toString();
    }

    private AFa1lSDK getCurrencyIso4217Code() throws Throwable {
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        try {
            for (Map.Entry<String, String> entry : this.AFAdRevenueData.entrySet()) {
                String currencyIso4217Code = getCurrencyIso4217Code(entry.getValue());
                if (currencyIso4217Code != null && !currencyIso4217Code.equals("")) {
                    aFa1lSDK.getCurrencyIso4217Code(entry.getKey(), currencyIso4217Code);
                }
            }
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("failed to create props", e2);
        }
        return aFa1lSDK;
    }

    public static AFa1ySDK getMediationNetwork() {
        if (getMonetizationNetwork == null) {
            getMonetizationNetwork = new AFa1ySDK();
        }
        return getMonetizationNetwork;
    }

    private AFa1lSDK getMonetizationNetwork(Context context) {
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        try {
            aFa1lSDK.getCurrencyIso4217Code(EnumC0000AFa1ySDK.HOOKING.getMonetizationNetwork, AFAdRevenueData());
            aFa1lSDK.getMediationNetwork.put(AFa1lSDK.getCurrencyIso4217Code(EnumC0000AFa1ySDK.DEBUGGABLE.getMonetizationNetwork), Boolean.valueOf(getMediationNetwork(context)));
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("failed to perform analysis checks", th);
        }
        return aFa1lSDK;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009  */
    public final Object getRevenue(Context context, String str) throws Throwable {
        String str2 = null;
        if (str != null) {
            try {
                str2 = getMediationNetwork(str) ? null : "invalid timestamp";
            } catch (Exception e2) {
                AFLogger.afErrorLogForExcManagerOnly("could not get anti fraud data", e2);
                return str2;
            }
        }
        AFa1lSDK aFa1lSDK = new AFa1lSDK();
        aFa1lSDK.getCurrencyIso4217Code("pr", getCurrencyIso4217Code());
        aFa1lSDK.getCurrencyIso4217Code("an", getMonetizationNetwork(context));
        return aFa1lSDK;
    }

    private static boolean AFAdRevenueData(String str, String str2) throws Exception {
        String line;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, Charset.defaultCharset()));
            String lowerCase = str2.toLowerCase(Locale.getDefault());
            do {
                line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return false;
                }
            } while (!new HashSet(Arrays.asList(line.toLowerCase(Locale.getDefault()).split("[\\s.,\\]\\-:/_\\[]"))).contains(lowerCase));
            bufferedReader.close();
            fileInputStream.close();
            return true;
        } catch (FileNotFoundException e2) {
            AFLogger.afErrorLogForExcManagerOnly("FNF", e2);
            throw new Exception("FNF");
        } catch (IOException e3) {
            AFLogger.afErrorLogForExcManagerOnly("IOF", e3);
            throw new Exception("IOF");
        } catch (Exception e4) {
            AFLogger.afErrorLogForExcManagerOnly("GF", e4);
            throw new Exception("GF");
        }
    }

    private static String getCurrencyIso4217Code(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e2) {
            AFLogger.afErrorLogForExcManagerOnly("error in props rfl", e2);
            return null;
        }
    }

    private static boolean getMediationNetwork(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    private static boolean getMediationNetwork(String str) {
        return str.matches("\\d+");
    }
}
