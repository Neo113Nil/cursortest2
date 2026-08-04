package com.gamericefishpro.space.b5;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d.j;
import com.gamericefishpro.space.d.k;
import com.gamericefishpro.space.e1.g;
import com.gamericefishpro.space.ph.m0;
import com.gamericefishpro.space.si.n0;
import com.gamericefishpro.space.si.z;
import com.gamericefishpro.space.z5.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements d {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.gamericefishpro.space.z5.d
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.b1.d dVar = (com.gamericefishpro.space.b1.d) this.b;
                for (Map.Entry entry : m0.h((LinkedHashMap) dVar.v).entrySet()) {
                    dVar.r(((n0) ((z) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : m0.h((LinkedHashMap) dVar.e).entrySet()) {
                    dVar.r(((d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) dVar.d;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle source = com.gamericefishpro.space.wa.b.g((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Intrinsics.checkNotNullParameter(source, "source");
                return source;
            case 1:
                k kVar = (k) this.b;
                Bundle outState = new Bundle();
                j jVar = kVar.A;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(outState, "outState");
                LinkedHashMap linkedHashMap2 = jVar.b;
                outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap2.values()));
                outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap2.keySet()));
                outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.d));
                outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(jVar.g));
                return outState;
            default:
                Map mapD = ((g) this.b).d();
                Bundle bundle = new Bundle();
                for (Map.Entry entry4 : mapD.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
        }
    }
}
