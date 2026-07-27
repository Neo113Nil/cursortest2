package androidx.versionedparcelable;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class AxiomCoreMonitorWorkerEpOThAFmoCLxMwibdJ72468267872406 extends FrostBridgeMonitorFunctionQO6lgDLPPLWnBSZbgY71588270009836 {
    public static boolean BlazePulsePolymorphismOverloadingK3oHWwcZeom5cYPPbU90259265379402(String str, String str2) {
        str.getClass();
        return str.startsWith(str2);
    }

    public static String FrostBridgeProviderPostfixIXYixnTdHOklADz4h935360772170079() {
        char charAt = "H".charAt(0);
        char[] cArr = new char[10];
        for (int i = 0; i < 10; i++) {
            cArr[i] = charAt;
        }
        return new String(cArr);
    }

    public static String JadeCircuitEncoderOperatorI6V6dNLHMzCIR02Ul371691657630987(String str, String str2, String str3) {
        int RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359 = QuantumStreamMutexTransportEBMtyJRZ8mVY0jgB7Q92733453458509.RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359(0, str, str2, false);
        if (RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359);
            sb.append(str3);
            i2 = RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359 + length;
            if (RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359 >= str.length()) {
                break;
            }
            RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359 = QuantumStreamMutexTransportEBMtyJRZ8mVY0jgB7Q92733453458509.RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359(RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359 + i, str, str2, false);
        } while (RapidLogicProcessorMiddlewareKpcd19PB8v0KY1XiEB38359245590359 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }
}
