package ru.cprocsp.ACSP.tools.config;

import java.util.Map;

/* loaded from: classes4.dex */
public interface ConfigInterface extends ConfigConstants {
    boolean disableKeyStoreType(String str);

    boolean disableWarning2001(boolean z);

    boolean enableKeyStoreType(String str);

    Map<String, String> getCachedKeyStoreTypes();

    String getCurrentLoggingLevel();

    String getCurrentReaderName();

    Map<String, String> getKeyStoreTypes();

    String[] getReaderList();

    boolean isKeyStoreAlwaysEnabled(String str);

    boolean isWarning2001Disabled();

    boolean setLoggingLevel(String str);

    boolean setReaderName(String str);
}
