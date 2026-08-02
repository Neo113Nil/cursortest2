package com.miteksystems.misnap.controller.a;

import com.miteksystems.misnap.core.Barcode;
import com.miteksystems.misnap.core.UserAction;

/* loaded from: classes4.dex */
public final class b extends b0 {
    public final Barcode b;
    public final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(UserAction userAction, Barcode barcode, boolean z) {
        super(userAction);
        userAction.getClass();
        this.b = barcode;
        this.c = z;
    }
}
