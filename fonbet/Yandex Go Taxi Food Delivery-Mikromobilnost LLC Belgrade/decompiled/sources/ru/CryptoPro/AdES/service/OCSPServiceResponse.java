package ru.CryptoPro.AdES.service;

import defpackage.ge5;
import defpackage.so60;

/* loaded from: classes4.dex */
public class OCSPServiceResponse extends ServiceResponse<ge5> {
    private final so60 request;

    public OCSPServiceResponse(so60 so60Var, ge5 ge5Var) {
        super(ge5Var);
        this.request = so60Var;
    }

    public so60 getRequest() {
        return this.request;
    }
}
