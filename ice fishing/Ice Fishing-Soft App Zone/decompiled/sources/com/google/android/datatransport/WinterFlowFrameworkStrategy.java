package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class WinterFlowFrameworkStrategy extends WinterFlowHookModule {
    public static boolean WinterFlowArrayHelper(CharSequence charSequence) {
        charSequence.getClass();
        for (int i = 0; i < charSequence.length(); i++) {
            if (!WinterFlowQuerySyntax.WinterFlowBatchUI(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final int WinterFlowBackendCacheManager(CharSequence charSequence, String str, int i, boolean z) {
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        int i2 = i < 0 ? 0 : i;
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        WinterFlowCacheManagerListener winterFlowCacheManagerListener = new WinterFlowCacheManagerListener(i2, length, 1);
        boolean z2 = charSequence instanceof String;
        int i3 = winterFlowCacheManagerListener.WinterFlowTransactionManagerStrategy;
        if (z2 && (str instanceof String)) {
            if (i2 <= i3) {
                int i4 = i2;
                while (true) {
                    String str2 = (String) charSequence;
                    int length3 = str.length();
                    if (!(!z ? str.regionMatches(0, str2, i4, length3) : str.regionMatches(z, 0, str2, i4, length3))) {
                        if (i4 == i3) {
                            break;
                        }
                        i4++;
                    } else {
                        return i4;
                    }
                }
            }
        } else if (i2 <= i3) {
            int i5 = i2;
            while (!WinterFlowConfigurationSubsystem(str, 0, charSequence, i5, str.length(), z)) {
                if (i5 != i3) {
                    i5++;
                }
            }
            return i5;
        }
        return -1;
    }

    public static String WinterFlowCacheManagerListener(String str, int i) {
        str.getClass();
        if (i < 0) {
            WinterFlowEventEmitterOrchestration.WinterFlowVariableVersionControl(i, " is less than zero.", "Requested character count ");
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static List WinterFlowCompilerVariable(CharSequence charSequence) {
        WinterFlowScriptArray winterFlowScriptArray = new WinterFlowScriptArray(charSequence);
        if (!winterFlowScriptArray.hasNext()) {
            return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        Object next = winterFlowScriptArray.next();
        if (!winterFlowScriptArray.hasNext()) {
            return WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (winterFlowScriptArray.hasNext()) {
            arrayList.add(winterFlowScriptArray.next());
        }
        return arrayList;
    }

    public static final boolean WinterFlowConfigurationSubsystem(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        int i4;
        char upperCase;
        char upperCase2;
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            for (0; i4 < i3; i4 + 1) {
                char charAt = charSequence.charAt(i + i4);
                char charAt2 = charSequence2.charAt(i2 + i4);
                i4 = (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) ? i4 + 1 : 0;
            }
            return true;
        }
        return false;
    }

    public static boolean WinterFlowConsumerUserManager(String str, String str2) {
        return WinterFlowBackendCacheManager(str, str2, 0, false) >= 0;
    }

    public static int WinterFlowEventEmitterController(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static CharSequence WinterFlowPackageIDE(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean WinterFlowBatchUI = WinterFlowQuerySyntax.WinterFlowBatchUI(str.charAt(!z ? i : length));
            if (z) {
                if (!WinterFlowBatchUI) {
                    break;
                }
                length--;
            } else if (WinterFlowBatchUI) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    public static String WinterFlowStrategyTool(String str, String str2, String str3) {
        int WinterFlowBackendCacheManager = WinterFlowBackendCacheManager(str, str2, 0, false);
        return WinterFlowBackendCacheManager == -1 ? str3 : str.substring(str2.length() + WinterFlowBackendCacheManager, str.length());
    }
}
