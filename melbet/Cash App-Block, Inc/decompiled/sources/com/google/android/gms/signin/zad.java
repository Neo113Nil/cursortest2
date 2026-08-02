package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes4.dex */
public abstract class zad {
    public static final zaa zac;
    public static final Api zag;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        zaa zaaVar = new zaa(0);
        zac = zaaVar;
        new Scope(1, "profile");
        new Scope(1, "email");
        zag = new Api("SignIn.API", zaaVar, clientKey);
    }
}
