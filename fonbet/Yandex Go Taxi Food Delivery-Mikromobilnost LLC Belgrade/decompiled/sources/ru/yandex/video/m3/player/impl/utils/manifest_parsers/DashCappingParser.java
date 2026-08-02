package ru.yandex.video.m3.player.impl.utils.manifest_parsers;

import defpackage.evu0;
import defpackage.eyi;
import defpackage.jl40;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/manifest_parsers/DashCappingParser;", "", "<init>", "()V", "Lru/yandex/video/m3/player/impl/utils/manifest_parsers/DashVideoSupplementalPropParser;", "dashVideoSupplementalPropParser", "", "parse", "(Lru/yandex/video/m3/player/impl/utils/manifest_parsers/DashVideoSupplementalPropParser;)Ljava/lang/Integer;", "", "Leyi;", "seq", "parseDescriptors", "(Ljava/util/List;)Ljava/lang/Integer;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DASH_FORMAT_REGEX_PATTERN", "Ljava/util/regex/Pattern;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DashCappingParser {
    public static final int $stable = 8;
    private final Pattern DASH_FORMAT_REGEX_PATTERN = Pattern.compile("([0-9]{1,10})");

    public final Integer parse(DashVideoSupplementalPropParser dashVideoSupplementalPropParser) {
        return parseDescriptors(dashVideoSupplementalPropParser.getSupplementalProperties());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Integer] */
    public final Integer parseDescriptors(List<eyi> seq) {
        String str;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ArrayList arrayList = new ArrayList();
        for (Object obj : seq) {
            eyi eyiVar = (eyi) obj;
            if (jl40.l(eyiVar.a, "urn:mpeg:yandex:capping:maxheight") && (str = eyiVar.b) != null && !evu0.J(str)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ycc.r(RegUtilsKt.findAll(this.DASH_FORMAT_REGEX_PATTERN, ((eyi) it.next()).b), arrayList2);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int parseInt = Integer.parseInt((String) ((List) it2.next()).get(1));
            Integer num = (Integer) ref$ObjectRef.element;
            ref$ObjectRef.element = num != null ? Integer.valueOf(Math.min(num.intValue(), parseInt)) : Integer.valueOf(parseInt);
        }
        return (Integer) ref$ObjectRef.element;
    }
}
