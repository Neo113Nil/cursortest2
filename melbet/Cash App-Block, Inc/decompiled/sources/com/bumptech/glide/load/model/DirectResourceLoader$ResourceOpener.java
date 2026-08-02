package com.bumptech.glide.load.model;

import android.content.res.Resources;

/* loaded from: classes4.dex */
public interface DirectResourceLoader$ResourceOpener {
    void close(Object obj);

    Class getDataClass();

    Object open(Resources resources, int i, Resources.Theme theme);
}
