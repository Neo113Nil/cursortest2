package defpackage;

import android.content.SharedPreferences;
import android.os.Looper;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zix {
    public static final msg i = new msg("FeatureUsageAnalytics", null);
    public static final String j = "22.0.0";
    public static zix k;
    public final sbx a;
    public final SharedPreferences b;
    public final String c;
    public long h;
    public final HashSet f = new HashSet();
    public final HashSet g = new HashSet();
    public final fsn e = new fsn(Looper.getMainLooper(), 3);
    public final yyo d = new yyo(27, this);

    public zix(SharedPreferences sharedPreferences, sbx sbxVar, String str) {
        this.b = sharedPreferences;
        this.a = sbxVar;
        this.c = str;
    }

    public static void a(rgx rgxVar) {
        zix zixVar;
        if (!sbx.k || (zixVar = k) == null) {
            return;
        }
        SharedPreferences sharedPreferences = zixVar.b;
        String num = Integer.toString(rgxVar.a);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        String g = f1d.g("feature_usage_timestamp_reported_feature_", num);
        if (!sharedPreferences.contains(g)) {
            g = f1d.g("feature_usage_timestamp_detected_feature_", num);
        }
        edit.putLong(g, System.currentTimeMillis()).apply();
        zixVar.f.add(rgxVar);
        zixVar.e.post(zixVar.d);
    }

    public static rgx b(String str) {
        switch (Integer.parseInt(str)) {
            case 0:
                return rgx.DEVELOPER_FEATURE_FLAG_UNKNOWN;
            case 1:
                return rgx.CAF_CAST_BUTTON;
            case 2:
                return rgx.CAF_EXPANDED_CONTROLLER;
            case 3:
                return rgx.CAF_MINI_CONTROLLER;
            case 4:
                return rgx.CAF_CONTAINER_CONTROLLER;
            case 5:
                return rgx.CAST_CONTEXT;
            case 6:
                return rgx.IMAGE_CACHE;
            case 7:
                return rgx.IMAGE_PICKER;
            case 8:
                return rgx.AD_BREAK_PARSER;
            case 9:
                return rgx.UI_STYLE;
            case 10:
                return rgx.HARDWARE_VOLUME_BUTTON;
            case 11:
                return rgx.NON_CAST_DEVICE_PROVIDER;
            case 12:
                return rgx.PAUSE_CONTROLLER;
            case 13:
                return rgx.SEEK_CONTROLLER;
            case 14:
                return rgx.STREAM_VOLUME;
            case 15:
                return rgx.UI_MEDIA_CONTROLLER;
            case 16:
                return rgx.PLAYBACK_RATE_CONTROLLER;
            case 17:
                return rgx.PRECACHE;
            case 18:
                return rgx.INSTRUCTIONS_VIEW;
            case 19:
                return rgx.OPTION_SUSPEND_SESSIONS_WHEN_BACKGROUNDED;
            case 20:
                return rgx.OPTION_STOP_RECEIVER_APPLICATION_WHEN_ENDING_SESSION;
            case 21:
                return rgx.OPTION_DISABLE_DISCOVERY_AUTOSTART;
            case 22:
                return rgx.OPTION_DISABLE_ANALYTICS_LOGGING;
            case 23:
                return rgx.OPTION_PHYSICAL_VOLUME_BUTTONS_WILL_CONTROL_DEVICE_VOLUME;
            case 24:
                return rgx.CAF_EXPANDED_CONTROLLER_HIDE_STREAM_POSITION_CONTROLS_FOR_LIVE_CONTENT;
            case 25:
                return rgx.CAF_EXPANDED_CONTROLLER_WITH_LIVE_CONTENT;
            case 26:
                return rgx.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_OPTIONS;
            case 27:
                return rgx.REMOTE_MEDIA_CLIENT_QUEUE_LOAD_ITEMS_WITH_OPTIONS;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return rgx.REMOTE_MEDIA_CLIENT_LOAD_MEDIA_WITH_LOAD_REQUEST_DATA;
            case 29:
                return rgx.LAUNCH_OPTION_ANDROID_RECEIVER_COMPATIBLE;
            case 30:
                return rgx.CAST_CONTEXT_SET_LAUNCH_CREDENTIALS_DATA;
            case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                return rgx.START_DISCOVERY_AFTER_FIRST_TAP_ON_CAST_BUTTON;
            case 32:
                return rgx.CAST_UNAVAILABLE_BUTTON_VISIBLE;
            case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                return rgx.CAST_DEFAULT_MEDIA_ROUTER_DIALOG;
            case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                return rgx.CAST_CUSTOM_MEDIA_ROUTER_DIALOG;
            case 35:
                return rgx.CAST_OUTPUT_SWITCHER_ENABLED;
            case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                return rgx.CAST_TRANSFER_TO_LOCAL_ENABLED;
            case 37:
                return rgx.CAST_BUTTON_IS_TRIGGERED_DEFAULT_CAST_DIALOG_FALSE;
            case 38:
                return rgx.CAST_BUTTON_DELEGATE;
            case 39:
                return rgx.CAST_BUTTON_DELEGATE_PRESENT_LNA_PERMISSION_CUSTOM_DIALOG;
            case 40:
                return rgx.CAST_BUTTON_DELEGATE_PRESENT_CAST_STATE_CUSTOM_DIALOG;
            case 41:
                return rgx.CAST_TRANSFER_TO_LOCAL_USED;
            case 42:
                return rgx.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                return rgx.MEDIA_REQUEST_ITEM_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                return rgx.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_TO_STRING;
            case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                return rgx.HLS_SEGMENT_MAP_HLS_SEGMENT_FORMAT_STRING_TO_ENUM;
            case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                return rgx.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_TO_STRING;
            case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                return rgx.HLS_VIDEO_SEGMENT_MAP_HLS_VIDEO_SEGMENT_FORMAT_STRING_TO_ENUM;
            case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                return rgx.CAST_SLIDER_SET_AD_BLOCK_POSITIONS;
            case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                return rgx.CAF_NOTIFICATION_SERVICE;
            case 50:
                return rgx.HARDWARE_VOLUME_BUTTON_PRESS;
            case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                return rgx.CAST_SDK_DEFAULT_DEVICE_DIALOG;
            case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                return rgx.CAST_SDK_CUSTOM_DEVICE_DIALOG;
            case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                return rgx.PERSISTENT_CAST_BUTTON_DISCOVERY_DISABLED_WITH_CONFLICT_TYPES;
            case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                return rgx.CAST_DEVICE_DIALOG_FACTORY_INSTANTIATED;
            case UibcKeyCode.TV_KEYCODE_7 /* 55 */:
                return rgx.CAF_MEDIA_NOTIFICATION_PROXY;
            case UibcKeyCode.TV_KEYCODE_8 /* 56 */:
                return rgx.REMOTE_CONNECTION_MANAGER_ACQUIRED;
            case UibcKeyCode.TV_KEYCODE_9 /* 57 */:
                return rgx.REMOTE_CONNECTION_CALLBACK_SET;
            default:
                return null;
        }
    }

    public final void c(HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.apply();
    }
}
