package ru.yandex.video.m3.player.impl.utils.manifest_parsers;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¨\u0006\u0005"}, d2 = {"findAll", "", "", "Ljava/util/regex/Pattern;", "match", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegUtilsKt {
    public static final List<List<String>> findAll(Pattern pattern, String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            ArrayList arrayList2 = new ArrayList();
            int groupCount = matcher.groupCount();
            if (groupCount >= 0) {
                while (true) {
                    arrayList2.add(matcher.group(i));
                    i = i != groupCount ? i + 1 : 0;
                }
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }
}
