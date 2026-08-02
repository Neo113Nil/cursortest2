package ru.yandex.video.sessionlogger.table;

import android.content.Context;
import defpackage.bvw;
import defpackage.iye;
import defpackage.jc7;
import defpackage.mka;
import defpackage.tsr;
import defpackage.vsr;
import defpackage.zeo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class LogDatabase_Impl extends LogDatabase {
    @Override // defpackage.ueo
    public final iye d() {
        return new iye(this, new HashMap(0), new HashMap(0), "LogSession");
    }

    @Override // defpackage.ueo
    public final vsr f(jc7 jc7Var) {
        zeo zeoVar = new zeo(jc7Var, new mka(this));
        Context context = jc7Var.a;
        context.getClass();
        return jc7Var.c.create(new tsr(context, jc7Var.b, zeoVar, false, false));
    }

    @Override // defpackage.ueo
    public final List h(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.ueo
    public final Set l() {
        return new HashSet();
    }

    @Override // defpackage.ueo
    public final Map n() {
        HashMap hashMap = new HashMap();
        hashMap.put(bvw.class, Collections.EMPTY_LIST);
        return hashMap;
    }
}
