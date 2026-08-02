package io.appmetrica.analytics.remotepermissions.impl;

import defpackage.tcc;
import defpackage.uza;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.remotepermissions.internal.config.FeatureConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;

/* loaded from: classes9.dex */
public final class b implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final e fromModel(FeatureConfig featureConfig) {
        e eVar = new e();
        Set<String> permittedPermissions = featureConfig.getPermittedPermissions();
        ArrayList arrayList = new ArrayList(tcc.n(permittedPermissions, 10));
        Iterator<T> it = permittedPermissions.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(uza.a));
        }
        eVar.a = (byte[][]) arrayList.toArray(new byte[0][]);
        return eVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FeatureConfig toModel(e eVar) {
        Set set;
        byte[][] bArr = eVar.a;
        if (bArr != null) {
            ArrayList arrayList = new ArrayList(bArr.length);
            for (byte[] bArr2 : bArr) {
                arrayList.add(new String(bArr2, uza.a));
            }
            set = kotlin.collections.a.N0(arrayList);
        } else {
            set = EmptySet.a;
        }
        return new FeatureConfig(set);
    }
}
