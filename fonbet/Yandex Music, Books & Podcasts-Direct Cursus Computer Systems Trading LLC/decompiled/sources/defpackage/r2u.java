package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class r2u implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ s2u b;

    public /* synthetic */ r2u(s2u s2uVar, int i) {
        this.a = i;
        this.b = s2uVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        switch (this.a) {
            case 0:
                this.b.d.clear();
                break;
            case 1:
                Pair pair = (Pair) obj;
                boolean booleanValue = ((Boolean) pair.a).booleanValue();
                x1u a = s2u.a((y9u) pair.b);
                if (a != null) {
                    String str7 = a.a;
                    String str8 = a.b;
                    List list = a.g;
                    List list2 = a.h;
                    byk bykVar = this.b.c;
                    if (booleanValue) {
                        String t = weo.t();
                        bykVar.getClass();
                        t.getClass();
                        c01 c01Var = (c01) CollectionsKt.firstOrNull(list2);
                        nmb nmbVar = bykVar.a;
                        if (c01Var == null || (str3 = c01Var.a) == null) {
                            str3 = "";
                        }
                        if (c01Var == null || (str4 = c01Var.b) == null) {
                            str4 = "";
                        }
                        String str9 = (String) CollectionsKt.firstOrNull(list);
                        String str10 = str9 == null ? "" : str9;
                        nmbVar.getClass();
                        str8.getClass();
                        str7.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("artist_id", str3);
                        linkedHashMap.put("artist_name", str4);
                        linkedHashMap.put("hash", "");
                        linkedHashMap.put("page_type", "object");
                        linkedHashMap.put("track_id", str10);
                        linkedHashMap.put("track_name", str8);
                        linkedHashMap.put("tag", "");
                        linkedHashMap.put("page_id", "videoclips_screen");
                        linkedHashMap.put("playback_action_id", t);
                        linkedHashMap.put("entity_type", "videos");
                        linkedHashMap.put("entity_id", "videos");
                        linkedHashMap.put("object_type", "video");
                        dfi.p(2, "clip_id", str7, "_meta", linkedHashMap);
                        nmbVar.C("Video.Started", linkedHashMap);
                    } else {
                        bykVar.getClass();
                        c01 c01Var2 = (c01) CollectionsKt.firstOrNull(list2);
                        nmb nmbVar2 = bykVar.a;
                        if (c01Var2 == null || (str = c01Var2.a) == null) {
                            str = "";
                        }
                        if (c01Var2 == null || (str2 = c01Var2.b) == null) {
                            str2 = "";
                        }
                        String str11 = (String) CollectionsKt.firstOrNull(list);
                        String str12 = str11 == null ? "" : str11;
                        nmbVar2.getClass();
                        str8.getClass();
                        str7.getClass();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("artist_id", str);
                        linkedHashMap2.put("artist_name", str2);
                        linkedHashMap2.put("hash", "");
                        linkedHashMap2.put("page_type", "object");
                        linkedHashMap2.put("track_id", str12);
                        linkedHashMap2.put("track_name", str8);
                        linkedHashMap2.put("tag", "");
                        linkedHashMap2.put("entity_type", "videos");
                        dfi.p(1, "clip_id", str7, "_meta", linkedHashMap2);
                        nmbVar2.C("Video.Paused", linkedHashMap2);
                    }
                }
                break;
            default:
                List list3 = (List) obj;
                s2u s2uVar = this.b;
                LinkedHashSet linkedHashSet = s2uVar.d;
                List<x1u> e0 = CollectionsKt.e0(list3, linkedHashSet);
                linkedHashSet.addAll(list3);
                for (x1u x1uVar : e0) {
                    byk bykVar2 = s2uVar.c;
                    bykVar2.getClass();
                    x1uVar.getClass();
                    c01 c01Var3 = (c01) CollectionsKt.firstOrNull(x1uVar.h);
                    nmb nmbVar3 = bykVar2.a;
                    if (c01Var3 == null || (str5 = c01Var3.a) == null) {
                        str5 = "";
                    }
                    if (c01Var3 == null || (str6 = c01Var3.b) == null) {
                        str6 = "";
                    }
                    String str13 = (String) CollectionsKt.firstOrNull(x1uVar.g);
                    if (str13 == null) {
                        str13 = "";
                    }
                    String str14 = x1uVar.b;
                    String str15 = x1uVar.a;
                    nmbVar3.getClass();
                    str14.getClass();
                    str15.getClass();
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    linkedHashMap3.put("artist_id", str5);
                    linkedHashMap3.put("artist_name", str6);
                    linkedHashMap3.put("hash", "");
                    linkedHashMap3.put("page_type", "object");
                    linkedHashMap3.put("track_id", str13);
                    linkedHashMap3.put("track_name", str14);
                    linkedHashMap3.put("tag", "");
                    linkedHashMap3.put("clip_id", str15);
                    dfi.p(1, "entity_type", "videos", "_meta", linkedHashMap3);
                    nmbVar3.C("Video.Loaded", linkedHashMap3);
                }
                break;
        }
        return Unit.a;
    }
}
