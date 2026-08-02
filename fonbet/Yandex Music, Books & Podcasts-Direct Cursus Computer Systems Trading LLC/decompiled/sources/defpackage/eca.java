package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class eca {
    public static final eca d = new eca(c5b.a, null, null);
    public final Collection a;
    public final hca b;
    public final fvs c;

    public eca(Collection collection, hca hcaVar, fvs fvsVar) {
        collection.getClass();
        this.a = collection;
        this.b = hcaVar;
        this.c = fvsVar;
    }

    public final ArrayList a() {
        Collection collection = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((mqs) obj).k == dg2.b) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eca)) {
            return false;
        }
        eca ecaVar = (eca) obj;
        return Intrinsics.d(this.a, ecaVar.a) && Intrinsics.d(this.b, ecaVar.b) && Intrinsics.d(this.c, ecaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        hca hcaVar = this.b;
        int hashCode2 = (hashCode + (hcaVar == null ? 0 : hcaVar.hashCode())) * 31;
        fvs fvsVar = this.c;
        return hashCode2 + (fvsVar != null ? fvsVar.hashCode() : 0);
    }

    public final String toString() {
        return "DownloadableContainer(tracks=" + this.a + ", entity=" + this.b + ", trackDownloadMeta=" + this.c + ")";
    }
}
