package com.netcetera.threeds.sdk.infrastructure;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public class pe {
    public static final pe ThreeDS2Service;
    public static final pe ThreeDS2ServiceInstance;
    public static final pe initialize;
    private final ThreeDS2ServiceInstance get;
    private final Set<String> getWarnings;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.pe$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ThreeDS2ServiceInstance;

        static {
            int[] iArr = new int[ThreeDS2ServiceInstance.values().length];
            ThreeDS2ServiceInstance = iArr;
            try {
                iArr[ThreeDS2ServiceInstance.WHITELIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2ServiceInstance[ThreeDS2ServiceInstance.BLACKLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum ThreeDS2ServiceInstance {
        WHITELIST,
        BLACKLIST
    }

    static {
        ThreeDS2ServiceInstance threeDS2ServiceInstance = ThreeDS2ServiceInstance.BLACKLIST;
        ThreeDS2ServiceInstance = new pe(threeDS2ServiceInstance, new String[0]);
        initialize = new pe(threeDS2ServiceInstance, "none");
        ThreeDS2Service = new pe(ThreeDS2ServiceInstance.WHITELIST, "none");
    }

    public pe(ThreeDS2ServiceInstance threeDS2ServiceInstance, String... strArr) {
        if (threeDS2ServiceInstance == null) {
            a$$ExternalSyntheticBUOutline0.m$2("ConstraintType cannot be null");
            throw null;
        }
        this.get = threeDS2ServiceInstance;
        this.getWarnings = new HashSet(Arrays.asList(strArr));
    }

    public void getWarnings(String str) {
        int i = AnonymousClass1.ThreeDS2ServiceInstance[this.get.ordinal()];
        if (i == 1) {
            if (!this.getWarnings.contains(str)) {
                throw new rm(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("'", str, "' is not a whitelisted algorithm."));
            }
        } else if (i == 2 && this.getWarnings.contains(str)) {
            throw new rm(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("'", str, "' is a blacklisted algorithm."));
        }
    }
}
