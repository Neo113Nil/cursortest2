package com.squareup.cash.db.profile;

import com.squareup.protos.franklin.api.UiAlias;

/* loaded from: classes.dex */
public interface Alias {
    String getCanonical_text();

    UiAlias.Type getType();
}
