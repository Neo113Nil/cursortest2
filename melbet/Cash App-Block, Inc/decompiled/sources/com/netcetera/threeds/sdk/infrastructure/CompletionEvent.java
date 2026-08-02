package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import java.util.List;

/* loaded from: classes5.dex */
public class CompletionEvent {
    private static int get = 1;
    private static int initialize;
    private final getErrorMessage ThreeDS2Service;
    private final setCacheColorHint.get ThreeDS2ServiceInstance;
    private final List<com.netcetera.threeds.sdk.api.security.Warning> getWarnings;

    public CompletionEvent(getErrorMessage geterrormessage, List<com.netcetera.threeds.sdk.api.security.Warning> list, setCacheColorHint.get getVar) {
        this.ThreeDS2Service = geterrormessage;
        this.getWarnings = list;
        this.ThreeDS2ServiceInstance = getVar;
    }

    public getErrorMessage ThreeDS2ServiceInstance() {
        int i = get;
        int i2 = (i ^ 117) + ((i & 117) << 1);
        initialize = i2 % 128;
        int i3 = i2 % 2;
        getErrorMessage geterrormessage = this.ThreeDS2Service;
        if (i3 != 0) {
            throw null;
        }
        initialize = (i + 79) % 128;
        return geterrormessage;
    }

    public setCacheColorHint.get get() {
        int i = initialize;
        int i2 = i & 111;
        int i3 = ((i ^ 111) | i2) << 1;
        int i4 = -((~i2) & (i | 111));
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        get = i5 % 128;
        int i6 = i5 % 2;
        setCacheColorHint.get getVar = this.ThreeDS2ServiceInstance;
        if (i6 == 0) {
            throw null;
        }
        int i7 = (i & (-58)) | ((~i) & 57);
        int i8 = (i & 57) << 1;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        get = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 69 / 0;
        }
        return getVar;
    }

    public List<com.netcetera.threeds.sdk.api.security.Warning> initialize() {
        int i = initialize;
        int i2 = i & 51;
        int i3 = i | 51;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        get = i5;
        int i6 = i4 % 2;
        List<com.netcetera.threeds.sdk.api.security.Warning> list = this.getWarnings;
        if (i6 == 0) {
            int i7 = 40 / 0;
        }
        int i8 = i5 & 49;
        int i9 = (i5 ^ 49) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        initialize = i10 % 128;
        if (i10 % 2 == 0) {
            return list;
        }
        throw null;
    }
}
