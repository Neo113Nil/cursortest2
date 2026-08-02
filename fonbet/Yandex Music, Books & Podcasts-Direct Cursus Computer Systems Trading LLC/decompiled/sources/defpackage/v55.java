package defpackage;

import defpackage.hmm;

/* loaded from: classes5.dex */
public final class v55 {
    public static final hmm.a c = new hmm.a("albums_sort_type");
    public static final hmm.a d = new hmm.a("audio_books_sort_type");
    public static final hmm.a e = new hmm.a("podcast_sort_type");
    public static final hmm.a f = new hmm.a("episode_sort_type");
    public static final hmm.a g = new hmm.a("chapter_sort_type");
    public static final hmm.a h = new hmm.a("own_playlist_sort_type");
    public static final hmm.a i = new hmm.a("liked_playlist_sort_type");
    public static final hmm.a j = new hmm.a("kids_track_sort_type");
    public static final hmm.a k = new hmm.a("kids_playlist_sort_type");
    public static final hmm.a l = new hmm.a("kids_album_sort_type");
    public static final hmm.a m = new hmm.a("downloaded_track_sort_type");
    public static final hmm.a n = new hmm.a("downloaded_own_playlist_sort_type");
    public static final hmm.a o = new hmm.a("downloaded)liked_playlist_sort_type");
    public static final hmm.a p = new hmm.a("downloaded_album_sort_type");
    public static final hmm.a q = new hmm.a("downloaded_audio_book_sort_type");
    public static final hmm.a r = new hmm.a("downloaded_chapter_sort_type");
    public static final hmm.a s = new hmm.a("downloaded_episode_sort_type");
    public static final hmm.a t = new hmm.a("downloaded_podcast_sort_type");
    public static final hmm.a u = new hmm.a("downloaded_artist_sort_type");
    public static final hmm.a v = new hmm.a("downloaded_kids_album_sort_type");
    public static final hmm.a w = new hmm.a("downloaded_kids_playlist_sort_type");
    public static final hmm.a x = new hmm.a("downloaded_kids_track_sort_type");
    public static final hmm.a y = new hmm.a("artist_sort_type");
    public final jyr a;
    public final jyr b;

    public v55() {
        bdt I = hag.I(cc7.class);
        l18 l18Var = l18.b;
        this.a = l18Var.b(I, true);
        this.b = l18Var.b(hag.I(frt.class), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(cg6 cg6Var) {
        b45 b45Var;
        int i2;
        hmm hmmVar;
        i10 valueOf;
        if (cg6Var instanceof b45) {
            b45Var = (b45) cg6Var;
            int i3 = b45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = b45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = b45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    b45Var.l = 1;
                    obj = zsd.i0(i4, b45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return i10.d;
                }
                String str = (String) hmmVar.a(c);
                return (str == null || (valueOf = i10.valueOf(str)) == null) ? i10.d : valueOf;
            }
        }
        b45Var = new b45(this, cg6Var);
        Object obj2 = b45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = b45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(cg6 cg6Var) {
        c45 c45Var;
        int i2;
        hmm hmmVar;
        dk1 valueOf;
        if (cg6Var instanceof c45) {
            c45Var = (c45) cg6Var;
            int i3 = c45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = c45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = c45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    c45Var.l = 1;
                    obj = zsd.i0(i4, c45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return dk1.a;
                }
                String str = (String) hmmVar.a(y);
                return (str == null || (valueOf = dk1.valueOf(str)) == null) ? dk1.a : valueOf;
            }
        }
        c45Var = new c45(this, cg6Var);
        Object obj2 = c45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = c45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum c(cg6 cg6Var) {
        d45 d45Var;
        int i2;
        hmm hmmVar;
        wv1 valueOf;
        if (cg6Var instanceof d45) {
            d45Var = (d45) cg6Var;
            int i3 = d45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = d45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = d45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    d45Var.l = 1;
                    obj = zsd.i0(i4, d45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return wv1.a;
                }
                String str = (String) hmmVar.a(d);
                return (str == null || (valueOf = wv1.valueOf(str)) == null) ? wv1.a : valueOf;
            }
        }
        d45Var = new d45(this, cg6Var);
        Object obj2 = d45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = d45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum d(cg6 cg6Var) {
        e45 e45Var;
        int i2;
        hmm hmmVar;
        nd4 valueOf;
        if (cg6Var instanceof e45) {
            e45Var = (e45) cg6Var;
            int i3 = e45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                e45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = e45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = e45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    e45Var.l = 1;
                    obj = zsd.i0(i4, e45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return nd4.a;
                }
                String str = (String) hmmVar.a(g);
                return (str == null || (valueOf = nd4.valueOf(str)) == null) ? nd4.a : valueOf;
            }
        }
        e45Var = new e45(this, cg6Var);
        Object obj2 = e45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = e45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum e(cg6 cg6Var) {
        f45 f45Var;
        int i2;
        hmm hmmVar;
        xca valueOf;
        if (cg6Var instanceof f45) {
            f45Var = (f45) cg6Var;
            int i3 = f45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = f45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = f45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    f45Var.l = 1;
                    obj = zsd.i0(i4, f45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return xca.a;
                }
                String str = (String) hmmVar.a(p);
                return (str == null || (valueOf = xca.valueOf(str)) == null) ? xca.a : valueOf;
            }
        }
        f45Var = new f45(this, cg6Var);
        Object obj2 = f45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = f45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum f(cg6 cg6Var) {
        g45 g45Var;
        int i2;
        hmm hmmVar;
        qda valueOf;
        if (cg6Var instanceof g45) {
            g45Var = (g45) cg6Var;
            int i3 = g45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                g45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = g45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = g45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    g45Var.l = 1;
                    obj = zsd.i0(i4, g45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return qda.a;
                }
                String str = (String) hmmVar.a(u);
                return (str == null || (valueOf = qda.valueOf(str)) == null) ? qda.a : valueOf;
            }
        }
        g45Var = new g45(this, cg6Var);
        Object obj2 = g45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = g45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum g(cg6 cg6Var) {
        h45 h45Var;
        int i2;
        hmm hmmVar;
        fea valueOf;
        if (cg6Var instanceof h45) {
            h45Var = (h45) cg6Var;
            int i3 = h45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = h45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = h45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    h45Var.l = 1;
                    obj = zsd.i0(i4, h45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return fea.a;
                }
                String str = (String) hmmVar.a(q);
                return (str == null || (valueOf = fea.valueOf(str)) == null) ? fea.a : valueOf;
            }
        }
        h45Var = new h45(this, cg6Var);
        Object obj2 = h45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = h45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum h(cg6 cg6Var) {
        i45 i45Var;
        int i2;
        hmm hmmVar;
        zea valueOf;
        if (cg6Var instanceof i45) {
            i45Var = (i45) cg6Var;
            int i3 = i45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                i45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = i45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = i45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    i45Var.l = 1;
                    obj = zsd.i0(i4, i45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return zea.a;
                }
                String str = (String) hmmVar.a(r);
                return (str == null || (valueOf = zea.valueOf(str)) == null) ? zea.a : valueOf;
            }
        }
        i45Var = new i45(this, cg6Var);
        Object obj2 = i45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = i45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum i(cg6 cg6Var) {
        j45 j45Var;
        int i2;
        hmm hmmVar;
        bfa valueOf;
        if (cg6Var instanceof j45) {
            j45Var = (j45) cg6Var;
            int i3 = j45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = j45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = j45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    j45Var.l = 1;
                    obj = zsd.i0(i4, j45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return bfa.a;
                }
                String str = (String) hmmVar.a(s);
                return (str == null || (valueOf = bfa.valueOf(str)) == null) ? bfa.a : valueOf;
            }
        }
        j45Var = new j45(this, cg6Var);
        Object obj2 = j45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = j45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum j(cg6 cg6Var) {
        k45 k45Var;
        int i2;
        hmm hmmVar;
        cfa valueOf;
        if (cg6Var instanceof k45) {
            k45Var = (k45) cg6Var;
            int i3 = k45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = k45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = k45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    k45Var.l = 1;
                    obj = zsd.i0(i4, k45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return cfa.a;
                }
                String str = (String) hmmVar.a(v);
                return (str == null || (valueOf = cfa.valueOf(str)) == null) ? cfa.a : valueOf;
            }
        }
        k45Var = new k45(this, cg6Var);
        Object obj2 = k45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = k45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum k(cg6 cg6Var) {
        l45 l45Var;
        int i2;
        hmm hmmVar;
        dfa valueOf;
        if (cg6Var instanceof l45) {
            l45Var = (l45) cg6Var;
            int i3 = l45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = l45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = l45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    l45Var.l = 1;
                    obj = zsd.i0(i4, l45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return dfa.a;
                }
                String str = (String) hmmVar.a(w);
                return (str == null || (valueOf = dfa.valueOf(str)) == null) ? dfa.a : valueOf;
            }
        }
        l45Var = new l45(this, cg6Var);
        Object obj2 = l45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = l45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum l(cg6 cg6Var) {
        m45 m45Var;
        int i2;
        hmm hmmVar;
        yfa valueOf;
        if (cg6Var instanceof m45) {
            m45Var = (m45) cg6Var;
            int i3 = m45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = m45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = m45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    m45Var.l = 1;
                    obj = zsd.i0(i4, m45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return yfa.a;
                }
                String str = (String) hmmVar.a(x);
                return (str == null || (valueOf = yfa.valueOf(str)) == null) ? yfa.a : valueOf;
            }
        }
        m45Var = new m45(this, cg6Var);
        Object obj2 = m45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = m45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum m(cg6 cg6Var) {
        n45 n45Var;
        int i2;
        hmm hmmVar;
        tga valueOf;
        if (cg6Var instanceof n45) {
            n45Var = (n45) cg6Var;
            int i3 = n45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                n45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = n45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = n45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    n45Var.l = 1;
                    obj = zsd.i0(i4, n45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return tga.d;
                }
                String str = (String) hmmVar.a(o);
                return (str == null || (valueOf = tga.valueOf(str)) == null) ? tga.d : valueOf;
            }
        }
        n45Var = new n45(this, cg6Var);
        Object obj2 = n45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = n45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum n(cg6 cg6Var) {
        o45 o45Var;
        int i2;
        hmm hmmVar;
        tga valueOf;
        if (cg6Var instanceof o45) {
            o45Var = (o45) cg6Var;
            int i3 = o45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = o45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = o45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    o45Var.l = 1;
                    obj = zsd.i0(i4, o45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return tga.d;
                }
                String str = (String) hmmVar.a(n);
                return (str == null || (valueOf = tga.valueOf(str)) == null) ? tga.d : valueOf;
            }
        }
        o45Var = new o45(this, cg6Var);
        Object obj2 = o45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = o45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum o(cg6 cg6Var) {
        p45 p45Var;
        int i2;
        hmm hmmVar;
        lha valueOf;
        if (cg6Var instanceof p45) {
            p45Var = (p45) cg6Var;
            int i3 = p45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = p45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = p45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    p45Var.l = 1;
                    obj = zsd.i0(i4, p45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return lha.a;
                }
                String str = (String) hmmVar.a(t);
                return (str == null || (valueOf = lha.valueOf(str)) == null) ? lha.a : valueOf;
            }
        }
        p45Var = new p45(this, cg6Var);
        Object obj2 = p45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = p45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum p(cg6 cg6Var) {
        q45 q45Var;
        int i2;
        hmm hmmVar;
        kja valueOf;
        if (cg6Var instanceof q45) {
            q45Var = (q45) cg6Var;
            int i3 = q45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = q45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = q45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    q45Var.l = 1;
                    obj = zsd.i0(i4, q45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return kja.a;
                }
                String str = (String) hmmVar.a(m);
                return (str == null || (valueOf = kja.valueOf(str)) == null) ? kja.a : valueOf;
            }
        }
        q45Var = new q45(this, cg6Var);
        Object obj2 = q45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = q45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum q(cg6 cg6Var) {
        r45 r45Var;
        int i2;
        hmm hmmVar;
        aeb valueOf;
        if (cg6Var instanceof r45) {
            r45Var = (r45) cg6Var;
            int i3 = r45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = r45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = r45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    r45Var.l = 1;
                    obj = zsd.i0(i4, r45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return aeb.a;
                }
                String str = (String) hmmVar.a(f);
                return (str == null || (valueOf = aeb.valueOf(str)) == null) ? aeb.a : valueOf;
            }
        }
        r45Var = new r45(this, cg6Var);
        Object obj2 = r45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = r45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    public final wb7 r() {
        return ((dc7) ((cc7) this.a.getValue())).c(((frt) this.b.getValue()).c().a, "artist_flags");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum s(cg6 cg6Var) {
        s45 s45Var;
        int i2;
        hmm hmmVar;
        jdf valueOf;
        if (cg6Var instanceof s45) {
            s45Var = (s45) cg6Var;
            int i3 = s45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = s45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = s45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    s45Var.l = 1;
                    obj = zsd.i0(i4, s45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return jdf.a;
                }
                String str = (String) hmmVar.a(l);
                return (str == null || (valueOf = jdf.valueOf(str)) == null) ? jdf.a : valueOf;
            }
        }
        s45Var = new s45(this, cg6Var);
        Object obj2 = s45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = s45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum t(cg6 cg6Var) {
        t45 t45Var;
        int i2;
        hmm hmmVar;
        nef valueOf;
        if (cg6Var instanceof t45) {
            t45Var = (t45) cg6Var;
            int i3 = t45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = t45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = t45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    t45Var.l = 1;
                    obj = zsd.i0(i4, t45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return nef.a;
                }
                String str = (String) hmmVar.a(k);
                return (str == null || (valueOf = nef.valueOf(str)) == null) ? nef.a : valueOf;
            }
        }
        t45Var = new t45(this, cg6Var);
        Object obj2 = t45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = t45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum u(cg6 cg6Var) {
        u45 u45Var;
        int i2;
        hmm hmmVar;
        ogf valueOf;
        if (cg6Var instanceof u45) {
            u45Var = (u45) cg6Var;
            int i3 = u45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = u45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = u45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    u45Var.l = 1;
                    obj = zsd.i0(i4, u45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return ogf.a;
                }
                String str = (String) hmmVar.a(j);
                return (str == null || (valueOf = ogf.valueOf(str)) == null) ? ogf.a : valueOf;
            }
        }
        u45Var = new u45(this, cg6Var);
        Object obj2 = u45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = u45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum v(cg6 cg6Var) {
        v45 v45Var;
        int i2;
        hmm hmmVar;
        s0m valueOf;
        if (cg6Var instanceof v45) {
            v45Var = (v45) cg6Var;
            int i3 = v45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = v45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = v45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    v45Var.l = 1;
                    obj = zsd.i0(i4, v45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return s0m.e;
                }
                String str = (String) hmmVar.a(i);
                return (str == null || (valueOf = s0m.valueOf(str)) == null) ? s0m.e : valueOf;
            }
        }
        v45Var = new v45(this, cg6Var);
        Object obj2 = v45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = v45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum w(cg6 cg6Var) {
        w45 w45Var;
        int i2;
        hmm hmmVar;
        s0m valueOf;
        if (cg6Var instanceof w45) {
            w45Var = (w45) cg6Var;
            int i3 = w45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = w45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = w45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    w45Var.l = 1;
                    obj = zsd.i0(i4, w45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return s0m.a;
                }
                String str = (String) hmmVar.a(h);
                return (str == null || (valueOf = s0m.valueOf(str)) == null) ? s0m.a : valueOf;
            }
        }
        w45Var = new w45(this, cg6Var);
        Object obj2 = w45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = w45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum x(cg6 cg6Var) {
        x45 x45Var;
        int i2;
        hmm hmmVar;
        kcm valueOf;
        if (cg6Var instanceof x45) {
            x45Var = (x45) cg6Var;
            int i3 = x45Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                x45Var.l = i3 - Integer.MIN_VALUE;
                Object obj = x45Var.j;
                nm6 nm6Var = nm6.a;
                i2 = x45Var.l;
                if (i2 != 0) {
                    pjc i4 = su4.i(obj, this);
                    x45Var.l = 1;
                    obj = zsd.i0(i4, x45Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                hmmVar = (hmm) obj;
                if (hmmVar != null) {
                    return kcm.a;
                }
                String str = (String) hmmVar.a(e);
                return (str == null || (valueOf = kcm.valueOf(str)) == null) ? kcm.a : valueOf;
            }
        }
        x45Var = new x45(this, cg6Var);
        Object obj2 = x45Var.j;
        nm6 nm6Var2 = nm6.a;
        i2 = x45Var.l;
        if (i2 != 0) {
        }
        hmmVar = (hmm) obj2;
        if (hmmVar != null) {
        }
    }
}
