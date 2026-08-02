package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public interface uyg extends l631 {
    void clearNetworkPageInfo(String str);

    void endDecodingDocument(String str, long j, String str2, String str3);

    void endDecodingDocument(String str, syg sygVar, String str2);

    void endDecodingSection(String str, String str2);

    void endDecodingSection(String str, String str2, String str3, Map map);

    void logDecodingSharedDataSlice(String str, long j);

    void logDecodingSharedDataSlice(String str, String str2, xez0 xez0Var, Map map);

    void logJsonCreationTimings(String str, long j);

    void logJsonCreationTimings(String str, String str2, xez0 xez0Var, Map map);

    void startDecodingDocument(String str, String str2);

    void startDecodingSection(String str, String str2);
}
