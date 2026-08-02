package com.squareup.cash.fileupload.real;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.webkit.MimeTypeMap;
import com.squareup.cash.R;
import com.squareup.cash.resource.text.AndroidStringManager;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes6.dex */
public final class AndroidFileTypeDescriber {
    public final AndroidStringManager stringManager;

    public AndroidFileTypeDescriber(AndroidStringManager androidStringManager) {
        this.stringManager = androidStringManager;
    }

    public final String getDescriptionForMimeType(String str) {
        String str2;
        boolean areEqual = Intrinsics.areEqual(str, "application/octet-stream");
        AndroidStringManager androidStringManager = this.stringManager;
        if (areEqual || str == null) {
            return androidStringManager.get(R.string.fileset_upload_unknown_subtitle);
        }
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = extensionFromMimeType.toUpperCase(Locale.ROOT);
            str2.getClass();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return androidStringManager.get(R.string.fileset_upload_unknown_subtitle);
        }
        boolean startsWith = StringsKt__StringsJVMKt.startsWith(str, "image/", true);
        Resources resources = androidStringManager.resources;
        if (startsWith) {
            resources.getClass();
            String format2 = new MessageFormat(resources.getString(R.string.fileset_upload_image_subtitle)).format(new Object[]{str2});
            format2.getClass();
            return format2;
        }
        resources.getClass();
        String format3 = new MessageFormat(resources.getString(R.string.fileset_upload_file_subtitle)).format(new Object[]{str2});
        format3.getClass();
        return format3;
    }
}
