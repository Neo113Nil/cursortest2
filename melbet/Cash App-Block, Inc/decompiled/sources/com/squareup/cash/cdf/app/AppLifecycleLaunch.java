package com.squareup.cash.cdf.app;

import android.os.Build;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AppLifecycleLaunch implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.AMPLITUDE, EventDestination.SNOWFLAKE});
    public final Boolean accessibility_audible_feedback_enabled;
    public final Boolean accessibility_braille_feedback_enabled;
    public final Boolean accessibility_closed_captioning_enabled;
    public final String accessibility_enabled_services;
    public final Double accessibility_font_scale;
    public final String accessibility_font_size;
    public final Boolean accessibility_generic_feedback_enabled;
    public final Boolean accessibility_haptic_feedback_enabled;
    public final Boolean accessibility_high_contrast_enabled;
    public final Boolean accessibility_invert_colors_enabled;
    public final Boolean accessibility_reduce_motion_enabled;
    public final Boolean accessibility_screen_magnification_enabled;
    public final Boolean accessibility_spoken_feedback_enabled;
    public final Boolean accessibility_visual_feedback_enabled;
    public final Boolean accessibility_voiceover_enabled;
    public final String contact_authorization_status;
    public final LinkedHashMap parameters;
    public final String preferred_locale;
    public final Double screen_density;
    public final Integer screen_height_dp;
    public final Integer screen_width_dp;
    public final Boolean system_camera_preference_enabled;
    public final Boolean system_notification_preference_enabled;
    public final UserInterfaceStyle user_interface_style;
    public final Boolean vpn_enabled;
    public final String vpn_endpoint;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UserInterfaceStyle {
        public static final /* synthetic */ UserInterfaceStyle[] $VALUES;
        public static final UserInterfaceStyle DARK;
        public static final UserInterfaceStyle LIGHT;
        public static final UserInterfaceStyle UNKNOWN;

        static {
            UserInterfaceStyle userInterfaceStyle = new UserInterfaceStyle("LIGHT", 0);
            LIGHT = userInterfaceStyle;
            UserInterfaceStyle userInterfaceStyle2 = new UserInterfaceStyle("DARK", 1);
            DARK = userInterfaceStyle2;
            UserInterfaceStyle userInterfaceStyle3 = new UserInterfaceStyle("UNKNOWN", 2);
            UNKNOWN = userInterfaceStyle3;
            $VALUES = new UserInterfaceStyle[]{userInterfaceStyle, userInterfaceStyle2, userInterfaceStyle3};
        }

        public static UserInterfaceStyle valueOf(String str) {
            return (UserInterfaceStyle) Enum.valueOf(UserInterfaceStyle.class, str);
        }

        public static UserInterfaceStyle[] values() {
            return (UserInterfaceStyle[]) $VALUES.clone();
        }
    }

    public AppLifecycleLaunch(String str, UserInterfaceStyle userInterfaceStyle, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, Double d, String str4, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Boolean bool14, String str5, Integer num, Integer num2, Double d2, Boolean bool15) {
        String str6 = Build.MODEL;
        this.preferred_locale = str;
        this.user_interface_style = userInterfaceStyle;
        this.contact_authorization_status = str2;
        this.accessibility_audible_feedback_enabled = bool;
        this.accessibility_braille_feedback_enabled = bool2;
        this.accessibility_closed_captioning_enabled = bool3;
        this.accessibility_enabled_services = str3;
        this.accessibility_font_scale = d;
        this.accessibility_font_size = str4;
        this.accessibility_generic_feedback_enabled = bool4;
        this.accessibility_haptic_feedback_enabled = bool5;
        this.accessibility_high_contrast_enabled = bool6;
        this.accessibility_invert_colors_enabled = bool7;
        this.accessibility_reduce_motion_enabled = bool8;
        this.accessibility_screen_magnification_enabled = bool9;
        this.accessibility_spoken_feedback_enabled = bool10;
        this.accessibility_visual_feedback_enabled = bool11;
        this.accessibility_voiceover_enabled = bool12;
        this.system_notification_preference_enabled = bool13;
        this.vpn_enabled = bool14;
        this.vpn_endpoint = str5;
        this.screen_width_dp = num;
        this.screen_height_dp = num2;
        this.screen_density = d2;
        this.system_camera_preference_enabled = bool15;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 40, "App", "cdf_action", "Lifecycle");
        Countries.putSafe(m, "preferred_locale", str);
        Countries.putSafe(m, "user_interface_style", userInterfaceStyle);
        Countries.putSafe(m, "contact_authorization_status", str2);
        Countries.putSafe(m, "accessibility_audible_feedback_enabled", bool);
        Countries.putSafe(m, "accessibility_braille_feedback_enabled", bool2);
        Countries.putSafe(m, "accessibility_closed_captioning_enabled", bool3);
        Countries.putSafe(m, "accessibility_enabled_services", str3);
        Countries.putSafe(m, "accessibility_font_scale", d);
        Countries.putSafe(m, "accessibility_font_size", str4);
        Countries.putSafe(m, "accessibility_generic_feedback_enabled", bool4);
        Countries.putSafe(m, "accessibility_haptic_feedback_enabled", bool5);
        Countries.putSafe(m, "accessibility_high_contrast_enabled", bool6);
        Countries.putSafe(m, "accessibility_invert_colors_enabled", bool7);
        Countries.putSafe(m, "accessibility_reduce_motion_enabled", bool8);
        Countries.putSafe(m, "accessibility_screen_magnification_enabled", bool9);
        Countries.putSafe(m, "accessibility_spoken_feedback_enabled", bool10);
        Countries.putSafe(m, "accessibility_visual_feedback_enabled", bool11);
        Countries.putSafe(m, "accessibility_voiceover_enabled", bool12);
        Countries.putSafe(m, "system_notification_preference_enabled", bool13);
        Countries.putSafe(m, "vpn_enabled", bool14);
        Countries.putSafe(m, "vpn_endpoint", str5);
        Countries.putSafe(m, "device_model", str6);
        Countries.putSafe(m, "screen_width_dp", num);
        Countries.putSafe(m, "screen_height_dp", num2);
        Countries.putSafe(m, "screen_density", d2);
        Countries.putSafe(m, "system_camera_preference_enabled", bool15);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppLifecycleLaunch)) {
            return false;
        }
        AppLifecycleLaunch appLifecycleLaunch = (AppLifecycleLaunch) obj;
        if (!Intrinsics.areEqual(this.preferred_locale, appLifecycleLaunch.preferred_locale) || this.user_interface_style != appLifecycleLaunch.user_interface_style || !this.contact_authorization_status.equals(appLifecycleLaunch.contact_authorization_status) || !this.accessibility_audible_feedback_enabled.equals(appLifecycleLaunch.accessibility_audible_feedback_enabled) || !this.accessibility_braille_feedback_enabled.equals(appLifecycleLaunch.accessibility_braille_feedback_enabled) || !this.accessibility_closed_captioning_enabled.equals(appLifecycleLaunch.accessibility_closed_captioning_enabled) || !this.accessibility_enabled_services.equals(appLifecycleLaunch.accessibility_enabled_services) || !Intrinsics.areEqual((Object) this.accessibility_font_scale, (Object) appLifecycleLaunch.accessibility_font_scale) || !this.accessibility_font_size.equals(appLifecycleLaunch.accessibility_font_size) || !this.accessibility_generic_feedback_enabled.equals(appLifecycleLaunch.accessibility_generic_feedback_enabled) || !this.accessibility_haptic_feedback_enabled.equals(appLifecycleLaunch.accessibility_haptic_feedback_enabled) || !Intrinsics.areEqual(this.accessibility_high_contrast_enabled, appLifecycleLaunch.accessibility_high_contrast_enabled) || !Intrinsics.areEqual(this.accessibility_invert_colors_enabled, appLifecycleLaunch.accessibility_invert_colors_enabled) || !Intrinsics.areEqual(this.accessibility_reduce_motion_enabled, appLifecycleLaunch.accessibility_reduce_motion_enabled) || !this.accessibility_screen_magnification_enabled.equals(appLifecycleLaunch.accessibility_screen_magnification_enabled) || !this.accessibility_spoken_feedback_enabled.equals(appLifecycleLaunch.accessibility_spoken_feedback_enabled) || !this.accessibility_visual_feedback_enabled.equals(appLifecycleLaunch.accessibility_visual_feedback_enabled) || !this.accessibility_voiceover_enabled.equals(appLifecycleLaunch.accessibility_voiceover_enabled) || !this.system_notification_preference_enabled.equals(appLifecycleLaunch.system_notification_preference_enabled) || !this.vpn_enabled.equals(appLifecycleLaunch.vpn_enabled) || !Intrinsics.areEqual(this.vpn_endpoint, appLifecycleLaunch.vpn_endpoint)) {
            return false;
        }
        String str = Build.MODEL;
        return Intrinsics.areEqual(str, str) && this.screen_width_dp.equals(appLifecycleLaunch.screen_width_dp) && this.screen_height_dp.equals(appLifecycleLaunch.screen_height_dp) && this.screen_density.equals(appLifecycleLaunch.screen_density) && this.system_camera_preference_enabled.equals(appLifecycleLaunch.system_camera_preference_enabled);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "App Lifecycle Launch";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.preferred_locale;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UserInterfaceStyle userInterfaceStyle = this.user_interface_style;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_closed_captioning_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_braille_feedback_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_audible_feedback_enabled, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (userInterfaceStyle == null ? 0 : userInterfaceStyle.hashCode())) * 31, 961, this.contact_authorization_status), 961), 31), 961), 31, this.accessibility_enabled_services);
        Double d = this.accessibility_font_scale;
        int m2 = ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_haptic_feedback_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_generic_feedback_enabled, JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (d == null ? 0 : d.hashCode())) * 31, 31, this.accessibility_font_size), 29791), 31);
        Boolean bool = this.accessibility_high_contrast_enabled;
        int hashCode2 = (m2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.accessibility_invert_colors_enabled;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 961;
        Boolean bool3 = this.accessibility_reduce_motion_enabled;
        int m3 = ViewEvent$State$EnumUnboxingLocalUtility.m(this.vpn_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.system_notification_preference_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_voiceover_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_visual_feedback_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_spoken_feedback_enabled, ViewEvent$State$EnumUnboxingLocalUtility.m(this.accessibility_screen_magnification_enabled, (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 961, 923521), 961), 31), 31), 31), 31);
        String str2 = this.vpn_endpoint;
        int hashCode4 = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = Build.MODEL;
        return this.system_camera_preference_enabled.hashCode() + ((this.screen_density.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(CameraState$Type$EnumUnboxingLocalUtility.m((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.screen_width_dp), 31, this.screen_height_dp)) * 31);
    }

    public final String toString() {
        String str = Build.MODEL;
        StringBuilder sb = new StringBuilder("AppLifecycleLaunch(background_refresh_status=null, preferred_locale=");
        sb.append(this.preferred_locale);
        sb.append(", user_interface_style=");
        sb.append(this.user_interface_style);
        sb.append(", contact_authorization_status=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.contact_authorization_status, ", accessibility_assistive_touch_enabled=null, accessibility_audible_feedback_enabled=", this.accessibility_audible_feedback_enabled, ", accessibility_bold_text_enabled=null, accessibility_braille_feedback_enabled=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.accessibility_braille_feedback_enabled, ", accessibility_closed_captioning_enabled=", this.accessibility_closed_captioning_enabled, ", accessibility_darker_system_colors_enabled=null, accessibility_enabled_services=");
        sb.append(this.accessibility_enabled_services);
        sb.append(", accessibility_font_scale=");
        sb.append(this.accessibility_font_scale);
        sb.append(", accessibility_font_size=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.accessibility_font_size, ", accessibility_generic_feedback_enabled=", this.accessibility_generic_feedback_enabled, ", accessibility_grayscale_enabled=null, accessibility_guided_access_enabled=null, accessibility_haptic_feedback_enabled=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.accessibility_haptic_feedback_enabled, ", accessibility_high_contrast_enabled=", this.accessibility_high_contrast_enabled, ", accessibility_invert_colors_enabled=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.accessibility_invert_colors_enabled, ", accessibility_preferred_content_size=null, accessibility_reduce_motion_enabled=", this.accessibility_reduce_motion_enabled, ", accessibility_reduce_transparency_enabled=null, accessibility_screen_magnification_enabled=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.accessibility_screen_magnification_enabled, ", accessibility_shake_to_undo_enabled=null, accessibility_speak_screen_enabled=null, accessibility_speak_selection_enabled=null, accessibility_spoken_feedback_enabled=", this.accessibility_spoken_feedback_enabled, ", accessibility_switch_control_enabled=null, accessibility_visual_feedback_enabled=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.accessibility_visual_feedback_enabled, ", accessibility_voiceover_enabled=", this.accessibility_voiceover_enabled, ", system_notification_preference_enabled=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.system_notification_preference_enabled, ", vpn_enabled=", this.vpn_enabled, ", vpn_endpoint=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.vpn_endpoint, ", device_model=", str, ", screen_width_dp=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.screen_width_dp, ", screen_height_dp=", this.screen_height_dp, ", screen_density=");
        sb.append(this.screen_density);
        sb.append(", system_camera_preference_enabled=");
        sb.append(this.system_camera_preference_enabled);
        sb.append(")");
        return sb.toString();
    }
}
