package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setInputType {
    private static int ThreeDS2ServiceInstance = 0;
    private static int initialize = 1;
    private final setSearchResultHighlightColor get;
    private final setFocusedSearchResultIndex getWarnings;

    public setInputType(setFocusedSearchResultIndex setfocusedsearchresultindex, setSearchResultHighlightColor setsearchresulthighlightcolor) {
        this.getWarnings = setfocusedsearchresultindex;
        this.get = setsearchresulthighlightcolor;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        fx fxVar = (fx) objArr[0];
        me meVar = (me) setThreeDSRequestorAppURL.initialize(me.class);
        setHint sethint = (setHint) setHint.ThreeDS2Service(new Object[]{fxVar.ThreeDS2Service(), fxVar.get(meVar), fxVar.get(meVar)}, 745856592, -745856591, (int) System.currentTimeMillis());
        setInputType setinputtype = new setInputType(sethint, sethint);
        int i4 = ThreeDS2ServiceInstance;
        initialize = ((i4 ^ 63) + ((i4 & 63) << 1)) % 128;
        return setinputtype;
    }

    public static setInputType ThreeDS2ServiceInstance(fx fxVar) {
        return (setInputType) ThreeDS2Service(new Object[]{fxVar}, 1106948059, -1106948059, (int) System.currentTimeMillis());
    }

    public setScroller initialize(setSingleLine setsingleline) {
        this.getWarnings.get(setsingleline);
        setTitleMarginBottom settitlemarginbottom = new setTitleMarginBottom(setsingleline.ThreeDS2ServiceInstance(), setsingleline.get(), setsingleline.ThreeDS2Service(), setsingleline.initialize(), setsingleline.getWarnings(), setsingleline.getSDKInfo(), setsingleline.getSDKVersion(), setsingleline.cleanup(), setsingleline.addParam(), setsingleline.onError(), setsingleline.ConfigParameters(), setsingleline.onCompleted(), setsingleline.apiKey(), setsingleline.restrictedParameters(), setsingleline.removeParam(), setsingleline.ConfigurationBuilder(), setsingleline.configureScheme(), setsingleline.visaSchemeConfiguration(), setsingleline.amexConfiguration(), setsingleline.build(), setsingleline.SchemeConfiguration(), this.get.get(), setsingleline.mastercardSchemeConfiguration(), setsingleline.cbConfiguration(), setsingleline.unionSchemeConfiguration(), this.get.getWarnings(), setsingleline.eftposConfiguration(), setsingleline.getSchemeLogo(), setsingleline.dinersSchemeConfiguration(), setsingleline.getSchemeLogoDark(), setsingleline.newSchemeConfiguration(), setsingleline.jcbConfiguration(), setsingleline.getParamValue(), setsingleline.getSchemeName(), setsingleline.getSchemeId(), setsingleline.getSchemeEncryptionPublicKey(), setsingleline.SchemeConfigurationBuilder());
        int i = initialize;
        int i2 = ((i ^ 116) + ((i & 116) << 1)) - 1;
        ThreeDS2ServiceInstance = i2 % 128;
        if (i2 % 2 == 0) {
            return settitlemarginbottom;
        }
        throw null;
    }
}
