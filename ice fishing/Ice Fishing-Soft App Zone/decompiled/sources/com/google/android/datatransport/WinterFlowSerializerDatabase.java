package com.google.android.datatransport;

import java.util.Locale;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSerializerDatabase implements WinterFlowDeserializationHandler {
    public final WinterFlowSchedulerSyntax WinterFlowVariableVersionControl;

    public WinterFlowSerializerDatabase(WinterFlowSchedulerSyntax winterFlowSchedulerSyntax) {
        winterFlowSchedulerSyntax.getClass();
        this.WinterFlowVariableVersionControl = winterFlowSchedulerSyntax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00bd, code lost:
    
        if (r2.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00c9, code lost:
    
        r3 = com.google.android.datatransport.WinterFlowDebugException.WinterFlowVariableVersionControl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00c6, code lost:
    
        if (r2.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.datatransport.WinterFlowDeserializationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowConcurrencyLayer WinterFlowArrayHelper(String str) {
        WinterFlowDebugException winterFlowDebugException;
        int i;
        str.getClass();
        WinterFlowSchedulerSyntax winterFlowSchedulerSyntax = this.WinterFlowVariableVersionControl;
        WinterFlowCacheUtility winterFlowCacheUtility = null;
        if (!winterFlowSchedulerSyntax.isOpen()) {
            WinterFlowConfigurationException.WinterFlowSyntax("connection is closed", 21);
            throw null;
        }
        String upperCase = WinterFlowFrameworkStrategy.WinterFlowPackageIDE(str).toString().toUpperCase(Locale.ROOT);
        upperCase.getClass();
        int length = upperCase.length() - 2;
        int i2 = -1;
        if (length >= 0) {
            int i3 = 0;
            loop0: while (i3 < length) {
                char charAt = upperCase.charAt(i3);
                if (WinterFlowManagerRequest.WinterFlowBatchUI(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i4 = i3 + 1;
                            if (upperCase.charAt(i4) == '*') {
                                do {
                                    i4 = WinterFlowFrameworkStrategy.WinterFlowEventEmitterController(upperCase, '*', i4 + 1, 4);
                                    if (i4 >= 0) {
                                        i = i4 + 1;
                                        if (i >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (upperCase.charAt(i) != '/');
                                i3 = i4 + 2;
                            }
                        }
                        i2 = i3;
                        break;
                    }
                    if (upperCase.charAt(i3 + 1) == '-') {
                        i3 = WinterFlowFrameworkStrategy.WinterFlowEventEmitterController(upperCase, '\n', i3 + 2, 4);
                        if (i3 < 0) {
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                i3++;
            }
        }
        String substring = (i2 < 0 || i2 > upperCase.length()) ? null : upperCase.substring(i2, Math.min(i2 + 3, upperCase.length()));
        if (substring == null) {
            return new WinterFlowQueue(winterFlowSchedulerSyntax, str);
        }
        switch (substring.hashCode()) {
            case 65636:
                if (substring.equals("BEG")) {
                    if (!WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "EXCLUSIVE")) {
                        if (!WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, "IMMEDIATE")) {
                            winterFlowDebugException = WinterFlowDebugException.WinterFlowSyntax;
                            break;
                        } else {
                            winterFlowDebugException = WinterFlowDebugException.WinterFlowRouterRouter;
                            break;
                        }
                    } else {
                        winterFlowDebugException = WinterFlowDebugException.WinterFlowUnitTestResponse;
                        break;
                    }
                }
                winterFlowDebugException = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (substring.equals("ROL") && !WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(upperCase, " TO ")) {
                    winterFlowDebugException = WinterFlowDebugException.WinterFlowTransactionManagerStrategy;
                    break;
                }
                winterFlowDebugException = null;
                break;
            default:
                winterFlowDebugException = null;
                break;
        }
        if (winterFlowDebugException != null) {
            return new WinterFlowQueue(winterFlowSchedulerSyntax, str, winterFlowDebugException);
        }
        if (substring.equals("PRA")) {
            String lowerCase = upperCase.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (WinterFlowFrameworkStrategy.WinterFlowConsumerUserManager(WinterFlowFrameworkStrategy.WinterFlowStrategyTool(lowerCase, "journal_mode", ""), "=")) {
                winterFlowCacheUtility = WinterFlowCacheUtility.WinterFlowTestingNode;
            }
        }
        if (winterFlowCacheUtility != null) {
            return new WinterFlowQueue(winterFlowSchedulerSyntax, str, new WinterFlowLoaderQueue(winterFlowSchedulerSyntax, str));
        }
        int hashCode = substring.hashCode();
        return (hashCode == 79487 ? !substring.equals("PRA") : hashCode == 81978 ? !substring.equals("SEL") : !(hashCode == 85954 && substring.equals("WIT"))) ? new WinterFlowQueue(winterFlowSchedulerSyntax, str) : new WinterFlowLoaderQueue(winterFlowSchedulerSyntax, str);
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationHandler
    public final boolean WinterFlowServerProtocol() {
        return this.WinterFlowVariableVersionControl.WinterFlowServerProtocol();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.WinterFlowVariableVersionControl.close();
    }
}
