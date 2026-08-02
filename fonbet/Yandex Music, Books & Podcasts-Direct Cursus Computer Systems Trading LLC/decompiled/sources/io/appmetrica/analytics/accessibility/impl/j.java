package io.appmetrica.analytics.accessibility.impl;

import defpackage.c5b;
import io.appmetrica.analytics.accessibilitysystemwrapper.internal.AccessibilityProperties;
import io.appmetrica.analytics.accessibilitysystemwrapper.internal.AccessibilityServices;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class j {
    public static void a(JSONObject jSONObject, AccessibilityProperties accessibilityProperties, AccessibilityProperties accessibilityProperties2) {
        a(jSONObject, "font_scale", accessibilityProperties.getFontScale(), accessibilityProperties2 != null ? accessibilityProperties2.getFontScale() : null);
        a(jSONObject, "dark_mode_enabled", accessibilityProperties.getDarkMode(), accessibilityProperties2 != null ? accessibilityProperties2.getDarkMode() : null);
        a(jSONObject, "display_inversion_enabled", accessibilityProperties.getDisplayInversion(), accessibilityProperties2 != null ? accessibilityProperties2.getDisplayInversion() : null);
        a(jSONObject, "display_magnification_enabled", accessibilityProperties.getDisplayMagnification(), accessibilityProperties2 != null ? accessibilityProperties2.getDisplayMagnification() : null);
        a(jSONObject, "display_magnification_scale", accessibilityProperties.getDisplayMagnificationScale(), accessibilityProperties2 != null ? accessibilityProperties2.getDisplayMagnificationScale() : null);
        a(jSONObject, "display_daltonizer_enabled", accessibilityProperties.getDisplayDaltonizer(), accessibilityProperties2 != null ? accessibilityProperties2.getDisplayDaltonizer() : null);
        a(jSONObject, "display_daltonizer_enabled_mode", accessibilityProperties.getDisplayDaltonizerMode(), accessibilityProperties2 != null ? accessibilityProperties2.getDisplayDaltonizerMode() : null);
        a(jSONObject, "high_text_contrast_enabled", accessibilityProperties.getHighTextContrast(), accessibilityProperties2 != null ? accessibilityProperties2.getHighTextContrast() : null);
        a(jSONObject, "subtitles_enabled", accessibilityProperties.getCaptioning(), accessibilityProperties2 != null ? accessibilityProperties2.getCaptioning() : null);
        a(jSONObject, "autoclick_enabled", accessibilityProperties.getAutoClick(), accessibilityProperties2 != null ? accessibilityProperties2.getAutoClick() : null);
        a(jSONObject, "autoclick_delay", accessibilityProperties.getAutoClickDelay(), accessibilityProperties2 != null ? accessibilityProperties2.getAutoClickDelay() : null);
        a(jSONObject, "animation_scale", accessibilityProperties.getAnimationDuration(), accessibilityProperties2 != null ? accessibilityProperties2.getAnimationDuration() : null);
        a(jSONObject, "mono_sound_enabled", accessibilityProperties.getMonoSound(), accessibilityProperties2 != null ? accessibilityProperties2.getMonoSound() : null);
        a(jSONObject, "hearing_aid_enabled", accessibilityProperties.getHearingAid(), accessibilityProperties2 != null ? accessibilityProperties2.getHearingAid() : null);
    }

    public static void a(JSONObject jSONObject, String str, List list, List list2) {
        if (!CollectionUtils.areCollectionsEqual(list, list2)) {
            jSONObject.getJSONArray("params_changed_list").put(str);
        }
        jSONObject.put(str, new JSONArray((Collection) list));
    }

    public static void a(JSONObject jSONObject, AccessibilityServices accessibilityServices, AccessibilityServices accessibilityServices2) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        List<String> list4;
        List<String> list5;
        List<String> list6;
        List<String> spoken = accessibilityServices.getSpoken();
        if (accessibilityServices2 == null || (list = accessibilityServices2.getSpoken()) == null) {
            list = c5b.a;
        }
        a(jSONObject, "service_spoken_list", (List) spoken, (List) list);
        List<String> haptic = accessibilityServices.getHaptic();
        if (accessibilityServices2 == null || (list2 = accessibilityServices2.getHaptic()) == null) {
            list2 = c5b.a;
        }
        a(jSONObject, "service_haptic_list", (List) haptic, (List) list2);
        List<String> audible = accessibilityServices.getAudible();
        if (accessibilityServices2 == null || (list3 = accessibilityServices2.getAudible()) == null) {
            list3 = c5b.a;
        }
        a(jSONObject, "service_audible_list", (List) audible, (List) list3);
        List<String> visual = accessibilityServices.getVisual();
        if (accessibilityServices2 == null || (list4 = accessibilityServices2.getVisual()) == null) {
            list4 = c5b.a;
        }
        a(jSONObject, "service_visual_list", (List) visual, (List) list4);
        List<String> generic = accessibilityServices.getGeneric();
        if (accessibilityServices2 == null || (list5 = accessibilityServices2.getGeneric()) == null) {
            list5 = c5b.a;
        }
        a(jSONObject, "service_generic_list", (List) generic, (List) list5);
        List<String> braille = accessibilityServices.getBraille();
        if (accessibilityServices2 == null || (list6 = accessibilityServices2.getBraille()) == null) {
            list6 = c5b.a;
        }
        a(jSONObject, "service_braille_list", (List) braille, (List) list6);
    }

    public static void a(JSONObject jSONObject, String str, Object obj, Object obj2) {
        if (!Intrinsics.d(obj, obj2)) {
            jSONObject.getJSONArray("params_changed_list").put(str);
        }
        jSONObject.put(str, obj);
    }
}
