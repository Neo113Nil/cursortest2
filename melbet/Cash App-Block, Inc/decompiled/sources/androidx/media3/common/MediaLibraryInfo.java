package androidx.media3.common;

import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class MediaLibraryInfo {
    public static final HashSet registeredModules = new HashSet();
    public static String registeredModulesString = "media3.common";

    public static synchronized void registerModule(String str) {
        synchronized (MediaLibraryInfo.class) {
            if (registeredModules.add(str)) {
                registeredModulesString += ", " + str;
            }
        }
    }
}
