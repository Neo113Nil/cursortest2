package ru.cprocsp.ACSP.tools.config;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public interface ConfigConstants {
    public static final String CONFIG = "config";
    public static final String CONFIG64 = "config64";
    public static final String CONFIG_AndroidLocale_Language = "\\config\\AndroidLocale\\Language";
    public static final String CONFIG_AndroidLoggingLevel_ActiveLoggingLevel = "\\config\\AndroidLoggingLevel\\ActiveLoggingLevel";
    public static final String CONFIG_AndroidReaders = "\\config\\AndroidReaders\\";
    public static final String CONFIG_Android_ActiveReaderLibraryName = "\\config\\Android\\ActiveReaderLibraryName";
    public static final String CONFIG_Android_ActiveReaderPseudo = "\\config\\Android\\ActiveReaderPseudo";
    public static final String CONFIG_KeyDevices_cryptoki_PNPcryptoki_Default_pkcs11_dll = "\\config\\KeyDevices\\cryptoki\\\"PNP cryptoki\"\\Default\\pkcs11_dll";
    public static final String CONFIG_LibraryPath_path = "\\config\\LibraryPath\\path";
    public static final String CONFIG_Parameters_warning_time_gen_2001 = "\\config\\Parameters\\warning_time_gen_2001";
    public static final String CONFIG_Parameters_warning_time_sign_2001 = "\\config\\Parameters\\warning_time_sign_2001";
    public static final String CONFIG_debug = "\\config\\debug\\";
    public static final String FILE_CONFIG = "config.ini";
    public static final String FILE_CONFIG64 = "config64.ini";
    public static final String KD_HD_IMAGE = "HDIMAGE";
    public static final long VAL_WARNING_2001_GEN_VALUE_DEFAULT = 131433408000000000L;
    public static final long VAL_WARNING_2001_SIG_VALUE_DEFAULT = 131512896000000000L;
    public static final long VAL_WARNING_2001_VALUE_DISABLED = Long.MAX_VALUE;
    public static final String[] LOGGING_LEVEL_NAMES = {"Easy", "Medium", "Hard"};
    public static final String[] LOGGING_LEVEL_VALUES = {"1", "9", "63"};
    public static final List<String> ALWAYS_ENABLED_KEY_DEVICES = new ArrayList<String>() { // from class: ru.cprocsp.ACSP.tools.config.ConfigConstants.1
        {
            add("HDIMAGE");
        }
    };
}
