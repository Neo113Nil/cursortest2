package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import defpackage.ad2;
import defpackage.ds6;
import defpackage.j9t;
import defpackage.p94;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory {
    public j9t create(ds6 ds6Var) {
        ad2 ad2Var = (ad2) ds6Var;
        return new p94(ad2Var.a, ad2Var.b, ad2Var.c);
    }
}
