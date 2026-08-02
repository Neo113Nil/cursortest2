package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.View;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
class du extends bs<View> {
    private static int get = 1;
    private static int initialize;
    private boolean ThreeDS2Service;
    private final dx ThreeDS2ServiceInstance;
    private final com.netcetera.threeds.sdk.api.ui.ProgressView getWarnings;

    public du(com.netcetera.threeds.sdk.api.ui.ProgressView progressView, dx dxVar) {
        this.getWarnings = progressView;
        this.ThreeDS2ServiceInstance = dxVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object initialize(Object[] objArr) {
        du duVar = new du((com.netcetera.threeds.sdk.api.ui.ProgressView) objArr[0], new dx(false));
        int i = initialize;
        int i2 = i & 77;
        int i3 = (i ^ 77) | i2;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        get = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return duVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public void ThreeDS2Service() {
        int i = initialize;
        int i2 = i & 55;
        get = (((i | 55) & (~i2)) + (i2 << 1)) % 128;
        this.ThreeDS2ServiceInstance.initialize();
        int i3 = get;
        initialize = Thread$State$EnumUnboxingLocalUtility.m(i3 ^ 4, (i3 & 4) << 1, 1, 128);
    }

    public void get() {
        int i = (initialize + 73) % 128;
        get = i;
        if (this.ThreeDS2Service) {
            int i2 = (i ^ 93) + ((i & 93) << 1);
            initialize = i2 % 128;
            int i3 = i2 % 2;
            dx dxVar = this.ThreeDS2ServiceInstance;
            if (i3 != 0) {
                dxVar.getWarnings();
                throw null;
            }
            dxVar.getWarnings();
        } else {
            this.getWarnings.showProgress();
            int i4 = initialize;
            get = (((i4 & (-126)) | ((~i4) & 125)) + ((i4 & 125) << 1)) % 128;
        }
        int i5 = initialize;
        int i6 = i5 & 71;
        int i7 = -(-((i5 ^ 71) | i6));
        get = (((i6 | i7) << 1) - (i7 ^ i6)) % 128;
    }

    public void getWarnings() {
        int i = initialize + 79;
        get = i % 128;
        int i2 = i % 2;
        boolean z = this.ThreeDS2Service;
        if (i2 == 0) {
            throw null;
        }
        if (z) {
            this.ThreeDS2ServiceInstance.get();
            initialize = ((-2) - ((get + 110) ^ (-1))) % 128;
        } else {
            this.getWarnings.hideProgress();
            int i3 = initialize;
            int i4 = ((i3 ^ 47) | (i3 & 47)) << 1;
            int i5 = -(((~i3) & 47) | (i3 & (-48)));
            get = ((i4 & i5) + (i5 | i4)) % 128;
        }
        this.ThreeDS2Service = true;
        initialize = (get + 39) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.bs
    public View initialize(Context context) {
        int i = initialize;
        int i2 = (i ^ 25) + ((i & 25) << 1);
        get = i2 % 128;
        int i3 = i2 % 2;
        dx dxVar = this.ThreeDS2ServiceInstance;
        if (i3 != 0) {
            return dxVar.get(context);
        }
        dxVar.get(context);
        throw null;
    }
}
