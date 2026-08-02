package com.datadog.trace.bootstrap.config.provider;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.datadog.trace.api.ConfigCollector;
import com.datadog.trace.bootstrap.config.provider.ConfigConverter;
import com.datadog.trace.util.Strings;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes4.dex */
public final class ConfigProvider {
    public final Object sources;

    public /* synthetic */ ConfigProvider(Object obj) {
        this.sources = obj;
    }

    public static void collectMapSetting(String str, HashMap hashMap, int i) {
        if (hashMap.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append((String) entry.getKey());
            sb.append(':');
            sb.append((String) entry.getValue());
        }
        ConfigCollector.INSTANCE.put(str, i, sb.toString());
    }

    public Object get(String str, Object obj, Class cls, String... strArr) {
        String property;
        Object valueOf;
        for (ConfigProvider configProvider : (ConfigProvider[]) this.sources) {
            try {
                Properties properties = (Properties) configProvider.sources;
                property = properties.getProperty(str);
                if (property == null) {
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            property = null;
                            break;
                        }
                        String property2 = properties.getProperty(strArr[i]);
                        if (property2 != null) {
                            property = property2;
                            break;
                        }
                        i++;
                    }
                }
                valueOf = ConfigConverter.valueOf(cls, property);
            } catch (NumberFormatException unused) {
            }
            if (valueOf != null) {
                ConfigCollector.INSTANCE.put(str, 3, property);
                return valueOf;
            }
            continue;
        }
        if (obj != null) {
            ConfigCollector.INSTANCE.put(str, 4, obj);
        }
        return obj;
    }

    public boolean getBoolean(String[] strArr, String str, boolean z) {
        return ((Boolean) get(str, Boolean.valueOf(z), Boolean.class, strArr)).booleanValue();
    }

    public float getFloat(String str, float f) {
        return ((Float) get(str, Float.valueOf(f), Float.class, new String[0])).floatValue();
    }

    public int getInteger(int i, String str, String... strArr) {
        return ((Integer) get(str, Integer.valueOf(i), Integer.class, strArr)).intValue();
    }

    public BitSet getIntegerRange(String str, BitSet bitSet) {
        String string2 = getString(str);
        if (string2 != null) {
            try {
                return ConfigConverter.parseIntegerRangeSet(string2);
            } catch (NumberFormatException unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int nextSetBit = bitSet.nextSetBit(i);
            if (nextSetBit < 0) {
                ConfigCollector.INSTANCE.put(str, 4, sb.toString());
                return bitSet;
            }
            int nextClearBit = bitSet.nextClearBit(nextSetBit);
            if (sb.length() > 0) {
                sb.append(',');
            }
            if (nextSetBit < nextClearBit - 1) {
                sb.append(nextSetBit);
                sb.append('-');
                sb.append(nextClearBit);
            } else {
                sb.append(nextSetBit);
            }
            i = nextClearBit;
        }
    }

    public List getList(String str) {
        return ConfigConverter.parseList(getString(str), ",");
    }

    public HashMap getMergedMap(String str) {
        Map map;
        HashMap hashMap = new HashMap();
        ConfigProvider[] configProviderArr = (ConfigProvider[]) this.sources;
        int i = 4;
        for (int length = configProviderArr.length - 1; length >= 0; length--) {
            String trim = Strings.trim(((Properties) configProviderArr[length].sources).getProperty(str));
            if (trim.isEmpty()) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap hashMap2 = new HashMap();
                ConfigConverter.loadMap(trim, hashMap2);
                map = hashMap2;
            }
            if (!map.isEmpty()) {
                configProviderArr[length].getClass();
                i = 3;
            }
            hashMap.putAll(map);
        }
        collectMapSetting(str, hashMap, i);
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0171 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public HashMap getMergedMapWithOptionalMappings(String str, String... strArr) {
        ConfigProvider[] configProviderArr;
        Map map;
        int i;
        String str2;
        String str3 = str;
        String[] strArr2 = strArr;
        ConfigProvider[] configProviderArr2 = (ConfigProvider[]) this.sources;
        HashMap hashMap = new HashMap();
        int length = strArr2.length;
        int i2 = 4;
        int i3 = 0;
        while (i3 < length) {
            String str4 = strArr2[i3];
            int length2 = configProviderArr2.length - 1;
            int i4 = i2;
            while (length2 >= 0) {
                String trim = Strings.trim(((Properties) configProviderArr2[length2].sources).getProperty(str4));
                if (trim.isEmpty()) {
                    map = Collections.EMPTY_MAP;
                    configProviderArr = configProviderArr2;
                } else {
                    HashMap hashMap2 = new HashMap();
                    try {
                        String concat = (str3.isEmpty() || str3.endsWith(".")) ? str3 : str3.concat(".");
                        int length3 = trim.length();
                        int i5 = trim.indexOf(44) == -1 ? 32 : 44;
                        int i6 = 0;
                        while (i6 < length3) {
                            int indexOf = trim.indexOf(i5, i6);
                            int indexOf2 = trim.indexOf(58, i6);
                            if (indexOf == -1) {
                                indexOf = indexOf2;
                            } else if (indexOf2 != -1) {
                                indexOf = Math.min(indexOf, indexOf2);
                            }
                            if (indexOf == -1) {
                                configProviderArr = configProviderArr2;
                                indexOf = length3;
                            } else if (indexOf == indexOf2) {
                                int indexOf3 = trim.indexOf(i5, indexOf + 1);
                                if (indexOf2 == i6) {
                                    throw new ConfigConverter.BadFormatException("Illegal empty key at position " + i6);
                                }
                                configProviderArr = configProviderArr2;
                                if (indexOf3 == -1) {
                                    indexOf3 = length3;
                                }
                                int i7 = indexOf;
                                indexOf = indexOf3;
                                i = i7;
                                if (i6 != indexOf) {
                                    try {
                                        String trimmedHeader = ConfigConverter.trimmedHeader(i6, i, trim, true);
                                        if (!trimmedHeader.isEmpty()) {
                                            if (i == indexOf2) {
                                                str2 = ConfigConverter.trimmedHeader(i + 1, indexOf, trim, false);
                                                if (!str2.isEmpty() && !Character.isLetter(str2.charAt(0))) {
                                                    throw new ConfigConverter.BadFormatException("Illegal tag starting with non letter for key '" + trimmedHeader + "'");
                                                }
                                            } else {
                                                if (!Character.isLetter(trimmedHeader.charAt(0))) {
                                                    throw new ConfigConverter.BadFormatException("Illegal key only tag starting with non letter '" + trimmedHeader + "'");
                                                }
                                                str2 = concat + Strings.normalizedHeaderTag(trimmedHeader);
                                            }
                                            if (!str2.isEmpty()) {
                                                try {
                                                    hashMap2.put(trimmedHeader, str2);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    if (th instanceof ConfigConverter.BadFormatException) {
                                                    }
                                                    hashMap2.clear();
                                                    map = hashMap2;
                                                    if (!map.isEmpty()) {
                                                    }
                                                    hashMap.putAll(map);
                                                    length2--;
                                                    str3 = str;
                                                    configProviderArr2 = configProviderArr;
                                                }
                                            }
                                            i6 = indexOf + 1;
                                            configProviderArr2 = configProviderArr;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (th instanceof ConfigConverter.BadFormatException) {
                                            th.getMessage();
                                        }
                                        hashMap2.clear();
                                        map = hashMap2;
                                        if (!map.isEmpty()) {
                                        }
                                        hashMap.putAll(map);
                                        length2--;
                                        str3 = str;
                                        configProviderArr2 = configProviderArr;
                                    }
                                }
                                i6 = indexOf + 1;
                                configProviderArr2 = configProviderArr;
                            } else {
                                configProviderArr = configProviderArr2;
                            }
                            i = indexOf;
                            if (i6 != indexOf) {
                            }
                            i6 = indexOf + 1;
                            configProviderArr2 = configProviderArr;
                        }
                        configProviderArr = configProviderArr2;
                    } catch (Throwable th3) {
                        th = th3;
                        configProviderArr = configProviderArr2;
                    }
                    map = hashMap2;
                }
                if (!map.isEmpty()) {
                    configProviderArr[length2].getClass();
                    i4 = 3;
                }
                hashMap.putAll(map);
                length2--;
                str3 = str;
                configProviderArr2 = configProviderArr;
            }
            collectMapSetting(str4, hashMap, i4);
            i3++;
            str3 = str;
            strArr2 = strArr;
            i2 = i4;
        }
        return hashMap;
    }

    public LinkedHashMap getOrderedMap(String str) {
        Map map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ConfigProvider[] configProviderArr = (ConfigProvider[]) this.sources;
        int i = 4;
        for (int length = configProviderArr.length - 1; length >= 0; length--) {
            String trim = Strings.trim(((Properties) configProviderArr[length].sources).getProperty(str));
            if (trim.isEmpty()) {
                map = Collections.EMPTY_MAP;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ConfigConverter.loadMap(trim, linkedHashMap2);
                map = linkedHashMap2;
            }
            if (!map.isEmpty()) {
                configProviderArr[length].getClass();
                i = 3;
            }
            linkedHashMap.putAll(map);
        }
        collectMapSetting(str, linkedHashMap, i);
        return linkedHashMap;
    }

    public String getString(String str, String str2, String... strArr) {
        for (ConfigProvider configProvider : (ConfigProvider[]) this.sources) {
            Properties properties = (Properties) configProvider.sources;
            String property = properties.getProperty(str);
            if (property == null) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        property = null;
                        break;
                    }
                    String property2 = properties.getProperty(strArr[i]);
                    if (property2 != null) {
                        property = property2;
                        break;
                    }
                    i++;
                }
            }
            if (property != null) {
                ConfigCollector.INSTANCE.put(str, 3, property);
                return property;
            }
        }
        if (str2 != null) {
            ConfigCollector.INSTANCE.put(str, 4, str2);
        }
        return str2;
    }

    public boolean isEnabled(Collection collection, String str, String str2, boolean z) {
        Iterator it = collection.iterator();
        boolean z2 = z;
        while (it.hasNext()) {
            String m = Recorder$$ExternalSyntheticOutline2.m(str, (String) it.next(), str2);
            boolean z3 = getBoolean(new String[]{m}, m.startsWith("trace.") ? m : "trace.".concat(m), z);
            z2 = z ? z2 & z3 : z2 | z3;
        }
        return z2;
    }

    public String getString(String str) {
        return getString(str, null, new String[0]);
    }
}
