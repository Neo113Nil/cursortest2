package ru.CryptoPro.CAdES.timestamp.external.data;

import defpackage.m8z0;
import ru.CryptoPro.AdES.external.timestamp.data.TSPData;

/* loaded from: classes4.dex */
public class TimeStampData {
    public final m8z0 a;
    public final TSPData b;

    public TimeStampData(m8z0 m8z0Var, TSPData tSPData) {
        this.a = m8z0Var;
        this.b = tSPData;
    }

    public m8z0 getTimeStampToken() {
        return this.a;
    }

    public TSPData getTspData() {
        return this.b;
    }
}
