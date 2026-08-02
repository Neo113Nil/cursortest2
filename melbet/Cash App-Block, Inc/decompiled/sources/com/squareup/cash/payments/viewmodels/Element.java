package com.squareup.cash.payments.viewmodels;

/* loaded from: classes6.dex */
public interface Element {
    boolean canZoom(float f);

    Element copy(ListProperty listProperty);

    int getId();

    ListProperty getProperties();
}
