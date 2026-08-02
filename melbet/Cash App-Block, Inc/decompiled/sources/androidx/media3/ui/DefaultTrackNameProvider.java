package androidx.media3.ui;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.util.Util;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.squareup.cash.R;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DefaultTrackNameProvider implements ModelLoaderFactory {
    public final Resources resources;

    public DefaultTrackNameProvider(Resources resources, int i) {
        switch (i) {
            case 1:
                this.resources = resources;
                break;
            default:
                resources.getClass();
                this.resources = resources;
                break;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        return new AssetUriLoader(this.resources, multiModelLoaderFactory.build(Uri.class, AssetFileDescriptor.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String buildLanguageOrLabelString(Format format2) {
        String str;
        String joinWithSeparator;
        String str2 = format2.language;
        String str3 = format2.label;
        if (!TextUtils.isEmpty(str2) && !"und".equals(str2)) {
            Locale forLanguageTag = Locale.forLanguageTag(str2);
            String str4 = Util.DEVICE_DEBUG_INFO;
            Locale locale = Locale.getDefault(Locale.Category.DISPLAY);
            str = forLanguageTag.getDisplayName(locale);
            if (!TextUtils.isEmpty(str)) {
                try {
                    int offsetByCodePoints = str.offsetByCodePoints(0, 1);
                    str = str.substring(0, offsetByCodePoints).toUpperCase(locale) + str.substring(offsetByCodePoints);
                } catch (IndexOutOfBoundsException unused) {
                }
                joinWithSeparator = joinWithSeparator(str, buildRoleString(format2));
                if (TextUtils.isEmpty(joinWithSeparator)) {
                    return joinWithSeparator;
                }
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                return str3;
            }
        }
        str = "";
        joinWithSeparator = joinWithSeparator(str, buildRoleString(format2));
        if (TextUtils.isEmpty(joinWithSeparator)) {
        }
    }

    public String buildRoleString(Format format2) {
        int i = format2.roleFlags;
        int i2 = i & 2;
        Resources resources = this.resources;
        String string2 = i2 != 0 ? resources.getString(R.string.exo_track_role_alternate) : "";
        if ((i & 4) != 0) {
            string2 = joinWithSeparator(string2, resources.getString(R.string.exo_track_role_supplementary));
        }
        if ((i & 8) != 0) {
            string2 = joinWithSeparator(string2, resources.getString(R.string.exo_track_role_commentary));
        }
        return (i & 1088) != 0 ? joinWithSeparator(string2, resources.getString(R.string.exo_track_role_closed_captions)) : string2;
    }

    public String joinWithSeparator(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (!str2.isEmpty()) {
                str = TextUtils.isEmpty(str) ? str2 : this.resources.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }
}
