package com.squareup.cash.investing.db.categories;

import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.db.WireAdapter;

/* loaded from: classes.dex */
public final class Category$Adapter {
    public final WireAdapter category_colorAdapter;
    public final EnumColumnAdapter prefix_iconAdapter;
    public final EnumColumnAdapter typeAdapter;

    public /* synthetic */ Category$Adapter(EnumColumnAdapter enumColumnAdapter, EnumColumnAdapter enumColumnAdapter2, WireAdapter wireAdapter) {
        this.prefix_iconAdapter = enumColumnAdapter;
        this.typeAdapter = enumColumnAdapter2;
        this.category_colorAdapter = wireAdapter;
    }

    public Category$Adapter(WireAdapter wireAdapter, EnumColumnAdapter enumColumnAdapter, EnumColumnAdapter enumColumnAdapter2) {
        this.category_colorAdapter = wireAdapter;
        this.prefix_iconAdapter = enumColumnAdapter;
        this.typeAdapter = enumColumnAdapter2;
    }
}
