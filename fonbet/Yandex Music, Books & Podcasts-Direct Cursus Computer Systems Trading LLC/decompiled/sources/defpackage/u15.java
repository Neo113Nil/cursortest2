package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class u15 extends ou2 {
    public static final Pattern j;
    private static final long serialVersionUID = 1;
    public final jyr g;
    public final euo h = euo.E;
    public final jyr i;

    static {
        String sb;
        rdb rdbVar = s15.d;
        ArrayList arrayList = new ArrayList(v75.o(rdbVar, 10));
        c7 c7Var = new c7(0, rdbVar);
        while (c7Var.hasNext()) {
            arrayList.add(((s15) c7Var.next()).a);
        }
        if (arrayList.isEmpty()) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str != null && str.length() != 0) {
                    if (sb2.length() > 0) {
                        sb2.append("|");
                    }
                    sb2.append(str);
                }
            }
            sb = sb2.toString();
        }
        Pattern compile = Pattern.compile("yandexmusic://mymusic/(" + sb + ")/?");
        compile.getClass();
        j = compile;
    }

    public u15() {
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: r15
            public final /* synthetic */ u15 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                wjb wjbVar;
                switch (i) {
                    case 0:
                        String a = this.b.a(1);
                        s15.b.getClass();
                        Iterator it = s15.d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((s15) obj).a.equals(a)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        s15 s15Var = (s15) obj;
                        if (s15Var == null) {
                            v3w.l("unknown argument ", a, 5, null, null);
                        }
                        return s15Var;
                    default:
                        s15 s15Var2 = (s15) this.b.g.getValue();
                        switch (s15Var2 == null ? -1 : t15.a[s15Var2.ordinal()]) {
                            case -1:
                                wjbVar = wjb.PageNotFoundScreen;
                                break;
                            case 0:
                            default:
                                b6e.s();
                                return null;
                            case 1:
                                wjbVar = wjb.CollectionLandingScreen;
                                break;
                            case 2:
                            case 3:
                                wjbVar = wjb.CollectionPlaylistsScreen;
                                break;
                            case 4:
                                wjbVar = wjb.CollectionAlbumsScreen;
                                break;
                            case 5:
                                wjbVar = wjb.CollectionVideoclipsScreen;
                                break;
                            case 6:
                                wjbVar = wjb.CollectionArtistsScreen;
                                break;
                            case 7:
                                wjbVar = wjb.CollectionPodcastScreen;
                                break;
                            case 8:
                                wjbVar = wjb.CollectionAudiobooksScreen;
                                break;
                            case 9:
                                wjbVar = wjb.CollectionKidsScreen;
                                break;
                            case 10:
                            case 11:
                                wjbVar = wjb.DownloadedContentScreen;
                                break;
                            case 12:
                                wjbVar = wjb.PlaylistScreen;
                                break;
                        }
                        return new aqt(wjbVar);
                }
            }
        });
        final int i2 = 1;
        this.i = btf.b(new Function0(this) { // from class: r15
            public final /* synthetic */ u15 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                wjb wjbVar;
                switch (i2) {
                    case 0:
                        String a = this.b.a(1);
                        s15.b.getClass();
                        Iterator it = s15.d.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((s15) obj).a.equals(a)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                        s15 s15Var = (s15) obj;
                        if (s15Var == null) {
                            v3w.l("unknown argument ", a, 5, null, null);
                        }
                        return s15Var;
                    default:
                        s15 s15Var2 = (s15) this.b.g.getValue();
                        switch (s15Var2 == null ? -1 : t15.a[s15Var2.ordinal()]) {
                            case -1:
                                wjbVar = wjb.PageNotFoundScreen;
                                break;
                            case 0:
                            default:
                                b6e.s();
                                return null;
                            case 1:
                                wjbVar = wjb.CollectionLandingScreen;
                                break;
                            case 2:
                            case 3:
                                wjbVar = wjb.CollectionPlaylistsScreen;
                                break;
                            case 4:
                                wjbVar = wjb.CollectionAlbumsScreen;
                                break;
                            case 5:
                                wjbVar = wjb.CollectionVideoclipsScreen;
                                break;
                            case 6:
                                wjbVar = wjb.CollectionArtistsScreen;
                                break;
                            case 7:
                                wjbVar = wjb.CollectionPodcastScreen;
                                break;
                            case 8:
                                wjbVar = wjb.CollectionAudiobooksScreen;
                                break;
                            case 9:
                                wjbVar = wjb.CollectionKidsScreen;
                                break;
                            case 10:
                            case 11:
                                wjbVar = wjb.DownloadedContentScreen;
                                break;
                            case 12:
                                wjbVar = wjb.PlaylistScreen;
                                break;
                        }
                        return new aqt(wjbVar);
                }
            }
        });
    }

    @Override // defpackage.ypt
    public final cqt T() {
        return (cqt) this.i.getValue();
    }

    @Override // defpackage.ypt
    public final euo getType() {
        return this.h;
    }
}
