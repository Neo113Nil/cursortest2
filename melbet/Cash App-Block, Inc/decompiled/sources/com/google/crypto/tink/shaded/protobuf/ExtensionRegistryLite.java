package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class ExtensionRegistryLite {
    public static final ExtensionRegistryLite EMPTY_REGISTRY_LITE;
    public static volatile ExtensionRegistryLite emptyRegistry;

    static {
        ExtensionRegistryLite extensionRegistryLite = new ExtensionRegistryLite();
        Map map = Collections.EMPTY_MAP;
        EMPTY_REGISTRY_LITE = extensionRegistryLite;
    }

    public static ExtensionRegistryLite getEmptyRegistry() {
        ExtensionRegistryLite extensionRegistryLite;
        Protobuf protobuf = Protobuf.INSTANCE;
        ExtensionRegistryLite extensionRegistryLite2 = emptyRegistry;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = emptyRegistry;
                if (extensionRegistryLite == null) {
                    Class cls = ExtensionRegistryFactory.EXTENSION_REGISTRY_CLASS;
                    ExtensionRegistryLite extensionRegistryLite3 = null;
                    if (cls != null) {
                        try {
                            extensionRegistryLite3 = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    extensionRegistryLite = extensionRegistryLite3 != null ? extensionRegistryLite3 : EMPTY_REGISTRY_LITE;
                    emptyRegistry = extensionRegistryLite;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return extensionRegistryLite;
    }
}
