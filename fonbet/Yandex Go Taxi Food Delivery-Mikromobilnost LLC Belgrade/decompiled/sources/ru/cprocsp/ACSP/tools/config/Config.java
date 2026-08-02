package ru.cprocsp.ACSP.tools.config;

import android.content.Context;
import android.util.Log;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import defpackage.g8e;
import defpackage.qv10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ru.CryptoPro.JCP.Util.ClearCryptoProPrefs;
import ru.CryptoPro.JCSP.MSCAPI.CAPISupport;
import ru.CryptoPro.XAdES.XAdESParameters;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public final class Config extends IniFile implements ConfigInterface {
    private final Map<String, String> loggingLevels;

    public interface ConfigWriter {
        void write(File file) throws Exception;
    }

    public Config(Context context, String str, boolean z) throws Exception {
        super(str, z);
        this.loggingLevels = new LinkedHashMap();
        int i = 0;
        while (true) {
            String[] strArr = ConfigConstants.LOGGING_LEVEL_NAMES;
            if (i >= strArr.length) {
                return;
            }
            this.loggingLevels.put(strArr[i], ConfigConstants.LOGGING_LEVEL_VALUES[i]);
            i++;
        }
    }

    private String getDefaultLoggingLevelName() {
        Set<String> keySet = this.loggingLevels.keySet();
        String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
        String str = strArr.length > 0 ? strArr[0] : null;
        if (str != null) {
            return str.replace("\"", "");
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "Default logging level not found.");
        return null;
    }

    private boolean replace(ConfigWriter configWriter) throws Exception {
        synchronized (Config.class) {
            File file = this.paramFile;
            File createTempFile = File.createTempFile(file.getName(), null);
            configWriter.write(createTempFile);
            Files.move(createTempFile.toPath(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
            load(file);
        }
        return true;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public boolean disableKeyStoreType(String str) {
        return false;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public boolean disableWarning2001(boolean z) {
        long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        long j2 = z ? Long.MAX_VALUE : ConfigConstants.VAL_WARNING_2001_GEN_VALUE_DEFAULT;
        if (!z) {
            j = ConfigConstants.VAL_WARNING_2001_SIG_VALUE_DEFAULT;
        }
        if (CAPISupport.supportRegistryPutLongLong(ConfigConstants.CONFIG_Parameters_warning_time_gen_2001, j2) != 0) {
            Log.e(LogConstants.APP_LOGGER_TAG, "Cannot write \\config\\Parameters\\warning_time_gen_2001");
            return false;
        }
        if (CAPISupport.supportRegistryPutLongLong(ConfigConstants.CONFIG_Parameters_warning_time_sign_2001, j) == 0) {
            return true;
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "Cannot write \\config\\Parameters\\warning_time_sign_2001");
        return false;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public boolean enableKeyStoreType(String str) {
        return false;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public Map<String, String> getCachedKeyStoreTypes() {
        return Collections.EMPTY_MAP;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public String getCurrentLoggingLevel() {
        String str;
        long[] jArr = new long[1];
        if (CAPISupport.supportRegistryGetLong(ConfigConstants.CONFIG_AndroidLoggingLevel_ActiveLoggingLevel, jArr) != 0) {
            return getDefaultLoggingLevelName();
        }
        String l = Long.toString(jArr[0]);
        Iterator<Map.Entry<String, String>> it = this.loggingLevels.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            Map.Entry<String, String> next = it.next();
            if (next.getValue().equalsIgnoreCase(l)) {
                str = next.getKey();
                break;
            }
        }
        return str == null ? getDefaultLoggingLevelName() : str.replace("\"", "");
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public String getCurrentReaderName() {
        String[] strArr = new String[1];
        if (CAPISupport.supportRegistryGetString(ConfigConstants.CONFIG_Android_ActiveReaderPseudo, strArr) == 0) {
            return strArr[0];
        }
        String[] readerList = getReaderList();
        if (readerList.length > 0) {
            return readerList[0];
        }
        return null;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public Map<String, String> getKeyStoreTypes() {
        HashMap u = g8e.u("HDIMAGE", "KeyDevices\\HDIMAGE\\Default", "Aktiv Rutoken ECP 1", "KeyDevices\\PCSC\\\"Aktiv Rutoken ECP 1\"\\Default");
        u.put("Aktiv Rutoken ECP 2", "KeyDevices\\PCSC\\\"Aktiv Rutoken ECP 2\"\\Default");
        u.put("Aktiv Rutoken ECP BT 1", "KeyDevices\\PCSC\\\"Aktiv Rutoken ECP BT 1\"\\Default");
        u.put("Aktiv Rutoken ECP BT 2", "KeyDevices\\PCSC\\\"Aktiv Rutoken ECP BT 2\"\\Default");
        u.put("Aktiv Rutoken ECP NFC 1", "KeyDevices\\PCSC\\\"Aktiv Rutoken ECP NFC 1\"\\Default");
        u.put("Aktiv Rutoken ECP NFC 2", "KeyDevices\\PCSC\\\"Aktiv Rutoken ECP NFC 2\"\\Default");
        u.put("AKS ifdh 0", "KeyDevices\\PCSC\\\"AKS ifdh 00 00\"\\Default");
        u.put("AKS ifdh 1", "KeyDevices\\PCSC\\\"AKS ifdh 01 00\"\\Default");
        u.put("ARDS JaCarta 0", "KeyDevices\\PCSC\\\"Aladdin R.D. JaCarta 00 00\"\\Default");
        u.put("ARDS JaCarta 1", "KeyDevices\\PCSC\\\"Aladdin R.D. JaCarta 01 00\"\\Default");
        u.put("ARDS JaCarta 2", "KeyDevices\\PCSC\\\"Aladdin R.D. JaCarta (000000000000) 00 00\"\\Default");
        u.put("Aladdin Token JC 0", "KeyDevices\\PCSC\\\"Aladdin eToken PRO USB 72K Java 00 00\"\\Default");
        u.put("Aladdin Token JC 1", "KeyDevices\\PCSC\\\"Aladdin eToken PRO USB 72K Java 01 00\"\\Default");
        u.put("ARDS JaCarta LT 0", "KeyDevices\\PCSC\\\"Aladdin R.D. JaCarta LT 00 00\"\\Default");
        u.put("ARDS JaCarta LT 1", "KeyDevices\\PCSC\\\"Aladdin R.D. JaCarta LT 01 00\"\\Default");
        return u;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public String[] getReaderList() {
        return new String[]{"Rutoken", "JaCarta"};
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public boolean isKeyStoreAlwaysEnabled(String str) {
        return ConfigConstants.ALWAYS_ENABLED_KEY_DEVICES.contains(str);
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public boolean isWarning2001Disabled() {
        long[] jArr = new long[1];
        if (CAPISupport.supportRegistryGetLongLong(ConfigConstants.CONFIG_Parameters_warning_time_gen_2001, jArr) != 0) {
            Log.e(LogConstants.APP_LOGGER_TAG, "Cannot read \\config\\Parameters\\warning_time_gen_2001");
        }
        long[] jArr2 = new long[1];
        if (CAPISupport.supportRegistryGetLongLong(ConfigConstants.CONFIG_Parameters_warning_time_sign_2001, jArr2) != 0) {
            Log.e(LogConstants.APP_LOGGER_TAG, "Cannot read \\config\\Parameters\\warning_time_sign_2001");
        }
        return jArr[0] == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED && jArr2[0] == ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
    }

    @Override // ru.cprocsp.ACSP.tools.config.AbstractFile
    @Deprecated
    public void save() throws Exception {
        Log.e(LogConstants.APP_LOGGER_TAG, "Unimplemented method.");
    }

    public boolean setLibraryPath(String str) {
        String str2;
        String[] strArr = new String[1];
        return (CAPISupport.supportRegistryGetString(ConfigConstants.CONFIG_LibraryPath_path, strArr) == 0 && (str2 = strArr[0]) != null && str2.replace("\"", "").equals(str)) || CAPISupport.supportRegistryPutString(ConfigConstants.CONFIG_LibraryPath_path, str) == 0;
    }

    public boolean setLocaleLanguage(String str) {
        String str2;
        String language = Locale.getDefault().getLanguage();
        String str3 = ClearCryptoProPrefs.COUNTRY;
        if (!language.equalsIgnoreCase(ClearCryptoProPrefs.COUNTRY)) {
            str3 = "en";
        }
        String[] strArr = new String[1];
        return (CAPISupport.supportRegistryGetString(ConfigConstants.CONFIG_AndroidLocale_Language, strArr) == 0 && (str2 = strArr[0]) != null && str2.replace("\"", "").equals(str3)) || CAPISupport.supportRegistryPutString(ConfigConstants.CONFIG_AndroidLocale_Language, str3) == 0;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public boolean setLoggingLevel(String str) {
        try {
            long parseLong = Long.parseLong(this.loggingLevels.get(str));
            if (CAPISupport.supportRegistryPutLong(ConfigConstants.CONFIG_AndroidLoggingLevel_ActiveLoggingLevel, parseLong) != 0) {
                Log.e(LogConstants.APP_LOGGER_TAG, "Cannot write \\config\\AndroidLoggingLevel\\ActiveLoggingLevel");
                return false;
            }
            String[] strArr = {"csp", "capi10", "cpext", "capi20", "cspr", "cryptsrv", "kchansrv", "fenixmsrv", "ssp", "cppkcs11", "cpdrv", "dmntcs", "ocsp", "tsp", "ades", "cades", "pkivalidator", "pcsc", "cryptoki", "fkc", FoldersConfig.SUPPORT_FILTER_ID, XAdESParameters.XADES_SIGNATURE_PREFIX, "reprov", "credprov", "xcpui", "cpui"};
            boolean z = true;
            for (int i = 0; i < 26; i++) {
                String str2 = strArr[i];
                if (CAPISupport.supportRegistryPutLong(ConfigConstants.CONFIG_debug + str2, parseLong) != 0) {
                    Log.e(LogConstants.APP_LOGGER_TAG, "Cannot write logging level " + parseLong + " for logger \\config\\debug\\" + str2);
                    z = false;
                }
            }
            return z;
        } catch (Exception e) {
            Log.e(LogConstants.APP_LOGGER_TAG, "Cannot set logging level " + str, e);
            return false;
        }
    }

    public boolean setPKCS11Path(String str) {
        String str2;
        String[] strArr = new String[1];
        if (CAPISupport.supportRegistryGetString(ConfigConstants.CONFIG_KeyDevices_cryptoki_PNPcryptoki_Default_pkcs11_dll, strArr) == 0 && (str2 = strArr[0]) != null) {
            String absolutePath = new File(str2.replace("\"", "")).getAbsolutePath();
            int lastIndexOf = absolutePath.lastIndexOf(File.separator);
            if (lastIndexOf >= 0) {
                absolutePath = absolutePath.substring(0, lastIndexOf);
            }
            if (absolutePath.equals(str)) {
                return true;
            }
        }
        StringBuilder t = qv10.t(str);
        t.append(File.separator);
        t.append("librtpkcs11ecp.so");
        return CAPISupport.supportRegistryPutString(ConfigConstants.CONFIG_KeyDevices_cryptoki_PNPcryptoki_Default_pkcs11_dll, t.toString()) == 0;
    }

    @Override // ru.cprocsp.ACSP.tools.config.ConfigInterface
    public boolean setReaderName(String str) {
        if (CAPISupport.supportRegistryPutString(ConfigConstants.CONFIG_Android_ActiveReaderPseudo, str) != 0) {
            Log.e(LogConstants.APP_LOGGER_TAG, "Cannot write \\config\\Android\\ActiveReaderPseudo");
            return false;
        }
        String[] strArr = new String[1];
        if (CAPISupport.supportRegistryGetString(g8e.o(ConfigConstants.CONFIG_AndroidReaders, str), strArr) == 0) {
            return CAPISupport.supportRegistryPutString(ConfigConstants.CONFIG_Android_ActiveReaderLibraryName, strArr[0]) == 0;
        }
        Log.e(LogConstants.APP_LOGGER_TAG, "Cannot read \\config\\AndroidReaders\\" + str);
        return false;
    }

    public boolean update(final InputStream inputStream) {
        try {
            return replace(new ConfigWriter() { // from class: ru.cprocsp.ACSP.tools.config.Config.1
                @Override // ru.cprocsp.ACSP.tools.config.Config.ConfigWriter
                public void write(File file) throws Exception {
                    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        while (bufferedReader.ready()) {
                            try {
                                bufferedWriter.write(bufferedReader.readLine());
                                bufferedWriter.write("\n");
                            } finally {
                            }
                        }
                        bufferedReader.close();
                        bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            });
        } catch (Exception e) {
            Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
            return false;
        }
    }
}
