package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import com.yandex.music.shared.playback.api.commands.SeekToFractionCommand;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes3.dex */
public final class e9u implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9u b;

    public /* synthetic */ e9u(i9u i9uVar, int i) {
        this.a = i;
        this.b = i9uVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        x1u x1uVar;
        x1u x1uVar2;
        x1u x1uVar3;
        x1u x1uVar4;
        String str;
        String str2;
        int i = this.a;
        i9u i9uVar = this.b;
        switch (i) {
            case 0:
                n6u n6uVar = (n6u) obj;
                List list = n6uVar.a;
                int i2 = n6uVar.b;
                o3u G = i9uVar.G();
                i9uVar.r = list;
                List list2 = list;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                int i3 = 0;
                for (Object obj2 : list2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        u75.n();
                        throw null;
                    }
                    o3u o3uVar = (o3u) obj2;
                    arrayList.add(new m4u(s7g.p(i3, o3uVar.a), o3uVar.a, o3uVar.c == j1g.a));
                    i3 = i4;
                }
                xdr xdrVar = i9uVar.v;
                c9u c9uVar = new c9u(arrayList);
                xdrVar.getClass();
                xdrVar.m(null, c9uVar);
                xdr xdrVar2 = i9uVar.y;
                Integer num = new Integer(i2);
                xdrVar2.getClass();
                xdrVar2.m(null, num);
                o3u G2 = i9uVar.G();
                if (!Intrinsics.d((G == null || (x1uVar3 = G.a) == null) ? null : x1uVar3.a, (G2 == null || (x1uVar2 = G2.a) == null) ? null : x1uVar2.a)) {
                    xdr xdrVar3 = i9uVar.E;
                    Boolean bool = Boolean.TRUE;
                    xdrVar3.getClass();
                    xdrVar3.m(null, bool);
                    i9uVar.n.getClass();
                    if (!i5l.a()) {
                        i9uVar.J();
                    }
                }
                if (!i9uVar.t) {
                    i9uVar.t = true;
                    o3u G3 = i9uVar.G();
                    if (G3 != null && (x1uVar = G3.a) != null) {
                        fkn fknVar = i9uVar.w;
                        kxi kxiVar = i9uVar.k;
                        boolean booleanValue = ((Boolean) fknVar.a.getValue()).booleanValue();
                        byk bykVar = i9uVar.u;
                        if (booleanValue) {
                            bykVar.b(x1uVar, kxiVar.a.G());
                        } else {
                            bykVar.a(x1uVar, kxiVar.a.G());
                        }
                    }
                }
                return Unit.a;
            case 1:
                xdr xdrVar4 = i9uVar.C;
                int ordinal = ((k6u) obj).ordinal();
                if (ordinal == 0) {
                    Boolean bool2 = Boolean.TRUE;
                    xdrVar4.getClass();
                    xdrVar4.m(null, bool2);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    Boolean bool3 = Boolean.FALSE;
                    xdrVar4.getClass();
                    xdrVar4.m(null, bool3);
                }
                return Unit.a;
            case 2:
                i9uVar.A.l((ExoPlayer) obj);
                return Unit.a;
            case 3:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue2 = bool4.booleanValue();
                xdr xdrVar5 = i9uVar.x;
                xdr xdrVar6 = i9uVar.E;
                xdr xdrVar7 = i9uVar.D;
                i5l i5lVar = i9uVar.n;
                xdrVar5.getClass();
                xdrVar5.m(null, bool4);
                if (booleanValue2) {
                    i5lVar.getClass();
                    if (i5l.a()) {
                        Boolean bool5 = Boolean.FALSE;
                        xdrVar7.getClass();
                        xdrVar7.m(null, bool5);
                        xdrVar6.getClass();
                        xdrVar6.m(null, bool5);
                    } else {
                        i9uVar.J();
                    }
                } else {
                    Boolean bool6 = Boolean.TRUE;
                    xdrVar7.getClass();
                    xdrVar7.m(null, bool6);
                    xdrVar6.getClass();
                    xdrVar6.m(null, bool6);
                    i5lVar.getClass();
                    if (!i5l.a()) {
                        rar rarVar = i9uVar.G;
                        if (rarVar != null) {
                            rarVar.g(null);
                        }
                        i9uVar.G = null;
                    }
                }
                return Unit.a;
            case 4:
                i9uVar.z.l((m6u) obj);
                return Unit.a;
            case 5:
                i9uVar.o.b.a(new SeekToFractionCommand(((Number) obj).floatValue()), new b3t("core_seek"));
                o3u G4 = i9uVar.G();
                if (G4 != null && (x1uVar4 = G4.a) != null) {
                    byk bykVar2 = i9uVar.u;
                    String G5 = i9uVar.k.a.G();
                    bykVar2.getClass();
                    G5.getClass();
                    c01 c01Var = (c01) CollectionsKt.firstOrNull(x1uVar4.h);
                    nmb nmbVar = bykVar2.a;
                    if (c01Var == null || (str = c01Var.a) == null) {
                        str = "";
                    }
                    if (c01Var == null || (str2 = c01Var.b) == null) {
                        str2 = "";
                    }
                    String str3 = (String) CollectionsKt.firstOrNull(x1uVar4.g);
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = x1uVar4.b;
                    String str5 = x1uVar4.a;
                    nmbVar.getClass();
                    str4.getClass();
                    str5.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("artist_id", str);
                    linkedHashMap.put("artist_name", str2);
                    linkedHashMap.put("hash", G5);
                    linkedHashMap.put("page_type", "object");
                    linkedHashMap.put("track_id", str3);
                    linkedHashMap.put("track_name", str4);
                    linkedHashMap.put("tag", "");
                    linkedHashMap.put("entity_type", "videos");
                    dfi.p(1, "clip_id", str5, "_meta", linkedHashMap);
                    nmbVar.C("Video.Scrolled", linkedHashMap);
                }
                return Unit.a;
            case 6:
                if (((x66) obj).a && (i9uVar.v.getValue() instanceof a9u)) {
                    i9uVar.s.invoke();
                }
                return Unit.a;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                xdr xdrVar8 = i9uVar.v;
                if (!booleanValue3 && !(xdrVar8.getValue() instanceof a9u) && !(xdrVar8.getValue() instanceof b9u)) {
                    VideoClipActivity videoClipActivity = i9uVar.l.a;
                    videoClipActivity.finish();
                    videoClipActivity.overridePendingTransition(0, R.anim.slide_out_bottom);
                }
                return Unit.a;
        }
    }
}
