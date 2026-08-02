package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.plaid.internal.EnumC0170g;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes5.dex */
abstract class gd implements fx {
    private static int removeParam = 0;
    private static int restrictedParameters = 1;
    private final fw ConfigParameters;
    private final fu ThreeDS2Service;
    private final fz ThreeDS2ServiceInitializationCallback;
    private final fs ThreeDS2ServiceInstance;
    private final fj addParam;
    private final fn apiKey;
    private final fq cleanup;
    private final ga configureScheme;
    private final fy createTransaction;
    private final fo get;
    private final fm getParamValue;
    private final fl getSDKInfo;
    private final ft getSDKVersion;
    private final fh getWarnings;
    private final fr initialize;
    private final fp onCompleted;
    private final fv onError;

    public gd(fu fuVar, fs fsVar, fr frVar, fo foVar, fh fhVar, fq fqVar, fl flVar, ft ftVar, fy fyVar, fz fzVar, fw fwVar, fp fpVar, fm fmVar, fv fvVar, fj fjVar, ga gaVar, fn fnVar) {
        this.ThreeDS2Service = fuVar;
        this.ThreeDS2ServiceInstance = fsVar;
        this.initialize = frVar;
        this.get = foVar;
        this.getWarnings = fhVar;
        this.cleanup = fqVar;
        this.getSDKInfo = flVar;
        this.getSDKVersion = ftVar;
        this.createTransaction = fyVar;
        this.ThreeDS2ServiceInitializationCallback = fzVar;
        this.ConfigParameters = fwVar;
        this.onCompleted = fpVar;
        this.getParamValue = fmVar;
        this.onError = fvVar;
        this.addParam = fjVar;
        this.configureScheme = gaVar;
        this.apiKey = fnVar;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        gd gdVar = (gd) objArr[0];
        Context context = (Context) objArr[1];
        ju juVar = (ju) objArr[2];
        fs fsVar = (fs) objArr[3];
        fq fqVar = (fq) objArr[4];
        fw fwVar = (fw) objArr[5];
        fv fvVar = (fv) objArr[6];
        int i = (-2) - ((removeParam + 46) ^ (-1));
        restrictedParameters = i % 128;
        int i2 = i % 2;
        fy fyVar = gdVar.createTransaction;
        if (i2 == 0) {
            fyVar.get(context, juVar, fsVar, fqVar, fwVar, fvVar);
            throw null;
        }
        remove removeVar = fyVar.get(context, juVar, fsVar, fqVar, fwVar, fvVar);
        int i3 = restrictedParameters;
        int i4 = i3 & 79;
        int i5 = -(-((i3 ^ 79) | i4));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        removeParam = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 47 / 0;
        }
        return removeVar;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        int i4 = (i2 * (-500)) + (i * (-500));
        int i5 = ~i2;
        int i6 = ~(i5 | i);
        int i7 = ~i;
        switch (((~(i7 | (~i3) | i2)) * 501) + ((~(i5 | i7)) * IptcConstants.IMAGE_RESOURCE_BLOCK_XML_DATA) + ((i6 | (~(i7 | i2 | i3))) * 501) + i4) {
            case 1:
                return ThreeDS2Service(objArr);
            case 2:
                return ThreeDS2ServiceInstance(objArr);
            case 3:
                return initialize(objArr);
            case 4:
                gd gdVar = (gd) objArr[0];
                jh jhVar = (jh) objArr[1];
                int i8 = removeParam;
                int i9 = i8 & 101;
                int i10 = (i8 ^ 101) | i9;
                restrictedParameters = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
                setSubtitleTextColor warnings = gdVar.getWarnings.getWarnings(jhVar);
                int i11 = removeParam;
                restrictedParameters = ((i11 ^ 29) + ((i11 & 29) << 1)) % 128;
                return warnings;
            case 5:
                gd gdVar2 = (gd) objArr[0];
                Context context = (Context) objArr[1];
                ju juVar = (ju) objArr[2];
                fs fsVar = (fs) objArr[3];
                fq fqVar = (fq) objArr[4];
                fw fwVar = (fw) objArr[5];
                fv fvVar = (fv) objArr[6];
                int i12 = restrictedParameters;
                removeParam = ((i12 & 63) + (i12 | 63)) % 128;
                remove ThreeDS2ServiceInstance = gdVar2.ThreeDS2ServiceInitializationCallback.ThreeDS2ServiceInstance(context, juVar, fsVar, fqVar, fwVar, fvVar);
                int i13 = restrictedParameters;
                int i14 = (i13 & (-108)) | ((~i13) & 107);
                int i15 = (i13 & 107) << 1;
                removeParam = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
                return ThreeDS2ServiceInstance;
            case 6:
                return get(objArr);
            case 7:
                return getSDKInfo(objArr);
            default:
                return getWarnings(objArr);
        }
    }

    private static /* synthetic */ Object getSDKInfo(Object[] objArr) {
        gd gdVar = (gd) objArr[0];
        size sizeVar = (size) objArr[1];
        int i = removeParam;
        int i2 = (i & (-52)) | ((~i) & 51);
        int i3 = -(-((i & 51) << 1));
        int i4 = (i2 & i3) + (i3 | i2);
        restrictedParameters = i4 % 128;
        int i5 = i4 % 2;
        fs fsVar = gdVar.ThreeDS2ServiceInstance;
        if (i5 != 0) {
            return fsVar.get(sizeVar);
        }
        fsVar.get(sizeVar);
        throw null;
    }

    private static /* synthetic */ Object getWarnings(Object[] objArr) {
        gd gdVar = (gd) objArr[0];
        Context context = (Context) objArr[1];
        ju juVar = (ju) objArr[2];
        fs fsVar = (fs) objArr[3];
        fq fqVar = (fq) objArr[4];
        fw fwVar = (fw) objArr[5];
        fv fvVar = (fv) objArr[6];
        int i = restrictedParameters;
        int i2 = i & 5;
        removeParam = (i2 + ((i ^ 5) | i2)) % 128;
        remove initialize = gdVar.getSDKVersion.initialize(context, juVar, fsVar, fqVar, fwVar, fvVar);
        int i3 = restrictedParameters + 3;
        removeParam = i3 % 128;
        if (i3 % 2 == 0) {
            return initialize;
        }
        throw null;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        gd gdVar = (gd) objArr[0];
        Context context = (Context) objArr[1];
        jr jrVar = (jr) objArr[2];
        isEmpty isempty = (isEmpty) objArr[3];
        int i = restrictedParameters;
        int i2 = i ^ 25;
        int i3 = ((i & 25) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        removeParam = i5 % 128;
        int i6 = i5 % 2;
        fq fqVar = gdVar.cleanup;
        if (i6 == 0) {
            return fqVar.getWarnings(context, jrVar, isempty);
        }
        fqVar.getWarnings(context, jrVar, isempty);
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fw
    public isEmpty get() {
        int i = restrictedParameters;
        int i2 = i & 105;
        int i3 = -(-(i | 105));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        removeParam = i4 % 128;
        int i5 = i4 % 2;
        fw fwVar = this.ConfigParameters;
        if (i5 != 0) {
            fwVar.get();
            throw null;
        }
        isEmpty isempty = fwVar.get();
        int i6 = removeParam;
        int i7 = (i6 & 93) + (i6 | 93);
        restrictedParameters = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 10 / 0;
        }
        return isempty;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        gd gdVar = (gd) objArr[0];
        int i = removeParam;
        int i2 = (((i | 114) << 1) - (i ^ 114)) - 1;
        restrictedParameters = i2 % 128;
        int i3 = i2 % 2;
        setCacheColorHint.getWarnings initialize = gdVar.ThreeDS2Service.initialize();
        if (i3 == 0) {
            int i4 = 68 / 0;
        }
        int i5 = removeParam;
        int i6 = i5 & 117;
        restrictedParameters = (((i5 | 117) & (~i6)) + (i6 << 1)) % 128;
        return initialize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fn
    public setIncludeFontPadding get(me meVar) {
        int i = restrictedParameters;
        removeParam = ((((i | 78) << 1) - (i ^ 78)) - 1) % 128;
        setIncludeFontPadding setincludefontpadding = this.apiKey.get(meVar);
        int i2 = restrictedParameters;
        int i3 = (i2 & 83) + (i2 | 83);
        removeParam = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 45 / 0;
        }
        return setincludefontpadding;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fp
    public ax initialize(Context context, setShadowLayer setshadowlayer) {
        int i = restrictedParameters;
        int i2 = i & 15;
        int i3 = (i ^ 15) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        removeParam = i4 % 128;
        int i5 = i4 % 2;
        ax initialize = this.onCompleted.initialize(context, setshadowlayer);
        if (i5 != 0) {
            int i6 = 63 / 0;
        }
        return initialize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fy
    public final remove get(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        return (remove) ThreeDS2ServiceInstance(new Object[]{this, context, juVar, fsVar, fqVar, fwVar, fvVar}, -2106653312, 2106653313, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fv
    public ac initialize(Context context) {
        int i = removeParam;
        int i2 = i & 83;
        int i3 = (i ^ 83) | i2;
        restrictedParameters = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        ac initialize = this.onError.initialize(context);
        int i4 = removeParam;
        int i5 = (i4 ^ 69) + ((i4 & 69) << 1);
        restrictedParameters = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 55 / 0;
        }
        return initialize;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fs
    public final replace get(size sizeVar) {
        return (replace) ThreeDS2ServiceInstance(new Object[]{this, sizeVar}, -1658147364, 1658147371, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ft
    public final remove initialize(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        return (remove) ThreeDS2ServiceInstance(new Object[]{this, context, juVar, fsVar, fqVar, fwVar, fvVar}, 850673011, -850673011, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fr
    public final remove initialize(Context context, ju juVar, setMaxLines setmaxlines, fq fqVar, fw fwVar, setShadowLayer setshadowlayer, fv fvVar) {
        return (remove) ThreeDS2ServiceInstance(new Object[]{this, context, juVar, setmaxlines, fqVar, fwVar, setshadowlayer, fvVar}, 539358400, -539358398, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fu
    public final setCacheColorHint.getWarnings initialize() {
        return (setCacheColorHint.getWarnings) ThreeDS2ServiceInstance(new Object[]{this}, -2046625536, 2046625542, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fj
    public replace getWarnings(getCause getcause) {
        int i = restrictedParameters;
        int i2 = i & 79;
        int i3 = -(-((i ^ 79) | i2));
        removeParam = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        replace warnings = this.addParam.getWarnings(getcause);
        restrictedParameters = ((-2) - ((removeParam + 24) ^ (-1))) % 128;
        return warnings;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fq
    public final ae getWarnings(Context context, jr jrVar, isEmpty isempty) {
        return (ae) ThreeDS2ServiceInstance(new Object[]{this, context, jrVar, isempty}, -2120439714, 2120439717, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fh
    public final setSubtitleTextColor getWarnings(jh jhVar) {
        return (setSubtitleTextColor) ThreeDS2ServiceInstance(new Object[]{this, jhVar}, 27230994, -27230990, System.identityHashCode(this));
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fo
    public aw ThreeDS2Service(Context context) {
        int i = restrictedParameters;
        int i2 = ((i ^ 115) | (i & 115)) << 1;
        int i3 = -(((~i) & 115) | (i & (-116)));
        removeParam = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
        aw ThreeDS2Service = this.get.ThreeDS2Service(context);
        int i4 = removeParam;
        int i5 = (i4 ^ 43) + ((i4 & 43) << 1);
        restrictedParameters = i5 % 128;
        if (i5 % 2 != 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fm
    public setSearchResultHighlights ThreeDS2Service() {
        int i = restrictedParameters;
        int i2 = i & 51;
        int i3 = ((i | 51) & (~i2)) + (i2 << 1);
        removeParam = i3 % 128;
        int i4 = i3 % 2;
        setSearchResultHighlights ThreeDS2Service = this.getParamValue.ThreeDS2Service();
        if (i4 != 0) {
            int i5 = 79 / 0;
        }
        int i6 = restrictedParameters;
        int i7 = i6 ^ EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i8 = i6 & EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        int i9 = (i7 | i8) << 1;
        int i10 = -((i6 | EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) & (~i8));
        int i11 = (i9 & i10) + (i10 | i9);
        removeParam = i11 % 128;
        if (i11 % 2 == 0) {
            return ThreeDS2Service;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.ga
    public getView ThreeDS2Service(nh nhVar, setFontFeatureSettings setfontfeaturesettings) {
        int i = restrictedParameters + 73;
        removeParam = i % 128;
        int i2 = i % 2;
        ga gaVar = this.configureScheme;
        if (i2 != 0) {
            gaVar.ThreeDS2Service(nhVar, setfontfeaturesettings);
            throw null;
        }
        getView ThreeDS2Service = gaVar.ThreeDS2Service(nhVar, setfontfeaturesettings);
        int i3 = restrictedParameters;
        removeParam = ((i3 & 77) + (i3 | 77)) % 128;
        return ThreeDS2Service;
    }

    private static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr) {
        gd gdVar = (gd) objArr[0];
        Context context = (Context) objArr[1];
        ju juVar = (ju) objArr[2];
        setMaxLines setmaxlines = (setMaxLines) objArr[3];
        fq fqVar = (fq) objArr[4];
        fw fwVar = (fw) objArr[5];
        setShadowLayer setshadowlayer = (setShadowLayer) objArr[6];
        fv fvVar = (fv) objArr[7];
        removeParam = (restrictedParameters + 55) % 128;
        remove initialize = gdVar.initialize.initialize(context, juVar, setmaxlines, fqVar, fwVar, setshadowlayer, fvVar);
        int i = restrictedParameters;
        int i2 = (i & 78) + (i | 78);
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        removeParam = i3 % 128;
        if (i3 % 2 == 0) {
            return initialize;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fl
    public setMaxEms ThreeDS2ServiceInstance() {
        int i = removeParam;
        int i2 = (i | 117) << 1;
        int i3 = -(((~i) & 117) | (i & (-118)));
        restrictedParameters = ((i2 & i3) + (i3 | i2)) % 128;
        setMaxEms ThreeDS2ServiceInstance = this.getSDKInfo.ThreeDS2ServiceInstance();
        int i4 = restrictedParameters + 113;
        removeParam = i4 % 128;
        if (i4 % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.fz
    public final remove ThreeDS2ServiceInstance(Context context, ju juVar, fs fsVar, fq fqVar, fw fwVar, fv fvVar) {
        return (remove) ThreeDS2ServiceInstance(new Object[]{this, context, juVar, fsVar, fqVar, fwVar, fvVar}, 961586095, -961586090, System.identityHashCode(this));
    }
}
