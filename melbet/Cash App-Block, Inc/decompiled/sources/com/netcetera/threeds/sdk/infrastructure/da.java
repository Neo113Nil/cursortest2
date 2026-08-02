package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes5.dex */
public abstract class da extends bv {
    private static int ThreeDS2ServiceInitializationCallback = 1;
    private static int getSDKVersion;
    protected final ju ThreeDS2ServiceInstance;
    private final fq get;
    private final fv getSDKInfo;
    protected final isEmpty getWarnings;
    private final int initialize;

    public da(Context context, ju juVar, fq fqVar, fw fwVar, fv fvVar) {
        super(context);
        this.initialize = ((Integer) nj.ThreeDS2Service(new Object[]{900}, 256526108, -256526107, 900)).intValue();
        this.ThreeDS2ServiceInstance = juVar;
        this.get = fqVar;
        this.getWarnings = fwVar.get();
        this.getSDKInfo = fvVar;
    }

    private static /* synthetic */ Object ThreeDS2Service(Object[] objArr) {
        da daVar = (da) objArr[0];
        Context context = (Context) objArr[1];
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i ^ 109;
        int i3 = -(-((i & 109) << 1));
        getSDKVersion = ((i2 & i3) + (i3 | i2)) % 128;
        daVar.getWarnings(daVar.getSDKInfo.initialize(context));
        int i4 = ThreeDS2ServiceInitializationCallback + 95;
        getSDKVersion = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object get(Object[] objArr) {
        mb mbVar = new mb((Context) objArr[1], ((da) objArr[0]).initialize);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        mbVar.setLayoutParams(layoutParams);
        mbVar.setOrientation(1);
        int i = ThreeDS2ServiceInitializationCallback;
        int i2 = i & 17;
        int i3 = i2 + ((i ^ 17) | i2);
        getSDKVersion = i3 % 128;
        if (i3 % 2 == 0) {
            return mbVar;
        }
        throw null;
    }

    public abstract void ThreeDS2Service(Context context);

    @Override // com.netcetera.threeds.sdk.infrastructure.bv
    public final ViewGroup bl_(Context context) {
        return (ViewGroup) initialize(new Object[]{this, context}, 1010824111, -1010824111, System.identityHashCode(this));
    }

    public boolean getWarnings() {
        int i = ThreeDS2ServiceInitializationCallback + 46;
        getSDKVersion = ((i ^ (-1)) + (i << 1)) % 128;
        return true;
    }

    public ju initialize() {
        int identityHashCode = System.identityHashCode(this);
        int i = 1901154922 & identityHashCode;
        int i2 = -(-(((~(((1901154922 | identityHashCode) & (~i)) | i)) | 1365564809) * (-366)));
        int i3 = 341170572 & i2;
        int i4 = (i2 ^ 341170572) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        int i6 = 1903550443 ^ identityHashCode;
        int i7 = identityHashCode & 1903550443;
        int i8 = ~((i7 & i6) | (i6 ^ i7));
        int i9 = 1363169288 & i8;
        int i10 = (((i8 | 1363169288) & (~i9)) | i9) * 366;
        int i11 = ((i5 | i10) << 1) - (i10 ^ i5);
        int identityHashCode2 = System.identityHashCode(this);
        int i12 = ~identityHashCode2;
        int i13 = ~identityHashCode2;
        int i14 = i13 | identityHashCode2;
        int i15 = i12 & i14;
        int i16 = (i15 & (-1816184153)) | ((~i15) & (-1816184153)) | (1816184152 & i15);
        int i17 = (i16 | (~i16)) & (~i16);
        int i18 = ((-205522001) & i17) | ((~i17) & 205522000);
        int i19 = i17 & 205522000;
        int i20 = (i19 & i18) | (i18 ^ i19);
        int i21 = (i13 & 2086066046) | ((-2086066047) & identityHashCode2);
        int i22 = 2086066046 & identityHashCode2;
        int i23 = ~((i21 & i22) | (i21 ^ i22));
        int i24 = (-1139482009) - (~(-(-(((i20 & i23) | (i20 ^ i23)) * (-713)))));
        int i25 = -(-((~((2086066046 ^ identityHashCode2) | (2086066046 & identityHashCode2))) * 1426));
        int i26 = i24 & i25;
        int i27 = -(-(i25 | i24));
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        int i29 = (~identityHashCode2) & i14;
        int i30 = (~((i29 & 475403894) | (475403894 ^ i29))) * 713;
        int i31 = (((i28 | i30) << 1) - (~(-(i30 ^ i28)))) - 1;
        ju juVar = this.ThreeDS2ServiceInstance;
        if (i11 <= i31) {
            return juVar;
        }
        throw null;
    }

    public final void get(Context context) {
        initialize(new Object[]{this, context}, -2125242329, 2125242331, System.identityHashCode(this));
    }

    public static /* synthetic */ Object initialize(Object[] objArr, int i, int i2, int i3) {
        int i4 = (((~(i | i3)) | (~i2)) * 529) + (((~((~i3) | i)) | (~(i | i2))) * 529) + (i2 * 530) + (i * 530) + IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO;
        if (i4 == 1) {
            return ThreeDS2Service(objArr);
        }
        if (i4 != 2) {
            return get(objArr);
        }
        da daVar = (da) objArr[0];
        Context context = (Context) objArr[1];
        int i5 = ThreeDS2ServiceInitializationCallback;
        getSDKVersion = SVG$Unit$EnumUnboxingLocalUtility.m(i5 & 4, i5 | 4, -1, 128);
        ae warnings = daVar.get.getWarnings(context, daVar.initialize().ThreeDS2Service(), daVar.getWarnings);
        warnings.getWarnings(daVar.getWarnings());
        daVar.getWarnings(warnings);
        int i6 = getSDKVersion;
        ThreeDS2ServiceInitializationCallback = SVG$Unit$EnumUnboxingLocalUtility.m(i6 ^ 68, (i6 & 68) << 1, -1, 128);
        return null;
    }

    public final void initialize(Context context) {
        initialize(new Object[]{this, context}, -1743845395, 1743845396, System.identityHashCode(this));
    }
}
