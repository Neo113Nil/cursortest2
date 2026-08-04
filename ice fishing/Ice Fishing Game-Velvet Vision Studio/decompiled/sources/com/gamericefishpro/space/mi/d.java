package com.gamericefishpro.space.mi;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ai.n;
import com.gamericefishpro.space.li.m;
import com.gamericefishpro.space.li.o;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.gamericefishpro.space.ph.a {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ d(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.gamericefishpro.space.ph.a
    public final int b() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((Matcher) ((com.gamericefishpro.space.a8.c) this.e).e).groupCount() + 1;
            case 1:
                return ((com.gamericefishpro.space.ph.i) this.e).c();
            default:
                return ((com.gamericefishpro.space.y0.b) this.e).c();
        }
    }

    public MatchGroup c(int i) {
        Matcher matcher = (Matcher) ((com.gamericefishpro.space.a8.c) this.e).e;
        IntRange intRangeF = com.gamericefishpro.space.ji.f.f(matcher.start(i), matcher.end(i));
        if (intRangeF.d < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return new MatchGroup(strGroup, intRangeF);
    }

    @Override // com.gamericefishpro.space.ph.a, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            case 1:
                return ((com.gamericefishpro.space.ph.i) this.e).containsValue(obj);
            default:
                return ((com.gamericefishpro.space.y0.b) this.e).containsValue(obj);
        }
    }

    @Override // com.gamericefishpro.space.ph.a, java.util.Collection
    public boolean isEmpty() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Intrinsics.checkNotNullParameter(this, "<this>");
                IntRange intRange = new IntRange(0, size() - 1, 1);
                Intrinsics.checkNotNullParameter(intRange, "<this>");
                return new o(m.d(new n(5, intRange), new com.gamericefishpro.space.a7.c(16, this)));
            case 1:
                return new com.gamericefishpro.space.ph.h(((com.gamericefishpro.space.y0.g) ((com.gamericefishpro.space.ph.i) this.e).a()).iterator(), 1);
            default:
                com.gamericefishpro.space.y0.i iVar = ((com.gamericefishpro.space.y0.b) this.e).v;
                com.gamericefishpro.space.y0.j[] jVarArr = new com.gamericefishpro.space.y0.j[8];
                for (int i = 0; i < 8; i++) {
                    jVarArr[i] = new com.gamericefishpro.space.y0.k(2);
                }
                return new com.gamericefishpro.space.y0.h(iVar, jVarArr);
        }
    }
}
