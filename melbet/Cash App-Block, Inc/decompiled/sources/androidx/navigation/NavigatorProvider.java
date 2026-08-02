package androidx.navigation;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.ui.CashInsets;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class NavigatorProvider {
    public static final LinkedHashMap annotationNames = new LinkedHashMap();
    public final LinkedHashMap _navigators = new LinkedHashMap();

    public final void addNavigator(Navigator navigator) {
        navigator.getClass();
        String nameForNavigator$navigation_common_release = CashInsets.Companion.getNameForNavigator$navigation_common_release(navigator.getClass());
        if (nameForNavigator$navigation_common_release.length() <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this._navigators;
        Navigator navigator2 = (Navigator) linkedHashMap.get(nameForNavigator$navigation_common_release);
        if (Intrinsics.areEqual(navigator2, navigator)) {
            return;
        }
        if (navigator2 != null && navigator2.isAttached) {
            Handlers$$ExternalSyntheticBUOutline0.m("Navigator ", navigator, " is replacing an already attached ", navigator2);
        } else if (navigator.isAttached) {
            Handlers$$ExternalSyntheticBUOutline0.m("Navigator ", navigator, " is already attached to another NavController");
        }
    }

    public final Navigator getNavigator(String str) {
        str.getClass();
        if (str.length() <= 0) {
            a$$ExternalSyntheticBUOutline0.m$3("navigator name cannot be an empty string");
            return null;
        }
        Navigator navigator = (Navigator) this._navigators.get(str);
        if (navigator != null) {
            return navigator;
        }
        a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
