package com.squareup.cash.markdownparser;

import app.cash.arcade.values.Attribute;
import app.cash.arcade.values.AttributeRange;
import app.cash.arcade.values.AttributedString;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.sequences.GeneratorSequence$iterator$1;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsJVMKt;
import org.slf4j.Marker;

/* loaded from: classes10.dex */
public abstract class MarkdownParserKt {
    public static final List escapableCharacters;
    public static final Regex inlineMarkdownRegex;
    public static final List inlineRegexes;
    public static final Regex multiblockMarkdownRegex;

    static {
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"\\[([^\\[\\]]*)\\]\\(([^\\)]*)\\)", "(?:~~\\*\\*|\\*\\*~~)(.*?)(?:~~\\*\\*|\\*\\*~~)", "\\*\\*(.*?)\\*\\*", "~~(.*?)~~"});
        inlineRegexes = listOf;
        ArrayList plus = CollectionsKt.plus((Iterable) CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"^\\s*[-*] [ \\t]*(.*)", "^\\s*(\\d+)\\.[ \\t]+(.*)"}), (Collection) listOf);
        String joinToString$default = CollectionsKt.joinToString$default(listOf, "|", null, null, 0, null, null, 62);
        RegexOption regexOption = RegexOption.MULTILINE;
        inlineMarkdownRegex = new Regex(joinToString$default, regexOption);
        multiblockMarkdownRegex = new Regex(CollectionsKt.joinToString$default(plus, "|", null, null, 0, null, null, 62), regexOption);
        escapableCharacters = CollectionsKt__CollectionsKt.listOf((Object[]) new EscapableCharacter[]{new EscapableCharacter("\\\\", "\ue001", "\\"), new EscapableCharacter("\\*", "\ue002", Marker.ANY_MARKER), new EscapableCharacter("\\~", "\ue003", "~"), new EscapableCharacter("\\[", "\ue004", "["), new EscapableCharacter("\\]", "\ue005", "]")});
    }

    public static final AttributedString parseMarkdownWith(String str, Regex regex) {
        List listOf;
        List<EscapableCharacter> list = escapableCharacters;
        String str2 = str;
        for (EscapableCharacter escapableCharacter : list) {
            str2 = StringsKt__StringsJVMKt.replace$default(str2, escapableCharacter.escaped, escapableCharacter.placeholder);
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        GeneratorSequence$iterator$1 generatorSequence$iterator$1 = new GeneratorSequence$iterator$1(Regex.findAll$default(str2, regex));
        int i = 0;
        while (generatorSequence$iterator$1.hasNext()) {
            MatchResult matchResult = (MatchResult) generatorSequence$iterator$1.next();
            int i2 = matchResult.getRange().first;
            int i3 = matchResult.getRange().last + 1;
            List list2 = CollectionsKt.toList(matchResult.getGroups());
            MatchGroup matchGroup = (MatchGroup) list2.get(1);
            MatchGroup matchGroup2 = (MatchGroup) list2.get(2);
            MatchGroup matchGroup3 = (MatchGroup) list2.get(3);
            MatchGroup matchGroup4 = (MatchGroup) list2.get(4);
            MatchGroup matchGroup5 = (MatchGroup) list2.get(5);
            MatchGroup matchGroup6 = (MatchGroup) CollectionsKt.getOrNull(6, list2);
            MatchGroup matchGroup7 = (MatchGroup) CollectionsKt.getOrNull(7, list2);
            List<EscapableCharacter> list3 = list;
            MatchGroup matchGroup8 = (MatchGroup) CollectionsKt.getOrNull(8, list2);
            sb.append((CharSequence) str2, i, i2);
            int length = sb.length();
            if (matchGroup != null && matchGroup2 != null) {
                sb.append(matchGroup.value);
                String str3 = matchGroup2.value;
                for (EscapableCharacter escapableCharacter2 : list3) {
                    str3 = StringsKt__StringsJVMKt.replace$default(str3, escapableCharacter2.placeholder, escapableCharacter2.literal);
                }
                listOf = CollectionsKt__CollectionsJVMKt.listOf(new Attribute.Link(str3));
            } else if (matchGroup3 != null) {
                sb.append(matchGroup3.value);
                listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Attribute[]{Attribute.Bold.INSTANCE, Attribute.StrikeThrough.INSTANCE});
            } else if (matchGroup4 != null) {
                sb.append(matchGroup4.value);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Attribute.Bold.INSTANCE);
            } else if (matchGroup5 != null) {
                sb.append(matchGroup5.value);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Attribute.StrikeThrough.INSTANCE);
            } else if (matchGroup6 != null) {
                sb.append(matchGroup6.value);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(Attribute.UnorderedListItem.INSTANCE);
            } else {
                if (matchGroup7 == null || matchGroup8 == null) {
                    a$$ExternalSyntheticBUOutline0.m$1((Object) "Unexpected match result!");
                    return null;
                }
                sb.append(matchGroup8.value);
                listOf = CollectionsKt__CollectionsJVMKt.listOf(new Attribute.OrderedListItem(matchGroup7.value));
            }
            int length2 = sb.length();
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                arrayList.add(new AttributeRange(length, length2, (Attribute) it.next()));
            }
            i = i3;
            list = list3;
        }
        List<EscapableCharacter> list4 = list;
        sb.append((CharSequence) str2, i, str2.length());
        String sb2 = sb.toString();
        for (EscapableCharacter escapableCharacter3 : list4) {
            sb2 = StringsKt__StringsJVMKt.replace$default(sb2, escapableCharacter3.placeholder, escapableCharacter3.literal);
        }
        return new AttributedString(sb2, arrayList);
    }
}
