package com.netcetera.threeds.sdk.infrastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class setThreeDSRequestorAppURL {
    private static final no initialize = (no) nu.initialize(new Object[]{setThreeDSRequestorAppURL.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private static Map<Class<? extends setAcsSignedContent>, setAcsSignedContent> getWarnings = new LinkedHashMap();

    private static boolean ThreeDS2ServiceInstance(setAcsSignedContent setacssignedcontent) {
        return getWarnings.containsKey(setacssignedcontent.getClass());
    }

    private static boolean get() {
        Iterator<setAcsSignedContent> it = getWarnings.values().iterator();
        while (it.hasNext()) {
            if (it.next().initialize() == null) {
                return true;
            }
        }
        return false;
    }

    public static void getWarnings(Class<? extends setAcsSignedContent> cls) {
        setAcsSignedContent remove = getWarnings.remove(cls);
        if (remove == null) {
            cls.getSimpleName();
            return;
        }
        cls.getSimpleName();
        Iterator it = new ArrayList(getWarnings.values()).iterator();
        while (it.hasNext()) {
            setAcsSignedContent setacssignedcontent = (setAcsSignedContent) it.next();
            setacssignedcontent.getClass();
            if (remove.getClass().equals(setacssignedcontent.initialize())) {
                getWarnings((Class<? extends setAcsSignedContent>) setacssignedcontent.getClass());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void initialize(setAcsSignedContent setacssignedcontent) {
        setacssignedcontent.getClass();
        if (ThreeDS2ServiceInstance(setacssignedcontent)) {
            throw new setAcsRefNumber("Module [" + setacssignedcontent.getClass() + "] already installed.");
        }
        if (getWarnings(setacssignedcontent) && get()) {
            throw new setAcsRefNumber("Root module already installed. Only single root module allowed.");
        }
        if (getWarnings(setacssignedcontent) || get(setacssignedcontent)) {
            getWarnings.put(setacssignedcontent.getClass(), setacssignedcontent);
            return;
        }
        throw new setAcsRefNumber("The parent module of [" + setacssignedcontent.getClass().getSimpleName() + "] is not installed. The parent module is [" + setacssignedcontent.initialize().getSimpleName() + "]");
    }

    private static boolean get(setAcsSignedContent setacssignedcontent) {
        return getWarnings.containsKey(setacssignedcontent.initialize());
    }

    private static boolean getWarnings(setAcsSignedContent setacssignedcontent) {
        return setacssignedcontent.initialize() == null;
    }

    public static <T> T initialize(Class<T> cls) {
        Iterator<setAcsSignedContent> it = getWarnings.values().iterator();
        while (it.hasNext()) {
            T t = (T) it.next().ThreeDS2ServiceInstance(cls);
            if (t != null) {
                return t;
            }
        }
        throw new setAcsRefNumber(cls.getSimpleName().concat(" not registered in any module."));
    }
}
