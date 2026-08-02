package com.squareup.cash.blockers.presenters;

import androidx.collection.ArrayMap;
import app.cash.paraphrase.FormattedResource;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class FormattedResources {
    public static final FormattedResources INSTANCE = new FormattedResources();

    public static FormattedResource blockers_terms_spanish(Object obj, String str) {
        obj.getClass();
        ArrayMap arrayMap = new ArrayMap(2);
        arrayMap.put("tos_url", obj);
        arrayMap.put("default_terms", str);
        return new FormattedResource(R.string.blockers_terms_spanish, arrayMap);
    }
}
