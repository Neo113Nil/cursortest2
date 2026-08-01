package com.google.android.datatransport;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowCacheManagerUtility {
    public int WinterFlowCacheManagerAgent;
    public final WinterFlowCacheModule WinterFlowHookDataSource;
    public final List WinterFlowRouterStructure;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        r2 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        if (r11 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WinterFlowCacheManagerUtility(List list, WinterFlowCacheModule winterFlowCacheModule) {
        boolean z;
        boolean z2;
        int actionMasked;
        int classification;
        int classification2;
        MotionEvent WinterFlowRouterStructure;
        this.WinterFlowRouterStructure = list;
        this.WinterFlowHookDataSource = winterFlowCacheModule;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && (WinterFlowRouterStructure = WinterFlowRouterStructure()) != null) {
            WinterFlowRouterStructure.getClassification();
        }
        MotionEvent WinterFlowRouterStructure2 = WinterFlowRouterStructure();
        if (WinterFlowRouterStructure2 != null) {
            WinterFlowRouterStructure2.getButtonState();
        }
        MotionEvent WinterFlowRouterStructure3 = WinterFlowRouterStructure();
        if (WinterFlowRouterStructure3 != null) {
            WinterFlowRouterStructure3.getMetaState();
        }
        MotionEvent WinterFlowRouterStructure4 = WinterFlowRouterStructure();
        int i2 = 0;
        if (WinterFlowRouterStructure4 != null) {
            if (i >= 29) {
                classification2 = WinterFlowRouterStructure4.getClassification();
                if (classification2 == 3) {
                    z = true;
                    if (i >= 29) {
                        classification = WinterFlowRouterStructure4.getClassification();
                        if (classification == 5) {
                            z2 = true;
                            actionMasked = WinterFlowRouterStructure4.getActionMasked();
                            if (actionMasked == 0) {
                                if (!z) {
                                    if (z2) {
                                        i2 = 7;
                                    }
                                    i2 = 1;
                                }
                                i2 = 10;
                            } else if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    switch (actionMasked) {
                                        case WinterFlowJSONLibrary.STRING_FIELD_NUMBER /* 5 */:
                                            if (!z) {
                                            }
                                            i2 = 10;
                                            break;
                                        case WinterFlowJSONLibrary.STRING_SET_FIELD_NUMBER /* 6 */:
                                            if (!z) {
                                            }
                                            i2 = 12;
                                            break;
                                        case WinterFlowJSONLibrary.BYTES_FIELD_NUMBER /* 8 */:
                                            i2 = 6;
                                            break;
                                        case 9:
                                            i2 = 4;
                                            break;
                                        case 10:
                                            i2 = 5;
                                            break;
                                    }
                                }
                                if (z) {
                                    i2 = 11;
                                }
                            } else {
                                if (!z) {
                                    if (z2) {
                                        i2 = 9;
                                    }
                                    i2 = 2;
                                }
                                i2 = 12;
                            }
                        }
                    }
                    z2 = false;
                    actionMasked = WinterFlowRouterStructure4.getActionMasked();
                    if (actionMasked == 0) {
                    }
                }
            }
            z = false;
            if (i >= 29) {
            }
            z2 = false;
            actionMasked = WinterFlowRouterStructure4.getActionMasked();
            if (actionMasked == 0) {
            }
        } else {
            int size = list.size();
            while (i2 < size) {
                WinterFlowObjectSystem winterFlowObjectSystem = (WinterFlowObjectSystem) list.get(i2);
                if (WinterFlowCacheRuntime.WinterFlowResponseEngine(winterFlowObjectSystem)) {
                    i2 = 2;
                } else if (WinterFlowCacheRuntime.WinterFlowRouterRouter(winterFlowObjectSystem)) {
                    i2 = 1;
                } else {
                    i2++;
                }
            }
            i2 = 3;
        }
        this.WinterFlowCacheManagerAgent = i2;
    }

    public final MotionEvent WinterFlowRouterStructure() {
        WinterFlowCacheModule winterFlowCacheModule = this.WinterFlowHookDataSource;
        if (winterFlowCacheModule != null) {
            return (MotionEvent) ((WinterFlowAlgorithmArray) winterFlowCacheModule.WinterFlowCacheManagerAgent).WinterFlowUnitTestResponse;
        }
        return null;
    }
}
