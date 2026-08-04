package com.gamericefishpro.space.wh;

import com.gamericefishpro.space.ph.c;
import com.gamericefishpro.space.ph.f;
import com.gamericefishpro.space.ph.v;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f implements a, Serializable {
    public final Enum[] e;

    public b(Enum[] entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        this.e = entries;
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        return this.e.length;
    }

    @Override // com.gamericefishpro.space.ph.a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return ((Enum) v.t(element.ordinal(), this.e)) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c cVar = f.d;
        Enum[] enumArr = this.e;
        int length = enumArr.length;
        cVar.getClass();
        c.a(i, length);
        return enumArr[i];
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) v.t(iOrdinal, this.e)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // com.gamericefishpro.space.ph.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}
