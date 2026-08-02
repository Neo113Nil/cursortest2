package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class a {
    public final Context a;

    public a(Activity activity) {
        this.a = activity;
    }

    public final void a(String str, String str2, ArrayList arrayList) {
        SharedPreferences.Editor edit = this.a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }
}
