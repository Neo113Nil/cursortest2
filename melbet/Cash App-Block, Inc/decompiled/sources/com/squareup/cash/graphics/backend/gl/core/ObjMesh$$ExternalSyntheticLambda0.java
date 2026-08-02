package com.squareup.cash.graphics.backend.gl.core;

import com.google.mlkit.vision.text.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class ObjMesh$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ ArrayList f$0;
    public final /* synthetic */ ArrayList f$1;
    public final /* synthetic */ Ref$FloatRef f$10;
    public final /* synthetic */ Ref$FloatRef f$11;
    public final /* synthetic */ ArrayList f$2;
    public final /* synthetic */ ArrayList f$3;
    public final /* synthetic */ ArrayList f$4;
    public final /* synthetic */ ArrayList f$5;
    public final /* synthetic */ Ref$FloatRef f$6;
    public final /* synthetic */ Ref$FloatRef f$7;
    public final /* synthetic */ Ref$FloatRef f$8;
    public final /* synthetic */ Ref$FloatRef f$9;

    public /* synthetic */ ObjMesh$$ExternalSyntheticLambda0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, Ref$FloatRef ref$FloatRef3, Ref$FloatRef ref$FloatRef4, Ref$FloatRef ref$FloatRef5, Ref$FloatRef ref$FloatRef6) {
        this.f$0 = arrayList;
        this.f$1 = arrayList2;
        this.f$2 = arrayList3;
        this.f$3 = arrayList4;
        this.f$4 = arrayList5;
        this.f$5 = arrayList6;
        this.f$6 = ref$FloatRef;
        this.f$7 = ref$FloatRef2;
        this.f$8 = ref$FloatRef3;
        this.f$9 = ref$FloatRef4;
        this.f$10 = ref$FloatRef5;
        this.f$11 = ref$FloatRef6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        if (StringsKt__StringsJVMKt.startsWith(str, "f", false)) {
            List drop = CollectionsKt.drop(StringsKt.split$default(str, new char[]{' '}, 6), 1);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(drop, 10));
            Iterator it = drop.iterator();
            while (it.hasNext()) {
                List split$default = StringsKt.split$default((String) it.next(), new char[]{'/'}, 6);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(split$default, 10));
                Iterator it2 = split$default.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                }
                arrayList.add(arrayList2);
            }
            CollectionsKt__MutableCollectionsKt.addAll(this.f$0, new Integer[]{((List) arrayList.get(0)).get(0), ((List) arrayList.get(1)).get(0), ((List) arrayList.get(2)).get(0)});
            CollectionsKt__MutableCollectionsKt.addAll(this.f$1, new Integer[]{((List) arrayList.get(0)).get(1), ((List) arrayList.get(1)).get(1), ((List) arrayList.get(2)).get(1)});
            CollectionsKt__MutableCollectionsKt.addAll(this.f$2, new Integer[]{((List) arrayList.get(0)).get(2), ((List) arrayList.get(1)).get(2), ((List) arrayList.get(2)).get(2)});
        } else if (StringsKt__StringsJVMKt.startsWith(str, "vn", false)) {
            this.f$3.add(zzd.splitFloats$default(str));
        } else if (StringsKt__StringsJVMKt.startsWith(str, "vt", false)) {
            this.f$4.add(zzd.splitFloats$default(str));
        } else if (StringsKt.startsWith$default(str, 'v')) {
            float[] splitFloats$default = zzd.splitFloats$default(str);
            ArrayList arrayList3 = this.f$5;
            arrayList3.add(splitFloats$default);
            float f = splitFloats$default[0];
            float f2 = splitFloats$default[1];
            float f3 = splitFloats$default[2];
            int size = arrayList3.size();
            Ref$FloatRef ref$FloatRef = this.f$6;
            Ref$FloatRef ref$FloatRef2 = this.f$7;
            Ref$FloatRef ref$FloatRef3 = this.f$8;
            Ref$FloatRef ref$FloatRef4 = this.f$9;
            Ref$FloatRef ref$FloatRef5 = this.f$10;
            Ref$FloatRef ref$FloatRef6 = this.f$11;
            if (size == 1) {
                ref$FloatRef.element = f;
                ref$FloatRef2.element = f;
                ref$FloatRef3.element = f2;
                ref$FloatRef4.element = f2;
                ref$FloatRef5.element = f3;
                ref$FloatRef6.element = f3;
            } else {
                if (f < ref$FloatRef.element) {
                    ref$FloatRef.element = f;
                }
                if (f > ref$FloatRef2.element) {
                    ref$FloatRef2.element = f;
                }
                if (f2 > ref$FloatRef3.element) {
                    ref$FloatRef3.element = f2;
                }
                if (f2 < ref$FloatRef4.element) {
                    ref$FloatRef4.element = f2;
                }
                if (f3 < ref$FloatRef5.element) {
                    ref$FloatRef5.element = f3;
                }
                if (f3 > ref$FloatRef6.element) {
                    ref$FloatRef6.element = f3;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
