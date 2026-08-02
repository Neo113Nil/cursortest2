package ru.cprocsp.ACSP.tools.integrity;

import java.util.List;

/* loaded from: classes4.dex */
public interface IntegrityInterface extends CSPIntegrityConstants {
    int check(boolean z);

    byte[] getApkDigest();

    String getApkDigestItem(String str, String str2);

    List<String> getItems();

    List<String> getItems(String str, String str2, String str3);

    String getLastDate();

    int getLastStatus();

    long getLastTime();
}
