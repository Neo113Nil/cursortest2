package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.webkit.WebViewClient;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.at;
import com.netcetera.threeds.sdk.infrastructure.cn;

/* loaded from: classes5.dex */
public final class ax extends aw implements elements {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int get;
    private boolean ThreeDS2Service;
    private bg ThreeDS2ServiceInstance;
    private final setShadowLayer getWarnings;

    public ax(Context context, au auVar, setShadowLayer setshadowlayer) {
        super(context, auVar);
        this.ThreeDS2Service = false;
        this.ThreeDS2ServiceInstance = new bg("");
        this.getWarnings = setshadowlayer;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        ax axVar = (ax) objArr[0];
        ThreeDS2ServiceInitializationCallback = (get + 61) % 128;
        computeIfAbsent ThreeDS2ServiceInstance = axVar.ThreeDS2ServiceInstance();
        if (!(ThreeDS2ServiceInstance instanceof cn.ThreeDS2ServiceInstance)) {
            throw setTextAlignment.getIds.initialize(new Object[0]);
        }
        int i = get;
        int i2 = i & 21;
        int i3 = i2 + ((i ^ 21) | i2);
        ThreeDS2ServiceInitializationCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return (cn.ThreeDS2ServiceInstance) ThreeDS2ServiceInstance;
        }
        throw null;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        cn.ThreeDS2ServiceInstance threeDS2ServiceInstance;
        ax axVar = (ax) objArr[0];
        int i = get;
        int i2 = (i & 97) + (i | 97);
        ThreeDS2ServiceInitializationCallback = i2 % 128;
        if (i2 % 2 == 0) {
            threeDS2ServiceInstance = (cn.ThreeDS2ServiceInstance) ThreeDS2ServiceInstance(new Object[]{axVar}, -29065550, 29065552, System.identityHashCode(axVar));
            int i3 = 94 / 0;
        } else {
            threeDS2ServiceInstance = (cn.ThreeDS2ServiceInstance) ThreeDS2ServiceInstance(new Object[]{axVar}, -29065550, 29065552, System.identityHashCode(axVar));
        }
        int i4 = ThreeDS2ServiceInitializationCallback;
        int i5 = (((i4 ^ 111) | (i4 & 111)) << 1) - (((~i4) & 111) | (i4 & (-112)));
        get = i5 % 128;
        if (i5 % 2 == 0) {
            return threeDS2ServiceInstance;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        ax axVar = (ax) objArr[0];
        bg bgVar = (bg) objArr[1];
        int i = ThreeDS2ServiceInitializationCallback;
        get = ((i ^ 125) + ((i & 125) << 1)) % 128;
        axVar.ThreeDS2ServiceInstance = bgVar;
        int i2 = (i ^ 7) + ((i & 7) << 1);
        get = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 62 / 0;
        }
        return bgVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.aw
    public WebViewClient aE_(Context context) {
        at initialize = at.initialize(context, this.getWarnings, new at.ThreeDS2Service() { // from class: com.netcetera.threeds.sdk.infrastructure.ax.5
            private static int ThreeDS2Service = 1;
            private static int ThreeDS2ServiceInstance;

            @Override // com.netcetera.threeds.sdk.infrastructure.at.ThreeDS2Service
            public void ThreeDS2Service(String str) {
                ((cn.ThreeDS2ServiceInstance) ax.ThreeDS2ServiceInstance(new Object[]{ax.this}, -1891619122, 1891619125, (int) System.currentTimeMillis())).ThreeDS2Service(new bg(str));
                int i = ThreeDS2ServiceInstance;
                int i2 = i & 73;
                int i3 = ((i | 73) & (~i2)) + (i2 << 1);
                ThreeDS2Service = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.at.ThreeDS2Service
            public void ThreeDS2ServiceInstance(String str) {
                int i = ThreeDS2ServiceInstance;
                ThreeDS2Service = Thread$State$EnumUnboxingLocalUtility.m(i & 78, i | 78, 1, 128);
            }

            @Override // com.netcetera.threeds.sdk.infrastructure.x.get
            public void getWarnings(String str) {
                ((cn.ThreeDS2ServiceInstance) ax.ThreeDS2ServiceInstance(new Object[]{ax.this}, -1891619122, 1891619125, (int) System.currentTimeMillis())).get(new bg(str));
                int i = ThreeDS2Service;
                int i2 = (i ^ 14) + ((i & 14) << 1);
                ThreeDS2ServiceInstance = ((i2 ^ (-1)) + (i2 << 1)) % 128;
            }
        });
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = ((i | 33) << 1) - (i ^ 33);
        get = i2 % 128;
        if (i2 % 2 == 0) {
            return initialize;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        ((com.netcetera.threeds.sdk.infrastructure.cn.ThreeDS2ServiceInstance) ThreeDS2ServiceInstance(new java.lang.Object[]{r3}, -29065550, 29065552, java.lang.System.identityHashCode(r3))).getWarnings(r3.ThreeDS2ServiceInstance);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004b, code lost:
    
        ((com.netcetera.threeds.sdk.infrastructure.cn.ThreeDS2ServiceInstance) ThreeDS2ServiceInstance(new java.lang.Object[]{r3}, -29065550, 29065552, java.lang.System.identityHashCode(r3))).getWarnings(r3.ThreeDS2ServiceInstance);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r0 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r4 = r4 + 105;
        com.netcetera.threeds.sdk.infrastructure.ax.get = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if ((r4 % 2) != 0) goto L11;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.elements
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getWarnings(keys keysVar) {
        int i = get;
        int i2 = (i & (-28)) | ((~i) & 27);
        int i3 = -(-((i & 27) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        int i5 = i4 % 128;
        ThreeDS2ServiceInitializationCallback = i5;
        int i6 = i4 % 2;
        boolean z = this.ThreeDS2Service;
        if (i6 == 0) {
            int i7 = 43 / 0;
        }
        int i8 = get;
        ThreeDS2ServiceInitializationCallback = (((i8 | 1) << 1) - (i8 ^ 1)) % 128;
    }

    public static ax get(Context context, setShadowLayer setshadowlayer) {
        return (ax) ThreeDS2ServiceInstance(new Object[]{context, setshadowlayer}, 290066761, -290066760, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-929)) + (i * (-464));
        int i5 = ~i;
        int i6 = i2 | i3;
        int i7 = ((i5 | i6) * 465) + ((i2 | (~(i3 | i5))) * 930) + (((~i6) | i5) * (-465)) + i4;
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? get(objArr) : ThreeDS2ServiceInstance(objArr) : ThreeDS2Service(objArr) : getWarnings(objArr);
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.elements
    public void getWarnings() {
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i ^ 33;
        int i3 = ((i & 33) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
        get = i5;
        this.ThreeDS2Service = true;
        int i6 = i5 | 27;
        int i7 = i6 << 1;
        int i8 = -(i6 & (~(i5 & 27)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        ThreeDS2ServiceInitializationCallback = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 27 / 0;
        }
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        ax axVar = new ax((Context) objArr[0], new au(), (setShadowLayer) objArr[1]);
        int i = ThreeDS2ServiceInitializationCallback + 69;
        get = i % 128;
        if (i % 2 == 0) {
            return axVar;
        }
        throw null;
    }
}
