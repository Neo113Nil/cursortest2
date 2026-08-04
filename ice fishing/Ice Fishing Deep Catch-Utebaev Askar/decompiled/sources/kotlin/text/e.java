package kotlin.text;

import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.collections.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f202a;

    public e(f fVar) {
        this.f202a = fVar;
    }

    @Override // kotlin.collections.b
    public final int a() {
        return this.f202a.f203a.groupCount() + 1;
    }

    public final MatchGroup b(int i2) {
        f fVar = this.f202a;
        Matcher matcher = fVar.f203a;
        IntRange intRangeA = n.f.a(matcher.start(i2), matcher.end(i2));
        if (Integer.valueOf(intRangeA.f213a).intValue() < 0) {
            return null;
        }
        String strGroup = fVar.f203a.group(i2);
        Intrinsics.checkNotNullExpressionValue(strGroup, "matchResult.group(index)");
        return new MatchGroup(strGroup, intRangeA);
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof MatchGroup) {
            return super.contains((MatchGroup) obj);
        }
        return false;
    }

    @Override // kotlin.collections.b, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        IntRange intRange = new IntRange(0, size() - 1);
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        kotlin.collections.l lVar = new kotlin.collections.l(1, intRange);
        d transform = new d(this);
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return new p.g(new p.h(lVar, transform));
    }
}
