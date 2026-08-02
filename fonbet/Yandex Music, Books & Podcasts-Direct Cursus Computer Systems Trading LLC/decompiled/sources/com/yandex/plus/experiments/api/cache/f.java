package com.yandex.plus.experiments.api.cache;

import com.yandex.plus.core.graphql.daily.progress.s;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.msa;
import defpackage.nsa;
import defpackage.u7g;
import defpackage.vhp;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes4.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();
    public static final arf[] f;
    public final String a;
    public final String b;
    public final List c;
    public final Set d;
    public final long e;

    static {
        bwf bwfVar = bwf.b;
        f = new arf[]{null, null, btf.a(bwfVar, new s(15)), btf.a(bwfVar, new s(16)), null};
    }

    public /* synthetic */ f(int i, String str, String str2, List list, Set set, nsa nsaVar) {
        if (16 != (i & 16)) {
            u7g.V(i, 16, d.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = set;
        }
        this.e = nsaVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.a, fVar.a) && Intrinsics.d(this.b, fVar.b) && Intrinsics.d(this.c, fVar.c) && Intrinsics.d(this.d, fVar.d) && nsa.e(this.e, fVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Set set = this.d;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        msa msaVar = nsa.b;
        return Long.hashCode(this.e) + hashCode4;
    }

    public final String toString() {
        return "PlusCachedExperiments(testIdsWithBucketNumber=" + this.a + ", triggeredTestIdsWithBucketNumber=" + this.b + ", testIds=" + this.c + ", flags=" + this.d + ", createdAt=" + ((Object) nsa.t(this.e)) + ')';
    }

    public f(String str, String str2, List list, Set set, long j) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = set;
        this.e = j;
    }
}
