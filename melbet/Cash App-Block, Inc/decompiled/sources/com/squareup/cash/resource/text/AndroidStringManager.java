package com.squareup.cash.resource.text;

import android.app.Application;
import android.content.res.Resources;
import android.icu.text.MessageFormat;
import app.cash.paraphrase.FormattedResource;
import com.squareup.cash.R;
import com.squareup.cash.localization.LanguageManagerKt;
import com.squareup.cash.localization.RealLanguageManager;
import com.squareup.util.cash.Countries;

/* loaded from: classes.dex */
public final class AndroidStringManager {
    public final Resources resources;

    public AndroidStringManager(Application application, RealLanguageManager realLanguageManager) {
        realLanguageManager.getClass();
        Resources resources = LanguageManagerKt.wrapContext(realLanguageManager, application).getResources();
        resources.getClass();
        this.resources = resources;
    }

    public static String getOrdinal(int i) {
        String format2 = MessageFormat.format("{0,ordinal}", Integer.valueOf(i));
        format2.getClass();
        return format2;
    }

    public final String get(int i) {
        String string2 = this.resources.getString(i);
        string2.getClass();
        return string2;
    }

    public final String getString(FormattedResource formattedResource) {
        formattedResource.getClass();
        return Countries.getString(this.resources, formattedResource);
    }

    public final String getString() {
        return get(R.string.local_presenters_unspecified);
    }
}
