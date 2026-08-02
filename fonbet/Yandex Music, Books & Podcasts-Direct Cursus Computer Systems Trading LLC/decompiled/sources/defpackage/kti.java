package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class kti implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lvf b;

    public /* synthetic */ kti(lvf lvfVar, int i) {
        this.a = i;
        this.b = lvfVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        String str2;
        int identityHashCode;
        String str3;
        String str4;
        int identityHashCode2;
        String str5;
        switch (this.a) {
            case 0:
                ((Boolean) obj).getClass();
                this.b.g();
                return Unit.a;
            case 1:
                ((Boolean) obj).getClass();
                this.b.g();
                return Unit.a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                y7p y7pVar = (y7p) ((m0f) this.b.d.getValue()).get(intValue);
                if (y7pVar == null) {
                    return num;
                }
                if (y7pVar instanceof v7p) {
                    mqs mqsVar = ((v7p) y7pVar).b;
                    str4 = mqsVar.a;
                    identityHashCode2 = System.identityHashCode(mqsVar);
                    str5 = "Track_";
                } else if (y7pVar instanceof l7p) {
                    mqs mqsVar2 = ((l7p) y7pVar).b;
                    str4 = mqsVar2.a;
                    identityHashCode2 = System.identityHashCode(mqsVar2);
                    str5 = "Episode_";
                } else if (y7pVar instanceof t6p) {
                    c01 c01Var = ((t6p) y7pVar).b;
                    str4 = c01Var.a;
                    identityHashCode2 = System.identityHashCode(c01Var);
                    str5 = "Artist_";
                } else if (y7pVar instanceof s6p) {
                    oq oqVar = ((s6p) y7pVar).b;
                    str4 = oqVar.a;
                    identityHashCode2 = System.identityHashCode(oqVar);
                    str5 = "Album_";
                } else if (y7pVar instanceof n7p) {
                    oq oqVar2 = ((n7p) y7pVar).b;
                    str4 = oqVar2.a;
                    identityHashCode2 = System.identityHashCode(oqVar2);
                    str5 = "NonMusic_";
                } else {
                    if (y7pVar instanceof o7p) {
                        cvl cvlVar = ((o7p) y7pVar).b;
                        return "Playlist_" + cvlVar.g() + "_" + System.identityHashCode(cvlVar);
                    }
                    if (y7pVar instanceof w7p) {
                        x1u x1uVar = ((w7p) y7pVar).b;
                        str4 = x1uVar.a;
                        identityHashCode2 = System.identityHashCode(x1uVar);
                        str5 = "VideoClip_";
                    } else {
                        if (!(y7pVar instanceof k7p)) {
                            if (y7pVar instanceof x7p) {
                                u1u u1uVar = ((x7p) y7pVar).b;
                                return "Wave_" + u1uVar.a + "_" + System.identityHashCode(u1uVar);
                            }
                            if (!(y7pVar instanceof m7p)) {
                                if (y7pVar instanceof f7p) {
                                    f7p f7pVar = (f7p) y7pVar;
                                    str2 = f7pVar.d;
                                    identityHashCode = System.identityHashCode(f7pVar.b);
                                    str3 = "BestResult.Track_";
                                } else if (y7pVar instanceof v6p) {
                                    v6p v6pVar = (v6p) y7pVar;
                                    str2 = v6pVar.d;
                                    identityHashCode = System.identityHashCode(v6pVar.b);
                                    str3 = "BestResult.Artist_";
                                } else if (y7pVar instanceof u6p) {
                                    u6p u6pVar = (u6p) y7pVar;
                                    str2 = u6pVar.d;
                                    identityHashCode = System.identityHashCode(u6pVar.b);
                                    str3 = "BestResult.Album_";
                                } else if (y7pVar instanceof b7p) {
                                    b7p b7pVar = (b7p) y7pVar;
                                    str2 = b7pVar.d;
                                    identityHashCode = System.identityHashCode(b7pVar.b);
                                    str3 = "BestResult.Playlist_";
                                } else if (y7pVar instanceof y6p) {
                                    y6p y6pVar = (y6p) y7pVar;
                                    str2 = y6pVar.d;
                                    identityHashCode = System.identityHashCode(y6pVar.b);
                                    str3 = "BestResult.Concert_";
                                } else if (y7pVar instanceof i7p) {
                                    i7p i7pVar = (i7p) y7pVar;
                                    str2 = i7pVar.f;
                                    identityHashCode = System.identityHashCode(i7pVar.a);
                                    str3 = "BestResult.Wave_";
                                } else if (y7pVar instanceof g7p) {
                                    g7p g7pVar = (g7p) y7pVar;
                                    str2 = g7pVar.d;
                                    identityHashCode = System.identityHashCode(g7pVar.b);
                                    str3 = "BestResult.Upcoming_";
                                } else if (y7pVar instanceof e7p) {
                                    e7p e7pVar = (e7p) y7pVar;
                                    str2 = e7pVar.d;
                                    identityHashCode = System.identityHashCode(e7pVar.b);
                                    str3 = "BestResult.RecentRelease_";
                                } else if (y7pVar instanceof c7p) {
                                    c7p c7pVar = (c7p) y7pVar;
                                    str2 = c7pVar.e;
                                    identityHashCode = System.identityHashCode(c7pVar.c);
                                    str3 = "BestResult.Podcast_";
                                } else if (y7pVar instanceof d7p) {
                                    d7p d7pVar = (d7p) y7pVar;
                                    str2 = d7pVar.d;
                                    identityHashCode = System.identityHashCode(d7pVar.b);
                                    str3 = "BestResult.PodcastEpisode_";
                                } else if (y7pVar instanceof x6p) {
                                    x6p x6pVar = (x6p) y7pVar;
                                    str2 = x6pVar.d;
                                    identityHashCode = System.identityHashCode(x6pVar.b);
                                    str3 = "BestResult.BookChapter_";
                                } else if (y7pVar instanceof z6p) {
                                    z6p z6pVar = (z6p) y7pVar;
                                    str2 = z6pVar.d;
                                    identityHashCode = System.identityHashCode(z6pVar.b);
                                    str3 = "BestResult.NonMusic_";
                                } else if (y7pVar instanceof w6p) {
                                    w6p w6pVar = (w6p) y7pVar;
                                    str2 = w6pVar.d;
                                    identityHashCode = System.identityHashCode(w6pVar.b);
                                    str3 = "BestResult.ArtistsRelated_";
                                } else if (y7pVar instanceof h7p) {
                                    h7p h7pVar = (h7p) y7pVar;
                                    str2 = h7pVar.d;
                                    identityHashCode = System.identityHashCode(h7pVar.b);
                                    str3 = "BestResult.VideoClip_";
                                } else if (y7pVar instanceof a7p) {
                                    str = "BestResult.Overview_";
                                } else if ((y7pVar instanceof p7p) || (y7pVar instanceof s7p)) {
                                    str = "QueryToVibeWave_";
                                } else if (y7pVar instanceof r7p) {
                                    str = "Shimmer.Common_";
                                } else if (y7pVar instanceof q7p) {
                                    str = "Shimmer.BestResult_";
                                } else {
                                    if (!(y7pVar instanceof u7p)) {
                                        b6e.s();
                                        return null;
                                    }
                                    str = "Spacer_";
                                }
                                return k5r.l(str3, identityHashCode, str2, "_");
                            }
                            str = "Header_";
                            return k5r.i(intValue, str);
                        }
                        s26 s26Var = ((k7p) y7pVar).b;
                        str4 = s26Var.a.a;
                        identityHashCode2 = System.identityHashCode(s26Var);
                        str5 = "Concert_";
                    }
                }
                return k5r.l(str5, identityHashCode2, str4, "_");
        }
    }
}
