package com.gamericefishpro.space.o2;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.o1.k0;
import com.gamericefishpro.space.ph.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.gamericefishpro.space.ei.l implements Function2 {
    public static final j A;
    public static final j B;
    public static final j C;
    public static final j D;
    public static final j E;
    public static final j F;
    public static final j G;
    public static final j H;
    public static final j I;
    public static final j J;
    public static final j K;
    public static final j L;
    public static final j M;
    public static final j N;
    public static final j e;
    public static final j i;
    public static final j v;
    public static final j w;
    public static final j y;
    public static final j z;
    public final /* synthetic */ int d;

    static {
        int i2 = 2;
        e = new j(i2, 0);
        i = new j(i2, 1);
        v = new j(i2, 2);
        w = new j(i2, 3);
        y = new j(i2, 4);
        z = new j(i2, 5);
        A = new j(i2, 6);
        B = new j(i2, 7);
        C = new j(i2, 8);
        D = new j(i2, 9);
        E = new j(i2, 10);
        F = new j(i2, 11);
        G = new j(i2, 12);
        H = new j(i2, 13);
        I = new j(i2, 14);
        J = new j(i2, 15);
        K = new j(i2, 16);
        L = new j(i2, 17);
        M = new j(i2, 18);
        N = new j(i2, 19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i2, int i3) {
        super(i2);
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        com.gamericefishpro.space.oh.d dVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = g0.d;
                }
                return CollectionsKt.F(collection, list);
            case 1:
                return (com.gamericefishpro.space.i1.c) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayListM = CollectionsKt.M(list2);
                arrayListM.addAll(list3);
                return arrayListM;
            case 3:
                return (com.gamericefishpro.space.i1.l) obj;
            case 4:
                return (com.gamericefishpro.space.i1.e) obj;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                return (Unit) obj;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return (Unit) obj;
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                return (Unit) obj;
            case 9:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 10:
                h hVar = (h) obj;
                int i2 = ((h) obj2).a;
                return hVar;
            case RequestError.STOP_TRACKING /* 11 */:
                return (k0) obj;
            case 12:
                return (String) obj;
            case 13:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayListM2 = CollectionsKt.M(list4);
                arrayListM2.addAll(list5);
                return arrayListM2;
            case 14:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 15:
                return (String) obj;
            case 16:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 17:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.a) == null) {
                    str = aVar2.a;
                }
                if (aVar == null || (dVar = aVar.b) == null) {
                    dVar = aVar2.b;
                }
                return new a(str, dVar);
            case 18:
                return obj == null ? obj2 : obj;
            default:
                o oVar = (o) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                l lVar = ((o) obj).d;
                v vVar = s.t;
                Object objG = lVar.d.g(vVar);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = oVar.d.d.g(vVar);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
