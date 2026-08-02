package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$KeystoreBlockedDevices extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$KeystoreBlockedDevices INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("Lenovo TB125FU,Lenovo TB-J616F,Power Armor14 Pro,AGM_H5,TB132FU,Armor X6 Pro,Lenovo YT-J706F,Power Armor X11 Pro,P20S_ROW,Z5158,M40 Plus_EEA,Z6252CA,RT2,TECNO CG6j,S98,S91 Pro,TECNO CG6,S41,Armor 15,Lenovo TB-J616X,Note 6T,S41Pro,U318AA,Z6251,CONQUEST-F2,Note 14,SM-A102U,21061119DG,5087Z,Air1 Pro,B131DL,GT-N8000,Infinix X6511G,LM-Q730,LM-X410(FG),MRD-LX1F,Mi A2 Lite,Nokia 3.1,P30S_ROW,Power Armor 16 Pro,RC608L,3-SH,SM-A125U,SM-A205U,T10,TECNO KG5j,WP18 Pro,Wiko U614AS,XQ-BE72,moto g pure,moto g(6),moto g(7) optimo (XT1952DL)", "Lenovo TB125FU,Lenovo TB-J616F,Power Armor14 Pro,AGM_H5,TB132FU,Armor X6 Pro,Lenovo YT-J706F,Power Armor X11 Pro,P20S_ROW,Z5158,M40 Plus_EEA,Z6252CA,RT2,TECNO CG6j,S98,S91 Pro,TECNO CG6,S41,Armor 15,Lenovo TB-J616X,Note 6T,S41Pro,U318AA,Z6251,CONQUEST-F2,Note 14,SM-A102U,21061119DG,5087Z,Air1 Pro,B131DL,GT-N8000,Infinix X6511G,LM-Q730,LM-X410(FG),MRD-LX1F,Mi A2 Lite,Nokia 3.1,P30S_ROW,Power Armor 16 Pro,RC608L,3-SH,SM-A125U,SM-A205U,T10,TECNO KG5j,WP18 Pro,Wiko U614AS,XQ-BE72,moto g pure,moto g(6),moto g(7) optimo (XT1952DL)");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("Lenovo TB125FU,Lenovo TB-J616F,Power Armor14 Pro,AGM_H5,TB132FU,Armor X6 Pro,Lenovo YT-J706F,Power Armor X11 Pro,P20S_ROW,Z5158,M40 Plus_EEA,Z6252CA,RT2,TECNO CG6j,S98,S91 Pro,TECNO CG6,S41,Armor 15,Lenovo TB-J616X,Note 6T,S41Pro,U318AA,Z6251,CONQUEST-F2,Note 14,SM-A102U,21061119DG,5087Z,Air1 Pro,B131DL,GT-N8000,Infinix X6511G,LM-Q730,LM-X410(FG),MRD-LX1F,Mi A2 Lite,Nokia 3.1,P30S_ROW,Power Armor 16 Pro,RC608L,3-SH,SM-A125U,SM-A205U,T10,TECNO KG5j,WP18 Pro,Wiko U614AS,XQ-BE72,moto g pure,moto g(6),moto g(7) optimo (XT1952DL)", "Lenovo TB125FU,Lenovo TB-J616F,Power Armor14 Pro,AGM_H5,TB132FU,Armor X6 Pro,Lenovo YT-J706F,Power Armor X11 Pro,P20S_ROW,Z5158,M40 Plus_EEA,Z6252CA,RT2,TECNO CG6j,S98,S91 Pro,TECNO CG6,S41,Armor 15,Lenovo TB-J616X,Note 6T,S41Pro,U318AA,Z6251,CONQUEST-F2,Note 14,SM-A102U,21061119DG,5087Z,Air1 Pro,B131DL,GT-N8000,Infinix X6511G,LM-Q730,LM-X410(FG),MRD-LX1F,Mi A2 Lite,Nokia 3.1,P30S_ROW,Power Armor 16 Pro,RC608L,3-SH,SM-A125U,SM-A205U,T10,TECNO KG5j,WP18 Pro,Wiko U614AS,XQ-BE72,moto g pure,moto g(6),moto g(7) optimo (XT1952DL)"), new FeatureFlag$StringFeatureFlag$Value("", "")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$KeystoreBlockedDevices("cashclient/keystore_blocked_devices", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
