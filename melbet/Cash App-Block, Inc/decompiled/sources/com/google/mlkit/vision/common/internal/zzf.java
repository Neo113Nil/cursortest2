package com.google.mlkit.vision.common.internal;

import coil3.size.SizeKt;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class zzf implements ComponentFactory {
    public static final /* synthetic */ zzf zza = new zzf();

    @Override // com.google.firebase.components.ComponentFactory
    public Object create(zzlj zzljVar) {
        Set of = zzljVar.setOf(Qualified.unqualified(SizeKt.class));
        zzf zzfVar = new zzf();
        new HashMap();
        new HashMap();
        Iterator it = of.iterator();
        if (!it.hasNext()) {
            return zzfVar;
        }
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(it.next());
        throw null;
    }
}
