package app.cash.redwood.protocol;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import okio.Path$$ExternalSyntheticBUOutline0;

@JvmInline
@Serializable
/* loaded from: classes3.dex */
public final class RedwoodVersion implements Comparable<RedwoodVersion> {
    public static final String Unknown;
    public final String value;
    public static final Companion Companion = new Companion();

    /* renamed from: format, reason: collision with root package name */
    public static final Regex f924format = new Regex("^(0|[1-9][0-9]*)\\.(0|[1-9][0-9]*)\\.(0|[1-9][0-9]*)(-[a-zA-Z0-9._-]+)?$");

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"app/cash/redwood/protocol/RedwoodVersion$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/protocol/RedwoodVersion;", "serializer", "()Lkotlinx/serialization/KSerializer;", "Lkotlin/text/Regex;", "format", "Lkotlin/text/Regex;", "redwood-protocol"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return RedwoodVersion$$serializer.INSTANCE;
        }
    }

    static {
        m1380constructorimpl("0.0.0");
        Unknown = "0.0.0";
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static void m1380constructorimpl(String str) {
        str.getClass();
        if (f924format.matches(str)) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1((Object) "Invalid version format: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        return 1;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(RedwoodVersion redwoodVersion) {
        String str = redwoodVersion.value;
        str.getClass();
        Regex regex = f924format;
        MatcherMatchResult matchEntire = regex.matchEntire(this.value);
        matchEntire.getClass();
        MatcherMatchResult matchEntire2 = regex.matchEntire(str);
        matchEntire2.getClass();
        MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = matchEntire2.groups;
        int i = 1;
        while (true) {
            MatcherMatchResult$groups$1 matcherMatchResult$groups$12 = matchEntire.groups;
            if (i < 4) {
                MatchGroup matchGroup = matcherMatchResult$groups$12.get(i);
                matchGroup.getClass();
                int parseInt = Integer.parseInt(matchGroup.value);
                MatchGroup matchGroup2 = matcherMatchResult$groups$1.get(i);
                matchGroup2.getClass();
                int parseInt2 = Integer.parseInt(matchGroup2.value);
                if (parseInt > parseInt2) {
                    break;
                }
                if (parseInt < parseInt2) {
                    return -1;
                }
                i++;
            } else {
                MatchGroup matchGroup3 = matcherMatchResult$groups$12.get(4);
                MatchGroup matchGroup4 = matcherMatchResult$groups$1.get(4);
                if (matchGroup3 != null) {
                    String str2 = matchGroup3.value;
                    if (matchGroup4 == null) {
                        return -1;
                    }
                    String str3 = matchGroup4.value;
                    if (Intrinsics.areEqual(str2, "-SNAPSHOT")) {
                        return !Intrinsics.areEqual(str3, "-SNAPSHOT") ? 1 : 0;
                    }
                    if (Intrinsics.areEqual(str3, "-SNAPSHOT")) {
                        return -1;
                    }
                    return str2.compareTo(str3);
                }
                if (matchGroup4 == null) {
                    return 0;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RedwoodVersion) {
            return Intrinsics.areEqual(this.value, ((RedwoodVersion) obj).value);
        }
        return false;
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return this.value;
    }
}
