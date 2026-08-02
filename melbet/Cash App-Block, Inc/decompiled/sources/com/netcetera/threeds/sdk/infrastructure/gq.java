package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;

/* loaded from: classes5.dex */
class gq implements fq {
    public static final gq ThreeDS2Service = new gq();

    @Override // com.netcetera.threeds.sdk.infrastructure.fq
    public ae getWarnings(Context context, jr jrVar, isEmpty isempty) {
        return af.ThreeDS2Service(context, jrVar, isempty);
    }
}
